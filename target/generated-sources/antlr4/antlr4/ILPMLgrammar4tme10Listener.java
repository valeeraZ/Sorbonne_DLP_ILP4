// Generated from ILPMLgrammar4tme10.g4 by ANTLR 4.4

    package antlr4;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ILPMLgrammar4tme10Parser}.
 */
public interface ILPMLgrammar4tme10Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ILPMLgrammar4tme10Parser#globalFunDef}.
	 * @param ctx the parse tree
	 */
	void enterGlobalFunDef(@NotNull ILPMLgrammar4tme10Parser.GlobalFunDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ILPMLgrammar4tme10Parser#globalFunDef}.
	 * @param ctx the parse tree
	 */
	void exitGlobalFunDef(@NotNull ILPMLgrammar4tme10Parser.GlobalFunDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code New}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNew(@NotNull ILPMLgrammar4tme10Parser.NewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code New}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNew(@NotNull ILPMLgrammar4tme10Parser.NewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull ILPMLgrammar4tme10Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull ILPMLgrammar4tme10Parser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Invocation}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInvocation(@NotNull ILPMLgrammar4tme10Parser.InvocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Invocation}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInvocation(@NotNull ILPMLgrammar4tme10Parser.InvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ILPMLgrammar4tme10Parser#localFunDef}.
	 * @param ctx the parse tree
	 */
	void enterLocalFunDef(@NotNull ILPMLgrammar4tme10Parser.LocalFunDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ILPMLgrammar4tme10Parser#localFunDef}.
	 * @param ctx the parse tree
	 */
	void exitLocalFunDef(@NotNull ILPMLgrammar4tme10Parser.LocalFunDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstFloat}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstFloat(@NotNull ILPMLgrammar4tme10Parser.ConstFloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstFloat}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstFloat(@NotNull ILPMLgrammar4tme10Parser.ConstFloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableAssign}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssign(@NotNull ILPMLgrammar4tme10Parser.VariableAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableAssign}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssign(@NotNull ILPMLgrammar4tme10Parser.VariableAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Self}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSelf(@NotNull ILPMLgrammar4tme10Parser.SelfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Self}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSelf(@NotNull ILPMLgrammar4tme10Parser.SelfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadField}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterReadField(@NotNull ILPMLgrammar4tme10Parser.ReadFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadField}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitReadField(@NotNull ILPMLgrammar4tme10Parser.ReadFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDefinition}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#globalDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDefinition(@NotNull ILPMLgrammar4tme10Parser.ClassDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDefinition}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#globalDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDefinition(@NotNull ILPMLgrammar4tme10Parser.ClassDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Send}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSend(@NotNull ILPMLgrammar4tme10Parser.SendContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Send}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSend(@NotNull ILPMLgrammar4tme10Parser.SendContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstInteger}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstInteger(@NotNull ILPMLgrammar4tme10Parser.ConstIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstInteger}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstInteger(@NotNull ILPMLgrammar4tme10Parser.ConstIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Super}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSuper(@NotNull ILPMLgrammar4tme10Parser.SuperContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Super}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSuper(@NotNull ILPMLgrammar4tme10Parser.SuperContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Codefinitions}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCodefinitions(@NotNull ILPMLgrammar4tme10Parser.CodefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Codefinitions}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCodefinitions(@NotNull ILPMLgrammar4tme10Parser.CodefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Try}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTry(@NotNull ILPMLgrammar4tme10Parser.TryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Try}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTry(@NotNull ILPMLgrammar4tme10Parser.TryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lambda}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLambda(@NotNull ILPMLgrammar4tme10Parser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lambda}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLambda(@NotNull ILPMLgrammar4tme10Parser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Binding}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinding(@NotNull ILPMLgrammar4tme10Parser.BindingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Binding}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinding(@NotNull ILPMLgrammar4tme10Parser.BindingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Loop}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLoop(@NotNull ILPMLgrammar4tme10Parser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Loop}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLoop(@NotNull ILPMLgrammar4tme10Parser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Alternative}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAlternative(@NotNull ILPMLgrammar4tme10Parser.AlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Alternative}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAlternative(@NotNull ILPMLgrammar4tme10Parser.AlternativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Defined}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDefined(@NotNull ILPMLgrammar4tme10Parser.DefinedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Defined}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDefined(@NotNull ILPMLgrammar4tme10Parser.DefinedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GlobalFunctionDefinition}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#globalDef}.
	 * @param ctx the parse tree
	 */
	void enterGlobalFunctionDefinition(@NotNull ILPMLgrammar4tme10Parser.GlobalFunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GlobalFunctionDefinition}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#globalDef}.
	 * @param ctx the parse tree
	 */
	void exitGlobalFunctionDefinition(@NotNull ILPMLgrammar4tme10Parser.GlobalFunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ILPMLgrammar4tme10Parser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(@NotNull ILPMLgrammar4tme10Parser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ILPMLgrammar4tme10Parser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(@NotNull ILPMLgrammar4tme10Parser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ILPMLgrammar4tme10Parser#methodDef}.
	 * @param ctx the parse tree
	 */
	void enterMethodDef(@NotNull ILPMLgrammar4tme10Parser.MethodDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ILPMLgrammar4tme10Parser#methodDef}.
	 * @param ctx the parse tree
	 */
	void exitMethodDef(@NotNull ILPMLgrammar4tme10Parser.MethodDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sequence}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSequence(@NotNull ILPMLgrammar4tme10Parser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sequence}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSequence(@NotNull ILPMLgrammar4tme10Parser.SequenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstFalse}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstFalse(@NotNull ILPMLgrammar4tme10Parser.ConstFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstFalse}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstFalse(@NotNull ILPMLgrammar4tme10Parser.ConstFalseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ILPMLgrammar4tme10Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull ILPMLgrammar4tme10Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ILPMLgrammar4tme10Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull ILPMLgrammar4tme10Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary(@NotNull ILPMLgrammar4tme10Parser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Unary}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary(@NotNull ILPMLgrammar4tme10Parser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstTrue}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstTrue(@NotNull ILPMLgrammar4tme10Parser.ConstTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstTrue}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstTrue(@NotNull ILPMLgrammar4tme10Parser.ConstTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Exists}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExists(@NotNull ILPMLgrammar4tme10Parser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Exists}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExists(@NotNull ILPMLgrammar4tme10Parser.ExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WriteField}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterWriteField(@NotNull ILPMLgrammar4tme10Parser.WriteFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WriteField}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitWriteField(@NotNull ILPMLgrammar4tme10Parser.WriteFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstString}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstString(@NotNull ILPMLgrammar4tme10Parser.ConstStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstString}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstString(@NotNull ILPMLgrammar4tme10Parser.ConstStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Binary}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinary(@NotNull ILPMLgrammar4tme10Parser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Binary}
	 * labeled alternative in {@link ILPMLgrammar4tme10Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinary(@NotNull ILPMLgrammar4tme10Parser.BinaryContext ctx);
}