// Generated from MmParser.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MmParser}.
 */
public interface MmParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MmParser#mm}.
	 * @param ctx the parse tree
	 */
	void enterMm(MmParser.MmContext ctx);
	/**
	 * Exit a parse tree produced by {@link MmParser#mm}.
	 * @param ctx the parse tree
	 */
	void exitMm(MmParser.MmContext ctx);
	/**
	 * Enter a parse tree produced by {@link MmParser#part}.
	 * @param ctx the parse tree
	 */
	void enterPart(MmParser.PartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MmParser#part}.
	 * @param ctx the parse tree
	 */
	void exitPart(MmParser.PartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MmParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(MmParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MmParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(MmParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MmParser#roleCommand}.
	 * @param ctx the parse tree
	 */
	void enterRoleCommand(MmParser.RoleCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link MmParser#roleCommand}.
	 * @param ctx the parse tree
	 */
	void exitRoleCommand(MmParser.RoleCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link MmParser#roleParameters}.
	 * @param ctx the parse tree
	 */
	void enterRoleParameters(MmParser.RoleParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MmParser#roleParameters}.
	 * @param ctx the parse tree
	 */
	void exitRoleParameters(MmParser.RoleParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MmParser#roleParameter}.
	 * @param ctx the parse tree
	 */
	void enterRoleParameter(MmParser.RoleParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MmParser#roleParameter}.
	 * @param ctx the parse tree
	 */
	void exitRoleParameter(MmParser.RoleParameterContext ctx);
}