// Auto-generated from https://raw.githubusercontent.com/sireum/aadl-gumbo/4.20240722.03f0261/org.sireum.aadl.gumbo/src-gen/org/sireum/aadl/gumbo/parser/antlr/internal/InternalGumbo.g
grammar GUMBO;

entryRuleAnnexLibrary: ruleAnnexLibrary EOF;

ruleAnnexLibrary: ruleGumboLibrary;

ruleGumboLibrary:  ruleFunctions?;

ruleGumboSubclause:  ruleSpecSection;

ruleSpecSection:  ruleState? ruleFunctions? ruleInvariants? ruleIntegration? ruleInitialize? ruleCompute?;

ruleState: 'state' ruleStateVarDecl+;

ruleStateVarDecl: RULE_ID ':' ruleQualifiedName ';';

ruleInvariants: 'invariants' ruleInvSpec+;

ruleInvSpec: 'inv' RULE_ID RULE_STRING_VALUE? ':' ruleOwnedExpression ';';

ruleIntegration: 'integration' ruleSpecStatement+;

ruleInitialize:  'initialize' (ruleSlangModifies ';')? ruleInitializeSpecStatement* ruleInfoFlowClause*;

ruleInitializeSpecStatement: ruleGuaranteeStatement;

ruleCompute:  'compute' (ruleSlangModifies ';')? ruleSpecStatement* ('compute_cases' ruleCaseStatementClause+)* ruleHandlerClause* ruleInfoFlowClause*;

ruleInfoFlowClause: 'infoflow' RULE_ID RULE_STRING_VALUE? ':' 'from' '(' (RULE_ID (',' RULE_ID)*)? ')' ',' 'to' '(' (RULE_ID (',' RULE_ID)*)? ')' ';';

ruleHandlerClause: 'handle' RULE_ID ':' (ruleSlangModifies ';')? ruleGuaranteeStatement+;

ruleCaseStatementClause: 'case' RULE_ID RULE_STRING_VALUE? ':' ruleAnonAssumeStatement ruleAnonGuaranteeStatement;

ruleSpecStatement:
  ruleAssumeStatement #ruleSpecStatement1
  | ruleGuaranteeStatement #ruleSpecStatement2;

ruleAssumeStatement: 'assume' RULE_ID RULE_STRING_VALUE? ':' ruleOwnedExpression ';';

ruleAnonAssumeStatement: 'assume' ruleOwnedExpression ';';

ruleGuaranteeStatement: 'guarantee' RULE_ID RULE_STRING_VALUE? ':' ruleOwnedExpression ';';

ruleAnonGuaranteeStatement: 'guarantee' ruleOwnedExpression ';';

ruleDataElement: ruleQualifiedName;

ruleFunctions: 'functions' ruleFuncSpec+;

ruleFuncSpec: ruleSlangDefDef ';';

ruleSlangDefDecl: 'def' ruleSlangDefMods? ruleSlangDefExt? ruleSlangDefID ruleSlangTypeParams? ruleSlangDefParams? ':' ruleSlangType ruleSlangDefContract?;

ruleSlangDefDef: 'def' ruleSlangDefExt? ruleSlangDefID ruleSlangTypeParams? ruleSlangDefParams ':' ruleSlangType ':=' ruleSlangDefContract ruleOwnedExpression;

ruleSlangDefMods:
  '@strictpure' #ruleSlangDefMods1
  | '@pure' #ruleSlangDefMods2;

ruleSlangDefExt: '(' RULE_ID ':' ruleSlangType ')';

ruleSlangDefID: RULE_ID;

ruleSlangDefParams: '(' (ruleSlangDefParam (',' ruleSlangDefParam)*)? ')';

ruleSlangDefParam: RULE_ID ':' '=>'? ruleSlangType '*'?;

ruleSlangTypeParams: '[' ruleSlangTypeParam (',' ruleSlangTypeParam)* ']';

ruleSlangTypeParam: 'mut'? RULE_ID;

ruleSlangDefContract:  (ruleSlangReads ';')? (ruleSlangRequires ';')? (ruleSlangModifies ';')? (ruleSlangEnsures ';')?;

ruleSlangSupr: ruleSlangName ruleSlangTypeArgs?;

ruleSlangName: RULE_ID ('.' RULE_ID)*;

ruleSlangInvariant: 'invariant' ruleOwnedExpression (',' ruleOwnedExpression)*;

ruleSlangRequires: 'assume' ruleOwnedExpression (',' ruleOwnedExpression)*;

ruleSlangReads: 'reads' ruleOwnedExpression (',' ruleOwnedExpression)*;

ruleSlangModifies: 'modifies' ruleOwnedExpression (',' ruleOwnedExpression)*;

ruleSlangEnsures: 'guarantee' ruleOwnedExpression (',' ruleOwnedExpression)*;

ruleSlangType: ruleSlangBaseType;

ruleSlangBaseType: ruleQualifiedName;

ruleSlangTypeArgs: '[' ruleSlangType (',' ruleSlangType)* ']';

ruleSlangStmt:
   ruleSlangVarDef #ruleSlangStmt1
  |  'if' ruleOwnedExpression ruleSlangBlock ruleSlangElse? #ruleSlangStmt2
  |  'while' ruleOwnedExpression ruleSlangLoopContract ruleSlangBlock #ruleSlangStmt3
  |  'match' ruleOwnedExpression '{' ruleSlangCase* '}' #ruleSlangStmt4
  |  'spec' ruleSlangBlock #ruleSlangStmt5
  |  'assume' ruleOwnedExpression RULE_STRING_VALUE? #ruleSlangStmt6
  |  'assert' ruleOwnedExpression RULE_STRING_VALUE? #ruleSlangStmt7
  |  'halt' RULE_STRING_VALUE? #ruleSlangStmt8
  |  'do' ruleOwnedExpression #ruleSlangStmt9
  |  RULE_ID (':' | ruleSlangLHSSuffix* ((':=' | RULE_DEFOP) ruleOwnedExpression)?) #ruleSlangStmt10;

ruleSlangElse: 'else' ('if' ruleOwnedExpression ruleSlangBlock ruleSlangElse? | ruleSlangBlock);

ruleSlangLoopContract:  ruleSlangInvariant? ruleSlangModifies?;

ruleSlangLHSSuffix:
   '.' RULE_ID #ruleSlangLHSSuffix1
  |  '(' (ruleOwnedExpression (',' ruleOwnedExpression)*)? ')' #ruleSlangLHSSuffix2;

ruleSlangCase: 'case' ruleSlangPattern ('if' ruleOwnedExpression)? '=>' ruleSlangStmt*;

ruleSlangPattern:
   RULE_ID ('(' ruleSlangTPattern (',' ruleSlangTPattern)* ')')? #ruleSlangPattern1
  | '(' ruleSlangTPattern (',' ruleSlangTPattern)* ')' #ruleSlangPattern2;

ruleSlangTPattern:
   RULE_ID ('(' ruleSlangTPattern (',' ruleSlangTPattern)* ')' | ':' ruleSlangType)? #ruleSlangTPattern1
  | '(' ruleSlangTPattern (',' ruleSlangTPattern)* ')' #ruleSlangTPattern2
  |  '_' (':' ruleSlangType)? #ruleSlangTPattern3;

ruleSlangVarDef: ruleSlangVarMod ruleSlangPattern (':' ruleSlangType)? ':=' ruleOwnedExpression;

ruleSlangVarMod:
  'val' #ruleSlangVarMod1
  | 'var' #ruleSlangVarMod2;

ruleSlangBlock:  '{' ruleSlangStmt* ruleSlangRet? '}';

ruleOwnedExpression:
   ruleSlangAccess (ruleOperator ruleSlangAccess)* #ruleOwnedExpression1
  |  'if' '(' ruleOwnedExpression ')' ruleOwnedExpression 'else' ruleOwnedExpression #ruleOwnedExpression2
  |  ('\\all' | '\\some' | '\u2200' | '\u2203') ruleSlangQuantVar (',' ruleSlangQuantVar)* '=>' ruleOwnedExpression #ruleOwnedExpression3
  |  ruleOperator ruleSlangAccess #ruleOwnedExpression4;

ruleSlangQuantVar: RULE_ID ':' ruleOwnedExpression (('..' | '..<') ruleOwnedExpression)?;

ruleSlangAccess:  ruleSlangTerm ruleSlangAccessSuffix*;

ruleSlangAccessSuffix:  '.' RULE_ID;

ruleOtherDataRef: RULE_ID ruleArrayRange* ('.' ruleOtherDataRef)?;

ruleSlangTerm:
   ruleSlangLit #ruleSlangTerm1
  |  ruleSlangInterp #ruleSlangTerm2
  |  'In' '(' RULE_ID ')' #ruleSlangTerm3
  |  'MaySend' '(' RULE_ID (',' ruleOwnedExpression)? ')' #ruleSlangTerm4
  |  'MustSend' '(' RULE_ID (',' ruleOwnedExpression)? ')' #ruleSlangTerm5
  |  'NoSend' '(' RULE_ID ')' #ruleSlangTerm6
  |  'HasEvent' '(' RULE_ID ')' #ruleSlangTerm7
  |  ruleQualifiedName ruleSlangCallSuffix #ruleSlangTerm8
  |  ruleQCLREF '.' RULE_ID #ruleSlangTerm9
  |  ruleDataElement '{' RULE_ID '=' ruleOwnedExpression (';' RULE_ID '=' ruleOwnedExpression)* '}' #ruleSlangTerm10
  |  RULE_ID ('.' ruleOtherDataRef)? #ruleSlangTerm11
  |  '(' ruleOwnedExpression ')' #ruleSlangTerm12
  |  'for' ruleSlangForRange (',' ruleSlangForRange)* 'yield' (ruleSlangBlock | '(' ruleOwnedExpression ')') #ruleSlangTerm13
  |  '{' ((ruleSlangParams '=>')? ruleOwnedExpression '}' | ruleSlangStmt* ruleSlangRet? '}') #ruleSlangTerm14;

ruleSlangParams: '(' ruleSlangParam (',' ruleSlangParam)? ')';

ruleSlangParam: 'var'? RULE_ID ':' '=>'? ruleSlangType '*'?;

ruleSlangForRange: RULE_ID ':' ruleOwnedExpression (('..' | '..<') ruleOwnedExpression ('by' ruleOwnedExpression)?)?;

ruleSlangRet:  'return' ruleOwnedExpression?;

ruleSlangCallSuffix:  ruleSlangCallArgs;

ruleSlangCallArgs:  '(' (ruleOwnedExpression (',' ruleOwnedExpression)*)? ')';

ruleSlangLit:
   ('T' | 'F' | 'true' | 'false') #ruleSlangLit1
  |  'res' #ruleSlangLit2
  |  RULE_INTEGER_LIT #ruleSlangLit3
  |  RULE_HEX #ruleSlangLit4
  |  RULE_BIN #ruleSlangLit5
  |  RULE_F32_LIT #ruleSlangLit6
  |  (RULE_F64_LIT | RULE_REAL_LIT) #ruleSlangLit7
  |  'F32' #ruleSlangLit8
  |  'F64' #ruleSlangLit9
  |  RULE_STRING_VALUE #ruleSlangLit10
  |  RULE_MSTRING #ruleSlangLit11;

ruleSlangInterp:
   RULE_MSP #ruleSlangInterp1
  |  RULE_SLI #ruleSlangInterp2
  |  RULE_MSPB ruleSlangMInterp #ruleSlangInterp3;

ruleSlangMInterp: '{' ruleOwnedExpression '}' (RULE_MSPM ruleSlangMInterp | RULE_MSPE);

ruleQualifiedName: ruleQCREF;

ruleOperator:
  RULE_OP #ruleOperator1
  | rulePlusMinus #ruleOperator2
  | ruleSTAR #ruleOperator3
  | RULE_IMPLIES #ruleOperator4
  | RULE_SIMPLIES #ruleOperator5;

ruleContainedPropertyAssociation: ruleQPREF ('=>' | '+=>') 'constant'? ruleOptionalModalPropertyValue (',' ruleOptionalModalPropertyValue)* (ruleAppliesToKeywords ruleContainmentPath (',' ruleContainmentPath)*)? (ruleInBindingKeywords '(' ruleQCREF ')')? ';';

ruleContainmentPath: ruleContainmentPathElement;

ruleOptionalModalPropertyValue: rulePropertyExpression (ruleInModesKeywords '(' RULE_ID (',' RULE_ID)* ')')?;

rulePropertyValue: rulePropertyExpression;

rulePropertyExpression:
  ruleRecordTerm #rulePropertyExpression1
  | ruleReferenceTerm #rulePropertyExpression2
  | ruleComponentClassifierTerm #rulePropertyExpression3
  | ruleComputedTerm #rulePropertyExpression4
  | ruleStringTerm #rulePropertyExpression5
  | ruleNumericRangeTerm #rulePropertyExpression6
  | ruleRealTerm #rulePropertyExpression7
  | ruleIntegerTerm #rulePropertyExpression8
  | ruleListTerm #rulePropertyExpression9
  | ruleBooleanLiteral #rulePropertyExpression10
  | ruleLiteralorReferenceTerm #rulePropertyExpression11;

ruleLiteralorReferenceTerm: ruleQPREF;

ruleBooleanLiteral:  ('true' | 'false');

ruleConstantValue: ruleQPREF;

ruleReferenceTerm: 'reference' '(' ruleContainmentPathElement ')';

ruleRecordTerm: '[' ruleFieldPropertyAssociation+ ']';

ruleComputedTerm: 'compute' '(' RULE_ID ')';

ruleComponentClassifierTerm: 'classifier' '(' ruleQCREF ')';

ruleListTerm:  '(' (rulePropertyExpression (',' rulePropertyExpression)*)? ')';

ruleFieldPropertyAssociation: RULE_ID '=>' rulePropertyExpression ';';

ruleContainmentPathElement: RULE_ID ruleArrayRange* ('.' ruleContainmentPathElement)?;

rulePlusMinus:
  '+' #rulePlusMinus1
  | '-' #rulePlusMinus2;

ruleStringTerm: ruleNoQuoteString;

ruleNoQuoteString: RULE_STRING;

ruleArrayRange:  '[' ruleINTVALUE ('..' ruleINTVALUE)? ']';

ruleSignedConstant: rulePlusMinus ruleConstantValue;

ruleIntegerTerm: ruleSignedInt RULE_ID?;

ruleSignedInt: ('+' | '-')? RULE_INTEGER_LIT;

ruleRealTerm: ruleSignedReal RULE_ID?;

ruleSignedReal: ('+' | '-')? RULE_REAL_LIT;

ruleNumericRangeTerm: ruleNumAlt '..' ruleNumAlt ('delta' ruleNumAlt)?;

ruleNumAlt:
  ruleRealTerm #ruleNumAlt1
  | ruleIntegerTerm #ruleNumAlt2
  | ruleSignedConstant #ruleNumAlt3
  | ruleConstantValue #ruleNumAlt4;

ruleAppliesToKeywords: 'applies' 'to';

ruleInBindingKeywords: 'in' 'binding';

ruleInModesKeywords: 'in' 'modes';

ruleINTVALUE: RULE_INTEGER_LIT;

ruleQCLREF: RULE_ID '::' RULE_ID;

ruleQPREF: RULE_ID ('::' RULE_ID)?;

ruleQCREF: (RULE_ID '::')* RULE_ID ('.' RULE_ID)?;

ruleSTAR: '*';

RULE_F32_LIT: RULE_REAL_LIT 'f';

RULE_F64_LIT: RULE_REAL_LIT 'd';

K_STATE: 'state';
K_INVARIANTS: 'invariants';
K_INV: 'inv';
K_INTEGRATION: 'integration';
K_INITIALIZE: 'initialize';
K_COMPUTE: 'compute';
K_COMPUTE_CASES: 'compute_cases';
K_INFOFLOW: 'infoflow';
K_FROM: 'from';
K_TO: 'to';
K_HANDLE: 'handle';
K_CASE: 'case';
K_ASSUME: 'assume';
K_GUARANTEE: 'guarantee';
K_FUNCTIONS: 'functions';
K_DEF: 'def';
K_MUT: 'mut';
K_INVARIANT: 'invariant';
K_READS: 'reads';
K_MODIFIES: 'modifies';
K_IF: 'if';
K_WHILE: 'while';
K_MATCH: 'match';
K_SPEC: 'spec';
K_ASSERT: 'assert';
K_HALT: 'halt';
K_DO: 'do';
K_ELSE: 'else';
K_VAL: 'val';
K_VAR: 'var';
K_IN: 'In';
K_MAYSEND: 'MaySend';
K_MUSTSEND: 'MustSend';
K_NOSEND: 'NoSend';
K_HASEVENT: 'HasEvent';
K_FOR: 'for';
K_YIELD: 'yield';
K_BY: 'by';
K_RETURN: 'return';
K_T: 'T';
K_F: 'F';
K_TRUE: 'true';
K_FALSE: 'false';
K_RES: 'res';
K_F32: 'F32';
K_F64: 'F64';
K_CONSTANT: 'constant';
K_REFERENCE: 'reference';
K_CLASSIFIER: 'classifier';
K_DELTA: 'delta';
K_APPLIES: 'applies';
K_IN: 'in';
K_BINDING: 'binding';
K_MODES: 'modes';
K_D: 'd';

LPAREN: '(';
RPAREN: ')';
LSQUARE: '[';
RSQUARE: ']';
LBRACE: '{';
RBRACE: '}';

OP_COLON: ':';
OP_SEMI: ';';
OP_COMMA: ',';
OP_COLON_EQ: ':=';
OP_AT_____115_________116_________114_________105_________99_________116_________112_________117_________114_________101____: '@strictpure';
OP_AT_____112_________117_________114_________101____: '@pure';
OP_EQ_RANGLE: '=>';
OP_STAR: '*';
OP_DOT: '.';
OP_____95____: '_';
OP_BSLASH_BSLASH_____97_________108_________108____: '\\all';
OP_BSLASH_BSLASH_____115_________111_________109_________101____: '\\some';
OP_BSLASH_____117_________50_________50_________48_________48____: '\u2200';
OP_BSLASH_____117_________50_________50_________48_________51____: '\u2203';
OP_DOT_DOT: '..';
OP_DOT_DOT_LANGLE: '..<';
OP_EQ: '=';
OP_PLUS_EQ_RANGLE: '+=>';
OP_PLUS: '+';
OP_MINUS: '-';
OP_COLON_COLON: '::';
OP_DQUOTE: '"';
OP_BSLASH_BSLASH: '\\';

/*
def isKeyword(tokenType: Int): Boolean = {
  import GUMBOLexer._
  tokenType match {
    case K_STATE |
         K_INVARIANTS |
         K_INV |
         K_INTEGRATION |
         K_INITIALIZE |
         K_COMPUTE |
         K_COMPUTE_CASES |
         K_INFOFLOW |
         K_FROM |
         K_TO |
         K_HANDLE |
         K_CASE |
         K_ASSUME |
         K_GUARANTEE |
         K_FUNCTIONS |
         K_DEF |
         K_MUT |
         K_INVARIANT |
         K_READS |
         K_MODIFIES |
         K_IF |
         K_WHILE |
         K_MATCH |
         K_SPEC |
         K_ASSERT |
         K_HALT |
         K_DO |
         K_ELSE |
         K_VAL |
         K_VAR |
         K_IN |
         K_MAYSEND |
         K_MUSTSEND |
         K_NOSEND |
         K_HASEVENT |
         K_FOR |
         K_YIELD |
         K_BY |
         K_RETURN |
         K_T |
         K_F |
         K_TRUE |
         K_FALSE |
         K_RES |
         K_F32 |
         K_F64 |
         K_CONSTANT |
         K_REFERENCE |
         K_CLASSIFIER |
         K_DELTA |
         K_APPLIES |
         K_IN |
         K_BINDING |
         K_MODES |
         K_D => true
    case _ => false
  }
}
*/

RULE_STRING_VALUE: '"' (RULE_ESC_SEQ | ~('\\' | '"'))* '"';

RULE_MSTRING: '"""' (~'"' | '"' ~'"' | '""' ~'"')* ('"""' | '""""' | '"""""');

RULE_MSP: RULE_IDF '"""' RULE_MSPI* ('"""' | '""""' | '"""""');

RULE_SLI: RULE_IDF '"' (RULE_ESC_SEQ | ~('\\' | '"'))* '"';

RULE_MSPB: RULE_IDF '"""' RULE_MSPI* '$';

RULE_MSPM: '$' RULE_MSPI* '$';

RULE_MSPE: '$' RULE_MSPI* ('"""' | '""""' | '"""""');

RULE_DEFOP: ':' RULE_OPSYM* '=';

RULE_IMPLIES: ('-' | '~') '>' ':';

RULE_SIMPLIES: '~' '~' '>' ':';

RULE_OP:
  RULE_OPSYM+ 
  | '\\' RULE_IDF ;

RULE_HEX: '0x' RULE_EXTENDED_DIGIT+ ('.' RULE_IDF)?;

RULE_BIN: '0b' ('0' | '1' | '_')+ ('.' RULE_IDF)?;

RULE_INT_IDF: RULE_INTEGER_LIT RULE_IDF;

RULE_IDF: (RULE_LETTER | '_') (RULE_LETTER | RULE_DIGIT)*;

RULE_MSPI:
  ~('"' | '$') 
  | '$$' 
  | '"' ~'"' 
  | '""' ~'"' ;

RULE_LETTER:
  'a'..'z' 
  | 'A'..'Z' ;

RULE_OPSYM:
  '/' 
  | '%' 
  | '=' 
  | '<' 
  | '>' 
  | '!' 
  | '&' 
  | '^' 
  | '|' 
  | '~' 
  | '\u2200'..'\u22FF' 
  | '\u2A00'..'\u2AFF' 
  | '\u27C0'..'\u27EF' 
  | '\u2980'..'\u29FF' ;

RULE_ESC_SEQ:
  '\\' ('b' | 't' | 'n' | 'f' | 'r' | '"' | '\'' | '\\') 
  | RULE_UNICODE_ESC ;

RULE_UNICODE_ESC: '\\' 'u' RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT RULE_EXTENDED_DIGIT;

RULE_SL_COMMENT: '--' ~('\n' | '\r')* ('\r'? '\n')?;

RULE_EXPONENT: ('e' | 'E') ('+' | '-')? RULE_DIGIT+;

RULE_INT_EXPONENT: ('e' | 'E') '+'? RULE_DIGIT+;

RULE_REAL_LIT: RULE_DIGIT+ ('_' RULE_DIGIT+)* '.' RULE_DIGIT+ ('_' RULE_DIGIT+)* RULE_EXPONENT?;

RULE_INTEGER_LIT: RULE_DIGIT+ ('_' RULE_DIGIT+)* ('#' RULE_BASED_INTEGER '#' RULE_INT_EXPONENT? | RULE_INT_EXPONENT?);

RULE_DIGIT: '0'..'9';

RULE_EXTENDED_DIGIT:
  '0'..'9' 
  | 'a'..'f' 
  | 'A'..'F' ;

RULE_BASED_INTEGER: RULE_EXTENDED_DIGIT ('_'? RULE_EXTENDED_DIGIT)*;

RULE_STRING:
  '"' ('\\' ('b' | 't' | 'n' | 'f' | 'r' | 'u' | '"' | '\'' | '\\') | ~('\\' | '"'))* '"' 
  | '\'' ('\\' ('b' | 't' | 'n' | 'f' | 'r' | 'u' | '"' | '\'' | '\\') | ~('\\' | '\''))* '\'' ;

RULE_ID: ('a'..'z' | 'A'..'Z') ('_'? ('a'..'z' | 'A'..'Z' | '0'..'9'))*;

RULE_WS: (' ' | '\t' | '\r' | '\n')+ -> channel(HIDDEN);