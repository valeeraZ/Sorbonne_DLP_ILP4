// Generated from ILPMLgrammar4.g4 by ANTLR 4.4

    package antlr4;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ILPMLgrammar4Parser}.
 */
public interface ILPMLgrammar4Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ILPMLgrammar4Parser#globalFunDef}.
	 * @param ctx the parse tree
	 */
	void enterGlobalFunDef(@NotNull ILPMLgrammar4Parser.GlobalFunDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ILPMLgrammar4Parser#globalFunDef}.
	 * @param ctx the parse tree
	 */
	void exitGlobalFunDef(@NotNull ILPMLgrammar4Parser.GlobalFunDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code New}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNew(@NotNull ILPMLgrammar4Parser.NewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code New}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNew(@NotNull ILPMLgrammar4Parser.NewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull ILPMLgrammar4Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull ILPMLgrammar4Parser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Invocation}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInvocation(@NotNull ILPMLgrammar4Parser.InvocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Invocation}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInvocation(@NotNull ILPMLgrammar4Parser.InvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ILPMLgrammar4Parser#localFunDef}.
	 * @param ctx the parse tree
	 */
	void enterLocalFunDef(@NotNull ILPMLgrammar4Parser.LocalFunDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ILPMLgrammar4Parser#localFunDef}.
	 * @param ctx the parse tree
	 */
	void exitLocalFunDef(@NotNull ILPMLgrammar4Parser.LocalFunDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstFloat}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstFloat(@NotNull ILPMLgrammar4Parser.ConstFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstFloat}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstFloat(@NotNull ILPMLgrammar4Parser.ConstFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableAssign}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssign(@NotNull ILPMLgrammar4Parser.VariableAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableAssign}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssign(@NotNull ILPMLgrammar4Parser.VariableAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Self}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSelf(@NotNull ILPMLgrammar4Parser.SelfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Self}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSelf(@NotNull ILPMLgrammar4Parser.SelfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadField}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterReadField(@NotNull ILPMLgrammar4Parser.ReadFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadField}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitReadField(@NotNull ILPMLgrammar4Parser.ReadFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDefinition}
	 * labeled alternative in {@link ILPMLgrammar4Parser#globalDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinition(@NotNull ILPMLgrammar4Parser.ClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDefinition}
	 * labeled alternative in {@link ILPMLgrammar4Parser#globalDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinition(@NotNull ILPMLgrammar4Parser.ClassDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Send}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSend(@NotNull ILPMLgrammar4Parser.SendContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Send}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSend(@NotNull ILPMLgrammar4Parser.SendContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstInteger}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstInteger(@NotNull ILPMLgrammar4Parser.ConstIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstInteger}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstInteger(@NotNull ILPMLgrammar4Parser.ConstIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Super}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSuper(@NotNull ILPMLgrammar4Parser.SuperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Super}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSuper(@NotNull ILPMLgrammar4Parser.SuperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Codefinitions}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCodefinitions(@NotNull ILPMLgrammar4Parser.CodefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Codefinitions}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCodefinitions(@NotNull ILPMLgrammar4Parser.CodefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Try}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTry(@NotNull ILPMLgrammar4Parser.TryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Try}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTry(@NotNull ILPMLgrammar4Parser.TryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lambda}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLambda(@NotNull ILPMLgrammar4Parser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lambda}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLambda(@NotNull ILPMLgrammar4Parser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Binding}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinding(@NotNull ILPMLgrammar4Parser.BindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Binding}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinding(@NotNull ILPMLgrammar4Parser.BindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Loop}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLoop(@NotNull ILPMLgrammar4Parser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Loop}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLoop(@NotNull ILPMLgrammar4Parser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Alternative}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAlternative(@NotNull ILPMLgrammar4Parser.AlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Alternative}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAlternative(@NotNull ILPMLgrammar4Parser.AlternativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalFunctionDefinition}
	 * labeled alternative in {@link ILPMLgrammar4Parser#globalDef}.
	 * @param ctx the parse tree
	 */
	void enterGlobalFunctionDefinition(@NotNull ILPMLgrammar4Parser.GlobalFunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalFunctionDefinition}
	 * labeled alternative in {@link ILPMLgrammar4Parser#globalDef}.
	 * @param ctx the parse tree
	 */
	void exitGlobalFunctionDefinition(@NotNull ILPMLgrammar4Parser.GlobalFunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ILPMLgrammar4Parser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(@NotNull ILPMLgrammar4Parser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ILPMLgrammar4Parser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(@NotNull ILPMLgrammar4Parser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ILPMLgrammar4Parser#methodDef}.
	 * @param ctx the parse tree
	 */
	void enterMethodDef(@NotNull ILPMLgrammar4Parser.MethodDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ILPMLgrammar4Parser#methodDef}.
	 * @param ctx the parse tree
	 */
	void exitMethodDef(@NotNull ILPMLgrammar4Parser.MethodDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sequence}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSequence(@NotNull ILPMLgrammar4Parser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sequence}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSequence(@NotNull ILPMLgrammar4Parser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstFalse}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstFalse(@NotNull ILPMLgrammar4Parser.ConstFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstFalse}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstFalse(@NotNull ILPMLgrammar4Parser.ConstFalseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ILPMLgrammar4Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull ILPMLgrammar4Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ILPMLgrammar4Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull ILPMLgrammar4Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary(@NotNull ILPMLgrammar4Parser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary(@NotNull ILPMLgrammar4Parser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstTrue}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstTrue(@NotNull ILPMLgrammar4Parser.ConstTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstTrue}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstTrue(@NotNull ILPMLgrammar4Parser.ConstTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WriteField}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterWriteField(@NotNull ILPMLgrammar4Parser.WriteFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WriteField}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitWriteField(@NotNull ILPMLgrammar4Parser.WriteFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstString}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstString(@NotNull ILPMLgrammar4Parser.ConstStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstString}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstString(@NotNull ILPMLgrammar4Parser.ConstStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Binary}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinary(@NotNull ILPMLgrammar4Parser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Binary}
	 * labeled alternative in {@link ILPMLgrammar4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinary(@NotNull ILPMLgrammar4Parser.BinaryContext ctx);
}