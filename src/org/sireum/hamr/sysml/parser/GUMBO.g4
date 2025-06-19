// Auto-generated from /Users/belt/devel/sireum/hamr-sysml-parser/src/org/sireum/hamr/sysml/parser/Internal_Gumbo_mod.g
grammar GUMBO;

@parser::members {
  public static boolean isKeyword(int tokenType) {
    switch (tokenType) {
      case GUMBOLexer.K_STATE:
      case GUMBOLexer.K_INVARIANTS:
      case GUMBOLexer.K_INV:
      case GUMBOLexer.K_INTEGRATION:
      case GUMBOLexer.K_INITIALIZE:
      case GUMBOLexer.K_COMPUTE:
      case GUMBOLexer.K_COMPUTE_CASES:
      case GUMBOLexer.K_INFOFLOW:
      case GUMBOLexer.K_FROM:
      case GUMBOLexer.K_TO:
      case GUMBOLexer.K_HANDLE:
      case GUMBOLexer.K_CASE:
      case GUMBOLexer.K_ASSUME:
      case GUMBOLexer.K_GUARANTEE:
      case GUMBOLexer.K_FUNCTIONS:
      case GUMBOLexer.K_DEF:
      case GUMBOLexer.K_MUT:
      case GUMBOLexer.K_INVARIANT:
      case GUMBOLexer.K_READS:
      case GUMBOLexer.K_MODIFIES:
      case GUMBOLexer.K_ELSE:
      case GUMBOLexer.K_IF:
      case GUMBOLexer.K_IMPLIES:
      case GUMBOLexer.K_OR:
      case GUMBOLexer.K_XOR:
      case GUMBOLexer.K_AND:
      case GUMBOLexer.K_HASTYPE:
      case GUMBOLexer.K_ISTYPE:
      case GUMBOLexer.K_AS:
      case GUMBOLexer.K_META:
      case GUMBOLexer.K_NOT:
      case GUMBOLexer.K_ALL:
      case GUMBOLexer.K_IN:
      case GUMBOLexer.K_METADATA:
      case GUMBOLexer.K_NEW:
      case GUMBOLexer.K_NULL:
      case GUMBOLexer.K_TRUE:
      case GUMBOLexer.K_FALSE:
        return true;
      default: return false;
    }
  }
}

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

ruleCompute:  'compute' (ruleSlangModifies ';')? ruleAssumeStatement* ruleGuaranteeStatement* ('compute_cases' ruleCaseStatementClause+)* ruleHandlerClause* ruleInfoFlowClause*;

ruleInfoFlowClause: 'infoflow' RULE_ID RULE_STRING_VALUE? ':' 'from' '(' (RULE_ID (',' RULE_ID)*)? ')' ',' 'to' '(' (RULE_ID (',' RULE_ID)*)? ')' ';';

ruleHandlerClause: 'handle' RULE_ID ':' (ruleSlangModifies ';')? ruleAssumeStatement* ruleGuaranteeStatement* ('compute_cases' ruleCaseStatementClause+)*;

ruleCaseStatementClause: 'case' RULE_ID RULE_STRING_VALUE? ':' ruleAnonAssumeStatement? ruleAnonGuaranteeStatement;

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

ruleSlangDefDef: 'def' ruleSlangDefID ruleSlangTypeParams? ruleSlangDefParams ':' ruleSlangType ':=' ruleSlangDefContract ruleOwnedExpression;

ruleSlangDefID: RULE_ID;

ruleSlangDefParams: '(' (ruleSlangDefParam (',' ruleSlangDefParam)*)? ')';

ruleSlangDefParam: RULE_ID ':' '=>'? ruleSlangType '*'?;

ruleSlangTypeParams: '[' ruleSlangTypeParam (',' ruleSlangTypeParam)* ']';

ruleSlangTypeParam: 'mut'? RULE_ID;

ruleSlangDefContract:  (ruleSlangReads ';')? (ruleSlangRequires ';')? (ruleSlangModifies ';')? (ruleSlangEnsures ';')?;

ruleSlangInvariant: 'invariant' ruleOwnedExpression (',' ruleOwnedExpression)*;

ruleSlangRequires: 'assume' ruleOwnedExpression (',' ruleOwnedExpression)*;

ruleSlangReads: 'reads' ruleOwnedExpression (',' ruleOwnedExpression)*;

ruleSlangModifies: 'modifies' ruleOwnedExpression (',' ruleOwnedExpression)*;

ruleSlangEnsures: 'guarantee' ruleOwnedExpression (',' ruleOwnedExpression)*;

ruleSlangType: ruleSlangBaseType;

ruleSlangBaseType: ruleQualifiedName;

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

ruleMetadataReference: ruleElementReferenceMember;

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

rulePrimaryExpression: ruleBaseExpression ( '.' ruleFeatureChainMember)? (( '#' '(' ruleSequenceExpression ')' |  '[' ruleSequenceExpression ']' |  '->' ruleInstantiatedTypeMember (ruleBodyExpression | ruleFunctionReferenceExpression | ruleArgumentList) |  '.' ruleBodyExpression |  '.?' ruleBodyExpression) ( '.' ruleFeatureChainMember)?)*;

ruleFunctionReferenceExpression: ruleFunctionReferenceMember;

ruleFunctionReferenceMember: ruleFunctionReference;

ruleFunctionReference: ruleReferenceTyping;

ruleFeatureChainMember:
  ruleQualifiedName #ruleFeatureChainMember1
  |  ruleOwnedFeatureChain #ruleFeatureChainMember2;

ruleOwnedFeatureChain: ruleFeatureChain;

ruleBaseExpression:
  ruleNullExpression #ruleBaseExpression1
  | ruleLiteralExpression #ruleBaseExpression2
  | ruleFeatureReferenceExpression #ruleBaseExpression3
  | ruleMetadataAccessExpression #ruleBaseExpression4
  | ruleInvocationExpression #ruleBaseExpression5
  | ruleConstructorExpression #ruleBaseExpression6
  | ruleBodyExpression #ruleBaseExpression7
  | '(' ruleSequenceExpression ')' #ruleBaseExpression8;

ruleBodyExpression: ruleExpressionBodyMember;

ruleExpressionBodyMember: ruleExpressionBody;

ruleExpressionBody: '{' (ruleBodyParameterMember ';')* ruleResultExpressionMember '}';

ruleResultExpressionMember: ruleOwnedExpression;

ruleBodyParameterMember: 'in' ruleBodyParameter;

ruleBodyParameter: ruleName;

ruleSequenceExpression: ruleOwnedExpression (',' |  ',' ruleSequenceExpression)?;

ruleFeatureReferenceExpression: ruleFeatureReferenceMember;

ruleFeatureReferenceMember: ruleQualifiedName;

ruleMetadataAccessExpression: ruleElementReferenceMember '.' 'metadata';

ruleElementReferenceMember: ruleQualifiedName;

ruleInvocationExpression: ruleInstantiatedTypeMember ruleArgumentList;

ruleConstructorExpression: 'new' ruleInstantiatedTypeMember ruleConstructorResultMember;

ruleConstructorResultMember: ruleConstructorResult;

ruleConstructorResult: ruleArgumentList;

ruleInstantiatedTypeMember:
  ruleQualifiedName #ruleInstantiatedTypeMember1
  |  ruleOwnedFeatureChain #ruleInstantiatedTypeMember2;

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

ruleGlobalQualification: '$' '::';

ruleQualification: (ruleName '::')+;

ruleQualifiedName: ruleGlobalQualification? ruleQualification? ruleName;

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
K_ELSE: 'else';
K_IF: 'if';
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
K_NEW: 'new';
K_NULL: 'null';
K_TRUE: 'true';
K_FALSE: 'false';

LPAREN: '(';
RPAREN: ')';
LSQUARE: '[';
RSQUARE: ']';
LANGLE: '<';
RANGLE: '>';
LBRACE: '{';
RBRACE: '}';

OP_COLON: ':';
OP_SEMI: ';';
OP_COMMA: ',';
OP_COLON_EQ: ':=';
OP_EQ_RANGLE: '=>';
OP_STAR: '*';
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
OP_DOT: '.';
OP_HASH: '#';
OP_MINUS_RANGLE: '->';
OP_DOT_QMARK: '.?';
OP_EQ: '=';
OP_DOLLAR: '$';
OP_COLON_COLON: '::';

RULE_DECIMAL_VALUE: '0'..'9' '0'..'9'*;

RULE_EXP_VALUE: RULE_DECIMAL_VALUE ('e' | 'E') ('+' | '-')? RULE_DECIMAL_VALUE;

RULE_ID: ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;

RULE_UNRESTRICTED_NAME: '\'' ('\\' ('b' | 't' | 'n' | 'f' | 'r' | '"' | '\'' | '\\') | ~('\\' | '\''))* '\'';

RULE_STRING_VALUE: '"' ('\\' ('b' | 't' | 'n' | 'f' | 'r' | '"' | '\'' | '\\') | ~('\\' | '"'))* '"';

RULE_REGULAR_COMMENT: '/*' .*? '*/';

RULE_ML_NOTE: '//*' .*? '*/' -> channel(HIDDEN);

RULE_SL_NOTE: '//' (~('\n' | '\r') ~('\n' | '\r')*)? ('\r'? '\n')? -> channel(HIDDEN);

RULE_WS: (' ' | '\t' | '\r' | '\n')+ -> channel(HIDDEN);