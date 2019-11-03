// Generated from calculator.g4 by ANTLR 4.4
package main.antlr4_calculator;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calculatorParser}.
 */
public interface calculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code ACosine}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterACosine(@NotNull calculatorParser.ACosineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ACosine}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitACosine(@NotNull calculatorParser.ACosineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link calculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(@NotNull calculatorParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link calculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(@NotNull calculatorParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull calculatorParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull calculatorParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(@NotNull calculatorParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(@NotNull calculatorParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstantE}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterConstantE(@NotNull calculatorParser.ConstantEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstantE}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitConstantE(@NotNull calculatorParser.ConstantEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Scientific}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterScientific(@NotNull calculatorParser.ScientificContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Scientific}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitScientific(@NotNull calculatorParser.ScientificContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sine}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSine(@NotNull calculatorParser.SineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sine}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSine(@NotNull calculatorParser.SineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Braces}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBraces(@NotNull calculatorParser.BracesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Braces}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBraces(@NotNull calculatorParser.BracesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NaturalLogarithm}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNaturalLogarithm(@NotNull calculatorParser.NaturalLogarithmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NaturalLogarithm}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNaturalLogarithm(@NotNull calculatorParser.NaturalLogarithmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ASine}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterASine(@NotNull calculatorParser.ASineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ASine}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitASine(@NotNull calculatorParser.ASineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Logarithm}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogarithm(@NotNull calculatorParser.LogarithmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Logarithm}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogarithm(@NotNull calculatorParser.LogarithmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SquareRoot}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSquareRoot(@NotNull calculatorParser.SquareRootContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SquareRoot}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSquareRoot(@NotNull calculatorParser.SquareRootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link calculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(@NotNull calculatorParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link calculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(@NotNull calculatorParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(@NotNull calculatorParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(@NotNull calculatorParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Signed}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSigned(@NotNull calculatorParser.SignedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Signed}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSigned(@NotNull calculatorParser.SignedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Atoms}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAtoms(@NotNull calculatorParser.AtomsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Atoms}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAtoms(@NotNull calculatorParser.AtomsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Tangent}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTangent(@NotNull calculatorParser.TangentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Tangent}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTangent(@NotNull calculatorParser.TangentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Double}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterDouble(@NotNull calculatorParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitDouble(@NotNull calculatorParser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by {@link calculatorParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull calculatorParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link calculatorParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull calculatorParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterInteger(@NotNull calculatorParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Integer}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitInteger(@NotNull calculatorParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstantPI}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterConstantPI(@NotNull calculatorParser.ConstantPIContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstantPI}
	 * labeled alternative in {@link calculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitConstantPI(@NotNull calculatorParser.ConstantPIContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ATangent}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterATangent(@NotNull calculatorParser.ATangentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ATangent}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitATangent(@NotNull calculatorParser.ATangentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Power}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPower(@NotNull calculatorParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPower(@NotNull calculatorParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link calculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull calculatorParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link calculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull calculatorParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cosine}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCosine(@NotNull calculatorParser.CosineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cosine}
	 * labeled alternative in {@link calculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCosine(@NotNull calculatorParser.CosineContext ctx);
}