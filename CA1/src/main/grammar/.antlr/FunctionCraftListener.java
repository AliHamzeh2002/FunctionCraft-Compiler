// Generated from c:/Users/ALI/OneDrive/Desktop/university/Project/Compiler/FunctionCraft-Compiler/CA1/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FunctionCraftParser}.
 */
public interface FunctionCraftListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#function_craft}.
	 * @param ctx the parse tree
	 */
	void enterFunction_craft(FunctionCraftParser.Function_craftContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function_craft}.
	 * @param ctx the parse tree
	 */
	void exitFunction_craft(FunctionCraftParser.Function_craftContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#comment}.
	 * @param ctx the parse tree
	 */
	void enterComment(FunctionCraftParser.CommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#comment}.
	 * @param ctx the parse tree
	 */
	void exitComment(FunctionCraftParser.CommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#function_scope}.
	 * @param ctx the parse tree
	 */
	void enterFunction_scope(FunctionCraftParser.Function_scopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function_scope}.
	 * @param ctx the parse tree
	 */
	void exitFunction_scope(FunctionCraftParser.Function_scopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(FunctionCraftParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(FunctionCraftParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FunctionCraftParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FunctionCraftParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#function_args}.
	 * @param ctx the parse tree
	 */
	void enterFunction_args(FunctionCraftParser.Function_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function_args}.
	 * @param ctx the parse tree
	 */
	void exitFunction_args(FunctionCraftParser.Function_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#lambda_function}.
	 * @param ctx the parse tree
	 */
	void enterLambda_function(FunctionCraftParser.Lambda_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#lambda_function}.
	 * @param ctx the parse tree
	 */
	void exitLambda_function(FunctionCraftParser.Lambda_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#primitive_value}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_value(FunctionCraftParser.Primitive_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#primitive_value}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_value(FunctionCraftParser.Primitive_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(FunctionCraftParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(FunctionCraftParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(FunctionCraftParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(FunctionCraftParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#if_structure}.
	 * @param ctx the parse tree
	 */
	void enterIf_structure(FunctionCraftParser.If_structureContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#if_structure}.
	 * @param ctx the parse tree
	 */
	void exitIf_structure(FunctionCraftParser.If_structureContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#if_structure_loop}.
	 * @param ctx the parse tree
	 */
	void enterIf_structure_loop(FunctionCraftParser.If_structure_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#if_structure_loop}.
	 * @param ctx the parse tree
	 */
	void exitIf_structure_loop(FunctionCraftParser.If_structure_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(FunctionCraftParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(FunctionCraftParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(FunctionCraftParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(FunctionCraftParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(FunctionCraftParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(FunctionCraftParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#list_element}.
	 * @param ctx the parse tree
	 */
	void enterList_element(FunctionCraftParser.List_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#list_element}.
	 * @param ctx the parse tree
	 */
	void exitList_element(FunctionCraftParser.List_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(FunctionCraftParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(FunctionCraftParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#loop_scope}.
	 * @param ctx the parse tree
	 */
	void enterLoop_scope(FunctionCraftParser.Loop_scopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#loop_scope}.
	 * @param ctx the parse tree
	 */
	void exitLoop_scope(FunctionCraftParser.Loop_scopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(FunctionCraftParser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(FunctionCraftParser.Break_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#next_statement}.
	 * @param ctx the parse tree
	 */
	void enterNext_statement(FunctionCraftParser.Next_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#next_statement}.
	 * @param ctx the parse tree
	 */
	void exitNext_statement(FunctionCraftParser.Next_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#next_if_statement}.
	 * @param ctx the parse tree
	 */
	void enterNext_if_statement(FunctionCraftParser.Next_if_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#next_if_statement}.
	 * @param ctx the parse tree
	 */
	void exitNext_if_statement(FunctionCraftParser.Next_if_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#break_if_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_if_statement(FunctionCraftParser.Break_if_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#break_if_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_if_statement(FunctionCraftParser.Break_if_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#function_ptr}.
	 * @param ctx the parse tree
	 */
	void enterFunction_ptr(FunctionCraftParser.Function_ptrContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function_ptr}.
	 * @param ctx the parse tree
	 */
	void exitFunction_ptr(FunctionCraftParser.Function_ptrContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(FunctionCraftParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(FunctionCraftParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr_append}.
	 * @param ctx the parse tree
	 */
	void enterExpr_append(FunctionCraftParser.Expr_appendContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr_append}.
	 * @param ctx the parse tree
	 */
	void exitExpr_append(FunctionCraftParser.Expr_appendContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr_append_}.
	 * @param ctx the parse tree
	 */
	void enterExpr_append_(FunctionCraftParser.Expr_append_Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr_append_}.
	 * @param ctx the parse tree
	 */
	void exitExpr_append_(FunctionCraftParser.Expr_append_Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr_or}.
	 * @param ctx the parse tree
	 */
	void enterExpr_or(FunctionCraftParser.Expr_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr_or}.
	 * @param ctx the parse tree
	 */
	void exitExpr_or(FunctionCraftParser.Expr_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr_or_}.
	 * @param ctx the parse tree
	 */
	void enterExpr_or_(FunctionCraftParser.Expr_or_Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr_or_}.
	 * @param ctx the parse tree
	 */
	void exitExpr_or_(FunctionCraftParser.Expr_or_Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr_and}.
	 * @param ctx the parse tree
	 */
	void enterExpr_and(FunctionCraftParser.Expr_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr_and}.
	 * @param ctx the parse tree
	 */
	void exitExpr_and(FunctionCraftParser.Expr_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr_and_}.
	 * @param ctx the parse tree
	 */
	void enterExpr_and_(FunctionCraftParser.Expr_and_Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr_and_}.
	 * @param ctx the parse tree
	 */
	void exitExpr_and_(FunctionCraftParser.Expr_and_Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void enterExpr_eq(FunctionCraftParser.Expr_eqContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void exitExpr_eq(FunctionCraftParser.Expr_eqContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr_eq_}.
	 * @param ctx the parse tree
	 */
	void enterExpr_eq_(FunctionCraftParser.Expr_eq_Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr_eq_}.
	 * @param ctx the parse tree
	 */
	void exitExpr_eq_(FunctionCraftParser.Expr_eq_Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr_cmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_cmp(FunctionCraftParser.Expr_cmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr_cmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_cmp(FunctionCraftParser.Expr_cmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr_cmp_}.
	 * @param ctx the parse tree
	 */
	void enterExpr_cmp_(FunctionCraftParser.Expr_cmp_Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr_cmp_}.
	 * @param ctx the parse tree
	 */
	void exitExpr_cmp_(FunctionCraftParser.Expr_cmp_Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr_add_sub}.
	 * @param ctx the parse tree
	 */
	void enterExpr_add_sub(FunctionCraftParser.Expr_add_subContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr_add_sub}.
	 * @param ctx the parse tree
	 */
	void exitExpr_add_sub(FunctionCraftParser.Expr_add_subContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr_add_sub_}.
	 * @param ctx the parse tree
	 */
	void enterExpr_add_sub_(FunctionCraftParser.Expr_add_sub_Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr_add_sub_}.
	 * @param ctx the parse tree
	 */
	void exitExpr_add_sub_(FunctionCraftParser.Expr_add_sub_Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr_mul_div}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mul_div(FunctionCraftParser.Expr_mul_divContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr_mul_div}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mul_div(FunctionCraftParser.Expr_mul_divContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr_mul_div_}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mul_div_(FunctionCraftParser.Expr_mul_div_Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr_mul_div_}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mul_div_(FunctionCraftParser.Expr_mul_div_Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr_unary}.
	 * @param ctx the parse tree
	 */
	void enterExpr_unary(FunctionCraftParser.Expr_unaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr_unary}.
	 * @param ctx the parse tree
	 */
	void exitExpr_unary(FunctionCraftParser.Expr_unaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#expr_other}.
	 * @param ctx the parse tree
	 */
	void enterExpr_other(FunctionCraftParser.Expr_otherContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#expr_other}.
	 * @param ctx the parse tree
	 */
	void exitExpr_other(FunctionCraftParser.Expr_otherContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(FunctionCraftParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(FunctionCraftParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#primitive_function_call}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_function_call(FunctionCraftParser.Primitive_function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#primitive_function_call}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_function_call(FunctionCraftParser.Primitive_function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#matching}.
	 * @param ctx the parse tree
	 */
	void enterMatching(FunctionCraftParser.MatchingContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#matching}.
	 * @param ctx the parse tree
	 */
	void exitMatching(FunctionCraftParser.MatchingContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#puts}.
	 * @param ctx the parse tree
	 */
	void enterPuts(FunctionCraftParser.PutsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#puts}.
	 * @param ctx the parse tree
	 */
	void exitPuts(FunctionCraftParser.PutsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#push}.
	 * @param ctx the parse tree
	 */
	void enterPush(FunctionCraftParser.PushContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#push}.
	 * @param ctx the parse tree
	 */
	void exitPush(FunctionCraftParser.PushContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#len}.
	 * @param ctx the parse tree
	 */
	void enterLen(FunctionCraftParser.LenContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#len}.
	 * @param ctx the parse tree
	 */
	void exitLen(FunctionCraftParser.LenContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#chop}.
	 * @param ctx the parse tree
	 */
	void enterChop(FunctionCraftParser.ChopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#chop}.
	 * @param ctx the parse tree
	 */
	void exitChop(FunctionCraftParser.ChopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#chomp}.
	 * @param ctx the parse tree
	 */
	void enterChomp(FunctionCraftParser.ChompContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#chomp}.
	 * @param ctx the parse tree
	 */
	void exitChomp(FunctionCraftParser.ChompContext ctx);
}