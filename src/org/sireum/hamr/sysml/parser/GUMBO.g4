// Auto-generated from https://people.cs.ksu.edu/~belt/temp/InternalGumboParserv2.g
grammar GUMBO;

entryRuleGumboLibrary: ruleGumboLibrary EOF;

ruleGumboLibrary:  ruleFunctions?;

ruleSpecSection:  ruleState? ruleFunctions? ruleInvariants? ruleIntegration? ruleInitialize? ruleCompute?;

ruleState: 'state' ruleStateVarDecl+;

ruleStateVarDecl: RULE_ID ':' ruleQualifiedName ';';

ruleInvariants: 'invariants' ruleInvSpec+;

ruleInvSpec: 'inv' RULE_ID RULE_STRING_VALUE? ':' ruleOwnedExpression ';';

ruleIntegration: 'integration' ruleSpecStatement+;

ruleInitialize:  'initialize' (ruleSlangModifies ';')? ruleInitializeSpecStatement* ruleInfoFlowClause*;

ruleInitializeSpecStatement: ruleGuaranteeStatement;

ruleCompute:  'compute' (ruleSlangModifies ';')? ruleSpecStatement* ('cases' ruleCaseStatementClause+)* ruleHandlerClause* ruleInfoFlowClause*;

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

ruleOtherDataRef: RULE_ID ('.' ruleOtherDataRef)?;

ruleFunctions: 'functions' ruleFuncSpec+;

ruleFuncSpec: ruleSlangDefDef ';';

ruleSlangDefDecl: 'def' ruleSlangDefMods? ruleSlangDefExt? RULE_ID ruleSlangTypeParams? ruleSlangDefParams? ':' ruleSlangType ruleSlangDefContract?;

ruleSlangDefDef: 'def' ruleSlangDefExt? RULE_ID ruleSlangTypeParams? ruleSlangDefParams ':' ruleSlangType ':=' ruleSlangDefContract ruleOwnedExpression;

ruleSlangDefMods:
  '@strictpure' #ruleSlangDefMods1
  | '@pure' #ruleSlangDefMods2;

ruleSlangDefExt: '(' RULE_ID ':' ruleSlangType ')';

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
  |  RULE_ID (':' | ruleSlangLHSSuffix* (':=' ruleOwnedExpression)?) #ruleSlangStmt10;

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

ruleSlangType: ruleQualifiedName;

ruleSlangBlock: '{' ruleSlangStmt* ruleSlangRet? '}';

ruleSlangRet: 'return' ruleOwnedExpression?;

ruleSlangTypeArgs: '[' ruleSlangType (',' ruleSlangType)* ']';

ruleOwnedExpressionMember: ruleOwnedExpression;

ruleOwnedExpression: ruleConditionalExpression;

ruleOwnedExpressionReference: ruleOwnedExpressionMember;

ruleConditionalExpression:
  ruleNullCoalescingExpression #ruleConditionalExpression1
  |  ruleConditionalOperator ruleNullCoalescingExpression '?' ruleOwnedExpressionReference 'else' ruleOwnedExpressionReference #ruleConditionalExpression2;

ruleConditionalOperator: 'if';

ruleNullCoalescingExpression: ruleImpliesExpression ( ruleNullCoalescingOperator ruleImpliesExpressionReference)*;

ruleNullCoalescingOperator: '??';

ruleImpliesExpressionReference: ruleImpliesExpressionMember;

ruleImpliesExpressionMember: ruleImpliesExpression;

ruleImpliesExpression: ruleOrExpression ( ruleImpliesOperator ruleOrExpressionReference)*;

ruleImpliesOperator: 'implies';

ruleOrExpressionReference: ruleOrExpressionMember;

ruleOrExpressionMember: ruleOrExpression;

ruleOrExpression: ruleXorExpression ( (ruleOrOperator ruleXorExpression | ruleConditionalOrOperator ruleXorExpressionReference))*;

ruleOrOperator: '|';

ruleConditionalOrOperator: 'or';

ruleXorExpressionReference: ruleXorExpressionMember;

ruleXorExpressionMember: ruleXorExpression;

ruleXorExpression: ruleAndExpression ( ruleXorOperator ruleAndExpression)*;

ruleXorOperator: 'xor';

ruleAndExpression: ruleEqualityExpression ( (ruleAndOperator ruleEqualityExpression | ruleConditionalAndOperator ruleEqualityExpressionReference))*;

ruleAndOperator: '&';

ruleConditionalAndOperator: 'and';

ruleEqualityExpressionReference: ruleEqualityExpressionMember;

ruleEqualityExpressionMember: ruleEqualityExpression;

ruleEqualityExpression: ruleClassificationExpression ( ruleEqualityOperator ruleClassificationExpression)*;

ruleEqualityOperator:
  '==' #ruleEqualityOperator1
  | '!=' #ruleEqualityOperator2
  | '===' #ruleEqualityOperator3
  | '!==' #ruleEqualityOperator4;

ruleClassificationExpression:
  ruleRelationalExpression ( ruleClassificationTestOperator ruleTypeReferenceMember |  ruleCastOperator ruleTypeResultMember)? #ruleClassificationExpression1
  |  ruleSelfReferenceExpression ruleClassificationTestOperator ruleTypeReferenceMember #ruleClassificationExpression2
  |  ruleMetadataReference ruleMetaClassificationTestOperator ruleTypeReferenceMember #ruleClassificationExpression3
  |  ruleSelfReferenceExpression ruleCastOperator ruleTypeResultMember #ruleClassificationExpression4
  |  ruleMetadataReference ruleMetaCastOperator ruleTypeResultMember #ruleClassificationExpression5;

ruleClassificationTestOperator:
  'hastype' #ruleClassificationTestOperator1
  | 'istype' #ruleClassificationTestOperator2
  | '@' #ruleClassificationTestOperator3;

ruleMetaClassificationTestOperator: '@@';

ruleCastOperator: 'as';

ruleMetaCastOperator: 'meta';

ruleMetadataReference: ruleQualifiedName;

ruleTypeReferenceMember: ruleTypeReference;

ruleTypeResultMember: ruleTypeReference;

ruleTypeReference: ruleReferenceTyping;

ruleReferenceTyping: ruleQualifiedName;

ruleSelfReferenceExpression: ruleSelfReferenceMember;

ruleSelfReferenceMember: ruleEmptyFeature;

ruleEmptyFeature: ;

ruleRelationalExpression: ruleRangeExpression ( ruleRelationalOperator ruleRangeExpression)*;

ruleRelationalOperator:
  '<' #ruleRelationalOperator1
  | '>' #ruleRelationalOperator2
  | '<=' #ruleRelationalOperator3
  | '>=' #ruleRelationalOperator4;

ruleRangeExpression: ruleAdditiveExpression ( '..' ruleAdditiveExpression)?;

ruleAdditiveExpression: ruleMultiplicativeExpression ( ruleAdditiveOperator ruleMultiplicativeExpression)*;

ruleAdditiveOperator:
  '+' #ruleAdditiveOperator1
  | '-' #ruleAdditiveOperator2;

ruleMultiplicativeExpression: ruleExponentiationExpression ( ruleMultiplicativeOperator ruleExponentiationExpression)*;

ruleMultiplicativeOperator:
  '*' #ruleMultiplicativeOperator1
  | '/' #ruleMultiplicativeOperator2
  | '%' #ruleMultiplicativeOperator3;

ruleExponentiationExpression: ruleUnaryExpression ( ruleExponentiationOperator ruleExponentiationExpression)?;

ruleExponentiationOperator:
  '**' #ruleExponentiationOperator1
  | '^' #ruleExponentiationOperator2;

ruleUnaryExpression:
   ruleUnaryOperator ruleExtentExpression #ruleUnaryExpression1
  | ruleExtentExpression #ruleUnaryExpression2;

ruleUnaryOperator:
  '+' #ruleUnaryOperator1
  | '-' #ruleUnaryOperator2
  | '~' #ruleUnaryOperator3
  | 'not' #ruleUnaryOperator4;

ruleExtentExpression:
   'all' ruleTypeResultMember #ruleExtentExpression1
  | rulePrimaryExpression #ruleExtentExpression2;

rulePrimaryExpression: ruleBaseExpression ( '.' ruleFeatureChainMember)? (( '#' '(' ruleSequenceExpression ')' |  '[' ruleSequenceExpression ']' |  '->' ruleReferenceTyping (ruleBodyExpression | ruleFunctionReferenceExpression | ruleArgumentList) |  '.' ruleBodyExpression |  '.?' ruleBodyExpression) ( '.' ruleFeatureChainMember)?)*;

ruleFunctionReferenceExpression: ruleFunctionReferenceMember;

ruleFunctionReferenceMember: ruleFunctionReference;

ruleFunctionReference: ruleReferenceTyping;

ruleFeatureChainMember:
  ruleQualifiedName #ruleFeatureChainMember1
  |  ruleOwnedFeatureChain #ruleFeatureChainMember2;

ruleBaseExpression:
  ruleNullExpression #ruleBaseExpression1
  | ruleLiteralExpression #ruleBaseExpression2
  | ruleFeatureReferenceExpression #ruleBaseExpression3
  | ruleMetadataAccessExpression #ruleBaseExpression4
  | ruleInvocationExpression #ruleBaseExpression5
  | ruleBodyExpression #ruleBaseExpression6
  | '(' ruleSequenceExpression ')' #ruleBaseExpression7;

ruleBodyExpression: ruleExpressionBodyMember;

ruleExpressionBodyMember: ruleExpressionBody;

ruleExpressionBody: '{' (ruleBodyParameterMember ';')* ruleResultExpressionMember '}';

ruleResultExpressionMember: ruleOwnedExpression;

ruleBodyParameterMember: 'in' ruleBodyParameter;

ruleBodyParameter: ruleName;

ruleSequenceExpression: ruleOwnedExpression (',' |  ',' ruleSequenceExpression)?;

ruleFeatureReferenceExpression: ruleFeatureReferenceMember;

ruleFeatureReferenceMember: ruleQualifiedName;

ruleMetadataAccessExpression: ruleQualifiedName '.' 'metadata';

ruleInvocationExpression: ruleOwnedFeatureTyping ruleArgumentList;

ruleOwnedFeatureTyping:
  ruleQualifiedName #ruleOwnedFeatureTyping1
  | ruleOwnedFeatureChain #ruleOwnedFeatureTyping2;

ruleOwnedFeatureChain: ruleFeatureChain;

ruleFeatureChain: ruleOwnedFeatureChaining ('.' ruleOwnedFeatureChaining)+;

ruleOwnedFeatureChaining: ruleQualifiedName;

ruleArgumentList: '(' (rulePositionalArgumentList | ruleNamedArgumentList)? ')';

rulePositionalArgumentList: ruleArgumentMember (',' ruleArgumentMember)*;

ruleArgumentMember: ruleArgument;

ruleArgument: ruleArgumentValue;

ruleNamedArgumentList: ruleNamedArgumentMember (',' ruleNamedArgumentMember)*;

ruleNamedArgumentMember: ruleNamedArgument;

ruleNamedArgument: ruleParameterRedefinition '=' ruleArgumentValue;

ruleParameterRedefinition: ruleQualifiedName;

ruleArgumentValue: ruleOwnedExpression;

ruleNullExpression:  ('null' | '(' ')');

ruleLiteralExpression:
  ruleLiteralBoolean #ruleLiteralExpression1
  | ruleLiteralString #ruleLiteralExpression2
  | ruleLiteralInteger #ruleLiteralExpression3
  | ruleLiteralReal #ruleLiteralExpression4
  | ruleLiteralInfinity #ruleLiteralExpression5;

ruleLiteralBoolean: ruleBooleanValue;

ruleBooleanValue:
  'true' #ruleBooleanValue1
  | 'false' #ruleBooleanValue2;

ruleLiteralString: RULE_STRING_VALUE;

ruleLiteralInteger: RULE_DECIMAL_VALUE;

ruleLiteralReal: ruleRealValue;

ruleRealValue:
  RULE_DECIMAL_VALUE? '.' (RULE_DECIMAL_VALUE | RULE_EXP_VALUE) #ruleRealValue1
  | RULE_EXP_VALUE #ruleRealValue2;

ruleLiteralInfinity:  '*';

ruleName:
  RULE_ID #ruleName1
  | RULE_UNRESTRICTED_NAME #ruleName2;

ruleQualification: (ruleName '::')+;

ruleQualifiedName: ruleQualification? ruleName;

K_STATE: 'state';
K_INVARIANTS: 'invariants';
K_INV: 'inv';
K_INTEGRATION: 'integration';
K_INITIALIZE: 'initialize';
K_COMPUTE: 'compute';
K_CASES: 'cases';
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
K_RETURN: 'return';
K_IMPLIES: 'implies';
K_OR: 'or';
K_XOR: 'xor';
K_AND: 'and';
K_HASTYPE: 'hastype';
K_ISTYPE: 'istype';
K_AS: 'as';
K_META: 'meta';
K_NOT: 'not';
K_ALL: 'all';
K_IN: 'in';
K_METADATA: 'metadata';
K_NULL: 'null';
K_TRUE: 'true';
K_FALSE: 'false';

LPAREN: '(';
RPAREN: ')';
LSQUARE: '[';
RSQUARE: ']';
LBRACE: '{';
RBRACE: '}';
LANGLE: '<';
RANGLE: '>';

OP_COLON: ':';
OP_SEMI: ';';
OP_COMMA: ',';
OP_DOT: '.';
OP_COLON_EQ: ':=';
OP_AT_____115_________116_________114_________105_________99_________116_________112_________117_________114_________101____: '@strictpure';
OP_AT_____112_________117_________114_________101____: '@pure';
OP_EQ_RANGLE: '=>';
OP_STAR: '*';
OP_____95____: '_';
OP_QMARK: '?';
OP_QMARK_QMARK: '??';
OP_BAR: '|';
OP_AND: '&';
OP_EQ_EQ: '==';
OP_BANG_EQ: '!=';
OP_EQ_EQ_EQ: '===';
OP_BANG_EQ_EQ: '!==';
OP_AT: '@';
OP_AT_AT: '@@';
OP_LANGLE_EQ: '<=';
OP_RANGLE_EQ: '>=';
OP_DOT_DOT: '..';
OP_PLUS: '+';
OP_MINUS: '-';
OP_SLASH: '/';
OP_PERCENT: '%';
OP_STAR_STAR: '**';
OP_HAT: '^';
OP_TILDE: '~';
OP_HASH: '#';
OP_MINUS_RANGLE: '->';
OP_DOT_QMARK: '.?';
OP_EQ: '=';
OP_COLON_COLON: '::';

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
         K_CASES |
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
         K_RETURN |
         K_IMPLIES |
         K_OR |
         K_XOR |
         K_AND |
         K_HASTYPE |
         K_ISTYPE |
         K_AS |
         K_META |
         K_NOT |
         K_ALL |
         K_IN |
         K_METADATA |
         K_NULL |
         K_TRUE |
         K_FALSE => true
    case _ => false
  }
}
*/

RULE_DECIMAL_VALUE: '0'..'9' '0'..'9'*;

RULE_EXP_VALUE: RULE_DECIMAL_VALUE ('e' | 'E') ('+' | '-')? RULE_DECIMAL_VALUE;

RULE_ID: ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;

RULE_UNRESTRICTED_NAME: '\'' ('\\' ('b' | 't' | 'n' | 'f' | 'r' | '"' | '\'' | '\\') | ~('\\' | '\''))* '\'';

RULE_STRING_VALUE: '"' ('\\' ('b' | 't' | 'n' | 'f' | 'r' | '"' | '\'' | '\\') | ~('\\' | '"'))* '"';

RULE_REGULAR_COMMENT: '/*' .*? '*/';

RULE_ML_NOTE: '//*' .*? '*/' -> channel(HIDDEN);

RULE_SL_NOTE: '//' ~'*' (~('\n' | '\r') ~('\n' | '\r')*)? ('\r'? '\n')? -> channel(HIDDEN);

RULE_WS: (' ' | '\t' | '\r' | '\n')+ -> channel(HIDDEN);