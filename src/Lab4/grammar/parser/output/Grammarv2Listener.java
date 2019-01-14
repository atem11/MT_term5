// Generated from Grammarv2.g4 by ANTLR 4.7.1

package Lab4.grammar.parser.output;
import Lab4.grammar.Grammar;
import Lab4.grammar.rules.*;
import Lab4.grammar.term.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Grammarv2Parser}.
 */
public interface Grammarv2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Grammarv2Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(Grammarv2Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammarv2Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(Grammarv2Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammarv2Parser#imports}.
	 * @param ctx the parse tree
	 */
	void enterImports(Grammarv2Parser.ImportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammarv2Parser#imports}.
	 * @param ctx the parse tree
	 */
	void exitImports(Grammarv2Parser.ImportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammarv2Parser#rules}.
	 * @param ctx the parse tree
	 */
	void enterRules(Grammarv2Parser.RulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammarv2Parser#rules}.
	 * @param ctx the parse tree
	 */
	void exitRules(Grammarv2Parser.RulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammarv2Parser#nonterm_rule}.
	 * @param ctx the parse tree
	 */
	void enterNonterm_rule(Grammarv2Parser.Nonterm_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammarv2Parser#nonterm_rule}.
	 * @param ctx the parse tree
	 */
	void exitNonterm_rule(Grammarv2Parser.Nonterm_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammarv2Parser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(Grammarv2Parser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammarv2Parser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(Grammarv2Parser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammarv2Parser#one_pat}.
	 * @param ctx the parse tree
	 */
	void enterOne_pat(Grammarv2Parser.One_patContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammarv2Parser#one_pat}.
	 * @param ctx the parse tree
	 */
	void exitOne_pat(Grammarv2Parser.One_patContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammarv2Parser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(Grammarv2Parser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammarv2Parser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(Grammarv2Parser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammarv2Parser#args}.
	 * @param ctx the parse tree
	 */
	void enterArgs(Grammarv2Parser.ArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammarv2Parser#args}.
	 * @param ctx the parse tree
	 */
	void exitArgs(Grammarv2Parser.ArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammarv2Parser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(Grammarv2Parser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammarv2Parser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(Grammarv2Parser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammarv2Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(Grammarv2Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammarv2Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(Grammarv2Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Grammarv2Parser#ret_arg}.
	 * @param ctx the parse tree
	 */
	void enterRet_arg(Grammarv2Parser.Ret_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link Grammarv2Parser#ret_arg}.
	 * @param ctx the parse tree
	 */
	void exitRet_arg(Grammarv2Parser.Ret_argContext ctx);
}