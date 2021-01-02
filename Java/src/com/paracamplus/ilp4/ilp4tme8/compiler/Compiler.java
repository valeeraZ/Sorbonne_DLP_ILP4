package com.paracamplus.ilp4.ilp4tme8.compiler;

import com.paracamplus.ilp1.compiler.AssignDestination;
import com.paracamplus.ilp1.compiler.CompilationException;
import com.paracamplus.ilp1.compiler.NoDestination;
import com.paracamplus.ilp1.compiler.interfaces.IASTCglobalVariable;
import com.paracamplus.ilp1.compiler.interfaces.IGlobalVariableEnvironment;
import com.paracamplus.ilp1.compiler.interfaces.IOperatorEnvironment;
import com.paracamplus.ilp1.interfaces.IASTvariable;
import com.paracamplus.ilp4.compiler.interfaces.IASTCclassDefinition;
import com.paracamplus.ilp4.compiler.interfaces.IASTCprogram;
import com.paracamplus.ilp4.ilp4tme8.compiler.interfaces.IASTCvisitor;
import com.paracamplus.ilp4.ilp4tme8.compiler.normalizer.INormalizationFactory;
import com.paracamplus.ilp4.ilp4tme8.compiler.normalizer.NormalizationFactory;
import com.paracamplus.ilp4.ilp4tme8.compiler.normalizer.Normalizer;
import com.paracamplus.ilp4.ilp4tme8.interfaces.IASThasProperty;
import com.paracamplus.ilp4.ilp4tme8.interfaces.IASTreadProperty;
import com.paracamplus.ilp4.ilp4tme8.interfaces.IASTwriteProperty;
import com.paracamplus.ilp4.interfaces.IASTprogram;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Set;

public class Compiler extends com.paracamplus.ilp4.compiler.Compiler
    implements IASTCvisitor<Void, Compiler.Context, CompilationException> {

    public Compiler(IOperatorEnvironment ioe, IGlobalVariableEnvironment igve) {
        super(ioe, igve);
    }

    public IASTCprogram normalize(IASTprogram program,
                                  IASTCclassDefinition objectClass)
            throws CompilationException {
        INormalizationFactory nf = new NormalizationFactory();
        Normalizer normalizer = new Normalizer(nf, objectClass);
        IASTCprogram newprogram = normalizer.transform(program);
        return newprogram;
    }

    public String compile(IASTprogram program,
                          IASTCclassDefinition objectClass)
            throws CompilationException {

        IASTCprogram newprogram = normalize(program, objectClass);
        newprogram = (IASTCprogram) optimizer.transform(newprogram);

        GlobalVariableCollector gvc = new GlobalVariableCollector();
        Set<IASTCglobalVariable> gvs = gvc.analyze(newprogram);
        newprogram.setGlobalVariables(gvs);

        FreeVariableCollector fvc = new FreeVariableCollector(newprogram);
        newprogram = fvc.analyze();

        Context context = new Context(NoDestination.NO_DESTINATION);
        StringWriter sw = new StringWriter();
        try {
            out = new BufferedWriter(sw);
            visit(newprogram, context);
            out.flush();
        } catch (IOException exc) {
            throw new CompilationException(exc);
        }
        return sw.toString();
    }

    @Override
    public Void visit(IASTreadProperty iast, Context context) throws CompilationException {
        emit("{ \n");

        IASTvariable tmpProperty = context.newTemporaryVariable();
        emit("  ILP_Object " + tmpProperty.getMangledName() + "; \n");
        Context cProperty = context.redirect(new AssignDestination(tmpProperty));
        iast.getProperty().accept(this, cProperty);

        IASTvariable tmpInstance = context.newTemporaryVariable();
        emit("  ILP_Object " + tmpInstance.getMangledName() + "; \n");
        Context cInstance = context.redirect(new AssignDestination(tmpInstance));
        iast.getTarget().accept(this, cInstance);

        emit(context.destination.compile());
        emit("ILP_read_property(");
        emit(tmpProperty.getMangledName());
        emit(", ");
        emit(tmpInstance.getMangledName());
        emit("); \n");

        emit("} \n");

        return null;
    }

    @Override
    public Void visit(IASTwriteProperty iast, Context context) throws CompilationException {
        emit("{ \n");

        IASTvariable tmpProperty = context.newTemporaryVariable();
        emit("  ILP_Object " + tmpProperty.getMangledName() + "; \n");
        Context cProperty = context.redirect(new AssignDestination(tmpProperty));
        iast.getProperty().accept(this, cProperty);

        IASTvariable tmpInstance = context.newTemporaryVariable();
        emit("  ILP_Object " + tmpInstance.getMangledName() + "; \n");
        Context cInstance = context.redirect(new AssignDestination(tmpInstance));
        iast.getTarget().accept(this, cInstance);

        IASTvariable tmpValue = context.newTemporaryVariable();
        emit("  ILP_Object " + tmpValue.getMangledName() + "; \n");
        Context cValue = context.redirect(new AssignDestination(tmpValue));
        iast.getValue().accept(this, cValue);

        emit(context.destination.compile());
        emit("ILP_write_property(");
        emit(tmpProperty.getMangledName());
        emit(", ");
        emit(tmpInstance.getMangledName());
        emit(", ");
        emit(tmpValue.getMangledName());
        emit("); \n");

        emit("} \n");

        return null;
    }

    @Override
    public Void visit(IASThasProperty iast, Context context) throws CompilationException {
        emit("{ \n");

        IASTvariable tmpProperty = context.newTemporaryVariable();
        emit("  ILP_Object " + tmpProperty.getMangledName() + "; \n");
        Context cProperty = context.redirect(new AssignDestination(tmpProperty));
        iast.getProperty().accept(this, cProperty);

        IASTvariable tmpInstance = context.newTemporaryVariable();
        emit("  ILP_Object " + tmpInstance.getMangledName() + "; \n");
        Context cInstance = context.redirect(new AssignDestination(tmpInstance));
        iast.getTarget().accept(this, cInstance);

        emit(context.destination.compile());
        emit("ILP_has_property(");
        emit(tmpProperty.getMangledName());
        emit(", ");
        emit(tmpInstance.getMangledName());
        emit("); \n");

        emit("} \n");

        return null;
    }
}
