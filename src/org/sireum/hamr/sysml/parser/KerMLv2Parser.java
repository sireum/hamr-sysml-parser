// Generated from /Users/robby/Repositories/Sireum/hamr-sysml-parser/src/org/sireum/hamr/sysml/parser/KerMLv2.g4 by ANTLR 4.13.1
package org.sireum.hamr.sysml.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class KerMLv2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		K_DEPENDENCY=1, K_FROM=2, K_TO=3, K_COMMENT=4, K_ABOUT=5, K_LOCALE=6, 
		K_DOC=7, K_REP=8, K_LANGUAGE=9, K_NAMESPACE=10, K_ALIAS=11, K_FOR=12, 
		K_IMPORT=13, K_ALL=14, K_STANDARD=15, K_LIBRARY=16, K_PACKAGE=17, K_FILTER=18, 
		K_ABSTRACT=19, K_TYPE=20, K_SPECIALIZES=21, K_CONJUGATES=22, K_DISJOINT=23, 
		K_UNIONS=24, K_INTERSECTS=25, K_DIFFERENCES=26, K_MEMBER=27, K_SPECIALIZATION=28, 
		K_SUBTYPE=29, K_CONJUGATION=30, K_CONJUGATE=31, K_DISJOINING=32, K_CLASSIFIER=33, 
		K_SUBCLASSIFIER=34, K_COMPOSITE=35, K_PORTION=36, K_READONLY=37, K_DERIVED=38, 
		K_END=39, K_FEATURE=40, K_CHAINS=41, K_INVERSE=42, K_OF=43, K_FEATURED=44, 
		K_BY=45, K_ORDERED=46, K_NONUNIQUE=47, K_TYPED=48, K_SUBSETS=49, K_REFERENCES=50, 
		K_REDEFINES=51, K_INVERTING=52, K_FEATURING=53, K_TYPING=54, K_SUBSET=55, 
		K_REDEFINITION=56, K_DEFAULT=57, K_MULTIPLICITY=58, K_DATATYPE=59, K_CLASS=60, 
		K_STRUCT=61, K_ASSOC=62, K_CONNECTOR=63, K_BINDING=64, K_SUCCESSION=65, 
		K_FIRST=66, K_THEN=67, K_BEHAVIOR=68, K_STEP=69, K_FUNCTION=70, K_RETURN=71, 
		K_EXPR=72, K_PREDICATE=73, K_BOOL=74, K_INV=75, K_TRUE=76, K_FALSE=77, 
		K_INTERACTION=78, K_FLOW=79, K_METACLASS=80, K_METADATA=81, K_ELSE=82, 
		K_IF=83, K_IMPLIES=84, K_OR=85, K_XOR=86, K_AND=87, K_HASTYPE=88, K_ISTYPE=89, 
		K_AS=90, K_META=91, K_NOT=92, K_NULL=93, K_PUBLIC=94, K_PRIVATE=95, K_PROTECTED=96, 
		K_IN=97, K_OUT=98, K_INOUT=99, LANGLE=100, RANGLE=101, LBRACE=102, RBRACE=103, 
		RSQUARE=104, LSQUARE=105, LPAREN=106, RPAREN=107, OP_SEMI=108, OP_COMMA=109, 
		OP_COLON_COLON=110, OP_STAR_STAR=111, OP_STAR=112, OP_COLON_RANGLE=113, 
		OP_TILDE=114, OP_COLON=115, OP_COLON_COLON_RANGLE=116, OP_COLON_RANGLE_RANGLE=117, 
		OP_EQ=118, OP_COLON_EQ=119, OP_DOT_DOT=120, OP_DOT=121, OP_HASH=122, OP_AT=123, 
		OP_QMARK=124, OP_QMARK_QMARK=125, OP_BAR=126, OP_AND=127, OP_EQ_EQ=128, 
		OP_BANG_EQ=129, OP_EQ_EQ_EQ=130, OP_BANG_EQ_EQ=131, OP_AT_AT=132, OP_LANGLE_EQ=133, 
		OP_RANGLE_EQ=134, OP_PLUS=135, OP_MINUS=136, OP_SLASH=137, OP_PERCENT=138, 
		OP_HAT=139, OP_MINUS_RANGLE=140, OP_DOT_QMARK=141, RULE_DECIMAL_VALUE=142, 
		RULE_EXP_VALUE=143, RULE_ID=144, RULE_UNRESTRICTED_NAME=145, RULE_STRING_VALUE=146, 
		RULE_REGULAR_COMMENT=147, RULE_ML_NOTE=148, RULE_SL_NOTE=149, RULE_WS=150;
	public static final int
		RULE_entryRuleRootNamespace = 0, RULE_ruleRootNamespace = 1, RULE_ruleIdentification = 2, 
		RULE_ruleRelationshipBody = 3, RULE_ruleRelationshipOwnedElement = 4, 
		RULE_ruleOwnedRelatedElement = 5, RULE_ruleDependency = 6, RULE_ruleAnnotation = 7, 
		RULE_ruleOwnedAnnotation = 8, RULE_ruleAnnotatingElement = 9, RULE_ruleComment = 10, 
		RULE_ruleDocumentation = 11, RULE_ruleTextualRepresentation = 12, RULE_ruleNamespace = 13, 
		RULE_ruleNamespaceDeclaration = 14, RULE_ruleNamespaceBody = 15, RULE_ruleNamespaceBodyElement = 16, 
		RULE_ruleMemberPrefix = 17, RULE_ruleNamespaceMember = 18, RULE_ruleNonFeatureMember = 19, 
		RULE_ruleNamespaceFeatureMember = 20, RULE_ruleAliasMember = 21, RULE_ruleImportPrefix = 22, 
		RULE_ruleImport = 23, RULE_ruleMembershipImport = 24, RULE_ruleImportedMembership = 25, 
		RULE_ruleNamespaceImport = 26, RULE_ruleImportedNamespace = 27, RULE_ruleFilterPackage = 28, 
		RULE_ruleFilterPackageImport = 29, RULE_ruleFilterPackageMembershipImport = 30, 
		RULE_ruleFilterPackageNamespaceImport = 31, RULE_ruleFilterPackageMember = 32, 
		RULE_ruleMemberElement = 33, RULE_ruleNonFeatureElement = 34, RULE_ruleFeatureElement = 35, 
		RULE_rulePackage = 36, RULE_ruleLibraryPackage = 37, RULE_rulePackageDeclaration = 38, 
		RULE_rulePackageBody = 39, RULE_ruleElementFilterMember = 40, RULE_ruleTypePrefix = 41, 
		RULE_ruleType = 42, RULE_ruleTypeDeclaration = 43, RULE_ruleSpecializationPart = 44, 
		RULE_ruleConjugationPart = 45, RULE_ruleTypeRelationshipPart = 46, RULE_ruleDisjoiningPart = 47, 
		RULE_ruleUnioningPart = 48, RULE_ruleIntersectingPart = 49, RULE_ruleDifferencingPart = 50, 
		RULE_ruleTypeBody = 51, RULE_ruleFeatureMember = 52, RULE_ruleTypeFeatureMember = 53, 
		RULE_ruleOwnedFeatureMember = 54, RULE_ruleSpecialization = 55, RULE_ruleOwnedSpecialization = 56, 
		RULE_ruleConjugation = 57, RULE_ruleOwnedConjugation = 58, RULE_ruleDisjoining = 59, 
		RULE_ruleOwnedDisjoining = 60, RULE_ruleUnioning = 61, RULE_ruleIntersecting = 62, 
		RULE_ruleDifferencing = 63, RULE_ruleClassifier = 64, RULE_ruleClassifierDeclaration = 65, 
		RULE_ruleSuperclassingPart = 66, RULE_ruleClassifierConjugationPart = 67, 
		RULE_ruleSubclassification = 68, RULE_ruleOwnedsubclassification = 69, 
		RULE_ruleClassifierConjugation = 70, RULE_ruleFeaturePrefix = 71, RULE_ruleFeature = 72, 
		RULE_ruleFeatureDeclaration = 73, RULE_ruleFeatureRelationshipPart = 74, 
		RULE_ruleChainingPart = 75, RULE_ruleInvertingPart = 76, RULE_ruleTypeFeaturingPart = 77, 
		RULE_ruleFeatureSpecializationPart = 78, RULE_ruleMultiplicityPart = 79, 
		RULE_ruleFeatureSpecialization = 80, RULE_ruleTypings = 81, RULE_ruleTypedBy = 82, 
		RULE_ruleSubsettings = 83, RULE_ruleSubsets = 84, RULE_ruleReferences = 85, 
		RULE_ruleReferencesKeyword = 86, RULE_ruleRedefinitions = 87, RULE_ruleRedefines = 88, 
		RULE_ruleFeatureInverting = 89, RULE_ruleOwnedFeatureInverting = 90, RULE_ruleTypeFeaturing = 91, 
		RULE_ruleOwnedTypeFeaturing = 92, RULE_ruleFeatureTyping = 93, RULE_ruleOwnedFeatureTyping = 94, 
		RULE_ruleFeatureType = 95, RULE_ruleSubsetting = 96, RULE_ruleOwnedSubsetting = 97, 
		RULE_ruleOwnedReferenceSubsetting = 98, RULE_ruleRedefinition = 99, RULE_ruleOwnedRedefinition = 100, 
		RULE_ruleFeatureConjugationPart = 101, RULE_ruleFeatureConjugation = 102, 
		RULE_ruleValuePart = 103, RULE_ruleFeatureValue = 104, RULE_ruleMultiplicity = 105, 
		RULE_ruleMultiplicitySubset = 106, RULE_ruleMultiplicityRange = 107, RULE_ruleOwnedMultiplicity = 108, 
		RULE_ruleOwnedMultiplicityRange = 109, RULE_ruleMultiplicityBounds = 110, 
		RULE_ruleMultiplicityExpressionMember = 111, RULE_ruleDataType = 112, 
		RULE_ruleClass = 113, RULE_ruleStructure = 114, RULE_ruleAssociation = 115, 
		RULE_ruleAssociationStructure = 116, RULE_ruleConnector = 117, RULE_ruleConnectorDeclaration = 118, 
		RULE_ruleBinaryConnectorDeclaration = 119, RULE_ruleNaryConnectorDeclaration = 120, 
		RULE_ruleConnectorEndMember = 121, RULE_ruleConnectorEnd = 122, RULE_ruleBindingConnector = 123, 
		RULE_ruleBindingConnectorDeclaration = 124, RULE_ruleSuccession = 125, 
		RULE_ruleSuccessionDeclaration = 126, RULE_ruleBehavior = 127, RULE_ruleStep = 128, 
		RULE_ruleStepDeclaration = 129, RULE_ruleFunction = 130, RULE_ruleFunctionBody = 131, 
		RULE_ruleFunctionBodyPart = 132, RULE_ruleReturnFeatureMember = 133, RULE_ruleResultExpressionMember = 134, 
		RULE_ruleExpression = 135, RULE_ruleExpressionDeclaration = 136, RULE_rulePredicate = 137, 
		RULE_ruleBooleanExpression = 138, RULE_ruleInvariant = 139, RULE_ruleInteraction = 140, 
		RULE_ruleItemFlow = 141, RULE_ruleSuccessionItemFlow = 142, RULE_ruleItemFlowDeclaration = 143, 
		RULE_ruleItemFeatureMember = 144, RULE_ruleItemFeature = 145, RULE_ruleItemFeatureSpecializationPart = 146, 
		RULE_ruleItemFlowEndMember = 147, RULE_ruleItemFlowEnd = 148, RULE_ruleItemFlowEndSubsetting = 149, 
		RULE_ruleFeatureChainPrefix = 150, RULE_ruleItemFlowFeatureMember = 151, 
		RULE_ruleItemFlowFeature = 152, RULE_ruleItemFlowRedefinition = 153, RULE_ruleMetaclass = 154, 
		RULE_rulePrefixMetadataAnnotation = 155, RULE_rulePrefixMetadataMember = 156, 
		RULE_rulePrefixMetadataFeature = 157, RULE_ruleMetadataFeature = 158, 
		RULE_ruleMetadataFeatureDeclaration = 159, RULE_ruleMetadataTyping = 160, 
		RULE_ruleMetadataBody = 161, RULE_ruleMetadataBodyFeatureMember = 162, 
		RULE_ruleMetadataBodyFeature = 163, RULE_ruleExpressionBody = 164, RULE_ruleOwnedExpressionMember = 165, 
		RULE_ruleOwnedExpression = 166, RULE_ruleOwnedExpressionReference = 167, 
		RULE_ruleConditionalExpression = 168, RULE_ruleConditionalOperator = 169, 
		RULE_ruleNullCoalescingExpression = 170, RULE_ruleNullCoalescingOperator = 171, 
		RULE_ruleImpliesExpressionReference = 172, RULE_ruleImpliesExpressionMember = 173, 
		RULE_ruleImpliesExpression = 174, RULE_ruleImpliesOperator = 175, RULE_ruleOrExpressionReference = 176, 
		RULE_ruleOrExpressionMember = 177, RULE_ruleOrExpression = 178, RULE_ruleOrOperator = 179, 
		RULE_ruleConditionalOrOperator = 180, RULE_ruleXorExpressionReference = 181, 
		RULE_ruleXorExpressionMember = 182, RULE_ruleXorExpression = 183, RULE_ruleXorOperator = 184, 
		RULE_ruleAndExpression = 185, RULE_ruleAndOperator = 186, RULE_ruleConditionalAndOperator = 187, 
		RULE_ruleEqualityExpressionReference = 188, RULE_ruleEqualityExpressionMember = 189, 
		RULE_ruleEqualityExpression = 190, RULE_ruleEqualityOperator = 191, RULE_ruleClassificationExpression = 192, 
		RULE_ruleClassificationTestOperator = 193, RULE_ruleMetaClassificationTestOperator = 194, 
		RULE_ruleCastOperator = 195, RULE_ruleMetaCastOperator = 196, RULE_ruleMetadataReference = 197, 
		RULE_ruleTypeReferenceMember = 198, RULE_ruleTypeResultMember = 199, RULE_ruleTypeReference = 200, 
		RULE_ruleReferenceTyping = 201, RULE_ruleSelfReferenceExpression = 202, 
		RULE_ruleSelfReferenceMember = 203, RULE_ruleEmptyFeature = 204, RULE_ruleRelationalExpression = 205, 
		RULE_ruleRelationalOperator = 206, RULE_ruleRangeExpression = 207, RULE_ruleAdditiveExpression = 208, 
		RULE_ruleAdditiveOperator = 209, RULE_ruleMultiplicativeExpression = 210, 
		RULE_ruleMultiplicativeOperator = 211, RULE_ruleExponentiationExpression = 212, 
		RULE_ruleExponentiationOperator = 213, RULE_ruleUnaryExpression = 214, 
		RULE_ruleUnaryOperator = 215, RULE_ruleExtentExpression = 216, RULE_rulePrimaryExpression = 217, 
		RULE_ruleFunctionReferenceExpression = 218, RULE_ruleFunctionReferenceMember = 219, 
		RULE_ruleFunctionReference = 220, RULE_ruleFeatureChainMember = 221, RULE_ruleBaseExpression = 222, 
		RULE_ruleBodyExpression = 223, RULE_ruleExpressionBodyMember = 224, RULE_ruleBodyParameter = 225, 
		RULE_ruleSequenceExpression = 226, RULE_ruleFeatureReferenceExpression = 227, 
		RULE_ruleFeatureReferenceMember = 228, RULE_ruleMetadataAccessExpression = 229, 
		RULE_ruleInvocationExpression = 230, RULE_ruleOwnedFeatureChain = 231, 
		RULE_ruleFeatureChain = 232, RULE_ruleOwnedFeatureChaining = 233, RULE_ruleArgumentList = 234, 
		RULE_rulePositionalArgumentList = 235, RULE_ruleArgumentMember = 236, 
		RULE_ruleArgument = 237, RULE_ruleNamedArgumentList = 238, RULE_ruleNamedArgumentMember = 239, 
		RULE_ruleNamedArgument = 240, RULE_ruleParameterRedefinition = 241, RULE_ruleArgumentValue = 242, 
		RULE_ruleNullExpression = 243, RULE_ruleLiteralExpression = 244, RULE_ruleLiteralBoolean = 245, 
		RULE_ruleBooleanValue = 246, RULE_ruleLiteralString = 247, RULE_ruleLiteralInteger = 248, 
		RULE_ruleLiteralReal = 249, RULE_ruleRealValue = 250, RULE_ruleLiteralInfinity = 251, 
		RULE_ruleName = 252, RULE_ruleQualification = 253, RULE_ruleQualifiedName = 254, 
		RULE_ruleFilterPackageMemberVisibility = 255, RULE_ruleVisibilityIndicator = 256, 
		RULE_ruleFeatureDirection = 257;
	private static String[] makeRuleNames() {
		return new String[] {
			"entryRuleRootNamespace", "ruleRootNamespace", "ruleIdentification", 
			"ruleRelationshipBody", "ruleRelationshipOwnedElement", "ruleOwnedRelatedElement", 
			"ruleDependency", "ruleAnnotation", "ruleOwnedAnnotation", "ruleAnnotatingElement", 
			"ruleComment", "ruleDocumentation", "ruleTextualRepresentation", "ruleNamespace", 
			"ruleNamespaceDeclaration", "ruleNamespaceBody", "ruleNamespaceBodyElement", 
			"ruleMemberPrefix", "ruleNamespaceMember", "ruleNonFeatureMember", "ruleNamespaceFeatureMember", 
			"ruleAliasMember", "ruleImportPrefix", "ruleImport", "ruleMembershipImport", 
			"ruleImportedMembership", "ruleNamespaceImport", "ruleImportedNamespace", 
			"ruleFilterPackage", "ruleFilterPackageImport", "ruleFilterPackageMembershipImport", 
			"ruleFilterPackageNamespaceImport", "ruleFilterPackageMember", "ruleMemberElement", 
			"ruleNonFeatureElement", "ruleFeatureElement", "rulePackage", "ruleLibraryPackage", 
			"rulePackageDeclaration", "rulePackageBody", "ruleElementFilterMember", 
			"ruleTypePrefix", "ruleType", "ruleTypeDeclaration", "ruleSpecializationPart", 
			"ruleConjugationPart", "ruleTypeRelationshipPart", "ruleDisjoiningPart", 
			"ruleUnioningPart", "ruleIntersectingPart", "ruleDifferencingPart", "ruleTypeBody", 
			"ruleFeatureMember", "ruleTypeFeatureMember", "ruleOwnedFeatureMember", 
			"ruleSpecialization", "ruleOwnedSpecialization", "ruleConjugation", "ruleOwnedConjugation", 
			"ruleDisjoining", "ruleOwnedDisjoining", "ruleUnioning", "ruleIntersecting", 
			"ruleDifferencing", "ruleClassifier", "ruleClassifierDeclaration", "ruleSuperclassingPart", 
			"ruleClassifierConjugationPart", "ruleSubclassification", "ruleOwnedsubclassification", 
			"ruleClassifierConjugation", "ruleFeaturePrefix", "ruleFeature", "ruleFeatureDeclaration", 
			"ruleFeatureRelationshipPart", "ruleChainingPart", "ruleInvertingPart", 
			"ruleTypeFeaturingPart", "ruleFeatureSpecializationPart", "ruleMultiplicityPart", 
			"ruleFeatureSpecialization", "ruleTypings", "ruleTypedBy", "ruleSubsettings", 
			"ruleSubsets", "ruleReferences", "ruleReferencesKeyword", "ruleRedefinitions", 
			"ruleRedefines", "ruleFeatureInverting", "ruleOwnedFeatureInverting", 
			"ruleTypeFeaturing", "ruleOwnedTypeFeaturing", "ruleFeatureTyping", "ruleOwnedFeatureTyping", 
			"ruleFeatureType", "ruleSubsetting", "ruleOwnedSubsetting", "ruleOwnedReferenceSubsetting", 
			"ruleRedefinition", "ruleOwnedRedefinition", "ruleFeatureConjugationPart", 
			"ruleFeatureConjugation", "ruleValuePart", "ruleFeatureValue", "ruleMultiplicity", 
			"ruleMultiplicitySubset", "ruleMultiplicityRange", "ruleOwnedMultiplicity", 
			"ruleOwnedMultiplicityRange", "ruleMultiplicityBounds", "ruleMultiplicityExpressionMember", 
			"ruleDataType", "ruleClass", "ruleStructure", "ruleAssociation", "ruleAssociationStructure", 
			"ruleConnector", "ruleConnectorDeclaration", "ruleBinaryConnectorDeclaration", 
			"ruleNaryConnectorDeclaration", "ruleConnectorEndMember", "ruleConnectorEnd", 
			"ruleBindingConnector", "ruleBindingConnectorDeclaration", "ruleSuccession", 
			"ruleSuccessionDeclaration", "ruleBehavior", "ruleStep", "ruleStepDeclaration", 
			"ruleFunction", "ruleFunctionBody", "ruleFunctionBodyPart", "ruleReturnFeatureMember", 
			"ruleResultExpressionMember", "ruleExpression", "ruleExpressionDeclaration", 
			"rulePredicate", "ruleBooleanExpression", "ruleInvariant", "ruleInteraction", 
			"ruleItemFlow", "ruleSuccessionItemFlow", "ruleItemFlowDeclaration", 
			"ruleItemFeatureMember", "ruleItemFeature", "ruleItemFeatureSpecializationPart", 
			"ruleItemFlowEndMember", "ruleItemFlowEnd", "ruleItemFlowEndSubsetting", 
			"ruleFeatureChainPrefix", "ruleItemFlowFeatureMember", "ruleItemFlowFeature", 
			"ruleItemFlowRedefinition", "ruleMetaclass", "rulePrefixMetadataAnnotation", 
			"rulePrefixMetadataMember", "rulePrefixMetadataFeature", "ruleMetadataFeature", 
			"ruleMetadataFeatureDeclaration", "ruleMetadataTyping", "ruleMetadataBody", 
			"ruleMetadataBodyFeatureMember", "ruleMetadataBodyFeature", "ruleExpressionBody", 
			"ruleOwnedExpressionMember", "ruleOwnedExpression", "ruleOwnedExpressionReference", 
			"ruleConditionalExpression", "ruleConditionalOperator", "ruleNullCoalescingExpression", 
			"ruleNullCoalescingOperator", "ruleImpliesExpressionReference", "ruleImpliesExpressionMember", 
			"ruleImpliesExpression", "ruleImpliesOperator", "ruleOrExpressionReference", 
			"ruleOrExpressionMember", "ruleOrExpression", "ruleOrOperator", "ruleConditionalOrOperator", 
			"ruleXorExpressionReference", "ruleXorExpressionMember", "ruleXorExpression", 
			"ruleXorOperator", "ruleAndExpression", "ruleAndOperator", "ruleConditionalAndOperator", 
			"ruleEqualityExpressionReference", "ruleEqualityExpressionMember", "ruleEqualityExpression", 
			"ruleEqualityOperator", "ruleClassificationExpression", "ruleClassificationTestOperator", 
			"ruleMetaClassificationTestOperator", "ruleCastOperator", "ruleMetaCastOperator", 
			"ruleMetadataReference", "ruleTypeReferenceMember", "ruleTypeResultMember", 
			"ruleTypeReference", "ruleReferenceTyping", "ruleSelfReferenceExpression", 
			"ruleSelfReferenceMember", "ruleEmptyFeature", "ruleRelationalExpression", 
			"ruleRelationalOperator", "ruleRangeExpression", "ruleAdditiveExpression", 
			"ruleAdditiveOperator", "ruleMultiplicativeExpression", "ruleMultiplicativeOperator", 
			"ruleExponentiationExpression", "ruleExponentiationOperator", "ruleUnaryExpression", 
			"ruleUnaryOperator", "ruleExtentExpression", "rulePrimaryExpression", 
			"ruleFunctionReferenceExpression", "ruleFunctionReferenceMember", "ruleFunctionReference", 
			"ruleFeatureChainMember", "ruleBaseExpression", "ruleBodyExpression", 
			"ruleExpressionBodyMember", "ruleBodyParameter", "ruleSequenceExpression", 
			"ruleFeatureReferenceExpression", "ruleFeatureReferenceMember", "ruleMetadataAccessExpression", 
			"ruleInvocationExpression", "ruleOwnedFeatureChain", "ruleFeatureChain", 
			"ruleOwnedFeatureChaining", "ruleArgumentList", "rulePositionalArgumentList", 
			"ruleArgumentMember", "ruleArgument", "ruleNamedArgumentList", "ruleNamedArgumentMember", 
			"ruleNamedArgument", "ruleParameterRedefinition", "ruleArgumentValue", 
			"ruleNullExpression", "ruleLiteralExpression", "ruleLiteralBoolean", 
			"ruleBooleanValue", "ruleLiteralString", "ruleLiteralInteger", "ruleLiteralReal", 
			"ruleRealValue", "ruleLiteralInfinity", "ruleName", "ruleQualification", 
			"ruleQualifiedName", "ruleFilterPackageMemberVisibility", "ruleVisibilityIndicator", 
			"ruleFeatureDirection"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'dependency'", "'from'", "'to'", "'comment'", "'about'", "'locale'", 
			"'doc'", "'rep'", "'language'", "'namespace'", "'alias'", "'for'", "'import'", 
			"'all'", "'standard'", "'library'", "'package'", "'filter'", "'abstract'", 
			"'type'", "'specializes'", "'conjugates'", "'disjoint'", "'unions'", 
			"'intersects'", "'differences'", "'member'", "'specialization'", "'subtype'", 
			"'conjugation'", "'conjugate'", "'disjoining'", "'classifier'", "'subclassifier'", 
			"'composite'", "'portion'", "'readonly'", "'derived'", "'end'", "'feature'", 
			"'chains'", "'inverse'", "'of'", "'featured'", "'by'", "'ordered'", "'nonunique'", 
			"'typed'", "'subsets'", "'references'", "'redefines'", "'inverting'", 
			"'featuring'", "'typing'", "'subset'", "'redefinition'", "'default'", 
			"'multiplicity'", "'datatype'", "'class'", "'struct'", "'assoc'", "'connector'", 
			"'binding'", "'succession'", "'first'", "'then'", "'behavior'", "'step'", 
			"'function'", "'return'", "'expr'", "'predicate'", "'bool'", "'inv'", 
			"'true'", "'false'", "'interaction'", "'flow'", "'metaclass'", "'metadata'", 
			"'else'", "'if'", "'implies'", "'or'", "'xor'", "'and'", "'hastype'", 
			"'istype'", "'as'", "'meta'", "'not'", "'null'", "'public'", "'private'", 
			"'protected'", "'in'", "'out'", "'inout'", "'<'", "'>'", "'{'", "'}'", 
			"']'", "'['", "'('", "')'", "';'", "','", "'::'", "'**'", "'*'", "':>'", 
			"'~'", "':'", "'::>'", "':>>'", "'='", "':='", "'..'", "'.'", "'#'", 
			"'@'", "'?'", "'??'", "'|'", "'&'", "'=='", "'!='", "'==='", "'!=='", 
			"'@@'", "'<='", "'>='", "'+'", "'-'", "'/'", "'%'", "'^'", "'->'", "'.?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "K_DEPENDENCY", "K_FROM", "K_TO", "K_COMMENT", "K_ABOUT", "K_LOCALE", 
			"K_DOC", "K_REP", "K_LANGUAGE", "K_NAMESPACE", "K_ALIAS", "K_FOR", "K_IMPORT", 
			"K_ALL", "K_STANDARD", "K_LIBRARY", "K_PACKAGE", "K_FILTER", "K_ABSTRACT", 
			"K_TYPE", "K_SPECIALIZES", "K_CONJUGATES", "K_DISJOINT", "K_UNIONS", 
			"K_INTERSECTS", "K_DIFFERENCES", "K_MEMBER", "K_SPECIALIZATION", "K_SUBTYPE", 
			"K_CONJUGATION", "K_CONJUGATE", "K_DISJOINING", "K_CLASSIFIER", "K_SUBCLASSIFIER", 
			"K_COMPOSITE", "K_PORTION", "K_READONLY", "K_DERIVED", "K_END", "K_FEATURE", 
			"K_CHAINS", "K_INVERSE", "K_OF", "K_FEATURED", "K_BY", "K_ORDERED", "K_NONUNIQUE", 
			"K_TYPED", "K_SUBSETS", "K_REFERENCES", "K_REDEFINES", "K_INVERTING", 
			"K_FEATURING", "K_TYPING", "K_SUBSET", "K_REDEFINITION", "K_DEFAULT", 
			"K_MULTIPLICITY", "K_DATATYPE", "K_CLASS", "K_STRUCT", "K_ASSOC", "K_CONNECTOR", 
			"K_BINDING", "K_SUCCESSION", "K_FIRST", "K_THEN", "K_BEHAVIOR", "K_STEP", 
			"K_FUNCTION", "K_RETURN", "K_EXPR", "K_PREDICATE", "K_BOOL", "K_INV", 
			"K_TRUE", "K_FALSE", "K_INTERACTION", "K_FLOW", "K_METACLASS", "K_METADATA", 
			"K_ELSE", "K_IF", "K_IMPLIES", "K_OR", "K_XOR", "K_AND", "K_HASTYPE", 
			"K_ISTYPE", "K_AS", "K_META", "K_NOT", "K_NULL", "K_PUBLIC", "K_PRIVATE", 
			"K_PROTECTED", "K_IN", "K_OUT", "K_INOUT", "LANGLE", "RANGLE", "LBRACE", 
			"RBRACE", "RSQUARE", "LSQUARE", "LPAREN", "RPAREN", "OP_SEMI", "OP_COMMA", 
			"OP_COLON_COLON", "OP_STAR_STAR", "OP_STAR", "OP_COLON_RANGLE", "OP_TILDE", 
			"OP_COLON", "OP_COLON_COLON_RANGLE", "OP_COLON_RANGLE_RANGLE", "OP_EQ", 
			"OP_COLON_EQ", "OP_DOT_DOT", "OP_DOT", "OP_HASH", "OP_AT", "OP_QMARK", 
			"OP_QMARK_QMARK", "OP_BAR", "OP_AND", "OP_EQ_EQ", "OP_BANG_EQ", "OP_EQ_EQ_EQ", 
			"OP_BANG_EQ_EQ", "OP_AT_AT", "OP_LANGLE_EQ", "OP_RANGLE_EQ", "OP_PLUS", 
			"OP_MINUS", "OP_SLASH", "OP_PERCENT", "OP_HAT", "OP_MINUS_RANGLE", "OP_DOT_QMARK", 
			"RULE_DECIMAL_VALUE", "RULE_EXP_VALUE", "RULE_ID", "RULE_UNRESTRICTED_NAME", 
			"RULE_STRING_VALUE", "RULE_REGULAR_COMMENT", "RULE_ML_NOTE", "RULE_SL_NOTE", 
			"RULE_WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "KerMLv2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  public static boolean isKeyword(int tokenType) {
	    switch (tokenType) {
	      case KerMLv2Lexer.K_DEPENDENCY:
	      case KerMLv2Lexer.K_FROM:
	      case KerMLv2Lexer.K_TO:
	      case KerMLv2Lexer.K_COMMENT:
	      case KerMLv2Lexer.K_ABOUT:
	      case KerMLv2Lexer.K_LOCALE:
	      case KerMLv2Lexer.K_DOC:
	      case KerMLv2Lexer.K_REP:
	      case KerMLv2Lexer.K_LANGUAGE:
	      case KerMLv2Lexer.K_NAMESPACE:
	      case KerMLv2Lexer.K_ALIAS:
	      case KerMLv2Lexer.K_FOR:
	      case KerMLv2Lexer.K_IMPORT:
	      case KerMLv2Lexer.K_ALL:
	      case KerMLv2Lexer.K_STANDARD:
	      case KerMLv2Lexer.K_LIBRARY:
	      case KerMLv2Lexer.K_PACKAGE:
	      case KerMLv2Lexer.K_FILTER:
	      case KerMLv2Lexer.K_ABSTRACT:
	      case KerMLv2Lexer.K_TYPE:
	      case KerMLv2Lexer.K_SPECIALIZES:
	      case KerMLv2Lexer.K_CONJUGATES:
	      case KerMLv2Lexer.K_DISJOINT:
	      case KerMLv2Lexer.K_UNIONS:
	      case KerMLv2Lexer.K_INTERSECTS:
	      case KerMLv2Lexer.K_DIFFERENCES:
	      case KerMLv2Lexer.K_MEMBER:
	      case KerMLv2Lexer.K_SPECIALIZATION:
	      case KerMLv2Lexer.K_SUBTYPE:
	      case KerMLv2Lexer.K_CONJUGATION:
	      case KerMLv2Lexer.K_CONJUGATE:
	      case KerMLv2Lexer.K_DISJOINING:
	      case KerMLv2Lexer.K_CLASSIFIER:
	      case KerMLv2Lexer.K_SUBCLASSIFIER:
	      case KerMLv2Lexer.K_COMPOSITE:
	      case KerMLv2Lexer.K_PORTION:
	      case KerMLv2Lexer.K_READONLY:
	      case KerMLv2Lexer.K_DERIVED:
	      case KerMLv2Lexer.K_END:
	      case KerMLv2Lexer.K_FEATURE:
	      case KerMLv2Lexer.K_CHAINS:
	      case KerMLv2Lexer.K_INVERSE:
	      case KerMLv2Lexer.K_OF:
	      case KerMLv2Lexer.K_FEATURED:
	      case KerMLv2Lexer.K_BY:
	      case KerMLv2Lexer.K_ORDERED:
	      case KerMLv2Lexer.K_NONUNIQUE:
	      case KerMLv2Lexer.K_TYPED:
	      case KerMLv2Lexer.K_SUBSETS:
	      case KerMLv2Lexer.K_REFERENCES:
	      case KerMLv2Lexer.K_REDEFINES:
	      case KerMLv2Lexer.K_INVERTING:
	      case KerMLv2Lexer.K_FEATURING:
	      case KerMLv2Lexer.K_TYPING:
	      case KerMLv2Lexer.K_SUBSET:
	      case KerMLv2Lexer.K_REDEFINITION:
	      case KerMLv2Lexer.K_DEFAULT:
	      case KerMLv2Lexer.K_MULTIPLICITY:
	      case KerMLv2Lexer.K_DATATYPE:
	      case KerMLv2Lexer.K_CLASS:
	      case KerMLv2Lexer.K_STRUCT:
	      case KerMLv2Lexer.K_ASSOC:
	      case KerMLv2Lexer.K_CONNECTOR:
	      case KerMLv2Lexer.K_BINDING:
	      case KerMLv2Lexer.K_SUCCESSION:
	      case KerMLv2Lexer.K_FIRST:
	      case KerMLv2Lexer.K_THEN:
	      case KerMLv2Lexer.K_BEHAVIOR:
	      case KerMLv2Lexer.K_STEP:
	      case KerMLv2Lexer.K_FUNCTION:
	      case KerMLv2Lexer.K_RETURN:
	      case KerMLv2Lexer.K_EXPR:
	      case KerMLv2Lexer.K_PREDICATE:
	      case KerMLv2Lexer.K_BOOL:
	      case KerMLv2Lexer.K_INV:
	      case KerMLv2Lexer.K_TRUE:
	      case KerMLv2Lexer.K_FALSE:
	      case KerMLv2Lexer.K_INTERACTION:
	      case KerMLv2Lexer.K_FLOW:
	      case KerMLv2Lexer.K_METACLASS:
	      case KerMLv2Lexer.K_METADATA:
	      case KerMLv2Lexer.K_ELSE:
	      case KerMLv2Lexer.K_IF:
	      case KerMLv2Lexer.K_IMPLIES:
	      case KerMLv2Lexer.K_OR:
	      case KerMLv2Lexer.K_XOR:
	      case KerMLv2Lexer.K_AND:
	      case KerMLv2Lexer.K_HASTYPE:
	      case KerMLv2Lexer.K_ISTYPE:
	      case KerMLv2Lexer.K_AS:
	      case KerMLv2Lexer.K_META:
	      case KerMLv2Lexer.K_NOT:
	      case KerMLv2Lexer.K_NULL:
	      case KerMLv2Lexer.K_PUBLIC:
	      case KerMLv2Lexer.K_PRIVATE:
	      case KerMLv2Lexer.K_PROTECTED:
	      case KerMLv2Lexer.K_IN:
	      case KerMLv2Lexer.K_OUT:
	      case KerMLv2Lexer.K_INOUT:
	        return true;
	      default: return false;
	    }
	  }

	public KerMLv2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EntryRuleRootNamespaceContext extends ParserRuleContext {
		public RuleRootNamespaceContext ruleRootNamespace() {
			return getRuleContext(RuleRootNamespaceContext.class,0);
		}
		public TerminalNode EOF() { return getToken(KerMLv2Parser.EOF, 0); }
		public EntryRuleRootNamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entryRuleRootNamespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterEntryRuleRootNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitEntryRuleRootNamespace(this);
		}
	}

	public final EntryRuleRootNamespaceContext entryRuleRootNamespace() throws RecognitionException {
		EntryRuleRootNamespaceContext _localctx = new EntryRuleRootNamespaceContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_entryRuleRootNamespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			ruleRootNamespace();
			setState(517);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleRootNamespaceContext extends ParserRuleContext {
		public List<RuleNamespaceBodyElementContext> ruleNamespaceBodyElement() {
			return getRuleContexts(RuleNamespaceBodyElementContext.class);
		}
		public RuleNamespaceBodyElementContext ruleNamespaceBodyElement(int i) {
			return getRuleContext(RuleNamespaceBodyElementContext.class,i);
		}
		public RuleRootNamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleRootNamespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleRootNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleRootNamespace(this);
		}
	}

	public final RuleRootNamespaceContext ruleRootNamespace() throws RecognitionException {
		RuleRootNamespaceContext _localctx = new RuleRootNamespaceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ruleRootNamespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -144178960004288558L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 882144912399912819L) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & 11L) != 0)) {
				{
				{
				setState(519);
				ruleNamespaceBodyElement();
				}
				}
				setState(524);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleIdentificationContext extends ParserRuleContext {
		public RuleIdentificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleIdentification; }
	 
		public RuleIdentificationContext() { }
		public void copyFrom(RuleIdentificationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleIdentification2Context extends RuleIdentificationContext {
		public RuleNameContext ruleName() {
			return getRuleContext(RuleNameContext.class,0);
		}
		public RuleIdentification2Context(RuleIdentificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleIdentification2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleIdentification2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleIdentification1Context extends RuleIdentificationContext {
		public TerminalNode LANGLE() { return getToken(KerMLv2Parser.LANGLE, 0); }
		public List<RuleNameContext> ruleName() {
			return getRuleContexts(RuleNameContext.class);
		}
		public RuleNameContext ruleName(int i) {
			return getRuleContext(RuleNameContext.class,i);
		}
		public TerminalNode RANGLE() { return getToken(KerMLv2Parser.RANGLE, 0); }
		public RuleIdentification1Context(RuleIdentificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleIdentification1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleIdentification1(this);
		}
	}

	public final RuleIdentificationContext ruleIdentification() throws RecognitionException {
		RuleIdentificationContext _localctx = new RuleIdentificationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ruleIdentification);
		int _la;
		try {
			setState(532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LANGLE:
				_localctx = new RuleIdentification1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				match(LANGLE);
				setState(526);
				ruleName();
				setState(527);
				match(RANGLE);
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RULE_ID || _la==RULE_UNRESTRICTED_NAME) {
					{
					setState(528);
					ruleName();
					}
				}

				}
				break;
			case RULE_ID:
			case RULE_UNRESTRICTED_NAME:
				_localctx = new RuleIdentification2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				ruleName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleRelationshipBodyContext extends ParserRuleContext {
		public RuleRelationshipBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleRelationshipBody; }
	 
		public RuleRelationshipBodyContext() { }
		public void copyFrom(RuleRelationshipBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleRelationshipBody1Context extends RuleRelationshipBodyContext {
		public TerminalNode OP_SEMI() { return getToken(KerMLv2Parser.OP_SEMI, 0); }
		public RuleRelationshipBody1Context(RuleRelationshipBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleRelationshipBody1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleRelationshipBody1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleRelationshipBody2Context extends RuleRelationshipBodyContext {
		public TerminalNode LBRACE() { return getToken(KerMLv2Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(KerMLv2Parser.RBRACE, 0); }
		public List<RuleRelationshipOwnedElementContext> ruleRelationshipOwnedElement() {
			return getRuleContexts(RuleRelationshipOwnedElementContext.class);
		}
		public RuleRelationshipOwnedElementContext ruleRelationshipOwnedElement(int i) {
			return getRuleContext(RuleRelationshipOwnedElementContext.class,i);
		}
		public RuleRelationshipBody2Context(RuleRelationshipBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleRelationshipBody2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleRelationshipBody2(this);
		}
	}

	public final RuleRelationshipBodyContext ruleRelationshipBody() throws RecognitionException {
		RuleRelationshipBodyContext _localctx = new RuleRelationshipBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ruleRelationshipBody);
		int _la;
		try {
			setState(543);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_SEMI:
				_localctx = new RuleRelationshipBody1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				match(OP_SEMI);
				}
				break;
			case LBRACE:
				_localctx = new RuleRelationshipBody2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
				match(LBRACE);
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -144178960004298798L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 882144904883720051L) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & 11L) != 0)) {
					{
					{
					setState(536);
					ruleRelationshipOwnedElement();
					}
					}
					setState(541);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(542);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleRelationshipOwnedElementContext extends ParserRuleContext {
		public RuleRelationshipOwnedElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleRelationshipOwnedElement; }
	 
		public RuleRelationshipOwnedElementContext() { }
		public void copyFrom(RuleRelationshipOwnedElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleRelationshipOwnedElement1Context extends RuleRelationshipOwnedElementContext {
		public RuleOwnedRelatedElementContext ruleOwnedRelatedElement() {
			return getRuleContext(RuleOwnedRelatedElementContext.class,0);
		}
		public RuleRelationshipOwnedElement1Context(RuleRelationshipOwnedElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleRelationshipOwnedElement1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleRelationshipOwnedElement1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleRelationshipOwnedElement2Context extends RuleRelationshipOwnedElementContext {
		public RuleOwnedAnnotationContext ruleOwnedAnnotation() {
			return getRuleContext(RuleOwnedAnnotationContext.class,0);
		}
		public RuleRelationshipOwnedElement2Context(RuleRelationshipOwnedElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleRelationshipOwnedElement2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleRelationshipOwnedElement2(this);
		}
	}

	public final RuleRelationshipOwnedElementContext ruleRelationshipOwnedElement() throws RecognitionException {
		RuleRelationshipOwnedElementContext _localctx = new RuleRelationshipOwnedElementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ruleRelationshipOwnedElement);
		try {
			setState(547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new RuleRelationshipOwnedElement1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				ruleOwnedRelatedElement();
				}
				break;
			case 2:
				_localctx = new RuleRelationshipOwnedElement2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				ruleOwnedAnnotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedRelatedElementContext extends ParserRuleContext {
		public RuleOwnedRelatedElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOwnedRelatedElement; }
	 
		public RuleOwnedRelatedElementContext() { }
		public void copyFrom(RuleOwnedRelatedElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedRelatedElement1Context extends RuleOwnedRelatedElementContext {
		public RuleNonFeatureElementContext ruleNonFeatureElement() {
			return getRuleContext(RuleNonFeatureElementContext.class,0);
		}
		public RuleOwnedRelatedElement1Context(RuleOwnedRelatedElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleOwnedRelatedElement1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleOwnedRelatedElement1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedRelatedElement2Context extends RuleOwnedRelatedElementContext {
		public RuleFeatureElementContext ruleFeatureElement() {
			return getRuleContext(RuleFeatureElementContext.class,0);
		}
		public RuleOwnedRelatedElement2Context(RuleOwnedRelatedElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleOwnedRelatedElement2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleOwnedRelatedElement2(this);
		}
	}

	public final RuleOwnedRelatedElementContext ruleOwnedRelatedElement() throws RecognitionException {
		RuleOwnedRelatedElementContext _localctx = new RuleOwnedRelatedElementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ruleOwnedRelatedElement);
		try {
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new RuleOwnedRelatedElement1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				ruleNonFeatureElement();
				}
				break;
			case 2:
				_localctx = new RuleOwnedRelatedElement2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				ruleFeatureElement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleDependencyContext extends ParserRuleContext {
		public TerminalNode K_DEPENDENCY() { return getToken(KerMLv2Parser.K_DEPENDENCY, 0); }
		public List<RuleQualifiedNameContext> ruleQualifiedName() {
			return getRuleContexts(RuleQualifiedNameContext.class);
		}
		public RuleQualifiedNameContext ruleQualifiedName(int i) {
			return getRuleContext(RuleQualifiedNameContext.class,i);
		}
		public TerminalNode K_TO() { return getToken(KerMLv2Parser.K_TO, 0); }
		public RuleRelationshipBodyContext ruleRelationshipBody() {
			return getRuleContext(RuleRelationshipBodyContext.class,0);
		}
		public List<RulePrefixMetadataAnnotationContext> rulePrefixMetadataAnnotation() {
			return getRuleContexts(RulePrefixMetadataAnnotationContext.class);
		}
		public RulePrefixMetadataAnnotationContext rulePrefixMetadataAnnotation(int i) {
			return getRuleContext(RulePrefixMetadataAnnotationContext.class,i);
		}
		public TerminalNode K_FROM() { return getToken(KerMLv2Parser.K_FROM, 0); }
		public List<TerminalNode> OP_COMMA() { return getTokens(KerMLv2Parser.OP_COMMA); }
		public TerminalNode OP_COMMA(int i) {
			return getToken(KerMLv2Parser.OP_COMMA, i);
		}
		public RuleIdentificationContext ruleIdentification() {
			return getRuleContext(RuleIdentificationContext.class,0);
		}
		public RuleDependencyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleDependency; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleDependency(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleDependency(this);
		}
	}

	public final RuleDependencyContext ruleDependency() throws RecognitionException {
		RuleDependencyContext _localctx = new RuleDependencyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ruleDependency);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_HASH) {
				{
				{
				setState(553);
				rulePrefixMetadataAnnotation();
				}
				}
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(559);
			match(K_DEPENDENCY);
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 52776558133249L) != 0)) {
					{
					setState(560);
					ruleIdentification();
					}
				}

				setState(563);
				match(K_FROM);
				}
				break;
			}
			setState(566);
			ruleQualifiedName();
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_COMMA) {
				{
				{
				setState(567);
				match(OP_COMMA);
				setState(568);
				ruleQualifiedName();
				}
				}
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(574);
			match(K_TO);
			setState(575);
			ruleQualifiedName();
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_COMMA) {
				{
				{
				setState(576);
				match(OP_COMMA);
				setState(577);
				ruleQualifiedName();
				}
				}
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(583);
			ruleRelationshipBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleAnnotationContext extends ParserRuleContext {
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleAnnotation(this);
		}
	}

	public final RuleAnnotationContext ruleAnnotation() throws RecognitionException {
		RuleAnnotationContext _localctx = new RuleAnnotationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ruleAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			ruleQualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedAnnotationContext extends ParserRuleContext {
		public RuleAnnotatingElementContext ruleAnnotatingElement() {
			return getRuleContext(RuleAnnotatingElementContext.class,0);
		}
		public RuleOwnedAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOwnedAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleOwnedAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleOwnedAnnotation(this);
		}
	}

	public final RuleOwnedAnnotationContext ruleOwnedAnnotation() throws RecognitionException {
		RuleOwnedAnnotationContext _localctx = new RuleOwnedAnnotationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ruleOwnedAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			ruleAnnotatingElement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleAnnotatingElementContext extends ParserRuleContext {
		public RuleAnnotatingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleAnnotatingElement; }
	 
		public RuleAnnotatingElementContext() { }
		public void copyFrom(RuleAnnotatingElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleAnnotatingElement1Context extends RuleAnnotatingElementContext {
		public RuleCommentContext ruleComment() {
			return getRuleContext(RuleCommentContext.class,0);
		}
		public RuleAnnotatingElement1Context(RuleAnnotatingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleAnnotatingElement1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleAnnotatingElement1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleAnnotatingElement2Context extends RuleAnnotatingElementContext {
		public RuleDocumentationContext ruleDocumentation() {
			return getRuleContext(RuleDocumentationContext.class,0);
		}
		public RuleAnnotatingElement2Context(RuleAnnotatingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleAnnotatingElement2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleAnnotatingElement2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleAnnotatingElement3Context extends RuleAnnotatingElementContext {
		public RuleTextualRepresentationContext ruleTextualRepresentation() {
			return getRuleContext(RuleTextualRepresentationContext.class,0);
		}
		public RuleAnnotatingElement3Context(RuleAnnotatingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleAnnotatingElement3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleAnnotatingElement3(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleAnnotatingElement4Context extends RuleAnnotatingElementContext {
		public RuleMetadataFeatureContext ruleMetadataFeature() {
			return getRuleContext(RuleMetadataFeatureContext.class,0);
		}
		public RuleAnnotatingElement4Context(RuleAnnotatingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleAnnotatingElement4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleAnnotatingElement4(this);
		}
	}

	public final RuleAnnotatingElementContext ruleAnnotatingElement() throws RecognitionException {
		RuleAnnotatingElementContext _localctx = new RuleAnnotatingElementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ruleAnnotatingElement);
		try {
			setState(593);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_COMMENT:
			case K_LOCALE:
			case RULE_REGULAR_COMMENT:
				_localctx = new RuleAnnotatingElement1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(589);
				ruleComment();
				}
				break;
			case K_DOC:
				_localctx = new RuleAnnotatingElement2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				ruleDocumentation();
				}
				break;
			case K_REP:
			case K_LANGUAGE:
				_localctx = new RuleAnnotatingElement3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(591);
				ruleTextualRepresentation();
				}
				break;
			case K_METADATA:
			case OP_HASH:
			case OP_AT:
				_localctx = new RuleAnnotatingElement4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(592);
				ruleMetadataFeature();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleCommentContext extends ParserRuleContext {
		public TerminalNode RULE_REGULAR_COMMENT() { return getToken(KerMLv2Parser.RULE_REGULAR_COMMENT, 0); }
		public TerminalNode K_COMMENT() { return getToken(KerMLv2Parser.K_COMMENT, 0); }
		public TerminalNode K_LOCALE() { return getToken(KerMLv2Parser.K_LOCALE, 0); }
		public TerminalNode RULE_STRING_VALUE() { return getToken(KerMLv2Parser.RULE_STRING_VALUE, 0); }
		public RuleIdentificationContext ruleIdentification() {
			return getRuleContext(RuleIdentificationContext.class,0);
		}
		public TerminalNode K_ABOUT() { return getToken(KerMLv2Parser.K_ABOUT, 0); }
		public List<RuleAnnotationContext> ruleAnnotation() {
			return getRuleContexts(RuleAnnotationContext.class);
		}
		public RuleAnnotationContext ruleAnnotation(int i) {
			return getRuleContext(RuleAnnotationContext.class,i);
		}
		public List<TerminalNode> OP_COMMA() { return getTokens(KerMLv2Parser.OP_COMMA); }
		public TerminalNode OP_COMMA(int i) {
			return getToken(KerMLv2Parser.OP_COMMA, i);
		}
		public RuleCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleComment(this);
		}
	}

	public final RuleCommentContext ruleComment() throws RecognitionException {
		RuleCommentContext _localctx = new RuleCommentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ruleComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COMMENT) {
				{
				setState(595);
				match(K_COMMENT);
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 52776558133249L) != 0)) {
					{
					setState(596);
					ruleIdentification();
					}
				}

				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ABOUT) {
					{
					setState(599);
					match(K_ABOUT);
					setState(600);
					ruleAnnotation();
					setState(605);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==OP_COMMA) {
						{
						{
						setState(601);
						match(OP_COMMA);
						setState(602);
						ruleAnnotation();
						}
						}
						setState(607);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
			}

			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LOCALE) {
				{
				setState(612);
				match(K_LOCALE);
				setState(613);
				match(RULE_STRING_VALUE);
				}
			}

			setState(616);
			match(RULE_REGULAR_COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleDocumentationContext extends ParserRuleContext {
		public TerminalNode K_DOC() { return getToken(KerMLv2Parser.K_DOC, 0); }
		public TerminalNode RULE_REGULAR_COMMENT() { return getToken(KerMLv2Parser.RULE_REGULAR_COMMENT, 0); }
		public RuleIdentificationContext ruleIdentification() {
			return getRuleContext(RuleIdentificationContext.class,0);
		}
		public TerminalNode K_LOCALE() { return getToken(KerMLv2Parser.K_LOCALE, 0); }
		public TerminalNode RULE_STRING_VALUE() { return getToken(KerMLv2Parser.RULE_STRING_VALUE, 0); }
		public RuleDocumentationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleDocumentation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleDocumentation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleDocumentation(this);
		}
	}

	public final RuleDocumentationContext ruleDocumentation() throws RecognitionException {
		RuleDocumentationContext _localctx = new RuleDocumentationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ruleDocumentation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			match(K_DOC);
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 52776558133249L) != 0)) {
				{
				setState(619);
				ruleIdentification();
				}
			}

			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LOCALE) {
				{
				setState(622);
				match(K_LOCALE);
				setState(623);
				match(RULE_STRING_VALUE);
				}
			}

			setState(626);
			match(RULE_REGULAR_COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleTextualRepresentationContext extends ParserRuleContext {
		public TerminalNode K_LANGUAGE() { return getToken(KerMLv2Parser.K_LANGUAGE, 0); }
		public TerminalNode RULE_STRING_VALUE() { return getToken(KerMLv2Parser.RULE_STRING_VALUE, 0); }
		public TerminalNode RULE_REGULAR_COMMENT() { return getToken(KerMLv2Parser.RULE_REGULAR_COMMENT, 0); }
		public TerminalNode K_REP() { return getToken(KerMLv2Parser.K_REP, 0); }
		public RuleIdentificationContext ruleIdentification() {
			return getRuleContext(RuleIdentificationContext.class,0);
		}
		public RuleTextualRepresentationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleTextualRepresentation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleTextualRepresentation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleTextualRepresentation(this);
		}
	}

	public final RuleTextualRepresentationContext ruleTextualRepresentation() throws RecognitionException {
		RuleTextualRepresentationContext _localctx = new RuleTextualRepresentationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ruleTextualRepresentation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_REP) {
				{
				setState(628);
				match(K_REP);
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 52776558133249L) != 0)) {
					{
					setState(629);
					ruleIdentification();
					}
				}

				}
			}

			setState(634);
			match(K_LANGUAGE);
			setState(635);
			match(RULE_STRING_VALUE);
			setState(636);
			match(RULE_REGULAR_COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleNamespaceContext extends ParserRuleContext {
		public RuleNamespaceDeclarationContext ruleNamespaceDeclaration() {
			return getRuleContext(RuleNamespaceDeclarationContext.class,0);
		}
		public RuleNamespaceBodyContext ruleNamespaceBody() {
			return getRuleContext(RuleNamespaceBodyContext.class,0);
		}
		public List<RulePrefixMetadataMemberContext> rulePrefixMetadataMember() {
			return getRuleContexts(RulePrefixMetadataMemberContext.class);
		}
		public RulePrefixMetadataMemberContext rulePrefixMetadataMember(int i) {
			return getRuleContext(RulePrefixMetadataMemberContext.class,i);
		}
		public RuleNamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleNamespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNamespace(this);
		}
	}

	public final RuleNamespaceContext ruleNamespace() throws RecognitionException {
		RuleNamespaceContext _localctx = new RuleNamespaceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ruleNamespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_HASH) {
				{
				{
				setState(638);
				rulePrefixMetadataMember();
				}
				}
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(644);
			ruleNamespaceDeclaration();
			setState(645);
			ruleNamespaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleNamespaceDeclarationContext extends ParserRuleContext {
		public TerminalNode K_NAMESPACE() { return getToken(KerMLv2Parser.K_NAMESPACE, 0); }
		public RuleIdentificationContext ruleIdentification() {
			return getRuleContext(RuleIdentificationContext.class,0);
		}
		public RuleNamespaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleNamespaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNamespaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNamespaceDeclaration(this);
		}
	}

	public final RuleNamespaceDeclarationContext ruleNamespaceDeclaration() throws RecognitionException {
		RuleNamespaceDeclarationContext _localctx = new RuleNamespaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ruleNamespaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(K_NAMESPACE);
			setState(649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 52776558133249L) != 0)) {
				{
				setState(648);
				ruleIdentification();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleNamespaceBodyContext extends ParserRuleContext {
		public RuleNamespaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleNamespaceBody; }
	 
		public RuleNamespaceBodyContext() { }
		public void copyFrom(RuleNamespaceBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNamespaceBody2Context extends RuleNamespaceBodyContext {
		public TerminalNode LBRACE() { return getToken(KerMLv2Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(KerMLv2Parser.RBRACE, 0); }
		public List<RuleNamespaceMemberContext> ruleNamespaceMember() {
			return getRuleContexts(RuleNamespaceMemberContext.class);
		}
		public RuleNamespaceMemberContext ruleNamespaceMember(int i) {
			return getRuleContext(RuleNamespaceMemberContext.class,i);
		}
		public List<RuleAliasMemberContext> ruleAliasMember() {
			return getRuleContexts(RuleAliasMemberContext.class);
		}
		public RuleAliasMemberContext ruleAliasMember(int i) {
			return getRuleContext(RuleAliasMemberContext.class,i);
		}
		public List<RuleImportContext> ruleImport() {
			return getRuleContexts(RuleImportContext.class);
		}
		public RuleImportContext ruleImport(int i) {
			return getRuleContext(RuleImportContext.class,i);
		}
		public RuleNamespaceBody2Context(RuleNamespaceBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNamespaceBody2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNamespaceBody2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNamespaceBody1Context extends RuleNamespaceBodyContext {
		public TerminalNode OP_SEMI() { return getToken(KerMLv2Parser.OP_SEMI, 0); }
		public RuleNamespaceBody1Context(RuleNamespaceBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNamespaceBody1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNamespaceBody1(this);
		}
	}

	public final RuleNamespaceBodyContext ruleNamespaceBody() throws RecognitionException {
		RuleNamespaceBodyContext _localctx = new RuleNamespaceBodyContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ruleNamespaceBody);
		int _la;
		try {
			setState(662);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_SEMI:
				_localctx = new RuleNamespaceBody1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(651);
				match(OP_SEMI);
				}
				break;
			case LBRACE:
				_localctx = new RuleNamespaceBody2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(652);
				match(LBRACE);
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -144178960004288558L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 882144912399912819L) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & 11L) != 0)) {
					{
					setState(656);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(653);
						ruleNamespaceMember();
						}
						break;
					case 2:
						{
						setState(654);
						ruleAliasMember();
						}
						break;
					case 3:
						{
						setState(655);
						ruleImport();
						}
						break;
					}
					}
					setState(660);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(661);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleNamespaceBodyElementContext extends ParserRuleContext {
		public RuleNamespaceBodyElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleNamespaceBodyElement; }
	 
		public RuleNamespaceBodyElementContext() { }
		public void copyFrom(RuleNamespaceBodyElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNamespaceBodyElement1Context extends RuleNamespaceBodyElementContext {
		public RuleNamespaceMemberContext ruleNamespaceMember() {
			return getRuleContext(RuleNamespaceMemberContext.class,0);
		}
		public RuleNamespaceBodyElement1Context(RuleNamespaceBodyElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNamespaceBodyElement1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNamespaceBodyElement1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNamespaceBodyElement2Context extends RuleNamespaceBodyElementContext {
		public RuleAliasMemberContext ruleAliasMember() {
			return getRuleContext(RuleAliasMemberContext.class,0);
		}
		public RuleNamespaceBodyElement2Context(RuleNamespaceBodyElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNamespaceBodyElement2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNamespaceBodyElement2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNamespaceBodyElement3Context extends RuleNamespaceBodyElementContext {
		public RuleImportContext ruleImport() {
			return getRuleContext(RuleImportContext.class,0);
		}
		public RuleNamespaceBodyElement3Context(RuleNamespaceBodyElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNamespaceBodyElement3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNamespaceBodyElement3(this);
		}
	}

	public final RuleNamespaceBodyElementContext ruleNamespaceBodyElement() throws RecognitionException {
		RuleNamespaceBodyElementContext _localctx = new RuleNamespaceBodyElementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ruleNamespaceBodyElement);
		try {
			setState(667);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new RuleNamespaceBodyElement1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				ruleNamespaceMember();
				}
				break;
			case 2:
				_localctx = new RuleNamespaceBodyElement2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(665);
				ruleAliasMember();
				}
				break;
			case 3:
				_localctx = new RuleNamespaceBodyElement3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(666);
				ruleImport();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleMemberPrefixContext extends ParserRuleContext {
		public RuleVisibilityIndicatorContext ruleVisibilityIndicator() {
			return getRuleContext(RuleVisibilityIndicatorContext.class,0);
		}
		public RuleMemberPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleMemberPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleMemberPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleMemberPrefix(this);
		}
	}

	public final RuleMemberPrefixContext ruleMemberPrefix() throws RecognitionException {
		RuleMemberPrefixContext _localctx = new RuleMemberPrefixContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ruleMemberPrefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & 7L) != 0)) {
				{
				setState(669);
				ruleVisibilityIndicator();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleNamespaceMemberContext extends ParserRuleContext {
		public RuleNamespaceMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleNamespaceMember; }
	 
		public RuleNamespaceMemberContext() { }
		public void copyFrom(RuleNamespaceMemberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNamespaceMember2Context extends RuleNamespaceMemberContext {
		public RuleNamespaceFeatureMemberContext ruleNamespaceFeatureMember() {
			return getRuleContext(RuleNamespaceFeatureMemberContext.class,0);
		}
		public RuleNamespaceMember2Context(RuleNamespaceMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNamespaceMember2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNamespaceMember2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNamespaceMember1Context extends RuleNamespaceMemberContext {
		public RuleNonFeatureMemberContext ruleNonFeatureMember() {
			return getRuleContext(RuleNonFeatureMemberContext.class,0);
		}
		public RuleNamespaceMember1Context(RuleNamespaceMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNamespaceMember1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNamespaceMember1(this);
		}
	}

	public final RuleNamespaceMemberContext ruleNamespaceMember() throws RecognitionException {
		RuleNamespaceMemberContext _localctx = new RuleNamespaceMemberContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ruleNamespaceMember);
		try {
			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new RuleNamespaceMember1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(672);
				ruleNonFeatureMember();
				}
				break;
			case 2:
				_localctx = new RuleNamespaceMember2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(673);
				ruleNamespaceFeatureMember();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleNonFeatureMemberContext extends ParserRuleContext {
		public RuleMemberPrefixContext ruleMemberPrefix() {
			return getRuleContext(RuleMemberPrefixContext.class,0);
		}
		public RuleMemberElementContext ruleMemberElement() {
			return getRuleContext(RuleMemberElementContext.class,0);
		}
		public RuleNonFeatureMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleNonFeatureMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNonFeatureMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNonFeatureMember(this);
		}
	}

	public final RuleNonFeatureMemberContext ruleNonFeatureMember() throws RecognitionException {
		RuleNonFeatureMemberContext _localctx = new RuleNonFeatureMemberContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ruleNonFeatureMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			ruleMemberPrefix();
			setState(677);
			ruleMemberElement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleNamespaceFeatureMemberContext extends ParserRuleContext {
		public RuleMemberPrefixContext ruleMemberPrefix() {
			return getRuleContext(RuleMemberPrefixContext.class,0);
		}
		public RuleFeatureElementContext ruleFeatureElement() {
			return getRuleContext(RuleFeatureElementContext.class,0);
		}
		public RuleNamespaceFeatureMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleNamespaceFeatureMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNamespaceFeatureMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNamespaceFeatureMember(this);
		}
	}

	public final RuleNamespaceFeatureMemberContext ruleNamespaceFeatureMember() throws RecognitionException {
		RuleNamespaceFeatureMemberContext _localctx = new RuleNamespaceFeatureMemberContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ruleNamespaceFeatureMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			ruleMemberPrefix();
			setState(680);
			ruleFeatureElement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleAliasMemberContext extends ParserRuleContext {
		public RuleMemberPrefixContext ruleMemberPrefix() {
			return getRuleContext(RuleMemberPrefixContext.class,0);
		}
		public TerminalNode K_ALIAS() { return getToken(KerMLv2Parser.K_ALIAS, 0); }
		public TerminalNode K_FOR() { return getToken(KerMLv2Parser.K_FOR, 0); }
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleRelationshipBodyContext ruleRelationshipBody() {
			return getRuleContext(RuleRelationshipBodyContext.class,0);
		}
		public TerminalNode LANGLE() { return getToken(KerMLv2Parser.LANGLE, 0); }
		public List<RuleNameContext> ruleName() {
			return getRuleContexts(RuleNameContext.class);
		}
		public RuleNameContext ruleName(int i) {
			return getRuleContext(RuleNameContext.class,i);
		}
		public TerminalNode RANGLE() { return getToken(KerMLv2Parser.RANGLE, 0); }
		public RuleAliasMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleAliasMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleAliasMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleAliasMember(this);
		}
	}

	public final RuleAliasMemberContext ruleAliasMember() throws RecognitionException {
		RuleAliasMemberContext _localctx = new RuleAliasMemberContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ruleAliasMember);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			ruleMemberPrefix();
			setState(683);
			match(K_ALIAS);
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LANGLE) {
				{
				setState(684);
				match(LANGLE);
				setState(685);
				ruleName();
				setState(686);
				match(RANGLE);
				}
			}

			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RULE_ID || _la==RULE_UNRESTRICTED_NAME) {
				{
				setState(690);
				ruleName();
				}
			}

			setState(693);
			match(K_FOR);
			setState(694);
			ruleQualifiedName();
			setState(695);
			ruleRelationshipBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleImportPrefixContext extends ParserRuleContext {
		public TerminalNode K_IMPORT() { return getToken(KerMLv2Parser.K_IMPORT, 0); }
		public RuleVisibilityIndicatorContext ruleVisibilityIndicator() {
			return getRuleContext(RuleVisibilityIndicatorContext.class,0);
		}
		public TerminalNode K_ALL() { return getToken(KerMLv2Parser.K_ALL, 0); }
		public RuleImportPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleImportPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleImportPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleImportPrefix(this);
		}
	}

	public final RuleImportPrefixContext ruleImportPrefix() throws RecognitionException {
		RuleImportPrefixContext _localctx = new RuleImportPrefixContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ruleImportPrefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & 7L) != 0)) {
				{
				setState(697);
				ruleVisibilityIndicator();
				}
			}

			setState(700);
			match(K_IMPORT);
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ALL) {
				{
				setState(701);
				match(K_ALL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleImportContext extends ParserRuleContext {
		public RuleRelationshipBodyContext ruleRelationshipBody() {
			return getRuleContext(RuleRelationshipBodyContext.class,0);
		}
		public RuleMembershipImportContext ruleMembershipImport() {
			return getRuleContext(RuleMembershipImportContext.class,0);
		}
		public RuleNamespaceImportContext ruleNamespaceImport() {
			return getRuleContext(RuleNamespaceImportContext.class,0);
		}
		public RuleImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleImport(this);
		}
	}

	public final RuleImportContext ruleImport() throws RecognitionException {
		RuleImportContext _localctx = new RuleImportContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ruleImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(704);
				ruleMembershipImport();
				}
				break;
			case 2:
				{
				setState(705);
				ruleNamespaceImport();
				}
				break;
			}
			setState(708);
			ruleRelationshipBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleMembershipImportContext extends ParserRuleContext {
		public RuleImportPrefixContext ruleImportPrefix() {
			return getRuleContext(RuleImportPrefixContext.class,0);
		}
		public RuleImportedMembershipContext ruleImportedMembership() {
			return getRuleContext(RuleImportedMembershipContext.class,0);
		}
		public RuleMembershipImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleMembershipImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleMembershipImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleMembershipImport(this);
		}
	}

	public final RuleMembershipImportContext ruleMembershipImport() throws RecognitionException {
		RuleMembershipImportContext _localctx = new RuleMembershipImportContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ruleMembershipImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			ruleImportPrefix();
			setState(711);
			ruleImportedMembership();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleImportedMembershipContext extends ParserRuleContext {
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public TerminalNode OP_COLON_COLON() { return getToken(KerMLv2Parser.OP_COLON_COLON, 0); }
		public TerminalNode OP_STAR_STAR() { return getToken(KerMLv2Parser.OP_STAR_STAR, 0); }
		public RuleImportedMembershipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleImportedMembership; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleImportedMembership(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleImportedMembership(this);
		}
	}

	public final RuleImportedMembershipContext ruleImportedMembership() throws RecognitionException {
		RuleImportedMembershipContext _localctx = new RuleImportedMembershipContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ruleImportedMembership);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(713);
			ruleQualifiedName();
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_COLON_COLON) {
				{
				setState(714);
				match(OP_COLON_COLON);
				setState(715);
				match(OP_STAR_STAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleNamespaceImportContext extends ParserRuleContext {
		public RuleImportPrefixContext ruleImportPrefix() {
			return getRuleContext(RuleImportPrefixContext.class,0);
		}
		public RuleImportedNamespaceContext ruleImportedNamespace() {
			return getRuleContext(RuleImportedNamespaceContext.class,0);
		}
		public RuleFilterPackageContext ruleFilterPackage() {
			return getRuleContext(RuleFilterPackageContext.class,0);
		}
		public RuleNamespaceImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleNamespaceImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNamespaceImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNamespaceImport(this);
		}
	}

	public final RuleNamespaceImportContext ruleNamespaceImport() throws RecognitionException {
		RuleNamespaceImportContext _localctx = new RuleNamespaceImportContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ruleNamespaceImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
			ruleImportPrefix();
			setState(721);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(719);
				ruleImportedNamespace();
				}
				break;
			case 2:
				{
				setState(720);
				ruleFilterPackage();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleImportedNamespaceContext extends ParserRuleContext {
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public List<TerminalNode> OP_COLON_COLON() { return getTokens(KerMLv2Parser.OP_COLON_COLON); }
		public TerminalNode OP_COLON_COLON(int i) {
			return getToken(KerMLv2Parser.OP_COLON_COLON, i);
		}
		public TerminalNode OP_STAR() { return getToken(KerMLv2Parser.OP_STAR, 0); }
		public TerminalNode OP_STAR_STAR() { return getToken(KerMLv2Parser.OP_STAR_STAR, 0); }
		public RuleImportedNamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleImportedNamespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleImportedNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleImportedNamespace(this);
		}
	}

	public final RuleImportedNamespaceContext ruleImportedNamespace() throws RecognitionException {
		RuleImportedNamespaceContext _localctx = new RuleImportedNamespaceContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ruleImportedNamespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			ruleQualifiedName();
			setState(724);
			match(OP_COLON_COLON);
			setState(725);
			match(OP_STAR);
			setState(728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_COLON_COLON) {
				{
				setState(726);
				match(OP_COLON_COLON);
				setState(727);
				match(OP_STAR_STAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleFilterPackageContext extends ParserRuleContext {
		public RuleFilterPackageImportContext ruleFilterPackageImport() {
			return getRuleContext(RuleFilterPackageImportContext.class,0);
		}
		public List<RuleFilterPackageMemberContext> ruleFilterPackageMember() {
			return getRuleContexts(RuleFilterPackageMemberContext.class);
		}
		public RuleFilterPackageMemberContext ruleFilterPackageMember(int i) {
			return getRuleContext(RuleFilterPackageMemberContext.class,i);
		}
		public RuleFilterPackageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFilterPackage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFilterPackage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFilterPackage(this);
		}
	}

	public final RuleFilterPackageContext ruleFilterPackage() throws RecognitionException {
		RuleFilterPackageContext _localctx = new RuleFilterPackageContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ruleFilterPackage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			ruleFilterPackageImport();
			setState(732); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(731);
				ruleFilterPackageMember();
				}
				}
				setState(734); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LSQUARE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleFilterPackageImportContext extends ParserRuleContext {
		public RuleFilterPackageImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFilterPackageImport; }
	 
		public RuleFilterPackageImportContext() { }
		public void copyFrom(RuleFilterPackageImportContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFilterPackageImport2Context extends RuleFilterPackageImportContext {
		public RuleFilterPackageNamespaceImportContext ruleFilterPackageNamespaceImport() {
			return getRuleContext(RuleFilterPackageNamespaceImportContext.class,0);
		}
		public RuleFilterPackageImport2Context(RuleFilterPackageImportContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFilterPackageImport2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFilterPackageImport2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFilterPackageImport1Context extends RuleFilterPackageImportContext {
		public RuleFilterPackageMembershipImportContext ruleFilterPackageMembershipImport() {
			return getRuleContext(RuleFilterPackageMembershipImportContext.class,0);
		}
		public RuleFilterPackageImport1Context(RuleFilterPackageImportContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFilterPackageImport1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFilterPackageImport1(this);
		}
	}

	public final RuleFilterPackageImportContext ruleFilterPackageImport() throws RecognitionException {
		RuleFilterPackageImportContext _localctx = new RuleFilterPackageImportContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ruleFilterPackageImport);
		try {
			setState(738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				_localctx = new RuleFilterPackageImport1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(736);
				ruleFilterPackageMembershipImport();
				}
				break;
			case 2:
				_localctx = new RuleFilterPackageImport2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(737);
				ruleFilterPackageNamespaceImport();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleFilterPackageMembershipImportContext extends ParserRuleContext {
		public RuleImportedMembershipContext ruleImportedMembership() {
			return getRuleContext(RuleImportedMembershipContext.class,0);
		}
		public RuleFilterPackageMembershipImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFilterPackageMembershipImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFilterPackageMembershipImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFilterPackageMembershipImport(this);
		}
	}

	public final RuleFilterPackageMembershipImportContext ruleFilterPackageMembershipImport() throws RecognitionException {
		RuleFilterPackageMembershipImportContext _localctx = new RuleFilterPackageMembershipImportContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ruleFilterPackageMembershipImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			ruleImportedMembership();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleFilterPackageNamespaceImportContext extends ParserRuleContext {
		public RuleImportedNamespaceContext ruleImportedNamespace() {
			return getRuleContext(RuleImportedNamespaceContext.class,0);
		}
		public RuleFilterPackageNamespaceImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFilterPackageNamespaceImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFilterPackageNamespaceImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFilterPackageNamespaceImport(this);
		}
	}

	public final RuleFilterPackageNamespaceImportContext ruleFilterPackageNamespaceImport() throws RecognitionException {
		RuleFilterPackageNamespaceImportContext _localctx = new RuleFilterPackageNamespaceImportContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_ruleFilterPackageNamespaceImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			ruleImportedNamespace();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleFilterPackageMemberContext extends ParserRuleContext {
		public RuleFilterPackageMemberVisibilityContext ruleFilterPackageMemberVisibility() {
			return getRuleContext(RuleFilterPackageMemberVisibilityContext.class,0);
		}
		public RuleOwnedExpressionContext ruleOwnedExpression() {
			return getRuleContext(RuleOwnedExpressionContext.class,0);
		}
		public TerminalNode RSQUARE() { return getToken(KerMLv2Parser.RSQUARE, 0); }
		public RuleFilterPackageMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFilterPackageMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFilterPackageMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFilterPackageMember(this);
		}
	}

	public final RuleFilterPackageMemberContext ruleFilterPackageMember() throws RecognitionException {
		RuleFilterPackageMemberContext _localctx = new RuleFilterPackageMemberContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ruleFilterPackageMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			ruleFilterPackageMemberVisibility();
			setState(745);
			ruleOwnedExpression();
			setState(746);
			match(RSQUARE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleMemberElementContext extends ParserRuleContext {
		public RuleMemberElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleMemberElement; }
	 
		public RuleMemberElementContext() { }
		public void copyFrom(RuleMemberElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleMemberElement1Context extends RuleMemberElementContext {
		public RuleAnnotatingElementContext ruleAnnotatingElement() {
			return getRuleContext(RuleAnnotatingElementContext.class,0);
		}
		public RuleMemberElement1Context(RuleMemberElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleMemberElement1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleMemberElement1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleMemberElement2Context extends RuleMemberElementContext {
		public RuleNonFeatureElementContext ruleNonFeatureElement() {
			return getRuleContext(RuleNonFeatureElementContext.class,0);
		}
		public RuleMemberElement2Context(RuleMemberElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleMemberElement2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleMemberElement2(this);
		}
	}

	public final RuleMemberElementContext ruleMemberElement() throws RecognitionException {
		RuleMemberElementContext _localctx = new RuleMemberElementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_ruleMemberElement);
		try {
			setState(750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				_localctx = new RuleMemberElement1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(748);
				ruleAnnotatingElement();
				}
				break;
			case 2:
				_localctx = new RuleMemberElement2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(749);
				ruleNonFeatureElement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleNonFeatureElementContext extends ParserRuleContext {
		public RuleNonFeatureElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleNonFeatureElement; }
	 
		public RuleNonFeatureElementContext() { }
		public void copyFrom(RuleNonFeatureElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNonFeatureElement20Context extends RuleNonFeatureElementContext {
		public RuleFeatureTypingContext ruleFeatureTyping() {
			return getRuleContext(RuleFeatureTypingContext.class,0);
		}
		public RuleNonFeatureElement20Context(RuleNonFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNonFeatureElement20(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNonFeatureElement20(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNonFeatureElement22Context extends RuleNonFeatureElementContext {
		public RuleDisjoiningContext ruleDisjoining() {
			return getRuleContext(RuleDisjoiningContext.class,0);
		}
		public RuleNonFeatureElement22Context(RuleNonFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNonFeatureElement22(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNonFeatureElement22(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNonFeatureElement21Context extends RuleNonFeatureElementContext {
		public RuleSubclassificationContext ruleSubclassification() {
			return getRuleContext(RuleSubclassificationContext.class,0);
		}
		public RuleNonFeatureElement21Context(RuleNonFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNonFeatureElement21(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNonFeatureElement21(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNonFeatureElement7Context extends RuleNonFeatureElementContext {
		public RuleClassifierContext ruleClassifier() {
			return getRuleContext(RuleClassifierContext.class,0);
		}
		public RuleNonFeatureElement7Context(RuleNonFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNonFeatureElement7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNonFeatureElement7(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNonFeatureElement8Context extends RuleNonFeatureElementContext {
		public RuleClassContext ruleClass() {
			return getRuleContext(RuleClassContext.class,0);
		}
		public RuleNonFeatureElement8Context(RuleNonFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNonFeatureElement8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNonFeatureElement8(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNonFeatureElement9Context extends RuleNonFeatureElementContext {
		public RuleStructureContext ruleStructure() {
			return getRuleContext(RuleStructureContext.class,0);
		}
		public RuleNonFeatureElement9Context(RuleNonFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNonFeatureElement9(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNonFeatureElement9(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNonFeatureElement24Context extends RuleNonFeatureElementContext {
		public RuleSubsettingContext ruleSubsetting() {
			return getRuleContext(RuleSubsettingContext.class,0);
		}
		public RuleNonFeatureElement24Context(RuleNonFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNonFeatureElement24(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNonFeatureElement24(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNonFeatureElement23Context extends RuleNonFeatureElementContext {
		public RuleFeatureInvertingContext ruleFeatureInverting() {
			return getRuleContext(RuleFeatureInvertingContext.class,0);
		}
		public RuleNonFeatureElement23Context(RuleNonFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNonFeatureElement23(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNonFeatureElement23(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNonFeatureElement26Context extends RuleNonFeatureElementContext {
		public RuleTypeFeaturingContext ruleTypeFeaturing() {
			return getRuleContext(RuleTypeFeaturingContext.class,0);
		}
		public RuleNonFeatureElement26Context(RuleNonFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNonFeatureElement26(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNonFeatureElement26(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNonFeatureElement25Context extends RuleNonFeatureElementContext {
		public RuleRedefinitionContext ruleRedefinition() {
			return getRuleContext(RuleRedefinitionContext.class,0);
		}
		public RuleNonFeatureElement25Context(RuleNonFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNonFeatureElement25(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNonFeatureElement25(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNonFeatureElement3Context extends RuleNonFeatureElementContext {
		public RulePackageContext rulePackage() {
			return getRuleContext(RulePackageContext.class,0);
		}
		public RuleNonFeatureElement3Context(RuleNonFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNonFeatureElement3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNonFeatureElement3(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNonFeatureElement4Context extends RuleNonFeatureElementContext {
		public RuleLibraryPackageContext ruleLibraryPackage() {
			return getRuleContext(RuleLibraryPackageContext.class,0);
		}
		public RuleNonFeatureElement4Context(RuleNonFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNonFeatureElement4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNonFeatureElement4(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNonFeatureElement5Context extends RuleNonFeatureElementContext {
		public RuleMultiplicityContext ruleMultiplicity() {
			return getRuleContext(RuleMultiplicityContext.class,0);
		}
		public RuleNonFeatureElement5Context(RuleNonFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNonFeatureElement5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNonFeatureElement5(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNonFeatureElement6Context extends RuleNonFeatureElementContext {
		public RuleTypeContext ruleType() {
			return getRuleContext(RuleTypeContext.class,0);
		}
		public RuleNonFeatureElement6Context(RuleNonFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNonFeatureElement6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNonFeatureElement6(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNonFeatureElement1Context extends RuleNonFeatureElementContext {
		public RuleDependencyContext ruleDependency() {
			return getRuleContext(RuleDependencyContext.class,0);
		}
		public RuleNonFeatureElement1Context(RuleNonFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNonFeatureElement1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNonFeatureElement1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNonFeatureElement2Context extends RuleNonFeatureElementContext {
		public RuleNamespaceContext ruleNamespace() {
			return getRuleContext(RuleNamespaceContext.class,0);
		}
		public RuleNonFeatureElement2Context(RuleNonFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNonFeatureElement2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNonFeatureElement2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNonFeatureElement11Context extends RuleNonFeatureElementContext {
		public RuleDataTypeContext ruleDataType() {
			return getRuleContext(RuleDataTypeContext.class,0);
		}
		public RuleNonFeatureElement11Context(RuleNonFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNonFeatureElement11(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNonFeatureElement11(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNonFeatureElement10Context extends RuleNonFeatureElementContext {
		public RuleMetaclassContext ruleMetaclass() {
			return getRuleContext(RuleMetaclassContext.class,0);
		}
		public RuleNonFeatureElement10Context(RuleNonFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNonFeatureElement10(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNonFeatureElement10(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNonFeatureElement17Context extends RuleNonFeatureElementContext {
		public RulePredicateContext rulePredicate() {
			return getRuleContext(RulePredicateContext.class,0);
		}
		public RuleNonFeatureElement17Context(RuleNonFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNonFeatureElement17(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNonFeatureElement17(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNonFeatureElement16Context extends RuleNonFeatureElementContext {
		public RuleFunctionContext ruleFunction() {
			return getRuleContext(RuleFunctionContext.class,0);
		}
		public RuleNonFeatureElement16Context(RuleNonFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNonFeatureElement16(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNonFeatureElement16(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNonFeatureElement19Context extends RuleNonFeatureElementContext {
		public RuleConjugationContext ruleConjugation() {
			return getRuleContext(RuleConjugationContext.class,0);
		}
		public RuleNonFeatureElement19Context(RuleNonFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNonFeatureElement19(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNonFeatureElement19(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNonFeatureElement18Context extends RuleNonFeatureElementContext {
		public RuleSpecializationContext ruleSpecialization() {
			return getRuleContext(RuleSpecializationContext.class,0);
		}
		public RuleNonFeatureElement18Context(RuleNonFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNonFeatureElement18(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNonFeatureElement18(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNonFeatureElement13Context extends RuleNonFeatureElementContext {
		public RuleAssociationStructureContext ruleAssociationStructure() {
			return getRuleContext(RuleAssociationStructureContext.class,0);
		}
		public RuleNonFeatureElement13Context(RuleNonFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNonFeatureElement13(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNonFeatureElement13(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNonFeatureElement12Context extends RuleNonFeatureElementContext {
		public RuleAssociationContext ruleAssociation() {
			return getRuleContext(RuleAssociationContext.class,0);
		}
		public RuleNonFeatureElement12Context(RuleNonFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNonFeatureElement12(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNonFeatureElement12(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNonFeatureElement15Context extends RuleNonFeatureElementContext {
		public RuleBehaviorContext ruleBehavior() {
			return getRuleContext(RuleBehaviorContext.class,0);
		}
		public RuleNonFeatureElement15Context(RuleNonFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNonFeatureElement15(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNonFeatureElement15(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleNonFeatureElement14Context extends RuleNonFeatureElementContext {
		public RuleInteractionContext ruleInteraction() {
			return getRuleContext(RuleInteractionContext.class,0);
		}
		public RuleNonFeatureElement14Context(RuleNonFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNonFeatureElement14(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNonFeatureElement14(this);
		}
	}

	public final RuleNonFeatureElementContext ruleNonFeatureElement() throws RecognitionException {
		RuleNonFeatureElementContext _localctx = new RuleNonFeatureElementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_ruleNonFeatureElement);
		try {
			setState(778);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				_localctx = new RuleNonFeatureElement1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(752);
				ruleDependency();
				}
				break;
			case 2:
				_localctx = new RuleNonFeatureElement2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(753);
				ruleNamespace();
				}
				break;
			case 3:
				_localctx = new RuleNonFeatureElement3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(754);
				rulePackage();
				}
				break;
			case 4:
				_localctx = new RuleNonFeatureElement4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(755);
				ruleLibraryPackage();
				}
				break;
			case 5:
				_localctx = new RuleNonFeatureElement5Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(756);
				ruleMultiplicity();
				}
				break;
			case 6:
				_localctx = new RuleNonFeatureElement6Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(757);
				ruleType();
				}
				break;
			case 7:
				_localctx = new RuleNonFeatureElement7Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(758);
				ruleClassifier();
				}
				break;
			case 8:
				_localctx = new RuleNonFeatureElement8Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(759);
				ruleClass();
				}
				break;
			case 9:
				_localctx = new RuleNonFeatureElement9Context(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(760);
				ruleStructure();
				}
				break;
			case 10:
				_localctx = new RuleNonFeatureElement10Context(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(761);
				ruleMetaclass();
				}
				break;
			case 11:
				_localctx = new RuleNonFeatureElement11Context(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(762);
				ruleDataType();
				}
				break;
			case 12:
				_localctx = new RuleNonFeatureElement12Context(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(763);
				ruleAssociation();
				}
				break;
			case 13:
				_localctx = new RuleNonFeatureElement13Context(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(764);
				ruleAssociationStructure();
				}
				break;
			case 14:
				_localctx = new RuleNonFeatureElement14Context(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(765);
				ruleInteraction();
				}
				break;
			case 15:
				_localctx = new RuleNonFeatureElement15Context(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(766);
				ruleBehavior();
				}
				break;
			case 16:
				_localctx = new RuleNonFeatureElement16Context(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(767);
				ruleFunction();
				}
				break;
			case 17:
				_localctx = new RuleNonFeatureElement17Context(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(768);
				rulePredicate();
				}
				break;
			case 18:
				_localctx = new RuleNonFeatureElement18Context(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(769);
				ruleSpecialization();
				}
				break;
			case 19:
				_localctx = new RuleNonFeatureElement19Context(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(770);
				ruleConjugation();
				}
				break;
			case 20:
				_localctx = new RuleNonFeatureElement20Context(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(771);
				ruleFeatureTyping();
				}
				break;
			case 21:
				_localctx = new RuleNonFeatureElement21Context(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(772);
				ruleSubclassification();
				}
				break;
			case 22:
				_localctx = new RuleNonFeatureElement22Context(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(773);
				ruleDisjoining();
				}
				break;
			case 23:
				_localctx = new RuleNonFeatureElement23Context(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(774);
				ruleFeatureInverting();
				}
				break;
			case 24:
				_localctx = new RuleNonFeatureElement24Context(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(775);
				ruleSubsetting();
				}
				break;
			case 25:
				_localctx = new RuleNonFeatureElement25Context(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(776);
				ruleRedefinition();
				}
				break;
			case 26:
				_localctx = new RuleNonFeatureElement26Context(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(777);
				ruleTypeFeaturing();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureElementContext extends ParserRuleContext {
		public RuleFeatureElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFeatureElement; }
	 
		public RuleFeatureElementContext() { }
		public void copyFrom(RuleFeatureElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureElement1Context extends RuleFeatureElementContext {
		public RuleFeatureContext ruleFeature() {
			return getRuleContext(RuleFeatureContext.class,0);
		}
		public RuleFeatureElement1Context(RuleFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureElement1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureElement1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureElement10Context extends RuleFeatureElementContext {
		public RuleSuccessionItemFlowContext ruleSuccessionItemFlow() {
			return getRuleContext(RuleSuccessionItemFlowContext.class,0);
		}
		public RuleFeatureElement10Context(RuleFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureElement10(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureElement10(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureElement5Context extends RuleFeatureElementContext {
		public RuleInvariantContext ruleInvariant() {
			return getRuleContext(RuleInvariantContext.class,0);
		}
		public RuleFeatureElement5Context(RuleFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureElement5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureElement5(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureElement4Context extends RuleFeatureElementContext {
		public RuleBooleanExpressionContext ruleBooleanExpression() {
			return getRuleContext(RuleBooleanExpressionContext.class,0);
		}
		public RuleFeatureElement4Context(RuleFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureElement4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureElement4(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureElement3Context extends RuleFeatureElementContext {
		public RuleExpressionContext ruleExpression() {
			return getRuleContext(RuleExpressionContext.class,0);
		}
		public RuleFeatureElement3Context(RuleFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureElement3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureElement3(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureElement2Context extends RuleFeatureElementContext {
		public RuleStepContext ruleStep() {
			return getRuleContext(RuleStepContext.class,0);
		}
		public RuleFeatureElement2Context(RuleFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureElement2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureElement2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureElement9Context extends RuleFeatureElementContext {
		public RuleItemFlowContext ruleItemFlow() {
			return getRuleContext(RuleItemFlowContext.class,0);
		}
		public RuleFeatureElement9Context(RuleFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureElement9(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureElement9(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureElement8Context extends RuleFeatureElementContext {
		public RuleSuccessionContext ruleSuccession() {
			return getRuleContext(RuleSuccessionContext.class,0);
		}
		public RuleFeatureElement8Context(RuleFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureElement8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureElement8(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureElement7Context extends RuleFeatureElementContext {
		public RuleBindingConnectorContext ruleBindingConnector() {
			return getRuleContext(RuleBindingConnectorContext.class,0);
		}
		public RuleFeatureElement7Context(RuleFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureElement7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureElement7(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureElement6Context extends RuleFeatureElementContext {
		public RuleConnectorContext ruleConnector() {
			return getRuleContext(RuleConnectorContext.class,0);
		}
		public RuleFeatureElement6Context(RuleFeatureElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureElement6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureElement6(this);
		}
	}

	public final RuleFeatureElementContext ruleFeatureElement() throws RecognitionException {
		RuleFeatureElementContext _localctx = new RuleFeatureElementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_ruleFeatureElement);
		try {
			setState(790);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new RuleFeatureElement1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(780);
				ruleFeature();
				}
				break;
			case 2:
				_localctx = new RuleFeatureElement2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(781);
				ruleStep();
				}
				break;
			case 3:
				_localctx = new RuleFeatureElement3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(782);
				ruleExpression();
				}
				break;
			case 4:
				_localctx = new RuleFeatureElement4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(783);
				ruleBooleanExpression();
				}
				break;
			case 5:
				_localctx = new RuleFeatureElement5Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(784);
				ruleInvariant();
				}
				break;
			case 6:
				_localctx = new RuleFeatureElement6Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(785);
				ruleConnector();
				}
				break;
			case 7:
				_localctx = new RuleFeatureElement7Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(786);
				ruleBindingConnector();
				}
				break;
			case 8:
				_localctx = new RuleFeatureElement8Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(787);
				ruleSuccession();
				}
				break;
			case 9:
				_localctx = new RuleFeatureElement9Context(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(788);
				ruleItemFlow();
				}
				break;
			case 10:
				_localctx = new RuleFeatureElement10Context(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(789);
				ruleSuccessionItemFlow();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RulePackageContext extends ParserRuleContext {
		public RulePackageDeclarationContext rulePackageDeclaration() {
			return getRuleContext(RulePackageDeclarationContext.class,0);
		}
		public RulePackageBodyContext rulePackageBody() {
			return getRuleContext(RulePackageBodyContext.class,0);
		}
		public List<RulePrefixMetadataMemberContext> rulePrefixMetadataMember() {
			return getRuleContexts(RulePrefixMetadataMemberContext.class);
		}
		public RulePrefixMetadataMemberContext rulePrefixMetadataMember(int i) {
			return getRuleContext(RulePrefixMetadataMemberContext.class,i);
		}
		public RulePackageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulePackage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRulePackage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRulePackage(this);
		}
	}

	public final RulePackageContext rulePackage() throws RecognitionException {
		RulePackageContext _localctx = new RulePackageContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_rulePackage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_HASH) {
				{
				{
				setState(792);
				rulePrefixMetadataMember();
				}
				}
				setState(797);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(798);
			rulePackageDeclaration();
			setState(799);
			rulePackageBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleLibraryPackageContext extends ParserRuleContext {
		public TerminalNode K_LIBRARY() { return getToken(KerMLv2Parser.K_LIBRARY, 0); }
		public RulePackageDeclarationContext rulePackageDeclaration() {
			return getRuleContext(RulePackageDeclarationContext.class,0);
		}
		public RulePackageBodyContext rulePackageBody() {
			return getRuleContext(RulePackageBodyContext.class,0);
		}
		public TerminalNode K_STANDARD() { return getToken(KerMLv2Parser.K_STANDARD, 0); }
		public List<RulePrefixMetadataMemberContext> rulePrefixMetadataMember() {
			return getRuleContexts(RulePrefixMetadataMemberContext.class);
		}
		public RulePrefixMetadataMemberContext rulePrefixMetadataMember(int i) {
			return getRuleContext(RulePrefixMetadataMemberContext.class,i);
		}
		public RuleLibraryPackageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleLibraryPackage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleLibraryPackage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleLibraryPackage(this);
		}
	}

	public final RuleLibraryPackageContext ruleLibraryPackage() throws RecognitionException {
		RuleLibraryPackageContext _localctx = new RuleLibraryPackageContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_ruleLibraryPackage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_STANDARD) {
				{
				setState(801);
				match(K_STANDARD);
				}
			}

			setState(804);
			match(K_LIBRARY);
			setState(808);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_HASH) {
				{
				{
				setState(805);
				rulePrefixMetadataMember();
				}
				}
				setState(810);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(811);
			rulePackageDeclaration();
			setState(812);
			rulePackageBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RulePackageDeclarationContext extends ParserRuleContext {
		public TerminalNode K_PACKAGE() { return getToken(KerMLv2Parser.K_PACKAGE, 0); }
		public RuleIdentificationContext ruleIdentification() {
			return getRuleContext(RuleIdentificationContext.class,0);
		}
		public RulePackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulePackageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRulePackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRulePackageDeclaration(this);
		}
	}

	public final RulePackageDeclarationContext rulePackageDeclaration() throws RecognitionException {
		RulePackageDeclarationContext _localctx = new RulePackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_rulePackageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			match(K_PACKAGE);
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 52776558133249L) != 0)) {
				{
				setState(815);
				ruleIdentification();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RulePackageBodyContext extends ParserRuleContext {
		public RulePackageBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulePackageBody; }
	 
		public RulePackageBodyContext() { }
		public void copyFrom(RulePackageBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RulePackageBody2Context extends RulePackageBodyContext {
		public TerminalNode LBRACE() { return getToken(KerMLv2Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(KerMLv2Parser.RBRACE, 0); }
		public List<RuleNamespaceMemberContext> ruleNamespaceMember() {
			return getRuleContexts(RuleNamespaceMemberContext.class);
		}
		public RuleNamespaceMemberContext ruleNamespaceMember(int i) {
			return getRuleContext(RuleNamespaceMemberContext.class,i);
		}
		public List<RuleElementFilterMemberContext> ruleElementFilterMember() {
			return getRuleContexts(RuleElementFilterMemberContext.class);
		}
		public RuleElementFilterMemberContext ruleElementFilterMember(int i) {
			return getRuleContext(RuleElementFilterMemberContext.class,i);
		}
		public List<RuleAliasMemberContext> ruleAliasMember() {
			return getRuleContexts(RuleAliasMemberContext.class);
		}
		public RuleAliasMemberContext ruleAliasMember(int i) {
			return getRuleContext(RuleAliasMemberContext.class,i);
		}
		public List<RuleImportContext> ruleImport() {
			return getRuleContexts(RuleImportContext.class);
		}
		public RuleImportContext ruleImport(int i) {
			return getRuleContext(RuleImportContext.class,i);
		}
		public RulePackageBody2Context(RulePackageBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRulePackageBody2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRulePackageBody2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RulePackageBody1Context extends RulePackageBodyContext {
		public TerminalNode OP_SEMI() { return getToken(KerMLv2Parser.OP_SEMI, 0); }
		public RulePackageBody1Context(RulePackageBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRulePackageBody1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRulePackageBody1(this);
		}
	}

	public final RulePackageBodyContext rulePackageBody() throws RecognitionException {
		RulePackageBodyContext _localctx = new RulePackageBodyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_rulePackageBody);
		int _la;
		try {
			setState(830);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_SEMI:
				_localctx = new RulePackageBody1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(818);
				match(OP_SEMI);
				}
				break;
			case LBRACE:
				_localctx = new RulePackageBody2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(819);
				match(LBRACE);
				setState(826);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -144178960004026414L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 882144912399912819L) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & 11L) != 0)) {
					{
					setState(824);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						setState(820);
						ruleNamespaceMember();
						}
						break;
					case 2:
						{
						setState(821);
						ruleElementFilterMember();
						}
						break;
					case 3:
						{
						setState(822);
						ruleAliasMember();
						}
						break;
					case 4:
						{
						setState(823);
						ruleImport();
						}
						break;
					}
					}
					setState(828);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(829);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleElementFilterMemberContext extends ParserRuleContext {
		public RuleMemberPrefixContext ruleMemberPrefix() {
			return getRuleContext(RuleMemberPrefixContext.class,0);
		}
		public TerminalNode K_FILTER() { return getToken(KerMLv2Parser.K_FILTER, 0); }
		public RuleOwnedExpressionContext ruleOwnedExpression() {
			return getRuleContext(RuleOwnedExpressionContext.class,0);
		}
		public TerminalNode OP_SEMI() { return getToken(KerMLv2Parser.OP_SEMI, 0); }
		public RuleElementFilterMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleElementFilterMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleElementFilterMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleElementFilterMember(this);
		}
	}

	public final RuleElementFilterMemberContext ruleElementFilterMember() throws RecognitionException {
		RuleElementFilterMemberContext _localctx = new RuleElementFilterMemberContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_ruleElementFilterMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(832);
			ruleMemberPrefix();
			setState(833);
			match(K_FILTER);
			setState(834);
			ruleOwnedExpression();
			setState(835);
			match(OP_SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleTypePrefixContext extends ParserRuleContext {
		public TerminalNode K_ABSTRACT() { return getToken(KerMLv2Parser.K_ABSTRACT, 0); }
		public List<RulePrefixMetadataMemberContext> rulePrefixMetadataMember() {
			return getRuleContexts(RulePrefixMetadataMemberContext.class);
		}
		public RulePrefixMetadataMemberContext rulePrefixMetadataMember(int i) {
			return getRuleContext(RulePrefixMetadataMemberContext.class,i);
		}
		public RuleTypePrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleTypePrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleTypePrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleTypePrefix(this);
		}
	}

	public final RuleTypePrefixContext ruleTypePrefix() throws RecognitionException {
		RuleTypePrefixContext _localctx = new RuleTypePrefixContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_ruleTypePrefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ABSTRACT) {
				{
				setState(837);
				match(K_ABSTRACT);
				}
			}

			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_HASH) {
				{
				{
				setState(840);
				rulePrefixMetadataMember();
				}
				}
				setState(845);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleTypeContext extends ParserRuleContext {
		public RuleTypePrefixContext ruleTypePrefix() {
			return getRuleContext(RuleTypePrefixContext.class,0);
		}
		public TerminalNode K_TYPE() { return getToken(KerMLv2Parser.K_TYPE, 0); }
		public RuleTypeDeclarationContext ruleTypeDeclaration() {
			return getRuleContext(RuleTypeDeclarationContext.class,0);
		}
		public RuleTypeBodyContext ruleTypeBody() {
			return getRuleContext(RuleTypeBodyContext.class,0);
		}
		public RuleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleType(this);
		}
	}

	public final RuleTypeContext ruleType() throws RecognitionException {
		RuleTypeContext _localctx = new RuleTypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_ruleType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			ruleTypePrefix();
			setState(847);
			match(K_TYPE);
			setState(848);
			ruleTypeDeclaration();
			setState(849);
			ruleTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleTypeDeclarationContext extends ParserRuleContext {
		public RuleSpecializationPartContext ruleSpecializationPart() {
			return getRuleContext(RuleSpecializationPartContext.class,0);
		}
		public RuleConjugationPartContext ruleConjugationPart() {
			return getRuleContext(RuleConjugationPartContext.class,0);
		}
		public TerminalNode K_ALL() { return getToken(KerMLv2Parser.K_ALL, 0); }
		public RuleIdentificationContext ruleIdentification() {
			return getRuleContext(RuleIdentificationContext.class,0);
		}
		public RuleOwnedMultiplicityContext ruleOwnedMultiplicity() {
			return getRuleContext(RuleOwnedMultiplicityContext.class,0);
		}
		public List<RuleTypeRelationshipPartContext> ruleTypeRelationshipPart() {
			return getRuleContexts(RuleTypeRelationshipPartContext.class);
		}
		public RuleTypeRelationshipPartContext ruleTypeRelationshipPart(int i) {
			return getRuleContext(RuleTypeRelationshipPartContext.class,i);
		}
		public RuleTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleTypeDeclaration(this);
		}
	}

	public final RuleTypeDeclarationContext ruleTypeDeclaration() throws RecognitionException {
		RuleTypeDeclarationContext _localctx = new RuleTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_ruleTypeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ALL) {
				{
				setState(851);
				match(K_ALL);
				}
			}

			setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 52776558133249L) != 0)) {
				{
				setState(854);
				ruleIdentification();
				}
			}

			setState(858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQUARE) {
				{
				setState(857);
				ruleOwnedMultiplicity();
				}
			}

			setState(862);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SPECIALIZES:
			case OP_COLON_RANGLE:
				{
				setState(860);
				ruleSpecializationPart();
				}
				break;
			case K_CONJUGATES:
			case OP_TILDE:
				{
				setState(861);
				ruleConjugationPart();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 125829120L) != 0)) {
				{
				{
				setState(864);
				ruleTypeRelationshipPart();
				}
				}
				setState(869);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleSpecializationPartContext extends ParserRuleContext {
		public List<RuleOwnedSpecializationContext> ruleOwnedSpecialization() {
			return getRuleContexts(RuleOwnedSpecializationContext.class);
		}
		public RuleOwnedSpecializationContext ruleOwnedSpecialization(int i) {
			return getRuleContext(RuleOwnedSpecializationContext.class,i);
		}
		public TerminalNode OP_COLON_RANGLE() { return getToken(KerMLv2Parser.OP_COLON_RANGLE, 0); }
		public TerminalNode K_SPECIALIZES() { return getToken(KerMLv2Parser.K_SPECIALIZES, 0); }
		public List<TerminalNode> OP_COMMA() { return getTokens(KerMLv2Parser.OP_COMMA); }
		public TerminalNode OP_COMMA(int i) {
			return getToken(KerMLv2Parser.OP_COMMA, i);
		}
		public RuleSpecializationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSpecializationPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleSpecializationPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleSpecializationPart(this);
		}
	}

	public final RuleSpecializationPartContext ruleSpecializationPart() throws RecognitionException {
		RuleSpecializationPartContext _localctx = new RuleSpecializationPartContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_ruleSpecializationPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			_la = _input.LA(1);
			if ( !(_la==K_SPECIALIZES || _la==OP_COLON_RANGLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(871);
			ruleOwnedSpecialization();
			setState(876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_COMMA) {
				{
				{
				setState(872);
				match(OP_COMMA);
				setState(873);
				ruleOwnedSpecialization();
				}
				}
				setState(878);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleConjugationPartContext extends ParserRuleContext {
		public RuleOwnedConjugationContext ruleOwnedConjugation() {
			return getRuleContext(RuleOwnedConjugationContext.class,0);
		}
		public TerminalNode OP_TILDE() { return getToken(KerMLv2Parser.OP_TILDE, 0); }
		public TerminalNode K_CONJUGATES() { return getToken(KerMLv2Parser.K_CONJUGATES, 0); }
		public RuleConjugationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleConjugationPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleConjugationPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleConjugationPart(this);
		}
	}

	public final RuleConjugationPartContext ruleConjugationPart() throws RecognitionException {
		RuleConjugationPartContext _localctx = new RuleConjugationPartContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_ruleConjugationPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			_la = _input.LA(1);
			if ( !(_la==K_CONJUGATES || _la==OP_TILDE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(880);
			ruleOwnedConjugation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleTypeRelationshipPartContext extends ParserRuleContext {
		public RuleTypeRelationshipPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleTypeRelationshipPart; }
	 
		public RuleTypeRelationshipPartContext() { }
		public void copyFrom(RuleTypeRelationshipPartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleTypeRelationshipPart2Context extends RuleTypeRelationshipPartContext {
		public RuleUnioningPartContext ruleUnioningPart() {
			return getRuleContext(RuleUnioningPartContext.class,0);
		}
		public RuleTypeRelationshipPart2Context(RuleTypeRelationshipPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleTypeRelationshipPart2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleTypeRelationshipPart2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleTypeRelationshipPart1Context extends RuleTypeRelationshipPartContext {
		public RuleDisjoiningPartContext ruleDisjoiningPart() {
			return getRuleContext(RuleDisjoiningPartContext.class,0);
		}
		public RuleTypeRelationshipPart1Context(RuleTypeRelationshipPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleTypeRelationshipPart1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleTypeRelationshipPart1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleTypeRelationshipPart4Context extends RuleTypeRelationshipPartContext {
		public RuleDifferencingPartContext ruleDifferencingPart() {
			return getRuleContext(RuleDifferencingPartContext.class,0);
		}
		public RuleTypeRelationshipPart4Context(RuleTypeRelationshipPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleTypeRelationshipPart4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleTypeRelationshipPart4(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleTypeRelationshipPart3Context extends RuleTypeRelationshipPartContext {
		public RuleIntersectingPartContext ruleIntersectingPart() {
			return getRuleContext(RuleIntersectingPartContext.class,0);
		}
		public RuleTypeRelationshipPart3Context(RuleTypeRelationshipPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleTypeRelationshipPart3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleTypeRelationshipPart3(this);
		}
	}

	public final RuleTypeRelationshipPartContext ruleTypeRelationshipPart() throws RecognitionException {
		RuleTypeRelationshipPartContext _localctx = new RuleTypeRelationshipPartContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_ruleTypeRelationshipPart);
		try {
			setState(886);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DISJOINT:
				_localctx = new RuleTypeRelationshipPart1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(882);
				ruleDisjoiningPart();
				}
				break;
			case K_UNIONS:
				_localctx = new RuleTypeRelationshipPart2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(883);
				ruleUnioningPart();
				}
				break;
			case K_INTERSECTS:
				_localctx = new RuleTypeRelationshipPart3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(884);
				ruleIntersectingPart();
				}
				break;
			case K_DIFFERENCES:
				_localctx = new RuleTypeRelationshipPart4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(885);
				ruleDifferencingPart();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleDisjoiningPartContext extends ParserRuleContext {
		public TerminalNode K_DISJOINT() { return getToken(KerMLv2Parser.K_DISJOINT, 0); }
		public TerminalNode K_FROM() { return getToken(KerMLv2Parser.K_FROM, 0); }
		public List<RuleOwnedDisjoiningContext> ruleOwnedDisjoining() {
			return getRuleContexts(RuleOwnedDisjoiningContext.class);
		}
		public RuleOwnedDisjoiningContext ruleOwnedDisjoining(int i) {
			return getRuleContext(RuleOwnedDisjoiningContext.class,i);
		}
		public List<TerminalNode> OP_COMMA() { return getTokens(KerMLv2Parser.OP_COMMA); }
		public TerminalNode OP_COMMA(int i) {
			return getToken(KerMLv2Parser.OP_COMMA, i);
		}
		public RuleDisjoiningPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleDisjoiningPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleDisjoiningPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleDisjoiningPart(this);
		}
	}

	public final RuleDisjoiningPartContext ruleDisjoiningPart() throws RecognitionException {
		RuleDisjoiningPartContext _localctx = new RuleDisjoiningPartContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_ruleDisjoiningPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			match(K_DISJOINT);
			setState(889);
			match(K_FROM);
			setState(890);
			ruleOwnedDisjoining();
			setState(895);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_COMMA) {
				{
				{
				setState(891);
				match(OP_COMMA);
				setState(892);
				ruleOwnedDisjoining();
				}
				}
				setState(897);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleUnioningPartContext extends ParserRuleContext {
		public TerminalNode K_UNIONS() { return getToken(KerMLv2Parser.K_UNIONS, 0); }
		public List<RuleUnioningContext> ruleUnioning() {
			return getRuleContexts(RuleUnioningContext.class);
		}
		public RuleUnioningContext ruleUnioning(int i) {
			return getRuleContext(RuleUnioningContext.class,i);
		}
		public List<TerminalNode> OP_COMMA() { return getTokens(KerMLv2Parser.OP_COMMA); }
		public TerminalNode OP_COMMA(int i) {
			return getToken(KerMLv2Parser.OP_COMMA, i);
		}
		public RuleUnioningPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleUnioningPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleUnioningPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleUnioningPart(this);
		}
	}

	public final RuleUnioningPartContext ruleUnioningPart() throws RecognitionException {
		RuleUnioningPartContext _localctx = new RuleUnioningPartContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_ruleUnioningPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			match(K_UNIONS);
			setState(899);
			ruleUnioning();
			setState(904);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_COMMA) {
				{
				{
				setState(900);
				match(OP_COMMA);
				setState(901);
				ruleUnioning();
				}
				}
				setState(906);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleIntersectingPartContext extends ParserRuleContext {
		public TerminalNode K_INTERSECTS() { return getToken(KerMLv2Parser.K_INTERSECTS, 0); }
		public List<RuleIntersectingContext> ruleIntersecting() {
			return getRuleContexts(RuleIntersectingContext.class);
		}
		public RuleIntersectingContext ruleIntersecting(int i) {
			return getRuleContext(RuleIntersectingContext.class,i);
		}
		public List<TerminalNode> OP_COMMA() { return getTokens(KerMLv2Parser.OP_COMMA); }
		public TerminalNode OP_COMMA(int i) {
			return getToken(KerMLv2Parser.OP_COMMA, i);
		}
		public RuleIntersectingPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleIntersectingPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleIntersectingPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleIntersectingPart(this);
		}
	}

	public final RuleIntersectingPartContext ruleIntersectingPart() throws RecognitionException {
		RuleIntersectingPartContext _localctx = new RuleIntersectingPartContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_ruleIntersectingPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			match(K_INTERSECTS);
			setState(908);
			ruleIntersecting();
			setState(913);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_COMMA) {
				{
				{
				setState(909);
				match(OP_COMMA);
				setState(910);
				ruleIntersecting();
				}
				}
				setState(915);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleDifferencingPartContext extends ParserRuleContext {
		public TerminalNode K_DIFFERENCES() { return getToken(KerMLv2Parser.K_DIFFERENCES, 0); }
		public List<RuleDifferencingContext> ruleDifferencing() {
			return getRuleContexts(RuleDifferencingContext.class);
		}
		public RuleDifferencingContext ruleDifferencing(int i) {
			return getRuleContext(RuleDifferencingContext.class,i);
		}
		public List<TerminalNode> OP_COMMA() { return getTokens(KerMLv2Parser.OP_COMMA); }
		public TerminalNode OP_COMMA(int i) {
			return getToken(KerMLv2Parser.OP_COMMA, i);
		}
		public RuleDifferencingPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleDifferencingPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleDifferencingPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleDifferencingPart(this);
		}
	}

	public final RuleDifferencingPartContext ruleDifferencingPart() throws RecognitionException {
		RuleDifferencingPartContext _localctx = new RuleDifferencingPartContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_ruleDifferencingPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			match(K_DIFFERENCES);
			setState(917);
			ruleDifferencing();
			setState(922);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_COMMA) {
				{
				{
				setState(918);
				match(OP_COMMA);
				setState(919);
				ruleDifferencing();
				}
				}
				setState(924);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleTypeBodyContext extends ParserRuleContext {
		public RuleTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleTypeBody; }
	 
		public RuleTypeBodyContext() { }
		public void copyFrom(RuleTypeBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleTypeBody2Context extends RuleTypeBodyContext {
		public TerminalNode LBRACE() { return getToken(KerMLv2Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(KerMLv2Parser.RBRACE, 0); }
		public List<RuleNonFeatureMemberContext> ruleNonFeatureMember() {
			return getRuleContexts(RuleNonFeatureMemberContext.class);
		}
		public RuleNonFeatureMemberContext ruleNonFeatureMember(int i) {
			return getRuleContext(RuleNonFeatureMemberContext.class,i);
		}
		public List<RuleFeatureMemberContext> ruleFeatureMember() {
			return getRuleContexts(RuleFeatureMemberContext.class);
		}
		public RuleFeatureMemberContext ruleFeatureMember(int i) {
			return getRuleContext(RuleFeatureMemberContext.class,i);
		}
		public List<RuleAliasMemberContext> ruleAliasMember() {
			return getRuleContexts(RuleAliasMemberContext.class);
		}
		public RuleAliasMemberContext ruleAliasMember(int i) {
			return getRuleContext(RuleAliasMemberContext.class,i);
		}
		public List<RuleImportContext> ruleImport() {
			return getRuleContexts(RuleImportContext.class);
		}
		public RuleImportContext ruleImport(int i) {
			return getRuleContext(RuleImportContext.class,i);
		}
		public RuleTypeBody2Context(RuleTypeBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleTypeBody2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleTypeBody2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleTypeBody1Context extends RuleTypeBodyContext {
		public TerminalNode OP_SEMI() { return getToken(KerMLv2Parser.OP_SEMI, 0); }
		public RuleTypeBody1Context(RuleTypeBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleTypeBody1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleTypeBody1(this);
		}
	}

	public final RuleTypeBodyContext ruleTypeBody() throws RecognitionException {
		RuleTypeBodyContext _localctx = new RuleTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_ruleTypeBody);
		int _la;
		try {
			setState(937);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_SEMI:
				_localctx = new RuleTypeBody1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(925);
				match(OP_SEMI);
				}
				break;
			case LBRACE:
				_localctx = new RuleTypeBody2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(926);
				match(LBRACE);
				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -144178959870070830L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 882144912399912819L) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & 11L) != 0)) {
					{
					setState(931);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						setState(927);
						ruleNonFeatureMember();
						}
						break;
					case 2:
						{
						setState(928);
						ruleFeatureMember();
						}
						break;
					case 3:
						{
						setState(929);
						ruleAliasMember();
						}
						break;
					case 4:
						{
						setState(930);
						ruleImport();
						}
						break;
					}
					}
					setState(935);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(936);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureMemberContext extends ParserRuleContext {
		public RuleFeatureMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFeatureMember; }
	 
		public RuleFeatureMemberContext() { }
		public void copyFrom(RuleFeatureMemberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureMember2Context extends RuleFeatureMemberContext {
		public RuleOwnedFeatureMemberContext ruleOwnedFeatureMember() {
			return getRuleContext(RuleOwnedFeatureMemberContext.class,0);
		}
		public RuleFeatureMember2Context(RuleFeatureMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureMember2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureMember2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureMember1Context extends RuleFeatureMemberContext {
		public RuleTypeFeatureMemberContext ruleTypeFeatureMember() {
			return getRuleContext(RuleTypeFeatureMemberContext.class,0);
		}
		public RuleFeatureMember1Context(RuleFeatureMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureMember1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureMember1(this);
		}
	}

	public final RuleFeatureMemberContext ruleFeatureMember() throws RecognitionException {
		RuleFeatureMemberContext _localctx = new RuleFeatureMemberContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_ruleFeatureMember);
		try {
			setState(941);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				_localctx = new RuleFeatureMember1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(939);
				ruleTypeFeatureMember();
				}
				break;
			case 2:
				_localctx = new RuleFeatureMember2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(940);
				ruleOwnedFeatureMember();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleTypeFeatureMemberContext extends ParserRuleContext {
		public RuleMemberPrefixContext ruleMemberPrefix() {
			return getRuleContext(RuleMemberPrefixContext.class,0);
		}
		public TerminalNode K_MEMBER() { return getToken(KerMLv2Parser.K_MEMBER, 0); }
		public RuleFeatureElementContext ruleFeatureElement() {
			return getRuleContext(RuleFeatureElementContext.class,0);
		}
		public RuleTypeFeatureMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleTypeFeatureMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleTypeFeatureMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleTypeFeatureMember(this);
		}
	}

	public final RuleTypeFeatureMemberContext ruleTypeFeatureMember() throws RecognitionException {
		RuleTypeFeatureMemberContext _localctx = new RuleTypeFeatureMemberContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_ruleTypeFeatureMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			ruleMemberPrefix();
			setState(944);
			match(K_MEMBER);
			setState(945);
			ruleFeatureElement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedFeatureMemberContext extends ParserRuleContext {
		public RuleMemberPrefixContext ruleMemberPrefix() {
			return getRuleContext(RuleMemberPrefixContext.class,0);
		}
		public RuleFeatureElementContext ruleFeatureElement() {
			return getRuleContext(RuleFeatureElementContext.class,0);
		}
		public RuleOwnedFeatureMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOwnedFeatureMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleOwnedFeatureMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleOwnedFeatureMember(this);
		}
	}

	public final RuleOwnedFeatureMemberContext ruleOwnedFeatureMember() throws RecognitionException {
		RuleOwnedFeatureMemberContext _localctx = new RuleOwnedFeatureMemberContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_ruleOwnedFeatureMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(947);
			ruleMemberPrefix();
			setState(948);
			ruleFeatureElement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleSpecializationContext extends ParserRuleContext {
		public TerminalNode K_SUBTYPE() { return getToken(KerMLv2Parser.K_SUBTYPE, 0); }
		public RuleRelationshipBodyContext ruleRelationshipBody() {
			return getRuleContext(RuleRelationshipBodyContext.class,0);
		}
		public TerminalNode OP_COLON_RANGLE() { return getToken(KerMLv2Parser.OP_COLON_RANGLE, 0); }
		public TerminalNode K_SPECIALIZES() { return getToken(KerMLv2Parser.K_SPECIALIZES, 0); }
		public List<RuleQualifiedNameContext> ruleQualifiedName() {
			return getRuleContexts(RuleQualifiedNameContext.class);
		}
		public RuleQualifiedNameContext ruleQualifiedName(int i) {
			return getRuleContext(RuleQualifiedNameContext.class,i);
		}
		public List<RuleOwnedFeatureChainContext> ruleOwnedFeatureChain() {
			return getRuleContexts(RuleOwnedFeatureChainContext.class);
		}
		public RuleOwnedFeatureChainContext ruleOwnedFeatureChain(int i) {
			return getRuleContext(RuleOwnedFeatureChainContext.class,i);
		}
		public TerminalNode K_SPECIALIZATION() { return getToken(KerMLv2Parser.K_SPECIALIZATION, 0); }
		public RuleIdentificationContext ruleIdentification() {
			return getRuleContext(RuleIdentificationContext.class,0);
		}
		public RuleSpecializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSpecialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleSpecialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleSpecialization(this);
		}
	}

	public final RuleSpecializationContext ruleSpecialization() throws RecognitionException {
		RuleSpecializationContext _localctx = new RuleSpecializationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_ruleSpecialization);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_SPECIALIZATION) {
				{
				setState(950);
				match(K_SPECIALIZATION);
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 52776558133249L) != 0)) {
					{
					setState(951);
					ruleIdentification();
					}
				}

				}
			}

			setState(956);
			match(K_SUBTYPE);
			setState(959);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(957);
				ruleQualifiedName();
				}
				break;
			case 2:
				{
				setState(958);
				ruleOwnedFeatureChain();
				}
				break;
			}
			setState(961);
			_la = _input.LA(1);
			if ( !(_la==K_SPECIALIZES || _la==OP_COLON_RANGLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(964);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(962);
				ruleQualifiedName();
				}
				break;
			case 2:
				{
				setState(963);
				ruleOwnedFeatureChain();
				}
				break;
			}
			setState(966);
			ruleRelationshipBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedSpecializationContext extends ParserRuleContext {
		public RuleOwnedSpecializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOwnedSpecialization; }
	 
		public RuleOwnedSpecializationContext() { }
		public void copyFrom(RuleOwnedSpecializationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedSpecialization1Context extends RuleOwnedSpecializationContext {
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleOwnedSpecialization1Context(RuleOwnedSpecializationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleOwnedSpecialization1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleOwnedSpecialization1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedSpecialization2Context extends RuleOwnedSpecializationContext {
		public RuleOwnedFeatureChainContext ruleOwnedFeatureChain() {
			return getRuleContext(RuleOwnedFeatureChainContext.class,0);
		}
		public RuleOwnedSpecialization2Context(RuleOwnedSpecializationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleOwnedSpecialization2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleOwnedSpecialization2(this);
		}
	}

	public final RuleOwnedSpecializationContext ruleOwnedSpecialization() throws RecognitionException {
		RuleOwnedSpecializationContext _localctx = new RuleOwnedSpecializationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_ruleOwnedSpecialization);
		try {
			setState(970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				_localctx = new RuleOwnedSpecialization1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(968);
				ruleQualifiedName();
				}
				break;
			case 2:
				_localctx = new RuleOwnedSpecialization2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(969);
				ruleOwnedFeatureChain();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleConjugationContext extends ParserRuleContext {
		public TerminalNode K_CONJUGATE() { return getToken(KerMLv2Parser.K_CONJUGATE, 0); }
		public RuleRelationshipBodyContext ruleRelationshipBody() {
			return getRuleContext(RuleRelationshipBodyContext.class,0);
		}
		public TerminalNode OP_TILDE() { return getToken(KerMLv2Parser.OP_TILDE, 0); }
		public TerminalNode K_CONJUGATES() { return getToken(KerMLv2Parser.K_CONJUGATES, 0); }
		public List<RuleQualifiedNameContext> ruleQualifiedName() {
			return getRuleContexts(RuleQualifiedNameContext.class);
		}
		public RuleQualifiedNameContext ruleQualifiedName(int i) {
			return getRuleContext(RuleQualifiedNameContext.class,i);
		}
		public List<RuleOwnedFeatureChainContext> ruleOwnedFeatureChain() {
			return getRuleContexts(RuleOwnedFeatureChainContext.class);
		}
		public RuleOwnedFeatureChainContext ruleOwnedFeatureChain(int i) {
			return getRuleContext(RuleOwnedFeatureChainContext.class,i);
		}
		public TerminalNode K_CONJUGATION() { return getToken(KerMLv2Parser.K_CONJUGATION, 0); }
		public RuleIdentificationContext ruleIdentification() {
			return getRuleContext(RuleIdentificationContext.class,0);
		}
		public RuleConjugationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleConjugation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleConjugation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleConjugation(this);
		}
	}

	public final RuleConjugationContext ruleConjugation() throws RecognitionException {
		RuleConjugationContext _localctx = new RuleConjugationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_ruleConjugation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONJUGATION) {
				{
				setState(972);
				match(K_CONJUGATION);
				setState(974);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 52776558133249L) != 0)) {
					{
					setState(973);
					ruleIdentification();
					}
				}

				}
			}

			setState(978);
			match(K_CONJUGATE);
			setState(981);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(979);
				ruleQualifiedName();
				}
				break;
			case 2:
				{
				setState(980);
				ruleOwnedFeatureChain();
				}
				break;
			}
			setState(983);
			_la = _input.LA(1);
			if ( !(_la==K_CONJUGATES || _la==OP_TILDE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(986);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(984);
				ruleQualifiedName();
				}
				break;
			case 2:
				{
				setState(985);
				ruleOwnedFeatureChain();
				}
				break;
			}
			setState(988);
			ruleRelationshipBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedConjugationContext extends ParserRuleContext {
		public RuleOwnedConjugationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOwnedConjugation; }
	 
		public RuleOwnedConjugationContext() { }
		public void copyFrom(RuleOwnedConjugationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedConjugation2Context extends RuleOwnedConjugationContext {
		public RuleOwnedFeatureChainContext ruleOwnedFeatureChain() {
			return getRuleContext(RuleOwnedFeatureChainContext.class,0);
		}
		public RuleOwnedConjugation2Context(RuleOwnedConjugationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleOwnedConjugation2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleOwnedConjugation2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedConjugation1Context extends RuleOwnedConjugationContext {
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleOwnedConjugation1Context(RuleOwnedConjugationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleOwnedConjugation1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleOwnedConjugation1(this);
		}
	}

	public final RuleOwnedConjugationContext ruleOwnedConjugation() throws RecognitionException {
		RuleOwnedConjugationContext _localctx = new RuleOwnedConjugationContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_ruleOwnedConjugation);
		try {
			setState(992);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				_localctx = new RuleOwnedConjugation1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(990);
				ruleQualifiedName();
				}
				break;
			case 2:
				_localctx = new RuleOwnedConjugation2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(991);
				ruleOwnedFeatureChain();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleDisjoiningContext extends ParserRuleContext {
		public TerminalNode K_DISJOINT() { return getToken(KerMLv2Parser.K_DISJOINT, 0); }
		public TerminalNode K_FROM() { return getToken(KerMLv2Parser.K_FROM, 0); }
		public RuleRelationshipBodyContext ruleRelationshipBody() {
			return getRuleContext(RuleRelationshipBodyContext.class,0);
		}
		public List<RuleQualifiedNameContext> ruleQualifiedName() {
			return getRuleContexts(RuleQualifiedNameContext.class);
		}
		public RuleQualifiedNameContext ruleQualifiedName(int i) {
			return getRuleContext(RuleQualifiedNameContext.class,i);
		}
		public List<RuleOwnedFeatureChainContext> ruleOwnedFeatureChain() {
			return getRuleContexts(RuleOwnedFeatureChainContext.class);
		}
		public RuleOwnedFeatureChainContext ruleOwnedFeatureChain(int i) {
			return getRuleContext(RuleOwnedFeatureChainContext.class,i);
		}
		public TerminalNode K_DISJOINING() { return getToken(KerMLv2Parser.K_DISJOINING, 0); }
		public RuleIdentificationContext ruleIdentification() {
			return getRuleContext(RuleIdentificationContext.class,0);
		}
		public RuleDisjoiningContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleDisjoining; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleDisjoining(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleDisjoining(this);
		}
	}

	public final RuleDisjoiningContext ruleDisjoining() throws RecognitionException {
		RuleDisjoiningContext _localctx = new RuleDisjoiningContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_ruleDisjoining);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DISJOINING) {
				{
				setState(994);
				match(K_DISJOINING);
				setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 52776558133249L) != 0)) {
					{
					setState(995);
					ruleIdentification();
					}
				}

				}
			}

			setState(1000);
			match(K_DISJOINT);
			setState(1003);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(1001);
				ruleQualifiedName();
				}
				break;
			case 2:
				{
				setState(1002);
				ruleOwnedFeatureChain();
				}
				break;
			}
			setState(1005);
			match(K_FROM);
			setState(1008);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(1006);
				ruleQualifiedName();
				}
				break;
			case 2:
				{
				setState(1007);
				ruleOwnedFeatureChain();
				}
				break;
			}
			setState(1010);
			ruleRelationshipBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedDisjoiningContext extends ParserRuleContext {
		public RuleOwnedDisjoiningContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOwnedDisjoining; }
	 
		public RuleOwnedDisjoiningContext() { }
		public void copyFrom(RuleOwnedDisjoiningContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedDisjoining1Context extends RuleOwnedDisjoiningContext {
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleOwnedDisjoining1Context(RuleOwnedDisjoiningContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleOwnedDisjoining1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleOwnedDisjoining1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedDisjoining2Context extends RuleOwnedDisjoiningContext {
		public RuleOwnedFeatureChainContext ruleOwnedFeatureChain() {
			return getRuleContext(RuleOwnedFeatureChainContext.class,0);
		}
		public RuleOwnedDisjoining2Context(RuleOwnedDisjoiningContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleOwnedDisjoining2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleOwnedDisjoining2(this);
		}
	}

	public final RuleOwnedDisjoiningContext ruleOwnedDisjoining() throws RecognitionException {
		RuleOwnedDisjoiningContext _localctx = new RuleOwnedDisjoiningContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_ruleOwnedDisjoining);
		try {
			setState(1014);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				_localctx = new RuleOwnedDisjoining1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1012);
				ruleQualifiedName();
				}
				break;
			case 2:
				_localctx = new RuleOwnedDisjoining2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1013);
				ruleOwnedFeatureChain();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleUnioningContext extends ParserRuleContext {
		public RuleUnioningContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleUnioning; }
	 
		public RuleUnioningContext() { }
		public void copyFrom(RuleUnioningContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleUnioning1Context extends RuleUnioningContext {
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleUnioning1Context(RuleUnioningContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleUnioning1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleUnioning1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleUnioning2Context extends RuleUnioningContext {
		public RuleOwnedFeatureChainContext ruleOwnedFeatureChain() {
			return getRuleContext(RuleOwnedFeatureChainContext.class,0);
		}
		public RuleUnioning2Context(RuleUnioningContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleUnioning2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleUnioning2(this);
		}
	}

	public final RuleUnioningContext ruleUnioning() throws RecognitionException {
		RuleUnioningContext _localctx = new RuleUnioningContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_ruleUnioning);
		try {
			setState(1018);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				_localctx = new RuleUnioning1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1016);
				ruleQualifiedName();
				}
				break;
			case 2:
				_localctx = new RuleUnioning2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1017);
				ruleOwnedFeatureChain();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleIntersectingContext extends ParserRuleContext {
		public RuleIntersectingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleIntersecting; }
	 
		public RuleIntersectingContext() { }
		public void copyFrom(RuleIntersectingContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleIntersecting1Context extends RuleIntersectingContext {
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleIntersecting1Context(RuleIntersectingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleIntersecting1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleIntersecting1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleIntersecting2Context extends RuleIntersectingContext {
		public RuleOwnedFeatureChainContext ruleOwnedFeatureChain() {
			return getRuleContext(RuleOwnedFeatureChainContext.class,0);
		}
		public RuleIntersecting2Context(RuleIntersectingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleIntersecting2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleIntersecting2(this);
		}
	}

	public final RuleIntersectingContext ruleIntersecting() throws RecognitionException {
		RuleIntersectingContext _localctx = new RuleIntersectingContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_ruleIntersecting);
		try {
			setState(1022);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				_localctx = new RuleIntersecting1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1020);
				ruleQualifiedName();
				}
				break;
			case 2:
				_localctx = new RuleIntersecting2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1021);
				ruleOwnedFeatureChain();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleDifferencingContext extends ParserRuleContext {
		public RuleDifferencingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleDifferencing; }
	 
		public RuleDifferencingContext() { }
		public void copyFrom(RuleDifferencingContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleDifferencing1Context extends RuleDifferencingContext {
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleDifferencing1Context(RuleDifferencingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleDifferencing1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleDifferencing1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleDifferencing2Context extends RuleDifferencingContext {
		public RuleOwnedFeatureChainContext ruleOwnedFeatureChain() {
			return getRuleContext(RuleOwnedFeatureChainContext.class,0);
		}
		public RuleDifferencing2Context(RuleDifferencingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleDifferencing2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleDifferencing2(this);
		}
	}

	public final RuleDifferencingContext ruleDifferencing() throws RecognitionException {
		RuleDifferencingContext _localctx = new RuleDifferencingContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_ruleDifferencing);
		try {
			setState(1026);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				_localctx = new RuleDifferencing1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1024);
				ruleQualifiedName();
				}
				break;
			case 2:
				_localctx = new RuleDifferencing2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1025);
				ruleOwnedFeatureChain();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleClassifierContext extends ParserRuleContext {
		public RuleTypePrefixContext ruleTypePrefix() {
			return getRuleContext(RuleTypePrefixContext.class,0);
		}
		public TerminalNode K_CLASSIFIER() { return getToken(KerMLv2Parser.K_CLASSIFIER, 0); }
		public RuleClassifierDeclarationContext ruleClassifierDeclaration() {
			return getRuleContext(RuleClassifierDeclarationContext.class,0);
		}
		public RuleTypeBodyContext ruleTypeBody() {
			return getRuleContext(RuleTypeBodyContext.class,0);
		}
		public RuleClassifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleClassifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleClassifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleClassifier(this);
		}
	}

	public final RuleClassifierContext ruleClassifier() throws RecognitionException {
		RuleClassifierContext _localctx = new RuleClassifierContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_ruleClassifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			ruleTypePrefix();
			setState(1029);
			match(K_CLASSIFIER);
			setState(1030);
			ruleClassifierDeclaration();
			setState(1031);
			ruleTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleClassifierDeclarationContext extends ParserRuleContext {
		public TerminalNode K_ALL() { return getToken(KerMLv2Parser.K_ALL, 0); }
		public RuleIdentificationContext ruleIdentification() {
			return getRuleContext(RuleIdentificationContext.class,0);
		}
		public RuleOwnedMultiplicityContext ruleOwnedMultiplicity() {
			return getRuleContext(RuleOwnedMultiplicityContext.class,0);
		}
		public RuleSuperclassingPartContext ruleSuperclassingPart() {
			return getRuleContext(RuleSuperclassingPartContext.class,0);
		}
		public RuleClassifierConjugationPartContext ruleClassifierConjugationPart() {
			return getRuleContext(RuleClassifierConjugationPartContext.class,0);
		}
		public List<RuleTypeRelationshipPartContext> ruleTypeRelationshipPart() {
			return getRuleContexts(RuleTypeRelationshipPartContext.class);
		}
		public RuleTypeRelationshipPartContext ruleTypeRelationshipPart(int i) {
			return getRuleContext(RuleTypeRelationshipPartContext.class,i);
		}
		public RuleClassifierDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleClassifierDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleClassifierDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleClassifierDeclaration(this);
		}
	}

	public final RuleClassifierDeclarationContext ruleClassifierDeclaration() throws RecognitionException {
		RuleClassifierDeclarationContext _localctx = new RuleClassifierDeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_ruleClassifierDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1034);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ALL) {
				{
				setState(1033);
				match(K_ALL);
				}
			}

			setState(1037);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 52776558133249L) != 0)) {
				{
				setState(1036);
				ruleIdentification();
				}
			}

			setState(1040);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQUARE) {
				{
				setState(1039);
				ruleOwnedMultiplicity();
				}
			}

			setState(1044);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SPECIALIZES:
			case OP_COLON_RANGLE:
				{
				setState(1042);
				ruleSuperclassingPart();
				}
				break;
			case K_CONJUGATES:
			case OP_TILDE:
				{
				setState(1043);
				ruleClassifierConjugationPart();
				}
				break;
			case K_DISJOINT:
			case K_UNIONS:
			case K_INTERSECTS:
			case K_DIFFERENCES:
			case LBRACE:
			case OP_SEMI:
				break;
			default:
				break;
			}
			setState(1049);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 125829120L) != 0)) {
				{
				{
				setState(1046);
				ruleTypeRelationshipPart();
				}
				}
				setState(1051);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleSuperclassingPartContext extends ParserRuleContext {
		public List<RuleOwnedsubclassificationContext> ruleOwnedsubclassification() {
			return getRuleContexts(RuleOwnedsubclassificationContext.class);
		}
		public RuleOwnedsubclassificationContext ruleOwnedsubclassification(int i) {
			return getRuleContext(RuleOwnedsubclassificationContext.class,i);
		}
		public TerminalNode OP_COLON_RANGLE() { return getToken(KerMLv2Parser.OP_COLON_RANGLE, 0); }
		public TerminalNode K_SPECIALIZES() { return getToken(KerMLv2Parser.K_SPECIALIZES, 0); }
		public List<TerminalNode> OP_COMMA() { return getTokens(KerMLv2Parser.OP_COMMA); }
		public TerminalNode OP_COMMA(int i) {
			return getToken(KerMLv2Parser.OP_COMMA, i);
		}
		public RuleSuperclassingPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSuperclassingPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleSuperclassingPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleSuperclassingPart(this);
		}
	}

	public final RuleSuperclassingPartContext ruleSuperclassingPart() throws RecognitionException {
		RuleSuperclassingPartContext _localctx = new RuleSuperclassingPartContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_ruleSuperclassingPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
			_la = _input.LA(1);
			if ( !(_la==K_SPECIALIZES || _la==OP_COLON_RANGLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1053);
			ruleOwnedsubclassification();
			setState(1058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_COMMA) {
				{
				{
				setState(1054);
				match(OP_COMMA);
				setState(1055);
				ruleOwnedsubclassification();
				}
				}
				setState(1060);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleClassifierConjugationPartContext extends ParserRuleContext {
		public RuleClassifierConjugationContext ruleClassifierConjugation() {
			return getRuleContext(RuleClassifierConjugationContext.class,0);
		}
		public TerminalNode OP_TILDE() { return getToken(KerMLv2Parser.OP_TILDE, 0); }
		public TerminalNode K_CONJUGATES() { return getToken(KerMLv2Parser.K_CONJUGATES, 0); }
		public RuleClassifierConjugationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleClassifierConjugationPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleClassifierConjugationPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleClassifierConjugationPart(this);
		}
	}

	public final RuleClassifierConjugationPartContext ruleClassifierConjugationPart() throws RecognitionException {
		RuleClassifierConjugationPartContext _localctx = new RuleClassifierConjugationPartContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_ruleClassifierConjugationPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1061);
			_la = _input.LA(1);
			if ( !(_la==K_CONJUGATES || _la==OP_TILDE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1062);
			ruleClassifierConjugation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleSubclassificationContext extends ParserRuleContext {
		public TerminalNode K_SUBCLASSIFIER() { return getToken(KerMLv2Parser.K_SUBCLASSIFIER, 0); }
		public List<RuleQualifiedNameContext> ruleQualifiedName() {
			return getRuleContexts(RuleQualifiedNameContext.class);
		}
		public RuleQualifiedNameContext ruleQualifiedName(int i) {
			return getRuleContext(RuleQualifiedNameContext.class,i);
		}
		public RuleRelationshipBodyContext ruleRelationshipBody() {
			return getRuleContext(RuleRelationshipBodyContext.class,0);
		}
		public TerminalNode OP_COLON_RANGLE() { return getToken(KerMLv2Parser.OP_COLON_RANGLE, 0); }
		public TerminalNode K_SPECIALIZES() { return getToken(KerMLv2Parser.K_SPECIALIZES, 0); }
		public TerminalNode K_SPECIALIZATION() { return getToken(KerMLv2Parser.K_SPECIALIZATION, 0); }
		public RuleIdentificationContext ruleIdentification() {
			return getRuleContext(RuleIdentificationContext.class,0);
		}
		public RuleSubclassificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSubclassification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleSubclassification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleSubclassification(this);
		}
	}

	public final RuleSubclassificationContext ruleSubclassification() throws RecognitionException {
		RuleSubclassificationContext _localctx = new RuleSubclassificationContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_ruleSubclassification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_SPECIALIZATION) {
				{
				setState(1064);
				match(K_SPECIALIZATION);
				setState(1066);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 52776558133249L) != 0)) {
					{
					setState(1065);
					ruleIdentification();
					}
				}

				}
			}

			setState(1070);
			match(K_SUBCLASSIFIER);
			setState(1071);
			ruleQualifiedName();
			setState(1072);
			_la = _input.LA(1);
			if ( !(_la==K_SPECIALIZES || _la==OP_COLON_RANGLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1073);
			ruleQualifiedName();
			setState(1074);
			ruleRelationshipBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedsubclassificationContext extends ParserRuleContext {
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleOwnedsubclassificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOwnedsubclassification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleOwnedsubclassification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleOwnedsubclassification(this);
		}
	}

	public final RuleOwnedsubclassificationContext ruleOwnedsubclassification() throws RecognitionException {
		RuleOwnedsubclassificationContext _localctx = new RuleOwnedsubclassificationContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_ruleOwnedsubclassification);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			ruleQualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleClassifierConjugationContext extends ParserRuleContext {
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleClassifierConjugationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleClassifierConjugation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleClassifierConjugation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleClassifierConjugation(this);
		}
	}

	public final RuleClassifierConjugationContext ruleClassifierConjugation() throws RecognitionException {
		RuleClassifierConjugationContext _localctx = new RuleClassifierConjugationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_ruleClassifierConjugation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1078);
			ruleQualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeaturePrefixContext extends ParserRuleContext {
		public RuleFeatureDirectionContext ruleFeatureDirection() {
			return getRuleContext(RuleFeatureDirectionContext.class,0);
		}
		public TerminalNode K_ABSTRACT() { return getToken(KerMLv2Parser.K_ABSTRACT, 0); }
		public TerminalNode K_READONLY() { return getToken(KerMLv2Parser.K_READONLY, 0); }
		public TerminalNode K_DERIVED() { return getToken(KerMLv2Parser.K_DERIVED, 0); }
		public TerminalNode K_END() { return getToken(KerMLv2Parser.K_END, 0); }
		public List<RulePrefixMetadataMemberContext> rulePrefixMetadataMember() {
			return getRuleContexts(RulePrefixMetadataMemberContext.class);
		}
		public RulePrefixMetadataMemberContext rulePrefixMetadataMember(int i) {
			return getRuleContext(RulePrefixMetadataMemberContext.class,i);
		}
		public TerminalNode K_COMPOSITE() { return getToken(KerMLv2Parser.K_COMPOSITE, 0); }
		public TerminalNode K_PORTION() { return getToken(KerMLv2Parser.K_PORTION, 0); }
		public RuleFeaturePrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFeaturePrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeaturePrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeaturePrefix(this);
		}
	}

	public final RuleFeaturePrefixContext ruleFeaturePrefix() throws RecognitionException {
		RuleFeaturePrefixContext _localctx = new RuleFeaturePrefixContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_ruleFeaturePrefix);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1081);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 7L) != 0)) {
				{
				setState(1080);
				ruleFeatureDirection();
				}
			}

			setState(1084);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ABSTRACT) {
				{
				setState(1083);
				match(K_ABSTRACT);
				}
			}

			setState(1087);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COMPOSITE || _la==K_PORTION) {
				{
				setState(1086);
				_la = _input.LA(1);
				if ( !(_la==K_COMPOSITE || _la==K_PORTION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1090);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_READONLY) {
				{
				setState(1089);
				match(K_READONLY);
				}
			}

			setState(1093);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DERIVED) {
				{
				setState(1092);
				match(K_DERIVED);
				}
			}

			setState(1096);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_END) {
				{
				setState(1095);
				match(K_END);
				}
			}

			setState(1101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1098);
					rulePrefixMetadataMember();
					}
					} 
				}
				setState(1103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureContext extends ParserRuleContext {
		public RuleFeaturePrefixContext ruleFeaturePrefix() {
			return getRuleContext(RuleFeaturePrefixContext.class,0);
		}
		public RuleTypeBodyContext ruleTypeBody() {
			return getRuleContext(RuleTypeBodyContext.class,0);
		}
		public RuleFeatureDeclarationContext ruleFeatureDeclaration() {
			return getRuleContext(RuleFeatureDeclarationContext.class,0);
		}
		public RulePrefixMetadataMemberContext rulePrefixMetadataMember() {
			return getRuleContext(RulePrefixMetadataMemberContext.class,0);
		}
		public TerminalNode K_FEATURE() { return getToken(KerMLv2Parser.K_FEATURE, 0); }
		public RuleValuePartContext ruleValuePart() {
			return getRuleContext(RuleValuePartContext.class,0);
		}
		public RuleFeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFeature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeature(this);
		}
	}

	public final RuleFeatureContext ruleFeature() throws RecognitionException {
		RuleFeatureContext _localctx = new RuleFeatureContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_ruleFeature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1104);
			ruleFeaturePrefix();
			setState(1111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(1106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FEATURE) {
					{
					setState(1105);
					match(K_FEATURE);
					}
				}

				setState(1108);
				ruleFeatureDeclaration();
				}
				break;
			case 2:
				{
				setState(1109);
				rulePrefixMetadataMember();
				}
				break;
			case 3:
				{
				setState(1110);
				match(K_FEATURE);
				}
				break;
			}
			setState(1114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 6917529027641081857L) != 0)) {
				{
				setState(1113);
				ruleValuePart();
				}
			}

			setState(1116);
			ruleTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureDeclarationContext extends ParserRuleContext {
		public RuleIdentificationContext ruleIdentification() {
			return getRuleContext(RuleIdentificationContext.class,0);
		}
		public RuleFeatureSpecializationPartContext ruleFeatureSpecializationPart() {
			return getRuleContext(RuleFeatureSpecializationPartContext.class,0);
		}
		public RuleFeatureConjugationPartContext ruleFeatureConjugationPart() {
			return getRuleContext(RuleFeatureConjugationPartContext.class,0);
		}
		public TerminalNode K_ALL() { return getToken(KerMLv2Parser.K_ALL, 0); }
		public List<RuleFeatureRelationshipPartContext> ruleFeatureRelationshipPart() {
			return getRuleContexts(RuleFeatureRelationshipPartContext.class);
		}
		public RuleFeatureRelationshipPartContext ruleFeatureRelationshipPart(int i) {
			return getRuleContext(RuleFeatureRelationshipPartContext.class,i);
		}
		public RuleFeatureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFeatureDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureDeclaration(this);
		}
	}

	public final RuleFeatureDeclarationContext ruleFeatureDeclaration() throws RecognitionException {
		RuleFeatureDeclarationContext _localctx = new RuleFeatureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_ruleFeatureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ALL) {
				{
				setState(1118);
				match(K_ALL);
				}
			}

			setState(1128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LANGLE:
			case RULE_ID:
			case RULE_UNRESTRICTED_NAME:
				{
				setState(1121);
				ruleIdentification();
				setState(1124);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ORDERED:
				case K_NONUNIQUE:
				case K_TYPED:
				case K_SUBSETS:
				case K_REFERENCES:
				case K_REDEFINES:
				case LSQUARE:
				case OP_COLON_RANGLE:
				case OP_COLON:
				case OP_COLON_COLON_RANGLE:
				case OP_COLON_RANGLE_RANGLE:
					{
					setState(1122);
					ruleFeatureSpecializationPart();
					}
					break;
				case K_CONJUGATES:
				case OP_TILDE:
					{
					setState(1123);
					ruleFeatureConjugationPart();
					}
					break;
				case K_FROM:
				case K_DISJOINT:
				case K_UNIONS:
				case K_INTERSECTS:
				case K_DIFFERENCES:
				case K_CHAINS:
				case K_INVERSE:
				case K_OF:
				case K_FEATURED:
				case K_DEFAULT:
				case K_FIRST:
				case LBRACE:
				case LPAREN:
				case OP_SEMI:
				case OP_EQ:
				case OP_COLON_EQ:
					break;
				default:
					break;
				}
				}
				break;
			case K_ORDERED:
			case K_NONUNIQUE:
			case K_TYPED:
			case K_SUBSETS:
			case K_REFERENCES:
			case K_REDEFINES:
			case LSQUARE:
			case OP_COLON_RANGLE:
			case OP_COLON:
			case OP_COLON_COLON_RANGLE:
			case OP_COLON_RANGLE_RANGLE:
				{
				setState(1126);
				ruleFeatureSpecializationPart();
				}
				break;
			case K_CONJUGATES:
			case OP_TILDE:
				{
				setState(1127);
				ruleFeatureConjugationPart();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 24189381640192L) != 0)) {
				{
				{
				setState(1130);
				ruleFeatureRelationshipPart();
				}
				}
				setState(1135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureRelationshipPartContext extends ParserRuleContext {
		public RuleFeatureRelationshipPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFeatureRelationshipPart; }
	 
		public RuleFeatureRelationshipPartContext() { }
		public void copyFrom(RuleFeatureRelationshipPartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureRelationshipPart4Context extends RuleFeatureRelationshipPartContext {
		public RuleTypeFeaturingPartContext ruleTypeFeaturingPart() {
			return getRuleContext(RuleTypeFeaturingPartContext.class,0);
		}
		public RuleFeatureRelationshipPart4Context(RuleFeatureRelationshipPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureRelationshipPart4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureRelationshipPart4(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureRelationshipPart3Context extends RuleFeatureRelationshipPartContext {
		public RuleInvertingPartContext ruleInvertingPart() {
			return getRuleContext(RuleInvertingPartContext.class,0);
		}
		public RuleFeatureRelationshipPart3Context(RuleFeatureRelationshipPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureRelationshipPart3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureRelationshipPart3(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureRelationshipPart2Context extends RuleFeatureRelationshipPartContext {
		public RuleChainingPartContext ruleChainingPart() {
			return getRuleContext(RuleChainingPartContext.class,0);
		}
		public RuleFeatureRelationshipPart2Context(RuleFeatureRelationshipPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureRelationshipPart2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureRelationshipPart2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureRelationshipPart1Context extends RuleFeatureRelationshipPartContext {
		public RuleTypeRelationshipPartContext ruleTypeRelationshipPart() {
			return getRuleContext(RuleTypeRelationshipPartContext.class,0);
		}
		public RuleFeatureRelationshipPart1Context(RuleFeatureRelationshipPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureRelationshipPart1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureRelationshipPart1(this);
		}
	}

	public final RuleFeatureRelationshipPartContext ruleFeatureRelationshipPart() throws RecognitionException {
		RuleFeatureRelationshipPartContext _localctx = new RuleFeatureRelationshipPartContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_ruleFeatureRelationshipPart);
		try {
			setState(1140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DISJOINT:
			case K_UNIONS:
			case K_INTERSECTS:
			case K_DIFFERENCES:
				_localctx = new RuleFeatureRelationshipPart1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1136);
				ruleTypeRelationshipPart();
				}
				break;
			case K_CHAINS:
				_localctx = new RuleFeatureRelationshipPart2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1137);
				ruleChainingPart();
				}
				break;
			case K_INVERSE:
				_localctx = new RuleFeatureRelationshipPart3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1138);
				ruleInvertingPart();
				}
				break;
			case K_FEATURED:
				_localctx = new RuleFeatureRelationshipPart4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1139);
				ruleTypeFeaturingPart();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleChainingPartContext extends ParserRuleContext {
		public TerminalNode K_CHAINS() { return getToken(KerMLv2Parser.K_CHAINS, 0); }
		public RuleOwnedFeatureChainingContext ruleOwnedFeatureChaining() {
			return getRuleContext(RuleOwnedFeatureChainingContext.class,0);
		}
		public RuleFeatureChainContext ruleFeatureChain() {
			return getRuleContext(RuleFeatureChainContext.class,0);
		}
		public RuleChainingPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleChainingPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleChainingPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleChainingPart(this);
		}
	}

	public final RuleChainingPartContext ruleChainingPart() throws RecognitionException {
		RuleChainingPartContext _localctx = new RuleChainingPartContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_ruleChainingPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1142);
			match(K_CHAINS);
			setState(1145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(1143);
				ruleOwnedFeatureChaining();
				}
				break;
			case 2:
				{
				setState(1144);
				ruleFeatureChain();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleInvertingPartContext extends ParserRuleContext {
		public TerminalNode K_INVERSE() { return getToken(KerMLv2Parser.K_INVERSE, 0); }
		public TerminalNode K_OF() { return getToken(KerMLv2Parser.K_OF, 0); }
		public RuleOwnedFeatureInvertingContext ruleOwnedFeatureInverting() {
			return getRuleContext(RuleOwnedFeatureInvertingContext.class,0);
		}
		public RuleInvertingPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleInvertingPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleInvertingPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleInvertingPart(this);
		}
	}

	public final RuleInvertingPartContext ruleInvertingPart() throws RecognitionException {
		RuleInvertingPartContext _localctx = new RuleInvertingPartContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_ruleInvertingPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			match(K_INVERSE);
			setState(1148);
			match(K_OF);
			setState(1149);
			ruleOwnedFeatureInverting();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleTypeFeaturingPartContext extends ParserRuleContext {
		public TerminalNode K_FEATURED() { return getToken(KerMLv2Parser.K_FEATURED, 0); }
		public TerminalNode K_BY() { return getToken(KerMLv2Parser.K_BY, 0); }
		public List<RuleOwnedTypeFeaturingContext> ruleOwnedTypeFeaturing() {
			return getRuleContexts(RuleOwnedTypeFeaturingContext.class);
		}
		public RuleOwnedTypeFeaturingContext ruleOwnedTypeFeaturing(int i) {
			return getRuleContext(RuleOwnedTypeFeaturingContext.class,i);
		}
		public List<TerminalNode> OP_COMMA() { return getTokens(KerMLv2Parser.OP_COMMA); }
		public TerminalNode OP_COMMA(int i) {
			return getToken(KerMLv2Parser.OP_COMMA, i);
		}
		public RuleTypeFeaturingPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleTypeFeaturingPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleTypeFeaturingPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleTypeFeaturingPart(this);
		}
	}

	public final RuleTypeFeaturingPartContext ruleTypeFeaturingPart() throws RecognitionException {
		RuleTypeFeaturingPartContext _localctx = new RuleTypeFeaturingPartContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_ruleTypeFeaturingPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			match(K_FEATURED);
			setState(1152);
			match(K_BY);
			setState(1153);
			ruleOwnedTypeFeaturing();
			setState(1158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_COMMA) {
				{
				{
				setState(1154);
				match(OP_COMMA);
				setState(1155);
				ruleOwnedTypeFeaturing();
				}
				}
				setState(1160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureSpecializationPartContext extends ParserRuleContext {
		public RuleFeatureSpecializationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFeatureSpecializationPart; }
	 
		public RuleFeatureSpecializationPartContext() { }
		public void copyFrom(RuleFeatureSpecializationPartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureSpecializationPart1Context extends RuleFeatureSpecializationPartContext {
		public List<RuleFeatureSpecializationContext> ruleFeatureSpecialization() {
			return getRuleContexts(RuleFeatureSpecializationContext.class);
		}
		public RuleFeatureSpecializationContext ruleFeatureSpecialization(int i) {
			return getRuleContext(RuleFeatureSpecializationContext.class,i);
		}
		public RuleMultiplicityPartContext ruleMultiplicityPart() {
			return getRuleContext(RuleMultiplicityPartContext.class,0);
		}
		public RuleFeatureSpecializationPart1Context(RuleFeatureSpecializationPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureSpecializationPart1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureSpecializationPart1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureSpecializationPart2Context extends RuleFeatureSpecializationPartContext {
		public RuleMultiplicityPartContext ruleMultiplicityPart() {
			return getRuleContext(RuleMultiplicityPartContext.class,0);
		}
		public List<RuleFeatureSpecializationContext> ruleFeatureSpecialization() {
			return getRuleContexts(RuleFeatureSpecializationContext.class);
		}
		public RuleFeatureSpecializationContext ruleFeatureSpecialization(int i) {
			return getRuleContext(RuleFeatureSpecializationContext.class,i);
		}
		public RuleFeatureSpecializationPart2Context(RuleFeatureSpecializationPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureSpecializationPart2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureSpecializationPart2(this);
		}
	}

	public final RuleFeatureSpecializationPartContext ruleFeatureSpecializationPart() throws RecognitionException {
		RuleFeatureSpecializationPartContext _localctx = new RuleFeatureSpecializationPartContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_ruleFeatureSpecializationPart);
		int _la;
		try {
			int _alt;
			setState(1182);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_TYPED:
			case K_SUBSETS:
			case K_REFERENCES:
			case K_REDEFINES:
			case OP_COLON_RANGLE:
			case OP_COLON:
			case OP_COLON_COLON_RANGLE:
			case OP_COLON_RANGLE_RANGLE:
				_localctx = new RuleFeatureSpecializationPart1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1162); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1161);
						ruleFeatureSpecialization();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1164); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 576460752303423491L) != 0)) {
					{
					setState(1166);
					ruleMultiplicityPart();
					}
				}

				setState(1172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4222124650659840L) != 0) || ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 29L) != 0)) {
					{
					{
					setState(1169);
					ruleFeatureSpecialization();
					}
					}
					setState(1174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case K_ORDERED:
			case K_NONUNIQUE:
			case LSQUARE:
				_localctx = new RuleFeatureSpecializationPart2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1175);
				ruleMultiplicityPart();
				setState(1179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4222124650659840L) != 0) || ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 29L) != 0)) {
					{
					{
					setState(1176);
					ruleFeatureSpecialization();
					}
					}
					setState(1181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleMultiplicityPartContext extends ParserRuleContext {
		public RuleMultiplicityPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleMultiplicityPart; }
	 
		public RuleMultiplicityPartContext() { }
		public void copyFrom(RuleMultiplicityPartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleMultiplicityPart1Context extends RuleMultiplicityPartContext {
		public RuleOwnedMultiplicityContext ruleOwnedMultiplicity() {
			return getRuleContext(RuleOwnedMultiplicityContext.class,0);
		}
		public RuleMultiplicityPart1Context(RuleMultiplicityPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleMultiplicityPart1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleMultiplicityPart1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleMultiplicityPart2Context extends RuleMultiplicityPartContext {
		public TerminalNode K_ORDERED() { return getToken(KerMLv2Parser.K_ORDERED, 0); }
		public TerminalNode K_NONUNIQUE() { return getToken(KerMLv2Parser.K_NONUNIQUE, 0); }
		public RuleOwnedMultiplicityContext ruleOwnedMultiplicity() {
			return getRuleContext(RuleOwnedMultiplicityContext.class,0);
		}
		public RuleMultiplicityPart2Context(RuleMultiplicityPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleMultiplicityPart2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleMultiplicityPart2(this);
		}
	}

	public final RuleMultiplicityPartContext ruleMultiplicityPart() throws RecognitionException {
		RuleMultiplicityPartContext _localctx = new RuleMultiplicityPartContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_ruleMultiplicityPart);
		int _la;
		try {
			setState(1198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				_localctx = new RuleMultiplicityPart1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1184);
				ruleOwnedMultiplicity();
				}
				break;
			case 2:
				_localctx = new RuleMultiplicityPart2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(1185);
					ruleOwnedMultiplicity();
					}
				}

				setState(1196);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ORDERED:
					{
					setState(1188);
					match(K_ORDERED);
					setState(1190);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NONUNIQUE) {
						{
						setState(1189);
						match(K_NONUNIQUE);
						}
					}

					}
					break;
				case K_NONUNIQUE:
					{
					setState(1192);
					match(K_NONUNIQUE);
					setState(1194);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_ORDERED) {
						{
						setState(1193);
						match(K_ORDERED);
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureSpecializationContext extends ParserRuleContext {
		public RuleFeatureSpecializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFeatureSpecialization; }
	 
		public RuleFeatureSpecializationContext() { }
		public void copyFrom(RuleFeatureSpecializationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureSpecialization1Context extends RuleFeatureSpecializationContext {
		public RuleTypingsContext ruleTypings() {
			return getRuleContext(RuleTypingsContext.class,0);
		}
		public RuleFeatureSpecialization1Context(RuleFeatureSpecializationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureSpecialization1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureSpecialization1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureSpecialization2Context extends RuleFeatureSpecializationContext {
		public RuleSubsettingsContext ruleSubsettings() {
			return getRuleContext(RuleSubsettingsContext.class,0);
		}
		public RuleFeatureSpecialization2Context(RuleFeatureSpecializationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureSpecialization2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureSpecialization2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureSpecialization3Context extends RuleFeatureSpecializationContext {
		public RuleReferencesContext ruleReferences() {
			return getRuleContext(RuleReferencesContext.class,0);
		}
		public RuleFeatureSpecialization3Context(RuleFeatureSpecializationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureSpecialization3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureSpecialization3(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureSpecialization4Context extends RuleFeatureSpecializationContext {
		public RuleRedefinitionsContext ruleRedefinitions() {
			return getRuleContext(RuleRedefinitionsContext.class,0);
		}
		public RuleFeatureSpecialization4Context(RuleFeatureSpecializationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureSpecialization4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureSpecialization4(this);
		}
	}

	public final RuleFeatureSpecializationContext ruleFeatureSpecialization() throws RecognitionException {
		RuleFeatureSpecializationContext _localctx = new RuleFeatureSpecializationContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_ruleFeatureSpecialization);
		try {
			setState(1204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_TYPED:
			case OP_COLON:
				_localctx = new RuleFeatureSpecialization1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1200);
				ruleTypings();
				}
				break;
			case K_SUBSETS:
			case OP_COLON_RANGLE:
				_localctx = new RuleFeatureSpecialization2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1201);
				ruleSubsettings();
				}
				break;
			case K_REFERENCES:
			case OP_COLON_COLON_RANGLE:
				_localctx = new RuleFeatureSpecialization3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1202);
				ruleReferences();
				}
				break;
			case K_REDEFINES:
			case OP_COLON_RANGLE_RANGLE:
				_localctx = new RuleFeatureSpecialization4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1203);
				ruleRedefinitions();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleTypingsContext extends ParserRuleContext {
		public RuleTypedByContext ruleTypedBy() {
			return getRuleContext(RuleTypedByContext.class,0);
		}
		public List<TerminalNode> OP_COMMA() { return getTokens(KerMLv2Parser.OP_COMMA); }
		public TerminalNode OP_COMMA(int i) {
			return getToken(KerMLv2Parser.OP_COMMA, i);
		}
		public List<RuleOwnedFeatureTypingContext> ruleOwnedFeatureTyping() {
			return getRuleContexts(RuleOwnedFeatureTypingContext.class);
		}
		public RuleOwnedFeatureTypingContext ruleOwnedFeatureTyping(int i) {
			return getRuleContext(RuleOwnedFeatureTypingContext.class,i);
		}
		public RuleTypingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleTypings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleTypings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleTypings(this);
		}
	}

	public final RuleTypingsContext ruleTypings() throws RecognitionException {
		RuleTypingsContext _localctx = new RuleTypingsContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_ruleTypings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			ruleTypedBy();
			setState(1211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_COMMA) {
				{
				{
				setState(1207);
				match(OP_COMMA);
				setState(1208);
				ruleOwnedFeatureTyping();
				}
				}
				setState(1213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleTypedByContext extends ParserRuleContext {
		public RuleOwnedFeatureTypingContext ruleOwnedFeatureTyping() {
			return getRuleContext(RuleOwnedFeatureTypingContext.class,0);
		}
		public TerminalNode OP_COLON() { return getToken(KerMLv2Parser.OP_COLON, 0); }
		public TerminalNode K_TYPED() { return getToken(KerMLv2Parser.K_TYPED, 0); }
		public TerminalNode K_BY() { return getToken(KerMLv2Parser.K_BY, 0); }
		public RuleTypedByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleTypedBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleTypedBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleTypedBy(this);
		}
	}

	public final RuleTypedByContext ruleTypedBy() throws RecognitionException {
		RuleTypedByContext _localctx = new RuleTypedByContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_ruleTypedBy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_COLON:
				{
				setState(1214);
				match(OP_COLON);
				}
				break;
			case K_TYPED:
				{
				setState(1215);
				match(K_TYPED);
				setState(1216);
				match(K_BY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1219);
			ruleOwnedFeatureTyping();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleSubsettingsContext extends ParserRuleContext {
		public RuleSubsetsContext ruleSubsets() {
			return getRuleContext(RuleSubsetsContext.class,0);
		}
		public List<TerminalNode> OP_COMMA() { return getTokens(KerMLv2Parser.OP_COMMA); }
		public TerminalNode OP_COMMA(int i) {
			return getToken(KerMLv2Parser.OP_COMMA, i);
		}
		public List<RuleOwnedSubsettingContext> ruleOwnedSubsetting() {
			return getRuleContexts(RuleOwnedSubsettingContext.class);
		}
		public RuleOwnedSubsettingContext ruleOwnedSubsetting(int i) {
			return getRuleContext(RuleOwnedSubsettingContext.class,i);
		}
		public RuleSubsettingsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSubsettings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleSubsettings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleSubsettings(this);
		}
	}

	public final RuleSubsettingsContext ruleSubsettings() throws RecognitionException {
		RuleSubsettingsContext _localctx = new RuleSubsettingsContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_ruleSubsettings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1221);
			ruleSubsets();
			setState(1226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_COMMA) {
				{
				{
				setState(1222);
				match(OP_COMMA);
				setState(1223);
				ruleOwnedSubsetting();
				}
				}
				setState(1228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleSubsetsContext extends ParserRuleContext {
		public RuleOwnedSubsettingContext ruleOwnedSubsetting() {
			return getRuleContext(RuleOwnedSubsettingContext.class,0);
		}
		public TerminalNode OP_COLON_RANGLE() { return getToken(KerMLv2Parser.OP_COLON_RANGLE, 0); }
		public TerminalNode K_SUBSETS() { return getToken(KerMLv2Parser.K_SUBSETS, 0); }
		public RuleSubsetsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSubsets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleSubsets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleSubsets(this);
		}
	}

	public final RuleSubsetsContext ruleSubsets() throws RecognitionException {
		RuleSubsetsContext _localctx = new RuleSubsetsContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_ruleSubsets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1229);
			_la = _input.LA(1);
			if ( !(_la==K_SUBSETS || _la==OP_COLON_RANGLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1230);
			ruleOwnedSubsetting();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleReferencesContext extends ParserRuleContext {
		public RuleReferencesKeywordContext ruleReferencesKeyword() {
			return getRuleContext(RuleReferencesKeywordContext.class,0);
		}
		public RuleOwnedReferenceSubsettingContext ruleOwnedReferenceSubsetting() {
			return getRuleContext(RuleOwnedReferenceSubsettingContext.class,0);
		}
		public RuleReferencesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleReferences; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleReferences(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleReferences(this);
		}
	}

	public final RuleReferencesContext ruleReferences() throws RecognitionException {
		RuleReferencesContext _localctx = new RuleReferencesContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_ruleReferences);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			ruleReferencesKeyword();
			setState(1233);
			ruleOwnedReferenceSubsetting();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleReferencesKeywordContext extends ParserRuleContext {
		public RuleReferencesKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleReferencesKeyword; }
	 
		public RuleReferencesKeywordContext() { }
		public void copyFrom(RuleReferencesKeywordContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleReferencesKeyword1Context extends RuleReferencesKeywordContext {
		public TerminalNode OP_COLON_COLON_RANGLE() { return getToken(KerMLv2Parser.OP_COLON_COLON_RANGLE, 0); }
		public RuleReferencesKeyword1Context(RuleReferencesKeywordContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleReferencesKeyword1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleReferencesKeyword1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleReferencesKeyword2Context extends RuleReferencesKeywordContext {
		public TerminalNode K_REFERENCES() { return getToken(KerMLv2Parser.K_REFERENCES, 0); }
		public RuleReferencesKeyword2Context(RuleReferencesKeywordContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleReferencesKeyword2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleReferencesKeyword2(this);
		}
	}

	public final RuleReferencesKeywordContext ruleReferencesKeyword() throws RecognitionException {
		RuleReferencesKeywordContext _localctx = new RuleReferencesKeywordContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_ruleReferencesKeyword);
		try {
			setState(1237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_COLON_COLON_RANGLE:
				_localctx = new RuleReferencesKeyword1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1235);
				match(OP_COLON_COLON_RANGLE);
				}
				break;
			case K_REFERENCES:
				_localctx = new RuleReferencesKeyword2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1236);
				match(K_REFERENCES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleRedefinitionsContext extends ParserRuleContext {
		public RuleRedefinesContext ruleRedefines() {
			return getRuleContext(RuleRedefinesContext.class,0);
		}
		public List<TerminalNode> OP_COMMA() { return getTokens(KerMLv2Parser.OP_COMMA); }
		public TerminalNode OP_COMMA(int i) {
			return getToken(KerMLv2Parser.OP_COMMA, i);
		}
		public List<RuleOwnedRedefinitionContext> ruleOwnedRedefinition() {
			return getRuleContexts(RuleOwnedRedefinitionContext.class);
		}
		public RuleOwnedRedefinitionContext ruleOwnedRedefinition(int i) {
			return getRuleContext(RuleOwnedRedefinitionContext.class,i);
		}
		public RuleRedefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleRedefinitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleRedefinitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleRedefinitions(this);
		}
	}

	public final RuleRedefinitionsContext ruleRedefinitions() throws RecognitionException {
		RuleRedefinitionsContext _localctx = new RuleRedefinitionsContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_ruleRedefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1239);
			ruleRedefines();
			setState(1244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_COMMA) {
				{
				{
				setState(1240);
				match(OP_COMMA);
				setState(1241);
				ruleOwnedRedefinition();
				}
				}
				setState(1246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleRedefinesContext extends ParserRuleContext {
		public RuleOwnedRedefinitionContext ruleOwnedRedefinition() {
			return getRuleContext(RuleOwnedRedefinitionContext.class,0);
		}
		public TerminalNode OP_COLON_RANGLE_RANGLE() { return getToken(KerMLv2Parser.OP_COLON_RANGLE_RANGLE, 0); }
		public TerminalNode K_REDEFINES() { return getToken(KerMLv2Parser.K_REDEFINES, 0); }
		public RuleRedefinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleRedefines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleRedefines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleRedefines(this);
		}
	}

	public final RuleRedefinesContext ruleRedefines() throws RecognitionException {
		RuleRedefinesContext _localctx = new RuleRedefinesContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_ruleRedefines);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1247);
			_la = _input.LA(1);
			if ( !(_la==K_REDEFINES || _la==OP_COLON_RANGLE_RANGLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1248);
			ruleOwnedRedefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureInvertingContext extends ParserRuleContext {
		public TerminalNode K_INVERSE() { return getToken(KerMLv2Parser.K_INVERSE, 0); }
		public TerminalNode K_OF() { return getToken(KerMLv2Parser.K_OF, 0); }
		public RuleRelationshipBodyContext ruleRelationshipBody() {
			return getRuleContext(RuleRelationshipBodyContext.class,0);
		}
		public List<RuleQualifiedNameContext> ruleQualifiedName() {
			return getRuleContexts(RuleQualifiedNameContext.class);
		}
		public RuleQualifiedNameContext ruleQualifiedName(int i) {
			return getRuleContext(RuleQualifiedNameContext.class,i);
		}
		public List<RuleOwnedFeatureChainContext> ruleOwnedFeatureChain() {
			return getRuleContexts(RuleOwnedFeatureChainContext.class);
		}
		public RuleOwnedFeatureChainContext ruleOwnedFeatureChain(int i) {
			return getRuleContext(RuleOwnedFeatureChainContext.class,i);
		}
		public TerminalNode K_INVERTING() { return getToken(KerMLv2Parser.K_INVERTING, 0); }
		public RuleIdentificationContext ruleIdentification() {
			return getRuleContext(RuleIdentificationContext.class,0);
		}
		public RuleFeatureInvertingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFeatureInverting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureInverting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureInverting(this);
		}
	}

	public final RuleFeatureInvertingContext ruleFeatureInverting() throws RecognitionException {
		RuleFeatureInvertingContext _localctx = new RuleFeatureInvertingContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_ruleFeatureInverting);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_INVERTING) {
				{
				setState(1250);
				match(K_INVERTING);
				setState(1252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 52776558133249L) != 0)) {
					{
					setState(1251);
					ruleIdentification();
					}
				}

				}
			}

			setState(1256);
			match(K_INVERSE);
			setState(1259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
			case 1:
				{
				setState(1257);
				ruleQualifiedName();
				}
				break;
			case 2:
				{
				setState(1258);
				ruleOwnedFeatureChain();
				}
				break;
			}
			setState(1261);
			match(K_OF);
			setState(1264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1262);
				ruleQualifiedName();
				}
				break;
			case 2:
				{
				setState(1263);
				ruleOwnedFeatureChain();
				}
				break;
			}
			setState(1266);
			ruleRelationshipBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedFeatureInvertingContext extends ParserRuleContext {
		public RuleOwnedFeatureInvertingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOwnedFeatureInverting; }
	 
		public RuleOwnedFeatureInvertingContext() { }
		public void copyFrom(RuleOwnedFeatureInvertingContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedFeatureInverting2Context extends RuleOwnedFeatureInvertingContext {
		public RuleOwnedFeatureChainContext ruleOwnedFeatureChain() {
			return getRuleContext(RuleOwnedFeatureChainContext.class,0);
		}
		public RuleOwnedFeatureInverting2Context(RuleOwnedFeatureInvertingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleOwnedFeatureInverting2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleOwnedFeatureInverting2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedFeatureInverting1Context extends RuleOwnedFeatureInvertingContext {
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleOwnedFeatureInverting1Context(RuleOwnedFeatureInvertingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleOwnedFeatureInverting1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleOwnedFeatureInverting1(this);
		}
	}

	public final RuleOwnedFeatureInvertingContext ruleOwnedFeatureInverting() throws RecognitionException {
		RuleOwnedFeatureInvertingContext _localctx = new RuleOwnedFeatureInvertingContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_ruleOwnedFeatureInverting);
		try {
			setState(1270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				_localctx = new RuleOwnedFeatureInverting1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1268);
				ruleQualifiedName();
				}
				break;
			case 2:
				_localctx = new RuleOwnedFeatureInverting2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1269);
				ruleOwnedFeatureChain();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleTypeFeaturingContext extends ParserRuleContext {
		public TerminalNode K_FEATURING() { return getToken(KerMLv2Parser.K_FEATURING, 0); }
		public List<RuleQualifiedNameContext> ruleQualifiedName() {
			return getRuleContexts(RuleQualifiedNameContext.class);
		}
		public RuleQualifiedNameContext ruleQualifiedName(int i) {
			return getRuleContext(RuleQualifiedNameContext.class,i);
		}
		public TerminalNode K_BY() { return getToken(KerMLv2Parser.K_BY, 0); }
		public RuleRelationshipBodyContext ruleRelationshipBody() {
			return getRuleContext(RuleRelationshipBodyContext.class,0);
		}
		public TerminalNode K_OF() { return getToken(KerMLv2Parser.K_OF, 0); }
		public RuleIdentificationContext ruleIdentification() {
			return getRuleContext(RuleIdentificationContext.class,0);
		}
		public RuleTypeFeaturingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleTypeFeaturing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleTypeFeaturing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleTypeFeaturing(this);
		}
	}

	public final RuleTypeFeaturingContext ruleTypeFeaturing() throws RecognitionException {
		RuleTypeFeaturingContext _localctx = new RuleTypeFeaturingContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_ruleTypeFeaturing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1272);
			match(K_FEATURING);
			setState(1277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(1274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 52776558133249L) != 0)) {
					{
					setState(1273);
					ruleIdentification();
					}
				}

				setState(1276);
				match(K_OF);
				}
				break;
			}
			setState(1279);
			ruleQualifiedName();
			setState(1280);
			match(K_BY);
			setState(1281);
			ruleQualifiedName();
			setState(1282);
			ruleRelationshipBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedTypeFeaturingContext extends ParserRuleContext {
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleOwnedTypeFeaturingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOwnedTypeFeaturing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleOwnedTypeFeaturing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleOwnedTypeFeaturing(this);
		}
	}

	public final RuleOwnedTypeFeaturingContext ruleOwnedTypeFeaturing() throws RecognitionException {
		RuleOwnedTypeFeaturingContext _localctx = new RuleOwnedTypeFeaturingContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_ruleOwnedTypeFeaturing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1284);
			ruleQualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureTypingContext extends ParserRuleContext {
		public TerminalNode K_TYPING() { return getToken(KerMLv2Parser.K_TYPING, 0); }
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleFeatureTypeContext ruleFeatureType() {
			return getRuleContext(RuleFeatureTypeContext.class,0);
		}
		public RuleRelationshipBodyContext ruleRelationshipBody() {
			return getRuleContext(RuleRelationshipBodyContext.class,0);
		}
		public TerminalNode OP_COLON() { return getToken(KerMLv2Parser.OP_COLON, 0); }
		public TerminalNode K_TYPED() { return getToken(KerMLv2Parser.K_TYPED, 0); }
		public TerminalNode K_BY() { return getToken(KerMLv2Parser.K_BY, 0); }
		public TerminalNode K_SPECIALIZATION() { return getToken(KerMLv2Parser.K_SPECIALIZATION, 0); }
		public RuleIdentificationContext ruleIdentification() {
			return getRuleContext(RuleIdentificationContext.class,0);
		}
		public RuleFeatureTypingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFeatureTyping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureTyping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureTyping(this);
		}
	}

	public final RuleFeatureTypingContext ruleFeatureTyping() throws RecognitionException {
		RuleFeatureTypingContext _localctx = new RuleFeatureTypingContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_ruleFeatureTyping);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_SPECIALIZATION) {
				{
				setState(1286);
				match(K_SPECIALIZATION);
				setState(1288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 52776558133249L) != 0)) {
					{
					setState(1287);
					ruleIdentification();
					}
				}

				}
			}

			setState(1292);
			match(K_TYPING);
			setState(1293);
			ruleQualifiedName();
			setState(1297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_COLON:
				{
				setState(1294);
				match(OP_COLON);
				}
				break;
			case K_TYPED:
				{
				setState(1295);
				match(K_TYPED);
				setState(1296);
				match(K_BY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1299);
			ruleFeatureType();
			setState(1300);
			ruleRelationshipBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedFeatureTypingContext extends ParserRuleContext {
		public RuleFeatureTypeContext ruleFeatureType() {
			return getRuleContext(RuleFeatureTypeContext.class,0);
		}
		public RuleOwnedFeatureTypingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOwnedFeatureTyping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleOwnedFeatureTyping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleOwnedFeatureTyping(this);
		}
	}

	public final RuleOwnedFeatureTypingContext ruleOwnedFeatureTyping() throws RecognitionException {
		RuleOwnedFeatureTypingContext _localctx = new RuleOwnedFeatureTypingContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_ruleOwnedFeatureTyping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1302);
			ruleFeatureType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureTypeContext extends ParserRuleContext {
		public RuleFeatureTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFeatureType; }
	 
		public RuleFeatureTypeContext() { }
		public void copyFrom(RuleFeatureTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureType1Context extends RuleFeatureTypeContext {
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleFeatureType1Context(RuleFeatureTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureType1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureType1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureType2Context extends RuleFeatureTypeContext {
		public RuleOwnedFeatureChainContext ruleOwnedFeatureChain() {
			return getRuleContext(RuleOwnedFeatureChainContext.class,0);
		}
		public RuleFeatureType2Context(RuleFeatureTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureType2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureType2(this);
		}
	}

	public final RuleFeatureTypeContext ruleFeatureType() throws RecognitionException {
		RuleFeatureTypeContext _localctx = new RuleFeatureTypeContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_ruleFeatureType);
		try {
			setState(1306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				_localctx = new RuleFeatureType1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1304);
				ruleQualifiedName();
				}
				break;
			case 2:
				_localctx = new RuleFeatureType2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1305);
				ruleOwnedFeatureChain();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleSubsettingContext extends ParserRuleContext {
		public TerminalNode K_SUBSET() { return getToken(KerMLv2Parser.K_SUBSET, 0); }
		public RuleRelationshipBodyContext ruleRelationshipBody() {
			return getRuleContext(RuleRelationshipBodyContext.class,0);
		}
		public TerminalNode OP_COLON_RANGLE() { return getToken(KerMLv2Parser.OP_COLON_RANGLE, 0); }
		public TerminalNode K_SUBSETS() { return getToken(KerMLv2Parser.K_SUBSETS, 0); }
		public List<RuleQualifiedNameContext> ruleQualifiedName() {
			return getRuleContexts(RuleQualifiedNameContext.class);
		}
		public RuleQualifiedNameContext ruleQualifiedName(int i) {
			return getRuleContext(RuleQualifiedNameContext.class,i);
		}
		public List<RuleOwnedFeatureChainContext> ruleOwnedFeatureChain() {
			return getRuleContexts(RuleOwnedFeatureChainContext.class);
		}
		public RuleOwnedFeatureChainContext ruleOwnedFeatureChain(int i) {
			return getRuleContext(RuleOwnedFeatureChainContext.class,i);
		}
		public TerminalNode K_SPECIALIZATION() { return getToken(KerMLv2Parser.K_SPECIALIZATION, 0); }
		public RuleIdentificationContext ruleIdentification() {
			return getRuleContext(RuleIdentificationContext.class,0);
		}
		public RuleSubsettingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSubsetting; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleSubsetting(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleSubsetting(this);
		}
	}

	public final RuleSubsettingContext ruleSubsetting() throws RecognitionException {
		RuleSubsettingContext _localctx = new RuleSubsettingContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_ruleSubsetting);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_SPECIALIZATION) {
				{
				setState(1308);
				match(K_SPECIALIZATION);
				setState(1310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 52776558133249L) != 0)) {
					{
					setState(1309);
					ruleIdentification();
					}
				}

				}
			}

			setState(1314);
			match(K_SUBSET);
			setState(1317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1315);
				ruleQualifiedName();
				}
				break;
			case 2:
				{
				setState(1316);
				ruleOwnedFeatureChain();
				}
				break;
			}
			setState(1319);
			_la = _input.LA(1);
			if ( !(_la==K_SUBSETS || _la==OP_COLON_RANGLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
			case 1:
				{
				setState(1320);
				ruleQualifiedName();
				}
				break;
			case 2:
				{
				setState(1321);
				ruleOwnedFeatureChain();
				}
				break;
			}
			setState(1324);
			ruleRelationshipBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedSubsettingContext extends ParserRuleContext {
		public RuleOwnedSubsettingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOwnedSubsetting; }
	 
		public RuleOwnedSubsettingContext() { }
		public void copyFrom(RuleOwnedSubsettingContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedSubsetting1Context extends RuleOwnedSubsettingContext {
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleOwnedSubsetting1Context(RuleOwnedSubsettingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleOwnedSubsetting1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleOwnedSubsetting1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedSubsetting2Context extends RuleOwnedSubsettingContext {
		public RuleOwnedFeatureChainContext ruleOwnedFeatureChain() {
			return getRuleContext(RuleOwnedFeatureChainContext.class,0);
		}
		public RuleOwnedSubsetting2Context(RuleOwnedSubsettingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleOwnedSubsetting2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleOwnedSubsetting2(this);
		}
	}

	public final RuleOwnedSubsettingContext ruleOwnedSubsetting() throws RecognitionException {
		RuleOwnedSubsettingContext _localctx = new RuleOwnedSubsettingContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_ruleOwnedSubsetting);
		try {
			setState(1328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				_localctx = new RuleOwnedSubsetting1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1326);
				ruleQualifiedName();
				}
				break;
			case 2:
				_localctx = new RuleOwnedSubsetting2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1327);
				ruleOwnedFeatureChain();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedReferenceSubsettingContext extends ParserRuleContext {
		public RuleOwnedReferenceSubsettingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOwnedReferenceSubsetting; }
	 
		public RuleOwnedReferenceSubsettingContext() { }
		public void copyFrom(RuleOwnedReferenceSubsettingContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedReferenceSubsetting2Context extends RuleOwnedReferenceSubsettingContext {
		public RuleOwnedFeatureChainContext ruleOwnedFeatureChain() {
			return getRuleContext(RuleOwnedFeatureChainContext.class,0);
		}
		public RuleOwnedReferenceSubsetting2Context(RuleOwnedReferenceSubsettingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleOwnedReferenceSubsetting2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleOwnedReferenceSubsetting2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedReferenceSubsetting1Context extends RuleOwnedReferenceSubsettingContext {
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleOwnedReferenceSubsetting1Context(RuleOwnedReferenceSubsettingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleOwnedReferenceSubsetting1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleOwnedReferenceSubsetting1(this);
		}
	}

	public final RuleOwnedReferenceSubsettingContext ruleOwnedReferenceSubsetting() throws RecognitionException {
		RuleOwnedReferenceSubsettingContext _localctx = new RuleOwnedReferenceSubsettingContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_ruleOwnedReferenceSubsetting);
		try {
			setState(1332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				_localctx = new RuleOwnedReferenceSubsetting1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1330);
				ruleQualifiedName();
				}
				break;
			case 2:
				_localctx = new RuleOwnedReferenceSubsetting2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1331);
				ruleOwnedFeatureChain();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleRedefinitionContext extends ParserRuleContext {
		public TerminalNode K_REDEFINITION() { return getToken(KerMLv2Parser.K_REDEFINITION, 0); }
		public RuleRelationshipBodyContext ruleRelationshipBody() {
			return getRuleContext(RuleRelationshipBodyContext.class,0);
		}
		public TerminalNode OP_COLON_RANGLE_RANGLE() { return getToken(KerMLv2Parser.OP_COLON_RANGLE_RANGLE, 0); }
		public TerminalNode K_REDEFINES() { return getToken(KerMLv2Parser.K_REDEFINES, 0); }
		public List<RuleQualifiedNameContext> ruleQualifiedName() {
			return getRuleContexts(RuleQualifiedNameContext.class);
		}
		public RuleQualifiedNameContext ruleQualifiedName(int i) {
			return getRuleContext(RuleQualifiedNameContext.class,i);
		}
		public List<RuleOwnedFeatureChainContext> ruleOwnedFeatureChain() {
			return getRuleContexts(RuleOwnedFeatureChainContext.class);
		}
		public RuleOwnedFeatureChainContext ruleOwnedFeatureChain(int i) {
			return getRuleContext(RuleOwnedFeatureChainContext.class,i);
		}
		public TerminalNode K_SPECIALIZATION() { return getToken(KerMLv2Parser.K_SPECIALIZATION, 0); }
		public RuleIdentificationContext ruleIdentification() {
			return getRuleContext(RuleIdentificationContext.class,0);
		}
		public RuleRedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleRedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleRedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleRedefinition(this);
		}
	}

	public final RuleRedefinitionContext ruleRedefinition() throws RecognitionException {
		RuleRedefinitionContext _localctx = new RuleRedefinitionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_ruleRedefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_SPECIALIZATION) {
				{
				setState(1334);
				match(K_SPECIALIZATION);
				setState(1336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 52776558133249L) != 0)) {
					{
					setState(1335);
					ruleIdentification();
					}
				}

				}
			}

			setState(1340);
			match(K_REDEFINITION);
			setState(1343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1341);
				ruleQualifiedName();
				}
				break;
			case 2:
				{
				setState(1342);
				ruleOwnedFeatureChain();
				}
				break;
			}
			setState(1345);
			_la = _input.LA(1);
			if ( !(_la==K_REDEFINES || _la==OP_COLON_RANGLE_RANGLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1346);
				ruleQualifiedName();
				}
				break;
			case 2:
				{
				setState(1347);
				ruleOwnedFeatureChain();
				}
				break;
			}
			setState(1350);
			ruleRelationshipBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedRedefinitionContext extends ParserRuleContext {
		public RuleOwnedRedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOwnedRedefinition; }
	 
		public RuleOwnedRedefinitionContext() { }
		public void copyFrom(RuleOwnedRedefinitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedRedefinition1Context extends RuleOwnedRedefinitionContext {
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleOwnedRedefinition1Context(RuleOwnedRedefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleOwnedRedefinition1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleOwnedRedefinition1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedRedefinition2Context extends RuleOwnedRedefinitionContext {
		public RuleOwnedFeatureChainContext ruleOwnedFeatureChain() {
			return getRuleContext(RuleOwnedFeatureChainContext.class,0);
		}
		public RuleOwnedRedefinition2Context(RuleOwnedRedefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleOwnedRedefinition2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleOwnedRedefinition2(this);
		}
	}

	public final RuleOwnedRedefinitionContext ruleOwnedRedefinition() throws RecognitionException {
		RuleOwnedRedefinitionContext _localctx = new RuleOwnedRedefinitionContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_ruleOwnedRedefinition);
		try {
			setState(1354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				_localctx = new RuleOwnedRedefinition1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1352);
				ruleQualifiedName();
				}
				break;
			case 2:
				_localctx = new RuleOwnedRedefinition2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1353);
				ruleOwnedFeatureChain();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureConjugationPartContext extends ParserRuleContext {
		public RuleFeatureConjugationContext ruleFeatureConjugation() {
			return getRuleContext(RuleFeatureConjugationContext.class,0);
		}
		public TerminalNode OP_TILDE() { return getToken(KerMLv2Parser.OP_TILDE, 0); }
		public TerminalNode K_CONJUGATES() { return getToken(KerMLv2Parser.K_CONJUGATES, 0); }
		public RuleFeatureConjugationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFeatureConjugationPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureConjugationPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureConjugationPart(this);
		}
	}

	public final RuleFeatureConjugationPartContext ruleFeatureConjugationPart() throws RecognitionException {
		RuleFeatureConjugationPartContext _localctx = new RuleFeatureConjugationPartContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_ruleFeatureConjugationPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1356);
			_la = _input.LA(1);
			if ( !(_la==K_CONJUGATES || _la==OP_TILDE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1357);
			ruleFeatureConjugation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureConjugationContext extends ParserRuleContext {
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleFeatureConjugationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFeatureConjugation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureConjugation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureConjugation(this);
		}
	}

	public final RuleFeatureConjugationContext ruleFeatureConjugation() throws RecognitionException {
		RuleFeatureConjugationContext _localctx = new RuleFeatureConjugationContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_ruleFeatureConjugation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1359);
			ruleQualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleValuePartContext extends ParserRuleContext {
		public RuleFeatureValueContext ruleFeatureValue() {
			return getRuleContext(RuleFeatureValueContext.class,0);
		}
		public RuleValuePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleValuePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleValuePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleValuePart(this);
		}
	}

	public final RuleValuePartContext ruleValuePart() throws RecognitionException {
		RuleValuePartContext _localctx = new RuleValuePartContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_ruleValuePart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1361);
			ruleFeatureValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureValueContext extends ParserRuleContext {
		public RuleOwnedExpressionContext ruleOwnedExpression() {
			return getRuleContext(RuleOwnedExpressionContext.class,0);
		}
		public TerminalNode OP_EQ() { return getToken(KerMLv2Parser.OP_EQ, 0); }
		public TerminalNode OP_COLON_EQ() { return getToken(KerMLv2Parser.OP_COLON_EQ, 0); }
		public TerminalNode K_DEFAULT() { return getToken(KerMLv2Parser.K_DEFAULT, 0); }
		public RuleFeatureValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFeatureValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureValue(this);
		}
	}

	public final RuleFeatureValueContext ruleFeatureValue() throws RecognitionException {
		RuleFeatureValueContext _localctx = new RuleFeatureValueContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_ruleFeatureValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_EQ:
				{
				setState(1363);
				match(OP_EQ);
				}
				break;
			case OP_COLON_EQ:
				{
				setState(1364);
				match(OP_COLON_EQ);
				}
				break;
			case K_DEFAULT:
				{
				setState(1365);
				match(K_DEFAULT);
				setState(1367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OP_EQ || _la==OP_COLON_EQ) {
					{
					setState(1366);
					_la = _input.LA(1);
					if ( !(_la==OP_EQ || _la==OP_COLON_EQ) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1371);
			ruleOwnedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleMultiplicityContext extends ParserRuleContext {
		public RuleMultiplicityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleMultiplicity; }
	 
		public RuleMultiplicityContext() { }
		public void copyFrom(RuleMultiplicityContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleMultiplicity1Context extends RuleMultiplicityContext {
		public RuleMultiplicitySubsetContext ruleMultiplicitySubset() {
			return getRuleContext(RuleMultiplicitySubsetContext.class,0);
		}
		public RuleMultiplicity1Context(RuleMultiplicityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleMultiplicity1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleMultiplicity1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleMultiplicity2Context extends RuleMultiplicityContext {
		public RuleMultiplicityRangeContext ruleMultiplicityRange() {
			return getRuleContext(RuleMultiplicityRangeContext.class,0);
		}
		public RuleMultiplicity2Context(RuleMultiplicityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleMultiplicity2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleMultiplicity2(this);
		}
	}

	public final RuleMultiplicityContext ruleMultiplicity() throws RecognitionException {
		RuleMultiplicityContext _localctx = new RuleMultiplicityContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_ruleMultiplicity);
		try {
			setState(1375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				_localctx = new RuleMultiplicity1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1373);
				ruleMultiplicitySubset();
				}
				break;
			case 2:
				_localctx = new RuleMultiplicity2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1374);
				ruleMultiplicityRange();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleMultiplicitySubsetContext extends ParserRuleContext {
		public TerminalNode K_MULTIPLICITY() { return getToken(KerMLv2Parser.K_MULTIPLICITY, 0); }
		public RuleSubsetsContext ruleSubsets() {
			return getRuleContext(RuleSubsetsContext.class,0);
		}
		public RuleTypeBodyContext ruleTypeBody() {
			return getRuleContext(RuleTypeBodyContext.class,0);
		}
		public RuleIdentificationContext ruleIdentification() {
			return getRuleContext(RuleIdentificationContext.class,0);
		}
		public RuleMultiplicitySubsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleMultiplicitySubset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleMultiplicitySubset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleMultiplicitySubset(this);
		}
	}

	public final RuleMultiplicitySubsetContext ruleMultiplicitySubset() throws RecognitionException {
		RuleMultiplicitySubsetContext _localctx = new RuleMultiplicitySubsetContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_ruleMultiplicitySubset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1377);
			match(K_MULTIPLICITY);
			setState(1379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 52776558133249L) != 0)) {
				{
				setState(1378);
				ruleIdentification();
				}
			}

			setState(1381);
			ruleSubsets();
			setState(1382);
			ruleTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleMultiplicityRangeContext extends ParserRuleContext {
		public TerminalNode K_MULTIPLICITY() { return getToken(KerMLv2Parser.K_MULTIPLICITY, 0); }
		public RuleMultiplicityBoundsContext ruleMultiplicityBounds() {
			return getRuleContext(RuleMultiplicityBoundsContext.class,0);
		}
		public RuleTypeBodyContext ruleTypeBody() {
			return getRuleContext(RuleTypeBodyContext.class,0);
		}
		public RuleIdentificationContext ruleIdentification() {
			return getRuleContext(RuleIdentificationContext.class,0);
		}
		public RuleMultiplicityRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleMultiplicityRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleMultiplicityRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleMultiplicityRange(this);
		}
	}

	public final RuleMultiplicityRangeContext ruleMultiplicityRange() throws RecognitionException {
		RuleMultiplicityRangeContext _localctx = new RuleMultiplicityRangeContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_ruleMultiplicityRange);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1384);
			match(K_MULTIPLICITY);
			setState(1386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 52776558133249L) != 0)) {
				{
				setState(1385);
				ruleIdentification();
				}
			}

			setState(1388);
			ruleMultiplicityBounds();
			setState(1389);
			ruleTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedMultiplicityContext extends ParserRuleContext {
		public RuleOwnedMultiplicityRangeContext ruleOwnedMultiplicityRange() {
			return getRuleContext(RuleOwnedMultiplicityRangeContext.class,0);
		}
		public RuleOwnedMultiplicityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOwnedMultiplicity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleOwnedMultiplicity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleOwnedMultiplicity(this);
		}
	}

	public final RuleOwnedMultiplicityContext ruleOwnedMultiplicity() throws RecognitionException {
		RuleOwnedMultiplicityContext _localctx = new RuleOwnedMultiplicityContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_ruleOwnedMultiplicity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1391);
			ruleOwnedMultiplicityRange();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedMultiplicityRangeContext extends ParserRuleContext {
		public RuleMultiplicityBoundsContext ruleMultiplicityBounds() {
			return getRuleContext(RuleMultiplicityBoundsContext.class,0);
		}
		public RuleOwnedMultiplicityRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOwnedMultiplicityRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleOwnedMultiplicityRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleOwnedMultiplicityRange(this);
		}
	}

	public final RuleOwnedMultiplicityRangeContext ruleOwnedMultiplicityRange() throws RecognitionException {
		RuleOwnedMultiplicityRangeContext _localctx = new RuleOwnedMultiplicityRangeContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_ruleOwnedMultiplicityRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1393);
			ruleMultiplicityBounds();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleMultiplicityBoundsContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(KerMLv2Parser.LSQUARE, 0); }
		public List<RuleMultiplicityExpressionMemberContext> ruleMultiplicityExpressionMember() {
			return getRuleContexts(RuleMultiplicityExpressionMemberContext.class);
		}
		public RuleMultiplicityExpressionMemberContext ruleMultiplicityExpressionMember(int i) {
			return getRuleContext(RuleMultiplicityExpressionMemberContext.class,i);
		}
		public TerminalNode RSQUARE() { return getToken(KerMLv2Parser.RSQUARE, 0); }
		public TerminalNode OP_DOT_DOT() { return getToken(KerMLv2Parser.OP_DOT_DOT, 0); }
		public RuleMultiplicityBoundsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleMultiplicityBounds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleMultiplicityBounds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleMultiplicityBounds(this);
		}
	}

	public final RuleMultiplicityBoundsContext ruleMultiplicityBounds() throws RecognitionException {
		RuleMultiplicityBoundsContext _localctx = new RuleMultiplicityBoundsContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_ruleMultiplicityBounds);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1395);
			match(LSQUARE);
			setState(1396);
			ruleMultiplicityExpressionMember();
			setState(1399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_DOT_DOT) {
				{
				setState(1397);
				match(OP_DOT_DOT);
				setState(1398);
				ruleMultiplicityExpressionMember();
				}
			}

			setState(1401);
			match(RSQUARE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleMultiplicityExpressionMemberContext extends ParserRuleContext {
		public RuleLiteralExpressionContext ruleLiteralExpression() {
			return getRuleContext(RuleLiteralExpressionContext.class,0);
		}
		public RuleFeatureReferenceExpressionContext ruleFeatureReferenceExpression() {
			return getRuleContext(RuleFeatureReferenceExpressionContext.class,0);
		}
		public RuleMultiplicityExpressionMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleMultiplicityExpressionMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleMultiplicityExpressionMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleMultiplicityExpressionMember(this);
		}
	}

	public final RuleMultiplicityExpressionMemberContext ruleMultiplicityExpressionMember() throws RecognitionException {
		RuleMultiplicityExpressionMemberContext _localctx = new RuleMultiplicityExpressionMemberContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_ruleMultiplicityExpressionMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1405);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_TRUE:
			case K_FALSE:
			case OP_STAR:
			case OP_DOT:
			case RULE_DECIMAL_VALUE:
			case RULE_EXP_VALUE:
			case RULE_STRING_VALUE:
				{
				setState(1403);
				ruleLiteralExpression();
				}
				break;
			case RULE_ID:
			case RULE_UNRESTRICTED_NAME:
				{
				setState(1404);
				ruleFeatureReferenceExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleDataTypeContext extends ParserRuleContext {
		public RuleTypePrefixContext ruleTypePrefix() {
			return getRuleContext(RuleTypePrefixContext.class,0);
		}
		public TerminalNode K_DATATYPE() { return getToken(KerMLv2Parser.K_DATATYPE, 0); }
		public RuleClassifierDeclarationContext ruleClassifierDeclaration() {
			return getRuleContext(RuleClassifierDeclarationContext.class,0);
		}
		public RuleTypeBodyContext ruleTypeBody() {
			return getRuleContext(RuleTypeBodyContext.class,0);
		}
		public RuleDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleDataType(this);
		}
	}

	public final RuleDataTypeContext ruleDataType() throws RecognitionException {
		RuleDataTypeContext _localctx = new RuleDataTypeContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_ruleDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1407);
			ruleTypePrefix();
			setState(1408);
			match(K_DATATYPE);
			setState(1409);
			ruleClassifierDeclaration();
			setState(1410);
			ruleTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleClassContext extends ParserRuleContext {
		public RuleTypePrefixContext ruleTypePrefix() {
			return getRuleContext(RuleTypePrefixContext.class,0);
		}
		public TerminalNode K_CLASS() { return getToken(KerMLv2Parser.K_CLASS, 0); }
		public RuleClassifierDeclarationContext ruleClassifierDeclaration() {
			return getRuleContext(RuleClassifierDeclarationContext.class,0);
		}
		public RuleTypeBodyContext ruleTypeBody() {
			return getRuleContext(RuleTypeBodyContext.class,0);
		}
		public RuleClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleClass(this);
		}
	}

	public final RuleClassContext ruleClass() throws RecognitionException {
		RuleClassContext _localctx = new RuleClassContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_ruleClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1412);
			ruleTypePrefix();
			setState(1413);
			match(K_CLASS);
			setState(1414);
			ruleClassifierDeclaration();
			setState(1415);
			ruleTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleStructureContext extends ParserRuleContext {
		public RuleTypePrefixContext ruleTypePrefix() {
			return getRuleContext(RuleTypePrefixContext.class,0);
		}
		public TerminalNode K_STRUCT() { return getToken(KerMLv2Parser.K_STRUCT, 0); }
		public RuleClassifierDeclarationContext ruleClassifierDeclaration() {
			return getRuleContext(RuleClassifierDeclarationContext.class,0);
		}
		public RuleTypeBodyContext ruleTypeBody() {
			return getRuleContext(RuleTypeBodyContext.class,0);
		}
		public RuleStructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleStructure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleStructure(this);
		}
	}

	public final RuleStructureContext ruleStructure() throws RecognitionException {
		RuleStructureContext _localctx = new RuleStructureContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_ruleStructure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1417);
			ruleTypePrefix();
			setState(1418);
			match(K_STRUCT);
			setState(1419);
			ruleClassifierDeclaration();
			setState(1420);
			ruleTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleAssociationContext extends ParserRuleContext {
		public RuleTypePrefixContext ruleTypePrefix() {
			return getRuleContext(RuleTypePrefixContext.class,0);
		}
		public TerminalNode K_ASSOC() { return getToken(KerMLv2Parser.K_ASSOC, 0); }
		public RuleClassifierDeclarationContext ruleClassifierDeclaration() {
			return getRuleContext(RuleClassifierDeclarationContext.class,0);
		}
		public RuleTypeBodyContext ruleTypeBody() {
			return getRuleContext(RuleTypeBodyContext.class,0);
		}
		public RuleAssociationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleAssociation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleAssociation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleAssociation(this);
		}
	}

	public final RuleAssociationContext ruleAssociation() throws RecognitionException {
		RuleAssociationContext _localctx = new RuleAssociationContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_ruleAssociation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1422);
			ruleTypePrefix();
			setState(1423);
			match(K_ASSOC);
			setState(1424);
			ruleClassifierDeclaration();
			setState(1425);
			ruleTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleAssociationStructureContext extends ParserRuleContext {
		public RuleTypePrefixContext ruleTypePrefix() {
			return getRuleContext(RuleTypePrefixContext.class,0);
		}
		public TerminalNode K_ASSOC() { return getToken(KerMLv2Parser.K_ASSOC, 0); }
		public TerminalNode K_STRUCT() { return getToken(KerMLv2Parser.K_STRUCT, 0); }
		public RuleClassifierDeclarationContext ruleClassifierDeclaration() {
			return getRuleContext(RuleClassifierDeclarationContext.class,0);
		}
		public RuleTypeBodyContext ruleTypeBody() {
			return getRuleContext(RuleTypeBodyContext.class,0);
		}
		public RuleAssociationStructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleAssociationStructure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleAssociationStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleAssociationStructure(this);
		}
	}

	public final RuleAssociationStructureContext ruleAssociationStructure() throws RecognitionException {
		RuleAssociationStructureContext _localctx = new RuleAssociationStructureContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_ruleAssociationStructure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1427);
			ruleTypePrefix();
			setState(1428);
			match(K_ASSOC);
			setState(1429);
			match(K_STRUCT);
			setState(1430);
			ruleClassifierDeclaration();
			setState(1431);
			ruleTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleConnectorContext extends ParserRuleContext {
		public RuleFeaturePrefixContext ruleFeaturePrefix() {
			return getRuleContext(RuleFeaturePrefixContext.class,0);
		}
		public TerminalNode K_CONNECTOR() { return getToken(KerMLv2Parser.K_CONNECTOR, 0); }
		public RuleTypeBodyContext ruleTypeBody() {
			return getRuleContext(RuleTypeBodyContext.class,0);
		}
		public RuleConnectorDeclarationContext ruleConnectorDeclaration() {
			return getRuleContext(RuleConnectorDeclarationContext.class,0);
		}
		public RuleFeatureDeclarationContext ruleFeatureDeclaration() {
			return getRuleContext(RuleFeatureDeclarationContext.class,0);
		}
		public RuleValuePartContext ruleValuePart() {
			return getRuleContext(RuleValuePartContext.class,0);
		}
		public RuleConnectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleConnector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleConnector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleConnector(this);
		}
	}

	public final RuleConnectorContext ruleConnector() throws RecognitionException {
		RuleConnectorContext _localctx = new RuleConnectorContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_ruleConnector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1433);
			ruleFeaturePrefix();
			setState(1434);
			match(K_CONNECTOR);
			setState(1442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1436);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4433230887403520L) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 52776558387233L) != 0)) {
					{
					setState(1435);
					ruleFeatureDeclaration();
					}
				}

				setState(1439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 6917529027641081857L) != 0)) {
					{
					setState(1438);
					ruleValuePart();
					}
				}

				}
				break;
			case 2:
				{
				setState(1441);
				ruleConnectorDeclaration();
				}
				break;
			}
			setState(1444);
			ruleTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleConnectorDeclarationContext extends ParserRuleContext {
		public RuleConnectorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleConnectorDeclaration; }
	 
		public RuleConnectorDeclarationContext() { }
		public void copyFrom(RuleConnectorDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleConnectorDeclaration1Context extends RuleConnectorDeclarationContext {
		public RuleBinaryConnectorDeclarationContext ruleBinaryConnectorDeclaration() {
			return getRuleContext(RuleBinaryConnectorDeclarationContext.class,0);
		}
		public RuleConnectorDeclaration1Context(RuleConnectorDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleConnectorDeclaration1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleConnectorDeclaration1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleConnectorDeclaration2Context extends RuleConnectorDeclarationContext {
		public RuleNaryConnectorDeclarationContext ruleNaryConnectorDeclaration() {
			return getRuleContext(RuleNaryConnectorDeclarationContext.class,0);
		}
		public RuleConnectorDeclaration2Context(RuleConnectorDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleConnectorDeclaration2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleConnectorDeclaration2(this);
		}
	}

	public final RuleConnectorDeclarationContext ruleConnectorDeclaration() throws RecognitionException {
		RuleConnectorDeclarationContext _localctx = new RuleConnectorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_ruleConnectorDeclaration);
		try {
			setState(1448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				_localctx = new RuleConnectorDeclaration1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1446);
				ruleBinaryConnectorDeclaration();
				}
				break;
			case 2:
				_localctx = new RuleConnectorDeclaration2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1447);
				ruleNaryConnectorDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleBinaryConnectorDeclarationContext extends ParserRuleContext {
		public List<RuleConnectorEndMemberContext> ruleConnectorEndMember() {
			return getRuleContexts(RuleConnectorEndMemberContext.class);
		}
		public RuleConnectorEndMemberContext ruleConnectorEndMember(int i) {
			return getRuleContext(RuleConnectorEndMemberContext.class,i);
		}
		public TerminalNode K_TO() { return getToken(KerMLv2Parser.K_TO, 0); }
		public TerminalNode K_FROM() { return getToken(KerMLv2Parser.K_FROM, 0); }
		public TerminalNode K_ALL() { return getToken(KerMLv2Parser.K_ALL, 0); }
		public RuleFeatureDeclarationContext ruleFeatureDeclaration() {
			return getRuleContext(RuleFeatureDeclarationContext.class,0);
		}
		public RuleBinaryConnectorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleBinaryConnectorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleBinaryConnectorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleBinaryConnectorDeclaration(this);
		}
	}

	public final RuleBinaryConnectorDeclarationContext ruleBinaryConnectorDeclaration() throws RecognitionException {
		RuleBinaryConnectorDeclarationContext _localctx = new RuleBinaryConnectorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_ruleBinaryConnectorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				{
				setState(1451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4433230887403520L) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 52776558387233L) != 0)) {
					{
					setState(1450);
					ruleFeatureDeclaration();
					}
				}

				setState(1453);
				match(K_FROM);
				}
				break;
			case 2:
				{
				setState(1454);
				match(K_ALL);
				setState(1456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1455);
					match(K_FROM);
					}
				}

				}
				break;
			}
			setState(1460);
			ruleConnectorEndMember();
			setState(1461);
			match(K_TO);
			setState(1462);
			ruleConnectorEndMember();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleNaryConnectorDeclarationContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KerMLv2Parser.LPAREN, 0); }
		public List<RuleConnectorEndMemberContext> ruleConnectorEndMember() {
			return getRuleContexts(RuleConnectorEndMemberContext.class);
		}
		public RuleConnectorEndMemberContext ruleConnectorEndMember(int i) {
			return getRuleContext(RuleConnectorEndMemberContext.class,i);
		}
		public List<TerminalNode> OP_COMMA() { return getTokens(KerMLv2Parser.OP_COMMA); }
		public TerminalNode OP_COMMA(int i) {
			return getToken(KerMLv2Parser.OP_COMMA, i);
		}
		public TerminalNode RPAREN() { return getToken(KerMLv2Parser.RPAREN, 0); }
		public RuleFeatureDeclarationContext ruleFeatureDeclaration() {
			return getRuleContext(RuleFeatureDeclarationContext.class,0);
		}
		public RuleNaryConnectorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleNaryConnectorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNaryConnectorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNaryConnectorDeclaration(this);
		}
	}

	public final RuleNaryConnectorDeclarationContext ruleNaryConnectorDeclaration() throws RecognitionException {
		RuleNaryConnectorDeclarationContext _localctx = new RuleNaryConnectorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_ruleNaryConnectorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4433230887403520L) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 52776558387233L) != 0)) {
				{
				setState(1464);
				ruleFeatureDeclaration();
				}
			}

			setState(1467);
			match(LPAREN);
			setState(1468);
			ruleConnectorEndMember();
			setState(1469);
			match(OP_COMMA);
			setState(1470);
			ruleConnectorEndMember();
			setState(1475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_COMMA) {
				{
				{
				setState(1471);
				match(OP_COMMA);
				setState(1472);
				ruleConnectorEndMember();
				}
				}
				setState(1477);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1478);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleConnectorEndMemberContext extends ParserRuleContext {
		public RuleConnectorEndContext ruleConnectorEnd() {
			return getRuleContext(RuleConnectorEndContext.class,0);
		}
		public RuleConnectorEndMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleConnectorEndMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleConnectorEndMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleConnectorEndMember(this);
		}
	}

	public final RuleConnectorEndMemberContext ruleConnectorEndMember() throws RecognitionException {
		RuleConnectorEndMemberContext _localctx = new RuleConnectorEndMemberContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_ruleConnectorEndMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1480);
			ruleConnectorEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleConnectorEndContext extends ParserRuleContext {
		public RuleOwnedReferenceSubsettingContext ruleOwnedReferenceSubsetting() {
			return getRuleContext(RuleOwnedReferenceSubsettingContext.class,0);
		}
		public RuleNameContext ruleName() {
			return getRuleContext(RuleNameContext.class,0);
		}
		public RuleReferencesKeywordContext ruleReferencesKeyword() {
			return getRuleContext(RuleReferencesKeywordContext.class,0);
		}
		public RuleOwnedMultiplicityContext ruleOwnedMultiplicity() {
			return getRuleContext(RuleOwnedMultiplicityContext.class,0);
		}
		public RuleConnectorEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleConnectorEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleConnectorEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleConnectorEnd(this);
		}
	}

	public final RuleConnectorEndContext ruleConnectorEnd() throws RecognitionException {
		RuleConnectorEndContext _localctx = new RuleConnectorEndContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_ruleConnectorEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
			case 1:
				{
				setState(1482);
				ruleName();
				setState(1483);
				ruleReferencesKeyword();
				}
				break;
			}
			setState(1487);
			ruleOwnedReferenceSubsetting();
			setState(1489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LSQUARE) {
				{
				setState(1488);
				ruleOwnedMultiplicity();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleBindingConnectorContext extends ParserRuleContext {
		public RuleFeaturePrefixContext ruleFeaturePrefix() {
			return getRuleContext(RuleFeaturePrefixContext.class,0);
		}
		public TerminalNode K_BINDING() { return getToken(KerMLv2Parser.K_BINDING, 0); }
		public RuleBindingConnectorDeclarationContext ruleBindingConnectorDeclaration() {
			return getRuleContext(RuleBindingConnectorDeclarationContext.class,0);
		}
		public RuleTypeBodyContext ruleTypeBody() {
			return getRuleContext(RuleTypeBodyContext.class,0);
		}
		public RuleBindingConnectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleBindingConnector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleBindingConnector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleBindingConnector(this);
		}
	}

	public final RuleBindingConnectorContext ruleBindingConnector() throws RecognitionException {
		RuleBindingConnectorContext _localctx = new RuleBindingConnectorContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_ruleBindingConnector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1491);
			ruleFeaturePrefix();
			setState(1492);
			match(K_BINDING);
			setState(1493);
			ruleBindingConnectorDeclaration();
			setState(1494);
			ruleTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleBindingConnectorDeclarationContext extends ParserRuleContext {
		public RuleBindingConnectorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleBindingConnectorDeclaration; }
	 
		public RuleBindingConnectorDeclarationContext() { }
		public void copyFrom(RuleBindingConnectorDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleBindingConnectorDeclaration1Context extends RuleBindingConnectorDeclarationContext {
		public RuleFeatureDeclarationContext ruleFeatureDeclaration() {
			return getRuleContext(RuleFeatureDeclarationContext.class,0);
		}
		public TerminalNode K_OF() { return getToken(KerMLv2Parser.K_OF, 0); }
		public List<RuleConnectorEndMemberContext> ruleConnectorEndMember() {
			return getRuleContexts(RuleConnectorEndMemberContext.class);
		}
		public RuleConnectorEndMemberContext ruleConnectorEndMember(int i) {
			return getRuleContext(RuleConnectorEndMemberContext.class,i);
		}
		public TerminalNode OP_EQ() { return getToken(KerMLv2Parser.OP_EQ, 0); }
		public RuleBindingConnectorDeclaration1Context(RuleBindingConnectorDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleBindingConnectorDeclaration1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleBindingConnectorDeclaration1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleBindingConnectorDeclaration2Context extends RuleBindingConnectorDeclarationContext {
		public TerminalNode K_ALL() { return getToken(KerMLv2Parser.K_ALL, 0); }
		public List<RuleConnectorEndMemberContext> ruleConnectorEndMember() {
			return getRuleContexts(RuleConnectorEndMemberContext.class);
		}
		public RuleConnectorEndMemberContext ruleConnectorEndMember(int i) {
			return getRuleContext(RuleConnectorEndMemberContext.class,i);
		}
		public TerminalNode OP_EQ() { return getToken(KerMLv2Parser.OP_EQ, 0); }
		public TerminalNode K_OF() { return getToken(KerMLv2Parser.K_OF, 0); }
		public RuleBindingConnectorDeclaration2Context(RuleBindingConnectorDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleBindingConnectorDeclaration2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleBindingConnectorDeclaration2(this);
		}
	}

	public final RuleBindingConnectorDeclarationContext ruleBindingConnectorDeclaration() throws RecognitionException {
		RuleBindingConnectorDeclarationContext _localctx = new RuleBindingConnectorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_ruleBindingConnectorDeclaration);
		int _la;
		try {
			setState(1516);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				_localctx = new RuleBindingConnectorDeclaration1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1496);
				ruleFeatureDeclaration();
				setState(1502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(1497);
					match(K_OF);
					setState(1498);
					ruleConnectorEndMember();
					setState(1499);
					match(OP_EQ);
					setState(1500);
					ruleConnectorEndMember();
					}
				}

				}
				break;
			case 2:
				_localctx = new RuleBindingConnectorDeclaration2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL) {
					{
					setState(1504);
					match(K_ALL);
					}
				}

				setState(1514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_OF || _la==RULE_ID || _la==RULE_UNRESTRICTED_NAME) {
					{
					setState(1508);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OF) {
						{
						setState(1507);
						match(K_OF);
						}
					}

					setState(1510);
					ruleConnectorEndMember();
					setState(1511);
					match(OP_EQ);
					setState(1512);
					ruleConnectorEndMember();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleSuccessionContext extends ParserRuleContext {
		public RuleFeaturePrefixContext ruleFeaturePrefix() {
			return getRuleContext(RuleFeaturePrefixContext.class,0);
		}
		public TerminalNode K_SUCCESSION() { return getToken(KerMLv2Parser.K_SUCCESSION, 0); }
		public RuleSuccessionDeclarationContext ruleSuccessionDeclaration() {
			return getRuleContext(RuleSuccessionDeclarationContext.class,0);
		}
		public RuleTypeBodyContext ruleTypeBody() {
			return getRuleContext(RuleTypeBodyContext.class,0);
		}
		public RuleSuccessionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSuccession; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleSuccession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleSuccession(this);
		}
	}

	public final RuleSuccessionContext ruleSuccession() throws RecognitionException {
		RuleSuccessionContext _localctx = new RuleSuccessionContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_ruleSuccession);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1518);
			ruleFeaturePrefix();
			setState(1519);
			match(K_SUCCESSION);
			setState(1520);
			ruleSuccessionDeclaration();
			setState(1521);
			ruleTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleSuccessionDeclarationContext extends ParserRuleContext {
		public RuleSuccessionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSuccessionDeclaration; }
	 
		public RuleSuccessionDeclarationContext() { }
		public void copyFrom(RuleSuccessionDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleSuccessionDeclaration2Context extends RuleSuccessionDeclarationContext {
		public TerminalNode K_ALL() { return getToken(KerMLv2Parser.K_ALL, 0); }
		public List<RuleConnectorEndMemberContext> ruleConnectorEndMember() {
			return getRuleContexts(RuleConnectorEndMemberContext.class);
		}
		public RuleConnectorEndMemberContext ruleConnectorEndMember(int i) {
			return getRuleContext(RuleConnectorEndMemberContext.class,i);
		}
		public TerminalNode K_THEN() { return getToken(KerMLv2Parser.K_THEN, 0); }
		public TerminalNode K_FIRST() { return getToken(KerMLv2Parser.K_FIRST, 0); }
		public RuleSuccessionDeclaration2Context(RuleSuccessionDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleSuccessionDeclaration2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleSuccessionDeclaration2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleSuccessionDeclaration1Context extends RuleSuccessionDeclarationContext {
		public RuleFeatureDeclarationContext ruleFeatureDeclaration() {
			return getRuleContext(RuleFeatureDeclarationContext.class,0);
		}
		public TerminalNode K_FIRST() { return getToken(KerMLv2Parser.K_FIRST, 0); }
		public List<RuleConnectorEndMemberContext> ruleConnectorEndMember() {
			return getRuleContexts(RuleConnectorEndMemberContext.class);
		}
		public RuleConnectorEndMemberContext ruleConnectorEndMember(int i) {
			return getRuleContext(RuleConnectorEndMemberContext.class,i);
		}
		public TerminalNode K_THEN() { return getToken(KerMLv2Parser.K_THEN, 0); }
		public RuleSuccessionDeclaration1Context(RuleSuccessionDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleSuccessionDeclaration1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleSuccessionDeclaration1(this);
		}
	}

	public final RuleSuccessionDeclarationContext ruleSuccessionDeclaration() throws RecognitionException {
		RuleSuccessionDeclarationContext _localctx = new RuleSuccessionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_ruleSuccessionDeclaration);
		int _la;
		try {
			setState(1543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				_localctx = new RuleSuccessionDeclaration1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1523);
				ruleFeatureDeclaration();
				setState(1529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FIRST) {
					{
					setState(1524);
					match(K_FIRST);
					setState(1525);
					ruleConnectorEndMember();
					setState(1526);
					match(K_THEN);
					setState(1527);
					ruleConnectorEndMember();
					}
				}

				}
				break;
			case 2:
				_localctx = new RuleSuccessionDeclaration2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL) {
					{
					setState(1531);
					match(K_ALL);
					}
				}

				setState(1541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FIRST || _la==RULE_ID || _la==RULE_UNRESTRICTED_NAME) {
					{
					setState(1535);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_FIRST) {
						{
						setState(1534);
						match(K_FIRST);
						}
					}

					setState(1537);
					ruleConnectorEndMember();
					setState(1538);
					match(K_THEN);
					setState(1539);
					ruleConnectorEndMember();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleBehaviorContext extends ParserRuleContext {
		public RuleTypePrefixContext ruleTypePrefix() {
			return getRuleContext(RuleTypePrefixContext.class,0);
		}
		public TerminalNode K_BEHAVIOR() { return getToken(KerMLv2Parser.K_BEHAVIOR, 0); }
		public RuleClassifierDeclarationContext ruleClassifierDeclaration() {
			return getRuleContext(RuleClassifierDeclarationContext.class,0);
		}
		public RuleTypeBodyContext ruleTypeBody() {
			return getRuleContext(RuleTypeBodyContext.class,0);
		}
		public RuleBehaviorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleBehavior; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleBehavior(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleBehavior(this);
		}
	}

	public final RuleBehaviorContext ruleBehavior() throws RecognitionException {
		RuleBehaviorContext _localctx = new RuleBehaviorContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_ruleBehavior);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1545);
			ruleTypePrefix();
			setState(1546);
			match(K_BEHAVIOR);
			setState(1547);
			ruleClassifierDeclaration();
			setState(1548);
			ruleTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleStepContext extends ParserRuleContext {
		public RuleFeaturePrefixContext ruleFeaturePrefix() {
			return getRuleContext(RuleFeaturePrefixContext.class,0);
		}
		public TerminalNode K_STEP() { return getToken(KerMLv2Parser.K_STEP, 0); }
		public RuleStepDeclarationContext ruleStepDeclaration() {
			return getRuleContext(RuleStepDeclarationContext.class,0);
		}
		public RuleTypeBodyContext ruleTypeBody() {
			return getRuleContext(RuleTypeBodyContext.class,0);
		}
		public RuleStepContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleStep; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleStep(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleStep(this);
		}
	}

	public final RuleStepContext ruleStep() throws RecognitionException {
		RuleStepContext _localctx = new RuleStepContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_ruleStep);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1550);
			ruleFeaturePrefix();
			setState(1551);
			match(K_STEP);
			setState(1552);
			ruleStepDeclaration();
			setState(1553);
			ruleTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleStepDeclarationContext extends ParserRuleContext {
		public RuleFeatureDeclarationContext ruleFeatureDeclaration() {
			return getRuleContext(RuleFeatureDeclarationContext.class,0);
		}
		public RuleValuePartContext ruleValuePart() {
			return getRuleContext(RuleValuePartContext.class,0);
		}
		public RuleStepDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleStepDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleStepDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleStepDeclaration(this);
		}
	}

	public final RuleStepDeclarationContext ruleStepDeclaration() throws RecognitionException {
		RuleStepDeclarationContext _localctx = new RuleStepDeclarationContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_ruleStepDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4433230887403520L) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 52776558387233L) != 0)) {
				{
				setState(1555);
				ruleFeatureDeclaration();
				}
			}

			setState(1559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 6917529027641081857L) != 0)) {
				{
				setState(1558);
				ruleValuePart();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleFunctionContext extends ParserRuleContext {
		public RuleTypePrefixContext ruleTypePrefix() {
			return getRuleContext(RuleTypePrefixContext.class,0);
		}
		public TerminalNode K_FUNCTION() { return getToken(KerMLv2Parser.K_FUNCTION, 0); }
		public RuleClassifierDeclarationContext ruleClassifierDeclaration() {
			return getRuleContext(RuleClassifierDeclarationContext.class,0);
		}
		public RuleFunctionBodyContext ruleFunctionBody() {
			return getRuleContext(RuleFunctionBodyContext.class,0);
		}
		public RuleFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFunction(this);
		}
	}

	public final RuleFunctionContext ruleFunction() throws RecognitionException {
		RuleFunctionContext _localctx = new RuleFunctionContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_ruleFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1561);
			ruleTypePrefix();
			setState(1562);
			match(K_FUNCTION);
			setState(1563);
			ruleClassifierDeclaration();
			setState(1564);
			ruleFunctionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleFunctionBodyContext extends ParserRuleContext {
		public RuleFunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFunctionBody; }
	 
		public RuleFunctionBodyContext() { }
		public void copyFrom(RuleFunctionBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFunctionBody2Context extends RuleFunctionBodyContext {
		public TerminalNode LBRACE() { return getToken(KerMLv2Parser.LBRACE, 0); }
		public RuleFunctionBodyPartContext ruleFunctionBodyPart() {
			return getRuleContext(RuleFunctionBodyPartContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(KerMLv2Parser.RBRACE, 0); }
		public RuleFunctionBody2Context(RuleFunctionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFunctionBody2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFunctionBody2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFunctionBody1Context extends RuleFunctionBodyContext {
		public TerminalNode OP_SEMI() { return getToken(KerMLv2Parser.OP_SEMI, 0); }
		public RuleFunctionBody1Context(RuleFunctionBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFunctionBody1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFunctionBody1(this);
		}
	}

	public final RuleFunctionBodyContext ruleFunctionBody() throws RecognitionException {
		RuleFunctionBodyContext _localctx = new RuleFunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_ruleFunctionBody);
		try {
			setState(1571);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_SEMI:
				_localctx = new RuleFunctionBody1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1566);
				match(OP_SEMI);
				}
				break;
			case LBRACE:
				_localctx = new RuleFunctionBody2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1567);
				match(LBRACE);
				setState(1568);
				ruleFunctionBodyPart();
				setState(1569);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleFunctionBodyPartContext extends ParserRuleContext {
		public List<RuleNonFeatureMemberContext> ruleNonFeatureMember() {
			return getRuleContexts(RuleNonFeatureMemberContext.class);
		}
		public RuleNonFeatureMemberContext ruleNonFeatureMember(int i) {
			return getRuleContext(RuleNonFeatureMemberContext.class,i);
		}
		public List<RuleFeatureMemberContext> ruleFeatureMember() {
			return getRuleContexts(RuleFeatureMemberContext.class);
		}
		public RuleFeatureMemberContext ruleFeatureMember(int i) {
			return getRuleContext(RuleFeatureMemberContext.class,i);
		}
		public List<RuleAliasMemberContext> ruleAliasMember() {
			return getRuleContexts(RuleAliasMemberContext.class);
		}
		public RuleAliasMemberContext ruleAliasMember(int i) {
			return getRuleContext(RuleAliasMemberContext.class,i);
		}
		public List<RuleImportContext> ruleImport() {
			return getRuleContexts(RuleImportContext.class);
		}
		public RuleImportContext ruleImport(int i) {
			return getRuleContext(RuleImportContext.class,i);
		}
		public List<RuleReturnFeatureMemberContext> ruleReturnFeatureMember() {
			return getRuleContexts(RuleReturnFeatureMemberContext.class);
		}
		public RuleReturnFeatureMemberContext ruleReturnFeatureMember(int i) {
			return getRuleContext(RuleReturnFeatureMemberContext.class,i);
		}
		public RuleResultExpressionMemberContext ruleResultExpressionMember() {
			return getRuleContext(RuleResultExpressionMemberContext.class,0);
		}
		public RuleFunctionBodyPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFunctionBodyPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFunctionBodyPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFunctionBodyPart(this);
		}
	}

	public final RuleFunctionBodyPartContext ruleFunctionBodyPart() throws RecognitionException {
		RuleFunctionBodyPartContext _localctx = new RuleFunctionBodyPartContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_ruleFunctionBodyPart);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1580);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1578);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
					case 1:
						{
						setState(1573);
						ruleNonFeatureMember();
						}
						break;
					case 2:
						{
						setState(1574);
						ruleFeatureMember();
						}
						break;
					case 3:
						{
						setState(1575);
						ruleAliasMember();
						}
						break;
					case 4:
						{
						setState(1576);
						ruleImport();
						}
						break;
					case 5:
						{
						setState(1577);
						ruleReturnFeatureMember();
						}
						break;
					}
					} 
				}
				setState(1582);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			}
			setState(1584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & -4611686018427387903L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & -562948576338493727L) != 0)) {
				{
				setState(1583);
				ruleResultExpressionMember();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleReturnFeatureMemberContext extends ParserRuleContext {
		public RuleMemberPrefixContext ruleMemberPrefix() {
			return getRuleContext(RuleMemberPrefixContext.class,0);
		}
		public TerminalNode K_RETURN() { return getToken(KerMLv2Parser.K_RETURN, 0); }
		public RuleFeatureElementContext ruleFeatureElement() {
			return getRuleContext(RuleFeatureElementContext.class,0);
		}
		public RuleReturnFeatureMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleReturnFeatureMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleReturnFeatureMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleReturnFeatureMember(this);
		}
	}

	public final RuleReturnFeatureMemberContext ruleReturnFeatureMember() throws RecognitionException {
		RuleReturnFeatureMemberContext _localctx = new RuleReturnFeatureMemberContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_ruleReturnFeatureMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1586);
			ruleMemberPrefix();
			setState(1587);
			match(K_RETURN);
			setState(1588);
			ruleFeatureElement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleResultExpressionMemberContext extends ParserRuleContext {
		public RuleMemberPrefixContext ruleMemberPrefix() {
			return getRuleContext(RuleMemberPrefixContext.class,0);
		}
		public RuleOwnedExpressionContext ruleOwnedExpression() {
			return getRuleContext(RuleOwnedExpressionContext.class,0);
		}
		public RuleResultExpressionMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleResultExpressionMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleResultExpressionMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleResultExpressionMember(this);
		}
	}

	public final RuleResultExpressionMemberContext ruleResultExpressionMember() throws RecognitionException {
		RuleResultExpressionMemberContext _localctx = new RuleResultExpressionMemberContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_ruleResultExpressionMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1590);
			ruleMemberPrefix();
			setState(1591);
			ruleOwnedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleExpressionContext extends ParserRuleContext {
		public RuleFeaturePrefixContext ruleFeaturePrefix() {
			return getRuleContext(RuleFeaturePrefixContext.class,0);
		}
		public TerminalNode K_EXPR() { return getToken(KerMLv2Parser.K_EXPR, 0); }
		public RuleExpressionDeclarationContext ruleExpressionDeclaration() {
			return getRuleContext(RuleExpressionDeclarationContext.class,0);
		}
		public RuleFunctionBodyContext ruleFunctionBody() {
			return getRuleContext(RuleFunctionBodyContext.class,0);
		}
		public RuleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleExpression(this);
		}
	}

	public final RuleExpressionContext ruleExpression() throws RecognitionException {
		RuleExpressionContext _localctx = new RuleExpressionContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_ruleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1593);
			ruleFeaturePrefix();
			setState(1594);
			match(K_EXPR);
			setState(1595);
			ruleExpressionDeclaration();
			setState(1596);
			ruleFunctionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleExpressionDeclarationContext extends ParserRuleContext {
		public RuleFeatureDeclarationContext ruleFeatureDeclaration() {
			return getRuleContext(RuleFeatureDeclarationContext.class,0);
		}
		public RuleValuePartContext ruleValuePart() {
			return getRuleContext(RuleValuePartContext.class,0);
		}
		public RuleExpressionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleExpressionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleExpressionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleExpressionDeclaration(this);
		}
	}

	public final RuleExpressionDeclarationContext ruleExpressionDeclaration() throws RecognitionException {
		RuleExpressionDeclarationContext _localctx = new RuleExpressionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_ruleExpressionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4433230887403520L) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 52776558387233L) != 0)) {
				{
				setState(1598);
				ruleFeatureDeclaration();
				}
			}

			setState(1602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 6917529027641081857L) != 0)) {
				{
				setState(1601);
				ruleValuePart();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RulePredicateContext extends ParserRuleContext {
		public RuleTypePrefixContext ruleTypePrefix() {
			return getRuleContext(RuleTypePrefixContext.class,0);
		}
		public TerminalNode K_PREDICATE() { return getToken(KerMLv2Parser.K_PREDICATE, 0); }
		public RuleClassifierDeclarationContext ruleClassifierDeclaration() {
			return getRuleContext(RuleClassifierDeclarationContext.class,0);
		}
		public RuleFunctionBodyContext ruleFunctionBody() {
			return getRuleContext(RuleFunctionBodyContext.class,0);
		}
		public RulePredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulePredicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRulePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRulePredicate(this);
		}
	}

	public final RulePredicateContext rulePredicate() throws RecognitionException {
		RulePredicateContext _localctx = new RulePredicateContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_rulePredicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1604);
			ruleTypePrefix();
			setState(1605);
			match(K_PREDICATE);
			setState(1606);
			ruleClassifierDeclaration();
			setState(1607);
			ruleFunctionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleBooleanExpressionContext extends ParserRuleContext {
		public RuleFeaturePrefixContext ruleFeaturePrefix() {
			return getRuleContext(RuleFeaturePrefixContext.class,0);
		}
		public TerminalNode K_BOOL() { return getToken(KerMLv2Parser.K_BOOL, 0); }
		public RuleExpressionDeclarationContext ruleExpressionDeclaration() {
			return getRuleContext(RuleExpressionDeclarationContext.class,0);
		}
		public RuleFunctionBodyContext ruleFunctionBody() {
			return getRuleContext(RuleFunctionBodyContext.class,0);
		}
		public RuleBooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleBooleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleBooleanExpression(this);
		}
	}

	public final RuleBooleanExpressionContext ruleBooleanExpression() throws RecognitionException {
		RuleBooleanExpressionContext _localctx = new RuleBooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_ruleBooleanExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1609);
			ruleFeaturePrefix();
			setState(1610);
			match(K_BOOL);
			setState(1611);
			ruleExpressionDeclaration();
			setState(1612);
			ruleFunctionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleInvariantContext extends ParserRuleContext {
		public RuleFeaturePrefixContext ruleFeaturePrefix() {
			return getRuleContext(RuleFeaturePrefixContext.class,0);
		}
		public TerminalNode K_INV() { return getToken(KerMLv2Parser.K_INV, 0); }
		public RuleExpressionDeclarationContext ruleExpressionDeclaration() {
			return getRuleContext(RuleExpressionDeclarationContext.class,0);
		}
		public RuleFunctionBodyContext ruleFunctionBody() {
			return getRuleContext(RuleFunctionBodyContext.class,0);
		}
		public TerminalNode K_TRUE() { return getToken(KerMLv2Parser.K_TRUE, 0); }
		public TerminalNode K_FALSE() { return getToken(KerMLv2Parser.K_FALSE, 0); }
		public RuleInvariantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleInvariant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleInvariant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleInvariant(this);
		}
	}

	public final RuleInvariantContext ruleInvariant() throws RecognitionException {
		RuleInvariantContext _localctx = new RuleInvariantContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_ruleInvariant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1614);
			ruleFeaturePrefix();
			setState(1615);
			match(K_INV);
			setState(1617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRUE || _la==K_FALSE) {
				{
				setState(1616);
				_la = _input.LA(1);
				if ( !(_la==K_TRUE || _la==K_FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1619);
			ruleExpressionDeclaration();
			setState(1620);
			ruleFunctionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleInteractionContext extends ParserRuleContext {
		public RuleTypePrefixContext ruleTypePrefix() {
			return getRuleContext(RuleTypePrefixContext.class,0);
		}
		public TerminalNode K_INTERACTION() { return getToken(KerMLv2Parser.K_INTERACTION, 0); }
		public RuleClassifierDeclarationContext ruleClassifierDeclaration() {
			return getRuleContext(RuleClassifierDeclarationContext.class,0);
		}
		public RuleTypeBodyContext ruleTypeBody() {
			return getRuleContext(RuleTypeBodyContext.class,0);
		}
		public RuleInteractionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleInteraction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleInteraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleInteraction(this);
		}
	}

	public final RuleInteractionContext ruleInteraction() throws RecognitionException {
		RuleInteractionContext _localctx = new RuleInteractionContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_ruleInteraction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1622);
			ruleTypePrefix();
			setState(1623);
			match(K_INTERACTION);
			setState(1624);
			ruleClassifierDeclaration();
			setState(1625);
			ruleTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleItemFlowContext extends ParserRuleContext {
		public RuleFeaturePrefixContext ruleFeaturePrefix() {
			return getRuleContext(RuleFeaturePrefixContext.class,0);
		}
		public TerminalNode K_FLOW() { return getToken(KerMLv2Parser.K_FLOW, 0); }
		public RuleItemFlowDeclarationContext ruleItemFlowDeclaration() {
			return getRuleContext(RuleItemFlowDeclarationContext.class,0);
		}
		public RuleTypeBodyContext ruleTypeBody() {
			return getRuleContext(RuleTypeBodyContext.class,0);
		}
		public RuleItemFlowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleItemFlow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleItemFlow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleItemFlow(this);
		}
	}

	public final RuleItemFlowContext ruleItemFlow() throws RecognitionException {
		RuleItemFlowContext _localctx = new RuleItemFlowContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_ruleItemFlow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1627);
			ruleFeaturePrefix();
			setState(1628);
			match(K_FLOW);
			setState(1629);
			ruleItemFlowDeclaration();
			setState(1630);
			ruleTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleSuccessionItemFlowContext extends ParserRuleContext {
		public RuleFeaturePrefixContext ruleFeaturePrefix() {
			return getRuleContext(RuleFeaturePrefixContext.class,0);
		}
		public TerminalNode K_SUCCESSION() { return getToken(KerMLv2Parser.K_SUCCESSION, 0); }
		public TerminalNode K_FLOW() { return getToken(KerMLv2Parser.K_FLOW, 0); }
		public RuleItemFlowDeclarationContext ruleItemFlowDeclaration() {
			return getRuleContext(RuleItemFlowDeclarationContext.class,0);
		}
		public RuleTypeBodyContext ruleTypeBody() {
			return getRuleContext(RuleTypeBodyContext.class,0);
		}
		public RuleSuccessionItemFlowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSuccessionItemFlow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleSuccessionItemFlow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleSuccessionItemFlow(this);
		}
	}

	public final RuleSuccessionItemFlowContext ruleSuccessionItemFlow() throws RecognitionException {
		RuleSuccessionItemFlowContext _localctx = new RuleSuccessionItemFlowContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_ruleSuccessionItemFlow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1632);
			ruleFeaturePrefix();
			setState(1633);
			match(K_SUCCESSION);
			setState(1634);
			match(K_FLOW);
			setState(1635);
			ruleItemFlowDeclaration();
			setState(1636);
			ruleTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleItemFlowDeclarationContext extends ParserRuleContext {
		public RuleItemFlowDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleItemFlowDeclaration; }
	 
		public RuleItemFlowDeclarationContext() { }
		public void copyFrom(RuleItemFlowDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleItemFlowDeclaration1Context extends RuleItemFlowDeclarationContext {
		public RuleFeatureDeclarationContext ruleFeatureDeclaration() {
			return getRuleContext(RuleFeatureDeclarationContext.class,0);
		}
		public RuleValuePartContext ruleValuePart() {
			return getRuleContext(RuleValuePartContext.class,0);
		}
		public TerminalNode K_OF() { return getToken(KerMLv2Parser.K_OF, 0); }
		public RuleItemFeatureMemberContext ruleItemFeatureMember() {
			return getRuleContext(RuleItemFeatureMemberContext.class,0);
		}
		public TerminalNode K_FROM() { return getToken(KerMLv2Parser.K_FROM, 0); }
		public List<RuleItemFlowEndMemberContext> ruleItemFlowEndMember() {
			return getRuleContexts(RuleItemFlowEndMemberContext.class);
		}
		public RuleItemFlowEndMemberContext ruleItemFlowEndMember(int i) {
			return getRuleContext(RuleItemFlowEndMemberContext.class,i);
		}
		public TerminalNode K_TO() { return getToken(KerMLv2Parser.K_TO, 0); }
		public RuleItemFlowDeclaration1Context(RuleItemFlowDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleItemFlowDeclaration1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleItemFlowDeclaration1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleItemFlowDeclaration2Context extends RuleItemFlowDeclarationContext {
		public List<RuleItemFlowEndMemberContext> ruleItemFlowEndMember() {
			return getRuleContexts(RuleItemFlowEndMemberContext.class);
		}
		public RuleItemFlowEndMemberContext ruleItemFlowEndMember(int i) {
			return getRuleContext(RuleItemFlowEndMemberContext.class,i);
		}
		public TerminalNode K_TO() { return getToken(KerMLv2Parser.K_TO, 0); }
		public TerminalNode K_ALL() { return getToken(KerMLv2Parser.K_ALL, 0); }
		public RuleItemFlowDeclaration2Context(RuleItemFlowDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleItemFlowDeclaration2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleItemFlowDeclaration2(this);
		}
	}

	public final RuleItemFlowDeclarationContext ruleItemFlowDeclaration() throws RecognitionException {
		RuleItemFlowDeclarationContext _localctx = new RuleItemFlowDeclarationContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_ruleItemFlowDeclaration);
		int _la;
		try {
			setState(1662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
			case 1:
				_localctx = new RuleItemFlowDeclaration1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1639);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4433230887403520L) != 0) || ((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 52776558387233L) != 0)) {
					{
					setState(1638);
					ruleFeatureDeclaration();
					}
				}

				setState(1642);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 6917529027641081857L) != 0)) {
					{
					setState(1641);
					ruleValuePart();
					}
				}

				setState(1646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(1644);
					match(K_OF);
					setState(1645);
					ruleItemFeatureMember();
					}
				}

				setState(1653);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1648);
					match(K_FROM);
					setState(1649);
					ruleItemFlowEndMember();
					setState(1650);
					match(K_TO);
					setState(1651);
					ruleItemFlowEndMember();
					}
				}

				}
				break;
			case 2:
				_localctx = new RuleItemFlowDeclaration2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL) {
					{
					setState(1655);
					match(K_ALL);
					}
				}

				setState(1658);
				ruleItemFlowEndMember();
				setState(1659);
				match(K_TO);
				setState(1660);
				ruleItemFlowEndMember();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleItemFeatureMemberContext extends ParserRuleContext {
		public RuleItemFeatureContext ruleItemFeature() {
			return getRuleContext(RuleItemFeatureContext.class,0);
		}
		public RuleItemFeatureMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleItemFeatureMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleItemFeatureMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleItemFeatureMember(this);
		}
	}

	public final RuleItemFeatureMemberContext ruleItemFeatureMember() throws RecognitionException {
		RuleItemFeatureMemberContext _localctx = new RuleItemFeatureMemberContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_ruleItemFeatureMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1664);
			ruleItemFeature();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleItemFeatureContext extends ParserRuleContext {
		public RuleItemFeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleItemFeature; }
	 
		public RuleItemFeatureContext() { }
		public void copyFrom(RuleItemFeatureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleItemFeature3Context extends RuleItemFeatureContext {
		public RuleOwnedFeatureTypingContext ruleOwnedFeatureTyping() {
			return getRuleContext(RuleOwnedFeatureTypingContext.class,0);
		}
		public RuleOwnedMultiplicityContext ruleOwnedMultiplicity() {
			return getRuleContext(RuleOwnedMultiplicityContext.class,0);
		}
		public RuleItemFeature3Context(RuleItemFeatureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleItemFeature3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleItemFeature3(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleItemFeature4Context extends RuleItemFeatureContext {
		public RuleOwnedMultiplicityContext ruleOwnedMultiplicity() {
			return getRuleContext(RuleOwnedMultiplicityContext.class,0);
		}
		public RuleOwnedFeatureTypingContext ruleOwnedFeatureTyping() {
			return getRuleContext(RuleOwnedFeatureTypingContext.class,0);
		}
		public RuleItemFeature4Context(RuleItemFeatureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleItemFeature4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleItemFeature4(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleItemFeature1Context extends RuleItemFeatureContext {
		public RuleItemFeatureSpecializationPartContext ruleItemFeatureSpecializationPart() {
			return getRuleContext(RuleItemFeatureSpecializationPartContext.class,0);
		}
		public RuleIdentificationContext ruleIdentification() {
			return getRuleContext(RuleIdentificationContext.class,0);
		}
		public RuleValuePartContext ruleValuePart() {
			return getRuleContext(RuleValuePartContext.class,0);
		}
		public RuleItemFeature1Context(RuleItemFeatureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleItemFeature1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleItemFeature1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleItemFeature2Context extends RuleItemFeatureContext {
		public RuleValuePartContext ruleValuePart() {
			return getRuleContext(RuleValuePartContext.class,0);
		}
		public RuleIdentificationContext ruleIdentification() {
			return getRuleContext(RuleIdentificationContext.class,0);
		}
		public RuleItemFeature2Context(RuleItemFeatureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleItemFeature2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleItemFeature2(this);
		}
	}

	public final RuleItemFeatureContext ruleItemFeature() throws RecognitionException {
		RuleItemFeatureContext _localctx = new RuleItemFeatureContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_ruleItemFeature);
		int _la;
		try {
			setState(1684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				_localctx = new RuleItemFeature1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 52776558133249L) != 0)) {
					{
					setState(1666);
					ruleIdentification();
					}
				}

				setState(1669);
				ruleItemFeatureSpecializationPart();
				setState(1671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 6917529027641081857L) != 0)) {
					{
					setState(1670);
					ruleValuePart();
					}
				}

				}
				break;
			case 2:
				_localctx = new RuleItemFeature2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 52776558133249L) != 0)) {
					{
					setState(1673);
					ruleIdentification();
					}
				}

				setState(1676);
				ruleValuePart();
				}
				break;
			case 3:
				_localctx = new RuleItemFeature3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1677);
				ruleOwnedFeatureTyping();
				setState(1679);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LSQUARE) {
					{
					setState(1678);
					ruleOwnedMultiplicity();
					}
				}

				}
				break;
			case 4:
				_localctx = new RuleItemFeature4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1681);
				ruleOwnedMultiplicity();
				setState(1682);
				ruleOwnedFeatureTyping();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleItemFeatureSpecializationPartContext extends ParserRuleContext {
		public RuleItemFeatureSpecializationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleItemFeatureSpecializationPart; }
	 
		public RuleItemFeatureSpecializationPartContext() { }
		public void copyFrom(RuleItemFeatureSpecializationPartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleItemFeatureSpecializationPart2Context extends RuleItemFeatureSpecializationPartContext {
		public RuleMultiplicityPartContext ruleMultiplicityPart() {
			return getRuleContext(RuleMultiplicityPartContext.class,0);
		}
		public List<RuleFeatureSpecializationContext> ruleFeatureSpecialization() {
			return getRuleContexts(RuleFeatureSpecializationContext.class);
		}
		public RuleFeatureSpecializationContext ruleFeatureSpecialization(int i) {
			return getRuleContext(RuleFeatureSpecializationContext.class,i);
		}
		public RuleItemFeatureSpecializationPart2Context(RuleItemFeatureSpecializationPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleItemFeatureSpecializationPart2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleItemFeatureSpecializationPart2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleItemFeatureSpecializationPart1Context extends RuleItemFeatureSpecializationPartContext {
		public List<RuleFeatureSpecializationContext> ruleFeatureSpecialization() {
			return getRuleContexts(RuleFeatureSpecializationContext.class);
		}
		public RuleFeatureSpecializationContext ruleFeatureSpecialization(int i) {
			return getRuleContext(RuleFeatureSpecializationContext.class,i);
		}
		public RuleMultiplicityPartContext ruleMultiplicityPart() {
			return getRuleContext(RuleMultiplicityPartContext.class,0);
		}
		public RuleItemFeatureSpecializationPart1Context(RuleItemFeatureSpecializationPartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleItemFeatureSpecializationPart1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleItemFeatureSpecializationPart1(this);
		}
	}

	public final RuleItemFeatureSpecializationPartContext ruleItemFeatureSpecializationPart() throws RecognitionException {
		RuleItemFeatureSpecializationPartContext _localctx = new RuleItemFeatureSpecializationPartContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_ruleItemFeatureSpecializationPart);
		int _la;
		try {
			int _alt;
			setState(1706);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_TYPED:
			case K_SUBSETS:
			case K_REFERENCES:
			case K_REDEFINES:
			case OP_COLON_RANGLE:
			case OP_COLON:
			case OP_COLON_COLON_RANGLE:
			case OP_COLON_RANGLE_RANGLE:
				_localctx = new RuleItemFeatureSpecializationPart1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1687); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1686);
						ruleFeatureSpecialization();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1689); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,196,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & 576460752303423491L) != 0)) {
					{
					setState(1691);
					ruleMultiplicityPart();
					}
				}

				setState(1697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4222124650659840L) != 0) || ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 29L) != 0)) {
					{
					{
					setState(1694);
					ruleFeatureSpecialization();
					}
					}
					setState(1699);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case K_ORDERED:
			case K_NONUNIQUE:
			case LSQUARE:
				_localctx = new RuleItemFeatureSpecializationPart2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1700);
				ruleMultiplicityPart();
				setState(1702); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1701);
					ruleFeatureSpecialization();
					}
					}
					setState(1704); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 4222124650659840L) != 0) || ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 29L) != 0) );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleItemFlowEndMemberContext extends ParserRuleContext {
		public RuleItemFlowEndContext ruleItemFlowEnd() {
			return getRuleContext(RuleItemFlowEndContext.class,0);
		}
		public RuleItemFlowEndMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleItemFlowEndMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleItemFlowEndMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleItemFlowEndMember(this);
		}
	}

	public final RuleItemFlowEndMemberContext ruleItemFlowEndMember() throws RecognitionException {
		RuleItemFlowEndMemberContext _localctx = new RuleItemFlowEndMemberContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_ruleItemFlowEndMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1708);
			ruleItemFlowEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleItemFlowEndContext extends ParserRuleContext {
		public RuleItemFlowFeatureMemberContext ruleItemFlowFeatureMember() {
			return getRuleContext(RuleItemFlowFeatureMemberContext.class,0);
		}
		public RuleItemFlowEndSubsettingContext ruleItemFlowEndSubsetting() {
			return getRuleContext(RuleItemFlowEndSubsettingContext.class,0);
		}
		public RuleItemFlowEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleItemFlowEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleItemFlowEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleItemFlowEnd(this);
		}
	}

	public final RuleItemFlowEndContext ruleItemFlowEnd() throws RecognitionException {
		RuleItemFlowEndContext _localctx = new RuleItemFlowEndContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_ruleItemFlowEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1711);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				{
				setState(1710);
				ruleItemFlowEndSubsetting();
				}
				break;
			}
			setState(1713);
			ruleItemFlowFeatureMember();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleItemFlowEndSubsettingContext extends ParserRuleContext {
		public RuleItemFlowEndSubsettingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleItemFlowEndSubsetting; }
	 
		public RuleItemFlowEndSubsettingContext() { }
		public void copyFrom(RuleItemFlowEndSubsettingContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleItemFlowEndSubsetting1Context extends RuleItemFlowEndSubsettingContext {
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public TerminalNode OP_DOT() { return getToken(KerMLv2Parser.OP_DOT, 0); }
		public RuleItemFlowEndSubsetting1Context(RuleItemFlowEndSubsettingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleItemFlowEndSubsetting1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleItemFlowEndSubsetting1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleItemFlowEndSubsetting2Context extends RuleItemFlowEndSubsettingContext {
		public RuleFeatureChainPrefixContext ruleFeatureChainPrefix() {
			return getRuleContext(RuleFeatureChainPrefixContext.class,0);
		}
		public RuleItemFlowEndSubsetting2Context(RuleItemFlowEndSubsettingContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleItemFlowEndSubsetting2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleItemFlowEndSubsetting2(this);
		}
	}

	public final RuleItemFlowEndSubsettingContext ruleItemFlowEndSubsetting() throws RecognitionException {
		RuleItemFlowEndSubsettingContext _localctx = new RuleItemFlowEndSubsettingContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_ruleItemFlowEndSubsetting);
		try {
			setState(1719);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				_localctx = new RuleItemFlowEndSubsetting1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1715);
				ruleQualifiedName();
				setState(1716);
				match(OP_DOT);
				}
				break;
			case 2:
				_localctx = new RuleItemFlowEndSubsetting2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1718);
				ruleFeatureChainPrefix();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureChainPrefixContext extends ParserRuleContext {
		public List<RuleOwnedFeatureChainingContext> ruleOwnedFeatureChaining() {
			return getRuleContexts(RuleOwnedFeatureChainingContext.class);
		}
		public RuleOwnedFeatureChainingContext ruleOwnedFeatureChaining(int i) {
			return getRuleContext(RuleOwnedFeatureChainingContext.class,i);
		}
		public List<TerminalNode> OP_DOT() { return getTokens(KerMLv2Parser.OP_DOT); }
		public TerminalNode OP_DOT(int i) {
			return getToken(KerMLv2Parser.OP_DOT, i);
		}
		public RuleFeatureChainPrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFeatureChainPrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureChainPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureChainPrefix(this);
		}
	}

	public final RuleFeatureChainPrefixContext ruleFeatureChainPrefix() throws RecognitionException {
		RuleFeatureChainPrefixContext _localctx = new RuleFeatureChainPrefixContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_ruleFeatureChainPrefix);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1724); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1721);
					ruleOwnedFeatureChaining();
					setState(1722);
					match(OP_DOT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1726); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,203,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1728);
			ruleOwnedFeatureChaining();
			setState(1729);
			match(OP_DOT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleItemFlowFeatureMemberContext extends ParserRuleContext {
		public RuleItemFlowFeatureContext ruleItemFlowFeature() {
			return getRuleContext(RuleItemFlowFeatureContext.class,0);
		}
		public RuleItemFlowFeatureMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleItemFlowFeatureMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleItemFlowFeatureMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleItemFlowFeatureMember(this);
		}
	}

	public final RuleItemFlowFeatureMemberContext ruleItemFlowFeatureMember() throws RecognitionException {
		RuleItemFlowFeatureMemberContext _localctx = new RuleItemFlowFeatureMemberContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_ruleItemFlowFeatureMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1731);
			ruleItemFlowFeature();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleItemFlowFeatureContext extends ParserRuleContext {
		public RuleItemFlowRedefinitionContext ruleItemFlowRedefinition() {
			return getRuleContext(RuleItemFlowRedefinitionContext.class,0);
		}
		public RuleItemFlowFeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleItemFlowFeature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleItemFlowFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleItemFlowFeature(this);
		}
	}

	public final RuleItemFlowFeatureContext ruleItemFlowFeature() throws RecognitionException {
		RuleItemFlowFeatureContext _localctx = new RuleItemFlowFeatureContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_ruleItemFlowFeature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1733);
			ruleItemFlowRedefinition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleItemFlowRedefinitionContext extends ParserRuleContext {
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleItemFlowRedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleItemFlowRedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleItemFlowRedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleItemFlowRedefinition(this);
		}
	}

	public final RuleItemFlowRedefinitionContext ruleItemFlowRedefinition() throws RecognitionException {
		RuleItemFlowRedefinitionContext _localctx = new RuleItemFlowRedefinitionContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_ruleItemFlowRedefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1735);
			ruleQualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleMetaclassContext extends ParserRuleContext {
		public RuleTypePrefixContext ruleTypePrefix() {
			return getRuleContext(RuleTypePrefixContext.class,0);
		}
		public TerminalNode K_METACLASS() { return getToken(KerMLv2Parser.K_METACLASS, 0); }
		public RuleClassifierDeclarationContext ruleClassifierDeclaration() {
			return getRuleContext(RuleClassifierDeclarationContext.class,0);
		}
		public RuleTypeBodyContext ruleTypeBody() {
			return getRuleContext(RuleTypeBodyContext.class,0);
		}
		public RuleMetaclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleMetaclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleMetaclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleMetaclass(this);
		}
	}

	public final RuleMetaclassContext ruleMetaclass() throws RecognitionException {
		RuleMetaclassContext _localctx = new RuleMetaclassContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_ruleMetaclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1737);
			ruleTypePrefix();
			setState(1738);
			match(K_METACLASS);
			setState(1739);
			ruleClassifierDeclaration();
			setState(1740);
			ruleTypeBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RulePrefixMetadataAnnotationContext extends ParserRuleContext {
		public TerminalNode OP_HASH() { return getToken(KerMLv2Parser.OP_HASH, 0); }
		public RulePrefixMetadataFeatureContext rulePrefixMetadataFeature() {
			return getRuleContext(RulePrefixMetadataFeatureContext.class,0);
		}
		public RulePrefixMetadataAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulePrefixMetadataAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRulePrefixMetadataAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRulePrefixMetadataAnnotation(this);
		}
	}

	public final RulePrefixMetadataAnnotationContext rulePrefixMetadataAnnotation() throws RecognitionException {
		RulePrefixMetadataAnnotationContext _localctx = new RulePrefixMetadataAnnotationContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_rulePrefixMetadataAnnotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1742);
			match(OP_HASH);
			setState(1743);
			rulePrefixMetadataFeature();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RulePrefixMetadataMemberContext extends ParserRuleContext {
		public TerminalNode OP_HASH() { return getToken(KerMLv2Parser.OP_HASH, 0); }
		public RulePrefixMetadataFeatureContext rulePrefixMetadataFeature() {
			return getRuleContext(RulePrefixMetadataFeatureContext.class,0);
		}
		public RulePrefixMetadataMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulePrefixMetadataMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRulePrefixMetadataMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRulePrefixMetadataMember(this);
		}
	}

	public final RulePrefixMetadataMemberContext rulePrefixMetadataMember() throws RecognitionException {
		RulePrefixMetadataMemberContext _localctx = new RulePrefixMetadataMemberContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_rulePrefixMetadataMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1745);
			match(OP_HASH);
			setState(1746);
			rulePrefixMetadataFeature();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RulePrefixMetadataFeatureContext extends ParserRuleContext {
		public RuleMetadataTypingContext ruleMetadataTyping() {
			return getRuleContext(RuleMetadataTypingContext.class,0);
		}
		public RulePrefixMetadataFeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulePrefixMetadataFeature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRulePrefixMetadataFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRulePrefixMetadataFeature(this);
		}
	}

	public final RulePrefixMetadataFeatureContext rulePrefixMetadataFeature() throws RecognitionException {
		RulePrefixMetadataFeatureContext _localctx = new RulePrefixMetadataFeatureContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_rulePrefixMetadataFeature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748);
			ruleMetadataTyping();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleMetadataFeatureContext extends ParserRuleContext {
		public RuleMetadataFeatureDeclarationContext ruleMetadataFeatureDeclaration() {
			return getRuleContext(RuleMetadataFeatureDeclarationContext.class,0);
		}
		public RuleMetadataBodyContext ruleMetadataBody() {
			return getRuleContext(RuleMetadataBodyContext.class,0);
		}
		public TerminalNode OP_AT() { return getToken(KerMLv2Parser.OP_AT, 0); }
		public TerminalNode K_METADATA() { return getToken(KerMLv2Parser.K_METADATA, 0); }
		public List<RulePrefixMetadataMemberContext> rulePrefixMetadataMember() {
			return getRuleContexts(RulePrefixMetadataMemberContext.class);
		}
		public RulePrefixMetadataMemberContext rulePrefixMetadataMember(int i) {
			return getRuleContext(RulePrefixMetadataMemberContext.class,i);
		}
		public TerminalNode K_ABOUT() { return getToken(KerMLv2Parser.K_ABOUT, 0); }
		public List<RuleAnnotationContext> ruleAnnotation() {
			return getRuleContexts(RuleAnnotationContext.class);
		}
		public RuleAnnotationContext ruleAnnotation(int i) {
			return getRuleContext(RuleAnnotationContext.class,i);
		}
		public List<TerminalNode> OP_COMMA() { return getTokens(KerMLv2Parser.OP_COMMA); }
		public TerminalNode OP_COMMA(int i) {
			return getToken(KerMLv2Parser.OP_COMMA, i);
		}
		public RuleMetadataFeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleMetadataFeature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleMetadataFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleMetadataFeature(this);
		}
	}

	public final RuleMetadataFeatureContext ruleMetadataFeature() throws RecognitionException {
		RuleMetadataFeatureContext _localctx = new RuleMetadataFeatureContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_ruleMetadataFeature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_HASH) {
				{
				{
				setState(1750);
				rulePrefixMetadataMember();
				}
				}
				setState(1755);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1756);
			_la = _input.LA(1);
			if ( !(_la==K_METADATA || _la==OP_AT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1757);
			ruleMetadataFeatureDeclaration();
			setState(1767);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ABOUT) {
				{
				setState(1758);
				match(K_ABOUT);
				setState(1759);
				ruleAnnotation();
				setState(1764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OP_COMMA) {
					{
					{
					setState(1760);
					match(OP_COMMA);
					setState(1761);
					ruleAnnotation();
					}
					}
					setState(1766);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1769);
			ruleMetadataBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleMetadataFeatureDeclarationContext extends ParserRuleContext {
		public RuleMetadataTypingContext ruleMetadataTyping() {
			return getRuleContext(RuleMetadataTypingContext.class,0);
		}
		public RuleIdentificationContext ruleIdentification() {
			return getRuleContext(RuleIdentificationContext.class,0);
		}
		public TerminalNode OP_COLON() { return getToken(KerMLv2Parser.OP_COLON, 0); }
		public TerminalNode K_TYPED() { return getToken(KerMLv2Parser.K_TYPED, 0); }
		public TerminalNode K_BY() { return getToken(KerMLv2Parser.K_BY, 0); }
		public RuleMetadataFeatureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleMetadataFeatureDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleMetadataFeatureDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleMetadataFeatureDeclaration(this);
		}
	}

	public final RuleMetadataFeatureDeclarationContext ruleMetadataFeatureDeclaration() throws RecognitionException {
		RuleMetadataFeatureDeclarationContext _localctx = new RuleMetadataFeatureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_ruleMetadataFeatureDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1777);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
			case 1:
				{
				setState(1771);
				ruleIdentification();
				setState(1775);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_COLON:
					{
					setState(1772);
					match(OP_COLON);
					}
					break;
				case K_TYPED:
					{
					setState(1773);
					match(K_TYPED);
					setState(1774);
					match(K_BY);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			setState(1779);
			ruleMetadataTyping();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleMetadataTypingContext extends ParserRuleContext {
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleMetadataTypingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleMetadataTyping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleMetadataTyping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleMetadataTyping(this);
		}
	}

	public final RuleMetadataTypingContext ruleMetadataTyping() throws RecognitionException {
		RuleMetadataTypingContext _localctx = new RuleMetadataTypingContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_ruleMetadataTyping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1781);
			ruleQualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleMetadataBodyContext extends ParserRuleContext {
		public RuleMetadataBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleMetadataBody; }
	 
		public RuleMetadataBodyContext() { }
		public void copyFrom(RuleMetadataBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleMetadataBody2Context extends RuleMetadataBodyContext {
		public TerminalNode LBRACE() { return getToken(KerMLv2Parser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(KerMLv2Parser.RBRACE, 0); }
		public List<RuleNonFeatureMemberContext> ruleNonFeatureMember() {
			return getRuleContexts(RuleNonFeatureMemberContext.class);
		}
		public RuleNonFeatureMemberContext ruleNonFeatureMember(int i) {
			return getRuleContext(RuleNonFeatureMemberContext.class,i);
		}
		public List<RuleMetadataBodyFeatureMemberContext> ruleMetadataBodyFeatureMember() {
			return getRuleContexts(RuleMetadataBodyFeatureMemberContext.class);
		}
		public RuleMetadataBodyFeatureMemberContext ruleMetadataBodyFeatureMember(int i) {
			return getRuleContext(RuleMetadataBodyFeatureMemberContext.class,i);
		}
		public List<RuleAliasMemberContext> ruleAliasMember() {
			return getRuleContexts(RuleAliasMemberContext.class);
		}
		public RuleAliasMemberContext ruleAliasMember(int i) {
			return getRuleContext(RuleAliasMemberContext.class,i);
		}
		public List<RuleImportContext> ruleImport() {
			return getRuleContexts(RuleImportContext.class);
		}
		public RuleImportContext ruleImport(int i) {
			return getRuleContext(RuleImportContext.class,i);
		}
		public RuleMetadataBody2Context(RuleMetadataBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleMetadataBody2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleMetadataBody2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleMetadataBody1Context extends RuleMetadataBodyContext {
		public TerminalNode OP_SEMI() { return getToken(KerMLv2Parser.OP_SEMI, 0); }
		public RuleMetadataBody1Context(RuleMetadataBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleMetadataBody1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleMetadataBody1(this);
		}
	}

	public final RuleMetadataBodyContext ruleMetadataBody() throws RecognitionException {
		RuleMetadataBodyContext _localctx = new RuleMetadataBodyContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_ruleMetadataBody);
		int _la;
		try {
			setState(1795);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_SEMI:
				_localctx = new RuleMetadataBody1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1783);
				match(OP_SEMI);
				}
				break;
			case LBRACE:
				_localctx = new RuleMetadataBody2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1784);
				match(LBRACE);
				setState(1791);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9077010580624879570L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 54606145951642661L) != 0) || ((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & 11L) != 0)) {
					{
					setState(1789);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
					case 1:
						{
						setState(1785);
						ruleNonFeatureMember();
						}
						break;
					case 2:
						{
						setState(1786);
						ruleMetadataBodyFeatureMember();
						}
						break;
					case 3:
						{
						setState(1787);
						ruleAliasMember();
						}
						break;
					case 4:
						{
						setState(1788);
						ruleImport();
						}
						break;
					}
					}
					setState(1793);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1794);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleMetadataBodyFeatureMemberContext extends ParserRuleContext {
		public RuleMetadataBodyFeatureContext ruleMetadataBodyFeature() {
			return getRuleContext(RuleMetadataBodyFeatureContext.class,0);
		}
		public RuleMetadataBodyFeatureMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleMetadataBodyFeatureMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleMetadataBodyFeatureMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleMetadataBodyFeatureMember(this);
		}
	}

	public final RuleMetadataBodyFeatureMemberContext ruleMetadataBodyFeatureMember() throws RecognitionException {
		RuleMetadataBodyFeatureMemberContext _localctx = new RuleMetadataBodyFeatureMemberContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_ruleMetadataBodyFeatureMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1797);
			ruleMetadataBodyFeature();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleMetadataBodyFeatureContext extends ParserRuleContext {
		public RuleOwnedRedefinitionContext ruleOwnedRedefinition() {
			return getRuleContext(RuleOwnedRedefinitionContext.class,0);
		}
		public RuleMetadataBodyContext ruleMetadataBody() {
			return getRuleContext(RuleMetadataBodyContext.class,0);
		}
		public TerminalNode K_FEATURE() { return getToken(KerMLv2Parser.K_FEATURE, 0); }
		public RuleFeatureSpecializationPartContext ruleFeatureSpecializationPart() {
			return getRuleContext(RuleFeatureSpecializationPartContext.class,0);
		}
		public RuleValuePartContext ruleValuePart() {
			return getRuleContext(RuleValuePartContext.class,0);
		}
		public TerminalNode OP_COLON_RANGLE_RANGLE() { return getToken(KerMLv2Parser.OP_COLON_RANGLE_RANGLE, 0); }
		public TerminalNode K_REDEFINES() { return getToken(KerMLv2Parser.K_REDEFINES, 0); }
		public RuleMetadataBodyFeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleMetadataBodyFeature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleMetadataBodyFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleMetadataBodyFeature(this);
		}
	}

	public final RuleMetadataBodyFeatureContext ruleMetadataBodyFeature() throws RecognitionException {
		RuleMetadataBodyFeatureContext _localctx = new RuleMetadataBodyFeatureContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_ruleMetadataBodyFeature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FEATURE) {
				{
				setState(1799);
				match(K_FEATURE);
				}
			}

			setState(1803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_REDEFINES || _la==OP_COLON_RANGLE_RANGLE) {
				{
				setState(1802);
				_la = _input.LA(1);
				if ( !(_la==K_REDEFINES || _la==OP_COLON_RANGLE_RANGLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1805);
			ruleOwnedRedefinition();
			setState(1807);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4433230883192832L) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & 7425L) != 0)) {
				{
				setState(1806);
				ruleFeatureSpecializationPart();
				}
			}

			setState(1810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 6917529027641081857L) != 0)) {
				{
				setState(1809);
				ruleValuePart();
				}
			}

			setState(1812);
			ruleMetadataBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleExpressionBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(KerMLv2Parser.LBRACE, 0); }
		public RuleFunctionBodyPartContext ruleFunctionBodyPart() {
			return getRuleContext(RuleFunctionBodyPartContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(KerMLv2Parser.RBRACE, 0); }
		public RuleExpressionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleExpressionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleExpressionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleExpressionBody(this);
		}
	}

	public final RuleExpressionBodyContext ruleExpressionBody() throws RecognitionException {
		RuleExpressionBodyContext _localctx = new RuleExpressionBodyContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_ruleExpressionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1814);
			match(LBRACE);
			setState(1815);
			ruleFunctionBodyPart();
			setState(1816);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedExpressionMemberContext extends ParserRuleContext {
		public RuleOwnedExpressionContext ruleOwnedExpression() {
			return getRuleContext(RuleOwnedExpressionContext.class,0);
		}
		public RuleOwnedExpressionMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOwnedExpressionMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleOwnedExpressionMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleOwnedExpressionMember(this);
		}
	}

	public final RuleOwnedExpressionMemberContext ruleOwnedExpressionMember() throws RecognitionException {
		RuleOwnedExpressionMemberContext _localctx = new RuleOwnedExpressionMemberContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_ruleOwnedExpressionMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1818);
			ruleOwnedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedExpressionContext extends ParserRuleContext {
		public RuleConditionalExpressionContext ruleConditionalExpression() {
			return getRuleContext(RuleConditionalExpressionContext.class,0);
		}
		public RuleOwnedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOwnedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleOwnedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleOwnedExpression(this);
		}
	}

	public final RuleOwnedExpressionContext ruleOwnedExpression() throws RecognitionException {
		RuleOwnedExpressionContext _localctx = new RuleOwnedExpressionContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_ruleOwnedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1820);
			ruleConditionalExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedExpressionReferenceContext extends ParserRuleContext {
		public RuleOwnedExpressionMemberContext ruleOwnedExpressionMember() {
			return getRuleContext(RuleOwnedExpressionMemberContext.class,0);
		}
		public RuleOwnedExpressionReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOwnedExpressionReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleOwnedExpressionReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleOwnedExpressionReference(this);
		}
	}

	public final RuleOwnedExpressionReferenceContext ruleOwnedExpressionReference() throws RecognitionException {
		RuleOwnedExpressionReferenceContext _localctx = new RuleOwnedExpressionReferenceContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_ruleOwnedExpressionReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1822);
			ruleOwnedExpressionMember();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleConditionalExpressionContext extends ParserRuleContext {
		public RuleConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleConditionalExpression; }
	 
		public RuleConditionalExpressionContext() { }
		public void copyFrom(RuleConditionalExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleConditionalExpression1Context extends RuleConditionalExpressionContext {
		public RuleNullCoalescingExpressionContext ruleNullCoalescingExpression() {
			return getRuleContext(RuleNullCoalescingExpressionContext.class,0);
		}
		public RuleConditionalExpression1Context(RuleConditionalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleConditionalExpression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleConditionalExpression1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleConditionalExpression2Context extends RuleConditionalExpressionContext {
		public RuleConditionalOperatorContext ruleConditionalOperator() {
			return getRuleContext(RuleConditionalOperatorContext.class,0);
		}
		public RuleNullCoalescingExpressionContext ruleNullCoalescingExpression() {
			return getRuleContext(RuleNullCoalescingExpressionContext.class,0);
		}
		public TerminalNode OP_QMARK() { return getToken(KerMLv2Parser.OP_QMARK, 0); }
		public List<RuleOwnedExpressionReferenceContext> ruleOwnedExpressionReference() {
			return getRuleContexts(RuleOwnedExpressionReferenceContext.class);
		}
		public RuleOwnedExpressionReferenceContext ruleOwnedExpressionReference(int i) {
			return getRuleContext(RuleOwnedExpressionReferenceContext.class,i);
		}
		public TerminalNode K_ELSE() { return getToken(KerMLv2Parser.K_ELSE, 0); }
		public RuleConditionalExpression2Context(RuleConditionalExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleConditionalExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleConditionalExpression2(this);
		}
	}

	public final RuleConditionalExpressionContext ruleConditionalExpression() throws RecognitionException {
		RuleConditionalExpressionContext _localctx = new RuleConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_ruleConditionalExpression);
		try {
			setState(1832);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ALL:
			case K_TRUE:
			case K_FALSE:
			case K_HASTYPE:
			case K_ISTYPE:
			case K_AS:
			case K_NOT:
			case K_NULL:
			case LBRACE:
			case LPAREN:
			case OP_STAR:
			case OP_TILDE:
			case OP_DOT:
			case OP_AT:
			case OP_PLUS:
			case OP_MINUS:
			case RULE_DECIMAL_VALUE:
			case RULE_EXP_VALUE:
			case RULE_ID:
			case RULE_UNRESTRICTED_NAME:
			case RULE_STRING_VALUE:
				_localctx = new RuleConditionalExpression1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1824);
				ruleNullCoalescingExpression();
				}
				break;
			case K_IF:
				_localctx = new RuleConditionalExpression2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1825);
				ruleConditionalOperator();
				setState(1826);
				ruleNullCoalescingExpression();
				setState(1827);
				match(OP_QMARK);
				setState(1828);
				ruleOwnedExpressionReference();
				setState(1829);
				match(K_ELSE);
				setState(1830);
				ruleOwnedExpressionReference();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleConditionalOperatorContext extends ParserRuleContext {
		public TerminalNode K_IF() { return getToken(KerMLv2Parser.K_IF, 0); }
		public RuleConditionalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleConditionalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleConditionalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleConditionalOperator(this);
		}
	}

	public final RuleConditionalOperatorContext ruleConditionalOperator() throws RecognitionException {
		RuleConditionalOperatorContext _localctx = new RuleConditionalOperatorContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_ruleConditionalOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1834);
			match(K_IF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleNullCoalescingExpressionContext extends ParserRuleContext {
		public RuleImpliesExpressionContext ruleImpliesExpression() {
			return getRuleContext(RuleImpliesExpressionContext.class,0);
		}
		public List<RuleNullCoalescingOperatorContext> ruleNullCoalescingOperator() {
			return getRuleContexts(RuleNullCoalescingOperatorContext.class);
		}
		public RuleNullCoalescingOperatorContext ruleNullCoalescingOperator(int i) {
			return getRuleContext(RuleNullCoalescingOperatorContext.class,i);
		}
		public List<RuleImpliesExpressionReferenceContext> ruleImpliesExpressionReference() {
			return getRuleContexts(RuleImpliesExpressionReferenceContext.class);
		}
		public RuleImpliesExpressionReferenceContext ruleImpliesExpressionReference(int i) {
			return getRuleContext(RuleImpliesExpressionReferenceContext.class,i);
		}
		public RuleNullCoalescingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleNullCoalescingExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNullCoalescingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNullCoalescingExpression(this);
		}
	}

	public final RuleNullCoalescingExpressionContext ruleNullCoalescingExpression() throws RecognitionException {
		RuleNullCoalescingExpressionContext _localctx = new RuleNullCoalescingExpressionContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_ruleNullCoalescingExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1836);
			ruleImpliesExpression();
			setState(1842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_QMARK_QMARK) {
				{
				{
				setState(1837);
				ruleNullCoalescingOperator();
				setState(1838);
				ruleImpliesExpressionReference();
				}
				}
				setState(1844);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleNullCoalescingOperatorContext extends ParserRuleContext {
		public TerminalNode OP_QMARK_QMARK() { return getToken(KerMLv2Parser.OP_QMARK_QMARK, 0); }
		public RuleNullCoalescingOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleNullCoalescingOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNullCoalescingOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNullCoalescingOperator(this);
		}
	}

	public final RuleNullCoalescingOperatorContext ruleNullCoalescingOperator() throws RecognitionException {
		RuleNullCoalescingOperatorContext _localctx = new RuleNullCoalescingOperatorContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_ruleNullCoalescingOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1845);
			match(OP_QMARK_QMARK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleImpliesExpressionReferenceContext extends ParserRuleContext {
		public RuleImpliesExpressionMemberContext ruleImpliesExpressionMember() {
			return getRuleContext(RuleImpliesExpressionMemberContext.class,0);
		}
		public RuleImpliesExpressionReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleImpliesExpressionReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleImpliesExpressionReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleImpliesExpressionReference(this);
		}
	}

	public final RuleImpliesExpressionReferenceContext ruleImpliesExpressionReference() throws RecognitionException {
		RuleImpliesExpressionReferenceContext _localctx = new RuleImpliesExpressionReferenceContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_ruleImpliesExpressionReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1847);
			ruleImpliesExpressionMember();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleImpliesExpressionMemberContext extends ParserRuleContext {
		public RuleImpliesExpressionContext ruleImpliesExpression() {
			return getRuleContext(RuleImpliesExpressionContext.class,0);
		}
		public RuleImpliesExpressionMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleImpliesExpressionMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleImpliesExpressionMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleImpliesExpressionMember(this);
		}
	}

	public final RuleImpliesExpressionMemberContext ruleImpliesExpressionMember() throws RecognitionException {
		RuleImpliesExpressionMemberContext _localctx = new RuleImpliesExpressionMemberContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_ruleImpliesExpressionMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1849);
			ruleImpliesExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleImpliesExpressionContext extends ParserRuleContext {
		public RuleOrExpressionContext ruleOrExpression() {
			return getRuleContext(RuleOrExpressionContext.class,0);
		}
		public List<RuleImpliesOperatorContext> ruleImpliesOperator() {
			return getRuleContexts(RuleImpliesOperatorContext.class);
		}
		public RuleImpliesOperatorContext ruleImpliesOperator(int i) {
			return getRuleContext(RuleImpliesOperatorContext.class,i);
		}
		public List<RuleOrExpressionReferenceContext> ruleOrExpressionReference() {
			return getRuleContexts(RuleOrExpressionReferenceContext.class);
		}
		public RuleOrExpressionReferenceContext ruleOrExpressionReference(int i) {
			return getRuleContext(RuleOrExpressionReferenceContext.class,i);
		}
		public RuleImpliesExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleImpliesExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleImpliesExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleImpliesExpression(this);
		}
	}

	public final RuleImpliesExpressionContext ruleImpliesExpression() throws RecognitionException {
		RuleImpliesExpressionContext _localctx = new RuleImpliesExpressionContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_ruleImpliesExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1851);
			ruleOrExpression();
			setState(1857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_IMPLIES) {
				{
				{
				setState(1852);
				ruleImpliesOperator();
				setState(1853);
				ruleOrExpressionReference();
				}
				}
				setState(1859);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleImpliesOperatorContext extends ParserRuleContext {
		public TerminalNode K_IMPLIES() { return getToken(KerMLv2Parser.K_IMPLIES, 0); }
		public RuleImpliesOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleImpliesOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleImpliesOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleImpliesOperator(this);
		}
	}

	public final RuleImpliesOperatorContext ruleImpliesOperator() throws RecognitionException {
		RuleImpliesOperatorContext _localctx = new RuleImpliesOperatorContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_ruleImpliesOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1860);
			match(K_IMPLIES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleOrExpressionReferenceContext extends ParserRuleContext {
		public RuleOrExpressionMemberContext ruleOrExpressionMember() {
			return getRuleContext(RuleOrExpressionMemberContext.class,0);
		}
		public RuleOrExpressionReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOrExpressionReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleOrExpressionReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleOrExpressionReference(this);
		}
	}

	public final RuleOrExpressionReferenceContext ruleOrExpressionReference() throws RecognitionException {
		RuleOrExpressionReferenceContext _localctx = new RuleOrExpressionReferenceContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_ruleOrExpressionReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1862);
			ruleOrExpressionMember();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleOrExpressionMemberContext extends ParserRuleContext {
		public RuleOrExpressionContext ruleOrExpression() {
			return getRuleContext(RuleOrExpressionContext.class,0);
		}
		public RuleOrExpressionMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOrExpressionMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleOrExpressionMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleOrExpressionMember(this);
		}
	}

	public final RuleOrExpressionMemberContext ruleOrExpressionMember() throws RecognitionException {
		RuleOrExpressionMemberContext _localctx = new RuleOrExpressionMemberContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_ruleOrExpressionMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1864);
			ruleOrExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleOrExpressionContext extends ParserRuleContext {
		public List<RuleXorExpressionContext> ruleXorExpression() {
			return getRuleContexts(RuleXorExpressionContext.class);
		}
		public RuleXorExpressionContext ruleXorExpression(int i) {
			return getRuleContext(RuleXorExpressionContext.class,i);
		}
		public List<RuleOrOperatorContext> ruleOrOperator() {
			return getRuleContexts(RuleOrOperatorContext.class);
		}
		public RuleOrOperatorContext ruleOrOperator(int i) {
			return getRuleContext(RuleOrOperatorContext.class,i);
		}
		public List<RuleConditionalOrOperatorContext> ruleConditionalOrOperator() {
			return getRuleContexts(RuleConditionalOrOperatorContext.class);
		}
		public RuleConditionalOrOperatorContext ruleConditionalOrOperator(int i) {
			return getRuleContext(RuleConditionalOrOperatorContext.class,i);
		}
		public List<RuleXorExpressionReferenceContext> ruleXorExpressionReference() {
			return getRuleContexts(RuleXorExpressionReferenceContext.class);
		}
		public RuleXorExpressionReferenceContext ruleXorExpressionReference(int i) {
			return getRuleContext(RuleXorExpressionReferenceContext.class,i);
		}
		public RuleOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleOrExpression(this);
		}
	}

	public final RuleOrExpressionContext ruleOrExpression() throws RecognitionException {
		RuleOrExpressionContext _localctx = new RuleOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_ruleOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1866);
			ruleXorExpression();
			setState(1877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_OR || _la==OP_BAR) {
				{
				{
				setState(1873);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_BAR:
					{
					setState(1867);
					ruleOrOperator();
					setState(1868);
					ruleXorExpression();
					}
					break;
				case K_OR:
					{
					setState(1870);
					ruleConditionalOrOperator();
					setState(1871);
					ruleXorExpressionReference();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1879);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleOrOperatorContext extends ParserRuleContext {
		public TerminalNode OP_BAR() { return getToken(KerMLv2Parser.OP_BAR, 0); }
		public RuleOrOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOrOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleOrOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleOrOperator(this);
		}
	}

	public final RuleOrOperatorContext ruleOrOperator() throws RecognitionException {
		RuleOrOperatorContext _localctx = new RuleOrOperatorContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_ruleOrOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1880);
			match(OP_BAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleConditionalOrOperatorContext extends ParserRuleContext {
		public TerminalNode K_OR() { return getToken(KerMLv2Parser.K_OR, 0); }
		public RuleConditionalOrOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleConditionalOrOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleConditionalOrOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleConditionalOrOperator(this);
		}
	}

	public final RuleConditionalOrOperatorContext ruleConditionalOrOperator() throws RecognitionException {
		RuleConditionalOrOperatorContext _localctx = new RuleConditionalOrOperatorContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_ruleConditionalOrOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1882);
			match(K_OR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleXorExpressionReferenceContext extends ParserRuleContext {
		public RuleXorExpressionMemberContext ruleXorExpressionMember() {
			return getRuleContext(RuleXorExpressionMemberContext.class,0);
		}
		public RuleXorExpressionReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXorExpressionReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleXorExpressionReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleXorExpressionReference(this);
		}
	}

	public final RuleXorExpressionReferenceContext ruleXorExpressionReference() throws RecognitionException {
		RuleXorExpressionReferenceContext _localctx = new RuleXorExpressionReferenceContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_ruleXorExpressionReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1884);
			ruleXorExpressionMember();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleXorExpressionMemberContext extends ParserRuleContext {
		public RuleXorExpressionContext ruleXorExpression() {
			return getRuleContext(RuleXorExpressionContext.class,0);
		}
		public RuleXorExpressionMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXorExpressionMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleXorExpressionMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleXorExpressionMember(this);
		}
	}

	public final RuleXorExpressionMemberContext ruleXorExpressionMember() throws RecognitionException {
		RuleXorExpressionMemberContext _localctx = new RuleXorExpressionMemberContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_ruleXorExpressionMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1886);
			ruleXorExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleXorExpressionContext extends ParserRuleContext {
		public List<RuleAndExpressionContext> ruleAndExpression() {
			return getRuleContexts(RuleAndExpressionContext.class);
		}
		public RuleAndExpressionContext ruleAndExpression(int i) {
			return getRuleContext(RuleAndExpressionContext.class,i);
		}
		public List<RuleXorOperatorContext> ruleXorOperator() {
			return getRuleContexts(RuleXorOperatorContext.class);
		}
		public RuleXorOperatorContext ruleXorOperator(int i) {
			return getRuleContext(RuleXorOperatorContext.class,i);
		}
		public RuleXorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleXorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleXorExpression(this);
		}
	}

	public final RuleXorExpressionContext ruleXorExpression() throws RecognitionException {
		RuleXorExpressionContext _localctx = new RuleXorExpressionContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_ruleXorExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1888);
			ruleAndExpression();
			setState(1894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_XOR) {
				{
				{
				setState(1889);
				ruleXorOperator();
				setState(1890);
				ruleAndExpression();
				}
				}
				setState(1896);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleXorOperatorContext extends ParserRuleContext {
		public TerminalNode K_XOR() { return getToken(KerMLv2Parser.K_XOR, 0); }
		public RuleXorOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleXorOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleXorOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleXorOperator(this);
		}
	}

	public final RuleXorOperatorContext ruleXorOperator() throws RecognitionException {
		RuleXorOperatorContext _localctx = new RuleXorOperatorContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_ruleXorOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1897);
			match(K_XOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleAndExpressionContext extends ParserRuleContext {
		public List<RuleEqualityExpressionContext> ruleEqualityExpression() {
			return getRuleContexts(RuleEqualityExpressionContext.class);
		}
		public RuleEqualityExpressionContext ruleEqualityExpression(int i) {
			return getRuleContext(RuleEqualityExpressionContext.class,i);
		}
		public List<RuleAndOperatorContext> ruleAndOperator() {
			return getRuleContexts(RuleAndOperatorContext.class);
		}
		public RuleAndOperatorContext ruleAndOperator(int i) {
			return getRuleContext(RuleAndOperatorContext.class,i);
		}
		public List<RuleConditionalAndOperatorContext> ruleConditionalAndOperator() {
			return getRuleContexts(RuleConditionalAndOperatorContext.class);
		}
		public RuleConditionalAndOperatorContext ruleConditionalAndOperator(int i) {
			return getRuleContext(RuleConditionalAndOperatorContext.class,i);
		}
		public List<RuleEqualityExpressionReferenceContext> ruleEqualityExpressionReference() {
			return getRuleContexts(RuleEqualityExpressionReferenceContext.class);
		}
		public RuleEqualityExpressionReferenceContext ruleEqualityExpressionReference(int i) {
			return getRuleContext(RuleEqualityExpressionReferenceContext.class,i);
		}
		public RuleAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleAndExpression(this);
		}
	}

	public final RuleAndExpressionContext ruleAndExpression() throws RecognitionException {
		RuleAndExpressionContext _localctx = new RuleAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_ruleAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1899);
			ruleEqualityExpression();
			setState(1910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_AND || _la==OP_AND) {
				{
				{
				setState(1906);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_AND:
					{
					setState(1900);
					ruleAndOperator();
					setState(1901);
					ruleEqualityExpression();
					}
					break;
				case K_AND:
					{
					setState(1903);
					ruleConditionalAndOperator();
					setState(1904);
					ruleEqualityExpressionReference();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1912);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleAndOperatorContext extends ParserRuleContext {
		public TerminalNode OP_AND() { return getToken(KerMLv2Parser.OP_AND, 0); }
		public RuleAndOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleAndOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleAndOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleAndOperator(this);
		}
	}

	public final RuleAndOperatorContext ruleAndOperator() throws RecognitionException {
		RuleAndOperatorContext _localctx = new RuleAndOperatorContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_ruleAndOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1913);
			match(OP_AND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleConditionalAndOperatorContext extends ParserRuleContext {
		public TerminalNode K_AND() { return getToken(KerMLv2Parser.K_AND, 0); }
		public RuleConditionalAndOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleConditionalAndOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleConditionalAndOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleConditionalAndOperator(this);
		}
	}

	public final RuleConditionalAndOperatorContext ruleConditionalAndOperator() throws RecognitionException {
		RuleConditionalAndOperatorContext _localctx = new RuleConditionalAndOperatorContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_ruleConditionalAndOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1915);
			match(K_AND);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleEqualityExpressionReferenceContext extends ParserRuleContext {
		public RuleEqualityExpressionMemberContext ruleEqualityExpressionMember() {
			return getRuleContext(RuleEqualityExpressionMemberContext.class,0);
		}
		public RuleEqualityExpressionReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleEqualityExpressionReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleEqualityExpressionReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleEqualityExpressionReference(this);
		}
	}

	public final RuleEqualityExpressionReferenceContext ruleEqualityExpressionReference() throws RecognitionException {
		RuleEqualityExpressionReferenceContext _localctx = new RuleEqualityExpressionReferenceContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_ruleEqualityExpressionReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1917);
			ruleEqualityExpressionMember();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleEqualityExpressionMemberContext extends ParserRuleContext {
		public RuleEqualityExpressionContext ruleEqualityExpression() {
			return getRuleContext(RuleEqualityExpressionContext.class,0);
		}
		public RuleEqualityExpressionMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleEqualityExpressionMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleEqualityExpressionMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleEqualityExpressionMember(this);
		}
	}

	public final RuleEqualityExpressionMemberContext ruleEqualityExpressionMember() throws RecognitionException {
		RuleEqualityExpressionMemberContext _localctx = new RuleEqualityExpressionMemberContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_ruleEqualityExpressionMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1919);
			ruleEqualityExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleEqualityExpressionContext extends ParserRuleContext {
		public List<RuleClassificationExpressionContext> ruleClassificationExpression() {
			return getRuleContexts(RuleClassificationExpressionContext.class);
		}
		public RuleClassificationExpressionContext ruleClassificationExpression(int i) {
			return getRuleContext(RuleClassificationExpressionContext.class,i);
		}
		public List<RuleEqualityOperatorContext> ruleEqualityOperator() {
			return getRuleContexts(RuleEqualityOperatorContext.class);
		}
		public RuleEqualityOperatorContext ruleEqualityOperator(int i) {
			return getRuleContext(RuleEqualityOperatorContext.class,i);
		}
		public RuleEqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleEqualityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleEqualityExpression(this);
		}
	}

	public final RuleEqualityExpressionContext ruleEqualityExpression() throws RecognitionException {
		RuleEqualityExpressionContext _localctx = new RuleEqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_ruleEqualityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1921);
			ruleClassificationExpression();
			setState(1927);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & 15L) != 0)) {
				{
				{
				setState(1922);
				ruleEqualityOperator();
				setState(1923);
				ruleClassificationExpression();
				}
				}
				setState(1929);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleEqualityOperatorContext extends ParserRuleContext {
		public RuleEqualityOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleEqualityOperator; }
	 
		public RuleEqualityOperatorContext() { }
		public void copyFrom(RuleEqualityOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleEqualityOperator2Context extends RuleEqualityOperatorContext {
		public TerminalNode OP_BANG_EQ() { return getToken(KerMLv2Parser.OP_BANG_EQ, 0); }
		public RuleEqualityOperator2Context(RuleEqualityOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleEqualityOperator2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleEqualityOperator2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleEqualityOperator3Context extends RuleEqualityOperatorContext {
		public TerminalNode OP_EQ_EQ_EQ() { return getToken(KerMLv2Parser.OP_EQ_EQ_EQ, 0); }
		public RuleEqualityOperator3Context(RuleEqualityOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleEqualityOperator3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleEqualityOperator3(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleEqualityOperator4Context extends RuleEqualityOperatorContext {
		public TerminalNode OP_BANG_EQ_EQ() { return getToken(KerMLv2Parser.OP_BANG_EQ_EQ, 0); }
		public RuleEqualityOperator4Context(RuleEqualityOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleEqualityOperator4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleEqualityOperator4(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleEqualityOperator1Context extends RuleEqualityOperatorContext {
		public TerminalNode OP_EQ_EQ() { return getToken(KerMLv2Parser.OP_EQ_EQ, 0); }
		public RuleEqualityOperator1Context(RuleEqualityOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleEqualityOperator1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleEqualityOperator1(this);
		}
	}

	public final RuleEqualityOperatorContext ruleEqualityOperator() throws RecognitionException {
		RuleEqualityOperatorContext _localctx = new RuleEqualityOperatorContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_ruleEqualityOperator);
		try {
			setState(1934);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_EQ_EQ:
				_localctx = new RuleEqualityOperator1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1930);
				match(OP_EQ_EQ);
				}
				break;
			case OP_BANG_EQ:
				_localctx = new RuleEqualityOperator2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1931);
				match(OP_BANG_EQ);
				}
				break;
			case OP_EQ_EQ_EQ:
				_localctx = new RuleEqualityOperator3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1932);
				match(OP_EQ_EQ_EQ);
				}
				break;
			case OP_BANG_EQ_EQ:
				_localctx = new RuleEqualityOperator4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1933);
				match(OP_BANG_EQ_EQ);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleClassificationExpressionContext extends ParserRuleContext {
		public RuleClassificationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleClassificationExpression; }
	 
		public RuleClassificationExpressionContext() { }
		public void copyFrom(RuleClassificationExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleClassificationExpression1Context extends RuleClassificationExpressionContext {
		public RuleRelationalExpressionContext ruleRelationalExpression() {
			return getRuleContext(RuleRelationalExpressionContext.class,0);
		}
		public RuleClassificationTestOperatorContext ruleClassificationTestOperator() {
			return getRuleContext(RuleClassificationTestOperatorContext.class,0);
		}
		public RuleTypeReferenceMemberContext ruleTypeReferenceMember() {
			return getRuleContext(RuleTypeReferenceMemberContext.class,0);
		}
		public RuleCastOperatorContext ruleCastOperator() {
			return getRuleContext(RuleCastOperatorContext.class,0);
		}
		public RuleTypeResultMemberContext ruleTypeResultMember() {
			return getRuleContext(RuleTypeResultMemberContext.class,0);
		}
		public RuleClassificationExpression1Context(RuleClassificationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleClassificationExpression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleClassificationExpression1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleClassificationExpression4Context extends RuleClassificationExpressionContext {
		public RuleSelfReferenceExpressionContext ruleSelfReferenceExpression() {
			return getRuleContext(RuleSelfReferenceExpressionContext.class,0);
		}
		public RuleCastOperatorContext ruleCastOperator() {
			return getRuleContext(RuleCastOperatorContext.class,0);
		}
		public RuleTypeResultMemberContext ruleTypeResultMember() {
			return getRuleContext(RuleTypeResultMemberContext.class,0);
		}
		public RuleClassificationExpression4Context(RuleClassificationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleClassificationExpression4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleClassificationExpression4(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleClassificationExpression5Context extends RuleClassificationExpressionContext {
		public RuleMetadataReferenceContext ruleMetadataReference() {
			return getRuleContext(RuleMetadataReferenceContext.class,0);
		}
		public RuleMetaCastOperatorContext ruleMetaCastOperator() {
			return getRuleContext(RuleMetaCastOperatorContext.class,0);
		}
		public RuleTypeResultMemberContext ruleTypeResultMember() {
			return getRuleContext(RuleTypeResultMemberContext.class,0);
		}
		public RuleClassificationExpression5Context(RuleClassificationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleClassificationExpression5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleClassificationExpression5(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleClassificationExpression2Context extends RuleClassificationExpressionContext {
		public RuleSelfReferenceExpressionContext ruleSelfReferenceExpression() {
			return getRuleContext(RuleSelfReferenceExpressionContext.class,0);
		}
		public RuleClassificationTestOperatorContext ruleClassificationTestOperator() {
			return getRuleContext(RuleClassificationTestOperatorContext.class,0);
		}
		public RuleTypeReferenceMemberContext ruleTypeReferenceMember() {
			return getRuleContext(RuleTypeReferenceMemberContext.class,0);
		}
		public RuleClassificationExpression2Context(RuleClassificationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleClassificationExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleClassificationExpression2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleClassificationExpression3Context extends RuleClassificationExpressionContext {
		public RuleMetadataReferenceContext ruleMetadataReference() {
			return getRuleContext(RuleMetadataReferenceContext.class,0);
		}
		public RuleMetaClassificationTestOperatorContext ruleMetaClassificationTestOperator() {
			return getRuleContext(RuleMetaClassificationTestOperatorContext.class,0);
		}
		public RuleTypeReferenceMemberContext ruleTypeReferenceMember() {
			return getRuleContext(RuleTypeReferenceMemberContext.class,0);
		}
		public RuleClassificationExpression3Context(RuleClassificationExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleClassificationExpression3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleClassificationExpression3(this);
		}
	}

	public final RuleClassificationExpressionContext ruleClassificationExpression() throws RecognitionException {
		RuleClassificationExpressionContext _localctx = new RuleClassificationExpressionContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_ruleClassificationExpression);
		try {
			setState(1961);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				_localctx = new RuleClassificationExpression1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1936);
				ruleRelationalExpression();
				setState(1943);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_HASTYPE:
				case K_ISTYPE:
				case OP_AT:
					{
					setState(1937);
					ruleClassificationTestOperator();
					setState(1938);
					ruleTypeReferenceMember();
					}
					break;
				case K_AS:
					{
					setState(1940);
					ruleCastOperator();
					setState(1941);
					ruleTypeResultMember();
					}
					break;
				case K_FROM:
				case K_OF:
				case K_ELSE:
				case K_IMPLIES:
				case K_OR:
				case K_XOR:
				case K_AND:
				case LBRACE:
				case RBRACE:
				case RSQUARE:
				case RPAREN:
				case OP_SEMI:
				case OP_COMMA:
				case OP_QMARK:
				case OP_QMARK_QMARK:
				case OP_BAR:
				case OP_AND:
				case OP_EQ_EQ:
				case OP_BANG_EQ:
				case OP_EQ_EQ_EQ:
				case OP_BANG_EQ_EQ:
					break;
				default:
					break;
				}
				}
				break;
			case 2:
				_localctx = new RuleClassificationExpression2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1945);
				ruleSelfReferenceExpression();
				setState(1946);
				ruleClassificationTestOperator();
				setState(1947);
				ruleTypeReferenceMember();
				}
				break;
			case 3:
				_localctx = new RuleClassificationExpression3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1949);
				ruleMetadataReference();
				setState(1950);
				ruleMetaClassificationTestOperator();
				setState(1951);
				ruleTypeReferenceMember();
				}
				break;
			case 4:
				_localctx = new RuleClassificationExpression4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1953);
				ruleSelfReferenceExpression();
				setState(1954);
				ruleCastOperator();
				setState(1955);
				ruleTypeResultMember();
				}
				break;
			case 5:
				_localctx = new RuleClassificationExpression5Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1957);
				ruleMetadataReference();
				setState(1958);
				ruleMetaCastOperator();
				setState(1959);
				ruleTypeResultMember();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleClassificationTestOperatorContext extends ParserRuleContext {
		public RuleClassificationTestOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleClassificationTestOperator; }
	 
		public RuleClassificationTestOperatorContext() { }
		public void copyFrom(RuleClassificationTestOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleClassificationTestOperator2Context extends RuleClassificationTestOperatorContext {
		public TerminalNode K_ISTYPE() { return getToken(KerMLv2Parser.K_ISTYPE, 0); }
		public RuleClassificationTestOperator2Context(RuleClassificationTestOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleClassificationTestOperator2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleClassificationTestOperator2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleClassificationTestOperator3Context extends RuleClassificationTestOperatorContext {
		public TerminalNode OP_AT() { return getToken(KerMLv2Parser.OP_AT, 0); }
		public RuleClassificationTestOperator3Context(RuleClassificationTestOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleClassificationTestOperator3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleClassificationTestOperator3(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleClassificationTestOperator1Context extends RuleClassificationTestOperatorContext {
		public TerminalNode K_HASTYPE() { return getToken(KerMLv2Parser.K_HASTYPE, 0); }
		public RuleClassificationTestOperator1Context(RuleClassificationTestOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleClassificationTestOperator1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleClassificationTestOperator1(this);
		}
	}

	public final RuleClassificationTestOperatorContext ruleClassificationTestOperator() throws RecognitionException {
		RuleClassificationTestOperatorContext _localctx = new RuleClassificationTestOperatorContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_ruleClassificationTestOperator);
		try {
			setState(1966);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_HASTYPE:
				_localctx = new RuleClassificationTestOperator1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1963);
				match(K_HASTYPE);
				}
				break;
			case K_ISTYPE:
				_localctx = new RuleClassificationTestOperator2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1964);
				match(K_ISTYPE);
				}
				break;
			case OP_AT:
				_localctx = new RuleClassificationTestOperator3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1965);
				match(OP_AT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleMetaClassificationTestOperatorContext extends ParserRuleContext {
		public TerminalNode OP_AT_AT() { return getToken(KerMLv2Parser.OP_AT_AT, 0); }
		public RuleMetaClassificationTestOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleMetaClassificationTestOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleMetaClassificationTestOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleMetaClassificationTestOperator(this);
		}
	}

	public final RuleMetaClassificationTestOperatorContext ruleMetaClassificationTestOperator() throws RecognitionException {
		RuleMetaClassificationTestOperatorContext _localctx = new RuleMetaClassificationTestOperatorContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_ruleMetaClassificationTestOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1968);
			match(OP_AT_AT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleCastOperatorContext extends ParserRuleContext {
		public TerminalNode K_AS() { return getToken(KerMLv2Parser.K_AS, 0); }
		public RuleCastOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleCastOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleCastOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleCastOperator(this);
		}
	}

	public final RuleCastOperatorContext ruleCastOperator() throws RecognitionException {
		RuleCastOperatorContext _localctx = new RuleCastOperatorContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_ruleCastOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1970);
			match(K_AS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleMetaCastOperatorContext extends ParserRuleContext {
		public TerminalNode K_META() { return getToken(KerMLv2Parser.K_META, 0); }
		public RuleMetaCastOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleMetaCastOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleMetaCastOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleMetaCastOperator(this);
		}
	}

	public final RuleMetaCastOperatorContext ruleMetaCastOperator() throws RecognitionException {
		RuleMetaCastOperatorContext _localctx = new RuleMetaCastOperatorContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_ruleMetaCastOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1972);
			match(K_META);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleMetadataReferenceContext extends ParserRuleContext {
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleMetadataReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleMetadataReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleMetadataReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleMetadataReference(this);
		}
	}

	public final RuleMetadataReferenceContext ruleMetadataReference() throws RecognitionException {
		RuleMetadataReferenceContext _localctx = new RuleMetadataReferenceContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_ruleMetadataReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1974);
			ruleQualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleTypeReferenceMemberContext extends ParserRuleContext {
		public RuleTypeReferenceContext ruleTypeReference() {
			return getRuleContext(RuleTypeReferenceContext.class,0);
		}
		public RuleTypeReferenceMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleTypeReferenceMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleTypeReferenceMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleTypeReferenceMember(this);
		}
	}

	public final RuleTypeReferenceMemberContext ruleTypeReferenceMember() throws RecognitionException {
		RuleTypeReferenceMemberContext _localctx = new RuleTypeReferenceMemberContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_ruleTypeReferenceMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1976);
			ruleTypeReference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleTypeResultMemberContext extends ParserRuleContext {
		public RuleTypeReferenceContext ruleTypeReference() {
			return getRuleContext(RuleTypeReferenceContext.class,0);
		}
		public RuleTypeResultMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleTypeResultMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleTypeResultMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleTypeResultMember(this);
		}
	}

	public final RuleTypeResultMemberContext ruleTypeResultMember() throws RecognitionException {
		RuleTypeResultMemberContext _localctx = new RuleTypeResultMemberContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_ruleTypeResultMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1978);
			ruleTypeReference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleTypeReferenceContext extends ParserRuleContext {
		public RuleReferenceTypingContext ruleReferenceTyping() {
			return getRuleContext(RuleReferenceTypingContext.class,0);
		}
		public RuleTypeReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleTypeReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleTypeReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleTypeReference(this);
		}
	}

	public final RuleTypeReferenceContext ruleTypeReference() throws RecognitionException {
		RuleTypeReferenceContext _localctx = new RuleTypeReferenceContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_ruleTypeReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1980);
			ruleReferenceTyping();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleReferenceTypingContext extends ParserRuleContext {
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleReferenceTypingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleReferenceTyping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleReferenceTyping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleReferenceTyping(this);
		}
	}

	public final RuleReferenceTypingContext ruleReferenceTyping() throws RecognitionException {
		RuleReferenceTypingContext _localctx = new RuleReferenceTypingContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_ruleReferenceTyping);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1982);
			ruleQualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleSelfReferenceExpressionContext extends ParserRuleContext {
		public RuleSelfReferenceMemberContext ruleSelfReferenceMember() {
			return getRuleContext(RuleSelfReferenceMemberContext.class,0);
		}
		public RuleSelfReferenceExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSelfReferenceExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleSelfReferenceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleSelfReferenceExpression(this);
		}
	}

	public final RuleSelfReferenceExpressionContext ruleSelfReferenceExpression() throws RecognitionException {
		RuleSelfReferenceExpressionContext _localctx = new RuleSelfReferenceExpressionContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_ruleSelfReferenceExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1984);
			ruleSelfReferenceMember();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleSelfReferenceMemberContext extends ParserRuleContext {
		public RuleEmptyFeatureContext ruleEmptyFeature() {
			return getRuleContext(RuleEmptyFeatureContext.class,0);
		}
		public RuleSelfReferenceMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSelfReferenceMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleSelfReferenceMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleSelfReferenceMember(this);
		}
	}

	public final RuleSelfReferenceMemberContext ruleSelfReferenceMember() throws RecognitionException {
		RuleSelfReferenceMemberContext _localctx = new RuleSelfReferenceMemberContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_ruleSelfReferenceMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1986);
			ruleEmptyFeature();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleEmptyFeatureContext extends ParserRuleContext {
		public RuleEmptyFeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleEmptyFeature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleEmptyFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleEmptyFeature(this);
		}
	}

	public final RuleEmptyFeatureContext ruleEmptyFeature() throws RecognitionException {
		RuleEmptyFeatureContext _localctx = new RuleEmptyFeatureContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_ruleEmptyFeature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleRelationalExpressionContext extends ParserRuleContext {
		public List<RuleRangeExpressionContext> ruleRangeExpression() {
			return getRuleContexts(RuleRangeExpressionContext.class);
		}
		public RuleRangeExpressionContext ruleRangeExpression(int i) {
			return getRuleContext(RuleRangeExpressionContext.class,i);
		}
		public List<RuleRelationalOperatorContext> ruleRelationalOperator() {
			return getRuleContexts(RuleRelationalOperatorContext.class);
		}
		public RuleRelationalOperatorContext ruleRelationalOperator(int i) {
			return getRuleContext(RuleRelationalOperatorContext.class,i);
		}
		public RuleRelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleRelationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleRelationalExpression(this);
		}
	}

	public final RuleRelationalExpressionContext ruleRelationalExpression() throws RecognitionException {
		RuleRelationalExpressionContext _localctx = new RuleRelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_ruleRelationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1990);
			ruleRangeExpression();
			setState(1996);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 25769803779L) != 0)) {
				{
				{
				setState(1991);
				ruleRelationalOperator();
				setState(1992);
				ruleRangeExpression();
				}
				}
				setState(1998);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleRelationalOperatorContext extends ParserRuleContext {
		public RuleRelationalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleRelationalOperator; }
	 
		public RuleRelationalOperatorContext() { }
		public void copyFrom(RuleRelationalOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleRelationalOperator4Context extends RuleRelationalOperatorContext {
		public TerminalNode OP_RANGLE_EQ() { return getToken(KerMLv2Parser.OP_RANGLE_EQ, 0); }
		public RuleRelationalOperator4Context(RuleRelationalOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleRelationalOperator4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleRelationalOperator4(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleRelationalOperator3Context extends RuleRelationalOperatorContext {
		public TerminalNode OP_LANGLE_EQ() { return getToken(KerMLv2Parser.OP_LANGLE_EQ, 0); }
		public RuleRelationalOperator3Context(RuleRelationalOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleRelationalOperator3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleRelationalOperator3(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleRelationalOperator2Context extends RuleRelationalOperatorContext {
		public TerminalNode RANGLE() { return getToken(KerMLv2Parser.RANGLE, 0); }
		public RuleRelationalOperator2Context(RuleRelationalOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleRelationalOperator2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleRelationalOperator2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleRelationalOperator1Context extends RuleRelationalOperatorContext {
		public TerminalNode LANGLE() { return getToken(KerMLv2Parser.LANGLE, 0); }
		public RuleRelationalOperator1Context(RuleRelationalOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleRelationalOperator1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleRelationalOperator1(this);
		}
	}

	public final RuleRelationalOperatorContext ruleRelationalOperator() throws RecognitionException {
		RuleRelationalOperatorContext _localctx = new RuleRelationalOperatorContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_ruleRelationalOperator);
		try {
			setState(2003);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LANGLE:
				_localctx = new RuleRelationalOperator1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1999);
				match(LANGLE);
				}
				break;
			case RANGLE:
				_localctx = new RuleRelationalOperator2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2000);
				match(RANGLE);
				}
				break;
			case OP_LANGLE_EQ:
				_localctx = new RuleRelationalOperator3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2001);
				match(OP_LANGLE_EQ);
				}
				break;
			case OP_RANGLE_EQ:
				_localctx = new RuleRelationalOperator4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2002);
				match(OP_RANGLE_EQ);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleRangeExpressionContext extends ParserRuleContext {
		public List<RuleAdditiveExpressionContext> ruleAdditiveExpression() {
			return getRuleContexts(RuleAdditiveExpressionContext.class);
		}
		public RuleAdditiveExpressionContext ruleAdditiveExpression(int i) {
			return getRuleContext(RuleAdditiveExpressionContext.class,i);
		}
		public TerminalNode OP_DOT_DOT() { return getToken(KerMLv2Parser.OP_DOT_DOT, 0); }
		public RuleRangeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleRangeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleRangeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleRangeExpression(this);
		}
	}

	public final RuleRangeExpressionContext ruleRangeExpression() throws RecognitionException {
		RuleRangeExpressionContext _localctx = new RuleRangeExpressionContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_ruleRangeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2005);
			ruleAdditiveExpression();
			setState(2008);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_DOT_DOT) {
				{
				setState(2006);
				match(OP_DOT_DOT);
				setState(2007);
				ruleAdditiveExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleAdditiveExpressionContext extends ParserRuleContext {
		public List<RuleMultiplicativeExpressionContext> ruleMultiplicativeExpression() {
			return getRuleContexts(RuleMultiplicativeExpressionContext.class);
		}
		public RuleMultiplicativeExpressionContext ruleMultiplicativeExpression(int i) {
			return getRuleContext(RuleMultiplicativeExpressionContext.class,i);
		}
		public List<RuleAdditiveOperatorContext> ruleAdditiveOperator() {
			return getRuleContexts(RuleAdditiveOperatorContext.class);
		}
		public RuleAdditiveOperatorContext ruleAdditiveOperator(int i) {
			return getRuleContext(RuleAdditiveOperatorContext.class,i);
		}
		public RuleAdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleAdditiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleAdditiveExpression(this);
		}
	}

	public final RuleAdditiveExpressionContext ruleAdditiveExpression() throws RecognitionException {
		RuleAdditiveExpressionContext _localctx = new RuleAdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_ruleAdditiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2010);
			ruleMultiplicativeExpression();
			setState(2016);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_PLUS || _la==OP_MINUS) {
				{
				{
				setState(2011);
				ruleAdditiveOperator();
				setState(2012);
				ruleMultiplicativeExpression();
				}
				}
				setState(2018);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleAdditiveOperatorContext extends ParserRuleContext {
		public RuleAdditiveOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleAdditiveOperator; }
	 
		public RuleAdditiveOperatorContext() { }
		public void copyFrom(RuleAdditiveOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleAdditiveOperator1Context extends RuleAdditiveOperatorContext {
		public TerminalNode OP_PLUS() { return getToken(KerMLv2Parser.OP_PLUS, 0); }
		public RuleAdditiveOperator1Context(RuleAdditiveOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleAdditiveOperator1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleAdditiveOperator1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleAdditiveOperator2Context extends RuleAdditiveOperatorContext {
		public TerminalNode OP_MINUS() { return getToken(KerMLv2Parser.OP_MINUS, 0); }
		public RuleAdditiveOperator2Context(RuleAdditiveOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleAdditiveOperator2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleAdditiveOperator2(this);
		}
	}

	public final RuleAdditiveOperatorContext ruleAdditiveOperator() throws RecognitionException {
		RuleAdditiveOperatorContext _localctx = new RuleAdditiveOperatorContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_ruleAdditiveOperator);
		try {
			setState(2021);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_PLUS:
				_localctx = new RuleAdditiveOperator1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2019);
				match(OP_PLUS);
				}
				break;
			case OP_MINUS:
				_localctx = new RuleAdditiveOperator2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2020);
				match(OP_MINUS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleMultiplicativeExpressionContext extends ParserRuleContext {
		public List<RuleExponentiationExpressionContext> ruleExponentiationExpression() {
			return getRuleContexts(RuleExponentiationExpressionContext.class);
		}
		public RuleExponentiationExpressionContext ruleExponentiationExpression(int i) {
			return getRuleContext(RuleExponentiationExpressionContext.class,i);
		}
		public List<RuleMultiplicativeOperatorContext> ruleMultiplicativeOperator() {
			return getRuleContexts(RuleMultiplicativeOperatorContext.class);
		}
		public RuleMultiplicativeOperatorContext ruleMultiplicativeOperator(int i) {
			return getRuleContext(RuleMultiplicativeOperatorContext.class,i);
		}
		public RuleMultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleMultiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleMultiplicativeExpression(this);
		}
	}

	public final RuleMultiplicativeExpressionContext ruleMultiplicativeExpression() throws RecognitionException {
		RuleMultiplicativeExpressionContext _localctx = new RuleMultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_ruleMultiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2023);
			ruleExponentiationExpression();
			setState(2029);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & 100663297L) != 0)) {
				{
				{
				setState(2024);
				ruleMultiplicativeOperator();
				setState(2025);
				ruleExponentiationExpression();
				}
				}
				setState(2031);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleMultiplicativeOperatorContext extends ParserRuleContext {
		public RuleMultiplicativeOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleMultiplicativeOperator; }
	 
		public RuleMultiplicativeOperatorContext() { }
		public void copyFrom(RuleMultiplicativeOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleMultiplicativeOperator1Context extends RuleMultiplicativeOperatorContext {
		public TerminalNode OP_STAR() { return getToken(KerMLv2Parser.OP_STAR, 0); }
		public RuleMultiplicativeOperator1Context(RuleMultiplicativeOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleMultiplicativeOperator1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleMultiplicativeOperator1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleMultiplicativeOperator3Context extends RuleMultiplicativeOperatorContext {
		public TerminalNode OP_PERCENT() { return getToken(KerMLv2Parser.OP_PERCENT, 0); }
		public RuleMultiplicativeOperator3Context(RuleMultiplicativeOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleMultiplicativeOperator3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleMultiplicativeOperator3(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleMultiplicativeOperator2Context extends RuleMultiplicativeOperatorContext {
		public TerminalNode OP_SLASH() { return getToken(KerMLv2Parser.OP_SLASH, 0); }
		public RuleMultiplicativeOperator2Context(RuleMultiplicativeOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleMultiplicativeOperator2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleMultiplicativeOperator2(this);
		}
	}

	public final RuleMultiplicativeOperatorContext ruleMultiplicativeOperator() throws RecognitionException {
		RuleMultiplicativeOperatorContext _localctx = new RuleMultiplicativeOperatorContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_ruleMultiplicativeOperator);
		try {
			setState(2035);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_STAR:
				_localctx = new RuleMultiplicativeOperator1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2032);
				match(OP_STAR);
				}
				break;
			case OP_SLASH:
				_localctx = new RuleMultiplicativeOperator2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2033);
				match(OP_SLASH);
				}
				break;
			case OP_PERCENT:
				_localctx = new RuleMultiplicativeOperator3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2034);
				match(OP_PERCENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleExponentiationExpressionContext extends ParserRuleContext {
		public RuleUnaryExpressionContext ruleUnaryExpression() {
			return getRuleContext(RuleUnaryExpressionContext.class,0);
		}
		public RuleExponentiationOperatorContext ruleExponentiationOperator() {
			return getRuleContext(RuleExponentiationOperatorContext.class,0);
		}
		public RuleExponentiationExpressionContext ruleExponentiationExpression() {
			return getRuleContext(RuleExponentiationExpressionContext.class,0);
		}
		public RuleExponentiationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleExponentiationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleExponentiationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleExponentiationExpression(this);
		}
	}

	public final RuleExponentiationExpressionContext ruleExponentiationExpression() throws RecognitionException {
		RuleExponentiationExpressionContext _localctx = new RuleExponentiationExpressionContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_ruleExponentiationExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2037);
			ruleUnaryExpression();
			setState(2041);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OP_STAR_STAR || _la==OP_HAT) {
				{
				setState(2038);
				ruleExponentiationOperator();
				setState(2039);
				ruleExponentiationExpression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleExponentiationOperatorContext extends ParserRuleContext {
		public RuleExponentiationOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleExponentiationOperator; }
	 
		public RuleExponentiationOperatorContext() { }
		public void copyFrom(RuleExponentiationOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleExponentiationOperator1Context extends RuleExponentiationOperatorContext {
		public TerminalNode OP_STAR_STAR() { return getToken(KerMLv2Parser.OP_STAR_STAR, 0); }
		public RuleExponentiationOperator1Context(RuleExponentiationOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleExponentiationOperator1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleExponentiationOperator1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleExponentiationOperator2Context extends RuleExponentiationOperatorContext {
		public TerminalNode OP_HAT() { return getToken(KerMLv2Parser.OP_HAT, 0); }
		public RuleExponentiationOperator2Context(RuleExponentiationOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleExponentiationOperator2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleExponentiationOperator2(this);
		}
	}

	public final RuleExponentiationOperatorContext ruleExponentiationOperator() throws RecognitionException {
		RuleExponentiationOperatorContext _localctx = new RuleExponentiationOperatorContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_ruleExponentiationOperator);
		try {
			setState(2045);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_STAR_STAR:
				_localctx = new RuleExponentiationOperator1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2043);
				match(OP_STAR_STAR);
				}
				break;
			case OP_HAT:
				_localctx = new RuleExponentiationOperator2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2044);
				match(OP_HAT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleUnaryExpressionContext extends ParserRuleContext {
		public RuleUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleUnaryExpression; }
	 
		public RuleUnaryExpressionContext() { }
		public void copyFrom(RuleUnaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleUnaryExpression1Context extends RuleUnaryExpressionContext {
		public RuleUnaryOperatorContext ruleUnaryOperator() {
			return getRuleContext(RuleUnaryOperatorContext.class,0);
		}
		public RuleExtentExpressionContext ruleExtentExpression() {
			return getRuleContext(RuleExtentExpressionContext.class,0);
		}
		public RuleUnaryExpression1Context(RuleUnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleUnaryExpression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleUnaryExpression1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleUnaryExpression2Context extends RuleUnaryExpressionContext {
		public RuleExtentExpressionContext ruleExtentExpression() {
			return getRuleContext(RuleExtentExpressionContext.class,0);
		}
		public RuleUnaryExpression2Context(RuleUnaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleUnaryExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleUnaryExpression2(this);
		}
	}

	public final RuleUnaryExpressionContext ruleUnaryExpression() throws RecognitionException {
		RuleUnaryExpressionContext _localctx = new RuleUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_ruleUnaryExpression);
		try {
			setState(2051);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_NOT:
			case OP_TILDE:
			case OP_PLUS:
			case OP_MINUS:
				_localctx = new RuleUnaryExpression1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2047);
				ruleUnaryOperator();
				setState(2048);
				ruleExtentExpression();
				}
				break;
			case K_ALL:
			case K_TRUE:
			case K_FALSE:
			case K_NULL:
			case LBRACE:
			case LPAREN:
			case OP_STAR:
			case OP_DOT:
			case RULE_DECIMAL_VALUE:
			case RULE_EXP_VALUE:
			case RULE_ID:
			case RULE_UNRESTRICTED_NAME:
			case RULE_STRING_VALUE:
				_localctx = new RuleUnaryExpression2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2050);
				ruleExtentExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleUnaryOperatorContext extends ParserRuleContext {
		public RuleUnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleUnaryOperator; }
	 
		public RuleUnaryOperatorContext() { }
		public void copyFrom(RuleUnaryOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleUnaryOperator4Context extends RuleUnaryOperatorContext {
		public TerminalNode K_NOT() { return getToken(KerMLv2Parser.K_NOT, 0); }
		public RuleUnaryOperator4Context(RuleUnaryOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleUnaryOperator4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleUnaryOperator4(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleUnaryOperator3Context extends RuleUnaryOperatorContext {
		public TerminalNode OP_TILDE() { return getToken(KerMLv2Parser.OP_TILDE, 0); }
		public RuleUnaryOperator3Context(RuleUnaryOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleUnaryOperator3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleUnaryOperator3(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleUnaryOperator2Context extends RuleUnaryOperatorContext {
		public TerminalNode OP_MINUS() { return getToken(KerMLv2Parser.OP_MINUS, 0); }
		public RuleUnaryOperator2Context(RuleUnaryOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleUnaryOperator2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleUnaryOperator2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleUnaryOperator1Context extends RuleUnaryOperatorContext {
		public TerminalNode OP_PLUS() { return getToken(KerMLv2Parser.OP_PLUS, 0); }
		public RuleUnaryOperator1Context(RuleUnaryOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleUnaryOperator1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleUnaryOperator1(this);
		}
	}

	public final RuleUnaryOperatorContext ruleUnaryOperator() throws RecognitionException {
		RuleUnaryOperatorContext _localctx = new RuleUnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_ruleUnaryOperator);
		try {
			setState(2057);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_PLUS:
				_localctx = new RuleUnaryOperator1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2053);
				match(OP_PLUS);
				}
				break;
			case OP_MINUS:
				_localctx = new RuleUnaryOperator2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2054);
				match(OP_MINUS);
				}
				break;
			case OP_TILDE:
				_localctx = new RuleUnaryOperator3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2055);
				match(OP_TILDE);
				}
				break;
			case K_NOT:
				_localctx = new RuleUnaryOperator4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2056);
				match(K_NOT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleExtentExpressionContext extends ParserRuleContext {
		public RuleExtentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleExtentExpression; }
	 
		public RuleExtentExpressionContext() { }
		public void copyFrom(RuleExtentExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleExtentExpression2Context extends RuleExtentExpressionContext {
		public RulePrimaryExpressionContext rulePrimaryExpression() {
			return getRuleContext(RulePrimaryExpressionContext.class,0);
		}
		public RuleExtentExpression2Context(RuleExtentExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleExtentExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleExtentExpression2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleExtentExpression1Context extends RuleExtentExpressionContext {
		public TerminalNode K_ALL() { return getToken(KerMLv2Parser.K_ALL, 0); }
		public RuleTypeResultMemberContext ruleTypeResultMember() {
			return getRuleContext(RuleTypeResultMemberContext.class,0);
		}
		public RuleExtentExpression1Context(RuleExtentExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleExtentExpression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleExtentExpression1(this);
		}
	}

	public final RuleExtentExpressionContext ruleExtentExpression() throws RecognitionException {
		RuleExtentExpressionContext _localctx = new RuleExtentExpressionContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_ruleExtentExpression);
		try {
			setState(2062);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ALL:
				_localctx = new RuleExtentExpression1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2059);
				match(K_ALL);
				setState(2060);
				ruleTypeResultMember();
				}
				break;
			case K_TRUE:
			case K_FALSE:
			case K_NULL:
			case LBRACE:
			case LPAREN:
			case OP_STAR:
			case OP_DOT:
			case RULE_DECIMAL_VALUE:
			case RULE_EXP_VALUE:
			case RULE_ID:
			case RULE_UNRESTRICTED_NAME:
			case RULE_STRING_VALUE:
				_localctx = new RuleExtentExpression2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2061);
				rulePrimaryExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RulePrimaryExpressionContext extends ParserRuleContext {
		public RuleBaseExpressionContext ruleBaseExpression() {
			return getRuleContext(RuleBaseExpressionContext.class,0);
		}
		public List<TerminalNode> OP_DOT() { return getTokens(KerMLv2Parser.OP_DOT); }
		public TerminalNode OP_DOT(int i) {
			return getToken(KerMLv2Parser.OP_DOT, i);
		}
		public List<RuleFeatureChainMemberContext> ruleFeatureChainMember() {
			return getRuleContexts(RuleFeatureChainMemberContext.class);
		}
		public RuleFeatureChainMemberContext ruleFeatureChainMember(int i) {
			return getRuleContext(RuleFeatureChainMemberContext.class,i);
		}
		public List<TerminalNode> OP_HASH() { return getTokens(KerMLv2Parser.OP_HASH); }
		public TerminalNode OP_HASH(int i) {
			return getToken(KerMLv2Parser.OP_HASH, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(KerMLv2Parser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(KerMLv2Parser.LPAREN, i);
		}
		public List<RuleSequenceExpressionContext> ruleSequenceExpression() {
			return getRuleContexts(RuleSequenceExpressionContext.class);
		}
		public RuleSequenceExpressionContext ruleSequenceExpression(int i) {
			return getRuleContext(RuleSequenceExpressionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(KerMLv2Parser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(KerMLv2Parser.RPAREN, i);
		}
		public List<TerminalNode> LSQUARE() { return getTokens(KerMLv2Parser.LSQUARE); }
		public TerminalNode LSQUARE(int i) {
			return getToken(KerMLv2Parser.LSQUARE, i);
		}
		public List<TerminalNode> RSQUARE() { return getTokens(KerMLv2Parser.RSQUARE); }
		public TerminalNode RSQUARE(int i) {
			return getToken(KerMLv2Parser.RSQUARE, i);
		}
		public List<TerminalNode> OP_MINUS_RANGLE() { return getTokens(KerMLv2Parser.OP_MINUS_RANGLE); }
		public TerminalNode OP_MINUS_RANGLE(int i) {
			return getToken(KerMLv2Parser.OP_MINUS_RANGLE, i);
		}
		public List<RuleReferenceTypingContext> ruleReferenceTyping() {
			return getRuleContexts(RuleReferenceTypingContext.class);
		}
		public RuleReferenceTypingContext ruleReferenceTyping(int i) {
			return getRuleContext(RuleReferenceTypingContext.class,i);
		}
		public List<RuleBodyExpressionContext> ruleBodyExpression() {
			return getRuleContexts(RuleBodyExpressionContext.class);
		}
		public RuleBodyExpressionContext ruleBodyExpression(int i) {
			return getRuleContext(RuleBodyExpressionContext.class,i);
		}
		public List<TerminalNode> OP_DOT_QMARK() { return getTokens(KerMLv2Parser.OP_DOT_QMARK); }
		public TerminalNode OP_DOT_QMARK(int i) {
			return getToken(KerMLv2Parser.OP_DOT_QMARK, i);
		}
		public List<RuleFunctionReferenceExpressionContext> ruleFunctionReferenceExpression() {
			return getRuleContexts(RuleFunctionReferenceExpressionContext.class);
		}
		public RuleFunctionReferenceExpressionContext ruleFunctionReferenceExpression(int i) {
			return getRuleContext(RuleFunctionReferenceExpressionContext.class,i);
		}
		public List<RuleArgumentListContext> ruleArgumentList() {
			return getRuleContexts(RuleArgumentListContext.class);
		}
		public RuleArgumentListContext ruleArgumentList(int i) {
			return getRuleContext(RuleArgumentListContext.class,i);
		}
		public RulePrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulePrimaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRulePrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRulePrimaryExpression(this);
		}
	}

	public final RulePrimaryExpressionContext rulePrimaryExpression() throws RecognitionException {
		RulePrimaryExpressionContext _localctx = new RulePrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_rulePrimaryExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2064);
			ruleBaseExpression();
			setState(2067);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				{
				setState(2065);
				match(OP_DOT);
				setState(2066);
				ruleFeatureChainMember();
				}
				break;
			}
			setState(2097);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & 103079411713L) != 0)) {
				{
				{
				setState(2089);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OP_HASH:
					{
					setState(2069);
					match(OP_HASH);
					setState(2070);
					match(LPAREN);
					setState(2071);
					ruleSequenceExpression();
					setState(2072);
					match(RPAREN);
					}
					break;
				case LSQUARE:
					{
					setState(2074);
					match(LSQUARE);
					setState(2075);
					ruleSequenceExpression();
					setState(2076);
					match(RSQUARE);
					}
					break;
				case OP_MINUS_RANGLE:
					{
					setState(2078);
					match(OP_MINUS_RANGLE);
					setState(2079);
					ruleReferenceTyping();
					setState(2083);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LBRACE:
						{
						setState(2080);
						ruleBodyExpression();
						}
						break;
					case RULE_ID:
					case RULE_UNRESTRICTED_NAME:
						{
						setState(2081);
						ruleFunctionReferenceExpression();
						}
						break;
					case LPAREN:
						{
						setState(2082);
						ruleArgumentList();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case OP_DOT:
					{
					setState(2085);
					match(OP_DOT);
					setState(2086);
					ruleBodyExpression();
					}
					break;
				case OP_DOT_QMARK:
					{
					setState(2087);
					match(OP_DOT_QMARK);
					setState(2088);
					ruleBodyExpression();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2093);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
				case 1:
					{
					setState(2091);
					match(OP_DOT);
					setState(2092);
					ruleFeatureChainMember();
					}
					break;
				}
				}
				}
				setState(2099);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleFunctionReferenceExpressionContext extends ParserRuleContext {
		public RuleFunctionReferenceMemberContext ruleFunctionReferenceMember() {
			return getRuleContext(RuleFunctionReferenceMemberContext.class,0);
		}
		public RuleFunctionReferenceExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFunctionReferenceExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFunctionReferenceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFunctionReferenceExpression(this);
		}
	}

	public final RuleFunctionReferenceExpressionContext ruleFunctionReferenceExpression() throws RecognitionException {
		RuleFunctionReferenceExpressionContext _localctx = new RuleFunctionReferenceExpressionContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_ruleFunctionReferenceExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2100);
			ruleFunctionReferenceMember();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleFunctionReferenceMemberContext extends ParserRuleContext {
		public RuleFunctionReferenceContext ruleFunctionReference() {
			return getRuleContext(RuleFunctionReferenceContext.class,0);
		}
		public RuleFunctionReferenceMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFunctionReferenceMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFunctionReferenceMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFunctionReferenceMember(this);
		}
	}

	public final RuleFunctionReferenceMemberContext ruleFunctionReferenceMember() throws RecognitionException {
		RuleFunctionReferenceMemberContext _localctx = new RuleFunctionReferenceMemberContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_ruleFunctionReferenceMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2102);
			ruleFunctionReference();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleFunctionReferenceContext extends ParserRuleContext {
		public RuleReferenceTypingContext ruleReferenceTyping() {
			return getRuleContext(RuleReferenceTypingContext.class,0);
		}
		public RuleFunctionReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFunctionReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFunctionReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFunctionReference(this);
		}
	}

	public final RuleFunctionReferenceContext ruleFunctionReference() throws RecognitionException {
		RuleFunctionReferenceContext _localctx = new RuleFunctionReferenceContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_ruleFunctionReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2104);
			ruleReferenceTyping();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureChainMemberContext extends ParserRuleContext {
		public RuleFeatureChainMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFeatureChainMember; }
	 
		public RuleFeatureChainMemberContext() { }
		public void copyFrom(RuleFeatureChainMemberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureChainMember1Context extends RuleFeatureChainMemberContext {
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleFeatureChainMember1Context(RuleFeatureChainMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureChainMember1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureChainMember1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureChainMember2Context extends RuleFeatureChainMemberContext {
		public RuleOwnedFeatureChainContext ruleOwnedFeatureChain() {
			return getRuleContext(RuleOwnedFeatureChainContext.class,0);
		}
		public RuleFeatureChainMember2Context(RuleFeatureChainMemberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureChainMember2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureChainMember2(this);
		}
	}

	public final RuleFeatureChainMemberContext ruleFeatureChainMember() throws RecognitionException {
		RuleFeatureChainMemberContext _localctx = new RuleFeatureChainMemberContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_ruleFeatureChainMember);
		try {
			setState(2108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				_localctx = new RuleFeatureChainMember1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2106);
				ruleQualifiedName();
				}
				break;
			case 2:
				_localctx = new RuleFeatureChainMember2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2107);
				ruleOwnedFeatureChain();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleBaseExpressionContext extends ParserRuleContext {
		public RuleBaseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleBaseExpression; }
	 
		public RuleBaseExpressionContext() { }
		public void copyFrom(RuleBaseExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleBaseExpression4Context extends RuleBaseExpressionContext {
		public RuleMetadataAccessExpressionContext ruleMetadataAccessExpression() {
			return getRuleContext(RuleMetadataAccessExpressionContext.class,0);
		}
		public RuleBaseExpression4Context(RuleBaseExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleBaseExpression4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleBaseExpression4(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleBaseExpression3Context extends RuleBaseExpressionContext {
		public RuleFeatureReferenceExpressionContext ruleFeatureReferenceExpression() {
			return getRuleContext(RuleFeatureReferenceExpressionContext.class,0);
		}
		public RuleBaseExpression3Context(RuleBaseExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleBaseExpression3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleBaseExpression3(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleBaseExpression2Context extends RuleBaseExpressionContext {
		public RuleLiteralExpressionContext ruleLiteralExpression() {
			return getRuleContext(RuleLiteralExpressionContext.class,0);
		}
		public RuleBaseExpression2Context(RuleBaseExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleBaseExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleBaseExpression2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleBaseExpression1Context extends RuleBaseExpressionContext {
		public RuleNullExpressionContext ruleNullExpression() {
			return getRuleContext(RuleNullExpressionContext.class,0);
		}
		public RuleBaseExpression1Context(RuleBaseExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleBaseExpression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleBaseExpression1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleBaseExpression7Context extends RuleBaseExpressionContext {
		public TerminalNode LPAREN() { return getToken(KerMLv2Parser.LPAREN, 0); }
		public RuleSequenceExpressionContext ruleSequenceExpression() {
			return getRuleContext(RuleSequenceExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(KerMLv2Parser.RPAREN, 0); }
		public RuleBaseExpression7Context(RuleBaseExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleBaseExpression7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleBaseExpression7(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleBaseExpression6Context extends RuleBaseExpressionContext {
		public RuleBodyExpressionContext ruleBodyExpression() {
			return getRuleContext(RuleBodyExpressionContext.class,0);
		}
		public RuleBaseExpression6Context(RuleBaseExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleBaseExpression6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleBaseExpression6(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleBaseExpression5Context extends RuleBaseExpressionContext {
		public RuleInvocationExpressionContext ruleInvocationExpression() {
			return getRuleContext(RuleInvocationExpressionContext.class,0);
		}
		public RuleBaseExpression5Context(RuleBaseExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleBaseExpression5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleBaseExpression5(this);
		}
	}

	public final RuleBaseExpressionContext ruleBaseExpression() throws RecognitionException {
		RuleBaseExpressionContext _localctx = new RuleBaseExpressionContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_ruleBaseExpression);
		try {
			setState(2120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				_localctx = new RuleBaseExpression1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2110);
				ruleNullExpression();
				}
				break;
			case 2:
				_localctx = new RuleBaseExpression2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2111);
				ruleLiteralExpression();
				}
				break;
			case 3:
				_localctx = new RuleBaseExpression3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2112);
				ruleFeatureReferenceExpression();
				}
				break;
			case 4:
				_localctx = new RuleBaseExpression4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2113);
				ruleMetadataAccessExpression();
				}
				break;
			case 5:
				_localctx = new RuleBaseExpression5Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2114);
				ruleInvocationExpression();
				}
				break;
			case 6:
				_localctx = new RuleBaseExpression6Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2115);
				ruleBodyExpression();
				}
				break;
			case 7:
				_localctx = new RuleBaseExpression7Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(2116);
				match(LPAREN);
				setState(2117);
				ruleSequenceExpression();
				setState(2118);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleBodyExpressionContext extends ParserRuleContext {
		public RuleExpressionBodyMemberContext ruleExpressionBodyMember() {
			return getRuleContext(RuleExpressionBodyMemberContext.class,0);
		}
		public RuleBodyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleBodyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleBodyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleBodyExpression(this);
		}
	}

	public final RuleBodyExpressionContext ruleBodyExpression() throws RecognitionException {
		RuleBodyExpressionContext _localctx = new RuleBodyExpressionContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_ruleBodyExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2122);
			ruleExpressionBodyMember();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleExpressionBodyMemberContext extends ParserRuleContext {
		public RuleExpressionBodyContext ruleExpressionBody() {
			return getRuleContext(RuleExpressionBodyContext.class,0);
		}
		public RuleExpressionBodyMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleExpressionBodyMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleExpressionBodyMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleExpressionBodyMember(this);
		}
	}

	public final RuleExpressionBodyMemberContext ruleExpressionBodyMember() throws RecognitionException {
		RuleExpressionBodyMemberContext _localctx = new RuleExpressionBodyMemberContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_ruleExpressionBodyMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2124);
			ruleExpressionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleBodyParameterContext extends ParserRuleContext {
		public RuleNameContext ruleName() {
			return getRuleContext(RuleNameContext.class,0);
		}
		public RuleBodyParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleBodyParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleBodyParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleBodyParameter(this);
		}
	}

	public final RuleBodyParameterContext ruleBodyParameter() throws RecognitionException {
		RuleBodyParameterContext _localctx = new RuleBodyParameterContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_ruleBodyParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2126);
			ruleName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleSequenceExpressionContext extends ParserRuleContext {
		public RuleOwnedExpressionContext ruleOwnedExpression() {
			return getRuleContext(RuleOwnedExpressionContext.class,0);
		}
		public TerminalNode OP_COMMA() { return getToken(KerMLv2Parser.OP_COMMA, 0); }
		public RuleSequenceExpressionContext ruleSequenceExpression() {
			return getRuleContext(RuleSequenceExpressionContext.class,0);
		}
		public RuleSequenceExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSequenceExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleSequenceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleSequenceExpression(this);
		}
	}

	public final RuleSequenceExpressionContext ruleSequenceExpression() throws RecognitionException {
		RuleSequenceExpressionContext _localctx = new RuleSequenceExpressionContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_ruleSequenceExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2128);
			ruleOwnedExpression();
			setState(2132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				setState(2129);
				match(OP_COMMA);
				}
				break;
			case 2:
				{
				setState(2130);
				match(OP_COMMA);
				setState(2131);
				ruleSequenceExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureReferenceExpressionContext extends ParserRuleContext {
		public RuleFeatureReferenceMemberContext ruleFeatureReferenceMember() {
			return getRuleContext(RuleFeatureReferenceMemberContext.class,0);
		}
		public RuleFeatureReferenceExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFeatureReferenceExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureReferenceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureReferenceExpression(this);
		}
	}

	public final RuleFeatureReferenceExpressionContext ruleFeatureReferenceExpression() throws RecognitionException {
		RuleFeatureReferenceExpressionContext _localctx = new RuleFeatureReferenceExpressionContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_ruleFeatureReferenceExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2134);
			ruleFeatureReferenceMember();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureReferenceMemberContext extends ParserRuleContext {
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleFeatureReferenceMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFeatureReferenceMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureReferenceMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureReferenceMember(this);
		}
	}

	public final RuleFeatureReferenceMemberContext ruleFeatureReferenceMember() throws RecognitionException {
		RuleFeatureReferenceMemberContext _localctx = new RuleFeatureReferenceMemberContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_ruleFeatureReferenceMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2136);
			ruleQualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleMetadataAccessExpressionContext extends ParserRuleContext {
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public TerminalNode OP_DOT() { return getToken(KerMLv2Parser.OP_DOT, 0); }
		public TerminalNode K_METADATA() { return getToken(KerMLv2Parser.K_METADATA, 0); }
		public RuleMetadataAccessExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleMetadataAccessExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleMetadataAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleMetadataAccessExpression(this);
		}
	}

	public final RuleMetadataAccessExpressionContext ruleMetadataAccessExpression() throws RecognitionException {
		RuleMetadataAccessExpressionContext _localctx = new RuleMetadataAccessExpressionContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_ruleMetadataAccessExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2138);
			ruleQualifiedName();
			setState(2139);
			match(OP_DOT);
			setState(2140);
			match(K_METADATA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleInvocationExpressionContext extends ParserRuleContext {
		public RuleOwnedFeatureTypingContext ruleOwnedFeatureTyping() {
			return getRuleContext(RuleOwnedFeatureTypingContext.class,0);
		}
		public RuleArgumentListContext ruleArgumentList() {
			return getRuleContext(RuleArgumentListContext.class,0);
		}
		public RuleInvocationExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleInvocationExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleInvocationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleInvocationExpression(this);
		}
	}

	public final RuleInvocationExpressionContext ruleInvocationExpression() throws RecognitionException {
		RuleInvocationExpressionContext _localctx = new RuleInvocationExpressionContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_ruleInvocationExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2142);
			ruleOwnedFeatureTyping();
			setState(2143);
			ruleArgumentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedFeatureChainContext extends ParserRuleContext {
		public RuleFeatureChainContext ruleFeatureChain() {
			return getRuleContext(RuleFeatureChainContext.class,0);
		}
		public RuleOwnedFeatureChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOwnedFeatureChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleOwnedFeatureChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleOwnedFeatureChain(this);
		}
	}

	public final RuleOwnedFeatureChainContext ruleOwnedFeatureChain() throws RecognitionException {
		RuleOwnedFeatureChainContext _localctx = new RuleOwnedFeatureChainContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_ruleOwnedFeatureChain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2145);
			ruleFeatureChain();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureChainContext extends ParserRuleContext {
		public List<RuleOwnedFeatureChainingContext> ruleOwnedFeatureChaining() {
			return getRuleContexts(RuleOwnedFeatureChainingContext.class);
		}
		public RuleOwnedFeatureChainingContext ruleOwnedFeatureChaining(int i) {
			return getRuleContext(RuleOwnedFeatureChainingContext.class,i);
		}
		public List<TerminalNode> OP_DOT() { return getTokens(KerMLv2Parser.OP_DOT); }
		public TerminalNode OP_DOT(int i) {
			return getToken(KerMLv2Parser.OP_DOT, i);
		}
		public RuleFeatureChainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFeatureChain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureChain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureChain(this);
		}
	}

	public final RuleFeatureChainContext ruleFeatureChain() throws RecognitionException {
		RuleFeatureChainContext _localctx = new RuleFeatureChainContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_ruleFeatureChain);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2147);
			ruleOwnedFeatureChaining();
			setState(2150); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2148);
					match(OP_DOT);
					setState(2149);
					ruleOwnedFeatureChaining();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2152); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleOwnedFeatureChainingContext extends ParserRuleContext {
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleOwnedFeatureChainingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleOwnedFeatureChaining; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleOwnedFeatureChaining(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleOwnedFeatureChaining(this);
		}
	}

	public final RuleOwnedFeatureChainingContext ruleOwnedFeatureChaining() throws RecognitionException {
		RuleOwnedFeatureChainingContext _localctx = new RuleOwnedFeatureChainingContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_ruleOwnedFeatureChaining);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2154);
			ruleQualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleArgumentListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(KerMLv2Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(KerMLv2Parser.RPAREN, 0); }
		public RulePositionalArgumentListContext rulePositionalArgumentList() {
			return getRuleContext(RulePositionalArgumentListContext.class,0);
		}
		public RuleNamedArgumentListContext ruleNamedArgumentList() {
			return getRuleContext(RuleNamedArgumentListContext.class,0);
		}
		public RuleArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleArgumentList(this);
		}
	}

	public final RuleArgumentListContext ruleArgumentList() throws RecognitionException {
		RuleArgumentListContext _localctx = new RuleArgumentListContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_ruleArgumentList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2156);
			match(LPAREN);
			setState(2159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				{
				setState(2157);
				rulePositionalArgumentList();
				}
				break;
			case 2:
				{
				setState(2158);
				ruleNamedArgumentList();
				}
				break;
			}
			setState(2161);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RulePositionalArgumentListContext extends ParserRuleContext {
		public List<RuleArgumentMemberContext> ruleArgumentMember() {
			return getRuleContexts(RuleArgumentMemberContext.class);
		}
		public RuleArgumentMemberContext ruleArgumentMember(int i) {
			return getRuleContext(RuleArgumentMemberContext.class,i);
		}
		public List<TerminalNode> OP_COMMA() { return getTokens(KerMLv2Parser.OP_COMMA); }
		public TerminalNode OP_COMMA(int i) {
			return getToken(KerMLv2Parser.OP_COMMA, i);
		}
		public RulePositionalArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulePositionalArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRulePositionalArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRulePositionalArgumentList(this);
		}
	}

	public final RulePositionalArgumentListContext rulePositionalArgumentList() throws RecognitionException {
		RulePositionalArgumentListContext _localctx = new RulePositionalArgumentListContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_rulePositionalArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2163);
			ruleArgumentMember();
			setState(2168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_COMMA) {
				{
				{
				setState(2164);
				match(OP_COMMA);
				setState(2165);
				ruleArgumentMember();
				}
				}
				setState(2170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleArgumentMemberContext extends ParserRuleContext {
		public RuleArgumentContext ruleArgument() {
			return getRuleContext(RuleArgumentContext.class,0);
		}
		public RuleArgumentMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleArgumentMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleArgumentMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleArgumentMember(this);
		}
	}

	public final RuleArgumentMemberContext ruleArgumentMember() throws RecognitionException {
		RuleArgumentMemberContext _localctx = new RuleArgumentMemberContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_ruleArgumentMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2171);
			ruleArgument();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleArgumentContext extends ParserRuleContext {
		public RuleArgumentValueContext ruleArgumentValue() {
			return getRuleContext(RuleArgumentValueContext.class,0);
		}
		public RuleArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleArgument(this);
		}
	}

	public final RuleArgumentContext ruleArgument() throws RecognitionException {
		RuleArgumentContext _localctx = new RuleArgumentContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_ruleArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2173);
			ruleArgumentValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleNamedArgumentListContext extends ParserRuleContext {
		public List<RuleNamedArgumentMemberContext> ruleNamedArgumentMember() {
			return getRuleContexts(RuleNamedArgumentMemberContext.class);
		}
		public RuleNamedArgumentMemberContext ruleNamedArgumentMember(int i) {
			return getRuleContext(RuleNamedArgumentMemberContext.class,i);
		}
		public List<TerminalNode> OP_COMMA() { return getTokens(KerMLv2Parser.OP_COMMA); }
		public TerminalNode OP_COMMA(int i) {
			return getToken(KerMLv2Parser.OP_COMMA, i);
		}
		public RuleNamedArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleNamedArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNamedArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNamedArgumentList(this);
		}
	}

	public final RuleNamedArgumentListContext ruleNamedArgumentList() throws RecognitionException {
		RuleNamedArgumentListContext _localctx = new RuleNamedArgumentListContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_ruleNamedArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2175);
			ruleNamedArgumentMember();
			setState(2180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_COMMA) {
				{
				{
				setState(2176);
				match(OP_COMMA);
				setState(2177);
				ruleNamedArgumentMember();
				}
				}
				setState(2182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleNamedArgumentMemberContext extends ParserRuleContext {
		public RuleNamedArgumentContext ruleNamedArgument() {
			return getRuleContext(RuleNamedArgumentContext.class,0);
		}
		public RuleNamedArgumentMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleNamedArgumentMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNamedArgumentMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNamedArgumentMember(this);
		}
	}

	public final RuleNamedArgumentMemberContext ruleNamedArgumentMember() throws RecognitionException {
		RuleNamedArgumentMemberContext _localctx = new RuleNamedArgumentMemberContext(_ctx, getState());
		enterRule(_localctx, 478, RULE_ruleNamedArgumentMember);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2183);
			ruleNamedArgument();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleNamedArgumentContext extends ParserRuleContext {
		public RuleParameterRedefinitionContext ruleParameterRedefinition() {
			return getRuleContext(RuleParameterRedefinitionContext.class,0);
		}
		public TerminalNode OP_EQ() { return getToken(KerMLv2Parser.OP_EQ, 0); }
		public RuleArgumentValueContext ruleArgumentValue() {
			return getRuleContext(RuleArgumentValueContext.class,0);
		}
		public RuleNamedArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleNamedArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNamedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNamedArgument(this);
		}
	}

	public final RuleNamedArgumentContext ruleNamedArgument() throws RecognitionException {
		RuleNamedArgumentContext _localctx = new RuleNamedArgumentContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_ruleNamedArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2185);
			ruleParameterRedefinition();
			setState(2186);
			match(OP_EQ);
			setState(2187);
			ruleArgumentValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleParameterRedefinitionContext extends ParserRuleContext {
		public RuleQualifiedNameContext ruleQualifiedName() {
			return getRuleContext(RuleQualifiedNameContext.class,0);
		}
		public RuleParameterRedefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleParameterRedefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleParameterRedefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleParameterRedefinition(this);
		}
	}

	public final RuleParameterRedefinitionContext ruleParameterRedefinition() throws RecognitionException {
		RuleParameterRedefinitionContext _localctx = new RuleParameterRedefinitionContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_ruleParameterRedefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2189);
			ruleQualifiedName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleArgumentValueContext extends ParserRuleContext {
		public RuleOwnedExpressionContext ruleOwnedExpression() {
			return getRuleContext(RuleOwnedExpressionContext.class,0);
		}
		public RuleArgumentValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleArgumentValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleArgumentValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleArgumentValue(this);
		}
	}

	public final RuleArgumentValueContext ruleArgumentValue() throws RecognitionException {
		RuleArgumentValueContext _localctx = new RuleArgumentValueContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_ruleArgumentValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2191);
			ruleOwnedExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleNullExpressionContext extends ParserRuleContext {
		public TerminalNode K_NULL() { return getToken(KerMLv2Parser.K_NULL, 0); }
		public TerminalNode LPAREN() { return getToken(KerMLv2Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(KerMLv2Parser.RPAREN, 0); }
		public RuleNullExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleNullExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleNullExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleNullExpression(this);
		}
	}

	public final RuleNullExpressionContext ruleNullExpression() throws RecognitionException {
		RuleNullExpressionContext _localctx = new RuleNullExpressionContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_ruleNullExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_NULL:
				{
				setState(2193);
				match(K_NULL);
				}
				break;
			case LPAREN:
				{
				setState(2194);
				match(LPAREN);
				setState(2195);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleLiteralExpressionContext extends ParserRuleContext {
		public RuleLiteralExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleLiteralExpression; }
	 
		public RuleLiteralExpressionContext() { }
		public void copyFrom(RuleLiteralExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleLiteralExpression1Context extends RuleLiteralExpressionContext {
		public RuleLiteralBooleanContext ruleLiteralBoolean() {
			return getRuleContext(RuleLiteralBooleanContext.class,0);
		}
		public RuleLiteralExpression1Context(RuleLiteralExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleLiteralExpression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleLiteralExpression1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleLiteralExpression2Context extends RuleLiteralExpressionContext {
		public RuleLiteralStringContext ruleLiteralString() {
			return getRuleContext(RuleLiteralStringContext.class,0);
		}
		public RuleLiteralExpression2Context(RuleLiteralExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleLiteralExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleLiteralExpression2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleLiteralExpression3Context extends RuleLiteralExpressionContext {
		public RuleLiteralIntegerContext ruleLiteralInteger() {
			return getRuleContext(RuleLiteralIntegerContext.class,0);
		}
		public RuleLiteralExpression3Context(RuleLiteralExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleLiteralExpression3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleLiteralExpression3(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleLiteralExpression4Context extends RuleLiteralExpressionContext {
		public RuleLiteralRealContext ruleLiteralReal() {
			return getRuleContext(RuleLiteralRealContext.class,0);
		}
		public RuleLiteralExpression4Context(RuleLiteralExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleLiteralExpression4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleLiteralExpression4(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleLiteralExpression5Context extends RuleLiteralExpressionContext {
		public RuleLiteralInfinityContext ruleLiteralInfinity() {
			return getRuleContext(RuleLiteralInfinityContext.class,0);
		}
		public RuleLiteralExpression5Context(RuleLiteralExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleLiteralExpression5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleLiteralExpression5(this);
		}
	}

	public final RuleLiteralExpressionContext ruleLiteralExpression() throws RecognitionException {
		RuleLiteralExpressionContext _localctx = new RuleLiteralExpressionContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_ruleLiteralExpression);
		try {
			setState(2203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				_localctx = new RuleLiteralExpression1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2198);
				ruleLiteralBoolean();
				}
				break;
			case 2:
				_localctx = new RuleLiteralExpression2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2199);
				ruleLiteralString();
				}
				break;
			case 3:
				_localctx = new RuleLiteralExpression3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2200);
				ruleLiteralInteger();
				}
				break;
			case 4:
				_localctx = new RuleLiteralExpression4Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2201);
				ruleLiteralReal();
				}
				break;
			case 5:
				_localctx = new RuleLiteralExpression5Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2202);
				ruleLiteralInfinity();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleLiteralBooleanContext extends ParserRuleContext {
		public RuleBooleanValueContext ruleBooleanValue() {
			return getRuleContext(RuleBooleanValueContext.class,0);
		}
		public RuleLiteralBooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleLiteralBoolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleLiteralBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleLiteralBoolean(this);
		}
	}

	public final RuleLiteralBooleanContext ruleLiteralBoolean() throws RecognitionException {
		RuleLiteralBooleanContext _localctx = new RuleLiteralBooleanContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_ruleLiteralBoolean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2205);
			ruleBooleanValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleBooleanValueContext extends ParserRuleContext {
		public RuleBooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleBooleanValue; }
	 
		public RuleBooleanValueContext() { }
		public void copyFrom(RuleBooleanValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleBooleanValue1Context extends RuleBooleanValueContext {
		public TerminalNode K_TRUE() { return getToken(KerMLv2Parser.K_TRUE, 0); }
		public RuleBooleanValue1Context(RuleBooleanValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleBooleanValue1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleBooleanValue1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleBooleanValue2Context extends RuleBooleanValueContext {
		public TerminalNode K_FALSE() { return getToken(KerMLv2Parser.K_FALSE, 0); }
		public RuleBooleanValue2Context(RuleBooleanValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleBooleanValue2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleBooleanValue2(this);
		}
	}

	public final RuleBooleanValueContext ruleBooleanValue() throws RecognitionException {
		RuleBooleanValueContext _localctx = new RuleBooleanValueContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_ruleBooleanValue);
		try {
			setState(2209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_TRUE:
				_localctx = new RuleBooleanValue1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2207);
				match(K_TRUE);
				}
				break;
			case K_FALSE:
				_localctx = new RuleBooleanValue2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2208);
				match(K_FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleLiteralStringContext extends ParserRuleContext {
		public TerminalNode RULE_STRING_VALUE() { return getToken(KerMLv2Parser.RULE_STRING_VALUE, 0); }
		public RuleLiteralStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleLiteralString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleLiteralString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleLiteralString(this);
		}
	}

	public final RuleLiteralStringContext ruleLiteralString() throws RecognitionException {
		RuleLiteralStringContext _localctx = new RuleLiteralStringContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_ruleLiteralString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2211);
			match(RULE_STRING_VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleLiteralIntegerContext extends ParserRuleContext {
		public TerminalNode RULE_DECIMAL_VALUE() { return getToken(KerMLv2Parser.RULE_DECIMAL_VALUE, 0); }
		public RuleLiteralIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleLiteralInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleLiteralInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleLiteralInteger(this);
		}
	}

	public final RuleLiteralIntegerContext ruleLiteralInteger() throws RecognitionException {
		RuleLiteralIntegerContext _localctx = new RuleLiteralIntegerContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_ruleLiteralInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2213);
			match(RULE_DECIMAL_VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleLiteralRealContext extends ParserRuleContext {
		public RuleRealValueContext ruleRealValue() {
			return getRuleContext(RuleRealValueContext.class,0);
		}
		public RuleLiteralRealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleLiteralReal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleLiteralReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleLiteralReal(this);
		}
	}

	public final RuleLiteralRealContext ruleLiteralReal() throws RecognitionException {
		RuleLiteralRealContext _localctx = new RuleLiteralRealContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_ruleLiteralReal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2215);
			ruleRealValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleRealValueContext extends ParserRuleContext {
		public RuleRealValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleRealValue; }
	 
		public RuleRealValueContext() { }
		public void copyFrom(RuleRealValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleRealValue2Context extends RuleRealValueContext {
		public TerminalNode RULE_EXP_VALUE() { return getToken(KerMLv2Parser.RULE_EXP_VALUE, 0); }
		public RuleRealValue2Context(RuleRealValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleRealValue2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleRealValue2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleRealValue1Context extends RuleRealValueContext {
		public TerminalNode OP_DOT() { return getToken(KerMLv2Parser.OP_DOT, 0); }
		public List<TerminalNode> RULE_DECIMAL_VALUE() { return getTokens(KerMLv2Parser.RULE_DECIMAL_VALUE); }
		public TerminalNode RULE_DECIMAL_VALUE(int i) {
			return getToken(KerMLv2Parser.RULE_DECIMAL_VALUE, i);
		}
		public TerminalNode RULE_EXP_VALUE() { return getToken(KerMLv2Parser.RULE_EXP_VALUE, 0); }
		public RuleRealValue1Context(RuleRealValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleRealValue1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleRealValue1(this);
		}
	}

	public final RuleRealValueContext ruleRealValue() throws RecognitionException {
		RuleRealValueContext _localctx = new RuleRealValueContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_ruleRealValue);
		int _la;
		try {
			setState(2223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OP_DOT:
			case RULE_DECIMAL_VALUE:
				_localctx = new RuleRealValue1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RULE_DECIMAL_VALUE) {
					{
					setState(2217);
					match(RULE_DECIMAL_VALUE);
					}
				}

				setState(2220);
				match(OP_DOT);
				setState(2221);
				_la = _input.LA(1);
				if ( !(_la==RULE_DECIMAL_VALUE || _la==RULE_EXP_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case RULE_EXP_VALUE:
				_localctx = new RuleRealValue2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2222);
				match(RULE_EXP_VALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleLiteralInfinityContext extends ParserRuleContext {
		public TerminalNode OP_STAR() { return getToken(KerMLv2Parser.OP_STAR, 0); }
		public RuleLiteralInfinityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleLiteralInfinity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleLiteralInfinity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleLiteralInfinity(this);
		}
	}

	public final RuleLiteralInfinityContext ruleLiteralInfinity() throws RecognitionException {
		RuleLiteralInfinityContext _localctx = new RuleLiteralInfinityContext(_ctx, getState());
		enterRule(_localctx, 502, RULE_ruleLiteralInfinity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2225);
			match(OP_STAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleNameContext extends ParserRuleContext {
		public RuleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleName; }
	 
		public RuleNameContext() { }
		public void copyFrom(RuleNameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleName1Context extends RuleNameContext {
		public TerminalNode RULE_ID() { return getToken(KerMLv2Parser.RULE_ID, 0); }
		public RuleName1Context(RuleNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleName1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleName1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleName2Context extends RuleNameContext {
		public TerminalNode RULE_UNRESTRICTED_NAME() { return getToken(KerMLv2Parser.RULE_UNRESTRICTED_NAME, 0); }
		public RuleName2Context(RuleNameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleName2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleName2(this);
		}
	}

	public final RuleNameContext ruleName() throws RecognitionException {
		RuleNameContext _localctx = new RuleNameContext(_ctx, getState());
		enterRule(_localctx, 504, RULE_ruleName);
		try {
			setState(2229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RULE_ID:
				_localctx = new RuleName1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2227);
				match(RULE_ID);
				}
				break;
			case RULE_UNRESTRICTED_NAME:
				_localctx = new RuleName2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2228);
				match(RULE_UNRESTRICTED_NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleQualificationContext extends ParserRuleContext {
		public List<RuleNameContext> ruleName() {
			return getRuleContexts(RuleNameContext.class);
		}
		public RuleNameContext ruleName(int i) {
			return getRuleContext(RuleNameContext.class,i);
		}
		public List<TerminalNode> OP_COLON_COLON() { return getTokens(KerMLv2Parser.OP_COLON_COLON); }
		public TerminalNode OP_COLON_COLON(int i) {
			return getToken(KerMLv2Parser.OP_COLON_COLON, i);
		}
		public RuleQualificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleQualification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleQualification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleQualification(this);
		}
	}

	public final RuleQualificationContext ruleQualification() throws RecognitionException {
		RuleQualificationContext _localctx = new RuleQualificationContext(_ctx, getState());
		enterRule(_localctx, 506, RULE_ruleQualification);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2234); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2231);
					ruleName();
					setState(2232);
					match(OP_COLON_COLON);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2236); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleQualifiedNameContext extends ParserRuleContext {
		public RuleNameContext ruleName() {
			return getRuleContext(RuleNameContext.class,0);
		}
		public RuleQualificationContext ruleQualification() {
			return getRuleContext(RuleQualificationContext.class,0);
		}
		public RuleQualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleQualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleQualifiedName(this);
		}
	}

	public final RuleQualifiedNameContext ruleQualifiedName() throws RecognitionException {
		RuleQualifiedNameContext _localctx = new RuleQualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 508, RULE_ruleQualifiedName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				{
				setState(2238);
				ruleQualification();
				}
				break;
			}
			setState(2241);
			ruleName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleFilterPackageMemberVisibilityContext extends ParserRuleContext {
		public TerminalNode LSQUARE() { return getToken(KerMLv2Parser.LSQUARE, 0); }
		public RuleFilterPackageMemberVisibilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFilterPackageMemberVisibility; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFilterPackageMemberVisibility(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFilterPackageMemberVisibility(this);
		}
	}

	public final RuleFilterPackageMemberVisibilityContext ruleFilterPackageMemberVisibility() throws RecognitionException {
		RuleFilterPackageMemberVisibilityContext _localctx = new RuleFilterPackageMemberVisibilityContext(_ctx, getState());
		enterRule(_localctx, 510, RULE_ruleFilterPackageMemberVisibility);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2243);
			match(LSQUARE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleVisibilityIndicatorContext extends ParserRuleContext {
		public RuleVisibilityIndicatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleVisibilityIndicator; }
	 
		public RuleVisibilityIndicatorContext() { }
		public void copyFrom(RuleVisibilityIndicatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleVisibilityIndicator3Context extends RuleVisibilityIndicatorContext {
		public TerminalNode K_PROTECTED() { return getToken(KerMLv2Parser.K_PROTECTED, 0); }
		public RuleVisibilityIndicator3Context(RuleVisibilityIndicatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleVisibilityIndicator3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleVisibilityIndicator3(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleVisibilityIndicator1Context extends RuleVisibilityIndicatorContext {
		public TerminalNode K_PUBLIC() { return getToken(KerMLv2Parser.K_PUBLIC, 0); }
		public RuleVisibilityIndicator1Context(RuleVisibilityIndicatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleVisibilityIndicator1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleVisibilityIndicator1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleVisibilityIndicator2Context extends RuleVisibilityIndicatorContext {
		public TerminalNode K_PRIVATE() { return getToken(KerMLv2Parser.K_PRIVATE, 0); }
		public RuleVisibilityIndicator2Context(RuleVisibilityIndicatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleVisibilityIndicator2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleVisibilityIndicator2(this);
		}
	}

	public final RuleVisibilityIndicatorContext ruleVisibilityIndicator() throws RecognitionException {
		RuleVisibilityIndicatorContext _localctx = new RuleVisibilityIndicatorContext(_ctx, getState());
		enterRule(_localctx, 512, RULE_ruleVisibilityIndicator);
		try {
			setState(2248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PUBLIC:
				_localctx = new RuleVisibilityIndicator1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2245);
				match(K_PUBLIC);
				}
				break;
			case K_PRIVATE:
				_localctx = new RuleVisibilityIndicator2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2246);
				match(K_PRIVATE);
				}
				break;
			case K_PROTECTED:
				_localctx = new RuleVisibilityIndicator3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2247);
				match(K_PROTECTED);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureDirectionContext extends ParserRuleContext {
		public RuleFeatureDirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleFeatureDirection; }
	 
		public RuleFeatureDirectionContext() { }
		public void copyFrom(RuleFeatureDirectionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureDirection1Context extends RuleFeatureDirectionContext {
		public TerminalNode K_IN() { return getToken(KerMLv2Parser.K_IN, 0); }
		public RuleFeatureDirection1Context(RuleFeatureDirectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureDirection1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureDirection1(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureDirection2Context extends RuleFeatureDirectionContext {
		public TerminalNode K_OUT() { return getToken(KerMLv2Parser.K_OUT, 0); }
		public RuleFeatureDirection2Context(RuleFeatureDirectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureDirection2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureDirection2(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuleFeatureDirection3Context extends RuleFeatureDirectionContext {
		public TerminalNode K_INOUT() { return getToken(KerMLv2Parser.K_INOUT, 0); }
		public RuleFeatureDirection3Context(RuleFeatureDirectionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).enterRuleFeatureDirection3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof KerMLv2Listener ) ((KerMLv2Listener)listener).exitRuleFeatureDirection3(this);
		}
	}

	public final RuleFeatureDirectionContext ruleFeatureDirection() throws RecognitionException {
		RuleFeatureDirectionContext _localctx = new RuleFeatureDirectionContext(_ctx, getState());
		enterRule(_localctx, 514, RULE_ruleFeatureDirection);
		try {
			setState(2253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_IN:
				_localctx = new RuleFeatureDirection1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2250);
				match(K_IN);
				}
				break;
			case K_OUT:
				_localctx = new RuleFeatureDirection2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2251);
				match(K_OUT);
				}
				break;
			case K_INOUT:
				_localctx = new RuleFeatureDirection3Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2252);
				match(K_INOUT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0096\u08d0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007"+
		"\u0083\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007"+
		"\u0086\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007"+
		"\u0089\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007"+
		"\u008c\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007"+
		"\u008f\u0002\u0090\u0007\u0090\u0002\u0091\u0007\u0091\u0002\u0092\u0007"+
		"\u0092\u0002\u0093\u0007\u0093\u0002\u0094\u0007\u0094\u0002\u0095\u0007"+
		"\u0095\u0002\u0096\u0007\u0096\u0002\u0097\u0007\u0097\u0002\u0098\u0007"+
		"\u0098\u0002\u0099\u0007\u0099\u0002\u009a\u0007\u009a\u0002\u009b\u0007"+
		"\u009b\u0002\u009c\u0007\u009c\u0002\u009d\u0007\u009d\u0002\u009e\u0007"+
		"\u009e\u0002\u009f\u0007\u009f\u0002\u00a0\u0007\u00a0\u0002\u00a1\u0007"+
		"\u00a1\u0002\u00a2\u0007\u00a2\u0002\u00a3\u0007\u00a3\u0002\u00a4\u0007"+
		"\u00a4\u0002\u00a5\u0007\u00a5\u0002\u00a6\u0007\u00a6\u0002\u00a7\u0007"+
		"\u00a7\u0002\u00a8\u0007\u00a8\u0002\u00a9\u0007\u00a9\u0002\u00aa\u0007"+
		"\u00aa\u0002\u00ab\u0007\u00ab\u0002\u00ac\u0007\u00ac\u0002\u00ad\u0007"+
		"\u00ad\u0002\u00ae\u0007\u00ae\u0002\u00af\u0007\u00af\u0002\u00b0\u0007"+
		"\u00b0\u0002\u00b1\u0007\u00b1\u0002\u00b2\u0007\u00b2\u0002\u00b3\u0007"+
		"\u00b3\u0002\u00b4\u0007\u00b4\u0002\u00b5\u0007\u00b5\u0002\u00b6\u0007"+
		"\u00b6\u0002\u00b7\u0007\u00b7\u0002\u00b8\u0007\u00b8\u0002\u00b9\u0007"+
		"\u00b9\u0002\u00ba\u0007\u00ba\u0002\u00bb\u0007\u00bb\u0002\u00bc\u0007"+
		"\u00bc\u0002\u00bd\u0007\u00bd\u0002\u00be\u0007\u00be\u0002\u00bf\u0007"+
		"\u00bf\u0002\u00c0\u0007\u00c0\u0002\u00c1\u0007\u00c1\u0002\u00c2\u0007"+
		"\u00c2\u0002\u00c3\u0007\u00c3\u0002\u00c4\u0007\u00c4\u0002\u00c5\u0007"+
		"\u00c5\u0002\u00c6\u0007\u00c6\u0002\u00c7\u0007\u00c7\u0002\u00c8\u0007"+
		"\u00c8\u0002\u00c9\u0007\u00c9\u0002\u00ca\u0007\u00ca\u0002\u00cb\u0007"+
		"\u00cb\u0002\u00cc\u0007\u00cc\u0002\u00cd\u0007\u00cd\u0002\u00ce\u0007"+
		"\u00ce\u0002\u00cf\u0007\u00cf\u0002\u00d0\u0007\u00d0\u0002\u00d1\u0007"+
		"\u00d1\u0002\u00d2\u0007\u00d2\u0002\u00d3\u0007\u00d3\u0002\u00d4\u0007"+
		"\u00d4\u0002\u00d5\u0007\u00d5\u0002\u00d6\u0007\u00d6\u0002\u00d7\u0007"+
		"\u00d7\u0002\u00d8\u0007\u00d8\u0002\u00d9\u0007\u00d9\u0002\u00da\u0007"+
		"\u00da\u0002\u00db\u0007\u00db\u0002\u00dc\u0007\u00dc\u0002\u00dd\u0007"+
		"\u00dd\u0002\u00de\u0007\u00de\u0002\u00df\u0007\u00df\u0002\u00e0\u0007"+
		"\u00e0\u0002\u00e1\u0007\u00e1\u0002\u00e2\u0007\u00e2\u0002\u00e3\u0007"+
		"\u00e3\u0002\u00e4\u0007\u00e4\u0002\u00e5\u0007\u00e5\u0002\u00e6\u0007"+
		"\u00e6\u0002\u00e7\u0007\u00e7\u0002\u00e8\u0007\u00e8\u0002\u00e9\u0007"+
		"\u00e9\u0002\u00ea\u0007\u00ea\u0002\u00eb\u0007\u00eb\u0002\u00ec\u0007"+
		"\u00ec\u0002\u00ed\u0007\u00ed\u0002\u00ee\u0007\u00ee\u0002\u00ef\u0007"+
		"\u00ef\u0002\u00f0\u0007\u00f0\u0002\u00f1\u0007\u00f1\u0002\u00f2\u0007"+
		"\u00f2\u0002\u00f3\u0007\u00f3\u0002\u00f4\u0007\u00f4\u0002\u00f5\u0007"+
		"\u00f5\u0002\u00f6\u0007\u00f6\u0002\u00f7\u0007\u00f7\u0002\u00f8\u0007"+
		"\u00f8\u0002\u00f9\u0007\u00f9\u0002\u00fa\u0007\u00fa\u0002\u00fb\u0007"+
		"\u00fb\u0002\u00fc\u0007\u00fc\u0002\u00fd\u0007\u00fd\u0002\u00fe\u0007"+
		"\u00fe\u0002\u00ff\u0007\u00ff\u0002\u0100\u0007\u0100\u0002\u0101\u0007"+
		"\u0101\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001\u0209"+
		"\b\u0001\n\u0001\f\u0001\u020c\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002\u0212\b\u0002\u0001\u0002\u0003\u0002\u0215\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u021a\b\u0003\n"+
		"\u0003\f\u0003\u021d\t\u0003\u0001\u0003\u0003\u0003\u0220\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u0224\b\u0004\u0001\u0005\u0001\u0005\u0003"+
		"\u0005\u0228\b\u0005\u0001\u0006\u0005\u0006\u022b\b\u0006\n\u0006\f\u0006"+
		"\u022e\t\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0232\b\u0006\u0001"+
		"\u0006\u0003\u0006\u0235\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006\u023a\b\u0006\n\u0006\f\u0006\u023d\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u0243\b\u0006\n\u0006\f\u0006\u0246"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0252\b\t\u0001\n\u0001\n\u0003"+
		"\n\u0256\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u025c\b\n\n\n\f\n"+
		"\u025f\t\n\u0003\n\u0261\b\n\u0003\n\u0263\b\n\u0001\n\u0001\n\u0003\n"+
		"\u0267\b\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0003\u000b\u026d\b"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0271\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0003\f\u0277\b\f\u0003\f\u0279\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0005\r\u0280\b\r\n\r\f\r\u0283\t\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0003\u000e\u028a\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0291"+
		"\b\u000f\n\u000f\f\u000f\u0294\t\u000f\u0001\u000f\u0003\u000f\u0297\b"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u029c\b\u0010\u0001"+
		"\u0011\u0003\u0011\u029f\b\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u02a3"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u02b1\b\u0015\u0001\u0015\u0003\u0015\u02b4\b\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0003\u0016"+
		"\u02bb\b\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u02bf\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u02c3\b\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u02cd\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u02d2"+
		"\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u02d9\b\u001b\u0001\u001c\u0001\u001c\u0004\u001c\u02dd\b\u001c"+
		"\u000b\u001c\f\u001c\u02de\u0001\u001d\u0001\u001d\u0003\u001d\u02e3\b"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001!\u0001!\u0003!\u02ef\b!\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u030b\b\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u0317\b#\u0001"+
		"$\u0005$\u031a\b$\n$\f$\u031d\t$\u0001$\u0001$\u0001$\u0001%\u0003%\u0323"+
		"\b%\u0001%\u0001%\u0005%\u0327\b%\n%\f%\u032a\t%\u0001%\u0001%\u0001%"+
		"\u0001&\u0001&\u0003&\u0331\b&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0005\'\u0339\b\'\n\'\f\'\u033c\t\'\u0001\'\u0003\'\u033f\b\'"+
		"\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0003)\u0347\b)\u0001)\u0005"+
		")\u034a\b)\n)\f)\u034d\t)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0003"+
		"+\u0355\b+\u0001+\u0003+\u0358\b+\u0001+\u0003+\u035b\b+\u0001+\u0001"+
		"+\u0003+\u035f\b+\u0001+\u0005+\u0362\b+\n+\f+\u0365\t+\u0001,\u0001,"+
		"\u0001,\u0001,\u0005,\u036b\b,\n,\f,\u036e\t,\u0001-\u0001-\u0001-\u0001"+
		".\u0001.\u0001.\u0001.\u0003.\u0377\b.\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0005/\u037e\b/\n/\f/\u0381\t/\u00010\u00010\u00010\u00010\u00050\u0387"+
		"\b0\n0\f0\u038a\t0\u00011\u00011\u00011\u00011\u00051\u0390\b1\n1\f1\u0393"+
		"\t1\u00012\u00012\u00012\u00012\u00052\u0399\b2\n2\f2\u039c\t2\u00013"+
		"\u00013\u00013\u00013\u00013\u00013\u00053\u03a4\b3\n3\f3\u03a7\t3\u0001"+
		"3\u00033\u03aa\b3\u00014\u00014\u00034\u03ae\b4\u00015\u00015\u00015\u0001"+
		"5\u00016\u00016\u00016\u00017\u00017\u00037\u03b9\b7\u00037\u03bb\b7\u0001"+
		"7\u00017\u00017\u00037\u03c0\b7\u00017\u00017\u00017\u00037\u03c5\b7\u0001"+
		"7\u00017\u00018\u00018\u00038\u03cb\b8\u00019\u00019\u00039\u03cf\b9\u0003"+
		"9\u03d1\b9\u00019\u00019\u00019\u00039\u03d6\b9\u00019\u00019\u00019\u0003"+
		"9\u03db\b9\u00019\u00019\u0001:\u0001:\u0003:\u03e1\b:\u0001;\u0001;\u0003"+
		";\u03e5\b;\u0003;\u03e7\b;\u0001;\u0001;\u0001;\u0003;\u03ec\b;\u0001"+
		";\u0001;\u0001;\u0003;\u03f1\b;\u0001;\u0001;\u0001<\u0001<\u0003<\u03f7"+
		"\b<\u0001=\u0001=\u0003=\u03fb\b=\u0001>\u0001>\u0003>\u03ff\b>\u0001"+
		"?\u0001?\u0003?\u0403\b?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001A\u0003"+
		"A\u040b\bA\u0001A\u0003A\u040e\bA\u0001A\u0003A\u0411\bA\u0001A\u0001"+
		"A\u0003A\u0415\bA\u0001A\u0005A\u0418\bA\nA\fA\u041b\tA\u0001B\u0001B"+
		"\u0001B\u0001B\u0005B\u0421\bB\nB\fB\u0424\tB\u0001C\u0001C\u0001C\u0001"+
		"D\u0001D\u0003D\u042b\bD\u0003D\u042d\bD\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001E\u0001E\u0001F\u0001F\u0001G\u0003G\u043a\bG\u0001G\u0003"+
		"G\u043d\bG\u0001G\u0003G\u0440\bG\u0001G\u0003G\u0443\bG\u0001G\u0003"+
		"G\u0446\bG\u0001G\u0003G\u0449\bG\u0001G\u0005G\u044c\bG\nG\fG\u044f\t"+
		"G\u0001H\u0001H\u0003H\u0453\bH\u0001H\u0001H\u0001H\u0003H\u0458\bH\u0001"+
		"H\u0003H\u045b\bH\u0001H\u0001H\u0001I\u0003I\u0460\bI\u0001I\u0001I\u0001"+
		"I\u0003I\u0465\bI\u0001I\u0001I\u0003I\u0469\bI\u0001I\u0005I\u046c\b"+
		"I\nI\fI\u046f\tI\u0001J\u0001J\u0001J\u0001J\u0003J\u0475\bJ\u0001K\u0001"+
		"K\u0001K\u0003K\u047a\bK\u0001L\u0001L\u0001L\u0001L\u0001M\u0001M\u0001"+
		"M\u0001M\u0001M\u0005M\u0485\bM\nM\fM\u0488\tM\u0001N\u0004N\u048b\bN"+
		"\u000bN\fN\u048c\u0001N\u0003N\u0490\bN\u0001N\u0005N\u0493\bN\nN\fN\u0496"+
		"\tN\u0001N\u0001N\u0005N\u049a\bN\nN\fN\u049d\tN\u0003N\u049f\bN\u0001"+
		"O\u0001O\u0003O\u04a3\bO\u0001O\u0001O\u0003O\u04a7\bO\u0001O\u0001O\u0003"+
		"O\u04ab\bO\u0003O\u04ad\bO\u0003O\u04af\bO\u0001P\u0001P\u0001P\u0001"+
		"P\u0003P\u04b5\bP\u0001Q\u0001Q\u0001Q\u0005Q\u04ba\bQ\nQ\fQ\u04bd\tQ"+
		"\u0001R\u0001R\u0001R\u0003R\u04c2\bR\u0001R\u0001R\u0001S\u0001S\u0001"+
		"S\u0005S\u04c9\bS\nS\fS\u04cc\tS\u0001T\u0001T\u0001T\u0001U\u0001U\u0001"+
		"U\u0001V\u0001V\u0003V\u04d6\bV\u0001W\u0001W\u0001W\u0005W\u04db\bW\n"+
		"W\fW\u04de\tW\u0001X\u0001X\u0001X\u0001Y\u0001Y\u0003Y\u04e5\bY\u0003"+
		"Y\u04e7\bY\u0001Y\u0001Y\u0001Y\u0003Y\u04ec\bY\u0001Y\u0001Y\u0001Y\u0003"+
		"Y\u04f1\bY\u0001Y\u0001Y\u0001Z\u0001Z\u0003Z\u04f7\bZ\u0001[\u0001[\u0003"+
		"[\u04fb\b[\u0001[\u0003[\u04fe\b[\u0001[\u0001[\u0001[\u0001[\u0001[\u0001"+
		"\\\u0001\\\u0001]\u0001]\u0003]\u0509\b]\u0003]\u050b\b]\u0001]\u0001"+
		"]\u0001]\u0001]\u0001]\u0003]\u0512\b]\u0001]\u0001]\u0001]\u0001^\u0001"+
		"^\u0001_\u0001_\u0003_\u051b\b_\u0001`\u0001`\u0003`\u051f\b`\u0003`\u0521"+
		"\b`\u0001`\u0001`\u0001`\u0003`\u0526\b`\u0001`\u0001`\u0001`\u0003`\u052b"+
		"\b`\u0001`\u0001`\u0001a\u0001a\u0003a\u0531\ba\u0001b\u0001b\u0003b\u0535"+
		"\bb\u0001c\u0001c\u0003c\u0539\bc\u0003c\u053b\bc\u0001c\u0001c\u0001"+
		"c\u0003c\u0540\bc\u0001c\u0001c\u0001c\u0003c\u0545\bc\u0001c\u0001c\u0001"+
		"d\u0001d\u0003d\u054b\bd\u0001e\u0001e\u0001e\u0001f\u0001f\u0001g\u0001"+
		"g\u0001h\u0001h\u0001h\u0001h\u0003h\u0558\bh\u0003h\u055a\bh\u0001h\u0001"+
		"h\u0001i\u0001i\u0003i\u0560\bi\u0001j\u0001j\u0003j\u0564\bj\u0001j\u0001"+
		"j\u0001j\u0001k\u0001k\u0003k\u056b\bk\u0001k\u0001k\u0001k\u0001l\u0001"+
		"l\u0001m\u0001m\u0001n\u0001n\u0001n\u0001n\u0003n\u0578\bn\u0001n\u0001"+
		"n\u0001o\u0001o\u0003o\u057e\bo\u0001p\u0001p\u0001p\u0001p\u0001p\u0001"+
		"q\u0001q\u0001q\u0001q\u0001q\u0001r\u0001r\u0001r\u0001r\u0001r\u0001"+
		"s\u0001s\u0001s\u0001s\u0001s\u0001t\u0001t\u0001t\u0001t\u0001t\u0001"+
		"t\u0001u\u0001u\u0001u\u0003u\u059d\bu\u0001u\u0003u\u05a0\bu\u0001u\u0003"+
		"u\u05a3\bu\u0001u\u0001u\u0001v\u0001v\u0003v\u05a9\bv\u0001w\u0003w\u05ac"+
		"\bw\u0001w\u0001w\u0001w\u0003w\u05b1\bw\u0003w\u05b3\bw\u0001w\u0001"+
		"w\u0001w\u0001w\u0001x\u0003x\u05ba\bx\u0001x\u0001x\u0001x\u0001x\u0001"+
		"x\u0001x\u0005x\u05c2\bx\nx\fx\u05c5\tx\u0001x\u0001x\u0001y\u0001y\u0001"+
		"z\u0001z\u0001z\u0003z\u05ce\bz\u0001z\u0001z\u0003z\u05d2\bz\u0001{\u0001"+
		"{\u0001{\u0001{\u0001{\u0001|\u0001|\u0001|\u0001|\u0001|\u0001|\u0003"+
		"|\u05df\b|\u0001|\u0003|\u05e2\b|\u0001|\u0003|\u05e5\b|\u0001|\u0001"+
		"|\u0001|\u0001|\u0003|\u05eb\b|\u0003|\u05ed\b|\u0001}\u0001}\u0001}\u0001"+
		"}\u0001}\u0001~\u0001~\u0001~\u0001~\u0001~\u0001~\u0003~\u05fa\b~\u0001"+
		"~\u0003~\u05fd\b~\u0001~\u0003~\u0600\b~\u0001~\u0001~\u0001~\u0001~\u0003"+
		"~\u0606\b~\u0003~\u0608\b~\u0001\u007f\u0001\u007f\u0001\u007f\u0001\u007f"+
		"\u0001\u007f\u0001\u0080\u0001\u0080\u0001\u0080\u0001\u0080\u0001\u0080"+
		"\u0001\u0081\u0003\u0081\u0615\b\u0081\u0001\u0081\u0003\u0081\u0618\b"+
		"\u0081\u0001\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0001\u0082\u0001"+
		"\u0083\u0001\u0083\u0001\u0083\u0001\u0083\u0001\u0083\u0003\u0083\u0624"+
		"\b\u0083\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0005"+
		"\u0084\u062b\b\u0084\n\u0084\f\u0084\u062e\t\u0084\u0001\u0084\u0003\u0084"+
		"\u0631\b\u0084\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0086"+
		"\u0001\u0086\u0001\u0086\u0001\u0087\u0001\u0087\u0001\u0087\u0001\u0087"+
		"\u0001\u0087\u0001\u0088\u0003\u0088\u0640\b\u0088\u0001\u0088\u0003\u0088"+
		"\u0643\b\u0088\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089\u0001\u0089"+
		"\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008a\u0001\u008b"+
		"\u0001\u008b\u0001\u008b\u0003\u008b\u0652\b\u008b\u0001\u008b\u0001\u008b"+
		"\u0001\u008b\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008c\u0001\u008c"+
		"\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008e"+
		"\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008e\u0001\u008f"+
		"\u0003\u008f\u0668\b\u008f\u0001\u008f\u0003\u008f\u066b\b\u008f\u0001"+
		"\u008f\u0001\u008f\u0003\u008f\u066f\b\u008f\u0001\u008f\u0001\u008f\u0001"+
		"\u008f\u0001\u008f\u0001\u008f\u0003\u008f\u0676\b\u008f\u0001\u008f\u0003"+
		"\u008f\u0679\b\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0001\u008f\u0003"+
		"\u008f\u067f\b\u008f\u0001\u0090\u0001\u0090\u0001\u0091\u0003\u0091\u0684"+
		"\b\u0091\u0001\u0091\u0001\u0091\u0003\u0091\u0688\b\u0091\u0001\u0091"+
		"\u0003\u0091\u068b\b\u0091\u0001\u0091\u0001\u0091\u0001\u0091\u0003\u0091"+
		"\u0690\b\u0091\u0001\u0091\u0001\u0091\u0001\u0091\u0003\u0091\u0695\b"+
		"\u0091\u0001\u0092\u0004\u0092\u0698\b\u0092\u000b\u0092\f\u0092\u0699"+
		"\u0001\u0092\u0003\u0092\u069d\b\u0092\u0001\u0092\u0005\u0092\u06a0\b"+
		"\u0092\n\u0092\f\u0092\u06a3\t\u0092\u0001\u0092\u0001\u0092\u0004\u0092"+
		"\u06a7\b\u0092\u000b\u0092\f\u0092\u06a8\u0003\u0092\u06ab\b\u0092\u0001"+
		"\u0093\u0001\u0093\u0001\u0094\u0003\u0094\u06b0\b\u0094\u0001\u0094\u0001"+
		"\u0094\u0001\u0095\u0001\u0095\u0001\u0095\u0001\u0095\u0003\u0095\u06b8"+
		"\b\u0095\u0001\u0096\u0001\u0096\u0001\u0096\u0004\u0096\u06bd\b\u0096"+
		"\u000b\u0096\f\u0096\u06be\u0001\u0096\u0001\u0096\u0001\u0096\u0001\u0097"+
		"\u0001\u0097\u0001\u0098\u0001\u0098\u0001\u0099\u0001\u0099\u0001\u009a"+
		"\u0001\u009a\u0001\u009a\u0001\u009a\u0001\u009a\u0001\u009b\u0001\u009b"+
		"\u0001\u009b\u0001\u009c\u0001\u009c\u0001\u009c\u0001\u009d\u0001\u009d"+
		"\u0001\u009e\u0005\u009e\u06d8\b\u009e\n\u009e\f\u009e\u06db\t\u009e\u0001"+
		"\u009e\u0001\u009e\u0001\u009e\u0001\u009e\u0001\u009e\u0001\u009e\u0005"+
		"\u009e\u06e3\b\u009e\n\u009e\f\u009e\u06e6\t\u009e\u0003\u009e\u06e8\b"+
		"\u009e\u0001\u009e\u0001\u009e\u0001\u009f\u0001\u009f\u0001\u009f\u0001"+
		"\u009f\u0003\u009f\u06f0\b\u009f\u0003\u009f\u06f2\b\u009f\u0001\u009f"+
		"\u0001\u009f\u0001\u00a0\u0001\u00a0\u0001\u00a1\u0001\u00a1\u0001\u00a1"+
		"\u0001\u00a1\u0001\u00a1\u0001\u00a1\u0005\u00a1\u06fe\b\u00a1\n\u00a1"+
		"\f\u00a1\u0701\t\u00a1\u0001\u00a1\u0003\u00a1\u0704\b\u00a1\u0001\u00a2"+
		"\u0001\u00a2\u0001\u00a3\u0003\u00a3\u0709\b\u00a3\u0001\u00a3\u0003\u00a3"+
		"\u070c\b\u00a3\u0001\u00a3\u0001\u00a3\u0003\u00a3\u0710\b\u00a3\u0001"+
		"\u00a3\u0003\u00a3\u0713\b\u00a3\u0001\u00a3\u0001\u00a3\u0001\u00a4\u0001"+
		"\u00a4\u0001\u00a4\u0001\u00a4\u0001\u00a5\u0001\u00a5\u0001\u00a6\u0001"+
		"\u00a6\u0001\u00a7\u0001\u00a7\u0001\u00a8\u0001\u00a8\u0001\u00a8\u0001"+
		"\u00a8\u0001\u00a8\u0001\u00a8\u0001\u00a8\u0001\u00a8\u0003\u00a8\u0729"+
		"\b\u00a8\u0001\u00a9\u0001\u00a9\u0001\u00aa\u0001\u00aa\u0001\u00aa\u0001"+
		"\u00aa\u0005\u00aa\u0731\b\u00aa\n\u00aa\f\u00aa\u0734\t\u00aa\u0001\u00ab"+
		"\u0001\u00ab\u0001\u00ac\u0001\u00ac\u0001\u00ad\u0001\u00ad\u0001\u00ae"+
		"\u0001\u00ae\u0001\u00ae\u0001\u00ae\u0005\u00ae\u0740\b\u00ae\n\u00ae"+
		"\f\u00ae\u0743\t\u00ae\u0001\u00af\u0001\u00af\u0001\u00b0\u0001\u00b0"+
		"\u0001\u00b1\u0001\u00b1\u0001\u00b2\u0001\u00b2\u0001\u00b2\u0001\u00b2"+
		"\u0001\u00b2\u0001\u00b2\u0001\u00b2\u0003\u00b2\u0752\b\u00b2\u0005\u00b2"+
		"\u0754\b\u00b2\n\u00b2\f\u00b2\u0757\t\u00b2\u0001\u00b3\u0001\u00b3\u0001"+
		"\u00b4\u0001\u00b4\u0001\u00b5\u0001\u00b5\u0001\u00b6\u0001\u00b6\u0001"+
		"\u00b7\u0001\u00b7\u0001\u00b7\u0001\u00b7\u0005\u00b7\u0765\b\u00b7\n"+
		"\u00b7\f\u00b7\u0768\t\u00b7\u0001\u00b8\u0001\u00b8\u0001\u00b9\u0001"+
		"\u00b9\u0001\u00b9\u0001\u00b9\u0001\u00b9\u0001\u00b9\u0001\u00b9\u0003"+
		"\u00b9\u0773\b\u00b9\u0005\u00b9\u0775\b\u00b9\n\u00b9\f\u00b9\u0778\t"+
		"\u00b9\u0001\u00ba\u0001\u00ba\u0001\u00bb\u0001\u00bb\u0001\u00bc\u0001"+
		"\u00bc\u0001\u00bd\u0001\u00bd\u0001\u00be\u0001\u00be\u0001\u00be\u0001"+
		"\u00be\u0005\u00be\u0786\b\u00be\n\u00be\f\u00be\u0789\t\u00be\u0001\u00bf"+
		"\u0001\u00bf\u0001\u00bf\u0001\u00bf\u0003\u00bf\u078f\b\u00bf\u0001\u00c0"+
		"\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0"+
		"\u0003\u00c0\u0798\b\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0"+
		"\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0"+
		"\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0\u0001\u00c0"+
		"\u0003\u00c0\u07aa\b\u00c0\u0001\u00c1\u0001\u00c1\u0001\u00c1\u0003\u00c1"+
		"\u07af\b\u00c1\u0001\u00c2\u0001\u00c2\u0001\u00c3\u0001\u00c3\u0001\u00c4"+
		"\u0001\u00c4\u0001\u00c5\u0001\u00c5\u0001\u00c6\u0001\u00c6\u0001\u00c7"+
		"\u0001\u00c7\u0001\u00c8\u0001\u00c8\u0001\u00c9\u0001\u00c9\u0001\u00ca"+
		"\u0001\u00ca\u0001\u00cb\u0001\u00cb\u0001\u00cc\u0001\u00cc\u0001\u00cd"+
		"\u0001\u00cd\u0001\u00cd\u0001\u00cd\u0005\u00cd\u07cb\b\u00cd\n\u00cd"+
		"\f\u00cd\u07ce\t\u00cd\u0001\u00ce\u0001\u00ce\u0001\u00ce\u0001\u00ce"+
		"\u0003\u00ce\u07d4\b\u00ce\u0001\u00cf\u0001\u00cf\u0001\u00cf\u0003\u00cf"+
		"\u07d9\b\u00cf\u0001\u00d0\u0001\u00d0\u0001\u00d0\u0001\u00d0\u0005\u00d0"+
		"\u07df\b\u00d0\n\u00d0\f\u00d0\u07e2\t\u00d0\u0001\u00d1\u0001\u00d1\u0003"+
		"\u00d1\u07e6\b\u00d1\u0001\u00d2\u0001\u00d2\u0001\u00d2\u0001\u00d2\u0005"+
		"\u00d2\u07ec\b\u00d2\n\u00d2\f\u00d2\u07ef\t\u00d2\u0001\u00d3\u0001\u00d3"+
		"\u0001\u00d3\u0003\u00d3\u07f4\b\u00d3\u0001\u00d4\u0001\u00d4\u0001\u00d4"+
		"\u0001\u00d4\u0003\u00d4\u07fa\b\u00d4\u0001\u00d5\u0001\u00d5\u0003\u00d5"+
		"\u07fe\b\u00d5\u0001\u00d6\u0001\u00d6\u0001\u00d6\u0001\u00d6\u0003\u00d6"+
		"\u0804\b\u00d6\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0001\u00d7\u0003\u00d7"+
		"\u080a\b\u00d7\u0001\u00d8\u0001\u00d8\u0001\u00d8\u0003\u00d8\u080f\b"+
		"\u00d8\u0001\u00d9\u0001\u00d9\u0001\u00d9\u0003\u00d9\u0814\b\u00d9\u0001"+
		"\u00d9\u0001\u00d9\u0001\u00d9\u0001\u00d9\u0001\u00d9\u0001\u00d9\u0001"+
		"\u00d9\u0001\u00d9\u0001\u00d9\u0001\u00d9\u0001\u00d9\u0001\u00d9\u0001"+
		"\u00d9\u0001\u00d9\u0003\u00d9\u0824\b\u00d9\u0001\u00d9\u0001\u00d9\u0001"+
		"\u00d9\u0001\u00d9\u0003\u00d9\u082a\b\u00d9\u0001\u00d9\u0001\u00d9\u0003"+
		"\u00d9\u082e\b\u00d9\u0005\u00d9\u0830\b\u00d9\n\u00d9\f\u00d9\u0833\t"+
		"\u00d9\u0001\u00da\u0001\u00da\u0001\u00db\u0001\u00db\u0001\u00dc\u0001"+
		"\u00dc\u0001\u00dd\u0001\u00dd\u0003\u00dd\u083d\b\u00dd\u0001\u00de\u0001"+
		"\u00de\u0001\u00de\u0001\u00de\u0001\u00de\u0001\u00de\u0001\u00de\u0001"+
		"\u00de\u0001\u00de\u0001\u00de\u0003\u00de\u0849\b\u00de\u0001\u00df\u0001"+
		"\u00df\u0001\u00e0\u0001\u00e0\u0001\u00e1\u0001\u00e1\u0001\u00e2\u0001"+
		"\u00e2\u0001\u00e2\u0001\u00e2\u0003\u00e2\u0855\b\u00e2\u0001\u00e3\u0001"+
		"\u00e3\u0001\u00e4\u0001\u00e4\u0001\u00e5\u0001\u00e5\u0001\u00e5\u0001"+
		"\u00e5\u0001\u00e6\u0001\u00e6\u0001\u00e6\u0001\u00e7\u0001\u00e7\u0001"+
		"\u00e8\u0001\u00e8\u0001\u00e8\u0004\u00e8\u0867\b\u00e8\u000b\u00e8\f"+
		"\u00e8\u0868\u0001\u00e9\u0001\u00e9\u0001\u00ea\u0001\u00ea\u0001\u00ea"+
		"\u0003\u00ea\u0870\b\u00ea\u0001\u00ea\u0001\u00ea\u0001\u00eb\u0001\u00eb"+
		"\u0001\u00eb\u0005\u00eb\u0877\b\u00eb\n\u00eb\f\u00eb\u087a\t\u00eb\u0001"+
		"\u00ec\u0001\u00ec\u0001\u00ed\u0001\u00ed\u0001\u00ee\u0001\u00ee\u0001"+
		"\u00ee\u0005\u00ee\u0883\b\u00ee\n\u00ee\f\u00ee\u0886\t\u00ee\u0001\u00ef"+
		"\u0001\u00ef\u0001\u00f0\u0001\u00f0\u0001\u00f0\u0001\u00f0\u0001\u00f1"+
		"\u0001\u00f1\u0001\u00f2\u0001\u00f2\u0001\u00f3\u0001\u00f3\u0001\u00f3"+
		"\u0003\u00f3\u0895\b\u00f3\u0001\u00f4\u0001\u00f4\u0001\u00f4\u0001\u00f4"+
		"\u0001\u00f4\u0003\u00f4\u089c\b\u00f4\u0001\u00f5\u0001\u00f5\u0001\u00f6"+
		"\u0001\u00f6\u0003\u00f6\u08a2\b\u00f6\u0001\u00f7\u0001\u00f7\u0001\u00f8"+
		"\u0001\u00f8\u0001\u00f9\u0001\u00f9\u0001\u00fa\u0003\u00fa\u08ab\b\u00fa"+
		"\u0001\u00fa\u0001\u00fa\u0001\u00fa\u0003\u00fa\u08b0\b\u00fa\u0001\u00fb"+
		"\u0001\u00fb\u0001\u00fc\u0001\u00fc\u0003\u00fc\u08b6\b\u00fc\u0001\u00fd"+
		"\u0001\u00fd\u0001\u00fd\u0004\u00fd\u08bb\b\u00fd\u000b\u00fd\f\u00fd"+
		"\u08bc\u0001\u00fe\u0003\u00fe\u08c0\b\u00fe\u0001\u00fe\u0001\u00fe\u0001"+
		"\u00ff\u0001\u00ff\u0001\u0100\u0001\u0100\u0001\u0100\u0003\u0100\u08c9"+
		"\b\u0100\u0001\u0101\u0001\u0101\u0001\u0101\u0003\u0101\u08ce\b\u0101"+
		"\u0001\u0101\u0000\u0000\u0102\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee"+
		"\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106"+
		"\u0108\u010a\u010c\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e"+
		"\u0120\u0122\u0124\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136"+
		"\u0138\u013a\u013c\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e"+
		"\u0150\u0152\u0154\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166"+
		"\u0168\u016a\u016c\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e"+
		"\u0180\u0182\u0184\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196"+
		"\u0198\u019a\u019c\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae"+
		"\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6"+
		"\u01c8\u01ca\u01cc\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de"+
		"\u01e0\u01e2\u01e4\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0\u01f2\u01f4\u01f6"+
		"\u01f8\u01fa\u01fc\u01fe\u0200\u0202\u0000\t\u0002\u0000\u0015\u0015q"+
		"q\u0002\u0000\u0016\u0016rr\u0001\u0000#$\u0002\u000011qq\u0002\u0000"+
		"33uu\u0001\u0000vw\u0001\u0000LM\u0002\u0000QQ{{\u0001\u0000\u008e\u008f"+
		"\u092b\u0000\u0204\u0001\u0000\u0000\u0000\u0002\u020a\u0001\u0000\u0000"+
		"\u0000\u0004\u0214\u0001\u0000\u0000\u0000\u0006\u021f\u0001\u0000\u0000"+
		"\u0000\b\u0223\u0001\u0000\u0000\u0000\n\u0227\u0001\u0000\u0000\u0000"+
		"\f\u022c\u0001\u0000\u0000\u0000\u000e\u0249\u0001\u0000\u0000\u0000\u0010"+
		"\u024b\u0001\u0000\u0000\u0000\u0012\u0251\u0001\u0000\u0000\u0000\u0014"+
		"\u0262\u0001\u0000\u0000\u0000\u0016\u026a\u0001\u0000\u0000\u0000\u0018"+
		"\u0278\u0001\u0000\u0000\u0000\u001a\u0281\u0001\u0000\u0000\u0000\u001c"+
		"\u0287\u0001\u0000\u0000\u0000\u001e\u0296\u0001\u0000\u0000\u0000 \u029b"+
		"\u0001\u0000\u0000\u0000\"\u029e\u0001\u0000\u0000\u0000$\u02a2\u0001"+
		"\u0000\u0000\u0000&\u02a4\u0001\u0000\u0000\u0000(\u02a7\u0001\u0000\u0000"+
		"\u0000*\u02aa\u0001\u0000\u0000\u0000,\u02ba\u0001\u0000\u0000\u0000."+
		"\u02c2\u0001\u0000\u0000\u00000\u02c6\u0001\u0000\u0000\u00002\u02c9\u0001"+
		"\u0000\u0000\u00004\u02ce\u0001\u0000\u0000\u00006\u02d3\u0001\u0000\u0000"+
		"\u00008\u02da\u0001\u0000\u0000\u0000:\u02e2\u0001\u0000\u0000\u0000<"+
		"\u02e4\u0001\u0000\u0000\u0000>\u02e6\u0001\u0000\u0000\u0000@\u02e8\u0001"+
		"\u0000\u0000\u0000B\u02ee\u0001\u0000\u0000\u0000D\u030a\u0001\u0000\u0000"+
		"\u0000F\u0316\u0001\u0000\u0000\u0000H\u031b\u0001\u0000\u0000\u0000J"+
		"\u0322\u0001\u0000\u0000\u0000L\u032e\u0001\u0000\u0000\u0000N\u033e\u0001"+
		"\u0000\u0000\u0000P\u0340\u0001\u0000\u0000\u0000R\u0346\u0001\u0000\u0000"+
		"\u0000T\u034e\u0001\u0000\u0000\u0000V\u0354\u0001\u0000\u0000\u0000X"+
		"\u0366\u0001\u0000\u0000\u0000Z\u036f\u0001\u0000\u0000\u0000\\\u0376"+
		"\u0001\u0000\u0000\u0000^\u0378\u0001\u0000\u0000\u0000`\u0382\u0001\u0000"+
		"\u0000\u0000b\u038b\u0001\u0000\u0000\u0000d\u0394\u0001\u0000\u0000\u0000"+
		"f\u03a9\u0001\u0000\u0000\u0000h\u03ad\u0001\u0000\u0000\u0000j\u03af"+
		"\u0001\u0000\u0000\u0000l\u03b3\u0001\u0000\u0000\u0000n\u03ba\u0001\u0000"+
		"\u0000\u0000p\u03ca\u0001\u0000\u0000\u0000r\u03d0\u0001\u0000\u0000\u0000"+
		"t\u03e0\u0001\u0000\u0000\u0000v\u03e6\u0001\u0000\u0000\u0000x\u03f6"+
		"\u0001\u0000\u0000\u0000z\u03fa\u0001\u0000\u0000\u0000|\u03fe\u0001\u0000"+
		"\u0000\u0000~\u0402\u0001\u0000\u0000\u0000\u0080\u0404\u0001\u0000\u0000"+
		"\u0000\u0082\u040a\u0001\u0000\u0000\u0000\u0084\u041c\u0001\u0000\u0000"+
		"\u0000\u0086\u0425\u0001\u0000\u0000\u0000\u0088\u042c\u0001\u0000\u0000"+
		"\u0000\u008a\u0434\u0001\u0000\u0000\u0000\u008c\u0436\u0001\u0000\u0000"+
		"\u0000\u008e\u0439\u0001\u0000\u0000\u0000\u0090\u0450\u0001\u0000\u0000"+
		"\u0000\u0092\u045f\u0001\u0000\u0000\u0000\u0094\u0474\u0001\u0000\u0000"+
		"\u0000\u0096\u0476\u0001\u0000\u0000\u0000\u0098\u047b\u0001\u0000\u0000"+
		"\u0000\u009a\u047f\u0001\u0000\u0000\u0000\u009c\u049e\u0001\u0000\u0000"+
		"\u0000\u009e\u04ae\u0001\u0000\u0000\u0000\u00a0\u04b4\u0001\u0000\u0000"+
		"\u0000\u00a2\u04b6\u0001\u0000\u0000\u0000\u00a4\u04c1\u0001\u0000\u0000"+
		"\u0000\u00a6\u04c5\u0001\u0000\u0000\u0000\u00a8\u04cd\u0001\u0000\u0000"+
		"\u0000\u00aa\u04d0\u0001\u0000\u0000\u0000\u00ac\u04d5\u0001\u0000\u0000"+
		"\u0000\u00ae\u04d7\u0001\u0000\u0000\u0000\u00b0\u04df\u0001\u0000\u0000"+
		"\u0000\u00b2\u04e6\u0001\u0000\u0000\u0000\u00b4\u04f6\u0001\u0000\u0000"+
		"\u0000\u00b6\u04f8\u0001\u0000\u0000\u0000\u00b8\u0504\u0001\u0000\u0000"+
		"\u0000\u00ba\u050a\u0001\u0000\u0000\u0000\u00bc\u0516\u0001\u0000\u0000"+
		"\u0000\u00be\u051a\u0001\u0000\u0000\u0000\u00c0\u0520\u0001\u0000\u0000"+
		"\u0000\u00c2\u0530\u0001\u0000\u0000\u0000\u00c4\u0534\u0001\u0000\u0000"+
		"\u0000\u00c6\u053a\u0001\u0000\u0000\u0000\u00c8\u054a\u0001\u0000\u0000"+
		"\u0000\u00ca\u054c\u0001\u0000\u0000\u0000\u00cc\u054f\u0001\u0000\u0000"+
		"\u0000\u00ce\u0551\u0001\u0000\u0000\u0000\u00d0\u0559\u0001\u0000\u0000"+
		"\u0000\u00d2\u055f\u0001\u0000\u0000\u0000\u00d4\u0561\u0001\u0000\u0000"+
		"\u0000\u00d6\u0568\u0001\u0000\u0000\u0000\u00d8\u056f\u0001\u0000\u0000"+
		"\u0000\u00da\u0571\u0001\u0000\u0000\u0000\u00dc\u0573\u0001\u0000\u0000"+
		"\u0000\u00de\u057d\u0001\u0000\u0000\u0000\u00e0\u057f\u0001\u0000\u0000"+
		"\u0000\u00e2\u0584\u0001\u0000\u0000\u0000\u00e4\u0589\u0001\u0000\u0000"+
		"\u0000\u00e6\u058e\u0001\u0000\u0000\u0000\u00e8\u0593\u0001\u0000\u0000"+
		"\u0000\u00ea\u0599\u0001\u0000\u0000\u0000\u00ec\u05a8\u0001\u0000\u0000"+
		"\u0000\u00ee\u05b2\u0001\u0000\u0000\u0000\u00f0\u05b9\u0001\u0000\u0000"+
		"\u0000\u00f2\u05c8\u0001\u0000\u0000\u0000\u00f4\u05cd\u0001\u0000\u0000"+
		"\u0000\u00f6\u05d3\u0001\u0000\u0000\u0000\u00f8\u05ec\u0001\u0000\u0000"+
		"\u0000\u00fa\u05ee\u0001\u0000\u0000\u0000\u00fc\u0607\u0001\u0000\u0000"+
		"\u0000\u00fe\u0609\u0001\u0000\u0000\u0000\u0100\u060e\u0001\u0000\u0000"+
		"\u0000\u0102\u0614\u0001\u0000\u0000\u0000\u0104\u0619\u0001\u0000\u0000"+
		"\u0000\u0106\u0623\u0001\u0000\u0000\u0000\u0108\u062c\u0001\u0000\u0000"+
		"\u0000\u010a\u0632\u0001\u0000\u0000\u0000\u010c\u0636\u0001\u0000\u0000"+
		"\u0000\u010e\u0639\u0001\u0000\u0000\u0000\u0110\u063f\u0001\u0000\u0000"+
		"\u0000\u0112\u0644\u0001\u0000\u0000\u0000\u0114\u0649\u0001\u0000\u0000"+
		"\u0000\u0116\u064e\u0001\u0000\u0000\u0000\u0118\u0656\u0001\u0000\u0000"+
		"\u0000\u011a\u065b\u0001\u0000\u0000\u0000\u011c\u0660\u0001\u0000\u0000"+
		"\u0000\u011e\u067e\u0001\u0000\u0000\u0000\u0120\u0680\u0001\u0000\u0000"+
		"\u0000\u0122\u0694\u0001\u0000\u0000\u0000\u0124\u06aa\u0001\u0000\u0000"+
		"\u0000\u0126\u06ac\u0001\u0000\u0000\u0000\u0128\u06af\u0001\u0000\u0000"+
		"\u0000\u012a\u06b7\u0001\u0000\u0000\u0000\u012c\u06bc\u0001\u0000\u0000"+
		"\u0000\u012e\u06c3\u0001\u0000\u0000\u0000\u0130\u06c5\u0001\u0000\u0000"+
		"\u0000\u0132\u06c7\u0001\u0000\u0000\u0000\u0134\u06c9\u0001\u0000\u0000"+
		"\u0000\u0136\u06ce\u0001\u0000\u0000\u0000\u0138\u06d1\u0001\u0000\u0000"+
		"\u0000\u013a\u06d4\u0001\u0000\u0000\u0000\u013c\u06d9\u0001\u0000\u0000"+
		"\u0000\u013e\u06f1\u0001\u0000\u0000\u0000\u0140\u06f5\u0001\u0000\u0000"+
		"\u0000\u0142\u0703\u0001\u0000\u0000\u0000\u0144\u0705\u0001\u0000\u0000"+
		"\u0000\u0146\u0708\u0001\u0000\u0000\u0000\u0148\u0716\u0001\u0000\u0000"+
		"\u0000\u014a\u071a\u0001\u0000\u0000\u0000\u014c\u071c\u0001\u0000\u0000"+
		"\u0000\u014e\u071e\u0001\u0000\u0000\u0000\u0150\u0728\u0001\u0000\u0000"+
		"\u0000\u0152\u072a\u0001\u0000\u0000\u0000\u0154\u072c\u0001\u0000\u0000"+
		"\u0000\u0156\u0735\u0001\u0000\u0000\u0000\u0158\u0737\u0001\u0000\u0000"+
		"\u0000\u015a\u0739\u0001\u0000\u0000\u0000\u015c\u073b\u0001\u0000\u0000"+
		"\u0000\u015e\u0744\u0001\u0000\u0000\u0000\u0160\u0746\u0001\u0000\u0000"+
		"\u0000\u0162\u0748\u0001\u0000\u0000\u0000\u0164\u074a\u0001\u0000\u0000"+
		"\u0000\u0166\u0758\u0001\u0000\u0000\u0000\u0168\u075a\u0001\u0000\u0000"+
		"\u0000\u016a\u075c\u0001\u0000\u0000\u0000\u016c\u075e\u0001\u0000\u0000"+
		"\u0000\u016e\u0760\u0001\u0000\u0000\u0000\u0170\u0769\u0001\u0000\u0000"+
		"\u0000\u0172\u076b\u0001\u0000\u0000\u0000\u0174\u0779\u0001\u0000\u0000"+
		"\u0000\u0176\u077b\u0001\u0000\u0000\u0000\u0178\u077d\u0001\u0000\u0000"+
		"\u0000\u017a\u077f\u0001\u0000\u0000\u0000\u017c\u0781\u0001\u0000\u0000"+
		"\u0000\u017e\u078e\u0001\u0000\u0000\u0000\u0180\u07a9\u0001\u0000\u0000"+
		"\u0000\u0182\u07ae\u0001\u0000\u0000\u0000\u0184\u07b0\u0001\u0000\u0000"+
		"\u0000\u0186\u07b2\u0001\u0000\u0000\u0000\u0188\u07b4\u0001\u0000\u0000"+
		"\u0000\u018a\u07b6\u0001\u0000\u0000\u0000\u018c\u07b8\u0001\u0000\u0000"+
		"\u0000\u018e\u07ba\u0001\u0000\u0000\u0000\u0190\u07bc\u0001\u0000\u0000"+
		"\u0000\u0192\u07be\u0001\u0000\u0000\u0000\u0194\u07c0\u0001\u0000\u0000"+
		"\u0000\u0196\u07c2\u0001\u0000\u0000\u0000\u0198\u07c4\u0001\u0000\u0000"+
		"\u0000\u019a\u07c6\u0001\u0000\u0000\u0000\u019c\u07d3\u0001\u0000\u0000"+
		"\u0000\u019e\u07d5\u0001\u0000\u0000\u0000\u01a0\u07da\u0001\u0000\u0000"+
		"\u0000\u01a2\u07e5\u0001\u0000\u0000\u0000\u01a4\u07e7\u0001\u0000\u0000"+
		"\u0000\u01a6\u07f3\u0001\u0000\u0000\u0000\u01a8\u07f5\u0001\u0000\u0000"+
		"\u0000\u01aa\u07fd\u0001\u0000\u0000\u0000\u01ac\u0803\u0001\u0000\u0000"+
		"\u0000\u01ae\u0809\u0001\u0000\u0000\u0000\u01b0\u080e\u0001\u0000\u0000"+
		"\u0000\u01b2\u0810\u0001\u0000\u0000\u0000\u01b4\u0834\u0001\u0000\u0000"+
		"\u0000\u01b6\u0836\u0001\u0000\u0000\u0000\u01b8\u0838\u0001\u0000\u0000"+
		"\u0000\u01ba\u083c\u0001\u0000\u0000\u0000\u01bc\u0848\u0001\u0000\u0000"+
		"\u0000\u01be\u084a\u0001\u0000\u0000\u0000\u01c0\u084c\u0001\u0000\u0000"+
		"\u0000\u01c2\u084e\u0001\u0000\u0000\u0000\u01c4\u0850\u0001\u0000\u0000"+
		"\u0000\u01c6\u0856\u0001\u0000\u0000\u0000\u01c8\u0858\u0001\u0000\u0000"+
		"\u0000\u01ca\u085a\u0001\u0000\u0000\u0000\u01cc\u085e\u0001\u0000\u0000"+
		"\u0000\u01ce\u0861\u0001\u0000\u0000\u0000\u01d0\u0863\u0001\u0000\u0000"+
		"\u0000\u01d2\u086a\u0001\u0000\u0000\u0000\u01d4\u086c\u0001\u0000\u0000"+
		"\u0000\u01d6\u0873\u0001\u0000\u0000\u0000\u01d8\u087b\u0001\u0000\u0000"+
		"\u0000\u01da\u087d\u0001\u0000\u0000\u0000\u01dc\u087f\u0001\u0000\u0000"+
		"\u0000\u01de\u0887\u0001\u0000\u0000\u0000\u01e0\u0889\u0001\u0000\u0000"+
		"\u0000\u01e2\u088d\u0001\u0000\u0000\u0000\u01e4\u088f\u0001\u0000\u0000"+
		"\u0000\u01e6\u0894\u0001\u0000\u0000\u0000\u01e8\u089b\u0001\u0000\u0000"+
		"\u0000\u01ea\u089d\u0001\u0000\u0000\u0000\u01ec\u08a1\u0001\u0000\u0000"+
		"\u0000\u01ee\u08a3\u0001\u0000\u0000\u0000\u01f0\u08a5\u0001\u0000\u0000"+
		"\u0000\u01f2\u08a7\u0001\u0000\u0000\u0000\u01f4\u08af\u0001\u0000\u0000"+
		"\u0000\u01f6\u08b1\u0001\u0000\u0000\u0000\u01f8\u08b5\u0001\u0000\u0000"+
		"\u0000\u01fa\u08ba\u0001\u0000\u0000\u0000\u01fc\u08bf\u0001\u0000\u0000"+
		"\u0000\u01fe\u08c3\u0001\u0000\u0000\u0000\u0200\u08c8\u0001\u0000\u0000"+
		"\u0000\u0202\u08cd\u0001\u0000\u0000\u0000\u0204\u0205\u0003\u0002\u0001"+
		"\u0000\u0205\u0206\u0005\u0000\u0000\u0001\u0206\u0001\u0001\u0000\u0000"+
		"\u0000\u0207\u0209\u0003 \u0010\u0000\u0208\u0207\u0001\u0000\u0000\u0000"+
		"\u0209\u020c\u0001\u0000\u0000\u0000\u020a\u0208\u0001\u0000\u0000\u0000"+
		"\u020a\u020b\u0001\u0000\u0000\u0000\u020b\u0003\u0001\u0000\u0000\u0000"+
		"\u020c\u020a\u0001\u0000\u0000\u0000\u020d\u020e\u0005d\u0000\u0000\u020e"+
		"\u020f\u0003\u01f8\u00fc\u0000\u020f\u0211\u0005e\u0000\u0000\u0210\u0212"+
		"\u0003\u01f8\u00fc\u0000\u0211\u0210\u0001\u0000\u0000\u0000\u0211\u0212"+
		"\u0001\u0000\u0000\u0000\u0212\u0215\u0001\u0000\u0000\u0000\u0213\u0215"+
		"\u0003\u01f8\u00fc\u0000\u0214\u020d\u0001\u0000\u0000\u0000\u0214\u0213"+
		"\u0001\u0000\u0000\u0000\u0215\u0005\u0001\u0000\u0000\u0000\u0216\u0220"+
		"\u0005l\u0000\u0000\u0217\u021b\u0005f\u0000\u0000\u0218\u021a\u0003\b"+
		"\u0004\u0000\u0219\u0218\u0001\u0000\u0000\u0000\u021a\u021d\u0001\u0000"+
		"\u0000\u0000\u021b\u0219\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000"+
		"\u0000\u0000\u021c\u021e\u0001\u0000\u0000\u0000\u021d\u021b\u0001\u0000"+
		"\u0000\u0000\u021e\u0220\u0005g\u0000\u0000\u021f\u0216\u0001\u0000\u0000"+
		"\u0000\u021f\u0217\u0001\u0000\u0000\u0000\u0220\u0007\u0001\u0000\u0000"+
		"\u0000\u0221\u0224\u0003\n\u0005\u0000\u0222\u0224\u0003\u0010\b\u0000"+
		"\u0223\u0221\u0001\u0000\u0000\u0000\u0223\u0222\u0001\u0000\u0000\u0000"+
		"\u0224\t\u0001\u0000\u0000\u0000\u0225\u0228\u0003D\"\u0000\u0226\u0228"+
		"\u0003F#\u0000\u0227\u0225\u0001\u0000\u0000\u0000\u0227\u0226\u0001\u0000"+
		"\u0000\u0000\u0228\u000b\u0001\u0000\u0000\u0000\u0229\u022b\u0003\u0136"+
		"\u009b\u0000\u022a\u0229\u0001\u0000\u0000\u0000\u022b\u022e\u0001\u0000"+
		"\u0000\u0000\u022c\u022a\u0001\u0000\u0000\u0000\u022c\u022d\u0001\u0000"+
		"\u0000\u0000\u022d\u022f\u0001\u0000\u0000\u0000\u022e\u022c\u0001\u0000"+
		"\u0000\u0000\u022f\u0234\u0005\u0001\u0000\u0000\u0230\u0232\u0003\u0004"+
		"\u0002\u0000\u0231\u0230\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000"+
		"\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000\u0233\u0235\u0005\u0002"+
		"\u0000\u0000\u0234\u0231\u0001\u0000\u0000\u0000\u0234\u0235\u0001\u0000"+
		"\u0000\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236\u023b\u0003\u01fc"+
		"\u00fe\u0000\u0237\u0238\u0005m\u0000\u0000\u0238\u023a\u0003\u01fc\u00fe"+
		"\u0000\u0239\u0237\u0001\u0000\u0000\u0000\u023a\u023d\u0001\u0000\u0000"+
		"\u0000\u023b\u0239\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000"+
		"\u0000\u023c\u023e\u0001\u0000\u0000\u0000\u023d\u023b\u0001\u0000\u0000"+
		"\u0000\u023e\u023f\u0005\u0003\u0000\u0000\u023f\u0244\u0003\u01fc\u00fe"+
		"\u0000\u0240\u0241\u0005m\u0000\u0000\u0241\u0243\u0003\u01fc\u00fe\u0000"+
		"\u0242\u0240\u0001\u0000\u0000\u0000\u0243\u0246\u0001\u0000\u0000\u0000"+
		"\u0244\u0242\u0001\u0000\u0000\u0000\u0244\u0245\u0001\u0000\u0000\u0000"+
		"\u0245\u0247\u0001\u0000\u0000\u0000\u0246\u0244\u0001\u0000\u0000\u0000"+
		"\u0247\u0248\u0003\u0006\u0003\u0000\u0248\r\u0001\u0000\u0000\u0000\u0249"+
		"\u024a\u0003\u01fc\u00fe\u0000\u024a\u000f\u0001\u0000\u0000\u0000\u024b"+
		"\u024c\u0003\u0012\t\u0000\u024c\u0011\u0001\u0000\u0000\u0000\u024d\u0252"+
		"\u0003\u0014\n\u0000\u024e\u0252\u0003\u0016\u000b\u0000\u024f\u0252\u0003"+
		"\u0018\f\u0000\u0250\u0252\u0003\u013c\u009e\u0000\u0251\u024d\u0001\u0000"+
		"\u0000\u0000\u0251\u024e\u0001\u0000\u0000\u0000\u0251\u024f\u0001\u0000"+
		"\u0000\u0000\u0251\u0250\u0001\u0000\u0000\u0000\u0252\u0013\u0001\u0000"+
		"\u0000\u0000\u0253\u0255\u0005\u0004\u0000\u0000\u0254\u0256\u0003\u0004"+
		"\u0002\u0000\u0255\u0254\u0001\u0000\u0000\u0000\u0255\u0256\u0001\u0000"+
		"\u0000\u0000\u0256\u0260\u0001\u0000\u0000\u0000\u0257\u0258\u0005\u0005"+
		"\u0000\u0000\u0258\u025d\u0003\u000e\u0007\u0000\u0259\u025a\u0005m\u0000"+
		"\u0000\u025a\u025c\u0003\u000e\u0007\u0000\u025b\u0259\u0001\u0000\u0000"+
		"\u0000\u025c\u025f\u0001\u0000\u0000\u0000\u025d\u025b\u0001\u0000\u0000"+
		"\u0000\u025d\u025e\u0001\u0000\u0000\u0000\u025e\u0261\u0001\u0000\u0000"+
		"\u0000\u025f\u025d\u0001\u0000\u0000\u0000\u0260\u0257\u0001\u0000\u0000"+
		"\u0000\u0260\u0261\u0001\u0000\u0000\u0000\u0261\u0263\u0001\u0000\u0000"+
		"\u0000\u0262\u0253\u0001\u0000\u0000\u0000\u0262\u0263\u0001\u0000\u0000"+
		"\u0000\u0263\u0266\u0001\u0000\u0000\u0000\u0264\u0265\u0005\u0006\u0000"+
		"\u0000\u0265\u0267\u0005\u0092\u0000\u0000\u0266\u0264\u0001\u0000\u0000"+
		"\u0000\u0266\u0267\u0001\u0000\u0000\u0000\u0267\u0268\u0001\u0000\u0000"+
		"\u0000\u0268\u0269\u0005\u0093\u0000\u0000\u0269\u0015\u0001\u0000\u0000"+
		"\u0000\u026a\u026c\u0005\u0007\u0000\u0000\u026b\u026d\u0003\u0004\u0002"+
		"\u0000\u026c\u026b\u0001\u0000\u0000\u0000\u026c\u026d\u0001\u0000\u0000"+
		"\u0000\u026d\u0270\u0001\u0000\u0000\u0000\u026e\u026f\u0005\u0006\u0000"+
		"\u0000\u026f\u0271\u0005\u0092\u0000\u0000\u0270\u026e\u0001\u0000\u0000"+
		"\u0000\u0270\u0271\u0001\u0000\u0000\u0000\u0271\u0272\u0001\u0000\u0000"+
		"\u0000\u0272\u0273\u0005\u0093\u0000\u0000\u0273\u0017\u0001\u0000\u0000"+
		"\u0000\u0274\u0276\u0005\b\u0000\u0000\u0275\u0277\u0003\u0004\u0002\u0000"+
		"\u0276\u0275\u0001\u0000\u0000\u0000\u0276\u0277\u0001\u0000\u0000\u0000"+
		"\u0277\u0279\u0001\u0000\u0000\u0000\u0278\u0274\u0001\u0000\u0000\u0000"+
		"\u0278\u0279\u0001\u0000\u0000\u0000\u0279\u027a\u0001\u0000\u0000\u0000"+
		"\u027a\u027b\u0005\t\u0000\u0000\u027b\u027c\u0005\u0092\u0000\u0000\u027c"+
		"\u027d\u0005\u0093\u0000\u0000\u027d\u0019\u0001\u0000\u0000\u0000\u027e"+
		"\u0280\u0003\u0138\u009c\u0000\u027f\u027e\u0001\u0000\u0000\u0000\u0280"+
		"\u0283\u0001\u0000\u0000\u0000\u0281\u027f\u0001\u0000\u0000\u0000\u0281"+
		"\u0282\u0001\u0000\u0000\u0000\u0282\u0284\u0001\u0000\u0000\u0000\u0283"+
		"\u0281\u0001\u0000\u0000\u0000\u0284\u0285\u0003\u001c\u000e\u0000\u0285"+
		"\u0286\u0003\u001e\u000f\u0000\u0286\u001b\u0001\u0000\u0000\u0000\u0287"+
		"\u0289\u0005\n\u0000\u0000\u0288\u028a\u0003\u0004\u0002\u0000\u0289\u0288"+
		"\u0001\u0000\u0000\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u001d"+
		"\u0001\u0000\u0000\u0000\u028b\u0297\u0005l\u0000\u0000\u028c\u0292\u0005"+
		"f\u0000\u0000\u028d\u0291\u0003$\u0012\u0000\u028e\u0291\u0003*\u0015"+
		"\u0000\u028f\u0291\u0003.\u0017\u0000\u0290\u028d\u0001\u0000\u0000\u0000"+
		"\u0290\u028e\u0001\u0000\u0000\u0000\u0290\u028f\u0001\u0000\u0000\u0000"+
		"\u0291\u0294\u0001\u0000\u0000\u0000\u0292\u0290\u0001\u0000\u0000\u0000"+
		"\u0292\u0293\u0001\u0000\u0000\u0000\u0293\u0295\u0001\u0000\u0000\u0000"+
		"\u0294\u0292\u0001\u0000\u0000\u0000\u0295\u0297\u0005g\u0000\u0000\u0296"+
		"\u028b\u0001\u0000\u0000\u0000\u0296\u028c\u0001\u0000\u0000\u0000\u0297"+
		"\u001f\u0001\u0000\u0000\u0000\u0298\u029c\u0003$\u0012\u0000\u0299\u029c"+
		"\u0003*\u0015\u0000\u029a\u029c\u0003.\u0017\u0000\u029b\u0298\u0001\u0000"+
		"\u0000\u0000\u029b\u0299\u0001\u0000\u0000\u0000\u029b\u029a\u0001\u0000"+
		"\u0000\u0000\u029c!\u0001\u0000\u0000\u0000\u029d\u029f\u0003\u0200\u0100"+
		"\u0000\u029e\u029d\u0001\u0000\u0000\u0000\u029e\u029f\u0001\u0000\u0000"+
		"\u0000\u029f#\u0001\u0000\u0000\u0000\u02a0\u02a3\u0003&\u0013\u0000\u02a1"+
		"\u02a3\u0003(\u0014\u0000\u02a2\u02a0\u0001\u0000\u0000\u0000\u02a2\u02a1"+
		"\u0001\u0000\u0000\u0000\u02a3%\u0001\u0000\u0000\u0000\u02a4\u02a5\u0003"+
		"\"\u0011\u0000\u02a5\u02a6\u0003B!\u0000\u02a6\'\u0001\u0000\u0000\u0000"+
		"\u02a7\u02a8\u0003\"\u0011\u0000\u02a8\u02a9\u0003F#\u0000\u02a9)\u0001"+
		"\u0000\u0000\u0000\u02aa\u02ab\u0003\"\u0011\u0000\u02ab\u02b0\u0005\u000b"+
		"\u0000\u0000\u02ac\u02ad\u0005d\u0000\u0000\u02ad\u02ae\u0003\u01f8\u00fc"+
		"\u0000\u02ae\u02af\u0005e\u0000\u0000\u02af\u02b1\u0001\u0000\u0000\u0000"+
		"\u02b0\u02ac\u0001\u0000\u0000\u0000\u02b0\u02b1\u0001\u0000\u0000\u0000"+
		"\u02b1\u02b3\u0001\u0000\u0000\u0000\u02b2\u02b4\u0003\u01f8\u00fc\u0000"+
		"\u02b3\u02b2\u0001\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000"+
		"\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b6\u0005\f\u0000\u0000\u02b6"+
		"\u02b7\u0003\u01fc\u00fe\u0000\u02b7\u02b8\u0003\u0006\u0003\u0000\u02b8"+
		"+\u0001\u0000\u0000\u0000\u02b9\u02bb\u0003\u0200\u0100\u0000\u02ba\u02b9"+
		"\u0001\u0000\u0000\u0000\u02ba\u02bb\u0001\u0000\u0000\u0000\u02bb\u02bc"+
		"\u0001\u0000\u0000\u0000\u02bc\u02be\u0005\r\u0000\u0000\u02bd\u02bf\u0005"+
		"\u000e\u0000\u0000\u02be\u02bd\u0001\u0000\u0000\u0000\u02be\u02bf\u0001"+
		"\u0000\u0000\u0000\u02bf-\u0001\u0000\u0000\u0000\u02c0\u02c3\u00030\u0018"+
		"\u0000\u02c1\u02c3\u00034\u001a\u0000\u02c2\u02c0\u0001\u0000\u0000\u0000"+
		"\u02c2\u02c1\u0001\u0000\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000\u0000"+
		"\u02c4\u02c5\u0003\u0006\u0003\u0000\u02c5/\u0001\u0000\u0000\u0000\u02c6"+
		"\u02c7\u0003,\u0016\u0000\u02c7\u02c8\u00032\u0019\u0000\u02c81\u0001"+
		"\u0000\u0000\u0000\u02c9\u02cc\u0003\u01fc\u00fe\u0000\u02ca\u02cb\u0005"+
		"n\u0000\u0000\u02cb\u02cd\u0005o\u0000\u0000\u02cc\u02ca\u0001\u0000\u0000"+
		"\u0000\u02cc\u02cd\u0001\u0000\u0000\u0000\u02cd3\u0001\u0000\u0000\u0000"+
		"\u02ce\u02d1\u0003,\u0016\u0000\u02cf\u02d2\u00036\u001b\u0000\u02d0\u02d2"+
		"\u00038\u001c\u0000\u02d1\u02cf\u0001\u0000\u0000\u0000\u02d1\u02d0\u0001"+
		"\u0000\u0000\u0000\u02d25\u0001\u0000\u0000\u0000\u02d3\u02d4\u0003\u01fc"+
		"\u00fe\u0000\u02d4\u02d5\u0005n\u0000\u0000\u02d5\u02d8\u0005p\u0000\u0000"+
		"\u02d6\u02d7\u0005n\u0000\u0000\u02d7\u02d9\u0005o\u0000\u0000\u02d8\u02d6"+
		"\u0001\u0000\u0000\u0000\u02d8\u02d9\u0001\u0000\u0000\u0000\u02d97\u0001"+
		"\u0000\u0000\u0000\u02da\u02dc\u0003:\u001d\u0000\u02db\u02dd\u0003@ "+
		"\u0000\u02dc\u02db\u0001\u0000\u0000\u0000\u02dd\u02de\u0001\u0000\u0000"+
		"\u0000\u02de\u02dc\u0001\u0000\u0000\u0000\u02de\u02df\u0001\u0000\u0000"+
		"\u0000\u02df9\u0001\u0000\u0000\u0000\u02e0\u02e3\u0003<\u001e\u0000\u02e1"+
		"\u02e3\u0003>\u001f\u0000\u02e2\u02e0\u0001\u0000\u0000\u0000\u02e2\u02e1"+
		"\u0001\u0000\u0000\u0000\u02e3;\u0001\u0000\u0000\u0000\u02e4\u02e5\u0003"+
		"2\u0019\u0000\u02e5=\u0001\u0000\u0000\u0000\u02e6\u02e7\u00036\u001b"+
		"\u0000\u02e7?\u0001\u0000\u0000\u0000\u02e8\u02e9\u0003\u01fe\u00ff\u0000"+
		"\u02e9\u02ea\u0003\u014c\u00a6\u0000\u02ea\u02eb\u0005h\u0000\u0000\u02eb"+
		"A\u0001\u0000\u0000\u0000\u02ec\u02ef\u0003\u0012\t\u0000\u02ed\u02ef"+
		"\u0003D\"\u0000\u02ee\u02ec\u0001\u0000\u0000\u0000\u02ee\u02ed\u0001"+
		"\u0000\u0000\u0000\u02efC\u0001\u0000\u0000\u0000\u02f0\u030b\u0003\f"+
		"\u0006\u0000\u02f1\u030b\u0003\u001a\r\u0000\u02f2\u030b\u0003H$\u0000"+
		"\u02f3\u030b\u0003J%\u0000\u02f4\u030b\u0003\u00d2i\u0000\u02f5\u030b"+
		"\u0003T*\u0000\u02f6\u030b\u0003\u0080@\u0000\u02f7\u030b\u0003\u00e2"+
		"q\u0000\u02f8\u030b\u0003\u00e4r\u0000\u02f9\u030b\u0003\u0134\u009a\u0000"+
		"\u02fa\u030b\u0003\u00e0p\u0000\u02fb\u030b\u0003\u00e6s\u0000\u02fc\u030b"+
		"\u0003\u00e8t\u0000\u02fd\u030b\u0003\u0118\u008c\u0000\u02fe\u030b\u0003"+
		"\u00fe\u007f\u0000\u02ff\u030b\u0003\u0104\u0082\u0000\u0300\u030b\u0003"+
		"\u0112\u0089\u0000\u0301\u030b\u0003n7\u0000\u0302\u030b\u0003r9\u0000"+
		"\u0303\u030b\u0003\u00ba]\u0000\u0304\u030b\u0003\u0088D\u0000\u0305\u030b"+
		"\u0003v;\u0000\u0306\u030b\u0003\u00b2Y\u0000\u0307\u030b\u0003\u00c0"+
		"`\u0000\u0308\u030b\u0003\u00c6c\u0000\u0309\u030b\u0003\u00b6[\u0000"+
		"\u030a\u02f0\u0001\u0000\u0000\u0000\u030a\u02f1\u0001\u0000\u0000\u0000"+
		"\u030a\u02f2\u0001\u0000\u0000\u0000\u030a\u02f3\u0001\u0000\u0000\u0000"+
		"\u030a\u02f4\u0001\u0000\u0000\u0000\u030a\u02f5\u0001\u0000\u0000\u0000"+
		"\u030a\u02f6\u0001\u0000\u0000\u0000\u030a\u02f7\u0001\u0000\u0000\u0000"+
		"\u030a\u02f8\u0001\u0000\u0000\u0000\u030a\u02f9\u0001\u0000\u0000\u0000"+
		"\u030a\u02fa\u0001\u0000\u0000\u0000\u030a\u02fb\u0001\u0000\u0000\u0000"+
		"\u030a\u02fc\u0001\u0000\u0000\u0000\u030a\u02fd\u0001\u0000\u0000\u0000"+
		"\u030a\u02fe\u0001\u0000\u0000\u0000\u030a\u02ff\u0001\u0000\u0000\u0000"+
		"\u030a\u0300\u0001\u0000\u0000\u0000\u030a\u0301\u0001\u0000\u0000\u0000"+
		"\u030a\u0302\u0001\u0000\u0000\u0000\u030a\u0303\u0001\u0000\u0000\u0000"+
		"\u030a\u0304\u0001\u0000\u0000\u0000\u030a\u0305\u0001\u0000\u0000\u0000"+
		"\u030a\u0306\u0001\u0000\u0000\u0000\u030a\u0307\u0001\u0000\u0000\u0000"+
		"\u030a\u0308\u0001\u0000\u0000\u0000\u030a\u0309\u0001\u0000\u0000\u0000"+
		"\u030bE\u0001\u0000\u0000\u0000\u030c\u0317\u0003\u0090H\u0000\u030d\u0317"+
		"\u0003\u0100\u0080\u0000\u030e\u0317\u0003\u010e\u0087\u0000\u030f\u0317"+
		"\u0003\u0114\u008a\u0000\u0310\u0317\u0003\u0116\u008b\u0000\u0311\u0317"+
		"\u0003\u00eau\u0000\u0312\u0317\u0003\u00f6{\u0000\u0313\u0317\u0003\u00fa"+
		"}\u0000\u0314\u0317\u0003\u011a\u008d\u0000\u0315\u0317\u0003\u011c\u008e"+
		"\u0000\u0316\u030c\u0001\u0000\u0000\u0000\u0316\u030d\u0001\u0000\u0000"+
		"\u0000\u0316\u030e\u0001\u0000\u0000\u0000\u0316\u030f\u0001\u0000\u0000"+
		"\u0000\u0316\u0310\u0001\u0000\u0000\u0000\u0316\u0311\u0001\u0000\u0000"+
		"\u0000\u0316\u0312\u0001\u0000\u0000\u0000\u0316\u0313\u0001\u0000\u0000"+
		"\u0000\u0316\u0314\u0001\u0000\u0000\u0000\u0316\u0315\u0001\u0000\u0000"+
		"\u0000\u0317G\u0001\u0000\u0000\u0000\u0318\u031a\u0003\u0138\u009c\u0000"+
		"\u0319\u0318\u0001\u0000\u0000\u0000\u031a\u031d\u0001\u0000\u0000\u0000"+
		"\u031b\u0319\u0001\u0000\u0000\u0000\u031b\u031c\u0001\u0000\u0000\u0000"+
		"\u031c\u031e\u0001\u0000\u0000\u0000\u031d\u031b\u0001\u0000\u0000\u0000"+
		"\u031e\u031f\u0003L&\u0000\u031f\u0320\u0003N\'\u0000\u0320I\u0001\u0000"+
		"\u0000\u0000\u0321\u0323\u0005\u000f\u0000\u0000\u0322\u0321\u0001\u0000"+
		"\u0000\u0000\u0322\u0323\u0001\u0000\u0000\u0000\u0323\u0324\u0001\u0000"+
		"\u0000\u0000\u0324\u0328\u0005\u0010\u0000\u0000\u0325\u0327\u0003\u0138"+
		"\u009c\u0000\u0326\u0325\u0001\u0000\u0000\u0000\u0327\u032a\u0001\u0000"+
		"\u0000\u0000\u0328\u0326\u0001\u0000\u0000\u0000\u0328\u0329\u0001\u0000"+
		"\u0000\u0000\u0329\u032b\u0001\u0000\u0000\u0000\u032a\u0328\u0001\u0000"+
		"\u0000\u0000\u032b\u032c\u0003L&\u0000\u032c\u032d\u0003N\'\u0000\u032d"+
		"K\u0001\u0000\u0000\u0000\u032e\u0330\u0005\u0011\u0000\u0000\u032f\u0331"+
		"\u0003\u0004\u0002\u0000\u0330\u032f\u0001\u0000\u0000\u0000\u0330\u0331"+
		"\u0001\u0000\u0000\u0000\u0331M\u0001\u0000\u0000\u0000\u0332\u033f\u0005"+
		"l\u0000\u0000\u0333\u033a\u0005f\u0000\u0000\u0334\u0339\u0003$\u0012"+
		"\u0000\u0335\u0339\u0003P(\u0000\u0336\u0339\u0003*\u0015\u0000\u0337"+
		"\u0339\u0003.\u0017\u0000\u0338\u0334\u0001\u0000\u0000\u0000\u0338\u0335"+
		"\u0001\u0000\u0000\u0000\u0338\u0336\u0001\u0000\u0000\u0000\u0338\u0337"+
		"\u0001\u0000\u0000\u0000\u0339\u033c\u0001\u0000\u0000\u0000\u033a\u0338"+
		"\u0001\u0000\u0000\u0000\u033a\u033b\u0001\u0000\u0000\u0000\u033b\u033d"+
		"\u0001\u0000\u0000\u0000\u033c\u033a\u0001\u0000\u0000\u0000\u033d\u033f"+
		"\u0005g\u0000\u0000\u033e\u0332\u0001\u0000\u0000\u0000\u033e\u0333\u0001"+
		"\u0000\u0000\u0000\u033fO\u0001\u0000\u0000\u0000\u0340\u0341\u0003\""+
		"\u0011\u0000\u0341\u0342\u0005\u0012\u0000\u0000\u0342\u0343\u0003\u014c"+
		"\u00a6\u0000\u0343\u0344\u0005l\u0000\u0000\u0344Q\u0001\u0000\u0000\u0000"+
		"\u0345\u0347\u0005\u0013\u0000\u0000\u0346\u0345\u0001\u0000\u0000\u0000"+
		"\u0346\u0347\u0001\u0000\u0000\u0000\u0347\u034b\u0001\u0000\u0000\u0000"+
		"\u0348\u034a\u0003\u0138\u009c\u0000\u0349\u0348\u0001\u0000\u0000\u0000"+
		"\u034a\u034d\u0001\u0000\u0000\u0000\u034b\u0349\u0001\u0000\u0000\u0000"+
		"\u034b\u034c\u0001\u0000\u0000\u0000\u034cS\u0001\u0000\u0000\u0000\u034d"+
		"\u034b\u0001\u0000\u0000\u0000\u034e\u034f\u0003R)\u0000\u034f\u0350\u0005"+
		"\u0014\u0000\u0000\u0350\u0351\u0003V+\u0000\u0351\u0352\u0003f3\u0000"+
		"\u0352U\u0001\u0000\u0000\u0000\u0353\u0355\u0005\u000e\u0000\u0000\u0354"+
		"\u0353\u0001\u0000\u0000\u0000\u0354\u0355\u0001\u0000\u0000\u0000\u0355"+
		"\u0357\u0001\u0000\u0000\u0000\u0356\u0358\u0003\u0004\u0002\u0000\u0357"+
		"\u0356\u0001\u0000\u0000\u0000\u0357\u0358\u0001\u0000\u0000\u0000\u0358"+
		"\u035a\u0001\u0000\u0000\u0000\u0359\u035b\u0003\u00d8l\u0000\u035a\u0359"+
		"\u0001\u0000\u0000\u0000\u035a\u035b\u0001\u0000\u0000\u0000\u035b\u035e"+
		"\u0001\u0000\u0000\u0000\u035c\u035f\u0003X,\u0000\u035d\u035f\u0003Z"+
		"-\u0000\u035e\u035c\u0001\u0000\u0000\u0000\u035e\u035d\u0001\u0000\u0000"+
		"\u0000\u035f\u0363\u0001\u0000\u0000\u0000\u0360\u0362\u0003\\.\u0000"+
		"\u0361\u0360\u0001\u0000\u0000\u0000\u0362\u0365\u0001\u0000\u0000\u0000"+
		"\u0363\u0361\u0001\u0000\u0000\u0000\u0363\u0364\u0001\u0000\u0000\u0000"+
		"\u0364W\u0001\u0000\u0000\u0000\u0365\u0363\u0001\u0000\u0000\u0000\u0366"+
		"\u0367\u0007\u0000\u0000\u0000\u0367\u036c\u0003p8\u0000\u0368\u0369\u0005"+
		"m\u0000\u0000\u0369\u036b\u0003p8\u0000\u036a\u0368\u0001\u0000\u0000"+
		"\u0000\u036b\u036e\u0001\u0000\u0000\u0000\u036c\u036a\u0001\u0000\u0000"+
		"\u0000\u036c\u036d\u0001\u0000\u0000\u0000\u036dY\u0001\u0000\u0000\u0000"+
		"\u036e\u036c\u0001\u0000\u0000\u0000\u036f\u0370\u0007\u0001\u0000\u0000"+
		"\u0370\u0371\u0003t:\u0000\u0371[\u0001\u0000\u0000\u0000\u0372\u0377"+
		"\u0003^/\u0000\u0373\u0377\u0003`0\u0000\u0374\u0377\u0003b1\u0000\u0375"+
		"\u0377\u0003d2\u0000\u0376\u0372\u0001\u0000\u0000\u0000\u0376\u0373\u0001"+
		"\u0000\u0000\u0000\u0376\u0374\u0001\u0000\u0000\u0000\u0376\u0375\u0001"+
		"\u0000\u0000\u0000\u0377]\u0001\u0000\u0000\u0000\u0378\u0379\u0005\u0017"+
		"\u0000\u0000\u0379\u037a\u0005\u0002\u0000\u0000\u037a\u037f\u0003x<\u0000"+
		"\u037b\u037c\u0005m\u0000\u0000\u037c\u037e\u0003x<\u0000\u037d\u037b"+
		"\u0001\u0000\u0000\u0000\u037e\u0381\u0001\u0000\u0000\u0000\u037f\u037d"+
		"\u0001\u0000\u0000\u0000\u037f\u0380\u0001\u0000\u0000\u0000\u0380_\u0001"+
		"\u0000\u0000\u0000\u0381\u037f\u0001\u0000\u0000\u0000\u0382\u0383\u0005"+
		"\u0018\u0000\u0000\u0383\u0388\u0003z=\u0000\u0384\u0385\u0005m\u0000"+
		"\u0000\u0385\u0387\u0003z=\u0000\u0386\u0384\u0001\u0000\u0000\u0000\u0387"+
		"\u038a\u0001\u0000\u0000\u0000\u0388\u0386\u0001\u0000\u0000\u0000\u0388"+
		"\u0389\u0001\u0000\u0000\u0000\u0389a\u0001\u0000\u0000\u0000\u038a\u0388"+
		"\u0001\u0000\u0000\u0000\u038b\u038c\u0005\u0019\u0000\u0000\u038c\u0391"+
		"\u0003|>\u0000\u038d\u038e\u0005m\u0000\u0000\u038e\u0390\u0003|>\u0000"+
		"\u038f\u038d\u0001\u0000\u0000\u0000\u0390\u0393\u0001\u0000\u0000\u0000"+
		"\u0391\u038f\u0001\u0000\u0000\u0000\u0391\u0392\u0001\u0000\u0000\u0000"+
		"\u0392c\u0001\u0000\u0000\u0000\u0393\u0391\u0001\u0000\u0000\u0000\u0394"+
		"\u0395\u0005\u001a\u0000\u0000\u0395\u039a\u0003~?\u0000\u0396\u0397\u0005"+
		"m\u0000\u0000\u0397\u0399\u0003~?\u0000\u0398\u0396\u0001\u0000\u0000"+
		"\u0000\u0399\u039c\u0001\u0000\u0000\u0000\u039a\u0398\u0001\u0000\u0000"+
		"\u0000\u039a\u039b\u0001\u0000\u0000\u0000\u039be\u0001\u0000\u0000\u0000"+
		"\u039c\u039a\u0001\u0000\u0000\u0000\u039d\u03aa\u0005l\u0000\u0000\u039e"+
		"\u03a5\u0005f\u0000\u0000\u039f\u03a4\u0003&\u0013\u0000\u03a0\u03a4\u0003"+
		"h4\u0000\u03a1\u03a4\u0003*\u0015\u0000\u03a2\u03a4\u0003.\u0017\u0000"+
		"\u03a3\u039f\u0001\u0000\u0000\u0000\u03a3\u03a0\u0001\u0000\u0000\u0000"+
		"\u03a3\u03a1\u0001\u0000\u0000\u0000\u03a3\u03a2\u0001\u0000\u0000\u0000"+
		"\u03a4\u03a7\u0001\u0000\u0000\u0000\u03a5\u03a3\u0001\u0000\u0000\u0000"+
		"\u03a5\u03a6\u0001\u0000\u0000\u0000\u03a6\u03a8\u0001\u0000\u0000\u0000"+
		"\u03a7\u03a5\u0001\u0000\u0000\u0000\u03a8\u03aa\u0005g\u0000\u0000\u03a9"+
		"\u039d\u0001\u0000\u0000\u0000\u03a9\u039e\u0001\u0000\u0000\u0000\u03aa"+
		"g\u0001\u0000\u0000\u0000\u03ab\u03ae\u0003j5\u0000\u03ac\u03ae\u0003"+
		"l6\u0000\u03ad\u03ab\u0001\u0000\u0000\u0000\u03ad\u03ac\u0001\u0000\u0000"+
		"\u0000\u03aei\u0001\u0000\u0000\u0000\u03af\u03b0\u0003\"\u0011\u0000"+
		"\u03b0\u03b1\u0005\u001b\u0000\u0000\u03b1\u03b2\u0003F#\u0000\u03b2k"+
		"\u0001\u0000\u0000\u0000\u03b3\u03b4\u0003\"\u0011\u0000\u03b4\u03b5\u0003"+
		"F#\u0000\u03b5m\u0001\u0000\u0000\u0000\u03b6\u03b8\u0005\u001c\u0000"+
		"\u0000\u03b7\u03b9\u0003\u0004\u0002\u0000\u03b8\u03b7\u0001\u0000\u0000"+
		"\u0000\u03b8\u03b9\u0001\u0000\u0000\u0000\u03b9\u03bb\u0001\u0000\u0000"+
		"\u0000\u03ba\u03b6\u0001\u0000\u0000\u0000\u03ba\u03bb\u0001\u0000\u0000"+
		"\u0000\u03bb\u03bc\u0001\u0000\u0000\u0000\u03bc\u03bf\u0005\u001d\u0000"+
		"\u0000\u03bd\u03c0\u0003\u01fc\u00fe\u0000\u03be\u03c0\u0003\u01ce\u00e7"+
		"\u0000\u03bf\u03bd\u0001\u0000\u0000\u0000\u03bf\u03be\u0001\u0000\u0000"+
		"\u0000\u03c0\u03c1\u0001\u0000\u0000\u0000\u03c1\u03c4\u0007\u0000\u0000"+
		"\u0000\u03c2\u03c5\u0003\u01fc\u00fe\u0000\u03c3\u03c5\u0003\u01ce\u00e7"+
		"\u0000\u03c4\u03c2\u0001\u0000\u0000\u0000\u03c4\u03c3\u0001\u0000\u0000"+
		"\u0000\u03c5\u03c6\u0001\u0000\u0000\u0000\u03c6\u03c7\u0003\u0006\u0003"+
		"\u0000\u03c7o\u0001\u0000\u0000\u0000\u03c8\u03cb\u0003\u01fc\u00fe\u0000"+
		"\u03c9\u03cb\u0003\u01ce\u00e7\u0000\u03ca\u03c8\u0001\u0000\u0000\u0000"+
		"\u03ca\u03c9\u0001\u0000\u0000\u0000\u03cbq\u0001\u0000\u0000\u0000\u03cc"+
		"\u03ce\u0005\u001e\u0000\u0000\u03cd\u03cf\u0003\u0004\u0002\u0000\u03ce"+
		"\u03cd\u0001\u0000\u0000\u0000\u03ce\u03cf\u0001\u0000\u0000\u0000\u03cf"+
		"\u03d1\u0001\u0000\u0000\u0000\u03d0\u03cc\u0001\u0000\u0000\u0000\u03d0"+
		"\u03d1\u0001\u0000\u0000\u0000\u03d1\u03d2\u0001\u0000\u0000\u0000\u03d2"+
		"\u03d5\u0005\u001f\u0000\u0000\u03d3\u03d6\u0003\u01fc\u00fe\u0000\u03d4"+
		"\u03d6\u0003\u01ce\u00e7\u0000\u03d5\u03d3\u0001\u0000\u0000\u0000\u03d5"+
		"\u03d4\u0001\u0000\u0000\u0000\u03d6\u03d7\u0001\u0000\u0000\u0000\u03d7"+
		"\u03da\u0007\u0001\u0000\u0000\u03d8\u03db\u0003\u01fc\u00fe\u0000\u03d9"+
		"\u03db\u0003\u01ce\u00e7\u0000\u03da\u03d8\u0001\u0000\u0000\u0000\u03da"+
		"\u03d9\u0001\u0000\u0000\u0000\u03db\u03dc\u0001\u0000\u0000\u0000\u03dc"+
		"\u03dd\u0003\u0006\u0003\u0000\u03dds\u0001\u0000\u0000\u0000\u03de\u03e1"+
		"\u0003\u01fc\u00fe\u0000\u03df\u03e1\u0003\u01ce\u00e7\u0000\u03e0\u03de"+
		"\u0001\u0000\u0000\u0000\u03e0\u03df\u0001\u0000\u0000\u0000\u03e1u\u0001"+
		"\u0000\u0000\u0000\u03e2\u03e4\u0005 \u0000\u0000\u03e3\u03e5\u0003\u0004"+
		"\u0002\u0000\u03e4\u03e3\u0001\u0000\u0000\u0000\u03e4\u03e5\u0001\u0000"+
		"\u0000\u0000\u03e5\u03e7\u0001\u0000\u0000\u0000\u03e6\u03e2\u0001\u0000"+
		"\u0000\u0000\u03e6\u03e7\u0001\u0000\u0000\u0000\u03e7\u03e8\u0001\u0000"+
		"\u0000\u0000\u03e8\u03eb\u0005\u0017\u0000\u0000\u03e9\u03ec\u0003\u01fc"+
		"\u00fe\u0000\u03ea\u03ec\u0003\u01ce\u00e7\u0000\u03eb\u03e9\u0001\u0000"+
		"\u0000\u0000\u03eb\u03ea\u0001\u0000\u0000\u0000\u03ec\u03ed\u0001\u0000"+
		"\u0000\u0000\u03ed\u03f0\u0005\u0002\u0000\u0000\u03ee\u03f1\u0003\u01fc"+
		"\u00fe\u0000\u03ef\u03f1\u0003\u01ce\u00e7\u0000\u03f0\u03ee\u0001\u0000"+
		"\u0000\u0000\u03f0\u03ef\u0001\u0000\u0000\u0000\u03f1\u03f2\u0001\u0000"+
		"\u0000\u0000\u03f2\u03f3\u0003\u0006\u0003\u0000\u03f3w\u0001\u0000\u0000"+
		"\u0000\u03f4\u03f7\u0003\u01fc\u00fe\u0000\u03f5\u03f7\u0003\u01ce\u00e7"+
		"\u0000\u03f6\u03f4\u0001\u0000\u0000\u0000\u03f6\u03f5\u0001\u0000\u0000"+
		"\u0000\u03f7y\u0001\u0000\u0000\u0000\u03f8\u03fb\u0003\u01fc\u00fe\u0000"+
		"\u03f9\u03fb\u0003\u01ce\u00e7\u0000\u03fa\u03f8\u0001\u0000\u0000\u0000"+
		"\u03fa\u03f9\u0001\u0000\u0000\u0000\u03fb{\u0001\u0000\u0000\u0000\u03fc"+
		"\u03ff\u0003\u01fc\u00fe\u0000\u03fd\u03ff\u0003\u01ce\u00e7\u0000\u03fe"+
		"\u03fc\u0001\u0000\u0000\u0000\u03fe\u03fd\u0001\u0000\u0000\u0000\u03ff"+
		"}\u0001\u0000\u0000\u0000\u0400\u0403\u0003\u01fc\u00fe\u0000\u0401\u0403"+
		"\u0003\u01ce\u00e7\u0000\u0402\u0400\u0001\u0000\u0000\u0000\u0402\u0401"+
		"\u0001\u0000\u0000\u0000\u0403\u007f\u0001\u0000\u0000\u0000\u0404\u0405"+
		"\u0003R)\u0000\u0405\u0406\u0005!\u0000\u0000\u0406\u0407\u0003\u0082"+
		"A\u0000\u0407\u0408\u0003f3\u0000\u0408\u0081\u0001\u0000\u0000\u0000"+
		"\u0409\u040b\u0005\u000e\u0000\u0000\u040a\u0409\u0001\u0000\u0000\u0000"+
		"\u040a\u040b\u0001\u0000\u0000\u0000\u040b\u040d\u0001\u0000\u0000\u0000"+
		"\u040c\u040e\u0003\u0004\u0002\u0000\u040d\u040c\u0001\u0000\u0000\u0000"+
		"\u040d\u040e\u0001\u0000\u0000\u0000\u040e\u0410\u0001\u0000\u0000\u0000"+
		"\u040f\u0411\u0003\u00d8l\u0000\u0410\u040f\u0001\u0000\u0000\u0000\u0410"+
		"\u0411\u0001\u0000\u0000\u0000\u0411\u0414\u0001\u0000\u0000\u0000\u0412"+
		"\u0415\u0003\u0084B\u0000\u0413\u0415\u0003\u0086C\u0000\u0414\u0412\u0001"+
		"\u0000\u0000\u0000\u0414\u0413\u0001\u0000\u0000\u0000\u0414\u0415\u0001"+
		"\u0000\u0000\u0000\u0415\u0419\u0001\u0000\u0000\u0000\u0416\u0418\u0003"+
		"\\.\u0000\u0417\u0416\u0001\u0000\u0000\u0000\u0418\u041b\u0001\u0000"+
		"\u0000\u0000\u0419\u0417\u0001\u0000\u0000\u0000\u0419\u041a\u0001\u0000"+
		"\u0000\u0000\u041a\u0083\u0001\u0000\u0000\u0000\u041b\u0419\u0001\u0000"+
		"\u0000\u0000\u041c\u041d\u0007\u0000\u0000\u0000\u041d\u0422\u0003\u008a"+
		"E\u0000\u041e\u041f\u0005m\u0000\u0000\u041f\u0421\u0003\u008aE\u0000"+
		"\u0420\u041e\u0001\u0000\u0000\u0000\u0421\u0424\u0001\u0000\u0000\u0000"+
		"\u0422\u0420\u0001\u0000\u0000\u0000\u0422\u0423\u0001\u0000\u0000\u0000"+
		"\u0423\u0085\u0001\u0000\u0000\u0000\u0424\u0422\u0001\u0000\u0000\u0000"+
		"\u0425\u0426\u0007\u0001\u0000\u0000\u0426\u0427\u0003\u008cF\u0000\u0427"+
		"\u0087\u0001\u0000\u0000\u0000\u0428\u042a\u0005\u001c\u0000\u0000\u0429"+
		"\u042b\u0003\u0004\u0002\u0000\u042a\u0429\u0001\u0000\u0000\u0000\u042a"+
		"\u042b\u0001\u0000\u0000\u0000\u042b\u042d\u0001\u0000\u0000\u0000\u042c"+
		"\u0428\u0001\u0000\u0000\u0000\u042c\u042d\u0001\u0000\u0000\u0000\u042d"+
		"\u042e\u0001\u0000\u0000\u0000\u042e\u042f\u0005\"\u0000\u0000\u042f\u0430"+
		"\u0003\u01fc\u00fe\u0000\u0430\u0431\u0007\u0000\u0000\u0000\u0431\u0432"+
		"\u0003\u01fc\u00fe\u0000\u0432\u0433\u0003\u0006\u0003\u0000\u0433\u0089"+
		"\u0001\u0000\u0000\u0000\u0434\u0435\u0003\u01fc\u00fe\u0000\u0435\u008b"+
		"\u0001\u0000\u0000\u0000\u0436\u0437\u0003\u01fc\u00fe\u0000\u0437\u008d"+
		"\u0001\u0000\u0000\u0000\u0438\u043a\u0003\u0202\u0101\u0000\u0439\u0438"+
		"\u0001\u0000\u0000\u0000\u0439\u043a\u0001\u0000\u0000\u0000\u043a\u043c"+
		"\u0001\u0000\u0000\u0000\u043b\u043d\u0005\u0013\u0000\u0000\u043c\u043b"+
		"\u0001\u0000\u0000\u0000\u043c\u043d\u0001\u0000\u0000\u0000\u043d\u043f"+
		"\u0001\u0000\u0000\u0000\u043e\u0440\u0007\u0002\u0000\u0000\u043f\u043e"+
		"\u0001\u0000\u0000\u0000\u043f\u0440\u0001\u0000\u0000\u0000\u0440\u0442"+
		"\u0001\u0000\u0000\u0000\u0441\u0443\u0005%\u0000\u0000\u0442\u0441\u0001"+
		"\u0000\u0000\u0000\u0442\u0443\u0001\u0000\u0000\u0000\u0443\u0445\u0001"+
		"\u0000\u0000\u0000\u0444\u0446\u0005&\u0000\u0000\u0445\u0444\u0001\u0000"+
		"\u0000\u0000\u0445\u0446\u0001\u0000\u0000\u0000\u0446\u0448\u0001\u0000"+
		"\u0000\u0000\u0447\u0449\u0005\'\u0000\u0000\u0448\u0447\u0001\u0000\u0000"+
		"\u0000\u0448\u0449\u0001\u0000\u0000\u0000\u0449\u044d\u0001\u0000\u0000"+
		"\u0000\u044a\u044c\u0003\u0138\u009c\u0000\u044b\u044a\u0001\u0000\u0000"+
		"\u0000\u044c\u044f\u0001\u0000\u0000\u0000\u044d\u044b\u0001\u0000\u0000"+
		"\u0000\u044d\u044e\u0001\u0000\u0000\u0000\u044e\u008f\u0001\u0000\u0000"+
		"\u0000\u044f\u044d\u0001\u0000\u0000\u0000\u0450\u0457\u0003\u008eG\u0000"+
		"\u0451\u0453\u0005(\u0000\u0000\u0452\u0451\u0001\u0000\u0000\u0000\u0452"+
		"\u0453\u0001\u0000\u0000\u0000\u0453\u0454\u0001\u0000\u0000\u0000\u0454"+
		"\u0458\u0003\u0092I\u0000\u0455\u0458\u0003\u0138\u009c\u0000\u0456\u0458"+
		"\u0005(\u0000\u0000\u0457\u0452\u0001\u0000\u0000\u0000\u0457\u0455\u0001"+
		"\u0000\u0000\u0000\u0457\u0456\u0001\u0000\u0000\u0000\u0458\u045a\u0001"+
		"\u0000\u0000\u0000\u0459\u045b\u0003\u00ceg\u0000\u045a\u0459\u0001\u0000"+
		"\u0000\u0000\u045a\u045b\u0001\u0000\u0000\u0000\u045b\u045c\u0001\u0000"+
		"\u0000\u0000\u045c\u045d\u0003f3\u0000\u045d\u0091\u0001\u0000\u0000\u0000"+
		"\u045e\u0460\u0005\u000e\u0000\u0000\u045f\u045e\u0001\u0000\u0000\u0000"+
		"\u045f\u0460\u0001\u0000\u0000\u0000\u0460\u0468\u0001\u0000\u0000\u0000"+
		"\u0461\u0464\u0003\u0004\u0002\u0000\u0462\u0465\u0003\u009cN\u0000\u0463"+
		"\u0465\u0003\u00cae\u0000\u0464\u0462\u0001\u0000\u0000\u0000\u0464\u0463"+
		"\u0001\u0000\u0000\u0000\u0464\u0465\u0001\u0000\u0000\u0000\u0465\u0469"+
		"\u0001\u0000\u0000\u0000\u0466\u0469\u0003\u009cN\u0000\u0467\u0469\u0003"+
		"\u00cae\u0000\u0468\u0461\u0001\u0000\u0000\u0000\u0468\u0466\u0001\u0000"+
		"\u0000\u0000\u0468\u0467\u0001\u0000\u0000\u0000\u0469\u046d\u0001\u0000"+
		"\u0000\u0000\u046a\u046c\u0003\u0094J\u0000\u046b\u046a\u0001\u0000\u0000"+
		"\u0000\u046c\u046f\u0001\u0000\u0000\u0000\u046d\u046b\u0001\u0000\u0000"+
		"\u0000\u046d\u046e\u0001\u0000\u0000\u0000\u046e\u0093\u0001\u0000\u0000"+
		"\u0000\u046f\u046d\u0001\u0000\u0000\u0000\u0470\u0475\u0003\\.\u0000"+
		"\u0471\u0475\u0003\u0096K\u0000\u0472\u0475\u0003\u0098L\u0000\u0473\u0475"+
		"\u0003\u009aM\u0000\u0474\u0470\u0001\u0000\u0000\u0000\u0474\u0471\u0001"+
		"\u0000\u0000\u0000\u0474\u0472\u0001\u0000\u0000\u0000\u0474\u0473\u0001"+
		"\u0000\u0000\u0000\u0475\u0095\u0001\u0000\u0000\u0000\u0476\u0479\u0005"+
		")\u0000\u0000\u0477\u047a\u0003\u01d2\u00e9\u0000\u0478\u047a\u0003\u01d0"+
		"\u00e8\u0000\u0479\u0477\u0001\u0000\u0000\u0000\u0479\u0478\u0001\u0000"+
		"\u0000\u0000\u047a\u0097\u0001\u0000\u0000\u0000\u047b\u047c\u0005*\u0000"+
		"\u0000\u047c\u047d\u0005+\u0000\u0000\u047d\u047e\u0003\u00b4Z\u0000\u047e"+
		"\u0099\u0001\u0000\u0000\u0000\u047f\u0480\u0005,\u0000\u0000\u0480\u0481"+
		"\u0005-\u0000\u0000\u0481\u0486\u0003\u00b8\\\u0000\u0482\u0483\u0005"+
		"m\u0000\u0000\u0483\u0485\u0003\u00b8\\\u0000\u0484\u0482\u0001\u0000"+
		"\u0000\u0000\u0485\u0488\u0001\u0000\u0000\u0000\u0486\u0484\u0001\u0000"+
		"\u0000\u0000\u0486\u0487\u0001\u0000\u0000\u0000\u0487\u009b\u0001\u0000"+
		"\u0000\u0000\u0488\u0486\u0001\u0000\u0000\u0000\u0489\u048b\u0003\u00a0"+
		"P\u0000\u048a\u0489\u0001\u0000\u0000\u0000\u048b\u048c\u0001\u0000\u0000"+
		"\u0000\u048c\u048a\u0001\u0000\u0000\u0000\u048c\u048d\u0001\u0000\u0000"+
		"\u0000\u048d\u048f\u0001\u0000\u0000\u0000\u048e\u0490\u0003\u009eO\u0000"+
		"\u048f\u048e\u0001\u0000\u0000\u0000\u048f\u0490\u0001\u0000\u0000\u0000"+
		"\u0490\u0494\u0001\u0000\u0000\u0000\u0491\u0493\u0003\u00a0P\u0000\u0492"+
		"\u0491\u0001\u0000\u0000\u0000\u0493\u0496\u0001\u0000\u0000\u0000\u0494"+
		"\u0492\u0001\u0000\u0000\u0000\u0494\u0495\u0001\u0000\u0000\u0000\u0495"+
		"\u049f\u0001\u0000\u0000\u0000\u0496\u0494\u0001\u0000\u0000\u0000\u0497"+
		"\u049b\u0003\u009eO\u0000\u0498\u049a\u0003\u00a0P\u0000\u0499\u0498\u0001"+
		"\u0000\u0000\u0000\u049a\u049d\u0001\u0000\u0000\u0000\u049b\u0499\u0001"+
		"\u0000\u0000\u0000\u049b\u049c\u0001\u0000\u0000\u0000\u049c\u049f\u0001"+
		"\u0000\u0000\u0000\u049d\u049b\u0001\u0000\u0000\u0000\u049e\u048a\u0001"+
		"\u0000\u0000\u0000\u049e\u0497\u0001\u0000\u0000\u0000\u049f\u009d\u0001"+
		"\u0000\u0000\u0000\u04a0\u04af\u0003\u00d8l\u0000\u04a1\u04a3\u0003\u00d8"+
		"l\u0000\u04a2\u04a1\u0001\u0000\u0000\u0000\u04a2\u04a3\u0001\u0000\u0000"+
		"\u0000\u04a3\u04ac\u0001\u0000\u0000\u0000\u04a4\u04a6\u0005.\u0000\u0000"+
		"\u04a5\u04a7\u0005/\u0000\u0000\u04a6\u04a5\u0001\u0000\u0000\u0000\u04a6"+
		"\u04a7\u0001\u0000\u0000\u0000\u04a7\u04ad\u0001\u0000\u0000\u0000\u04a8"+
		"\u04aa\u0005/\u0000\u0000\u04a9\u04ab\u0005.\u0000\u0000\u04aa\u04a9\u0001"+
		"\u0000\u0000\u0000\u04aa\u04ab\u0001\u0000\u0000\u0000\u04ab\u04ad\u0001"+
		"\u0000\u0000\u0000\u04ac\u04a4\u0001\u0000\u0000\u0000\u04ac\u04a8\u0001"+
		"\u0000\u0000\u0000\u04ad\u04af\u0001\u0000\u0000\u0000\u04ae\u04a0\u0001"+
		"\u0000\u0000\u0000\u04ae\u04a2\u0001\u0000\u0000\u0000\u04af\u009f\u0001"+
		"\u0000\u0000\u0000\u04b0\u04b5\u0003\u00a2Q\u0000\u04b1\u04b5\u0003\u00a6"+
		"S\u0000\u04b2\u04b5\u0003\u00aaU\u0000\u04b3\u04b5\u0003\u00aeW\u0000"+
		"\u04b4\u04b0\u0001\u0000\u0000\u0000\u04b4\u04b1\u0001\u0000\u0000\u0000"+
		"\u04b4\u04b2\u0001\u0000\u0000\u0000\u04b4\u04b3\u0001\u0000\u0000\u0000"+
		"\u04b5\u00a1\u0001\u0000\u0000\u0000\u04b6\u04bb\u0003\u00a4R\u0000\u04b7"+
		"\u04b8\u0005m\u0000\u0000\u04b8\u04ba\u0003\u00bc^\u0000\u04b9\u04b7\u0001"+
		"\u0000\u0000\u0000\u04ba\u04bd\u0001\u0000\u0000\u0000\u04bb\u04b9\u0001"+
		"\u0000\u0000\u0000\u04bb\u04bc\u0001\u0000\u0000\u0000\u04bc\u00a3\u0001"+
		"\u0000\u0000\u0000\u04bd\u04bb\u0001\u0000\u0000\u0000\u04be\u04c2\u0005"+
		"s\u0000\u0000\u04bf\u04c0\u00050\u0000\u0000\u04c0\u04c2\u0005-\u0000"+
		"\u0000\u04c1\u04be\u0001\u0000\u0000\u0000\u04c1\u04bf\u0001\u0000\u0000"+
		"\u0000\u04c2\u04c3\u0001\u0000\u0000\u0000\u04c3\u04c4\u0003\u00bc^\u0000"+
		"\u04c4\u00a5\u0001\u0000\u0000\u0000\u04c5\u04ca\u0003\u00a8T\u0000\u04c6"+
		"\u04c7\u0005m\u0000\u0000\u04c7\u04c9\u0003\u00c2a\u0000\u04c8\u04c6\u0001"+
		"\u0000\u0000\u0000\u04c9\u04cc\u0001\u0000\u0000\u0000\u04ca\u04c8\u0001"+
		"\u0000\u0000\u0000\u04ca\u04cb\u0001\u0000\u0000\u0000\u04cb\u00a7\u0001"+
		"\u0000\u0000\u0000\u04cc\u04ca\u0001\u0000\u0000\u0000\u04cd\u04ce\u0007"+
		"\u0003\u0000\u0000\u04ce\u04cf\u0003\u00c2a\u0000\u04cf\u00a9\u0001\u0000"+
		"\u0000\u0000\u04d0\u04d1\u0003\u00acV\u0000\u04d1\u04d2\u0003\u00c4b\u0000"+
		"\u04d2\u00ab\u0001\u0000\u0000\u0000\u04d3\u04d6\u0005t\u0000\u0000\u04d4"+
		"\u04d6\u00052\u0000\u0000\u04d5\u04d3\u0001\u0000\u0000\u0000\u04d5\u04d4"+
		"\u0001\u0000\u0000\u0000\u04d6\u00ad\u0001\u0000\u0000\u0000\u04d7\u04dc"+
		"\u0003\u00b0X\u0000\u04d8\u04d9\u0005m\u0000\u0000\u04d9\u04db\u0003\u00c8"+
		"d\u0000\u04da\u04d8\u0001\u0000\u0000\u0000\u04db\u04de\u0001\u0000\u0000"+
		"\u0000\u04dc\u04da\u0001\u0000\u0000\u0000\u04dc\u04dd\u0001\u0000\u0000"+
		"\u0000\u04dd\u00af\u0001\u0000\u0000\u0000\u04de\u04dc\u0001\u0000\u0000"+
		"\u0000\u04df\u04e0\u0007\u0004\u0000\u0000\u04e0\u04e1\u0003\u00c8d\u0000"+
		"\u04e1\u00b1\u0001\u0000\u0000\u0000\u04e2\u04e4\u00054\u0000\u0000\u04e3"+
		"\u04e5\u0003\u0004\u0002\u0000\u04e4\u04e3\u0001\u0000\u0000\u0000\u04e4"+
		"\u04e5\u0001\u0000\u0000\u0000\u04e5\u04e7\u0001\u0000\u0000\u0000\u04e6"+
		"\u04e2\u0001\u0000\u0000\u0000\u04e6\u04e7\u0001\u0000\u0000\u0000\u04e7"+
		"\u04e8\u0001\u0000\u0000\u0000\u04e8\u04eb\u0005*\u0000\u0000\u04e9\u04ec"+
		"\u0003\u01fc\u00fe\u0000\u04ea\u04ec\u0003\u01ce\u00e7\u0000\u04eb\u04e9"+
		"\u0001\u0000\u0000\u0000\u04eb\u04ea\u0001\u0000\u0000\u0000\u04ec\u04ed"+
		"\u0001\u0000\u0000\u0000\u04ed\u04f0\u0005+\u0000\u0000\u04ee\u04f1\u0003"+
		"\u01fc\u00fe\u0000\u04ef\u04f1\u0003\u01ce\u00e7\u0000\u04f0\u04ee\u0001"+
		"\u0000\u0000\u0000\u04f0\u04ef\u0001\u0000\u0000\u0000\u04f1\u04f2\u0001"+
		"\u0000\u0000\u0000\u04f2\u04f3\u0003\u0006\u0003\u0000\u04f3\u00b3\u0001"+
		"\u0000\u0000\u0000\u04f4\u04f7\u0003\u01fc\u00fe\u0000\u04f5\u04f7\u0003"+
		"\u01ce\u00e7\u0000\u04f6\u04f4\u0001\u0000\u0000\u0000\u04f6\u04f5\u0001"+
		"\u0000\u0000\u0000\u04f7\u00b5\u0001\u0000\u0000\u0000\u04f8\u04fd\u0005"+
		"5\u0000\u0000\u04f9\u04fb\u0003\u0004\u0002\u0000\u04fa\u04f9\u0001\u0000"+
		"\u0000\u0000\u04fa\u04fb\u0001\u0000\u0000\u0000\u04fb\u04fc\u0001\u0000"+
		"\u0000\u0000\u04fc\u04fe\u0005+\u0000\u0000\u04fd\u04fa\u0001\u0000\u0000"+
		"\u0000\u04fd\u04fe\u0001\u0000\u0000\u0000\u04fe\u04ff\u0001\u0000\u0000"+
		"\u0000\u04ff\u0500\u0003\u01fc\u00fe\u0000\u0500\u0501\u0005-\u0000\u0000"+
		"\u0501\u0502\u0003\u01fc\u00fe\u0000\u0502\u0503\u0003\u0006\u0003\u0000"+
		"\u0503\u00b7\u0001\u0000\u0000\u0000\u0504\u0505\u0003\u01fc\u00fe\u0000"+
		"\u0505\u00b9\u0001\u0000\u0000\u0000\u0506\u0508\u0005\u001c\u0000\u0000"+
		"\u0507\u0509\u0003\u0004\u0002\u0000\u0508\u0507\u0001\u0000\u0000\u0000"+
		"\u0508\u0509\u0001\u0000\u0000\u0000\u0509\u050b\u0001\u0000\u0000\u0000"+
		"\u050a\u0506\u0001\u0000\u0000\u0000\u050a\u050b\u0001\u0000\u0000\u0000"+
		"\u050b\u050c\u0001\u0000\u0000\u0000\u050c\u050d\u00056\u0000\u0000\u050d"+
		"\u0511\u0003\u01fc\u00fe\u0000\u050e\u0512\u0005s\u0000\u0000\u050f\u0510"+
		"\u00050\u0000\u0000\u0510\u0512\u0005-\u0000\u0000\u0511\u050e\u0001\u0000"+
		"\u0000\u0000\u0511\u050f\u0001\u0000\u0000\u0000\u0512\u0513\u0001\u0000"+
		"\u0000\u0000\u0513\u0514\u0003\u00be_\u0000\u0514\u0515\u0003\u0006\u0003"+
		"\u0000\u0515\u00bb\u0001\u0000\u0000\u0000\u0516\u0517\u0003\u00be_\u0000"+
		"\u0517\u00bd\u0001\u0000\u0000\u0000\u0518\u051b\u0003\u01fc\u00fe\u0000"+
		"\u0519\u051b\u0003\u01ce\u00e7\u0000\u051a\u0518\u0001\u0000\u0000\u0000"+
		"\u051a\u0519\u0001\u0000\u0000\u0000\u051b\u00bf\u0001\u0000\u0000\u0000"+
		"\u051c\u051e\u0005\u001c\u0000\u0000\u051d\u051f\u0003\u0004\u0002\u0000"+
		"\u051e\u051d\u0001\u0000\u0000\u0000\u051e\u051f\u0001\u0000\u0000\u0000"+
		"\u051f\u0521\u0001\u0000\u0000\u0000\u0520\u051c\u0001\u0000\u0000\u0000"+
		"\u0520\u0521\u0001\u0000\u0000\u0000\u0521\u0522\u0001\u0000\u0000\u0000"+
		"\u0522\u0525\u00057\u0000\u0000\u0523\u0526\u0003\u01fc\u00fe\u0000\u0524"+
		"\u0526\u0003\u01ce\u00e7\u0000\u0525\u0523\u0001\u0000\u0000\u0000\u0525"+
		"\u0524\u0001\u0000\u0000\u0000\u0526\u0527\u0001\u0000\u0000\u0000\u0527"+
		"\u052a\u0007\u0003\u0000\u0000\u0528\u052b\u0003\u01fc\u00fe\u0000\u0529"+
		"\u052b\u0003\u01ce\u00e7\u0000\u052a\u0528\u0001\u0000\u0000\u0000\u052a"+
		"\u0529\u0001\u0000\u0000\u0000\u052b\u052c\u0001\u0000\u0000\u0000\u052c"+
		"\u052d\u0003\u0006\u0003\u0000\u052d\u00c1\u0001\u0000\u0000\u0000\u052e"+
		"\u0531\u0003\u01fc\u00fe\u0000\u052f\u0531\u0003\u01ce\u00e7\u0000\u0530"+
		"\u052e\u0001\u0000\u0000\u0000\u0530\u052f\u0001\u0000\u0000\u0000\u0531"+
		"\u00c3\u0001\u0000\u0000\u0000\u0532\u0535\u0003\u01fc\u00fe\u0000\u0533"+
		"\u0535\u0003\u01ce\u00e7\u0000\u0534\u0532\u0001\u0000\u0000\u0000\u0534"+
		"\u0533\u0001\u0000\u0000\u0000\u0535\u00c5\u0001\u0000\u0000\u0000\u0536"+
		"\u0538\u0005\u001c\u0000\u0000\u0537\u0539\u0003\u0004\u0002\u0000\u0538"+
		"\u0537\u0001\u0000\u0000\u0000\u0538\u0539\u0001\u0000\u0000\u0000\u0539"+
		"\u053b\u0001\u0000\u0000\u0000\u053a\u0536\u0001\u0000\u0000\u0000\u053a"+
		"\u053b\u0001\u0000\u0000\u0000\u053b\u053c\u0001\u0000\u0000\u0000\u053c"+
		"\u053f\u00058\u0000\u0000\u053d\u0540\u0003\u01fc\u00fe\u0000\u053e\u0540"+
		"\u0003\u01ce\u00e7\u0000\u053f\u053d\u0001\u0000\u0000\u0000\u053f\u053e"+
		"\u0001\u0000\u0000\u0000\u0540\u0541\u0001\u0000\u0000\u0000\u0541\u0544"+
		"\u0007\u0004\u0000\u0000\u0542\u0545\u0003\u01fc\u00fe\u0000\u0543\u0545"+
		"\u0003\u01ce\u00e7\u0000\u0544\u0542\u0001\u0000\u0000\u0000\u0544\u0543"+
		"\u0001\u0000\u0000\u0000\u0545\u0546\u0001\u0000\u0000\u0000\u0546\u0547"+
		"\u0003\u0006\u0003\u0000\u0547\u00c7\u0001\u0000\u0000\u0000\u0548\u054b"+
		"\u0003\u01fc\u00fe\u0000\u0549\u054b\u0003\u01ce\u00e7\u0000\u054a\u0548"+
		"\u0001\u0000\u0000\u0000\u054a\u0549\u0001\u0000\u0000\u0000\u054b\u00c9"+
		"\u0001\u0000\u0000\u0000\u054c\u054d\u0007\u0001\u0000\u0000\u054d\u054e"+
		"\u0003\u00ccf\u0000\u054e\u00cb\u0001\u0000\u0000\u0000\u054f\u0550\u0003"+
		"\u01fc\u00fe\u0000\u0550\u00cd\u0001\u0000\u0000\u0000\u0551\u0552\u0003"+
		"\u00d0h\u0000\u0552\u00cf\u0001\u0000\u0000\u0000\u0553\u055a\u0005v\u0000"+
		"\u0000\u0554\u055a\u0005w\u0000\u0000\u0555\u0557\u00059\u0000\u0000\u0556"+
		"\u0558\u0007\u0005\u0000\u0000\u0557\u0556\u0001\u0000\u0000\u0000\u0557"+
		"\u0558\u0001\u0000\u0000\u0000\u0558\u055a\u0001\u0000\u0000\u0000\u0559"+
		"\u0553\u0001\u0000\u0000\u0000\u0559\u0554\u0001\u0000\u0000\u0000\u0559"+
		"\u0555\u0001\u0000\u0000\u0000\u055a\u055b\u0001\u0000\u0000\u0000\u055b"+
		"\u055c\u0003\u014c\u00a6\u0000\u055c\u00d1\u0001\u0000\u0000\u0000\u055d"+
		"\u0560\u0003\u00d4j\u0000\u055e\u0560\u0003\u00d6k\u0000\u055f\u055d\u0001"+
		"\u0000\u0000\u0000\u055f\u055e\u0001\u0000\u0000\u0000\u0560\u00d3\u0001"+
		"\u0000\u0000\u0000\u0561\u0563\u0005:\u0000\u0000\u0562\u0564\u0003\u0004"+
		"\u0002\u0000\u0563\u0562\u0001\u0000\u0000\u0000\u0563\u0564\u0001\u0000"+
		"\u0000\u0000\u0564\u0565\u0001\u0000\u0000\u0000\u0565\u0566\u0003\u00a8"+
		"T\u0000\u0566\u0567\u0003f3\u0000\u0567\u00d5\u0001\u0000\u0000\u0000"+
		"\u0568\u056a\u0005:\u0000\u0000\u0569\u056b\u0003\u0004\u0002\u0000\u056a"+
		"\u0569\u0001\u0000\u0000\u0000\u056a\u056b\u0001\u0000\u0000\u0000\u056b"+
		"\u056c\u0001\u0000\u0000\u0000\u056c\u056d\u0003\u00dcn\u0000\u056d\u056e"+
		"\u0003f3\u0000\u056e\u00d7\u0001\u0000\u0000\u0000\u056f\u0570\u0003\u00da"+
		"m\u0000\u0570\u00d9\u0001\u0000\u0000\u0000\u0571\u0572\u0003\u00dcn\u0000"+
		"\u0572\u00db\u0001\u0000\u0000\u0000\u0573\u0574\u0005i\u0000\u0000\u0574"+
		"\u0577\u0003\u00deo\u0000\u0575\u0576\u0005x\u0000\u0000\u0576\u0578\u0003"+
		"\u00deo\u0000\u0577\u0575\u0001\u0000\u0000\u0000\u0577\u0578\u0001\u0000"+
		"\u0000\u0000\u0578\u0579\u0001\u0000\u0000\u0000\u0579\u057a\u0005h\u0000"+
		"\u0000\u057a\u00dd\u0001\u0000\u0000\u0000\u057b\u057e\u0003\u01e8\u00f4"+
		"\u0000\u057c\u057e\u0003\u01c6\u00e3\u0000\u057d\u057b\u0001\u0000\u0000"+
		"\u0000\u057d\u057c\u0001\u0000\u0000\u0000\u057e\u00df\u0001\u0000\u0000"+
		"\u0000\u057f\u0580\u0003R)\u0000\u0580\u0581\u0005;\u0000\u0000\u0581"+
		"\u0582\u0003\u0082A\u0000\u0582\u0583\u0003f3\u0000\u0583\u00e1\u0001"+
		"\u0000\u0000\u0000\u0584\u0585\u0003R)\u0000\u0585\u0586\u0005<\u0000"+
		"\u0000\u0586\u0587\u0003\u0082A\u0000\u0587\u0588\u0003f3\u0000\u0588"+
		"\u00e3\u0001\u0000\u0000\u0000\u0589\u058a\u0003R)\u0000\u058a\u058b\u0005"+
		"=\u0000\u0000\u058b\u058c\u0003\u0082A\u0000\u058c\u058d\u0003f3\u0000"+
		"\u058d\u00e5\u0001\u0000\u0000\u0000\u058e\u058f\u0003R)\u0000\u058f\u0590"+
		"\u0005>\u0000\u0000\u0590\u0591\u0003\u0082A\u0000\u0591\u0592\u0003f"+
		"3\u0000\u0592\u00e7\u0001\u0000\u0000\u0000\u0593\u0594\u0003R)\u0000"+
		"\u0594\u0595\u0005>\u0000\u0000\u0595\u0596\u0005=\u0000\u0000\u0596\u0597"+
		"\u0003\u0082A\u0000\u0597\u0598\u0003f3\u0000\u0598\u00e9\u0001\u0000"+
		"\u0000\u0000\u0599\u059a\u0003\u008eG\u0000\u059a\u05a2\u0005?\u0000\u0000"+
		"\u059b\u059d\u0003\u0092I\u0000\u059c\u059b\u0001\u0000\u0000\u0000\u059c"+
		"\u059d\u0001\u0000\u0000\u0000\u059d\u059f\u0001\u0000\u0000\u0000\u059e"+
		"\u05a0\u0003\u00ceg\u0000\u059f\u059e\u0001\u0000\u0000\u0000\u059f\u05a0"+
		"\u0001\u0000\u0000\u0000\u05a0\u05a3\u0001\u0000\u0000\u0000\u05a1\u05a3"+
		"\u0003\u00ecv\u0000\u05a2\u059c\u0001\u0000\u0000\u0000\u05a2\u05a1\u0001"+
		"\u0000\u0000\u0000\u05a3\u05a4\u0001\u0000\u0000\u0000\u05a4\u05a5\u0003"+
		"f3\u0000\u05a5\u00eb\u0001\u0000\u0000\u0000\u05a6\u05a9\u0003\u00eew"+
		"\u0000\u05a7\u05a9\u0003\u00f0x\u0000\u05a8\u05a6\u0001\u0000\u0000\u0000"+
		"\u05a8\u05a7\u0001\u0000\u0000\u0000\u05a9\u00ed\u0001\u0000\u0000\u0000"+
		"\u05aa\u05ac\u0003\u0092I\u0000\u05ab\u05aa\u0001\u0000\u0000\u0000\u05ab"+
		"\u05ac\u0001\u0000\u0000\u0000\u05ac\u05ad\u0001\u0000\u0000\u0000\u05ad"+
		"\u05b3\u0005\u0002\u0000\u0000\u05ae\u05b0\u0005\u000e\u0000\u0000\u05af"+
		"\u05b1\u0005\u0002\u0000\u0000\u05b0\u05af\u0001\u0000\u0000\u0000\u05b0"+
		"\u05b1\u0001\u0000\u0000\u0000\u05b1\u05b3\u0001\u0000\u0000\u0000\u05b2"+
		"\u05ab\u0001\u0000\u0000\u0000\u05b2\u05ae\u0001\u0000\u0000\u0000\u05b2"+
		"\u05b3\u0001\u0000\u0000\u0000\u05b3\u05b4\u0001\u0000\u0000\u0000\u05b4"+
		"\u05b5\u0003\u00f2y\u0000\u05b5\u05b6\u0005\u0003\u0000\u0000\u05b6\u05b7"+
		"\u0003\u00f2y\u0000\u05b7\u00ef\u0001\u0000\u0000\u0000\u05b8\u05ba\u0003"+
		"\u0092I\u0000\u05b9\u05b8\u0001\u0000\u0000\u0000\u05b9\u05ba\u0001\u0000"+
		"\u0000\u0000\u05ba\u05bb\u0001\u0000\u0000\u0000\u05bb\u05bc\u0005j\u0000"+
		"\u0000\u05bc\u05bd\u0003\u00f2y\u0000\u05bd\u05be\u0005m\u0000\u0000\u05be"+
		"\u05c3\u0003\u00f2y\u0000\u05bf\u05c0\u0005m\u0000\u0000\u05c0\u05c2\u0003"+
		"\u00f2y\u0000\u05c1\u05bf\u0001\u0000\u0000\u0000\u05c2\u05c5\u0001\u0000"+
		"\u0000\u0000\u05c3\u05c1\u0001\u0000\u0000\u0000\u05c3\u05c4\u0001\u0000"+
		"\u0000\u0000\u05c4\u05c6\u0001\u0000\u0000\u0000\u05c5\u05c3\u0001\u0000"+
		"\u0000\u0000\u05c6\u05c7\u0005k\u0000\u0000\u05c7\u00f1\u0001\u0000\u0000"+
		"\u0000\u05c8\u05c9\u0003\u00f4z\u0000\u05c9\u00f3\u0001\u0000\u0000\u0000"+
		"\u05ca\u05cb\u0003\u01f8\u00fc\u0000\u05cb\u05cc\u0003\u00acV\u0000\u05cc"+
		"\u05ce\u0001\u0000\u0000\u0000\u05cd\u05ca\u0001\u0000\u0000\u0000\u05cd"+
		"\u05ce\u0001\u0000\u0000\u0000\u05ce\u05cf\u0001\u0000\u0000\u0000\u05cf"+
		"\u05d1\u0003\u00c4b\u0000\u05d0\u05d2\u0003\u00d8l\u0000\u05d1\u05d0\u0001"+
		"\u0000\u0000\u0000\u05d1\u05d2\u0001\u0000\u0000\u0000\u05d2\u00f5\u0001"+
		"\u0000\u0000\u0000\u05d3\u05d4\u0003\u008eG\u0000\u05d4\u05d5\u0005@\u0000"+
		"\u0000\u05d5\u05d6\u0003\u00f8|\u0000\u05d6\u05d7\u0003f3\u0000\u05d7"+
		"\u00f7\u0001\u0000\u0000\u0000\u05d8\u05de\u0003\u0092I\u0000\u05d9\u05da"+
		"\u0005+\u0000\u0000\u05da\u05db\u0003\u00f2y\u0000\u05db\u05dc\u0005v"+
		"\u0000\u0000\u05dc\u05dd\u0003\u00f2y\u0000\u05dd\u05df\u0001\u0000\u0000"+
		"\u0000\u05de\u05d9\u0001\u0000\u0000\u0000\u05de\u05df\u0001\u0000\u0000"+
		"\u0000\u05df\u05ed\u0001\u0000\u0000\u0000\u05e0\u05e2\u0005\u000e\u0000"+
		"\u0000\u05e1\u05e0\u0001\u0000\u0000\u0000\u05e1\u05e2\u0001\u0000\u0000"+
		"\u0000\u05e2\u05ea\u0001\u0000\u0000\u0000\u05e3\u05e5\u0005+\u0000\u0000"+
		"\u05e4\u05e3\u0001\u0000\u0000\u0000\u05e4\u05e5\u0001\u0000\u0000\u0000"+
		"\u05e5\u05e6\u0001\u0000\u0000\u0000\u05e6\u05e7\u0003\u00f2y\u0000\u05e7"+
		"\u05e8\u0005v\u0000\u0000\u05e8\u05e9\u0003\u00f2y\u0000\u05e9\u05eb\u0001"+
		"\u0000\u0000\u0000\u05ea\u05e4\u0001\u0000\u0000\u0000\u05ea\u05eb\u0001"+
		"\u0000\u0000\u0000\u05eb\u05ed\u0001\u0000\u0000\u0000\u05ec\u05d8\u0001"+
		"\u0000\u0000\u0000\u05ec\u05e1\u0001\u0000\u0000\u0000\u05ed\u00f9\u0001"+
		"\u0000\u0000\u0000\u05ee\u05ef\u0003\u008eG\u0000\u05ef\u05f0\u0005A\u0000"+
		"\u0000\u05f0\u05f1\u0003\u00fc~\u0000\u05f1\u05f2\u0003f3\u0000\u05f2"+
		"\u00fb\u0001\u0000\u0000\u0000\u05f3\u05f9\u0003\u0092I\u0000\u05f4\u05f5"+
		"\u0005B\u0000\u0000\u05f5\u05f6\u0003\u00f2y\u0000\u05f6\u05f7\u0005C"+
		"\u0000\u0000\u05f7\u05f8\u0003\u00f2y\u0000\u05f8\u05fa\u0001\u0000\u0000"+
		"\u0000\u05f9\u05f4\u0001\u0000\u0000\u0000\u05f9\u05fa\u0001\u0000\u0000"+
		"\u0000\u05fa\u0608\u0001\u0000\u0000\u0000\u05fb\u05fd\u0005\u000e\u0000"+
		"\u0000\u05fc\u05fb\u0001\u0000\u0000\u0000\u05fc\u05fd\u0001\u0000\u0000"+
		"\u0000\u05fd\u0605\u0001\u0000\u0000\u0000\u05fe\u0600\u0005B\u0000\u0000"+
		"\u05ff\u05fe\u0001\u0000\u0000\u0000\u05ff\u0600\u0001\u0000\u0000\u0000"+
		"\u0600\u0601\u0001\u0000\u0000\u0000\u0601\u0602\u0003\u00f2y\u0000\u0602"+
		"\u0603\u0005C\u0000\u0000\u0603\u0604\u0003\u00f2y\u0000\u0604\u0606\u0001"+
		"\u0000\u0000\u0000\u0605\u05ff\u0001\u0000\u0000\u0000\u0605\u0606\u0001"+
		"\u0000\u0000\u0000\u0606\u0608\u0001\u0000\u0000\u0000\u0607\u05f3\u0001"+
		"\u0000\u0000\u0000\u0607\u05fc\u0001\u0000\u0000\u0000\u0608\u00fd\u0001"+
		"\u0000\u0000\u0000\u0609\u060a\u0003R)\u0000\u060a\u060b\u0005D\u0000"+
		"\u0000\u060b\u060c\u0003\u0082A\u0000\u060c\u060d\u0003f3\u0000\u060d"+
		"\u00ff\u0001\u0000\u0000\u0000\u060e\u060f\u0003\u008eG\u0000\u060f\u0610"+
		"\u0005E\u0000\u0000\u0610\u0611\u0003\u0102\u0081\u0000\u0611\u0612\u0003"+
		"f3\u0000\u0612\u0101\u0001\u0000\u0000\u0000\u0613\u0615\u0003\u0092I"+
		"\u0000\u0614\u0613\u0001\u0000\u0000\u0000\u0614\u0615\u0001\u0000\u0000"+
		"\u0000\u0615\u0617\u0001\u0000\u0000\u0000\u0616\u0618\u0003\u00ceg\u0000"+
		"\u0617\u0616\u0001\u0000\u0000\u0000\u0617\u0618\u0001\u0000\u0000\u0000"+
		"\u0618\u0103\u0001\u0000\u0000\u0000\u0619\u061a\u0003R)\u0000\u061a\u061b"+
		"\u0005F\u0000\u0000\u061b\u061c\u0003\u0082A\u0000\u061c\u061d\u0003\u0106"+
		"\u0083\u0000\u061d\u0105\u0001\u0000\u0000\u0000\u061e\u0624\u0005l\u0000"+
		"\u0000\u061f\u0620\u0005f\u0000\u0000\u0620\u0621\u0003\u0108\u0084\u0000"+
		"\u0621\u0622\u0005g\u0000\u0000\u0622\u0624\u0001\u0000\u0000\u0000\u0623"+
		"\u061e\u0001\u0000\u0000\u0000\u0623\u061f\u0001\u0000\u0000\u0000\u0624"+
		"\u0107\u0001\u0000\u0000\u0000\u0625\u062b\u0003&\u0013\u0000\u0626\u062b"+
		"\u0003h4\u0000\u0627\u062b\u0003*\u0015\u0000\u0628\u062b\u0003.\u0017"+
		"\u0000\u0629\u062b\u0003\u010a\u0085\u0000\u062a\u0625\u0001\u0000\u0000"+
		"\u0000\u062a\u0626\u0001\u0000\u0000\u0000\u062a\u0627\u0001\u0000\u0000"+
		"\u0000\u062a\u0628\u0001\u0000\u0000\u0000\u062a\u0629\u0001\u0000\u0000"+
		"\u0000\u062b\u062e\u0001\u0000\u0000\u0000\u062c\u062a\u0001\u0000\u0000"+
		"\u0000\u062c\u062d\u0001\u0000\u0000\u0000\u062d\u0630\u0001\u0000\u0000"+
		"\u0000\u062e\u062c\u0001\u0000\u0000\u0000\u062f\u0631\u0003\u010c\u0086"+
		"\u0000\u0630\u062f\u0001\u0000\u0000\u0000\u0630\u0631\u0001\u0000\u0000"+
		"\u0000\u0631\u0109\u0001\u0000\u0000\u0000\u0632\u0633\u0003\"\u0011\u0000"+
		"\u0633\u0634\u0005G\u0000\u0000\u0634\u0635\u0003F#\u0000\u0635\u010b"+
		"\u0001\u0000\u0000\u0000\u0636\u0637\u0003\"\u0011\u0000\u0637\u0638\u0003"+
		"\u014c\u00a6\u0000\u0638\u010d\u0001\u0000\u0000\u0000\u0639\u063a\u0003"+
		"\u008eG\u0000\u063a\u063b\u0005H\u0000\u0000\u063b\u063c\u0003\u0110\u0088"+
		"\u0000\u063c\u063d\u0003\u0106\u0083\u0000\u063d\u010f\u0001\u0000\u0000"+
		"\u0000\u063e\u0640\u0003\u0092I\u0000\u063f\u063e\u0001\u0000\u0000\u0000"+
		"\u063f\u0640\u0001\u0000\u0000\u0000\u0640\u0642\u0001\u0000\u0000\u0000"+
		"\u0641\u0643\u0003\u00ceg\u0000\u0642\u0641\u0001\u0000\u0000\u0000\u0642"+
		"\u0643\u0001\u0000\u0000\u0000\u0643\u0111\u0001\u0000\u0000\u0000\u0644"+
		"\u0645\u0003R)\u0000\u0645\u0646\u0005I\u0000\u0000\u0646\u0647\u0003"+
		"\u0082A\u0000\u0647\u0648\u0003\u0106\u0083\u0000\u0648\u0113\u0001\u0000"+
		"\u0000\u0000\u0649\u064a\u0003\u008eG\u0000\u064a\u064b\u0005J\u0000\u0000"+
		"\u064b\u064c\u0003\u0110\u0088\u0000\u064c\u064d\u0003\u0106\u0083\u0000"+
		"\u064d\u0115\u0001\u0000\u0000\u0000\u064e\u064f\u0003\u008eG\u0000\u064f"+
		"\u0651\u0005K\u0000\u0000\u0650\u0652\u0007\u0006\u0000\u0000\u0651\u0650"+
		"\u0001\u0000\u0000\u0000\u0651\u0652\u0001\u0000\u0000\u0000\u0652\u0653"+
		"\u0001\u0000\u0000\u0000\u0653\u0654\u0003\u0110\u0088\u0000\u0654\u0655"+
		"\u0003\u0106\u0083\u0000\u0655\u0117\u0001\u0000\u0000\u0000\u0656\u0657"+
		"\u0003R)\u0000\u0657\u0658\u0005N\u0000\u0000\u0658\u0659\u0003\u0082"+
		"A\u0000\u0659\u065a\u0003f3\u0000\u065a\u0119\u0001\u0000\u0000\u0000"+
		"\u065b\u065c\u0003\u008eG\u0000\u065c\u065d\u0005O\u0000\u0000\u065d\u065e"+
		"\u0003\u011e\u008f\u0000\u065e\u065f\u0003f3\u0000\u065f\u011b\u0001\u0000"+
		"\u0000\u0000\u0660\u0661\u0003\u008eG\u0000\u0661\u0662\u0005A\u0000\u0000"+
		"\u0662\u0663\u0005O\u0000\u0000\u0663\u0664\u0003\u011e\u008f\u0000\u0664"+
		"\u0665\u0003f3\u0000\u0665\u011d\u0001\u0000\u0000\u0000\u0666\u0668\u0003"+
		"\u0092I\u0000\u0667\u0666\u0001\u0000\u0000\u0000\u0667\u0668\u0001\u0000"+
		"\u0000\u0000\u0668\u066a\u0001\u0000\u0000\u0000\u0669\u066b\u0003\u00ce"+
		"g\u0000\u066a\u0669\u0001\u0000\u0000\u0000\u066a\u066b\u0001\u0000\u0000"+
		"\u0000\u066b\u066e\u0001\u0000\u0000\u0000\u066c\u066d\u0005+\u0000\u0000"+
		"\u066d\u066f\u0003\u0120\u0090\u0000\u066e\u066c\u0001\u0000\u0000\u0000"+
		"\u066e\u066f\u0001\u0000\u0000\u0000\u066f\u0675\u0001\u0000\u0000\u0000"+
		"\u0670\u0671\u0005\u0002\u0000\u0000\u0671\u0672\u0003\u0126\u0093\u0000"+
		"\u0672\u0673\u0005\u0003\u0000\u0000\u0673\u0674\u0003\u0126\u0093\u0000"+
		"\u0674\u0676\u0001\u0000\u0000\u0000\u0675\u0670\u0001\u0000\u0000\u0000"+
		"\u0675\u0676\u0001\u0000\u0000\u0000\u0676\u067f\u0001\u0000\u0000\u0000"+
		"\u0677\u0679\u0005\u000e\u0000\u0000\u0678\u0677\u0001\u0000\u0000\u0000"+
		"\u0678\u0679\u0001\u0000\u0000\u0000\u0679\u067a\u0001\u0000\u0000\u0000"+
		"\u067a\u067b\u0003\u0126\u0093\u0000\u067b\u067c\u0005\u0003\u0000\u0000"+
		"\u067c\u067d\u0003\u0126\u0093\u0000\u067d\u067f\u0001\u0000\u0000\u0000"+
		"\u067e\u0667\u0001\u0000\u0000\u0000\u067e\u0678\u0001\u0000\u0000\u0000"+
		"\u067f\u011f\u0001\u0000\u0000\u0000\u0680\u0681\u0003\u0122\u0091\u0000"+
		"\u0681\u0121\u0001\u0000\u0000\u0000\u0682\u0684\u0003\u0004\u0002\u0000"+
		"\u0683\u0682\u0001\u0000\u0000\u0000\u0683\u0684\u0001\u0000\u0000\u0000"+
		"\u0684\u0685\u0001\u0000\u0000\u0000\u0685\u0687\u0003\u0124\u0092\u0000"+
		"\u0686\u0688\u0003\u00ceg\u0000\u0687\u0686\u0001\u0000\u0000\u0000\u0687"+
		"\u0688\u0001\u0000\u0000\u0000\u0688\u0695\u0001\u0000\u0000\u0000\u0689"+
		"\u068b\u0003\u0004\u0002\u0000\u068a\u0689\u0001\u0000\u0000\u0000\u068a"+
		"\u068b\u0001\u0000\u0000\u0000\u068b\u068c\u0001\u0000\u0000\u0000\u068c"+
		"\u0695\u0003\u00ceg\u0000\u068d\u068f\u0003\u00bc^\u0000\u068e\u0690\u0003"+
		"\u00d8l\u0000\u068f\u068e\u0001\u0000\u0000\u0000\u068f\u0690\u0001\u0000"+
		"\u0000\u0000\u0690\u0695\u0001\u0000\u0000\u0000\u0691\u0692\u0003\u00d8"+
		"l\u0000\u0692\u0693\u0003\u00bc^\u0000\u0693\u0695\u0001\u0000\u0000\u0000"+
		"\u0694\u0683\u0001\u0000\u0000\u0000\u0694\u068a\u0001\u0000\u0000\u0000"+
		"\u0694\u068d\u0001\u0000\u0000\u0000\u0694\u0691\u0001\u0000\u0000\u0000"+
		"\u0695\u0123\u0001\u0000\u0000\u0000\u0696\u0698\u0003\u00a0P\u0000\u0697"+
		"\u0696\u0001\u0000\u0000\u0000\u0698\u0699\u0001\u0000\u0000\u0000\u0699"+
		"\u0697\u0001\u0000\u0000\u0000\u0699\u069a\u0001\u0000\u0000\u0000\u069a"+
		"\u069c\u0001\u0000\u0000\u0000\u069b\u069d\u0003\u009eO\u0000\u069c\u069b"+
		"\u0001\u0000\u0000\u0000\u069c\u069d\u0001\u0000\u0000\u0000\u069d\u06a1"+
		"\u0001\u0000\u0000\u0000\u069e\u06a0\u0003\u00a0P\u0000\u069f\u069e\u0001"+
		"\u0000\u0000\u0000\u06a0\u06a3\u0001\u0000\u0000\u0000\u06a1\u069f\u0001"+
		"\u0000\u0000\u0000\u06a1\u06a2\u0001\u0000\u0000\u0000\u06a2\u06ab\u0001"+
		"\u0000\u0000\u0000\u06a3\u06a1\u0001\u0000\u0000\u0000\u06a4\u06a6\u0003"+
		"\u009eO\u0000\u06a5\u06a7\u0003\u00a0P\u0000\u06a6\u06a5\u0001\u0000\u0000"+
		"\u0000\u06a7\u06a8\u0001\u0000\u0000\u0000\u06a8\u06a6\u0001\u0000\u0000"+
		"\u0000\u06a8\u06a9\u0001\u0000\u0000\u0000\u06a9\u06ab\u0001\u0000\u0000"+
		"\u0000\u06aa\u0697\u0001\u0000\u0000\u0000\u06aa\u06a4\u0001\u0000\u0000"+
		"\u0000\u06ab\u0125\u0001\u0000\u0000\u0000\u06ac\u06ad\u0003\u0128\u0094"+
		"\u0000\u06ad\u0127\u0001\u0000\u0000\u0000\u06ae\u06b0\u0003\u012a\u0095"+
		"\u0000\u06af\u06ae\u0001\u0000\u0000\u0000\u06af\u06b0\u0001\u0000\u0000"+
		"\u0000\u06b0\u06b1\u0001\u0000\u0000\u0000\u06b1\u06b2\u0003\u012e\u0097"+
		"\u0000\u06b2\u0129\u0001\u0000\u0000\u0000\u06b3\u06b4\u0003\u01fc\u00fe"+
		"\u0000\u06b4\u06b5\u0005y\u0000\u0000\u06b5\u06b8\u0001\u0000\u0000\u0000"+
		"\u06b6\u06b8\u0003\u012c\u0096\u0000\u06b7\u06b3\u0001\u0000\u0000\u0000"+
		"\u06b7\u06b6\u0001\u0000\u0000\u0000\u06b8\u012b\u0001\u0000\u0000\u0000"+
		"\u06b9\u06ba\u0003\u01d2\u00e9\u0000\u06ba\u06bb\u0005y\u0000\u0000\u06bb"+
		"\u06bd\u0001\u0000\u0000\u0000\u06bc\u06b9\u0001\u0000\u0000\u0000\u06bd"+
		"\u06be\u0001\u0000\u0000\u0000\u06be\u06bc\u0001\u0000\u0000\u0000\u06be"+
		"\u06bf\u0001\u0000\u0000\u0000\u06bf\u06c0\u0001\u0000\u0000\u0000\u06c0"+
		"\u06c1\u0003\u01d2\u00e9\u0000\u06c1\u06c2\u0005y\u0000\u0000\u06c2\u012d"+
		"\u0001\u0000\u0000\u0000\u06c3\u06c4\u0003\u0130\u0098\u0000\u06c4\u012f"+
		"\u0001\u0000\u0000\u0000\u06c5\u06c6\u0003\u0132\u0099\u0000\u06c6\u0131"+
		"\u0001\u0000\u0000\u0000\u06c7\u06c8\u0003\u01fc\u00fe\u0000\u06c8\u0133"+
		"\u0001\u0000\u0000\u0000\u06c9\u06ca\u0003R)\u0000\u06ca\u06cb\u0005P"+
		"\u0000\u0000\u06cb\u06cc\u0003\u0082A\u0000\u06cc\u06cd\u0003f3\u0000"+
		"\u06cd\u0135\u0001\u0000\u0000\u0000\u06ce\u06cf\u0005z\u0000\u0000\u06cf"+
		"\u06d0\u0003\u013a\u009d\u0000\u06d0\u0137\u0001\u0000\u0000\u0000\u06d1"+
		"\u06d2\u0005z\u0000\u0000\u06d2\u06d3\u0003\u013a\u009d\u0000\u06d3\u0139"+
		"\u0001\u0000\u0000\u0000\u06d4\u06d5\u0003\u0140\u00a0\u0000\u06d5\u013b"+
		"\u0001\u0000\u0000\u0000\u06d6\u06d8\u0003\u0138\u009c\u0000\u06d7\u06d6"+
		"\u0001\u0000\u0000\u0000\u06d8\u06db\u0001\u0000\u0000\u0000\u06d9\u06d7"+
		"\u0001\u0000\u0000\u0000\u06d9\u06da\u0001\u0000\u0000\u0000\u06da\u06dc"+
		"\u0001\u0000\u0000\u0000\u06db\u06d9\u0001\u0000\u0000\u0000\u06dc\u06dd"+
		"\u0007\u0007\u0000\u0000\u06dd\u06e7\u0003\u013e\u009f\u0000\u06de\u06df"+
		"\u0005\u0005\u0000\u0000\u06df\u06e4\u0003\u000e\u0007\u0000\u06e0\u06e1"+
		"\u0005m\u0000\u0000\u06e1\u06e3\u0003\u000e\u0007\u0000\u06e2\u06e0\u0001"+
		"\u0000\u0000\u0000\u06e3\u06e6\u0001\u0000\u0000\u0000\u06e4\u06e2\u0001"+
		"\u0000\u0000\u0000\u06e4\u06e5\u0001\u0000\u0000\u0000\u06e5\u06e8\u0001"+
		"\u0000\u0000\u0000\u06e6\u06e4\u0001\u0000\u0000\u0000\u06e7\u06de\u0001"+
		"\u0000\u0000\u0000\u06e7\u06e8\u0001\u0000\u0000\u0000\u06e8\u06e9\u0001"+
		"\u0000\u0000\u0000\u06e9\u06ea\u0003\u0142\u00a1\u0000\u06ea\u013d\u0001"+
		"\u0000\u0000\u0000\u06eb\u06ef\u0003\u0004\u0002\u0000\u06ec\u06f0\u0005"+
		"s\u0000\u0000\u06ed\u06ee\u00050\u0000\u0000\u06ee\u06f0\u0005-\u0000"+
		"\u0000\u06ef\u06ec\u0001\u0000\u0000\u0000\u06ef\u06ed\u0001\u0000\u0000"+
		"\u0000\u06f0\u06f2\u0001\u0000\u0000\u0000\u06f1\u06eb\u0001\u0000\u0000"+
		"\u0000\u06f1\u06f2\u0001\u0000\u0000\u0000\u06f2\u06f3\u0001\u0000\u0000"+
		"\u0000\u06f3\u06f4\u0003\u0140\u00a0\u0000\u06f4\u013f\u0001\u0000\u0000"+
		"\u0000\u06f5\u06f6\u0003\u01fc\u00fe\u0000\u06f6\u0141\u0001\u0000\u0000"+
		"\u0000\u06f7\u0704\u0005l\u0000\u0000\u06f8\u06ff\u0005f\u0000\u0000\u06f9"+
		"\u06fe\u0003&\u0013\u0000\u06fa\u06fe\u0003\u0144\u00a2\u0000\u06fb\u06fe"+
		"\u0003*\u0015\u0000\u06fc\u06fe\u0003.\u0017\u0000\u06fd\u06f9\u0001\u0000"+
		"\u0000\u0000\u06fd\u06fa\u0001\u0000\u0000\u0000\u06fd\u06fb\u0001\u0000"+
		"\u0000\u0000\u06fd\u06fc\u0001\u0000\u0000\u0000\u06fe\u0701\u0001\u0000"+
		"\u0000\u0000\u06ff\u06fd\u0001\u0000\u0000\u0000\u06ff\u0700\u0001\u0000"+
		"\u0000\u0000\u0700\u0702\u0001\u0000\u0000\u0000\u0701\u06ff\u0001\u0000"+
		"\u0000\u0000\u0702\u0704\u0005g\u0000\u0000\u0703\u06f7\u0001\u0000\u0000"+
		"\u0000\u0703\u06f8\u0001\u0000\u0000\u0000\u0704\u0143\u0001\u0000\u0000"+
		"\u0000\u0705\u0706\u0003\u0146\u00a3\u0000\u0706\u0145\u0001\u0000\u0000"+
		"\u0000\u0707\u0709\u0005(\u0000\u0000\u0708\u0707\u0001\u0000\u0000\u0000"+
		"\u0708\u0709\u0001\u0000\u0000\u0000\u0709\u070b\u0001\u0000\u0000\u0000"+
		"\u070a\u070c\u0007\u0004\u0000\u0000\u070b\u070a\u0001\u0000\u0000\u0000"+
		"\u070b\u070c\u0001\u0000\u0000\u0000\u070c\u070d\u0001\u0000\u0000\u0000"+
		"\u070d\u070f\u0003\u00c8d\u0000\u070e\u0710\u0003\u009cN\u0000\u070f\u070e"+
		"\u0001\u0000\u0000\u0000\u070f\u0710\u0001\u0000\u0000\u0000\u0710\u0712"+
		"\u0001\u0000\u0000\u0000\u0711\u0713\u0003\u00ceg\u0000\u0712\u0711\u0001"+
		"\u0000\u0000\u0000\u0712\u0713\u0001\u0000\u0000\u0000\u0713\u0714\u0001"+
		"\u0000\u0000\u0000\u0714\u0715\u0003\u0142\u00a1\u0000\u0715\u0147\u0001"+
		"\u0000\u0000\u0000\u0716\u0717\u0005f\u0000\u0000\u0717\u0718\u0003\u0108"+
		"\u0084\u0000\u0718\u0719\u0005g\u0000\u0000\u0719\u0149\u0001\u0000\u0000"+
		"\u0000\u071a\u071b\u0003\u014c\u00a6\u0000\u071b\u014b\u0001\u0000\u0000"+
		"\u0000\u071c\u071d\u0003\u0150\u00a8\u0000\u071d\u014d\u0001\u0000\u0000"+
		"\u0000\u071e\u071f\u0003\u014a\u00a5\u0000\u071f\u014f\u0001\u0000\u0000"+
		"\u0000\u0720\u0729\u0003\u0154\u00aa\u0000\u0721\u0722\u0003\u0152\u00a9"+
		"\u0000\u0722\u0723\u0003\u0154\u00aa\u0000\u0723\u0724\u0005|\u0000\u0000"+
		"\u0724\u0725\u0003\u014e\u00a7\u0000\u0725\u0726\u0005R\u0000\u0000\u0726"+
		"\u0727\u0003\u014e\u00a7\u0000\u0727\u0729\u0001\u0000\u0000\u0000\u0728"+
		"\u0720\u0001\u0000\u0000\u0000\u0728\u0721\u0001\u0000\u0000\u0000\u0729"+
		"\u0151\u0001\u0000\u0000\u0000\u072a\u072b\u0005S\u0000\u0000\u072b\u0153"+
		"\u0001\u0000\u0000\u0000\u072c\u0732\u0003\u015c\u00ae\u0000\u072d\u072e"+
		"\u0003\u0156\u00ab\u0000\u072e\u072f\u0003\u0158\u00ac\u0000\u072f\u0731"+
		"\u0001\u0000\u0000\u0000\u0730\u072d\u0001\u0000\u0000\u0000\u0731\u0734"+
		"\u0001\u0000\u0000\u0000\u0732\u0730\u0001\u0000\u0000\u0000\u0732\u0733"+
		"\u0001\u0000\u0000\u0000\u0733\u0155\u0001\u0000\u0000\u0000\u0734\u0732"+
		"\u0001\u0000\u0000\u0000\u0735\u0736\u0005}\u0000\u0000\u0736\u0157\u0001"+
		"\u0000\u0000\u0000\u0737\u0738\u0003\u015a\u00ad\u0000\u0738\u0159\u0001"+
		"\u0000\u0000\u0000\u0739\u073a\u0003\u015c\u00ae\u0000\u073a\u015b\u0001"+
		"\u0000\u0000\u0000\u073b\u0741\u0003\u0164\u00b2\u0000\u073c\u073d\u0003"+
		"\u015e\u00af\u0000\u073d\u073e\u0003\u0160\u00b0\u0000\u073e\u0740\u0001"+
		"\u0000\u0000\u0000\u073f\u073c\u0001\u0000\u0000\u0000\u0740\u0743\u0001"+
		"\u0000\u0000\u0000\u0741\u073f\u0001\u0000\u0000\u0000\u0741\u0742\u0001"+
		"\u0000\u0000\u0000\u0742\u015d\u0001\u0000\u0000\u0000\u0743\u0741\u0001"+
		"\u0000\u0000\u0000\u0744\u0745\u0005T\u0000\u0000\u0745\u015f\u0001\u0000"+
		"\u0000\u0000\u0746\u0747\u0003\u0162\u00b1\u0000\u0747\u0161\u0001\u0000"+
		"\u0000\u0000\u0748\u0749\u0003\u0164\u00b2\u0000\u0749\u0163\u0001\u0000"+
		"\u0000\u0000\u074a\u0755\u0003\u016e\u00b7\u0000\u074b\u074c\u0003\u0166"+
		"\u00b3\u0000\u074c\u074d\u0003\u016e\u00b7\u0000\u074d\u0752\u0001\u0000"+
		"\u0000\u0000\u074e\u074f\u0003\u0168\u00b4\u0000\u074f\u0750\u0003\u016a"+
		"\u00b5\u0000\u0750\u0752\u0001\u0000\u0000\u0000\u0751\u074b\u0001\u0000"+
		"\u0000\u0000\u0751\u074e\u0001\u0000\u0000\u0000\u0752\u0754\u0001\u0000"+
		"\u0000\u0000\u0753\u0751\u0001\u0000\u0000\u0000\u0754\u0757\u0001\u0000"+
		"\u0000\u0000\u0755\u0753\u0001\u0000\u0000\u0000\u0755\u0756\u0001\u0000"+
		"\u0000\u0000\u0756\u0165\u0001\u0000\u0000\u0000\u0757\u0755\u0001\u0000"+
		"\u0000\u0000\u0758\u0759\u0005~\u0000\u0000\u0759\u0167\u0001\u0000\u0000"+
		"\u0000\u075a\u075b\u0005U\u0000\u0000\u075b\u0169\u0001\u0000\u0000\u0000"+
		"\u075c\u075d\u0003\u016c\u00b6\u0000\u075d\u016b\u0001\u0000\u0000\u0000"+
		"\u075e\u075f\u0003\u016e\u00b7\u0000\u075f\u016d\u0001\u0000\u0000\u0000"+
		"\u0760\u0766\u0003\u0172\u00b9\u0000\u0761\u0762\u0003\u0170\u00b8\u0000"+
		"\u0762\u0763\u0003\u0172\u00b9\u0000\u0763\u0765\u0001\u0000\u0000\u0000"+
		"\u0764\u0761\u0001\u0000\u0000\u0000\u0765\u0768\u0001\u0000\u0000\u0000"+
		"\u0766\u0764\u0001\u0000\u0000\u0000\u0766\u0767\u0001\u0000\u0000\u0000"+
		"\u0767\u016f\u0001\u0000\u0000\u0000\u0768\u0766\u0001\u0000\u0000\u0000"+
		"\u0769\u076a\u0005V\u0000\u0000\u076a\u0171\u0001\u0000\u0000\u0000\u076b"+
		"\u0776\u0003\u017c\u00be\u0000\u076c\u076d\u0003\u0174\u00ba\u0000\u076d"+
		"\u076e\u0003\u017c\u00be\u0000\u076e\u0773\u0001\u0000\u0000\u0000\u076f"+
		"\u0770\u0003\u0176\u00bb\u0000\u0770\u0771\u0003\u0178\u00bc\u0000\u0771"+
		"\u0773\u0001\u0000\u0000\u0000\u0772\u076c\u0001\u0000\u0000\u0000\u0772"+
		"\u076f\u0001\u0000\u0000\u0000\u0773\u0775\u0001\u0000\u0000\u0000\u0774"+
		"\u0772\u0001\u0000\u0000\u0000\u0775\u0778\u0001\u0000\u0000\u0000\u0776"+
		"\u0774\u0001\u0000\u0000\u0000\u0776\u0777\u0001\u0000\u0000\u0000\u0777"+
		"\u0173\u0001\u0000\u0000\u0000\u0778\u0776\u0001\u0000\u0000\u0000\u0779"+
		"\u077a\u0005\u007f\u0000\u0000\u077a\u0175\u0001\u0000\u0000\u0000\u077b"+
		"\u077c\u0005W\u0000\u0000\u077c\u0177\u0001\u0000\u0000\u0000\u077d\u077e"+
		"\u0003\u017a\u00bd\u0000\u077e\u0179\u0001\u0000\u0000\u0000\u077f\u0780"+
		"\u0003\u017c\u00be\u0000\u0780\u017b\u0001\u0000\u0000\u0000\u0781\u0787"+
		"\u0003\u0180\u00c0\u0000\u0782\u0783\u0003\u017e\u00bf\u0000\u0783\u0784"+
		"\u0003\u0180\u00c0\u0000\u0784\u0786\u0001\u0000\u0000\u0000\u0785\u0782"+
		"\u0001\u0000\u0000\u0000\u0786\u0789\u0001\u0000\u0000\u0000\u0787\u0785"+
		"\u0001\u0000\u0000\u0000\u0787\u0788\u0001\u0000\u0000\u0000\u0788\u017d"+
		"\u0001\u0000\u0000\u0000\u0789\u0787\u0001\u0000\u0000\u0000\u078a\u078f"+
		"\u0005\u0080\u0000\u0000\u078b\u078f\u0005\u0081\u0000\u0000\u078c\u078f"+
		"\u0005\u0082\u0000\u0000\u078d\u078f\u0005\u0083\u0000\u0000\u078e\u078a"+
		"\u0001\u0000\u0000\u0000\u078e\u078b\u0001\u0000\u0000\u0000\u078e\u078c"+
		"\u0001\u0000\u0000\u0000\u078e\u078d\u0001\u0000\u0000\u0000\u078f\u017f"+
		"\u0001\u0000\u0000\u0000\u0790\u0797\u0003\u019a\u00cd\u0000\u0791\u0792"+
		"\u0003\u0182\u00c1\u0000\u0792\u0793\u0003\u018c\u00c6\u0000\u0793\u0798"+
		"\u0001\u0000\u0000\u0000\u0794\u0795\u0003\u0186\u00c3\u0000\u0795\u0796"+
		"\u0003\u018e\u00c7\u0000\u0796\u0798\u0001\u0000\u0000\u0000\u0797\u0791"+
		"\u0001\u0000\u0000\u0000\u0797\u0794\u0001\u0000\u0000\u0000\u0797\u0798"+
		"\u0001\u0000\u0000\u0000\u0798\u07aa\u0001\u0000\u0000\u0000\u0799\u079a"+
		"\u0003\u0194\u00ca\u0000\u079a\u079b\u0003\u0182\u00c1\u0000\u079b\u079c"+
		"\u0003\u018c\u00c6\u0000\u079c\u07aa\u0001\u0000\u0000\u0000\u079d\u079e"+
		"\u0003\u018a\u00c5\u0000\u079e\u079f\u0003\u0184\u00c2\u0000\u079f\u07a0"+
		"\u0003\u018c\u00c6\u0000\u07a0\u07aa\u0001\u0000\u0000\u0000\u07a1\u07a2"+
		"\u0003\u0194\u00ca\u0000\u07a2\u07a3\u0003\u0186\u00c3\u0000\u07a3\u07a4"+
		"\u0003\u018e\u00c7\u0000\u07a4\u07aa\u0001\u0000\u0000\u0000\u07a5\u07a6"+
		"\u0003\u018a\u00c5\u0000\u07a6\u07a7\u0003\u0188\u00c4\u0000\u07a7\u07a8"+
		"\u0003\u018e\u00c7\u0000\u07a8\u07aa\u0001\u0000\u0000\u0000\u07a9\u0790"+
		"\u0001\u0000\u0000\u0000\u07a9\u0799\u0001\u0000\u0000\u0000\u07a9\u079d"+
		"\u0001\u0000\u0000\u0000\u07a9\u07a1\u0001\u0000\u0000\u0000\u07a9\u07a5"+
		"\u0001\u0000\u0000\u0000\u07aa\u0181\u0001\u0000\u0000\u0000\u07ab\u07af"+
		"\u0005X\u0000\u0000\u07ac\u07af\u0005Y\u0000\u0000\u07ad\u07af\u0005{"+
		"\u0000\u0000\u07ae\u07ab\u0001\u0000\u0000\u0000\u07ae\u07ac\u0001\u0000"+
		"\u0000\u0000\u07ae\u07ad\u0001\u0000\u0000\u0000\u07af\u0183\u0001\u0000"+
		"\u0000\u0000\u07b0\u07b1\u0005\u0084\u0000\u0000\u07b1\u0185\u0001\u0000"+
		"\u0000\u0000\u07b2\u07b3\u0005Z\u0000\u0000\u07b3\u0187\u0001\u0000\u0000"+
		"\u0000\u07b4\u07b5\u0005[\u0000\u0000\u07b5\u0189\u0001\u0000\u0000\u0000"+
		"\u07b6\u07b7\u0003\u01fc\u00fe\u0000\u07b7\u018b\u0001\u0000\u0000\u0000"+
		"\u07b8\u07b9\u0003\u0190\u00c8\u0000\u07b9\u018d\u0001\u0000\u0000\u0000"+
		"\u07ba\u07bb\u0003\u0190\u00c8\u0000\u07bb\u018f\u0001\u0000\u0000\u0000"+
		"\u07bc\u07bd\u0003\u0192\u00c9\u0000\u07bd\u0191\u0001\u0000\u0000\u0000"+
		"\u07be\u07bf\u0003\u01fc\u00fe\u0000\u07bf\u0193\u0001\u0000\u0000\u0000"+
		"\u07c0\u07c1\u0003\u0196\u00cb\u0000\u07c1\u0195\u0001\u0000\u0000\u0000"+
		"\u07c2\u07c3\u0003\u0198\u00cc\u0000\u07c3\u0197\u0001\u0000\u0000\u0000"+
		"\u07c4\u07c5\u0001\u0000\u0000\u0000\u07c5\u0199\u0001\u0000\u0000\u0000"+
		"\u07c6\u07cc\u0003\u019e\u00cf\u0000\u07c7\u07c8\u0003\u019c\u00ce\u0000"+
		"\u07c8\u07c9\u0003\u019e\u00cf\u0000\u07c9\u07cb\u0001\u0000\u0000\u0000"+
		"\u07ca\u07c7\u0001\u0000\u0000\u0000\u07cb\u07ce\u0001\u0000\u0000\u0000"+
		"\u07cc\u07ca\u0001\u0000\u0000\u0000\u07cc\u07cd\u0001\u0000\u0000\u0000"+
		"\u07cd\u019b\u0001\u0000\u0000\u0000\u07ce\u07cc\u0001\u0000\u0000\u0000"+
		"\u07cf\u07d4\u0005d\u0000\u0000\u07d0\u07d4\u0005e\u0000\u0000\u07d1\u07d4"+
		"\u0005\u0085\u0000\u0000\u07d2\u07d4\u0005\u0086\u0000\u0000\u07d3\u07cf"+
		"\u0001\u0000\u0000\u0000\u07d3\u07d0\u0001\u0000\u0000\u0000\u07d3\u07d1"+
		"\u0001\u0000\u0000\u0000\u07d3\u07d2\u0001\u0000\u0000\u0000\u07d4\u019d"+
		"\u0001\u0000\u0000\u0000\u07d5\u07d8\u0003\u01a0\u00d0\u0000\u07d6\u07d7"+
		"\u0005x\u0000\u0000\u07d7\u07d9\u0003\u01a0\u00d0\u0000\u07d8\u07d6\u0001"+
		"\u0000\u0000\u0000\u07d8\u07d9\u0001\u0000\u0000\u0000\u07d9\u019f\u0001"+
		"\u0000\u0000\u0000\u07da\u07e0\u0003\u01a4\u00d2\u0000\u07db\u07dc\u0003"+
		"\u01a2\u00d1\u0000\u07dc\u07dd\u0003\u01a4\u00d2\u0000\u07dd\u07df\u0001"+
		"\u0000\u0000\u0000\u07de\u07db\u0001\u0000\u0000\u0000\u07df\u07e2\u0001"+
		"\u0000\u0000\u0000\u07e0\u07de\u0001\u0000\u0000\u0000\u07e0\u07e1\u0001"+
		"\u0000\u0000\u0000\u07e1\u01a1\u0001\u0000\u0000\u0000\u07e2\u07e0\u0001"+
		"\u0000\u0000\u0000\u07e3\u07e6\u0005\u0087\u0000\u0000\u07e4\u07e6\u0005"+
		"\u0088\u0000\u0000\u07e5\u07e3\u0001\u0000\u0000\u0000\u07e5\u07e4\u0001"+
		"\u0000\u0000\u0000\u07e6\u01a3\u0001\u0000\u0000\u0000\u07e7\u07ed\u0003"+
		"\u01a8\u00d4\u0000\u07e8\u07e9\u0003\u01a6\u00d3\u0000\u07e9\u07ea\u0003"+
		"\u01a8\u00d4\u0000\u07ea\u07ec\u0001\u0000\u0000\u0000\u07eb\u07e8\u0001"+
		"\u0000\u0000\u0000\u07ec\u07ef\u0001\u0000\u0000\u0000\u07ed\u07eb\u0001"+
		"\u0000\u0000\u0000\u07ed\u07ee\u0001\u0000\u0000\u0000\u07ee\u01a5\u0001"+
		"\u0000\u0000\u0000\u07ef\u07ed\u0001\u0000\u0000\u0000\u07f0\u07f4\u0005"+
		"p\u0000\u0000\u07f1\u07f4\u0005\u0089\u0000\u0000\u07f2\u07f4\u0005\u008a"+
		"\u0000\u0000\u07f3\u07f0\u0001\u0000\u0000\u0000\u07f3\u07f1\u0001\u0000"+
		"\u0000\u0000\u07f3\u07f2\u0001\u0000\u0000\u0000\u07f4\u01a7\u0001\u0000"+
		"\u0000\u0000\u07f5\u07f9\u0003\u01ac\u00d6\u0000\u07f6\u07f7\u0003\u01aa"+
		"\u00d5\u0000\u07f7\u07f8\u0003\u01a8\u00d4\u0000\u07f8\u07fa\u0001\u0000"+
		"\u0000\u0000\u07f9\u07f6\u0001\u0000\u0000\u0000\u07f9\u07fa\u0001\u0000"+
		"\u0000\u0000\u07fa\u01a9\u0001\u0000\u0000\u0000\u07fb\u07fe\u0005o\u0000"+
		"\u0000\u07fc\u07fe\u0005\u008b\u0000\u0000\u07fd\u07fb\u0001\u0000\u0000"+
		"\u0000\u07fd\u07fc\u0001\u0000\u0000\u0000\u07fe\u01ab\u0001\u0000\u0000"+
		"\u0000\u07ff\u0800\u0003\u01ae\u00d7\u0000\u0800\u0801\u0003\u01b0\u00d8"+
		"\u0000\u0801\u0804\u0001\u0000\u0000\u0000\u0802\u0804\u0003\u01b0\u00d8"+
		"\u0000\u0803\u07ff\u0001\u0000\u0000\u0000\u0803\u0802\u0001\u0000\u0000"+
		"\u0000\u0804\u01ad\u0001\u0000\u0000\u0000\u0805\u080a\u0005\u0087\u0000"+
		"\u0000\u0806\u080a\u0005\u0088\u0000\u0000\u0807\u080a\u0005r\u0000\u0000"+
		"\u0808\u080a\u0005\\\u0000\u0000\u0809\u0805\u0001\u0000\u0000\u0000\u0809"+
		"\u0806\u0001\u0000\u0000\u0000\u0809\u0807\u0001\u0000\u0000\u0000\u0809"+
		"\u0808\u0001\u0000\u0000\u0000\u080a\u01af\u0001\u0000\u0000\u0000\u080b"+
		"\u080c\u0005\u000e\u0000\u0000\u080c\u080f\u0003\u018e\u00c7\u0000\u080d"+
		"\u080f\u0003\u01b2\u00d9\u0000\u080e\u080b\u0001\u0000\u0000\u0000\u080e"+
		"\u080d\u0001\u0000\u0000\u0000\u080f\u01b1\u0001\u0000\u0000\u0000\u0810"+
		"\u0813\u0003\u01bc\u00de\u0000\u0811\u0812\u0005y\u0000\u0000\u0812\u0814"+
		"\u0003\u01ba\u00dd\u0000\u0813\u0811\u0001\u0000\u0000\u0000\u0813\u0814"+
		"\u0001\u0000\u0000\u0000\u0814\u0831\u0001\u0000\u0000\u0000\u0815\u0816"+
		"\u0005z\u0000\u0000\u0816\u0817\u0005j\u0000\u0000\u0817\u0818\u0003\u01c4"+
		"\u00e2\u0000\u0818\u0819\u0005k\u0000\u0000\u0819\u082a\u0001\u0000\u0000"+
		"\u0000\u081a\u081b\u0005i\u0000\u0000\u081b\u081c\u0003\u01c4\u00e2\u0000"+
		"\u081c\u081d\u0005h\u0000\u0000\u081d\u082a\u0001\u0000\u0000\u0000\u081e"+
		"\u081f\u0005\u008c\u0000\u0000\u081f\u0823\u0003\u0192\u00c9\u0000\u0820"+
		"\u0824\u0003\u01be\u00df\u0000\u0821\u0824\u0003\u01b4\u00da\u0000\u0822"+
		"\u0824\u0003\u01d4\u00ea\u0000\u0823\u0820\u0001\u0000\u0000\u0000\u0823"+
		"\u0821\u0001\u0000\u0000\u0000\u0823\u0822\u0001\u0000\u0000\u0000\u0824"+
		"\u082a\u0001\u0000\u0000\u0000\u0825\u0826\u0005y\u0000\u0000\u0826\u082a"+
		"\u0003\u01be\u00df\u0000\u0827\u0828\u0005\u008d\u0000\u0000\u0828\u082a"+
		"\u0003\u01be\u00df\u0000\u0829\u0815\u0001\u0000\u0000\u0000\u0829\u081a"+
		"\u0001\u0000\u0000\u0000\u0829\u081e\u0001\u0000\u0000\u0000\u0829\u0825"+
		"\u0001\u0000\u0000\u0000\u0829\u0827\u0001\u0000\u0000\u0000\u082a\u082d"+
		"\u0001\u0000\u0000\u0000\u082b\u082c\u0005y\u0000\u0000\u082c\u082e\u0003"+
		"\u01ba\u00dd\u0000\u082d\u082b\u0001\u0000\u0000\u0000\u082d\u082e\u0001"+
		"\u0000\u0000\u0000\u082e\u0830\u0001\u0000\u0000\u0000\u082f\u0829\u0001"+
		"\u0000\u0000\u0000\u0830\u0833\u0001\u0000\u0000\u0000\u0831\u082f\u0001"+
		"\u0000\u0000\u0000\u0831\u0832\u0001\u0000\u0000\u0000\u0832\u01b3\u0001"+
		"\u0000\u0000\u0000\u0833\u0831\u0001\u0000\u0000\u0000\u0834\u0835\u0003"+
		"\u01b6\u00db\u0000\u0835\u01b5\u0001\u0000\u0000\u0000\u0836\u0837\u0003"+
		"\u01b8\u00dc\u0000\u0837\u01b7\u0001\u0000\u0000\u0000\u0838\u0839\u0003"+
		"\u0192\u00c9\u0000\u0839\u01b9\u0001\u0000\u0000\u0000\u083a\u083d\u0003"+
		"\u01fc\u00fe\u0000\u083b\u083d\u0003\u01ce\u00e7\u0000\u083c\u083a\u0001"+
		"\u0000\u0000\u0000\u083c\u083b\u0001\u0000\u0000\u0000\u083d\u01bb\u0001"+
		"\u0000\u0000\u0000\u083e\u0849\u0003\u01e6\u00f3\u0000\u083f\u0849\u0003"+
		"\u01e8\u00f4\u0000\u0840\u0849\u0003\u01c6\u00e3\u0000\u0841\u0849\u0003"+
		"\u01ca\u00e5\u0000\u0842\u0849\u0003\u01cc\u00e6\u0000\u0843\u0849\u0003"+
		"\u01be\u00df\u0000\u0844\u0845\u0005j\u0000\u0000\u0845\u0846\u0003\u01c4"+
		"\u00e2\u0000\u0846\u0847\u0005k\u0000\u0000\u0847\u0849\u0001\u0000\u0000"+
		"\u0000\u0848\u083e\u0001\u0000\u0000\u0000\u0848\u083f\u0001\u0000\u0000"+
		"\u0000\u0848\u0840\u0001\u0000\u0000\u0000\u0848\u0841\u0001\u0000\u0000"+
		"\u0000\u0848\u0842\u0001\u0000\u0000\u0000\u0848\u0843\u0001\u0000\u0000"+
		"\u0000\u0848\u0844\u0001\u0000\u0000\u0000\u0849\u01bd\u0001\u0000\u0000"+
		"\u0000\u084a\u084b\u0003\u01c0\u00e0\u0000\u084b\u01bf\u0001\u0000\u0000"+
		"\u0000\u084c\u084d\u0003\u0148\u00a4\u0000\u084d\u01c1\u0001\u0000\u0000"+
		"\u0000\u084e\u084f\u0003\u01f8\u00fc\u0000\u084f\u01c3\u0001\u0000\u0000"+
		"\u0000\u0850\u0854\u0003\u014c\u00a6\u0000\u0851\u0855\u0005m\u0000\u0000"+
		"\u0852\u0853\u0005m\u0000\u0000\u0853\u0855\u0003\u01c4\u00e2\u0000\u0854"+
		"\u0851\u0001\u0000\u0000\u0000\u0854\u0852\u0001\u0000\u0000\u0000\u0854"+
		"\u0855\u0001\u0000\u0000\u0000\u0855\u01c5\u0001\u0000\u0000\u0000\u0856"+
		"\u0857\u0003\u01c8\u00e4\u0000\u0857\u01c7\u0001\u0000\u0000\u0000\u0858"+
		"\u0859\u0003\u01fc\u00fe\u0000\u0859\u01c9\u0001\u0000\u0000\u0000\u085a"+
		"\u085b\u0003\u01fc\u00fe\u0000\u085b\u085c\u0005y\u0000\u0000\u085c\u085d"+
		"\u0005Q\u0000\u0000\u085d\u01cb\u0001\u0000\u0000\u0000\u085e\u085f\u0003"+
		"\u00bc^\u0000\u085f\u0860\u0003\u01d4\u00ea\u0000\u0860\u01cd\u0001\u0000"+
		"\u0000\u0000\u0861\u0862\u0003\u01d0\u00e8\u0000\u0862\u01cf\u0001\u0000"+
		"\u0000\u0000\u0863\u0866\u0003\u01d2\u00e9\u0000\u0864\u0865\u0005y\u0000"+
		"\u0000\u0865\u0867\u0003\u01d2\u00e9\u0000\u0866\u0864\u0001\u0000\u0000"+
		"\u0000\u0867\u0868\u0001\u0000\u0000\u0000\u0868\u0866\u0001\u0000\u0000"+
		"\u0000\u0868\u0869\u0001\u0000\u0000\u0000\u0869\u01d1\u0001\u0000\u0000"+
		"\u0000\u086a\u086b\u0003\u01fc\u00fe\u0000\u086b\u01d3\u0001\u0000\u0000"+
		"\u0000\u086c\u086f\u0005j\u0000\u0000\u086d\u0870\u0003\u01d6\u00eb\u0000"+
		"\u086e\u0870\u0003\u01dc\u00ee\u0000\u086f\u086d\u0001\u0000\u0000\u0000"+
		"\u086f\u086e\u0001\u0000\u0000\u0000\u086f\u0870\u0001\u0000\u0000\u0000"+
		"\u0870\u0871\u0001\u0000\u0000\u0000\u0871\u0872\u0005k\u0000\u0000\u0872"+
		"\u01d5\u0001\u0000\u0000\u0000\u0873\u0878\u0003\u01d8\u00ec\u0000\u0874"+
		"\u0875\u0005m\u0000\u0000\u0875\u0877\u0003\u01d8\u00ec\u0000\u0876\u0874"+
		"\u0001\u0000\u0000\u0000\u0877\u087a\u0001\u0000\u0000\u0000\u0878\u0876"+
		"\u0001\u0000\u0000\u0000\u0878\u0879\u0001\u0000\u0000\u0000\u0879\u01d7"+
		"\u0001\u0000\u0000\u0000\u087a\u0878\u0001\u0000\u0000\u0000\u087b\u087c"+
		"\u0003\u01da\u00ed\u0000\u087c\u01d9\u0001\u0000\u0000\u0000\u087d\u087e"+
		"\u0003\u01e4\u00f2\u0000\u087e\u01db\u0001\u0000\u0000\u0000\u087f\u0884"+
		"\u0003\u01de\u00ef\u0000\u0880\u0881\u0005m\u0000\u0000\u0881\u0883\u0003"+
		"\u01de\u00ef\u0000\u0882\u0880\u0001\u0000\u0000\u0000\u0883\u0886\u0001"+
		"\u0000\u0000\u0000\u0884\u0882\u0001\u0000\u0000\u0000\u0884\u0885\u0001"+
		"\u0000\u0000\u0000\u0885\u01dd\u0001\u0000\u0000\u0000\u0886\u0884\u0001"+
		"\u0000\u0000\u0000\u0887\u0888\u0003\u01e0\u00f0\u0000\u0888\u01df\u0001"+
		"\u0000\u0000\u0000\u0889\u088a\u0003\u01e2\u00f1\u0000\u088a\u088b\u0005"+
		"v\u0000\u0000\u088b\u088c\u0003\u01e4\u00f2\u0000\u088c\u01e1\u0001\u0000"+
		"\u0000\u0000\u088d\u088e\u0003\u01fc\u00fe\u0000\u088e\u01e3\u0001\u0000"+
		"\u0000\u0000\u088f\u0890\u0003\u014c\u00a6\u0000\u0890\u01e5\u0001\u0000"+
		"\u0000\u0000\u0891\u0895\u0005]\u0000\u0000\u0892\u0893\u0005j\u0000\u0000"+
		"\u0893\u0895\u0005k\u0000\u0000\u0894\u0891\u0001\u0000\u0000\u0000\u0894"+
		"\u0892\u0001\u0000\u0000\u0000\u0895\u01e7\u0001\u0000\u0000\u0000\u0896"+
		"\u089c\u0003\u01ea\u00f5\u0000\u0897\u089c\u0003\u01ee\u00f7\u0000\u0898"+
		"\u089c\u0003\u01f0\u00f8\u0000\u0899\u089c\u0003\u01f2\u00f9\u0000\u089a"+
		"\u089c\u0003\u01f6\u00fb\u0000\u089b\u0896\u0001\u0000\u0000\u0000\u089b"+
		"\u0897\u0001\u0000\u0000\u0000\u089b\u0898\u0001\u0000\u0000\u0000\u089b"+
		"\u0899\u0001\u0000\u0000\u0000\u089b\u089a\u0001\u0000\u0000\u0000\u089c"+
		"\u01e9\u0001\u0000\u0000\u0000\u089d\u089e\u0003\u01ec\u00f6\u0000\u089e"+
		"\u01eb\u0001\u0000\u0000\u0000\u089f\u08a2\u0005L\u0000\u0000\u08a0\u08a2"+
		"\u0005M\u0000\u0000\u08a1\u089f\u0001\u0000\u0000\u0000\u08a1\u08a0\u0001"+
		"\u0000\u0000\u0000\u08a2\u01ed\u0001\u0000\u0000\u0000\u08a3\u08a4\u0005"+
		"\u0092\u0000\u0000\u08a4\u01ef\u0001\u0000\u0000\u0000\u08a5\u08a6\u0005"+
		"\u008e\u0000\u0000\u08a6\u01f1\u0001\u0000\u0000\u0000\u08a7\u08a8\u0003"+
		"\u01f4\u00fa\u0000\u08a8\u01f3\u0001\u0000\u0000\u0000\u08a9\u08ab\u0005"+
		"\u008e\u0000\u0000\u08aa\u08a9\u0001\u0000\u0000\u0000\u08aa\u08ab\u0001"+
		"\u0000\u0000\u0000\u08ab\u08ac\u0001\u0000\u0000\u0000\u08ac\u08ad\u0005"+
		"y\u0000\u0000\u08ad\u08b0\u0007\b\u0000\u0000\u08ae\u08b0\u0005\u008f"+
		"\u0000\u0000\u08af\u08aa\u0001\u0000\u0000\u0000\u08af\u08ae\u0001\u0000"+
		"\u0000\u0000\u08b0\u01f5\u0001\u0000\u0000\u0000\u08b1\u08b2\u0005p\u0000"+
		"\u0000\u08b2\u01f7\u0001\u0000\u0000\u0000\u08b3\u08b6\u0005\u0090\u0000"+
		"\u0000\u08b4\u08b6\u0005\u0091\u0000\u0000\u08b5\u08b3\u0001\u0000\u0000"+
		"\u0000\u08b5\u08b4\u0001\u0000\u0000\u0000\u08b6\u01f9\u0001\u0000\u0000"+
		"\u0000\u08b7\u08b8\u0003\u01f8\u00fc\u0000\u08b8\u08b9\u0005n\u0000\u0000"+
		"\u08b9\u08bb\u0001\u0000\u0000\u0000\u08ba\u08b7\u0001\u0000\u0000\u0000"+
		"\u08bb\u08bc\u0001\u0000\u0000\u0000\u08bc\u08ba\u0001\u0000\u0000\u0000"+
		"\u08bc\u08bd\u0001\u0000\u0000\u0000\u08bd\u01fb\u0001\u0000\u0000\u0000"+
		"\u08be\u08c0\u0003\u01fa\u00fd\u0000\u08bf\u08be\u0001\u0000\u0000\u0000"+
		"\u08bf\u08c0\u0001\u0000\u0000\u0000\u08c0\u08c1\u0001\u0000\u0000\u0000"+
		"\u08c1\u08c2\u0003\u01f8\u00fc\u0000\u08c2\u01fd\u0001\u0000\u0000\u0000"+
		"\u08c3\u08c4\u0005i\u0000\u0000\u08c4\u01ff\u0001\u0000\u0000\u0000\u08c5"+
		"\u08c9\u0005^\u0000\u0000\u08c6\u08c9\u0005_\u0000\u0000\u08c7\u08c9\u0005"+
		"`\u0000\u0000\u08c8\u08c5\u0001\u0000\u0000\u0000\u08c8\u08c6\u0001\u0000"+
		"\u0000\u0000\u08c8\u08c7\u0001\u0000\u0000\u0000\u08c9\u0201\u0001\u0000"+
		"\u0000\u0000\u08ca\u08ce\u0005a\u0000\u0000\u08cb\u08ce\u0005b\u0000\u0000"+
		"\u08cc\u08ce\u0005c\u0000\u0000\u08cd\u08ca\u0001\u0000\u0000\u0000\u08cd"+
		"\u08cb\u0001\u0000\u0000\u0000\u08cd\u08cc\u0001\u0000\u0000\u0000\u08ce"+
		"\u0203\u0001\u0000\u0000\u0000\u0107\u020a\u0211\u0214\u021b\u021f\u0223"+
		"\u0227\u022c\u0231\u0234\u023b\u0244\u0251\u0255\u025d\u0260\u0262\u0266"+
		"\u026c\u0270\u0276\u0278\u0281\u0289\u0290\u0292\u0296\u029b\u029e\u02a2"+
		"\u02b0\u02b3\u02ba\u02be\u02c2\u02cc\u02d1\u02d8\u02de\u02e2\u02ee\u030a"+
		"\u0316\u031b\u0322\u0328\u0330\u0338\u033a\u033e\u0346\u034b\u0354\u0357"+
		"\u035a\u035e\u0363\u036c\u0376\u037f\u0388\u0391\u039a\u03a3\u03a5\u03a9"+
		"\u03ad\u03b8\u03ba\u03bf\u03c4\u03ca\u03ce\u03d0\u03d5\u03da\u03e0\u03e4"+
		"\u03e6\u03eb\u03f0\u03f6\u03fa\u03fe\u0402\u040a\u040d\u0410\u0414\u0419"+
		"\u0422\u042a\u042c\u0439\u043c\u043f\u0442\u0445\u0448\u044d\u0452\u0457"+
		"\u045a\u045f\u0464\u0468\u046d\u0474\u0479\u0486\u048c\u048f\u0494\u049b"+
		"\u049e\u04a2\u04a6\u04aa\u04ac\u04ae\u04b4\u04bb\u04c1\u04ca\u04d5\u04dc"+
		"\u04e4\u04e6\u04eb\u04f0\u04f6\u04fa\u04fd\u0508\u050a\u0511\u051a\u051e"+
		"\u0520\u0525\u052a\u0530\u0534\u0538\u053a\u053f\u0544\u054a\u0557\u0559"+
		"\u055f\u0563\u056a\u0577\u057d\u059c\u059f\u05a2\u05a8\u05ab\u05b0\u05b2"+
		"\u05b9\u05c3\u05cd\u05d1\u05de\u05e1\u05e4\u05ea\u05ec\u05f9\u05fc\u05ff"+
		"\u0605\u0607\u0614\u0617\u0623\u062a\u062c\u0630\u063f\u0642\u0651\u0667"+
		"\u066a\u066e\u0675\u0678\u067e\u0683\u0687\u068a\u068f\u0694\u0699\u069c"+
		"\u06a1\u06a8\u06aa\u06af\u06b7\u06be\u06d9\u06e4\u06e7\u06ef\u06f1\u06fd"+
		"\u06ff\u0703\u0708\u070b\u070f\u0712\u0728\u0732\u0741\u0751\u0755\u0766"+
		"\u0772\u0776\u0787\u078e\u0797\u07a9\u07ae\u07cc\u07d3\u07d8\u07e0\u07e5"+
		"\u07ed\u07f3\u07f9\u07fd\u0803\u0809\u080e\u0813\u0823\u0829\u082d\u0831"+
		"\u083c\u0848\u0854\u0868\u086f\u0878\u0884\u0894\u089b\u08a1\u08aa\u08af"+
		"\u08b5\u08bc\u08bf\u08c8\u08cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}