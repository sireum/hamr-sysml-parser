::/*#! 2> /dev/null                                 #
@ 2>/dev/null # 2>nul & echo off & goto BOF         #
if [ -z ${SIREUM_HOME} ]; then                      #
  echo "Please set SIREUM_HOME env var"             #
  exit -1                                           #
fi                                                  #
exec ${SIREUM_HOME}/bin/sireum slang run "$0" "$@"  #
:BOF
setlocal
if not defined SIREUM_HOME (
  echo Please set SIREUM_HOME env var
  exit /B -1
)
%SIREUM_HOME%\bin\sireum.bat slang run "%0" %*
exit /B %errorlevel%
::!#*/
// #Sireum

import org.sireum._

val home: Os.Path = Os.slashDir.up.canon
val sireum: Os.Path = Os.path(Os.env("SIREUM_HOME").get) / "bin" / (if (Os.isWin) "sireum.bat" else "sireum")
val versions = home / "versions.properties"

val sysmlVersion: String = "2024-05"
val gumboVersion: String = "4.20240722.03f0261"

val antlr4Version: String =
  if (versions.exists) versions.properties.get("org.antlr%antlr4-runtime%").get
  else Sireum.versions.get("org.antlr:antlr4-runtime:").get

assert(ops.StringOps(proc"$sireum hamr sysml translator --help".runCheck().out).contains(sysmlVersion), s"Translator isn't using version $sysmlVersion")

val parserDir: Os.Path = home / "src" / "org" / "sireum" / "hamr" / "sysml" / "parser"
parserDir.removeAll()

def fetch(outDir: Os.Path, outFileName: String,version: String, url: String): Os.Path = {
  val fName = outDir / outFileName
  val results = Sireum.procCheck(Os.proc(ISZ(sireum.string, "hamr", "sysml", "translator", "--version", version, "--url", url, s"${fName}")).echo.console,
    message.Reporter.create)
  if (!results.ok) {
    halt(s"Failed to fetch: $url")
  }
  return fName
}

def regenAntrl(grammarFile: Os.Path, outDir: Os.Path): Unit = {
  val deps = Coursier.fetch(Sireum.scalaVer, ISZ(s"org.antlr:antlr4:$antlr4Version"))
  val classpath: ISZ[String] = for (dep <- deps) yield dep.path.string
  val java = Os.path(Sireum.javaHomePathString) / "bin" / (if (Os.isWin) "java.exe" else "java")
  Os.proc(ISZ(java.string, "-cp", st"${(classpath, Os.pathSep)}".render, "org.antlr.v4.Tool", "-o",
    outDir.string, "-Xexact-output-dir", "-package", "org.sireum.hamr.sysml.parser", (grammarFile).string)).console.runCheck()
  println(s"Generated lexer/parser for $grammarFile")
}

val sysmlLg: Os.Path = fetch(parserDir, "SysMLv2.g4", sysmlVersion, "https://raw.githubusercontent.com/Systems-Modeling/SysML-v2-Pilot-Implementation/%version/org.omg.sysml.xtext/src-gen/org/omg/sysml/xtext/parser/antlr/internal/InternalSysML.g")
val kermlg = fetch(parserDir, "KerMLv2.g4", sysmlVersion, "https://raw.githubusercontent.com/Systems-Modeling/SysML-v2-Pilot-Implementation/%version/org.omg.kerml.xtext/src-gen/org/omg/kerml/xtext/parser/antlr/internal/InternalKerML.g")
val gumbog = fetch(parserDir, "GUMBO.g4", gumboVersion, "https://raw.githubusercontent.com/sireum/aadl-gumbo/sysmlv2/org.sireum.aadl.gumbo/src-gen/org/sireum/aadl/gumbo/parser/antlr/internal/InternalGumbo.g")

val so = ops.StringOps(sysmlLg.read)

val grammar: String = "grammar SysMLv2;"
val grammarPos = so.stringIndexOf(grammar)
val ver: String = "ruleRequirementVerificationKind: 'verify';"
val dep: String = "K_DEPENDENCY: 'dependency';"
val verPos = so.stringIndexOf(ver) + ver.size + 1
val depPos = so.stringIndexOfFrom(dep, verPos)

if (depPos - verPos != 1) {
  halt(s"Expecting rule '$ver' to be immediately followed by $dep")
}

val textRep: String =    "ruleTextualRepresentation: ('rep' ruleIdentification?)? 'language' RULE_STRING_VALUE RULE_REGULAR_COMMENT;"
val textRepSub: String = "ruleTextualRepresentation: ('rep' ruleIdentification?)? 'language' (('\"GUMBO\"' '/*{' (('library' ruleGumboLibrary) | ruleGumboSubclause) '}*/' ) | (RULE_STRING_VALUE RULE_REGULAR_COMMENT));"
val textRepPos = so.stringIndexOf(textRep)

val regComment: String =    "RULE_REGULAR_COMMENT: '/*' .*? '*/';"
val regCommentSub: String = "RULE_REGULAR_COMMENT: '/*' ~'{' .*? '*/';"
val regCommentPos = so.stringIndexOf(regComment)

val go = ops.StringOps(gumbog.read)

val glib: String = "ruleAnnexLibrary: ruleGumboLibrary;"
val gstmt: String = "ruleSlangStmt:"
val glibPos = go.stringIndexOf(glib)
val gstmtPos = go.stringIndexOf(gstmt)

val gumbo: ST = st"""/****************************************
                    | * BEGIN GUMBO
                    | ***************************************/
                    |${go.substring(glibPos, gstmtPos - 1)}
                    |/****************************************
                    | * END GUMBO
                    | ***************************************/
                    |"""

val sysmlGumbog: String = "SysMLv2_GUMBO"

val modSysml: ST =
  st"""${so.substring(0, grammarPos - 1)}
      |${go.substring(0, go.indexOf('\n'))}
      |grammar $sysmlGumbog;
      |${so.substring(grammarPos + grammar.size + 1, textRepPos - 1)}
      |// Original Version
      |// $textRep
      |// GUMBO Version
      |$textRepSub
      |${so.substring(textRepPos + textRep.size + 1, depPos)}
      |${gumbo}
      |${so.substring(depPos, regCommentPos - 1)}
      |// Original Version
      |// $regComment
      |// GUMBO Version
      |$regCommentSub
      |${so.substring(regCommentPos + regComment.size + 1, so.size)}"""

val sysmlGumbogFile = parserDir / s"${sysmlGumbog}.g4"
sysmlGumbogFile.writeOver(modSysml.render)
println(s"Wrote: $sysmlGumbogFile")

regenAntrl(sysmlGumbogFile, parserDir)
regenAntrl(kermlg, parserDir)
