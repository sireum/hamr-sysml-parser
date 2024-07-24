// Auto-generated from https://raw.githubusercontent.com/Systems-Modeling/SysML-v2-Pilot-Implementation/2024-05/org.omg.kerml.xtext/src-gen/org/omg/kerml/xtext/parser/antlr/internal/InternalKerML.g
grammar KerMLv2;

@parser::members {
  public static boolean isKeyword(int tokenType) {
    switch (tokenType) {
      case KerMLv2Lexer.K_DEPENDENCY |
           KerMLv2Lexer.K_FROM |
           KerMLv2Lexer.K_TO |
           KerMLv2Lexer.K_COMMENT |
           KerMLv2Lexer.K_ABOUT |
           KerMLv2Lexer.K_LOCALE |
           KerMLv2Lexer.K_DOC |
           KerMLv2Lexer.K_REP |
           KerMLv2Lexer.K_LANGUAGE |
           KerMLv2Lexer.K_NAMESPACE |
           KerMLv2Lexer.K_ALIAS |
           KerMLv2Lexer.K_FOR |
           KerMLv2Lexer.K_IMPORT |
           KerMLv2Lexer.K_ALL |
           KerMLv2Lexer.K_STANDARD |
           KerMLv2Lexer.K_LIBRARY |
           KerMLv2Lexer.K_PACKAGE |
           KerMLv2Lexer.K_FILTER |
           KerMLv2Lexer.K_ABSTRACT |
           KerMLv2Lexer.K_TYPE |
           KerMLv2Lexer.K_SPECIALIZES |
           KerMLv2Lexer.K_CONJUGATES |
           KerMLv2Lexer.K_DISJOINT |
           KerMLv2Lexer.K_UNIONS |
           KerMLv2Lexer.K_INTERSECTS |
           KerMLv2Lexer.K_DIFFERENCES |
           KerMLv2Lexer.K_MEMBER |
           KerMLv2Lexer.K_SPECIALIZATION |
           KerMLv2Lexer.K_SUBTYPE |
           KerMLv2Lexer.K_CONJUGATION |
           KerMLv2Lexer.K_CONJUGATE |
           KerMLv2Lexer.K_DISJOINING |
           KerMLv2Lexer.K_CLASSIFIER |
           KerMLv2Lexer.K_SUBCLASSIFIER |
           KerMLv2Lexer.K_COMPOSITE |
           KerMLv2Lexer.K_PORTION |
           KerMLv2Lexer.K_READONLY |
           KerMLv2Lexer.K_DERIVED |
           KerMLv2Lexer.K_END |
           KerMLv2Lexer.K_FEATURE |
           KerMLv2Lexer.K_CHAINS |
           KerMLv2Lexer.K_INVERSE |
           KerMLv2Lexer.K_OF |
           KerMLv2Lexer.K_FEATURED |
           KerMLv2Lexer.K_BY |
           KerMLv2Lexer.K_ORDERED |
           KerMLv2Lexer.K_NONUNIQUE |
           KerMLv2Lexer.K_TYPED |
           KerMLv2Lexer.K_SUBSETS |
           KerMLv2Lexer.K_REFERENCES |
           KerMLv2Lexer.K_REDEFINES |
           KerMLv2Lexer.K_INVERTING |
           KerMLv2Lexer.K_FEATURING |
           KerMLv2Lexer.K_TYPING |
           KerMLv2Lexer.K_SUBSET |
           KerMLv2Lexer.K_REDEFINITION |
           KerMLv2Lexer.K_DEFAULT |
           KerMLv2Lexer.K_MULTIPLICITY |
           KerMLv2Lexer.K_DATATYPE |
           KerMLv2Lexer.K_CLASS |
           KerMLv2Lexer.K_STRUCT |
           KerMLv2Lexer.K_ASSOC |
           KerMLv2Lexer.K_CONNECTOR |
           KerMLv2Lexer.K_BINDING |
           KerMLv2Lexer.K_SUCCESSION |
           KerMLv2Lexer.K_FIRST |
           KerMLv2Lexer.K_THEN |
           KerMLv2Lexer.K_BEHAVIOR |
           KerMLv2Lexer.K_STEP |
           KerMLv2Lexer.K_FUNCTION |
           KerMLv2Lexer.K_RETURN |
           KerMLv2Lexer.K_EXPR |
           KerMLv2Lexer.K_PREDICATE |
           KerMLv2Lexer.K_BOOL |
           KerMLv2Lexer.K_INV |
           KerMLv2Lexer.K_TRUE |
           KerMLv2Lexer.K_FALSE |
           KerMLv2Lexer.K_INTERACTION |
           KerMLv2Lexer.K_FLOW |
           KerMLv2Lexer.K_METACLASS |
           KerMLv2Lexer.K_METADATA |
           KerMLv2Lexer.K_ELSE |
           KerMLv2Lexer.K_IF |
           KerMLv2Lexer.K_IMPLIES |
           KerMLv2Lexer.K_OR |
           KerMLv2Lexer.K_XOR |
           KerMLv2Lexer.K_AND |
           KerMLv2Lexer.K_HASTYPE |
           KerMLv2Lexer.K_ISTYPE |
           KerMLv2Lexer.K_AS |
           KerMLv2Lexer.K_META |
           KerMLv2Lexer.K_NOT |
           KerMLv2Lexer.K_NULL |
           KerMLv2Lexer.K_PUBLIC |
           KerMLv2Lexer.K_PRIVATE |
           KerMLv2Lexer.K_PROTECTED |
           KerMLv2Lexer.K_IN |
           KerMLv2Lexer.K_OUT |
           KerMLv2Lexer.K_INOUT: return true;
      default: return false;
    }
  }
}

entryRuleRootNamespace: ruleRootNamespace EOF;

ruleRootNamespace:  ruleNamespaceBodyElement*;

ruleIdentification:
  '<' ruleName '>' ruleName? #ruleIdentification1
  | ruleName #ruleIdentification2;

ruleRelationshipBody:
  ';' #ruleRelationshipBody1
  | '{' ruleRelationshipOwnedElement* '}' #ruleRelationshipBody2;

ruleRelationshipOwnedElement:
  ruleOwnedRelatedElement #ruleRelationshipOwnedElement1
  | ruleOwnedAnnotation #ruleRelationshipOwnedElement2;

ruleOwnedRelatedElement:
  ruleNonFeatureElement #ruleOwnedRelatedElement1
  | ruleFeatureElement #ruleOwnedRelatedElement2;

ruleDependency: rulePrefixMetadataAnnotation* 'dependency' (ruleIdentification? 'from')? ruleQualifiedName (',' ruleQualifiedName)* 'to' ruleQualifiedName (',' ruleQualifiedName)* ruleRelationshipBody;

ruleAnnotation: ruleQualifiedName;

ruleOwnedAnnotation: ruleAnnotatingElement;

ruleAnnotatingElement:
  ruleComment #ruleAnnotatingElement1
  | ruleDocumentation #ruleAnnotatingElement2
  | ruleTextualRepresentation #ruleAnnotatingElement3
  | ruleMetadataFeature #ruleAnnotatingElement4;

ruleComment: ('comment' ruleIdentification? ('about' ruleAnnotation (',' ruleAnnotation)*)?)? ('locale' RULE_STRING_VALUE)? RULE_REGULAR_COMMENT;

ruleDocumentation: 'doc' ruleIdentification? ('locale' RULE_STRING_VALUE)? RULE_REGULAR_COMMENT;

ruleTextualRepresentation: ('rep' ruleIdentification?)? 'language' RULE_STRING_VALUE RULE_REGULAR_COMMENT;

ruleNamespace: rulePrefixMetadataMember* ruleNamespaceDeclaration ruleNamespaceBody;

ruleNamespaceDeclaration: 'namespace' ruleIdentification?;

ruleNamespaceBody:
  ';' #ruleNamespaceBody1
  | '{' (ruleNamespaceMember | ruleAliasMember | ruleImport)* '}' #ruleNamespaceBody2;

ruleNamespaceBodyElement:
  ruleNamespaceMember #ruleNamespaceBodyElement1
  | ruleAliasMember #ruleNamespaceBodyElement2
  | ruleImport #ruleNamespaceBodyElement3;

ruleMemberPrefix: ruleVisibilityIndicator?;

ruleNamespaceMember:
  ruleNonFeatureMember #ruleNamespaceMember1
  | ruleNamespaceFeatureMember #ruleNamespaceMember2;

ruleNonFeatureMember: ruleMemberPrefix ruleMemberElement;

ruleNamespaceFeatureMember: ruleMemberPrefix ruleFeatureElement;

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

ruleMemberElement:
  ruleAnnotatingElement #ruleMemberElement1
  | ruleNonFeatureElement #ruleMemberElement2;

ruleNonFeatureElement:
  ruleDependency #ruleNonFeatureElement1
  | ruleNamespace #ruleNonFeatureElement2
  | rulePackage #ruleNonFeatureElement3
  | ruleLibraryPackage #ruleNonFeatureElement4
  | ruleMultiplicity #ruleNonFeatureElement5
  | ruleType #ruleNonFeatureElement6
  | ruleClassifier #ruleNonFeatureElement7
  | ruleClass #ruleNonFeatureElement8
  | ruleStructure #ruleNonFeatureElement9
  | ruleMetaclass #ruleNonFeatureElement10
  | ruleDataType #ruleNonFeatureElement11
  | ruleAssociation #ruleNonFeatureElement12
  | ruleAssociationStructure #ruleNonFeatureElement13
  | ruleInteraction #ruleNonFeatureElement14
  | ruleBehavior #ruleNonFeatureElement15
  | ruleFunction #ruleNonFeatureElement16
  | rulePredicate #ruleNonFeatureElement17
  | ruleSpecialization #ruleNonFeatureElement18
  | ruleConjugation #ruleNonFeatureElement19
  | ruleFeatureTyping #ruleNonFeatureElement20
  | ruleSubclassification #ruleNonFeatureElement21
  | ruleDisjoining #ruleNonFeatureElement22
  | ruleFeatureInverting #ruleNonFeatureElement23
  | ruleSubsetting #ruleNonFeatureElement24
  | ruleRedefinition #ruleNonFeatureElement25
  | ruleTypeFeaturing #ruleNonFeatureElement26;

ruleFeatureElement:
  ruleFeature #ruleFeatureElement1
  | ruleStep #ruleFeatureElement2
  | ruleExpression #ruleFeatureElement3
  | ruleBooleanExpression #ruleFeatureElement4
  | ruleInvariant #ruleFeatureElement5
  | ruleConnector #ruleFeatureElement6
  | ruleBindingConnector #ruleFeatureElement7
  | ruleSuccession #ruleFeatureElement8
  | ruleItemFlow #ruleFeatureElement9
  | ruleSuccessionItemFlow #ruleFeatureElement10;

rulePackage: rulePrefixMetadataMember* rulePackageDeclaration rulePackageBody;

ruleLibraryPackage: 'standard'? 'library' rulePrefixMetadataMember* rulePackageDeclaration rulePackageBody;

rulePackageDeclaration: 'package' ruleIdentification?;

rulePackageBody:
  ';' #rulePackageBody1
  | '{' (ruleNamespaceMember | ruleElementFilterMember | ruleAliasMember | ruleImport)* '}' #rulePackageBody2;

ruleElementFilterMember: ruleMemberPrefix 'filter' ruleOwnedExpression ';';

ruleTypePrefix: 'abstract'? rulePrefixMetadataMember*;

ruleType: ruleTypePrefix 'type' ruleTypeDeclaration ruleTypeBody;

ruleTypeDeclaration: 'all'? ruleIdentification? ruleOwnedMultiplicity? (ruleSpecializationPart | ruleConjugationPart) ruleTypeRelationshipPart*;

ruleSpecializationPart: (':>' | 'specializes') ruleOwnedSpecialization (',' ruleOwnedSpecialization)*;

ruleConjugationPart: ('~' | 'conjugates') ruleOwnedConjugation;

ruleTypeRelationshipPart:
  ruleDisjoiningPart #ruleTypeRelationshipPart1
  | ruleUnioningPart #ruleTypeRelationshipPart2
  | ruleIntersectingPart #ruleTypeRelationshipPart3
  | ruleDifferencingPart #ruleTypeRelationshipPart4;

ruleDisjoiningPart: 'disjoint' 'from' ruleOwnedDisjoining (',' ruleOwnedDisjoining)*;

ruleUnioningPart: 'unions' ruleUnioning (',' ruleUnioning)*;

ruleIntersectingPart: 'intersects' ruleIntersecting (',' ruleIntersecting)*;

ruleDifferencingPart: 'differences' ruleDifferencing (',' ruleDifferencing)*;

ruleTypeBody:
  ';' #ruleTypeBody1
  | '{' (ruleNonFeatureMember | ruleFeatureMember | ruleAliasMember | ruleImport)* '}' #ruleTypeBody2;

ruleFeatureMember:
  ruleTypeFeatureMember #ruleFeatureMember1
  | ruleOwnedFeatureMember #ruleFeatureMember2;

ruleTypeFeatureMember: ruleMemberPrefix 'member' ruleFeatureElement;

ruleOwnedFeatureMember: ruleMemberPrefix ruleFeatureElement;

ruleSpecialization: ('specialization' ruleIdentification?)? 'subtype' (ruleQualifiedName | ruleOwnedFeatureChain) (':>' | 'specializes') (ruleQualifiedName | ruleOwnedFeatureChain) ruleRelationshipBody;

ruleOwnedSpecialization:
  ruleQualifiedName #ruleOwnedSpecialization1
  | ruleOwnedFeatureChain #ruleOwnedSpecialization2;

ruleConjugation: ('conjugation' ruleIdentification?)? 'conjugate' (ruleQualifiedName | ruleOwnedFeatureChain) ('~' | 'conjugates') (ruleQualifiedName | ruleOwnedFeatureChain) ruleRelationshipBody;

ruleOwnedConjugation:
  ruleQualifiedName #ruleOwnedConjugation1
  | ruleOwnedFeatureChain #ruleOwnedConjugation2;

ruleDisjoining: ('disjoining' ruleIdentification?)? 'disjoint' (ruleQualifiedName | ruleOwnedFeatureChain) 'from' (ruleQualifiedName | ruleOwnedFeatureChain) ruleRelationshipBody;

ruleOwnedDisjoining:
  ruleQualifiedName #ruleOwnedDisjoining1
  | ruleOwnedFeatureChain #ruleOwnedDisjoining2;

ruleUnioning:
  ruleQualifiedName #ruleUnioning1
  | ruleOwnedFeatureChain #ruleUnioning2;

ruleIntersecting:
  ruleQualifiedName #ruleIntersecting1
  | ruleOwnedFeatureChain #ruleIntersecting2;

ruleDifferencing:
  ruleQualifiedName #ruleDifferencing1
  | ruleOwnedFeatureChain #ruleDifferencing2;

ruleClassifier: ruleTypePrefix 'classifier' ruleClassifierDeclaration ruleTypeBody;

ruleClassifierDeclaration: 'all'? ruleIdentification? ruleOwnedMultiplicity? (ruleSuperclassingPart | ruleClassifierConjugationPart)? ruleTypeRelationshipPart*;

ruleSuperclassingPart: (':>' | 'specializes') ruleOwnedsubclassification (',' ruleOwnedsubclassification)*;

ruleClassifierConjugationPart: ('~' | 'conjugates') ruleClassifierConjugation;

ruleSubclassification: ('specialization' ruleIdentification?)? 'subclassifier' ruleQualifiedName (':>' | 'specializes') ruleQualifiedName ruleRelationshipBody;

ruleOwnedsubclassification: ruleQualifiedName;

ruleClassifierConjugation: ruleQualifiedName;

ruleFeaturePrefix: ruleFeatureDirection? 'abstract'? ('composite' | 'portion')? 'readonly'? 'derived'? 'end'? rulePrefixMetadataMember*;

ruleFeature: ruleFeaturePrefix ('feature'? ruleFeatureDeclaration | rulePrefixMetadataMember | 'feature') ruleValuePart? ruleTypeBody;

ruleFeatureDeclaration: 'all'? (ruleIdentification (ruleFeatureSpecializationPart | ruleFeatureConjugationPart)? | ruleFeatureSpecializationPart | ruleFeatureConjugationPart) ruleFeatureRelationshipPart*;

ruleFeatureRelationshipPart:
  ruleTypeRelationshipPart #ruleFeatureRelationshipPart1
  | ruleChainingPart #ruleFeatureRelationshipPart2
  | ruleInvertingPart #ruleFeatureRelationshipPart3
  | ruleTypeFeaturingPart #ruleFeatureRelationshipPart4;

ruleChainingPart: 'chains' (ruleOwnedFeatureChaining | ruleFeatureChain);

ruleInvertingPart: 'inverse' 'of' ruleOwnedFeatureInverting;

ruleTypeFeaturingPart: 'featured' 'by' ruleOwnedTypeFeaturing (',' ruleOwnedTypeFeaturing)*;

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

ruleTypings: ruleTypedBy (',' ruleOwnedFeatureTyping)*;

ruleTypedBy: (':' | 'typed' 'by') ruleOwnedFeatureTyping;

ruleSubsettings: ruleSubsets (',' ruleOwnedSubsetting)*;

ruleSubsets: (':>' | 'subsets') ruleOwnedSubsetting;

ruleReferences: ruleReferencesKeyword ruleOwnedReferenceSubsetting;

ruleReferencesKeyword:
  '::>' #ruleReferencesKeyword1
  | 'references' #ruleReferencesKeyword2;

ruleRedefinitions: ruleRedefines (',' ruleOwnedRedefinition)*;

ruleRedefines: (':>>' | 'redefines') ruleOwnedRedefinition;

ruleFeatureInverting: ('inverting' ruleIdentification?)? 'inverse' (ruleQualifiedName | ruleOwnedFeatureChain) 'of' (ruleQualifiedName | ruleOwnedFeatureChain) ruleRelationshipBody;

ruleOwnedFeatureInverting:
  ruleQualifiedName #ruleOwnedFeatureInverting1
  | ruleOwnedFeatureChain #ruleOwnedFeatureInverting2;

ruleTypeFeaturing: 'featuring' (ruleIdentification? 'of')? ruleQualifiedName 'by' ruleQualifiedName ruleRelationshipBody;

ruleOwnedTypeFeaturing: ruleQualifiedName;

ruleFeatureTyping: ('specialization' ruleIdentification?)? 'typing' ruleQualifiedName (':' | 'typed' 'by') ruleFeatureType ruleRelationshipBody;

ruleOwnedFeatureTyping: ruleFeatureType;

ruleFeatureType:
  ruleQualifiedName #ruleFeatureType1
  | ruleOwnedFeatureChain #ruleFeatureType2;

ruleSubsetting: ('specialization' ruleIdentification?)? 'subset' (ruleQualifiedName | ruleOwnedFeatureChain) (':>' | 'subsets') (ruleQualifiedName | ruleOwnedFeatureChain) ruleRelationshipBody;

ruleOwnedSubsetting:
  ruleQualifiedName #ruleOwnedSubsetting1
  | ruleOwnedFeatureChain #ruleOwnedSubsetting2;

ruleOwnedReferenceSubsetting:
  ruleQualifiedName #ruleOwnedReferenceSubsetting1
  | ruleOwnedFeatureChain #ruleOwnedReferenceSubsetting2;

ruleRedefinition: ('specialization' ruleIdentification?)? 'redefinition' (ruleQualifiedName | ruleOwnedFeatureChain) (':>>' | 'redefines') (ruleQualifiedName | ruleOwnedFeatureChain) ruleRelationshipBody;

ruleOwnedRedefinition:
  ruleQualifiedName #ruleOwnedRedefinition1
  | ruleOwnedFeatureChain #ruleOwnedRedefinition2;

ruleFeatureConjugationPart: ('~' | 'conjugates') ruleFeatureConjugation;

ruleFeatureConjugation: ruleQualifiedName;

ruleValuePart: ruleFeatureValue;

ruleFeatureValue: ('=' | ':=' | 'default' ('=' | ':=')?) ruleOwnedExpression;

ruleMultiplicity:
  ruleMultiplicitySubset #ruleMultiplicity1
  | ruleMultiplicityRange #ruleMultiplicity2;

ruleMultiplicitySubset: 'multiplicity' ruleIdentification? ruleSubsets ruleTypeBody;

ruleMultiplicityRange: 'multiplicity' ruleIdentification? ruleMultiplicityBounds ruleTypeBody;

ruleOwnedMultiplicity: ruleOwnedMultiplicityRange;

ruleOwnedMultiplicityRange: ruleMultiplicityBounds;

ruleMultiplicityBounds: '[' ruleMultiplicityExpressionMember ('..' ruleMultiplicityExpressionMember)? ']';

ruleMultiplicityExpressionMember: (ruleLiteralExpression | ruleFeatureReferenceExpression);

ruleDataType: ruleTypePrefix 'datatype' ruleClassifierDeclaration ruleTypeBody;

ruleClass: ruleTypePrefix 'class' ruleClassifierDeclaration ruleTypeBody;

ruleStructure: ruleTypePrefix 'struct' ruleClassifierDeclaration ruleTypeBody;

ruleAssociation: ruleTypePrefix 'assoc' ruleClassifierDeclaration ruleTypeBody;

ruleAssociationStructure: ruleTypePrefix 'assoc' 'struct' ruleClassifierDeclaration ruleTypeBody;

ruleConnector: ruleFeaturePrefix 'connector' (ruleFeatureDeclaration? ruleValuePart? | ruleConnectorDeclaration) ruleTypeBody;

ruleConnectorDeclaration:
  ruleBinaryConnectorDeclaration #ruleConnectorDeclaration1
  | ruleNaryConnectorDeclaration #ruleConnectorDeclaration2;

ruleBinaryConnectorDeclaration: (ruleFeatureDeclaration? 'from' | 'all' 'from'?)? ruleConnectorEndMember 'to' ruleConnectorEndMember;

ruleNaryConnectorDeclaration: ruleFeatureDeclaration? '(' ruleConnectorEndMember ',' ruleConnectorEndMember (',' ruleConnectorEndMember)* ')';

ruleConnectorEndMember: ruleConnectorEnd;

ruleConnectorEnd: (ruleName ruleReferencesKeyword)? ruleOwnedReferenceSubsetting ruleOwnedMultiplicity?;

ruleBindingConnector: ruleFeaturePrefix 'binding' ruleBindingConnectorDeclaration ruleTypeBody;

ruleBindingConnectorDeclaration:
  ruleFeatureDeclaration ('of' ruleConnectorEndMember '=' ruleConnectorEndMember)? #ruleBindingConnectorDeclaration1
  | 'all'? ('of'? ruleConnectorEndMember '=' ruleConnectorEndMember)? #ruleBindingConnectorDeclaration2;

ruleSuccession: ruleFeaturePrefix 'succession' ruleSuccessionDeclaration ruleTypeBody;

ruleSuccessionDeclaration:
  ruleFeatureDeclaration ('first' ruleConnectorEndMember 'then' ruleConnectorEndMember)? #ruleSuccessionDeclaration1
  | 'all'? ('first'? ruleConnectorEndMember 'then' ruleConnectorEndMember)? #ruleSuccessionDeclaration2;

ruleBehavior: ruleTypePrefix 'behavior' ruleClassifierDeclaration ruleTypeBody;

ruleStep: ruleFeaturePrefix 'step' ruleStepDeclaration ruleTypeBody;

ruleStepDeclaration: ruleFeatureDeclaration? ruleValuePart?;

ruleFunction: ruleTypePrefix 'function' ruleClassifierDeclaration ruleFunctionBody;

ruleFunctionBody:
  ';' #ruleFunctionBody1
  | '{' ruleFunctionBodyPart '}' #ruleFunctionBody2;

ruleFunctionBodyPart: (ruleNonFeatureMember | ruleFeatureMember | ruleAliasMember | ruleImport | ruleReturnFeatureMember)* ruleResultExpressionMember?;

ruleReturnFeatureMember: ruleMemberPrefix 'return' ruleFeatureElement;

ruleResultExpressionMember: ruleMemberPrefix ruleOwnedExpression;

ruleExpression: ruleFeaturePrefix 'expr' ruleExpressionDeclaration ruleFunctionBody;

ruleExpressionDeclaration: ruleFeatureDeclaration? ruleValuePart?;

rulePredicate: ruleTypePrefix 'predicate' ruleClassifierDeclaration ruleFunctionBody;

ruleBooleanExpression: ruleFeaturePrefix 'bool' ruleExpressionDeclaration ruleFunctionBody;

ruleInvariant: ruleFeaturePrefix 'inv' ('true' | 'false')? ruleExpressionDeclaration ruleFunctionBody;

ruleInteraction: ruleTypePrefix 'interaction' ruleClassifierDeclaration ruleTypeBody;

ruleItemFlow: ruleFeaturePrefix 'flow' ruleItemFlowDeclaration ruleTypeBody;

ruleSuccessionItemFlow: ruleFeaturePrefix 'succession' 'flow' ruleItemFlowDeclaration ruleTypeBody;

ruleItemFlowDeclaration:
  ruleFeatureDeclaration? ruleValuePart? ('of' ruleItemFeatureMember)? ('from' ruleItemFlowEndMember 'to' ruleItemFlowEndMember)? #ruleItemFlowDeclaration1
  | 'all'? ruleItemFlowEndMember 'to' ruleItemFlowEndMember #ruleItemFlowDeclaration2;

ruleItemFeatureMember: ruleItemFeature;

ruleItemFeature:
  ruleIdentification? ruleItemFeatureSpecializationPart ruleValuePart? #ruleItemFeature1
  | ruleIdentification? ruleValuePart #ruleItemFeature2
  | ruleOwnedFeatureTyping ruleOwnedMultiplicity? #ruleItemFeature3
  | ruleOwnedMultiplicity ruleOwnedFeatureTyping #ruleItemFeature4;

ruleItemFeatureSpecializationPart:
  ruleFeatureSpecialization+ ruleMultiplicityPart? ruleFeatureSpecialization* #ruleItemFeatureSpecializationPart1
  | ruleMultiplicityPart ruleFeatureSpecialization+ #ruleItemFeatureSpecializationPart2;

ruleItemFlowEndMember: ruleItemFlowEnd;

ruleItemFlowEnd: ruleItemFlowEndSubsetting? ruleItemFlowFeatureMember;

ruleItemFlowEndSubsetting:
  ruleQualifiedName '.' #ruleItemFlowEndSubsetting1
  | ruleFeatureChainPrefix #ruleItemFlowEndSubsetting2;

ruleFeatureChainPrefix: (ruleOwnedFeatureChaining '.')+ ruleOwnedFeatureChaining '.';

ruleItemFlowFeatureMember: ruleItemFlowFeature;

ruleItemFlowFeature: ruleItemFlowRedefinition;

ruleItemFlowRedefinition: ruleQualifiedName;

ruleMetaclass: ruleTypePrefix 'metaclass' ruleClassifierDeclaration ruleTypeBody;

rulePrefixMetadataAnnotation: '#' rulePrefixMetadataFeature;

rulePrefixMetadataMember: '#' rulePrefixMetadataFeature;

rulePrefixMetadataFeature: ruleMetadataTyping;

ruleMetadataFeature: rulePrefixMetadataMember* ('@' | 'metadata') ruleMetadataFeatureDeclaration ('about' ruleAnnotation (',' ruleAnnotation)*)? ruleMetadataBody;

ruleMetadataFeatureDeclaration: (ruleIdentification (':' | 'typed' 'by'))? ruleMetadataTyping;

ruleMetadataTyping: ruleQualifiedName;

ruleMetadataBody:
  ';' #ruleMetadataBody1
  | '{' (ruleNonFeatureMember | ruleMetadataBodyFeatureMember | ruleAliasMember | ruleImport)* '}' #ruleMetadataBody2;

ruleMetadataBodyFeatureMember: ruleMetadataBodyFeature;

ruleMetadataBodyFeature: 'feature'? (':>>' | 'redefines')? ruleOwnedRedefinition ruleFeatureSpecializationPart? ruleValuePart? ruleMetadataBody;

ruleExpressionBody: '{' ruleFunctionBodyPart '}';

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

ruleBodyParameter: ruleName;

ruleSequenceExpression: ruleOwnedExpression (',' |  ',' ruleSequenceExpression)?;

ruleFeatureReferenceExpression: ruleFeatureReferenceMember;

ruleFeatureReferenceMember: ruleQualifiedName;

ruleMetadataAccessExpression: ruleQualifiedName '.' 'metadata';

ruleInvocationExpression: ruleOwnedFeatureTyping ruleArgumentList;

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

K_DEPENDENCY: 'dependency';
K_FROM: 'from';
K_TO: 'to';
K_COMMENT: 'comment';
K_ABOUT: 'about';
K_LOCALE: 'locale';
K_DOC: 'doc';
K_REP: 'rep';
K_LANGUAGE: 'language';
K_NAMESPACE: 'namespace';
K_ALIAS: 'alias';
K_FOR: 'for';
K_IMPORT: 'import';
K_ALL: 'all';
K_STANDARD: 'standard';
K_LIBRARY: 'library';
K_PACKAGE: 'package';
K_FILTER: 'filter';
K_ABSTRACT: 'abstract';
K_TYPE: 'type';
K_SPECIALIZES: 'specializes';
K_CONJUGATES: 'conjugates';
K_DISJOINT: 'disjoint';
K_UNIONS: 'unions';
K_INTERSECTS: 'intersects';
K_DIFFERENCES: 'differences';
K_MEMBER: 'member';
K_SPECIALIZATION: 'specialization';
K_SUBTYPE: 'subtype';
K_CONJUGATION: 'conjugation';
K_CONJUGATE: 'conjugate';
K_DISJOINING: 'disjoining';
K_CLASSIFIER: 'classifier';
K_SUBCLASSIFIER: 'subclassifier';
K_COMPOSITE: 'composite';
K_PORTION: 'portion';
K_READONLY: 'readonly';
K_DERIVED: 'derived';
K_END: 'end';
K_FEATURE: 'feature';
K_CHAINS: 'chains';
K_INVERSE: 'inverse';
K_OF: 'of';
K_FEATURED: 'featured';
K_BY: 'by';
K_ORDERED: 'ordered';
K_NONUNIQUE: 'nonunique';
K_TYPED: 'typed';
K_SUBSETS: 'subsets';
K_REFERENCES: 'references';
K_REDEFINES: 'redefines';
K_INVERTING: 'inverting';
K_FEATURING: 'featuring';
K_TYPING: 'typing';
K_SUBSET: 'subset';
K_REDEFINITION: 'redefinition';
K_DEFAULT: 'default';
K_MULTIPLICITY: 'multiplicity';
K_DATATYPE: 'datatype';
K_CLASS: 'class';
K_STRUCT: 'struct';
K_ASSOC: 'assoc';
K_CONNECTOR: 'connector';
K_BINDING: 'binding';
K_SUCCESSION: 'succession';
K_FIRST: 'first';
K_THEN: 'then';
K_BEHAVIOR: 'behavior';
K_STEP: 'step';
K_FUNCTION: 'function';
K_RETURN: 'return';
K_EXPR: 'expr';
K_PREDICATE: 'predicate';
K_BOOL: 'bool';
K_INV: 'inv';
K_TRUE: 'true';
K_FALSE: 'false';
K_INTERACTION: 'interaction';
K_FLOW: 'flow';
K_METACLASS: 'metaclass';
K_METADATA: 'metadata';
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
K_NULL: 'null';
K_PUBLIC: 'public';
K_PRIVATE: 'private';
K_PROTECTED: 'protected';
K_IN: 'in';
K_OUT: 'out';
K_INOUT: 'inout';

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
OP_COLON_COLON: '::';
OP_STAR_STAR: '**';
OP_STAR: '*';
OP_COLON_RANGLE: ':>';
OP_TILDE: '~';
OP_COLON: ':';
OP_COLON_COLON_RANGLE: '::>';
OP_COLON_RANGLE_RANGLE: ':>>';
OP_EQ: '=';
OP_COLON_EQ: ':=';
OP_DOT_DOT: '..';
OP_DOT: '.';
OP_HASH: '#';
OP_AT: '@';
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
OP_MINUS_RANGLE: '->';
OP_DOT_QMARK: '.?';

RULE_DECIMAL_VALUE: '0'..'9' '0'..'9'*;

RULE_EXP_VALUE: RULE_DECIMAL_VALUE ('e' | 'E') ('+' | '-')? RULE_DECIMAL_VALUE;

RULE_ID: ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;

RULE_UNRESTRICTED_NAME: '\'' ('\\' ('b' | 't' | 'n' | 'f' | 'r' | '"' | '\'' | '\\') | ~('\\' | '\''))* '\'';

RULE_STRING_VALUE: '"' ('\\' ('b' | 't' | 'n' | 'f' | 'r' | '"' | '\'' | '\\') | ~('\\' | '"'))* '"';

RULE_REGULAR_COMMENT: '/*' .*? '*/';

RULE_ML_NOTE: '//*' .*? '*/' -> channel(HIDDEN);

RULE_SL_NOTE: '//' ~'*' (~('\n' | '\r') ~('\n' | '\r')*)? ('\r'? '\n')? -> channel(HIDDEN);

RULE_WS: (' ' | '\t' | '\r' | '\n')+ -> channel(HIDDEN);