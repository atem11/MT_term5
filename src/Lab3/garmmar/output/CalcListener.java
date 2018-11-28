// Generated from Calc.g4 by ANTLR 4.7.1

package Lab3.garmmar.output;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcParser}.
 */
public interface CalcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcParser#calc}.
	 * @param ctx the parse tree
	 */
	void enterCalc(CalcParser.CalcContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#calc}.
	 * @param ctx the parse tree
	 */
	void exitCalc(CalcParser.CalcContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#statment}.
	 * @param ctx the parse tree
	 */
	void enterStatment(CalcParser.StatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#statment}.
	 * @param ctx the parse tree
	 */
	void exitStatment(CalcParser.StatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CalcParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CalcParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#multExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultExpression(CalcParser.MultExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#multExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultExpression(CalcParser.MultExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalcParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(CalcParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(CalcParser.AtomContext ctx);
}