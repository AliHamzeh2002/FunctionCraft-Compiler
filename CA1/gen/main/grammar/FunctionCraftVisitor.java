// Generated from C:/Users/ALI/OneDrive/Desktop/university/Project/Compiler/FunctionCraft-Compiler/CA1/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FunctionCraftParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FunctionCraftVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function_craft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_craft(FunctionCraftParser.Function_craftContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#comment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment(FunctionCraftParser.CommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function_scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_scope(FunctionCraftParser.Function_scopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(FunctionCraftParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(FunctionCraftParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_args(FunctionCraftParser.Function_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#lambda_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda_function(FunctionCraftParser.Lambda_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#primitive_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_value(FunctionCraftParser.Primitive_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(FunctionCraftParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(FunctionCraftParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#if_structure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_structure(FunctionCraftParser.If_structureContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#if_structure_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_structure_loop(FunctionCraftParser.If_structure_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(FunctionCraftParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(FunctionCraftParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(FunctionCraftParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#list_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_element(FunctionCraftParser.List_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(FunctionCraftParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#loop_scope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_scope(FunctionCraftParser.Loop_scopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#break_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_statement(FunctionCraftParser.Break_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#next_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext_statement(FunctionCraftParser.Next_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#next_if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext_if_statement(FunctionCraftParser.Next_if_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#break_if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_if_statement(FunctionCraftParser.Break_if_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function_ptr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_ptr(FunctionCraftParser.Function_ptrContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(FunctionCraftParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr_append}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_append(FunctionCraftParser.Expr_appendContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr_append_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_append_(FunctionCraftParser.Expr_append_Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_or(FunctionCraftParser.Expr_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr_or_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_or_(FunctionCraftParser.Expr_or_Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_and(FunctionCraftParser.Expr_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr_and_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_and_(FunctionCraftParser.Expr_and_Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr_eq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_eq(FunctionCraftParser.Expr_eqContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr_eq_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_eq_(FunctionCraftParser.Expr_eq_Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr_cmp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_cmp(FunctionCraftParser.Expr_cmpContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr_cmp_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_cmp_(FunctionCraftParser.Expr_cmp_Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr_add_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_add_sub(FunctionCraftParser.Expr_add_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr_add_sub_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_add_sub_(FunctionCraftParser.Expr_add_sub_Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr_mul_div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_mul_div(FunctionCraftParser.Expr_mul_divContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr_mul_div_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_mul_div_(FunctionCraftParser.Expr_mul_div_Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr_unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_unary(FunctionCraftParser.Expr_unaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#expr_other}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_other(FunctionCraftParser.Expr_otherContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(FunctionCraftParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#primitive_function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_function_call(FunctionCraftParser.Primitive_function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#matching}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatching(FunctionCraftParser.MatchingContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#puts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPuts(FunctionCraftParser.PutsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#push}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPush(FunctionCraftParser.PushContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#len}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLen(FunctionCraftParser.LenContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#chop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChop(FunctionCraftParser.ChopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#chomp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChomp(FunctionCraftParser.ChompContext ctx);
}