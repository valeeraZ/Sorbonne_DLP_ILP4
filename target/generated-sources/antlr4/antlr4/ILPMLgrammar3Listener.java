// Generated from ILPMLgrammar3.g4 by ANTLR 4.4

    package antlr4;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ILPMLgrammar3Parser}.
 */
public interface ILPMLgrammar3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ILPMLgrammar3Parser#globalFunDef}.
	 * @param ctx the parse tree
	 */
	void enterGlobalFunDef(@NotNull ILPMLgrammar3Parser.GlobalFunDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ILPMLgrammar3Parser#globalFunDef}.
	 * @param ctx the parse tree
	 */
	void exitGlobalFunDef(@NotNull ILPMLgrammar3Parser.GlobalFunDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Binding}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinding(@NotNull ILPMLgrammar3Parser.BindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Binding}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinding(@NotNull ILPMLgrammar3Parser.BindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Loop}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLoop(@NotNull ILPMLgrammar3Parser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Loop}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLoop(@NotNull ILPMLgrammar3Parser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull ILPMLgrammar3Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull ILPMLgrammar3Parser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Alternative}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAlternative(@NotNull ILPMLgrammar3Parser.AlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Alternative}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAlternative(@NotNull ILPMLgrammar3Parser.AlternativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Invocation}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInvocation(@NotNull ILPMLgrammar3Parser.InvocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Invocation}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInvocation(@NotNull ILPMLgrammar3Parser.InvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ILPMLgrammar3Parser#localFunDef}.
	 * @param ctx the parse tree
	 */
	void enterLocalFunDef(@NotNull ILPMLgrammar3Parser.LocalFunDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ILPMLgrammar3Parser#localFunDef}.
	 * @param ctx the parse tree
	 */
	void exitLocalFunDef(@NotNull ILPMLgrammar3Parser.LocalFunDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstFloat}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstFloat(@NotNull ILPMLgrammar3Parser.ConstFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstFloat}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstFloat(@NotNull ILPMLgrammar3Parser.ConstFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableAssign}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssign(@NotNull ILPMLgrammar3Parser.VariableAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableAssign}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssign(@NotNull ILPMLgrammar3Parser.VariableAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sequence}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSequence(@NotNull ILPMLgrammar3Parser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sequence}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSequence(@NotNull ILPMLgrammar3Parser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstFalse}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstFalse(@NotNull ILPMLgrammar3Parser.ConstFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstFalse}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstFalse(@NotNull ILPMLgrammar3Parser.ConstFalseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ILPMLgrammar3Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull ILPMLgrammar3Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ILPMLgrammar3Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull ILPMLgrammar3Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary(@NotNull ILPMLgrammar3Parser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary(@NotNull ILPMLgrammar3Parser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstTrue}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstTrue(@NotNull ILPMLgrammar3Parser.ConstTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstTrue}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstTrue(@NotNull ILPMLgrammar3Parser.ConstTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstInteger}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstInteger(@NotNull ILPMLgrammar3Parser.ConstIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstInteger}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstInteger(@NotNull ILPMLgrammar3Parser.ConstIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Codefinitions}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCodefinitions(@NotNull ILPMLgrammar3Parser.CodefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Codefinitions}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCodefinitions(@NotNull ILPMLgrammar3Parser.CodefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstString}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstString(@NotNull ILPMLgrammar3Parser.ConstStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstString}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstString(@NotNull ILPMLgrammar3Parser.ConstStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Try}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTry(@NotNull ILPMLgrammar3Parser.TryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Try}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTry(@NotNull ILPMLgrammar3Parser.TryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Binary}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinary(@NotNull ILPMLgrammar3Parser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Binary}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinary(@NotNull ILPMLgrammar3Parser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lambda}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLambda(@NotNull ILPMLgrammar3Parser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lambda}
	 * labeled alternative in {@link ILPMLgrammar3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLambda(@NotNull ILPMLgrammar3Parser.LambdaContext ctx);
}