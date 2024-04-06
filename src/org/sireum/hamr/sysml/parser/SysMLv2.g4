// Auto-generated from https://raw.githubusercontent.com/Systems-Modeling/SysML-v2-Pilot-Implementation/%version/org.omg.sysml.xtext/src-gen/org/omg/sysml/xtext/parser/antlr/internal/InternalSysML.g
grammar SysMLv2;

entryRuleRootNamespace: ruleRootNamespace EOF;

ruleRootNamespace:  rulePackageBodyElement*;

ruleIdentification:
  '<' ruleName '>' ruleName? #ruleIdentification1
  | ruleName #ruleIdentification2;

ruleRelationshipBody:
  ';' #ruleRelationshipBody1
  | '{' ruleOwnedAnnotation* '}' #ruleRelationshipBody2;

ruleDependency: rulePrefixMetadataAnnotation* 'dependency' (ruleIdentification? 'from')? ruleQualifiedName (',' ruleQualifiedName)* 'to' ruleQualifiedName (',' ruleQualifiedName)* ruleRelationshipBody;

ruleAnnotation: ruleQualifiedName;

ruleOwnedAnnotation: ruleAnnotatingElement;

ruleAnnotatingMember: ruleAnnotatingElement;

ruleAnnotatingElement:
  ruleComment #ruleAnnotatingElement1
  | ruleDocumentation #ruleAnnotatingElement2
  | ruleTextualRepresentation #ruleAnnotatingElement3
  | ruleMetadataUsage #ruleAnnotatingElement4;

ruleComment: ('comment' ruleIdentification? ('about' ruleAnnotation (',' ruleAnnotation)*)?)? RULE_REGULAR_COMMENT;

ruleDocumentation: 'doc' ruleIdentification? RULE_REGULAR_COMMENT;

ruleTextualRepresentation: ('rep' ruleIdentification?)? 'language' RULE_STRING_VALUE RULE_REGULAR_COMMENT;

ruleMetadataKeyword: 'metadata';

ruleMetadataDefKeyword: ruleMetadataKeyword 'def';

ruleMetadataUsageKeyword:
  ruleMetadataKeyword #ruleMetadataUsageKeyword1
  | '@' #ruleMetadataUsageKeyword2;

ruleMetadataDefinition: 'abstract'? ruleMetadataDefKeyword ruleDefinition;

rulePrefixMetadataAnnotation: '#' rulePrefixMetadataUsage;

rulePrefixMetadataMember: '#' rulePrefixMetadataUsage;

rulePrefixMetadataUsage: ruleMetadataTyping;

ruleMetadataUsage: ruleMetadataUsageKeyword ruleMetadataUsageDeclaration ('about' ruleAnnotation (',' ruleAnnotation)*)? ruleMetadataBody;

ruleMetadataUsageDeclaration: (ruleIdentification? ruleDefinedByKeyword)? ruleMetadataTyping;

ruleMetadataTyping: ruleQualifiedName;

ruleMetadataBody:
  ';' #ruleMetadataBody1
  | '{' (ruleDefinitionMember | ruleMetadataBodyUsageMember | ruleAliasMember | ruleImport)* '}' #ruleMetadataBody2;

ruleMetadataBodyUsageMember: ruleMetadataBodyUsage;

ruleMetadataBodyUsage: 'ref'? (':>>' | 'redefines')? ruleOwnedRedefinition ruleFeatureSpecializationPart? ruleValuePart? ruleMetadataBody;

rulePackage: rulePrefixMetadataMember* rulePackageDeclaration rulePackageBody;

ruleLibraryPackage: 'standard'? 'library' rulePrefixMetadataMember* rulePackageDeclaration rulePackageBody;

rulePackageDeclaration: 'package' ruleIdentification?;

rulePackageBody:
  ';' #rulePackageBody1
  | '{' (rulePackageMember | ruleElementFilterMember | ruleAliasMember | ruleImport)* '}' #rulePackageBody2;

rulePackageBodyElement:
  rulePackageMember #rulePackageBodyElement1
  | ruleElementFilterMember #rulePackageBodyElement2
  | ruleAliasMember #rulePackageBodyElement3
  | ruleImport #rulePackageBodyElement4;

ruleMemberPrefix: ruleVisibilityIndicator?;

rulePackageMember: ruleMemberPrefix (ruleDefinitionElement | ruleUsageElement);

ruleElementFilterMember: ruleMemberPrefix 'filter' ruleOwnedExpression ';';

ruleAliasMember: ruleMemberPrefix 'alias' ('<' ruleName '>')? ruleName? 'for' ruleQualifiedName ruleRelationshipBody;

ruleImportPrefix: ruleVisibilityIndicator? 'import' 'all'?;

ruleImport: (ruleMembershipImport | ruleNamespaceImport) ruleRelationshipBody;

ruleMembershipImport: ruleImportPrefix ruleImportedMembership;

ruleImportedMembership: ruleQualifiedName ('::' '**')?;

ruleNamespaceImport: ruleImportPrefix (ruleImportedNamespace | ruleFilterPackage);

ruleImportedNamespace: ruleQualifiedName '::' '*' ('::' '**')?;

ruleFilterPackage: ruleFilterPackageImport ruleFilterPackageMember+;

ruleFilterPackageImport:
  ruleFilterPackageMembershipImport #ruleFilterPackageImport1
  | ruleFilterPackageNamespaceImport #ruleFilterPackageImport2;

ruleFilterPackageMembershipImport: ruleImportedMembership;

ruleFilterPackageNamespaceImport: ruleImportedNamespace;

ruleFilterPackageMember: ruleFilterPackageMemberVisibility ruleOwnedExpression ']';

ruleDefinitionElement:
  rulePackage #ruleDefinitionElement1
  | ruleLibraryPackage #ruleDefinitionElement2
  | ruleAnnotatingElement #ruleDefinitionElement3
  | ruleDependency #ruleDefinitionElement4
  | ruleAttributeDefinition #ruleDefinitionElement5
  | ruleEnumerationDefinition #ruleDefinitionElement6
  | ruleOccurrenceDefinition #ruleDefinitionElement7
  | ruleIndividualDefinition #ruleDefinitionElement8
  | ruleItemDefinition #ruleDefinitionElement9
  | ruleMetadataDefinition #ruleDefinitionElement10
  | rulePartDefinition #ruleDefinitionElement11
  | ruleConnectionDefinition #ruleDefinitionElement12
  | ruleFlowConnectionDefinition #ruleDefinitionElement13
  | ruleInterfaceDefinition #ruleDefinitionElement14
  | ruleAllocationDefinition #ruleDefinitionElement15
  | rulePortDefinition #ruleDefinitionElement16
  | ruleActionDefinition #ruleDefinitionElement17
  | ruleCalculationDefinition #ruleDefinitionElement18
  | ruleStateDefinition #ruleDefinitionElement19
  | ruleConstraintDefinition #ruleDefinitionElement20
  | ruleRequirementDefinition #ruleDefinitionElement21
  | ruleConcernDefinition #ruleDefinitionElement22
  | ruleCaseDefinition #ruleDefinitionElement23
  | ruleAnalysisCaseDefinition #ruleDefinitionElement24
  | ruleVerificationCaseDefinition #ruleDefinitionElement25
  | ruleUseCaseDefinition #ruleDefinitionElement26
  | ruleViewDefinition #ruleDefinitionElement27
  | ruleViewpointDefinition #ruleDefinitionElement28
  | ruleRenderingDefinition #ruleDefinitionElement29
  | ruleExtendedDefinition #ruleDefinitionElement30;

ruleUsageElement:
  ruleNonOccurrenceUsageElement #ruleUsageElement1
  | ruleOccurrenceUsageElement #ruleUsageElement2;

ruleSubclassificationPart: ruleSpecializesKeyword ruleOwnedSubclassification (',' ruleOwnedSubclassification)*;

ruleSpecializesKeyword:
  ':>' #ruleSpecializesKeyword1
  | 'specializes' #ruleSpecializesKeyword2;

ruleOwnedSubclassification: ruleQualifiedName;

ruleFeatureDeclaration:
  ruleIdentification ruleFeatureSpecializationPart? #ruleFeatureDeclaration1
  | ruleFeatureSpecializationPart #ruleFeatureDeclaration2;

ruleFeatureSpecializationPart:
  ruleFeatureSpecialization+ ruleMultiplicityPart? ruleFeatureSpecialization* #ruleFeatureSpecializationPart1
  | ruleMultiplicityPart ruleFeatureSpecialization* #ruleFeatureSpecializationPart2;

ruleMultiplicityPart:
  ruleOwnedMultiplicity #ruleMultiplicityPart1
  | ruleOwnedMultiplicity? ('ordered' 'nonunique'? | 'nonunique' 'ordered'?) #ruleMultiplicityPart2;

ruleFeatureSpecialization:
  ruleTypings #ruleFeatureSpecialization1
  | ruleSubsettings #ruleFeatureSpecialization2
  | ruleReferences #ruleFeatureSpecialization3
  | ruleRedefinitions #ruleFeatureSpecialization4;

ruleTypings: ruleTypedBy (',' ruleFeatureTyping)*;

ruleTypedBy: ruleDefinedByKeyword ruleFeatureTyping;

ruleDefinedByKeyword:
  ':' #ruleDefinedByKeyword1
  | 'defined' 'by' #ruleDefinedByKeyword2;

ruleSubsettings: ruleSubsets (',' ruleOwnedSubsetting)*;

ruleSubsets: ruleSubsetsKeyword ruleOwnedSubsetting;

ruleSubsetsKeyword:
  ':>' #ruleSubsetsKeyword1
  | 'subsets' #ruleSubsetsKeyword2;

ruleReferences: ruleReferencesKeyword ruleOwnedReferenceSubsetting;

ruleReferencesKeyword:
  '::>' #ruleReferencesKeyword1
  | 'references' #ruleReferencesKeyword2;

ruleRedefinitions: ruleRedefines (',' ruleOwnedRedefinition)*;

ruleRedefines: ruleRedefinesKeyword ruleOwnedRedefinition;

ruleRedefinesKeyword:
  ':>>' #ruleRedefinesKeyword1
  | 'redefines' #ruleRedefinesKeyword2;

ruleFeatureTyping:
  ruleOwnedFeatureTyping #ruleFeatureTyping1
  | ruleConjugatedPortTyping #ruleFeatureTyping2;

ruleOwnedSubsetting:
  ruleQualifiedName #ruleOwnedSubsetting1
  | ruleOwnedFeatureChain #ruleOwnedSubsetting2;

ruleOwnedReferenceSubsetting:
  ruleQualifiedName #ruleOwnedReferenceSubsetting1
  | ruleOwnedFeatureChain #ruleOwnedReferenceSubsetting2;

ruleOwnedRedefinition:
  ruleQualifiedName #ruleOwnedRedefinition1
  | ruleOwnedFeatureChain #ruleOwnedRedefinition2;

ruleOwnedMultiplicity: ruleMultiplicityRange;

ruleMultiplicityRange: '[' ruleMultiplicityExpressionMember ('..' ruleMultiplicityExpressionMember)? ']';

ruleMultiplicityExpressionMember: (ruleLiteralExpression | ruleFeatureReferenceExpression);

ruleBasicDefinitionPrefix:
  'abstract' #ruleBasicDefinitionPrefix1
  | 'variation' #ruleBasicDefinitionPrefix2;

ruleDefinitionExtensionKeyword: rulePrefixMetadataMember;

ruleDefinitionPrefix: ruleBasicDefinitionPrefix? ruleDefinitionExtensionKeyword*;

ruleDefinition: ruleDefinitionDeclaration ruleDefinitionBody;

ruleDefinitionDeclaration: ruleIdentification? ruleSubclassificationPart?;

ruleDefinitionBody:
  ';' #ruleDefinitionBody1
  | '{' ruleDefinitionBodyItem* '}' #ruleDefinitionBody2;

ruleDefinitionBodyItem:
  ruleDefinitionMember #ruleDefinitionBodyItem1
  | ruleVariantUsageMember #ruleDefinitionBodyItem2
  | ruleNonOccurrenceUsageMember #ruleDefinitionBodyItem3
  | ruleEmptySuccessionMember? ruleOccurrenceUsageMember #ruleDefinitionBodyItem4
  | ruleAliasMember #ruleDefinitionBodyItem5
  | ruleImport #ruleDefinitionBodyItem6;

ruleDefinitionMember: ruleMemberPrefix ruleDefinitionElement;

ruleVariantUsageMember: ruleMemberPrefix 'variant' ruleVariantUsageElement;

ruleNonOccurrenceUsageMember: ruleMemberPrefix ruleNonOccurrenceUsageElement;

ruleOccurrenceUsageMember: ruleMemberPrefix ruleOccurrenceUsageElement;

ruleStructureUsageMember: ruleMemberPrefix ruleStructureUsageElement;

ruleBehaviorUsageMember: ruleMemberPrefix ruleBehaviorUsageElement;

ruleRefPrefix: ruleFeatureDirection? ('abstract' | 'variation')? 'readonly'? 'derived'? 'end'?;

ruleBasicUsagePrefix: ruleRefPrefix 'ref'?;

ruleUsageExtensionKeyword: rulePrefixMetadataMember;

ruleUsagePrefix: ruleBasicUsagePrefix ruleUsageExtensionKeyword*;

ruleUsage: ruleUsageDeclaration? ruleUsageCompletion;

ruleUsageDeclaration: ruleFeatureDeclaration;

ruleUsageCompletion: ruleValuePart? ruleUsageBody;

ruleUsageBody: ruleDefinitionBody;

ruleValuePart:
  ruleFeatureValue #ruleValuePart1
  | ruleFeatureValueExpression ruleEmptyAssignmentActionMember #ruleValuePart2;

ruleFeatureValue: ('=' | 'default' ('=' | ':=')?) ruleOwnedExpression;

ruleFeatureValueExpression: ':=' ruleOwnedExpression;

ruleEmptyAssignmentActionMember: ruleEmptyAssignmentAction;

ruleEmptyAssignmentAction: ruleEmptyTargetMember ruleEmptyParameterMember;

ruleEmptyTargetMember: ruleEmptyTargetParameter;

ruleEmptyTargetParameter: ruleTargetFeatureMember;

ruleReferenceKeyword: 'ref';

ruleReferenceUsageKeyword: ruleReferenceKeyword;

ruleDefaultReferenceUsage: ruleRefPrefix ruleUsageDeclaration ruleValuePart? ruleUsageBody;

ruleReferenceUsage: ruleRefPrefix ruleReferenceUsageKeyword ruleUsage;

ruleVariantReference: ruleOwnedReferenceSubsetting ruleFeatureSpecialization* ruleUsageBody;

ruleNonOccurrenceUsageElement:
  ruleDefaultReferenceUsage #ruleNonOccurrenceUsageElement1
  | ruleReferenceUsage #ruleNonOccurrenceUsageElement2
  | ruleAttributeUsage #ruleNonOccurrenceUsageElement3
  | ruleEnumerationUsage #ruleNonOccurrenceUsageElement4
  | ruleBindingConnector #ruleNonOccurrenceUsageElement5
  | ruleSuccession #ruleNonOccurrenceUsageElement6
  | ruleExtendedUsage #ruleNonOccurrenceUsageElement7;

ruleOccurrenceUsageElement:
  ruleStructureUsageElement #ruleOccurrenceUsageElement1
  | ruleBehaviorUsageElement #ruleOccurrenceUsageElement2;

ruleStructureUsageElement:
  ruleOccurrenceUsage #ruleStructureUsageElement1
  | ruleIndividualUsage #ruleStructureUsageElement2
  | rulePortionUsage #ruleStructureUsageElement3
  | ruleEventOccurrenceUsage #ruleStructureUsageElement4
  | ruleItemUsage #ruleStructureUsageElement5
  | rulePartUsage #ruleStructureUsageElement6
  | ruleViewUsage #ruleStructureUsageElement7
  | ruleRenderingUsage #ruleStructureUsageElement8
  | rulePortUsage #ruleStructureUsageElement9
  | ruleConnectionUsage #ruleStructureUsageElement10
  | ruleInterfaceUsage #ruleStructureUsageElement11
  | ruleAllocationUsage #ruleStructureUsageElement12
  | ruleMessage #ruleStructureUsageElement13
  | ruleFlowConnectionUsage #ruleStructureUsageElement14
  | ruleSuccessionFlowConnectionUsage #ruleStructureUsageElement15;

ruleBehaviorUsageElement:
  ruleActionUsage #ruleBehaviorUsageElement1
  | ruleCalculationUsage #ruleBehaviorUsageElement2
  | ruleStateUsage #ruleBehaviorUsageElement3
  | ruleConstraintUsage #ruleBehaviorUsageElement4
  | ruleRequirementUsage #ruleBehaviorUsageElement5
  | ruleConcernUsage #ruleBehaviorUsageElement6
  | ruleCaseUsage #ruleBehaviorUsageElement7
  | ruleAnalysisCaseUsage #ruleBehaviorUsageElement8
  | ruleVerificationCaseUsage #ruleBehaviorUsageElement9
  | ruleUseCaseUsage #ruleBehaviorUsageElement10
  | ruleViewpointUsage #ruleBehaviorUsageElement11
  | rulePerformActionUsage #ruleBehaviorUsageElement12
  | ruleExhibitStateUsage #ruleBehaviorUsageElement13
  | ruleIncludeUseCaseUsage #ruleBehaviorUsageElement14
  | ruleAssertConstraintUsage #ruleBehaviorUsageElement15
  | ruleSatisfyRequirementUsage #ruleBehaviorUsageElement16;

ruleVariantUsageElement:
  ruleVariantReference #ruleVariantUsageElement1
  | ruleReferenceUsage #ruleVariantUsageElement2
  | ruleAttributeUsage #ruleVariantUsageElement3
  | ruleBindingConnector #ruleVariantUsageElement4
  | ruleSuccession #ruleVariantUsageElement5
  | ruleOccurrenceUsage #ruleVariantUsageElement6
  | ruleIndividualUsage #ruleVariantUsageElement7
  | rulePortionUsage #ruleVariantUsageElement8
  | ruleEventOccurrenceUsage #ruleVariantUsageElement9
  | ruleItemUsage #ruleVariantUsageElement10
  | rulePartUsage #ruleVariantUsageElement11
  | ruleViewUsage #ruleVariantUsageElement12
  | ruleRenderingUsage #ruleVariantUsageElement13
  | rulePortUsage #ruleVariantUsageElement14
  | ruleConnectionUsage #ruleVariantUsageElement15
  | ruleInterfaceUsage #ruleVariantUsageElement16
  | ruleAllocationUsage #ruleVariantUsageElement17
  | ruleMessage #ruleVariantUsageElement18
  | ruleFlowConnectionUsage #ruleVariantUsageElement19
  | ruleSuccessionFlowConnectionUsage #ruleVariantUsageElement20
  | ruleBehaviorUsageElement #ruleVariantUsageElement21;

ruleExtendedDefinition: ruleBasicDefinitionPrefix? ruleDefinitionExtensionKeyword+ 'def' ruleDefinition;

ruleExtendedUsage: ruleBasicUsagePrefix ruleUsageExtensionKeyword+ ruleUsage;

ruleAttributeKeyword: 'attribute';

ruleAttributeDefKeyword: ruleAttributeKeyword 'def';

ruleAttributeUsageKeyword: ruleAttributeKeyword;

ruleAttributeDefinition: ruleDefinitionPrefix ruleAttributeDefKeyword ruleDefinition;

ruleAttributeUsage: ruleUsagePrefix ruleAttributeUsageKeyword ruleUsage;

ruleEnumerationKeyword: 'enum';

ruleEnumerationDefKeyword: ruleEnumerationKeyword 'def';

ruleEnumerationUsageKeyword: ruleEnumerationKeyword;

ruleEnumerationDefinition: ruleEnumerationDefKeyword ruleDefinitionDeclaration ruleEnumerationBody;

ruleEnumerationBody:
  ';' #ruleEnumerationBody1
  | '{' (ruleAnnotatingMember | ruleEnumerationUsageMember)* '}' #ruleEnumerationBody2;

ruleEnumerationUsageMember: ruleMemberPrefix ruleEnumeratedValue;

ruleEnumeratedValue: ruleEnumerationUsageKeyword? ruleUsage;

ruleEnumerationUsage: ruleUsagePrefix ruleEnumerationUsageKeyword ruleUsage;

ruleOccurrenceKeyword: 'occurrence';

ruleOccurrenceDefKeyword: ruleOccurrenceKeyword 'def';

ruleOccurrenceDefinitionPrefix: ruleBasicDefinitionPrefix? ('individual' ruleLifeClassMembership)? ruleDefinitionExtensionKeyword*;

ruleOccurrenceDefinition: ruleOccurrenceDefinitionPrefix ruleOccurrenceDefKeyword ruleDefinition;

ruleIndividualDefinition: ruleBasicDefinitionPrefix? 'individual' ruleDefinitionExtensionKeyword* 'def' ruleDefinition ruleLifeClassMembership;

ruleLifeClassMembership: ruleLifeClass;

ruleLifeClass: ;

ruleOccurrenceUsageKeyword: ruleOccurrenceKeyword;

ruleOccurrenceUsagePrefix: ruleBasicUsagePrefix 'individual'? rulePortionKind? ruleUsageExtensionKeyword*;

ruleOccurrenceUsage: ruleOccurrenceUsagePrefix ruleOccurrenceUsageKeyword ruleUsage;

ruleIndividualUsage: ruleBasicUsagePrefix 'individual' ruleUsageExtensionKeyword* ruleUsage;

rulePortionUsage: ruleBasicUsagePrefix 'individual'? rulePortionKind ruleUsageExtensionKeyword* ruleUsage;

ruleEventOccurrenceUsage: ruleOccurrenceUsagePrefix 'event' (ruleOwnedReferenceSubsetting ruleFeatureSpecializationPart? | ruleOccurrenceUsageKeyword ruleUsageDeclaration?) ruleUsageCompletion;

ruleEmptySuccessionMember: ruleEmptySuccession;

ruleEmptySuccession: 'then' ruleMultiplicitySourceEndMember ruleEmptyTargetEndMember;

ruleMultiplicitySourceEndMember: ruleMultiplicitySourceEnd;

ruleMultiplicitySourceEnd:  ruleOwnedMultiplicity?;

ruleEmptyTargetEndMember: ruleEmptyTargetEnd;

ruleEmptyTargetEnd: ;

ruleItemKeyword: 'item';

ruleItemDefKeyword: ruleItemKeyword 'def';

ruleItemUsageKeyword: ruleItemKeyword;

ruleItemDefinition: ruleOccurrenceDefinitionPrefix ruleItemDefKeyword ruleDefinition;

ruleItemUsage: ruleOccurrenceUsagePrefix ruleItemUsageKeyword ruleUsage;

rulePartKeyword: 'part';

rulePartDefKeyword: rulePartKeyword 'def';

rulePartUsageKeyword: rulePartKeyword;

rulePartDefinition: ruleOccurrenceDefinitionPrefix rulePartDefKeyword ruleDefinition;

rulePartUsage: ruleOccurrenceUsagePrefix rulePartUsageKeyword ruleUsage;

rulePortKeyword: 'port';

rulePortDefKeyword: rulePortKeyword 'def';

rulePortDefinition: ruleDefinitionPrefix rulePortDefKeyword ruleDefinition ruleConjugatedPortDefinitionMember;

ruleConjugatedPortDefinitionMember: ruleConjugatedPortDefinition;

ruleConjugatedPortDefinition: rulePortConjugation;

rulePortConjugation: ;

ruleConjugatedPortTyping: ruleConjugatedQualifiedName;

ruleConjugatedQualifiedName: '~' ruleQualifiedName;

rulePortUsageKeyword: rulePortKeyword;

rulePortUsage: ruleOccurrenceUsagePrefix rulePortUsageKeyword ruleUsage;

ruleConnectorEndMember: ruleConnectorEnd;

ruleConnectorEnd: (ruleName ruleReferencesKeyword)? ruleOwnedReferenceSubsetting ruleOwnedMultiplicity?;

ruleBindingKeyword: 'binding';

ruleBindingConnector: ruleUsagePrefix (ruleBindingKeyword ruleUsageDeclaration?)? 'bind' ruleConnectorEndMember '=' ruleConnectorEndMember ruleDefinitionBody;

ruleSuccessionKeyword: 'succession';

ruleSuccession: ruleUsagePrefix (ruleSuccessionKeyword ruleUsageDeclaration?)? 'first' ruleConnectorEndMember 'then' ruleConnectorEndMember ruleDefinitionBody;

ruleConnectionKeyword: 'connection';

ruleConnectionDefKeyword: ruleConnectionKeyword 'def';

ruleConnectionDefinition: ruleOccurrenceDefinitionPrefix ruleConnectionDefKeyword ruleDefinition;

ruleConnectorKeyword: 'connect';

ruleConnectionUsageKeyword: ruleConnectionKeyword;

ruleConnectionUsage: ruleOccurrenceUsagePrefix (ruleConnectionUsageKeyword ruleUsageDeclaration? (ruleConnectorKeyword ruleConnectorPart)? | ruleConnectorKeyword ruleConnectorPart) ruleUsageBody;

ruleConnectorPart:
  ruleBinaryConnectorPart #ruleConnectorPart1
  | ruleNaryConnectorPart #ruleConnectorPart2;

ruleBinaryConnectorPart: ruleConnectorEndMember 'to' ruleConnectorEndMember;

ruleNaryConnectorPart: '(' ruleConnectorEndMember ',' ruleConnectorEndMember (',' ruleConnectorEndMember)* ')';

ruleEmptySourceEndMember: ruleEmptySourceEnd;

ruleEmptySourceEnd: ;

ruleFlowConnectionKeyword: 'flow';

ruleFlowConnectionDefKeyword: ruleFlowConnectionKeyword 'def';

ruleFlowConnectionDefinition: ruleOccurrenceDefinitionPrefix ruleFlowConnectionDefKeyword ruleDefinition;

ruleMessageKeyword: 'message';

ruleMessage: ruleOccurrenceUsagePrefix ruleMessageKeyword ruleMessageDeclaration ruleDefinitionBody;

ruleMessageDeclaration:
  ruleUsageDeclaration? ruleValuePart? ('of' ruleItemFeatureMember)? ('from' ruleMessageEventMember 'to' ruleMessageEventMember)? #ruleMessageDeclaration1
  | ruleMessageEventMember 'to' ruleMessageEventMember #ruleMessageDeclaration2;

ruleMessageEventMember: ruleMessageEvent;

ruleMessageEvent: ruleOwnedReferenceSubsetting;

ruleFlowConnectionUsage: ruleOccurrenceUsagePrefix ruleFlowConnectionKeyword ruleFlowConnectionDeclaration ruleDefinitionBody;

ruleSuccessionFlowConnectionKeyword: ruleSuccessionKeyword ruleFlowConnectionKeyword;

ruleSuccessionFlowConnectionUsage: ruleOccurrenceUsagePrefix ruleSuccessionFlowConnectionKeyword ruleFlowConnectionDeclaration ruleDefinitionBody;

ruleFlowConnectionDeclaration:
  ruleUsageDeclaration? ruleValuePart? ('of' ruleItemFeatureMember)? ('from' ruleFlowEndMember 'to' ruleFlowEndMember)? #ruleFlowConnectionDeclaration1
  | ruleFlowEndMember 'to' ruleFlowEndMember #ruleFlowConnectionDeclaration2;

ruleItemFeatureMember: ruleItemFeature;

ruleItemFeature: rulePayloadFeature;

rulePayloadFeature:
  ruleIdentification? rulePayloadFeatureSpecializationPart ruleValuePart? #rulePayloadFeature1
  | ruleIdentification? ruleValuePart #rulePayloadFeature2
  | ruleOwnedFeatureTyping ruleOwnedMultiplicity? #rulePayloadFeature3
  | ruleOwnedMultiplicity ruleOwnedFeatureTyping #rulePayloadFeature4;

rulePayloadFeatureSpecializationPart:
  ruleFeatureSpecialization+ ruleMultiplicityPart? ruleFeatureSpecialization* #rulePayloadFeatureSpecializationPart1
  | ruleMultiplicityPart ruleFeatureSpecialization+ #rulePayloadFeatureSpecializationPart2;

ruleFlowEndMember: ruleFlowEnd;

ruleFlowEnd: ruleFlowEndSubsetting? ruleFlowFeatureMember;

ruleFlowEndSubsetting:
  ruleQualifiedName '.' #ruleFlowEndSubsetting1
  | ruleFeatureChainPrefix #ruleFlowEndSubsetting2;

ruleFeatureChainPrefix: (ruleOwnedFeatureChaining '.')+ ruleOwnedFeatureChaining '.';

ruleFlowFeatureMember: ruleFlowFeature;

ruleFlowFeature: ruleFlowRedefinition;

ruleFlowRedefinition: ruleQualifiedName;

ruleInterfaceKeyword: 'interface';

ruleInterfaceDefKeyword: ruleInterfaceKeyword 'def';

ruleInterfaceDefinition: ruleOccurrenceDefinitionPrefix ruleInterfaceDefKeyword ruleDefinitionDeclaration ruleInterfaceBody;

ruleInterfaceBody:
  ';' #ruleInterfaceBody1
  | '{' ruleInterfaceBodyItem* '}' #ruleInterfaceBody2;

ruleInterfaceBodyItem:
  ruleDefinitionMember #ruleInterfaceBodyItem1
  | ruleVariantUsageMember #ruleInterfaceBodyItem2
  | ruleInterfaceNonOccurrenceUsageMember #ruleInterfaceBodyItem3
  | ruleEmptySuccessionMember? ruleInterfaceOccurrenceUsageMember #ruleInterfaceBodyItem4
  | ruleAliasMember #ruleInterfaceBodyItem5
  | ruleImport #ruleInterfaceBodyItem6;

ruleInterfaceNonOccurrenceUsageMember: ruleMemberPrefix ruleInterfaceNonOccurrenceUsageElement;

ruleInterfaceNonOccurrenceUsageElement:
  ruleReferenceUsage #ruleInterfaceNonOccurrenceUsageElement1
  | ruleAttributeUsage #ruleInterfaceNonOccurrenceUsageElement2
  | ruleEnumerationUsage #ruleInterfaceNonOccurrenceUsageElement3
  | ruleBindingConnector #ruleInterfaceNonOccurrenceUsageElement4
  | ruleSuccession #ruleInterfaceNonOccurrenceUsageElement5;

ruleInterfaceOccurrenceUsageMember: ruleMemberPrefix ruleInterfaceOccurrenceUsageElement;

ruleInterfaceOccurrenceUsageElement:
  ruleDefaultInterfaceEnd #ruleInterfaceOccurrenceUsageElement1
  | ruleStructureUsageElement #ruleInterfaceOccurrenceUsageElement2
  | ruleBehaviorUsageElement #ruleInterfaceOccurrenceUsageElement3;

ruleDefaultInterfaceEnd: ruleFeatureDirection? ('abstract' | 'variation')? 'end' ruleUsage;

ruleInterfaceUsageKeyword: ruleInterfaceKeyword;

ruleInterfaceUsage: ruleOccurrenceUsagePrefix ruleInterfaceUsageKeyword ruleInterfaceUsageDeclaration ruleInterfaceBody;

ruleInterfaceUsageDeclaration:
  ruleUsageDeclaration? (ruleConnectorKeyword ruleInterfacePart)? #ruleInterfaceUsageDeclaration1
  | ruleInterfacePart #ruleInterfaceUsageDeclaration2;

ruleInterfacePart:
  ruleBinaryInterfacePart #ruleInterfacePart1
  | ruleNaryInterfacePart #ruleInterfacePart2;

ruleBinaryInterfacePart: ruleInterfaceEndMember 'to' ruleInterfaceEndMember;

ruleNaryInterfacePart: '(' ruleInterfaceEndMember ',' ruleInterfaceEndMember (',' ruleInterfaceEndMember)* ')';

ruleInterfaceEndMember: ruleInterfaceEnd;

ruleInterfaceEnd: (ruleName ruleReferencesKeyword)? ruleOwnedReferenceSubsetting ruleOwnedMultiplicity?;

ruleAllocationKeyword: 'allocation';

ruleAllocationDefKeyword: ruleAllocationKeyword 'def';

ruleAllocationDefinition: ruleOccurrenceDefinitionPrefix ruleAllocationDefKeyword ruleDefinition;

ruleAllocationUsageKeyword: ruleAllocationKeyword;

ruleAllocateKeyword: 'allocate';

ruleAllocationUsage: ruleOccurrenceUsagePrefix ruleAllocationUsageDeclaration ruleUsageBody;

ruleAllocationUsageDeclaration:
  ruleAllocationUsageKeyword ruleUsageDeclaration? (ruleAllocateKeyword ruleConnectorPart)? #ruleAllocationUsageDeclaration1
  | ruleAllocateKeyword ruleConnectorPart #ruleAllocationUsageDeclaration2;

ruleActionKeyword: 'action';

ruleActionDefKeyword: ruleActionKeyword 'def';

ruleActionDefinition: ruleOccurrenceDefinitionPrefix ruleActionDefKeyword ruleDefinitionDeclaration ruleActionBody;

ruleActionBody:
  ';' #ruleActionBody1
  | '{' ruleActionBodyItem* '}' #ruleActionBody2;

ruleActionBodyItem:
  ruleImport #ruleActionBodyItem1
  | ruleAliasMember #ruleActionBodyItem2
  | ruleDefinitionMember #ruleActionBodyItem3
  | ruleVariantUsageMember #ruleActionBodyItem4
  | ruleNonOccurrenceUsageMember #ruleActionBodyItem5
  | ruleEmptySuccessionMember? ruleStructureUsageMember #ruleActionBodyItem6
  | ruleInitialNodeMember ruleTargetSuccessionMember* #ruleActionBodyItem7
  | ruleEmptySuccessionMember? (ruleBehaviorUsageMember | ruleActionNodeMember) ruleTargetSuccessionMember* #ruleActionBodyItem8
  | ruleGuardedSuccessionMember #ruleActionBodyItem9;

ruleInitialNodeMember: ruleMemberPrefix 'first' ruleQualifiedName ruleRelationshipBody;

ruleActionNodeMember: ruleMemberPrefix ruleActionNode;

ruleTargetSuccessionMember: ruleMemberPrefix ruleActionTargetSuccession;

ruleGuardedSuccessionMember: ruleGuardedSuccession;

ruleActionUsageKeyword: ruleActionKeyword;

ruleActionUsage: ruleOccurrenceUsagePrefix ruleActionUsageKeyword ruleActionUsageDeclaration ruleActionBody;

rulePerformActionUsage: ruleOccurrenceUsagePrefix 'perform' rulePerformActionUsageDeclaration ruleActionBody;

rulePerformActionUsageDeclaration: (ruleOwnedReferenceSubsetting ruleFeatureSpecializationPart? | ruleActionUsageKeyword ruleUsageDeclaration?) ruleValuePart?;

ruleActionUsageDeclaration: ruleUsageDeclaration? ruleValuePart?;

ruleActionNode:
  ruleSendNode #ruleActionNode1
  | ruleAcceptNode #ruleActionNode2
  | ruleAssignmentNode #ruleActionNode3
  | ruleIfNode #ruleActionNode4
  | ruleWhileLoopNode #ruleActionNode5
  | ruleForLoopNode #ruleActionNode6
  | ruleControlNode #ruleActionNode7;

ruleActionNodeUsageDeclaration: ruleActionUsageKeyword ruleUsageDeclaration?;

ruleActionNodePrefix: ruleOccurrenceUsagePrefix ruleActionNodeUsageDeclaration?;

ruleAcceptNode: ruleOccurrenceUsagePrefix ruleAcceptNodeDeclaration ruleActionBody;

ruleAcceptNodeDeclaration: ruleActionNodeUsageDeclaration? 'accept' ruleAcceptParameterPart;

ruleAcceptParameterPart: rulePayloadParameterMember ('via' ruleNodeParameterMember | ruleEmptyParameterMember);

rulePayloadParameterMember: rulePayloadParameter;

rulePayloadParameter:
  rulePayloadFeature #rulePayloadParameter1
  | ruleIdentification? rulePayloadFeatureSpecializationPart? ruleTriggerValuePart #rulePayloadParameter2;

ruleTriggerValuePart: ruleTriggerFeatureValue;

ruleTriggerFeatureValue: ruleTriggerExpression;

ruleTriggerExpression:
  ruleTimeTriggerKind ruleOwnedExpressionMember #ruleTriggerExpression1
  | ruleChangeTriggerKind ruleChangeExpressionMember #ruleTriggerExpression2;

ruleTimeTriggerKind:
  'at' #ruleTimeTriggerKind1
  | 'after' #ruleTimeTriggerKind2;

ruleChangeTriggerKind: 'when';

ruleChangeExpressionMember: ruleChangeExpression;

ruleChangeExpression: ruleChangeResultExpressionMember;

ruleChangeResultExpressionMember: ruleOwnedExpression;

ruleSendNode: ruleOccurrenceUsagePrefix ruleSendNodeDeclaration ruleActionBody;

ruleSendNodeDeclaration: ruleActionNodeUsageDeclaration? 'send' ruleNodeParameterMember ('via' ruleNodeParameterMember | ruleEmptyParameterMember) ('to' ruleNodeParameterMember | ruleEmptyParameterMember);

ruleNodeParameterMember: ruleNodeParameter;

ruleNodeParameter:  ruleFeatureBinding;

ruleFeatureBinding: ruleOwnedExpression;

ruleAssignmentNode: ruleOccurrenceUsagePrefix ruleAssignmentNodeDeclaration ruleActionBody;

ruleAssignmentNodeDeclaration: ruleActionNodeUsageDeclaration? 'assign' ruleAssignmentTargetMember ruleFeatureChainMember ':=' ruleNodeParameterMember;

ruleAssignmentTargetMember: ruleTargetParameter;

ruleTargetParameter: (ruleTargetBinding '.')? ruleTargetFeatureMember;

ruleTargetFeatureMember: ruleTargetFeature;

ruleTargetFeature: ruleTargetAccessedFeatureMember;

ruleTargetAccessedFeatureMember: ruleEmptyUsage;

ruleTargetBinding: ruleTargetExpression;

ruleTargetExpression: ruleBaseExpression (( '.' ruleFeatureChainMember)? ( '[' ruleSequenceExpression ']' |  '->' ruleReferenceTyping (ruleExpressionBodyMember | ruleFunctionReferenceMember | ruleArgumentList) |  '.' ruleExpressionBodyMember |  '.?' ruleExpressionBodyMember))*;

ruleExpressionParameterMember: ruleOwnedExpression;

ruleIfNode: ruleActionNodePrefix 'if' ruleExpressionParameterMember ruleActionBodyParameterMember ('else' (ruleActionBodyParameterMember | ruleIfNodeParameterMember))?;

ruleActionBodyParameterMember: ruleActionBodyParameter;

ruleActionBodyParameter:  (ruleActionUsageKeyword ruleUsageDeclaration?)? '{' ruleActionBodyItem* '}';

ruleIfNodeParameterMember: ruleIfNode;

ruleWhileLoopNode: ruleActionNodePrefix ('while' ruleExpressionParameterMember | 'loop' ruleEmptyParameterMember) ruleActionBodyParameterMember ('until' ruleExpressionParameterMember ';')?;

ruleForLoopNode: ruleActionNodePrefix 'for' ruleForVariableDeclarationMember 'in' ruleNodeParameterMember ruleActionBodyParameterMember;

ruleForVariableDeclarationMember: ruleForVariableDeclaration;

ruleForVariableDeclaration: ruleUsageDeclaration;

ruleControlNode:
  ruleMergeNode #ruleControlNode1
  | ruleDecisionNode #ruleControlNode2
  | ruleJoinNode #ruleControlNode3
  | ruleForkNode #ruleControlNode4;

ruleControlNodePrefix: ruleRefPrefix 'individual'? rulePortionKind?;

ruleMergeNode: ruleControlNodePrefix 'merge' ruleUsageDeclaration? ruleActionNodeBody;

ruleDecisionNode: ruleControlNodePrefix 'decide' ruleUsageDeclaration? ruleActionNodeBody;

ruleJoinNode: ruleControlNodePrefix 'join' ruleUsageDeclaration? ruleActionNodeBody;

ruleForkNode: ruleControlNodePrefix 'fork' ruleUsageDeclaration? ruleActionNodeBody;

ruleActionNodeBody:
  ';' #ruleActionNodeBody1
  | '{' ruleAnnotatingMember* '}' #ruleActionNodeBody2;

ruleEmptyParameterMember: ruleEmptyUsage;

ruleEmptyUsage: ;

ruleActionTargetSuccession: (ruleTargetSuccession | ruleGuardedTargetSuccession | ruleDefaultTargetSuccession) ruleUsageBody;

ruleTargetSuccession: 'then' ruleMultiplicitySourceEndMember ruleConnectorEndMember;

ruleGuardedTargetSuccession: ruleEmptyParameterMember ruleGuardExpressionMember 'then' ruleTransitionSuccessionMember;

ruleDefaultTargetSuccession: ruleEmptyParameterMember 'else' ruleTransitionSuccessionMember;

ruleGuardedSuccession: (ruleSuccessionKeyword ruleUsageDeclaration)? 'first' ruleTransitionSourceMember ruleEmptyParameterMember ruleGuardExpressionMember 'then' ruleTransitionSuccessionMember ruleUsageBody;

ruleStateKeyword: 'state';

ruleStateDefKeyword: ruleStateKeyword 'def';

ruleStateDefinition: ruleOccurrenceDefinitionPrefix ruleStateDefKeyword ruleDefinitionDeclaration ruleStateDefBody;

ruleStateDefBody:
  ';' #ruleStateDefBody1
  | 'parallel'? '{' ruleStateBodyPart '}' #ruleStateDefBody2;

ruleStateBodyPart: ruleStateBodyItem*;

ruleStateBodyItem:
  ruleImport #ruleStateBodyItem1
  | ruleAliasMember #ruleStateBodyItem2
  | ruleDefinitionMember #ruleStateBodyItem3
  | ruleVariantUsageMember #ruleStateBodyItem4
  | ruleNonOccurrenceUsageMember #ruleStateBodyItem5
  | ruleEmptySuccessionMember? ruleStructureUsageMember #ruleStateBodyItem6
  | ruleEmptySuccessionMember? ruleBehaviorUsageMember ruleTargetTransitionUsageMember* #ruleStateBodyItem7
  | ruleTransitionUsageMember #ruleStateBodyItem8
  | ruleEntryActionMember ruleEntryTransitionMember* #ruleStateBodyItem9
  | ruleDoActionMember #ruleStateBodyItem10
  | ruleExitActionMember #ruleStateBodyItem11;

ruleEntryActionMember: ruleMemberPrefix ruleEntryActionKind ruleStateActionUsage;

ruleEntryActionKind: 'entry';

ruleDoActionMember: ruleMemberPrefix ruleDoActionKind ruleStateActionUsage;

ruleDoActionKind: 'do';

ruleExitActionMember: ruleMemberPrefix ruleExitActionKind ruleStateActionUsage;

ruleExitActionKind: 'exit';

ruleEntryTransitionMember: ruleMemberPrefix (ruleGuardedTargetSuccession | 'then' ruleTransitionSuccession) ';';

ruleStateActionUsage:
  ruleEmptyActionUsage ';' #ruleStateActionUsage1
  | rulePerformedActionUsage ruleActionBody #ruleStateActionUsage2;

ruleEmptyActionUsage: ;

rulePerformedActionUsage:
   rulePerformActionUsageDeclaration #rulePerformedActionUsage1
  |  ruleAcceptNodeDeclaration #rulePerformedActionUsage2
  |  ruleSendNodeDeclaration #rulePerformedActionUsage3
  |  ruleAssignmentNodeDeclaration #rulePerformedActionUsage4;

ruleTransitionUsageMember: ruleMemberPrefix ruleTransitionUsage;

ruleTargetTransitionUsageMember: ruleMemberPrefix ruleTargetTransitionUsage;

ruleStateUsageKeyword: ruleStateKeyword;

ruleStateUsage: ruleOccurrenceUsagePrefix ruleStateUsageKeyword ruleActionUsageDeclaration ruleStateUsageBody;

ruleStateUsageBody:
  ';' #ruleStateUsageBody1
  | 'parallel'? '{' ruleStateBodyPart '}' #ruleStateUsageBody2;

ruleExhibitStateUsage: ruleOccurrenceUsagePrefix 'exhibit' (ruleOwnedReferenceSubsetting ruleFeatureSpecializationPart? | ruleStateUsageKeyword ruleUsageDeclaration?) ruleValuePart? ruleStateUsageBody;

ruleTransitionUsageKeyword: 'transition';

ruleTransitionUsage: ruleTransitionUsageKeyword (ruleUsageDeclaration? 'first')? ruleTransitionSourceMember ruleEmptyParameterMember (ruleEmptyParameterMember ruleTriggerActionMember)? ruleGuardExpressionMember? ruleEffectBehaviorMember? 'then' ruleTransitionSuccessionMember ruleActionBody;

ruleTargetTransitionUsage: ruleEmptyParameterMember (ruleTransitionUsageKeyword (ruleEmptyParameterMember ruleTriggerActionMember)? ruleGuardExpressionMember? ruleEffectBehaviorMember? | ruleEmptyParameterMember ruleTriggerActionMember ruleGuardExpressionMember? ruleEffectBehaviorMember? | ruleGuardExpressionMember ruleEffectBehaviorMember?)? 'then' ruleTransitionSuccessionMember ruleActionBody;

ruleTransitionSourceMember:
  ruleQualifiedName #ruleTransitionSourceMember1
  |  ruleOwnedFeatureChain #ruleTransitionSourceMember2;

ruleTriggerActionMember: ruleTriggerFeatureKind ruleTriggerAction;

ruleTriggerAction: ruleAcceptParameterPart;

ruleGuardExpressionMember: ruleGuardFeatureKind ruleOwnedExpression;

ruleEffectBehaviorMember: ruleEffectFeatureKind ruleEffectBehaviorUsage;

ruleEffectBehaviorUsage:
  ruleEmptyActionUsage #ruleEffectBehaviorUsage1
  | rulePerformedActionUsage ('{' ruleActionBodyItem* '}')? #ruleEffectBehaviorUsage2;

ruleTransitionSuccessionMember: ruleTransitionSuccession;

ruleTransitionSuccession: ruleEmptySourceEndMember ruleConnectorEndMember;

ruleCalculationKeyword: 'calc';

ruleCalculationDefKeyword: ruleCalculationKeyword 'def';

ruleCalculationDefinition: ruleOccurrenceDefinitionPrefix ruleCalculationDefKeyword ruleDefinitionDeclaration ruleCalculationBody;

ruleCalculationBody:
  ';' #ruleCalculationBody1
  | '{' ruleCalculationBodyPart '}' #ruleCalculationBody2;

ruleCalculationBodyPart: ruleCalculationBodyItem* ruleResultExpressionMember?;

ruleCalculationBodyItem:
  ruleActionBodyItem #ruleCalculationBodyItem1
  | ruleReturnParameterMember #ruleCalculationBodyItem2;

ruleReturnParameterMember: ruleMemberPrefix 'return' ruleUsageElement;

ruleResultExpressionMember: ruleMemberPrefix ruleOwnedExpression;

ruleCalculationUsageKeyword: ruleCalculationKeyword;

ruleCalculationUsage: ruleOccurrenceUsagePrefix ruleCalculationUsageKeyword ruleCalculationUsageDeclaration ruleCalculationBody;

ruleCalculationUsageDeclaration: ruleUsageDeclaration? ruleValuePart?;

ruleConstraintKeyword: 'constraint';

ruleConstraintDefKeyword: ruleConstraintKeyword 'def';

ruleConstraintDefinition: ruleOccurrenceDefinitionPrefix ruleConstraintDefKeyword ruleDefinitionDeclaration ruleCalculationBody;

ruleConstraintUsageKeyword: ruleConstraintKeyword;

ruleConstraintUsage: ruleOccurrenceUsagePrefix ruleConstraintUsageKeyword ruleCalculationUsageDeclaration ruleCalculationBody;

ruleAssertConstraintUsage: ruleOccurrenceUsagePrefix 'assert' 'not'? (ruleOwnedReferenceSubsetting ruleFeatureSpecializationPart? | ruleConstraintUsageKeyword ruleUsageDeclaration?) ruleCalculationBody;

ruleRequirementKeyword: 'requirement';

ruleRequirementDefKeyword: ruleRequirementKeyword 'def';

ruleRequirementDefinition: ruleOccurrenceDefinitionPrefix ruleRequirementDefKeyword ruleDefinitionDeclaration ruleRequirementBody;

ruleRequirementBody:
  ';' #ruleRequirementBody1
  | '{' ruleRequirementBodyItem* '}' #ruleRequirementBody2;

ruleRequirementBodyItem:
  ruleDefinitionBodyItem #ruleRequirementBodyItem1
  | ruleSubjectMember #ruleRequirementBodyItem2
  | ruleRequirementConstraintMember #ruleRequirementBodyItem3
  | ruleFramedConcernMember #ruleRequirementBodyItem4
  | ruleRequirementVerificationMember #ruleRequirementBodyItem5
  | ruleActorMember #ruleRequirementBodyItem6
  | ruleStakeholderMember #ruleRequirementBodyItem7;

ruleSubjectMember: ruleMemberPrefix ruleSubjectUsage;

ruleSubjectUsage: 'subject' ruleUsageExtensionKeyword* ruleUsage;

ruleRequirementConstraintMember: ruleMemberPrefix ruleRequirementConstraintKind ruleRequirementConstraintUsage;

ruleRequirementConstraintUsage:
  ruleOwnedReferenceSubsetting ruleFeatureSpecialization* ruleRequirementBody #ruleRequirementConstraintUsage1
  | (ruleUsageExtensionKeyword* ruleConstraintUsageKeyword | ruleUsageExtensionKeyword+) ruleCalculationUsageDeclaration ruleCalculationBody #ruleRequirementConstraintUsage2;

ruleFramedConcernMember: ruleMemberPrefix ruleFramedConcernKind ruleFramedConcernUsage;

ruleFramedConcernUsage:
  ruleOwnedReferenceSubsetting ruleFeatureSpecialization* ruleRequirementBody #ruleFramedConcernUsage1
  | (ruleUsageExtensionKeyword* ruleConcernUsageKeyword | ruleUsageExtensionKeyword+) ruleCalculationUsageDeclaration ruleCalculationBody #ruleFramedConcernUsage2;

ruleActorMember: ruleMemberPrefix ruleActorUsage;

ruleActorUsage: 'actor' ruleUsageExtensionKeyword* ruleUsage;

ruleStakeholderMember: ruleMemberPrefix ruleStakeholderUsage;

ruleStakeholderUsage: 'stakeholder' ruleUsageExtensionKeyword* ruleUsage;

ruleRequirementUsageKeyword: ruleRequirementKeyword;

ruleRequirementUsage: ruleOccurrenceUsagePrefix ruleRequirementUsageKeyword ruleCalculationUsageDeclaration ruleRequirementBody;

ruleSatisfyRequirementUsage: ruleOccurrenceUsagePrefix 'assert'? 'not'? 'satisfy' (ruleOwnedReferenceSubsetting ruleFeatureSpecializationPart? | ruleRequirementUsageKeyword ruleUsageDeclaration?) ruleValuePart? ('by' ruleSatisfactionSubjectMember)? ruleRequirementBody;

ruleSatisfactionSubjectMember: ruleSatisfactionParameter;

ruleSatisfactionParameter: ruleSatisfactionFeatureValue;

ruleSatisfactionFeatureValue: ruleSatisfactionReferenceExpression;

ruleSatisfactionReferenceExpression: ruleFeatureChainMember;

ruleConcernKeyword: 'concern';

ruleConcernDefKeyword: ruleConcernKeyword 'def';

ruleConcernDefinition: ruleOccurrenceDefinitionPrefix ruleConcernDefKeyword ruleDefinitionDeclaration ruleRequirementBody;

ruleConcernUsageKeyword: ruleConcernKeyword;

ruleConcernUsage: ruleOccurrenceUsagePrefix ruleConcernUsageKeyword ruleCalculationUsageDeclaration ruleRequirementBody;

ruleCaseKeyword: 'case';

ruleCaseDefKeyword: ruleCaseKeyword 'def';

ruleCaseDefinition: ruleOccurrenceDefinitionPrefix ruleCaseDefKeyword ruleDefinitionDeclaration ruleCaseBody;

ruleCaseBody:
  ';' #ruleCaseBody1
  | '{' ruleCaseBodyItem* ruleResultExpressionMember? '}' #ruleCaseBody2;

ruleCaseBodyItem:
  ruleCalculationBodyItem #ruleCaseBodyItem1
  | ruleSubjectMember #ruleCaseBodyItem2
  | ruleActorMember #ruleCaseBodyItem3
  | ruleObjectiveMember #ruleCaseBodyItem4;

ruleObjectiveMember: ruleMemberPrefix 'objective' ruleObjectiveRequirementUsage;

ruleObjectiveRequirementUsage: ruleUsageExtensionKeyword* ruleCalculationUsageDeclaration ruleRequirementBody;

ruleCaseUsageKeyword: ruleCaseKeyword;

ruleCaseUsage: ruleOccurrenceUsagePrefix ruleCaseUsageKeyword ruleCalculationUsageDeclaration ruleCaseBody;

ruleAnalysisCaseKeyword: 'analysis';

ruleAnalysisCaseDefKeyword: ruleAnalysisCaseKeyword 'def';

ruleAnalysisCaseUsageKeyword: ruleAnalysisCaseKeyword;

ruleAnalysisCaseDefinition: ruleOccurrenceDefinitionPrefix ruleAnalysisCaseDefKeyword ruleDefinitionDeclaration ruleCaseBody;

ruleAnalysisCaseUsage: ruleOccurrenceUsagePrefix ruleAnalysisCaseUsageKeyword ruleCalculationUsageDeclaration ruleCaseBody;

ruleVerificationCaseKeyword: 'verification';

ruleVerificationCaseDefKeyword: ruleVerificationCaseKeyword 'def';

ruleVerificationCaseUsageKeyword: ruleVerificationCaseKeyword;

ruleVerificationCaseDefinition: ruleOccurrenceDefinitionPrefix ruleVerificationCaseDefKeyword ruleDefinitionDeclaration ruleCaseBody;

ruleVerificationCaseUsage: ruleOccurrenceUsagePrefix ruleVerificationCaseUsageKeyword ruleCalculationUsageDeclaration ruleCaseBody;

ruleRequirementVerificationMember: ruleMemberPrefix ruleRequirementVerificationKind ruleRequirementVerificationUsage;

ruleRequirementVerificationUsage:
  ruleOwnedReferenceSubsetting ruleFeatureSpecialization* ruleRequirementBody #ruleRequirementVerificationUsage1
  | (ruleUsageExtensionKeyword* ruleRequirementUsageKeyword | ruleUsageExtensionKeyword+) ruleCalculationUsageDeclaration ruleRequirementBody #ruleRequirementVerificationUsage2;

ruleUseCaseKeyword: 'use' 'case';

ruleUseCaseDefKeyword: ruleUseCaseKeyword 'def';

ruleUseCaseUsageKeyword: ruleUseCaseKeyword;

ruleUseCaseDefinition: ruleOccurrenceDefinitionPrefix ruleUseCaseDefKeyword ruleDefinitionDeclaration ruleCaseBody;

ruleUseCaseUsage: ruleOccurrenceUsagePrefix ruleUseCaseUsageKeyword ruleCalculationUsageDeclaration ruleCaseBody;

ruleIncludeUseCaseUsage: ruleOccurrenceUsagePrefix 'include' (ruleOwnedReferenceSubsetting ruleFeatureSpecializationPart? | ruleUseCaseUsageKeyword ruleUsageDeclaration?) ruleValuePart? ruleCaseBody;

ruleViewKeyword: 'view';

ruleViewDefKeyword: ruleViewKeyword 'def';

ruleViewDefinition: ruleOccurrenceDefinitionPrefix ruleViewDefKeyword ruleDefinitionDeclaration ruleViewDefinitionBody;

ruleViewDefinitionBody:
  ';' #ruleViewDefinitionBody1
  | '{' ruleViewDefinitionBodyItem* '}' #ruleViewDefinitionBody2;

ruleViewDefinitionBodyItem:
  ruleDefinitionBodyItem #ruleViewDefinitionBodyItem1
  | ruleElementFilterMember #ruleViewDefinitionBodyItem2
  | ruleViewRenderingMember #ruleViewDefinitionBodyItem3;

ruleViewRenderingMember: ruleMemberPrefix 'render' ruleViewRenderingUsage;

ruleViewRenderingUsage: ruleOwnedReferenceSubsetting ruleFeatureSpecialization* ruleUsageBody;

ruleViewUsageKeyword: ruleViewKeyword;

ruleViewUsage: ruleOccurrenceUsagePrefix ruleViewUsageKeyword ruleUsageDeclaration? ruleValuePart? ruleViewBody;

ruleViewBody:
  ';' #ruleViewBody1
  | '{' ruleViewBodyItem* '}' #ruleViewBody2;

ruleViewBodyItem:
  ruleDefinitionBodyItem #ruleViewBodyItem1
  | ruleElementFilterMember #ruleViewBodyItem2
  | ruleExpose #ruleViewBodyItem3
  | ruleViewRenderingMember #ruleViewBodyItem4;

ruleExpose: (ruleMembershipExpose | ruleNamespaceExpose) ruleRelationshipBody;

ruleMembershipExpose: ruleVisibilityIndicator? 'expose' ruleImportedMembership;

ruleNamespaceExpose: ruleVisibilityIndicator? 'expose' (ruleImportedNamespace | ruleFilterPackage);

ruleViewpointKeyword: 'viewpoint';

ruleViewpointDefKeyword: ruleViewpointKeyword 'def';

ruleViewpointUsageKeyword: ruleViewpointKeyword;

ruleViewpointDefinition: ruleOccurrenceDefinitionPrefix ruleViewpointDefKeyword ruleDefinitionDeclaration ruleRequirementBody;

ruleViewpointUsage: ruleOccurrenceUsagePrefix ruleViewpointUsageKeyword ruleCalculationUsageDeclaration ruleRequirementBody;

ruleRenderingKeyword: 'rendering';

ruleRenderingDefKeyword: ruleRenderingKeyword 'def';

ruleRenderingDefinition: ruleOccurrenceDefinitionPrefix ruleRenderingDefKeyword ruleDefinition;

ruleRenderingUsageKeyword: ruleRenderingKeyword;

ruleRenderingUsage: ruleOccurrenceUsagePrefix ruleRenderingUsageKeyword ruleUsage;

ruleExpressionBody: ruleCalculationBody;

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

ruleExponentiationExpression: ruleUnaryExpression ( ruleExponentiationOperator ruleUnaryExpression)*;

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

ruleFilterPackageMemberVisibility: '[';

ruleVisibilityIndicator:
  'public' #ruleVisibilityIndicator1
  | 'private' #ruleVisibilityIndicator2
  | 'protected' #ruleVisibilityIndicator3;

ruleFeatureDirection:
  'in' #ruleFeatureDirection1
  | 'out' #ruleFeatureDirection2
  | 'inout' #ruleFeatureDirection3;

rulePortionKind:
  'snapshot' #rulePortionKind1
  | 'timeslice' #rulePortionKind2;

ruleTriggerFeatureKind: 'accept';

ruleGuardFeatureKind: 'if';

ruleEffectFeatureKind: 'do';

ruleRequirementConstraintKind:
  'assume' #ruleRequirementConstraintKind1
  | 'require' #ruleRequirementConstraintKind2;

ruleFramedConcernKind: 'frame';

ruleRequirementVerificationKind: 'verify';

K_DEPENDENCY: 'dependency';
K_FROM: 'from';
K_TO: 'to';
K_COMMENT: 'comment';
K_ABOUT: 'about';
K_DOC: 'doc';
K_REP: 'rep';
K_LANGUAGE: 'language';
K_METADATA: 'metadata';
K_DEF: 'def';
K_ABSTRACT: 'abstract';
K_REF: 'ref';
K_REDEFINES: 'redefines';
K_STANDARD: 'standard';
K_LIBRARY: 'library';
K_PACKAGE: 'package';
K_FILTER: 'filter';
K_ALIAS: 'alias';
K_FOR: 'for';
K_IMPORT: 'import';
K_ALL: 'all';
K_SPECIALIZES: 'specializes';
K_ORDERED: 'ordered';
K_NONUNIQUE: 'nonunique';
K_DEFINED: 'defined';
K_BY: 'by';
K_SUBSETS: 'subsets';
K_REFERENCES: 'references';
K_VARIATION: 'variation';
K_VARIANT: 'variant';
K_READONLY: 'readonly';
K_DERIVED: 'derived';
K_END: 'end';
K_DEFAULT: 'default';
K_ATTRIBUTE: 'attribute';
K_ENUM: 'enum';
K_OCCURRENCE: 'occurrence';
K_INDIVIDUAL: 'individual';
K_EVENT: 'event';
K_THEN: 'then';
K_ITEM: 'item';
K_PART: 'part';
K_PORT: 'port';
K_BINDING: 'binding';
K_BIND: 'bind';
K_SUCCESSION: 'succession';
K_FIRST: 'first';
K_CONNECTION: 'connection';
K_CONNECT: 'connect';
K_FLOW: 'flow';
K_MESSAGE: 'message';
K_OF: 'of';
K_INTERFACE: 'interface';
K_ALLOCATION: 'allocation';
K_ALLOCATE: 'allocate';
K_ACTION: 'action';
K_PERFORM: 'perform';
K_ACCEPT: 'accept';
K_VIA: 'via';
K_AT: 'at';
K_AFTER: 'after';
K_WHEN: 'when';
K_SEND: 'send';
K_ASSIGN: 'assign';
K_IF: 'if';
K_ELSE: 'else';
K_WHILE: 'while';
K_LOOP: 'loop';
K_UNTIL: 'until';
K_IN: 'in';
K_MERGE: 'merge';
K_DECIDE: 'decide';
K_JOIN: 'join';
K_FORK: 'fork';
K_STATE: 'state';
K_PARALLEL: 'parallel';
K_ENTRY: 'entry';
K_DO: 'do';
K_EXIT: 'exit';
K_EXHIBIT: 'exhibit';
K_TRANSITION: 'transition';
K_CALC: 'calc';
K_RETURN: 'return';
K_CONSTRAINT: 'constraint';
K_ASSERT: 'assert';
K_NOT: 'not';
K_REQUIREMENT: 'requirement';
K_SUBJECT: 'subject';
K_ACTOR: 'actor';
K_STAKEHOLDER: 'stakeholder';
K_SATISFY: 'satisfy';
K_CONCERN: 'concern';
K_CASE: 'case';
K_OBJECTIVE: 'objective';
K_ANALYSIS: 'analysis';
K_VERIFICATION: 'verification';
K_USE: 'use';
K_INCLUDE: 'include';
K_VIEW: 'view';
K_RENDER: 'render';
K_EXPOSE: 'expose';
K_VIEWPOINT: 'viewpoint';
K_RENDERING: 'rendering';
K_IMPLIES: 'implies';
K_OR: 'or';
K_XOR: 'xor';
K_AND: 'and';
K_HASTYPE: 'hastype';
K_ISTYPE: 'istype';
K_AS: 'as';
K_META: 'meta';
K_NULL: 'null';
K_TRUE: 'true';
K_FALSE: 'false';
K_PUBLIC: 'public';
K_PRIVATE: 'private';
K_PROTECTED: 'protected';
K_OUT: 'out';
K_INOUT: 'inout';
K_SNAPSHOT: 'snapshot';
K_TIMESLICE: 'timeslice';
K_ASSUME: 'assume';
K_REQUIRE: 'require';
K_FRAME: 'frame';
K_VERIFY: 'verify';

LANGLE: '<';
RANGLE: '>';
LBRACE: '{';
RBRACE: '}';
RSQUARE: ']';
LSQUARE: '[';
LPAREN: '(';
RPAREN: ')';

OP_SEMI: ';';
OP_COMMA: ',';
OP_AT: '@';
OP_HASH: '#';
OP_COLON_RANGLE_RANGLE: ':>>';
OP_COLON_COLON: '::';
OP_STAR_STAR: '**';
OP_STAR: '*';
OP_COLON_RANGLE: ':>';
OP_COLON: ':';
OP_COLON_COLON_RANGLE: '::>';
OP_DOT_DOT: '..';
OP_EQ: '=';
OP_COLON_EQ: ':=';
OP_TILDE: '~';
OP_DOT: '.';
OP_MINUS_RANGLE: '->';
OP_DOT_QMARK: '.?';
OP_QMARK: '?';
OP_QMARK_QMARK: '??';
OP_BAR: '|';
OP_AND: '&';
OP_EQ_EQ: '==';
OP_BANG_EQ: '!=';
OP_EQ_EQ_EQ: '===';
OP_BANG_EQ_EQ: '!==';
OP_AT_AT: '@@';
OP_LANGLE_EQ: '<=';
OP_RANGLE_EQ: '>=';
OP_PLUS: '+';
OP_MINUS: '-';
OP_SLASH: '/';
OP_PERCENT: '%';
OP_HAT: '^';

/*
def isKeyword(tokenType: Int): Boolean = {
  import SysMLv2Lexer._
  tokenType match {
    case K_DEPENDENCY |
         K_FROM |
         K_TO |
         K_COMMENT |
         K_ABOUT |
         K_DOC |
         K_REP |
         K_LANGUAGE |
         K_METADATA |
         K_DEF |
         K_ABSTRACT |
         K_REF |
         K_REDEFINES |
         K_STANDARD |
         K_LIBRARY |
         K_PACKAGE |
         K_FILTER |
         K_ALIAS |
         K_FOR |
         K_IMPORT |
         K_ALL |
         K_SPECIALIZES |
         K_ORDERED |
         K_NONUNIQUE |
         K_DEFINED |
         K_BY |
         K_SUBSETS |
         K_REFERENCES |
         K_VARIATION |
         K_VARIANT |
         K_READONLY |
         K_DERIVED |
         K_END |
         K_DEFAULT |
         K_ATTRIBUTE |
         K_ENUM |
         K_OCCURRENCE |
         K_INDIVIDUAL |
         K_EVENT |
         K_THEN |
         K_ITEM |
         K_PART |
         K_PORT |
         K_BINDING |
         K_BIND |
         K_SUCCESSION |
         K_FIRST |
         K_CONNECTION |
         K_CONNECT |
         K_FLOW |
         K_MESSAGE |
         K_OF |
         K_INTERFACE |
         K_ALLOCATION |
         K_ALLOCATE |
         K_ACTION |
         K_PERFORM |
         K_ACCEPT |
         K_VIA |
         K_AT |
         K_AFTER |
         K_WHEN |
         K_SEND |
         K_ASSIGN |
         K_IF |
         K_ELSE |
         K_WHILE |
         K_LOOP |
         K_UNTIL |
         K_IN |
         K_MERGE |
         K_DECIDE |
         K_JOIN |
         K_FORK |
         K_STATE |
         K_PARALLEL |
         K_ENTRY |
         K_DO |
         K_EXIT |
         K_EXHIBIT |
         K_TRANSITION |
         K_CALC |
         K_RETURN |
         K_CONSTRAINT |
         K_ASSERT |
         K_NOT |
         K_REQUIREMENT |
         K_SUBJECT |
         K_ACTOR |
         K_STAKEHOLDER |
         K_SATISFY |
         K_CONCERN |
         K_CASE |
         K_OBJECTIVE |
         K_ANALYSIS |
         K_VERIFICATION |
         K_USE |
         K_INCLUDE |
         K_VIEW |
         K_RENDER |
         K_EXPOSE |
         K_VIEWPOINT |
         K_RENDERING |
         K_IMPLIES |
         K_OR |
         K_XOR |
         K_AND |
         K_HASTYPE |
         K_ISTYPE |
         K_AS |
         K_META |
         K_NULL |
         K_TRUE |
         K_FALSE |
         K_PUBLIC |
         K_PRIVATE |
         K_PROTECTED |
         K_OUT |
         K_INOUT |
         K_SNAPSHOT |
         K_TIMESLICE |
         K_ASSUME |
         K_REQUIRE |
         K_FRAME |
         K_VERIFY => true
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

RULE_SL_NOTE: '//' (~('\n' | '\r') ~('\n' | '\r')*)? ('\r'? '\n')? -> channel(HIDDEN);

RULE_WS: (' ' | '\t' | '\r' | '\n')+ -> channel(HIDDEN);