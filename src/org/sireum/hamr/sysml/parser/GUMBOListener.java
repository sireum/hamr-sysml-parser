// Generated from /Users/belt/devel/sireum/hamr-sysml-parser/src/org/sireum/hamr/sysml/parser/GUMBO.g4 by ANTLR 4.13.1
package org.sireum.hamr.sysml.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GUMBOParser}.
 */
public interface GUMBOListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#entryRuleGumboLibrary}.
	 * @param ctx the parse tree
	 */
	void enterEntryRuleGumboLibrary(GUMBOParser.EntryRuleGumboLibraryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#entryRuleGumboLibrary}.
	 * @param ctx the parse tree
	 */
	void exitEntryRuleGumboLibrary(GUMBOParser.EntryRuleGumboLibraryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleGumboLibrary}.
	 * @param ctx the parse tree
	 */
	void enterRuleGumboLibrary(GUMBOParser.RuleGumboLibraryContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleGumboLibrary}.
	 * @param ctx the parse tree
	 */
	void exitRuleGumboLibrary(GUMBOParser.RuleGumboLibraryContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleSpecSection}.
	 * @param ctx the parse tree
	 */
	void enterRuleSpecSection(GUMBOParser.RuleSpecSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleSpecSection}.
	 * @param ctx the parse tree
	 */
	void exitRuleSpecSection(GUMBOParser.RuleSpecSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleState}.
	 * @param ctx the parse tree
	 */
	void enterRuleState(GUMBOParser.RuleStateContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleState}.
	 * @param ctx the parse tree
	 */
	void exitRuleState(GUMBOParser.RuleStateContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleStateVarDecl}.
	 * @param ctx the parse tree
	 */
	void enterRuleStateVarDecl(GUMBOParser.RuleStateVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleStateVarDecl}.
	 * @param ctx the parse tree
	 */
	void exitRuleStateVarDecl(GUMBOParser.RuleStateVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleInvariants}.
	 * @param ctx the parse tree
	 */
	void enterRuleInvariants(GUMBOParser.RuleInvariantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleInvariants}.
	 * @param ctx the parse tree
	 */
	void exitRuleInvariants(GUMBOParser.RuleInvariantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleInvSpec}.
	 * @param ctx the parse tree
	 */
	void enterRuleInvSpec(GUMBOParser.RuleInvSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleInvSpec}.
	 * @param ctx the parse tree
	 */
	void exitRuleInvSpec(GUMBOParser.RuleInvSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleIntegration}.
	 * @param ctx the parse tree
	 */
	void enterRuleIntegration(GUMBOParser.RuleIntegrationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleIntegration}.
	 * @param ctx the parse tree
	 */
	void exitRuleIntegration(GUMBOParser.RuleIntegrationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleInitialize}.
	 * @param ctx the parse tree
	 */
	void enterRuleInitialize(GUMBOParser.RuleInitializeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleInitialize}.
	 * @param ctx the parse tree
	 */
	void exitRuleInitialize(GUMBOParser.RuleInitializeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleInitializeSpecStatement}.
	 * @param ctx the parse tree
	 */
	void enterRuleInitializeSpecStatement(GUMBOParser.RuleInitializeSpecStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleInitializeSpecStatement}.
	 * @param ctx the parse tree
	 */
	void exitRuleInitializeSpecStatement(GUMBOParser.RuleInitializeSpecStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleCompute}.
	 * @param ctx the parse tree
	 */
	void enterRuleCompute(GUMBOParser.RuleComputeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleCompute}.
	 * @param ctx the parse tree
	 */
	void exitRuleCompute(GUMBOParser.RuleComputeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleInfoFlowClause}.
	 * @param ctx the parse tree
	 */
	void enterRuleInfoFlowClause(GUMBOParser.RuleInfoFlowClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleInfoFlowClause}.
	 * @param ctx the parse tree
	 */
	void exitRuleInfoFlowClause(GUMBOParser.RuleInfoFlowClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleHandlerClause}.
	 * @param ctx the parse tree
	 */
	void enterRuleHandlerClause(GUMBOParser.RuleHandlerClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleHandlerClause}.
	 * @param ctx the parse tree
	 */
	void exitRuleHandlerClause(GUMBOParser.RuleHandlerClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleCaseStatementClause}.
	 * @param ctx the parse tree
	 */
	void enterRuleCaseStatementClause(GUMBOParser.RuleCaseStatementClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleCaseStatementClause}.
	 * @param ctx the parse tree
	 */
	void exitRuleCaseStatementClause(GUMBOParser.RuleCaseStatementClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleSpecStatement1}
	 * labeled alternative in {@link GUMBOParser#ruleSpecStatement}.
	 * @param ctx the parse tree
	 */
	void enterRuleSpecStatement1(GUMBOParser.RuleSpecStatement1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleSpecStatement1}
	 * labeled alternative in {@link GUMBOParser#ruleSpecStatement}.
	 * @param ctx the parse tree
	 */
	void exitRuleSpecStatement1(GUMBOParser.RuleSpecStatement1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleSpecStatement2}
	 * labeled alternative in {@link GUMBOParser#ruleSpecStatement}.
	 * @param ctx the parse tree
	 */
	void enterRuleSpecStatement2(GUMBOParser.RuleSpecStatement2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleSpecStatement2}
	 * labeled alternative in {@link GUMBOParser#ruleSpecStatement}.
	 * @param ctx the parse tree
	 */
	void exitRuleSpecStatement2(GUMBOParser.RuleSpecStatement2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleAssumeStatement}.
	 * @param ctx the parse tree
	 */
	void enterRuleAssumeStatement(GUMBOParser.RuleAssumeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleAssumeStatement}.
	 * @param ctx the parse tree
	 */
	void exitRuleAssumeStatement(GUMBOParser.RuleAssumeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleAnonAssumeStatement}.
	 * @param ctx the parse tree
	 */
	void enterRuleAnonAssumeStatement(GUMBOParser.RuleAnonAssumeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleAnonAssumeStatement}.
	 * @param ctx the parse tree
	 */
	void exitRuleAnonAssumeStatement(GUMBOParser.RuleAnonAssumeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleGuaranteeStatement}.
	 * @param ctx the parse tree
	 */
	void enterRuleGuaranteeStatement(GUMBOParser.RuleGuaranteeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleGuaranteeStatement}.
	 * @param ctx the parse tree
	 */
	void exitRuleGuaranteeStatement(GUMBOParser.RuleGuaranteeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleAnonGuaranteeStatement}.
	 * @param ctx the parse tree
	 */
	void enterRuleAnonGuaranteeStatement(GUMBOParser.RuleAnonGuaranteeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleAnonGuaranteeStatement}.
	 * @param ctx the parse tree
	 */
	void exitRuleAnonGuaranteeStatement(GUMBOParser.RuleAnonGuaranteeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleOtherDataRef}.
	 * @param ctx the parse tree
	 */
	void enterRuleOtherDataRef(GUMBOParser.RuleOtherDataRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleOtherDataRef}.
	 * @param ctx the parse tree
	 */
	void exitRuleOtherDataRef(GUMBOParser.RuleOtherDataRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleFunctions}.
	 * @param ctx the parse tree
	 */
	void enterRuleFunctions(GUMBOParser.RuleFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleFunctions}.
	 * @param ctx the parse tree
	 */
	void exitRuleFunctions(GUMBOParser.RuleFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleFuncSpec}.
	 * @param ctx the parse tree
	 */
	void enterRuleFuncSpec(GUMBOParser.RuleFuncSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleFuncSpec}.
	 * @param ctx the parse tree
	 */
	void exitRuleFuncSpec(GUMBOParser.RuleFuncSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleSlangDefDecl}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangDefDecl(GUMBOParser.RuleSlangDefDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleSlangDefDecl}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangDefDecl(GUMBOParser.RuleSlangDefDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleSlangDefDef}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangDefDef(GUMBOParser.RuleSlangDefDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleSlangDefDef}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangDefDef(GUMBOParser.RuleSlangDefDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleSlangDefMods1}
	 * labeled alternative in {@link GUMBOParser#ruleSlangDefMods}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangDefMods1(GUMBOParser.RuleSlangDefMods1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleSlangDefMods1}
	 * labeled alternative in {@link GUMBOParser#ruleSlangDefMods}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangDefMods1(GUMBOParser.RuleSlangDefMods1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleSlangDefMods2}
	 * labeled alternative in {@link GUMBOParser#ruleSlangDefMods}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangDefMods2(GUMBOParser.RuleSlangDefMods2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleSlangDefMods2}
	 * labeled alternative in {@link GUMBOParser#ruleSlangDefMods}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangDefMods2(GUMBOParser.RuleSlangDefMods2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleSlangDefExt}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangDefExt(GUMBOParser.RuleSlangDefExtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleSlangDefExt}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangDefExt(GUMBOParser.RuleSlangDefExtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleSlangDefParams}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangDefParams(GUMBOParser.RuleSlangDefParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleSlangDefParams}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangDefParams(GUMBOParser.RuleSlangDefParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleSlangDefParam}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangDefParam(GUMBOParser.RuleSlangDefParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleSlangDefParam}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangDefParam(GUMBOParser.RuleSlangDefParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleSlangTypeParams}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangTypeParams(GUMBOParser.RuleSlangTypeParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleSlangTypeParams}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangTypeParams(GUMBOParser.RuleSlangTypeParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleSlangTypeParam}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangTypeParam(GUMBOParser.RuleSlangTypeParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleSlangTypeParam}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangTypeParam(GUMBOParser.RuleSlangTypeParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleSlangDefContract}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangDefContract(GUMBOParser.RuleSlangDefContractContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleSlangDefContract}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangDefContract(GUMBOParser.RuleSlangDefContractContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleSlangSupr}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangSupr(GUMBOParser.RuleSlangSuprContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleSlangSupr}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangSupr(GUMBOParser.RuleSlangSuprContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleSlangName}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangName(GUMBOParser.RuleSlangNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleSlangName}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangName(GUMBOParser.RuleSlangNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleSlangInvariant}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangInvariant(GUMBOParser.RuleSlangInvariantContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleSlangInvariant}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangInvariant(GUMBOParser.RuleSlangInvariantContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleSlangRequires}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangRequires(GUMBOParser.RuleSlangRequiresContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleSlangRequires}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangRequires(GUMBOParser.RuleSlangRequiresContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleSlangReads}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangReads(GUMBOParser.RuleSlangReadsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleSlangReads}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangReads(GUMBOParser.RuleSlangReadsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleSlangModifies}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangModifies(GUMBOParser.RuleSlangModifiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleSlangModifies}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangModifies(GUMBOParser.RuleSlangModifiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleSlangEnsures}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangEnsures(GUMBOParser.RuleSlangEnsuresContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleSlangEnsures}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangEnsures(GUMBOParser.RuleSlangEnsuresContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleSlangStmt1}
	 * labeled alternative in {@link GUMBOParser#ruleSlangStmt}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangStmt1(GUMBOParser.RuleSlangStmt1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleSlangStmt1}
	 * labeled alternative in {@link GUMBOParser#ruleSlangStmt}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangStmt1(GUMBOParser.RuleSlangStmt1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleSlangStmt2}
	 * labeled alternative in {@link GUMBOParser#ruleSlangStmt}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangStmt2(GUMBOParser.RuleSlangStmt2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleSlangStmt2}
	 * labeled alternative in {@link GUMBOParser#ruleSlangStmt}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangStmt2(GUMBOParser.RuleSlangStmt2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleSlangStmt3}
	 * labeled alternative in {@link GUMBOParser#ruleSlangStmt}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangStmt3(GUMBOParser.RuleSlangStmt3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleSlangStmt3}
	 * labeled alternative in {@link GUMBOParser#ruleSlangStmt}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangStmt3(GUMBOParser.RuleSlangStmt3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleSlangStmt4}
	 * labeled alternative in {@link GUMBOParser#ruleSlangStmt}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangStmt4(GUMBOParser.RuleSlangStmt4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleSlangStmt4}
	 * labeled alternative in {@link GUMBOParser#ruleSlangStmt}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangStmt4(GUMBOParser.RuleSlangStmt4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleSlangStmt5}
	 * labeled alternative in {@link GUMBOParser#ruleSlangStmt}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangStmt5(GUMBOParser.RuleSlangStmt5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleSlangStmt5}
	 * labeled alternative in {@link GUMBOParser#ruleSlangStmt}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangStmt5(GUMBOParser.RuleSlangStmt5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleSlangStmt6}
	 * labeled alternative in {@link GUMBOParser#ruleSlangStmt}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangStmt6(GUMBOParser.RuleSlangStmt6Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleSlangStmt6}
	 * labeled alternative in {@link GUMBOParser#ruleSlangStmt}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangStmt6(GUMBOParser.RuleSlangStmt6Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleSlangStmt7}
	 * labeled alternative in {@link GUMBOParser#ruleSlangStmt}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangStmt7(GUMBOParser.RuleSlangStmt7Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleSlangStmt7}
	 * labeled alternative in {@link GUMBOParser#ruleSlangStmt}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangStmt7(GUMBOParser.RuleSlangStmt7Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleSlangStmt8}
	 * labeled alternative in {@link GUMBOParser#ruleSlangStmt}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangStmt8(GUMBOParser.RuleSlangStmt8Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleSlangStmt8}
	 * labeled alternative in {@link GUMBOParser#ruleSlangStmt}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangStmt8(GUMBOParser.RuleSlangStmt8Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleSlangStmt9}
	 * labeled alternative in {@link GUMBOParser#ruleSlangStmt}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangStmt9(GUMBOParser.RuleSlangStmt9Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleSlangStmt9}
	 * labeled alternative in {@link GUMBOParser#ruleSlangStmt}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangStmt9(GUMBOParser.RuleSlangStmt9Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleSlangStmt10}
	 * labeled alternative in {@link GUMBOParser#ruleSlangStmt}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangStmt10(GUMBOParser.RuleSlangStmt10Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleSlangStmt10}
	 * labeled alternative in {@link GUMBOParser#ruleSlangStmt}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangStmt10(GUMBOParser.RuleSlangStmt10Context ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleSlangElse}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangElse(GUMBOParser.RuleSlangElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleSlangElse}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangElse(GUMBOParser.RuleSlangElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleSlangLoopContract}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangLoopContract(GUMBOParser.RuleSlangLoopContractContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleSlangLoopContract}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangLoopContract(GUMBOParser.RuleSlangLoopContractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleSlangLHSSuffix1}
	 * labeled alternative in {@link GUMBOParser#ruleSlangLHSSuffix}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangLHSSuffix1(GUMBOParser.RuleSlangLHSSuffix1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleSlangLHSSuffix1}
	 * labeled alternative in {@link GUMBOParser#ruleSlangLHSSuffix}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangLHSSuffix1(GUMBOParser.RuleSlangLHSSuffix1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleSlangLHSSuffix2}
	 * labeled alternative in {@link GUMBOParser#ruleSlangLHSSuffix}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangLHSSuffix2(GUMBOParser.RuleSlangLHSSuffix2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleSlangLHSSuffix2}
	 * labeled alternative in {@link GUMBOParser#ruleSlangLHSSuffix}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangLHSSuffix2(GUMBOParser.RuleSlangLHSSuffix2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleSlangCase}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangCase(GUMBOParser.RuleSlangCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleSlangCase}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangCase(GUMBOParser.RuleSlangCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleSlangPattern1}
	 * labeled alternative in {@link GUMBOParser#ruleSlangPattern}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangPattern1(GUMBOParser.RuleSlangPattern1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleSlangPattern1}
	 * labeled alternative in {@link GUMBOParser#ruleSlangPattern}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangPattern1(GUMBOParser.RuleSlangPattern1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleSlangPattern2}
	 * labeled alternative in {@link GUMBOParser#ruleSlangPattern}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangPattern2(GUMBOParser.RuleSlangPattern2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleSlangPattern2}
	 * labeled alternative in {@link GUMBOParser#ruleSlangPattern}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangPattern2(GUMBOParser.RuleSlangPattern2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleSlangTPattern1}
	 * labeled alternative in {@link GUMBOParser#ruleSlangTPattern}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangTPattern1(GUMBOParser.RuleSlangTPattern1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleSlangTPattern1}
	 * labeled alternative in {@link GUMBOParser#ruleSlangTPattern}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangTPattern1(GUMBOParser.RuleSlangTPattern1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleSlangTPattern2}
	 * labeled alternative in {@link GUMBOParser#ruleSlangTPattern}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangTPattern2(GUMBOParser.RuleSlangTPattern2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleSlangTPattern2}
	 * labeled alternative in {@link GUMBOParser#ruleSlangTPattern}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangTPattern2(GUMBOParser.RuleSlangTPattern2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleSlangTPattern3}
	 * labeled alternative in {@link GUMBOParser#ruleSlangTPattern}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangTPattern3(GUMBOParser.RuleSlangTPattern3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleSlangTPattern3}
	 * labeled alternative in {@link GUMBOParser#ruleSlangTPattern}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangTPattern3(GUMBOParser.RuleSlangTPattern3Context ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleSlangVarDef}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangVarDef(GUMBOParser.RuleSlangVarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleSlangVarDef}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangVarDef(GUMBOParser.RuleSlangVarDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleSlangVarMod1}
	 * labeled alternative in {@link GUMBOParser#ruleSlangVarMod}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangVarMod1(GUMBOParser.RuleSlangVarMod1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleSlangVarMod1}
	 * labeled alternative in {@link GUMBOParser#ruleSlangVarMod}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangVarMod1(GUMBOParser.RuleSlangVarMod1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleSlangVarMod2}
	 * labeled alternative in {@link GUMBOParser#ruleSlangVarMod}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangVarMod2(GUMBOParser.RuleSlangVarMod2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleSlangVarMod2}
	 * labeled alternative in {@link GUMBOParser#ruleSlangVarMod}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangVarMod2(GUMBOParser.RuleSlangVarMod2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleSlangType}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangType(GUMBOParser.RuleSlangTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleSlangType}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangType(GUMBOParser.RuleSlangTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleSlangBlock}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangBlock(GUMBOParser.RuleSlangBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleSlangBlock}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangBlock(GUMBOParser.RuleSlangBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleSlangRet}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangRet(GUMBOParser.RuleSlangRetContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleSlangRet}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangRet(GUMBOParser.RuleSlangRetContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleSlangTypeArgs}.
	 * @param ctx the parse tree
	 */
	void enterRuleSlangTypeArgs(GUMBOParser.RuleSlangTypeArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleSlangTypeArgs}.
	 * @param ctx the parse tree
	 */
	void exitRuleSlangTypeArgs(GUMBOParser.RuleSlangTypeArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleOwnedExpressionMember}.
	 * @param ctx the parse tree
	 */
	void enterRuleOwnedExpressionMember(GUMBOParser.RuleOwnedExpressionMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleOwnedExpressionMember}.
	 * @param ctx the parse tree
	 */
	void exitRuleOwnedExpressionMember(GUMBOParser.RuleOwnedExpressionMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleOwnedExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleOwnedExpression(GUMBOParser.RuleOwnedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleOwnedExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleOwnedExpression(GUMBOParser.RuleOwnedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleOwnedExpressionReference}.
	 * @param ctx the parse tree
	 */
	void enterRuleOwnedExpressionReference(GUMBOParser.RuleOwnedExpressionReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleOwnedExpressionReference}.
	 * @param ctx the parse tree
	 */
	void exitRuleOwnedExpressionReference(GUMBOParser.RuleOwnedExpressionReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleConditionalExpression1}
	 * labeled alternative in {@link GUMBOParser#ruleConditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleConditionalExpression1(GUMBOParser.RuleConditionalExpression1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleConditionalExpression1}
	 * labeled alternative in {@link GUMBOParser#ruleConditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleConditionalExpression1(GUMBOParser.RuleConditionalExpression1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleConditionalExpression2}
	 * labeled alternative in {@link GUMBOParser#ruleConditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleConditionalExpression2(GUMBOParser.RuleConditionalExpression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleConditionalExpression2}
	 * labeled alternative in {@link GUMBOParser#ruleConditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleConditionalExpression2(GUMBOParser.RuleConditionalExpression2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleConditionalOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleConditionalOperator(GUMBOParser.RuleConditionalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleConditionalOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleConditionalOperator(GUMBOParser.RuleConditionalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleNullCoalescingExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleNullCoalescingExpression(GUMBOParser.RuleNullCoalescingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleNullCoalescingExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleNullCoalescingExpression(GUMBOParser.RuleNullCoalescingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleNullCoalescingOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleNullCoalescingOperator(GUMBOParser.RuleNullCoalescingOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleNullCoalescingOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleNullCoalescingOperator(GUMBOParser.RuleNullCoalescingOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleImpliesExpressionReference}.
	 * @param ctx the parse tree
	 */
	void enterRuleImpliesExpressionReference(GUMBOParser.RuleImpliesExpressionReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleImpliesExpressionReference}.
	 * @param ctx the parse tree
	 */
	void exitRuleImpliesExpressionReference(GUMBOParser.RuleImpliesExpressionReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleImpliesExpressionMember}.
	 * @param ctx the parse tree
	 */
	void enterRuleImpliesExpressionMember(GUMBOParser.RuleImpliesExpressionMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleImpliesExpressionMember}.
	 * @param ctx the parse tree
	 */
	void exitRuleImpliesExpressionMember(GUMBOParser.RuleImpliesExpressionMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleImpliesExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleImpliesExpression(GUMBOParser.RuleImpliesExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleImpliesExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleImpliesExpression(GUMBOParser.RuleImpliesExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleImpliesOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleImpliesOperator(GUMBOParser.RuleImpliesOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleImpliesOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleImpliesOperator(GUMBOParser.RuleImpliesOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleOrExpressionReference}.
	 * @param ctx the parse tree
	 */
	void enterRuleOrExpressionReference(GUMBOParser.RuleOrExpressionReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleOrExpressionReference}.
	 * @param ctx the parse tree
	 */
	void exitRuleOrExpressionReference(GUMBOParser.RuleOrExpressionReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleOrExpressionMember}.
	 * @param ctx the parse tree
	 */
	void enterRuleOrExpressionMember(GUMBOParser.RuleOrExpressionMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleOrExpressionMember}.
	 * @param ctx the parse tree
	 */
	void exitRuleOrExpressionMember(GUMBOParser.RuleOrExpressionMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleOrExpression(GUMBOParser.RuleOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleOrExpression(GUMBOParser.RuleOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleOrOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleOrOperator(GUMBOParser.RuleOrOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleOrOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleOrOperator(GUMBOParser.RuleOrOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleConditionalOrOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleConditionalOrOperator(GUMBOParser.RuleConditionalOrOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleConditionalOrOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleConditionalOrOperator(GUMBOParser.RuleConditionalOrOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleXorExpressionReference}.
	 * @param ctx the parse tree
	 */
	void enterRuleXorExpressionReference(GUMBOParser.RuleXorExpressionReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleXorExpressionReference}.
	 * @param ctx the parse tree
	 */
	void exitRuleXorExpressionReference(GUMBOParser.RuleXorExpressionReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleXorExpressionMember}.
	 * @param ctx the parse tree
	 */
	void enterRuleXorExpressionMember(GUMBOParser.RuleXorExpressionMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleXorExpressionMember}.
	 * @param ctx the parse tree
	 */
	void exitRuleXorExpressionMember(GUMBOParser.RuleXorExpressionMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleXorExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleXorExpression(GUMBOParser.RuleXorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleXorExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleXorExpression(GUMBOParser.RuleXorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleXorOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleXorOperator(GUMBOParser.RuleXorOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleXorOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleXorOperator(GUMBOParser.RuleXorOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleAndExpression(GUMBOParser.RuleAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleAndExpression(GUMBOParser.RuleAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleAndOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleAndOperator(GUMBOParser.RuleAndOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleAndOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleAndOperator(GUMBOParser.RuleAndOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleConditionalAndOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleConditionalAndOperator(GUMBOParser.RuleConditionalAndOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleConditionalAndOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleConditionalAndOperator(GUMBOParser.RuleConditionalAndOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleEqualityExpressionReference}.
	 * @param ctx the parse tree
	 */
	void enterRuleEqualityExpressionReference(GUMBOParser.RuleEqualityExpressionReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleEqualityExpressionReference}.
	 * @param ctx the parse tree
	 */
	void exitRuleEqualityExpressionReference(GUMBOParser.RuleEqualityExpressionReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleEqualityExpressionMember}.
	 * @param ctx the parse tree
	 */
	void enterRuleEqualityExpressionMember(GUMBOParser.RuleEqualityExpressionMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleEqualityExpressionMember}.
	 * @param ctx the parse tree
	 */
	void exitRuleEqualityExpressionMember(GUMBOParser.RuleEqualityExpressionMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleEqualityExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleEqualityExpression(GUMBOParser.RuleEqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleEqualityExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleEqualityExpression(GUMBOParser.RuleEqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleEqualityOperator1}
	 * labeled alternative in {@link GUMBOParser#ruleEqualityOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleEqualityOperator1(GUMBOParser.RuleEqualityOperator1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleEqualityOperator1}
	 * labeled alternative in {@link GUMBOParser#ruleEqualityOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleEqualityOperator1(GUMBOParser.RuleEqualityOperator1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleEqualityOperator2}
	 * labeled alternative in {@link GUMBOParser#ruleEqualityOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleEqualityOperator2(GUMBOParser.RuleEqualityOperator2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleEqualityOperator2}
	 * labeled alternative in {@link GUMBOParser#ruleEqualityOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleEqualityOperator2(GUMBOParser.RuleEqualityOperator2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleEqualityOperator3}
	 * labeled alternative in {@link GUMBOParser#ruleEqualityOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleEqualityOperator3(GUMBOParser.RuleEqualityOperator3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleEqualityOperator3}
	 * labeled alternative in {@link GUMBOParser#ruleEqualityOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleEqualityOperator3(GUMBOParser.RuleEqualityOperator3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleEqualityOperator4}
	 * labeled alternative in {@link GUMBOParser#ruleEqualityOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleEqualityOperator4(GUMBOParser.RuleEqualityOperator4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleEqualityOperator4}
	 * labeled alternative in {@link GUMBOParser#ruleEqualityOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleEqualityOperator4(GUMBOParser.RuleEqualityOperator4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleClassificationExpression1}
	 * labeled alternative in {@link GUMBOParser#ruleClassificationExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleClassificationExpression1(GUMBOParser.RuleClassificationExpression1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleClassificationExpression1}
	 * labeled alternative in {@link GUMBOParser#ruleClassificationExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleClassificationExpression1(GUMBOParser.RuleClassificationExpression1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleClassificationExpression2}
	 * labeled alternative in {@link GUMBOParser#ruleClassificationExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleClassificationExpression2(GUMBOParser.RuleClassificationExpression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleClassificationExpression2}
	 * labeled alternative in {@link GUMBOParser#ruleClassificationExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleClassificationExpression2(GUMBOParser.RuleClassificationExpression2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleClassificationExpression3}
	 * labeled alternative in {@link GUMBOParser#ruleClassificationExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleClassificationExpression3(GUMBOParser.RuleClassificationExpression3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleClassificationExpression3}
	 * labeled alternative in {@link GUMBOParser#ruleClassificationExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleClassificationExpression3(GUMBOParser.RuleClassificationExpression3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleClassificationExpression4}
	 * labeled alternative in {@link GUMBOParser#ruleClassificationExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleClassificationExpression4(GUMBOParser.RuleClassificationExpression4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleClassificationExpression4}
	 * labeled alternative in {@link GUMBOParser#ruleClassificationExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleClassificationExpression4(GUMBOParser.RuleClassificationExpression4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleClassificationExpression5}
	 * labeled alternative in {@link GUMBOParser#ruleClassificationExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleClassificationExpression5(GUMBOParser.RuleClassificationExpression5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleClassificationExpression5}
	 * labeled alternative in {@link GUMBOParser#ruleClassificationExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleClassificationExpression5(GUMBOParser.RuleClassificationExpression5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleClassificationTestOperator1}
	 * labeled alternative in {@link GUMBOParser#ruleClassificationTestOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleClassificationTestOperator1(GUMBOParser.RuleClassificationTestOperator1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleClassificationTestOperator1}
	 * labeled alternative in {@link GUMBOParser#ruleClassificationTestOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleClassificationTestOperator1(GUMBOParser.RuleClassificationTestOperator1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleClassificationTestOperator2}
	 * labeled alternative in {@link GUMBOParser#ruleClassificationTestOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleClassificationTestOperator2(GUMBOParser.RuleClassificationTestOperator2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleClassificationTestOperator2}
	 * labeled alternative in {@link GUMBOParser#ruleClassificationTestOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleClassificationTestOperator2(GUMBOParser.RuleClassificationTestOperator2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleClassificationTestOperator3}
	 * labeled alternative in {@link GUMBOParser#ruleClassificationTestOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleClassificationTestOperator3(GUMBOParser.RuleClassificationTestOperator3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleClassificationTestOperator3}
	 * labeled alternative in {@link GUMBOParser#ruleClassificationTestOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleClassificationTestOperator3(GUMBOParser.RuleClassificationTestOperator3Context ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleMetaClassificationTestOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleMetaClassificationTestOperator(GUMBOParser.RuleMetaClassificationTestOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleMetaClassificationTestOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleMetaClassificationTestOperator(GUMBOParser.RuleMetaClassificationTestOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleCastOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleCastOperator(GUMBOParser.RuleCastOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleCastOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleCastOperator(GUMBOParser.RuleCastOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleMetaCastOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleMetaCastOperator(GUMBOParser.RuleMetaCastOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleMetaCastOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleMetaCastOperator(GUMBOParser.RuleMetaCastOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleMetadataReference}.
	 * @param ctx the parse tree
	 */
	void enterRuleMetadataReference(GUMBOParser.RuleMetadataReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleMetadataReference}.
	 * @param ctx the parse tree
	 */
	void exitRuleMetadataReference(GUMBOParser.RuleMetadataReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleTypeReferenceMember}.
	 * @param ctx the parse tree
	 */
	void enterRuleTypeReferenceMember(GUMBOParser.RuleTypeReferenceMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleTypeReferenceMember}.
	 * @param ctx the parse tree
	 */
	void exitRuleTypeReferenceMember(GUMBOParser.RuleTypeReferenceMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleTypeResultMember}.
	 * @param ctx the parse tree
	 */
	void enterRuleTypeResultMember(GUMBOParser.RuleTypeResultMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleTypeResultMember}.
	 * @param ctx the parse tree
	 */
	void exitRuleTypeResultMember(GUMBOParser.RuleTypeResultMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleTypeReference}.
	 * @param ctx the parse tree
	 */
	void enterRuleTypeReference(GUMBOParser.RuleTypeReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleTypeReference}.
	 * @param ctx the parse tree
	 */
	void exitRuleTypeReference(GUMBOParser.RuleTypeReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleReferenceTyping}.
	 * @param ctx the parse tree
	 */
	void enterRuleReferenceTyping(GUMBOParser.RuleReferenceTypingContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleReferenceTyping}.
	 * @param ctx the parse tree
	 */
	void exitRuleReferenceTyping(GUMBOParser.RuleReferenceTypingContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleSelfReferenceExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleSelfReferenceExpression(GUMBOParser.RuleSelfReferenceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleSelfReferenceExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleSelfReferenceExpression(GUMBOParser.RuleSelfReferenceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleSelfReferenceMember}.
	 * @param ctx the parse tree
	 */
	void enterRuleSelfReferenceMember(GUMBOParser.RuleSelfReferenceMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleSelfReferenceMember}.
	 * @param ctx the parse tree
	 */
	void exitRuleSelfReferenceMember(GUMBOParser.RuleSelfReferenceMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleEmptyFeature}.
	 * @param ctx the parse tree
	 */
	void enterRuleEmptyFeature(GUMBOParser.RuleEmptyFeatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleEmptyFeature}.
	 * @param ctx the parse tree
	 */
	void exitRuleEmptyFeature(GUMBOParser.RuleEmptyFeatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleRelationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleRelationalExpression(GUMBOParser.RuleRelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleRelationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleRelationalExpression(GUMBOParser.RuleRelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleRelationalOperator1}
	 * labeled alternative in {@link GUMBOParser#ruleRelationalOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleRelationalOperator1(GUMBOParser.RuleRelationalOperator1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleRelationalOperator1}
	 * labeled alternative in {@link GUMBOParser#ruleRelationalOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleRelationalOperator1(GUMBOParser.RuleRelationalOperator1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleRelationalOperator2}
	 * labeled alternative in {@link GUMBOParser#ruleRelationalOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleRelationalOperator2(GUMBOParser.RuleRelationalOperator2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleRelationalOperator2}
	 * labeled alternative in {@link GUMBOParser#ruleRelationalOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleRelationalOperator2(GUMBOParser.RuleRelationalOperator2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleRelationalOperator3}
	 * labeled alternative in {@link GUMBOParser#ruleRelationalOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleRelationalOperator3(GUMBOParser.RuleRelationalOperator3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleRelationalOperator3}
	 * labeled alternative in {@link GUMBOParser#ruleRelationalOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleRelationalOperator3(GUMBOParser.RuleRelationalOperator3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleRelationalOperator4}
	 * labeled alternative in {@link GUMBOParser#ruleRelationalOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleRelationalOperator4(GUMBOParser.RuleRelationalOperator4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleRelationalOperator4}
	 * labeled alternative in {@link GUMBOParser#ruleRelationalOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleRelationalOperator4(GUMBOParser.RuleRelationalOperator4Context ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleRangeExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleRangeExpression(GUMBOParser.RuleRangeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleRangeExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleRangeExpression(GUMBOParser.RuleRangeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleAdditiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleAdditiveExpression(GUMBOParser.RuleAdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleAdditiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleAdditiveExpression(GUMBOParser.RuleAdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleAdditiveOperator1}
	 * labeled alternative in {@link GUMBOParser#ruleAdditiveOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleAdditiveOperator1(GUMBOParser.RuleAdditiveOperator1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleAdditiveOperator1}
	 * labeled alternative in {@link GUMBOParser#ruleAdditiveOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleAdditiveOperator1(GUMBOParser.RuleAdditiveOperator1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleAdditiveOperator2}
	 * labeled alternative in {@link GUMBOParser#ruleAdditiveOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleAdditiveOperator2(GUMBOParser.RuleAdditiveOperator2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleAdditiveOperator2}
	 * labeled alternative in {@link GUMBOParser#ruleAdditiveOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleAdditiveOperator2(GUMBOParser.RuleAdditiveOperator2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleMultiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleMultiplicativeExpression(GUMBOParser.RuleMultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleMultiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleMultiplicativeExpression(GUMBOParser.RuleMultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleMultiplicativeOperator1}
	 * labeled alternative in {@link GUMBOParser#ruleMultiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleMultiplicativeOperator1(GUMBOParser.RuleMultiplicativeOperator1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleMultiplicativeOperator1}
	 * labeled alternative in {@link GUMBOParser#ruleMultiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleMultiplicativeOperator1(GUMBOParser.RuleMultiplicativeOperator1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleMultiplicativeOperator2}
	 * labeled alternative in {@link GUMBOParser#ruleMultiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleMultiplicativeOperator2(GUMBOParser.RuleMultiplicativeOperator2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleMultiplicativeOperator2}
	 * labeled alternative in {@link GUMBOParser#ruleMultiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleMultiplicativeOperator2(GUMBOParser.RuleMultiplicativeOperator2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleMultiplicativeOperator3}
	 * labeled alternative in {@link GUMBOParser#ruleMultiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleMultiplicativeOperator3(GUMBOParser.RuleMultiplicativeOperator3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleMultiplicativeOperator3}
	 * labeled alternative in {@link GUMBOParser#ruleMultiplicativeOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleMultiplicativeOperator3(GUMBOParser.RuleMultiplicativeOperator3Context ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleExponentiationExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleExponentiationExpression(GUMBOParser.RuleExponentiationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleExponentiationExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleExponentiationExpression(GUMBOParser.RuleExponentiationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleExponentiationOperator1}
	 * labeled alternative in {@link GUMBOParser#ruleExponentiationOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleExponentiationOperator1(GUMBOParser.RuleExponentiationOperator1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleExponentiationOperator1}
	 * labeled alternative in {@link GUMBOParser#ruleExponentiationOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleExponentiationOperator1(GUMBOParser.RuleExponentiationOperator1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleExponentiationOperator2}
	 * labeled alternative in {@link GUMBOParser#ruleExponentiationOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleExponentiationOperator2(GUMBOParser.RuleExponentiationOperator2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleExponentiationOperator2}
	 * labeled alternative in {@link GUMBOParser#ruleExponentiationOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleExponentiationOperator2(GUMBOParser.RuleExponentiationOperator2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleUnaryExpression1}
	 * labeled alternative in {@link GUMBOParser#ruleUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleUnaryExpression1(GUMBOParser.RuleUnaryExpression1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleUnaryExpression1}
	 * labeled alternative in {@link GUMBOParser#ruleUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleUnaryExpression1(GUMBOParser.RuleUnaryExpression1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleUnaryExpression2}
	 * labeled alternative in {@link GUMBOParser#ruleUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleUnaryExpression2(GUMBOParser.RuleUnaryExpression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleUnaryExpression2}
	 * labeled alternative in {@link GUMBOParser#ruleUnaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleUnaryExpression2(GUMBOParser.RuleUnaryExpression2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleUnaryOperator1}
	 * labeled alternative in {@link GUMBOParser#ruleUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleUnaryOperator1(GUMBOParser.RuleUnaryOperator1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleUnaryOperator1}
	 * labeled alternative in {@link GUMBOParser#ruleUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleUnaryOperator1(GUMBOParser.RuleUnaryOperator1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleUnaryOperator2}
	 * labeled alternative in {@link GUMBOParser#ruleUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleUnaryOperator2(GUMBOParser.RuleUnaryOperator2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleUnaryOperator2}
	 * labeled alternative in {@link GUMBOParser#ruleUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleUnaryOperator2(GUMBOParser.RuleUnaryOperator2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleUnaryOperator3}
	 * labeled alternative in {@link GUMBOParser#ruleUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleUnaryOperator3(GUMBOParser.RuleUnaryOperator3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleUnaryOperator3}
	 * labeled alternative in {@link GUMBOParser#ruleUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleUnaryOperator3(GUMBOParser.RuleUnaryOperator3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleUnaryOperator4}
	 * labeled alternative in {@link GUMBOParser#ruleUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterRuleUnaryOperator4(GUMBOParser.RuleUnaryOperator4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleUnaryOperator4}
	 * labeled alternative in {@link GUMBOParser#ruleUnaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitRuleUnaryOperator4(GUMBOParser.RuleUnaryOperator4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleExtentExpression1}
	 * labeled alternative in {@link GUMBOParser#ruleExtentExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleExtentExpression1(GUMBOParser.RuleExtentExpression1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleExtentExpression1}
	 * labeled alternative in {@link GUMBOParser#ruleExtentExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleExtentExpression1(GUMBOParser.RuleExtentExpression1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleExtentExpression2}
	 * labeled alternative in {@link GUMBOParser#ruleExtentExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleExtentExpression2(GUMBOParser.RuleExtentExpression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleExtentExpression2}
	 * labeled alternative in {@link GUMBOParser#ruleExtentExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleExtentExpression2(GUMBOParser.RuleExtentExpression2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#rulePrimaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterRulePrimaryExpression(GUMBOParser.RulePrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#rulePrimaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitRulePrimaryExpression(GUMBOParser.RulePrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleFunctionReferenceExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleFunctionReferenceExpression(GUMBOParser.RuleFunctionReferenceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleFunctionReferenceExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleFunctionReferenceExpression(GUMBOParser.RuleFunctionReferenceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleFunctionReferenceMember}.
	 * @param ctx the parse tree
	 */
	void enterRuleFunctionReferenceMember(GUMBOParser.RuleFunctionReferenceMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleFunctionReferenceMember}.
	 * @param ctx the parse tree
	 */
	void exitRuleFunctionReferenceMember(GUMBOParser.RuleFunctionReferenceMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleFunctionReference}.
	 * @param ctx the parse tree
	 */
	void enterRuleFunctionReference(GUMBOParser.RuleFunctionReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleFunctionReference}.
	 * @param ctx the parse tree
	 */
	void exitRuleFunctionReference(GUMBOParser.RuleFunctionReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleFeatureChainMember1}
	 * labeled alternative in {@link GUMBOParser#ruleFeatureChainMember}.
	 * @param ctx the parse tree
	 */
	void enterRuleFeatureChainMember1(GUMBOParser.RuleFeatureChainMember1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleFeatureChainMember1}
	 * labeled alternative in {@link GUMBOParser#ruleFeatureChainMember}.
	 * @param ctx the parse tree
	 */
	void exitRuleFeatureChainMember1(GUMBOParser.RuleFeatureChainMember1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleFeatureChainMember2}
	 * labeled alternative in {@link GUMBOParser#ruleFeatureChainMember}.
	 * @param ctx the parse tree
	 */
	void enterRuleFeatureChainMember2(GUMBOParser.RuleFeatureChainMember2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleFeatureChainMember2}
	 * labeled alternative in {@link GUMBOParser#ruleFeatureChainMember}.
	 * @param ctx the parse tree
	 */
	void exitRuleFeatureChainMember2(GUMBOParser.RuleFeatureChainMember2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleBaseExpression1}
	 * labeled alternative in {@link GUMBOParser#ruleBaseExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleBaseExpression1(GUMBOParser.RuleBaseExpression1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleBaseExpression1}
	 * labeled alternative in {@link GUMBOParser#ruleBaseExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleBaseExpression1(GUMBOParser.RuleBaseExpression1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleBaseExpression2}
	 * labeled alternative in {@link GUMBOParser#ruleBaseExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleBaseExpression2(GUMBOParser.RuleBaseExpression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleBaseExpression2}
	 * labeled alternative in {@link GUMBOParser#ruleBaseExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleBaseExpression2(GUMBOParser.RuleBaseExpression2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleBaseExpression3}
	 * labeled alternative in {@link GUMBOParser#ruleBaseExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleBaseExpression3(GUMBOParser.RuleBaseExpression3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleBaseExpression3}
	 * labeled alternative in {@link GUMBOParser#ruleBaseExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleBaseExpression3(GUMBOParser.RuleBaseExpression3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleBaseExpression4}
	 * labeled alternative in {@link GUMBOParser#ruleBaseExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleBaseExpression4(GUMBOParser.RuleBaseExpression4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleBaseExpression4}
	 * labeled alternative in {@link GUMBOParser#ruleBaseExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleBaseExpression4(GUMBOParser.RuleBaseExpression4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleBaseExpression5}
	 * labeled alternative in {@link GUMBOParser#ruleBaseExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleBaseExpression5(GUMBOParser.RuleBaseExpression5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleBaseExpression5}
	 * labeled alternative in {@link GUMBOParser#ruleBaseExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleBaseExpression5(GUMBOParser.RuleBaseExpression5Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleBaseExpression6}
	 * labeled alternative in {@link GUMBOParser#ruleBaseExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleBaseExpression6(GUMBOParser.RuleBaseExpression6Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleBaseExpression6}
	 * labeled alternative in {@link GUMBOParser#ruleBaseExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleBaseExpression6(GUMBOParser.RuleBaseExpression6Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleBaseExpression7}
	 * labeled alternative in {@link GUMBOParser#ruleBaseExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleBaseExpression7(GUMBOParser.RuleBaseExpression7Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleBaseExpression7}
	 * labeled alternative in {@link GUMBOParser#ruleBaseExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleBaseExpression7(GUMBOParser.RuleBaseExpression7Context ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleBodyExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleBodyExpression(GUMBOParser.RuleBodyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleBodyExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleBodyExpression(GUMBOParser.RuleBodyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleExpressionBodyMember}.
	 * @param ctx the parse tree
	 */
	void enterRuleExpressionBodyMember(GUMBOParser.RuleExpressionBodyMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleExpressionBodyMember}.
	 * @param ctx the parse tree
	 */
	void exitRuleExpressionBodyMember(GUMBOParser.RuleExpressionBodyMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleExpressionBody}.
	 * @param ctx the parse tree
	 */
	void enterRuleExpressionBody(GUMBOParser.RuleExpressionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleExpressionBody}.
	 * @param ctx the parse tree
	 */
	void exitRuleExpressionBody(GUMBOParser.RuleExpressionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleResultExpressionMember}.
	 * @param ctx the parse tree
	 */
	void enterRuleResultExpressionMember(GUMBOParser.RuleResultExpressionMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleResultExpressionMember}.
	 * @param ctx the parse tree
	 */
	void exitRuleResultExpressionMember(GUMBOParser.RuleResultExpressionMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleBodyParameterMember}.
	 * @param ctx the parse tree
	 */
	void enterRuleBodyParameterMember(GUMBOParser.RuleBodyParameterMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleBodyParameterMember}.
	 * @param ctx the parse tree
	 */
	void exitRuleBodyParameterMember(GUMBOParser.RuleBodyParameterMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleBodyParameter}.
	 * @param ctx the parse tree
	 */
	void enterRuleBodyParameter(GUMBOParser.RuleBodyParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleBodyParameter}.
	 * @param ctx the parse tree
	 */
	void exitRuleBodyParameter(GUMBOParser.RuleBodyParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleSequenceExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleSequenceExpression(GUMBOParser.RuleSequenceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleSequenceExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleSequenceExpression(GUMBOParser.RuleSequenceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleFeatureReferenceExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleFeatureReferenceExpression(GUMBOParser.RuleFeatureReferenceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleFeatureReferenceExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleFeatureReferenceExpression(GUMBOParser.RuleFeatureReferenceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleFeatureReferenceMember}.
	 * @param ctx the parse tree
	 */
	void enterRuleFeatureReferenceMember(GUMBOParser.RuleFeatureReferenceMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleFeatureReferenceMember}.
	 * @param ctx the parse tree
	 */
	void exitRuleFeatureReferenceMember(GUMBOParser.RuleFeatureReferenceMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleMetadataAccessExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleMetadataAccessExpression(GUMBOParser.RuleMetadataAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleMetadataAccessExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleMetadataAccessExpression(GUMBOParser.RuleMetadataAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleInvocationExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleInvocationExpression(GUMBOParser.RuleInvocationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleInvocationExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleInvocationExpression(GUMBOParser.RuleInvocationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleOwnedFeatureTyping1}
	 * labeled alternative in {@link GUMBOParser#ruleOwnedFeatureTyping}.
	 * @param ctx the parse tree
	 */
	void enterRuleOwnedFeatureTyping1(GUMBOParser.RuleOwnedFeatureTyping1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleOwnedFeatureTyping1}
	 * labeled alternative in {@link GUMBOParser#ruleOwnedFeatureTyping}.
	 * @param ctx the parse tree
	 */
	void exitRuleOwnedFeatureTyping1(GUMBOParser.RuleOwnedFeatureTyping1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleOwnedFeatureTyping2}
	 * labeled alternative in {@link GUMBOParser#ruleOwnedFeatureTyping}.
	 * @param ctx the parse tree
	 */
	void enterRuleOwnedFeatureTyping2(GUMBOParser.RuleOwnedFeatureTyping2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleOwnedFeatureTyping2}
	 * labeled alternative in {@link GUMBOParser#ruleOwnedFeatureTyping}.
	 * @param ctx the parse tree
	 */
	void exitRuleOwnedFeatureTyping2(GUMBOParser.RuleOwnedFeatureTyping2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleOwnedFeatureChain}.
	 * @param ctx the parse tree
	 */
	void enterRuleOwnedFeatureChain(GUMBOParser.RuleOwnedFeatureChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleOwnedFeatureChain}.
	 * @param ctx the parse tree
	 */
	void exitRuleOwnedFeatureChain(GUMBOParser.RuleOwnedFeatureChainContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleFeatureChain}.
	 * @param ctx the parse tree
	 */
	void enterRuleFeatureChain(GUMBOParser.RuleFeatureChainContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleFeatureChain}.
	 * @param ctx the parse tree
	 */
	void exitRuleFeatureChain(GUMBOParser.RuleFeatureChainContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleOwnedFeatureChaining}.
	 * @param ctx the parse tree
	 */
	void enterRuleOwnedFeatureChaining(GUMBOParser.RuleOwnedFeatureChainingContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleOwnedFeatureChaining}.
	 * @param ctx the parse tree
	 */
	void exitRuleOwnedFeatureChaining(GUMBOParser.RuleOwnedFeatureChainingContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterRuleArgumentList(GUMBOParser.RuleArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitRuleArgumentList(GUMBOParser.RuleArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#rulePositionalArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterRulePositionalArgumentList(GUMBOParser.RulePositionalArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#rulePositionalArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitRulePositionalArgumentList(GUMBOParser.RulePositionalArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleArgumentMember}.
	 * @param ctx the parse tree
	 */
	void enterRuleArgumentMember(GUMBOParser.RuleArgumentMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleArgumentMember}.
	 * @param ctx the parse tree
	 */
	void exitRuleArgumentMember(GUMBOParser.RuleArgumentMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleArgument}.
	 * @param ctx the parse tree
	 */
	void enterRuleArgument(GUMBOParser.RuleArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleArgument}.
	 * @param ctx the parse tree
	 */
	void exitRuleArgument(GUMBOParser.RuleArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleNamedArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterRuleNamedArgumentList(GUMBOParser.RuleNamedArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleNamedArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitRuleNamedArgumentList(GUMBOParser.RuleNamedArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleNamedArgumentMember}.
	 * @param ctx the parse tree
	 */
	void enterRuleNamedArgumentMember(GUMBOParser.RuleNamedArgumentMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleNamedArgumentMember}.
	 * @param ctx the parse tree
	 */
	void exitRuleNamedArgumentMember(GUMBOParser.RuleNamedArgumentMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleNamedArgument}.
	 * @param ctx the parse tree
	 */
	void enterRuleNamedArgument(GUMBOParser.RuleNamedArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleNamedArgument}.
	 * @param ctx the parse tree
	 */
	void exitRuleNamedArgument(GUMBOParser.RuleNamedArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleParameterRedefinition}.
	 * @param ctx the parse tree
	 */
	void enterRuleParameterRedefinition(GUMBOParser.RuleParameterRedefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleParameterRedefinition}.
	 * @param ctx the parse tree
	 */
	void exitRuleParameterRedefinition(GUMBOParser.RuleParameterRedefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleArgumentValue}.
	 * @param ctx the parse tree
	 */
	void enterRuleArgumentValue(GUMBOParser.RuleArgumentValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleArgumentValue}.
	 * @param ctx the parse tree
	 */
	void exitRuleArgumentValue(GUMBOParser.RuleArgumentValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleNullExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleNullExpression(GUMBOParser.RuleNullExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleNullExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleNullExpression(GUMBOParser.RuleNullExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleLiteralExpression1}
	 * labeled alternative in {@link GUMBOParser#ruleLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleLiteralExpression1(GUMBOParser.RuleLiteralExpression1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleLiteralExpression1}
	 * labeled alternative in {@link GUMBOParser#ruleLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleLiteralExpression1(GUMBOParser.RuleLiteralExpression1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleLiteralExpression2}
	 * labeled alternative in {@link GUMBOParser#ruleLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleLiteralExpression2(GUMBOParser.RuleLiteralExpression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleLiteralExpression2}
	 * labeled alternative in {@link GUMBOParser#ruleLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleLiteralExpression2(GUMBOParser.RuleLiteralExpression2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleLiteralExpression3}
	 * labeled alternative in {@link GUMBOParser#ruleLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleLiteralExpression3(GUMBOParser.RuleLiteralExpression3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleLiteralExpression3}
	 * labeled alternative in {@link GUMBOParser#ruleLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleLiteralExpression3(GUMBOParser.RuleLiteralExpression3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleLiteralExpression4}
	 * labeled alternative in {@link GUMBOParser#ruleLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleLiteralExpression4(GUMBOParser.RuleLiteralExpression4Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleLiteralExpression4}
	 * labeled alternative in {@link GUMBOParser#ruleLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleLiteralExpression4(GUMBOParser.RuleLiteralExpression4Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleLiteralExpression5}
	 * labeled alternative in {@link GUMBOParser#ruleLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void enterRuleLiteralExpression5(GUMBOParser.RuleLiteralExpression5Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleLiteralExpression5}
	 * labeled alternative in {@link GUMBOParser#ruleLiteralExpression}.
	 * @param ctx the parse tree
	 */
	void exitRuleLiteralExpression5(GUMBOParser.RuleLiteralExpression5Context ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleLiteralBoolean}.
	 * @param ctx the parse tree
	 */
	void enterRuleLiteralBoolean(GUMBOParser.RuleLiteralBooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleLiteralBoolean}.
	 * @param ctx the parse tree
	 */
	void exitRuleLiteralBoolean(GUMBOParser.RuleLiteralBooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleBooleanValue1}
	 * labeled alternative in {@link GUMBOParser#ruleBooleanValue}.
	 * @param ctx the parse tree
	 */
	void enterRuleBooleanValue1(GUMBOParser.RuleBooleanValue1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleBooleanValue1}
	 * labeled alternative in {@link GUMBOParser#ruleBooleanValue}.
	 * @param ctx the parse tree
	 */
	void exitRuleBooleanValue1(GUMBOParser.RuleBooleanValue1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleBooleanValue2}
	 * labeled alternative in {@link GUMBOParser#ruleBooleanValue}.
	 * @param ctx the parse tree
	 */
	void enterRuleBooleanValue2(GUMBOParser.RuleBooleanValue2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleBooleanValue2}
	 * labeled alternative in {@link GUMBOParser#ruleBooleanValue}.
	 * @param ctx the parse tree
	 */
	void exitRuleBooleanValue2(GUMBOParser.RuleBooleanValue2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleLiteralString}.
	 * @param ctx the parse tree
	 */
	void enterRuleLiteralString(GUMBOParser.RuleLiteralStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleLiteralString}.
	 * @param ctx the parse tree
	 */
	void exitRuleLiteralString(GUMBOParser.RuleLiteralStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleLiteralInteger}.
	 * @param ctx the parse tree
	 */
	void enterRuleLiteralInteger(GUMBOParser.RuleLiteralIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleLiteralInteger}.
	 * @param ctx the parse tree
	 */
	void exitRuleLiteralInteger(GUMBOParser.RuleLiteralIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleLiteralReal}.
	 * @param ctx the parse tree
	 */
	void enterRuleLiteralReal(GUMBOParser.RuleLiteralRealContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleLiteralReal}.
	 * @param ctx the parse tree
	 */
	void exitRuleLiteralReal(GUMBOParser.RuleLiteralRealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleRealValue1}
	 * labeled alternative in {@link GUMBOParser#ruleRealValue}.
	 * @param ctx the parse tree
	 */
	void enterRuleRealValue1(GUMBOParser.RuleRealValue1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleRealValue1}
	 * labeled alternative in {@link GUMBOParser#ruleRealValue}.
	 * @param ctx the parse tree
	 */
	void exitRuleRealValue1(GUMBOParser.RuleRealValue1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleRealValue2}
	 * labeled alternative in {@link GUMBOParser#ruleRealValue}.
	 * @param ctx the parse tree
	 */
	void enterRuleRealValue2(GUMBOParser.RuleRealValue2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleRealValue2}
	 * labeled alternative in {@link GUMBOParser#ruleRealValue}.
	 * @param ctx the parse tree
	 */
	void exitRuleRealValue2(GUMBOParser.RuleRealValue2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleLiteralInfinity}.
	 * @param ctx the parse tree
	 */
	void enterRuleLiteralInfinity(GUMBOParser.RuleLiteralInfinityContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleLiteralInfinity}.
	 * @param ctx the parse tree
	 */
	void exitRuleLiteralInfinity(GUMBOParser.RuleLiteralInfinityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleName1}
	 * labeled alternative in {@link GUMBOParser#ruleName}.
	 * @param ctx the parse tree
	 */
	void enterRuleName1(GUMBOParser.RuleName1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleName1}
	 * labeled alternative in {@link GUMBOParser#ruleName}.
	 * @param ctx the parse tree
	 */
	void exitRuleName1(GUMBOParser.RuleName1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ruleName2}
	 * labeled alternative in {@link GUMBOParser#ruleName}.
	 * @param ctx the parse tree
	 */
	void enterRuleName2(GUMBOParser.RuleName2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code ruleName2}
	 * labeled alternative in {@link GUMBOParser#ruleName}.
	 * @param ctx the parse tree
	 */
	void exitRuleName2(GUMBOParser.RuleName2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleQualification}.
	 * @param ctx the parse tree
	 */
	void enterRuleQualification(GUMBOParser.RuleQualificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleQualification}.
	 * @param ctx the parse tree
	 */
	void exitRuleQualification(GUMBOParser.RuleQualificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GUMBOParser#ruleQualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterRuleQualifiedName(GUMBOParser.RuleQualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GUMBOParser#ruleQualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitRuleQualifiedName(GUMBOParser.RuleQualifiedNameContext ctx);
}