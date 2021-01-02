package com.paracamplus.ilp4.ilp4tme8.interpreter;

import com.paracamplus.ilp1.interfaces.IASTexpression;
import com.paracamplus.ilp1.interpreter.interfaces.EvaluationException;
import com.paracamplus.ilp1.interpreter.interfaces.IGlobalVariableEnvironment;
import com.paracamplus.ilp1.interpreter.interfaces.ILexicalEnvironment;
import com.paracamplus.ilp1.interpreter.interfaces.IOperatorEnvironment;
import com.paracamplus.ilp4.ilp4tme8.interfaces.IASThasProperty;
import com.paracamplus.ilp4.ilp4tme8.interfaces.IASTreadProperty;
import com.paracamplus.ilp4.ilp4tme8.interfaces.IASTvisitor;
import com.paracamplus.ilp4.ilp4tme8.interfaces.IASTwriteProperty;
import com.paracamplus.ilp4.interfaces.IASTinstantiation;
import com.paracamplus.ilp4.interpreter.interfaces.IClass;
import com.paracamplus.ilp4.interpreter.interfaces.IClassEnvironment;

import java.util.List;
import java.util.Vector;

public class Interpreter extends com.paracamplus.ilp4.interpreter.Interpreter
    implements IASTvisitor<Object, ILexicalEnvironment, EvaluationException> {

    public Interpreter(IGlobalVariableEnvironment globalVariableEnvironment, IOperatorEnvironment operatorEnvironment, IClassEnvironment classEnvironment) {
        super(globalVariableEnvironment, operatorEnvironment, classEnvironment);
    }

    @Override
    public Object visit(IASTinstantiation iast, ILexicalEnvironment lexenv) throws EvaluationException {
        IClass clazz = getClassEnvironment().getILP9Class(iast.getClassName());
        List<Object> args = new Vector<Object>();
        for ( IASTexpression arg : iast.getArguments() ) {
            Object value = arg.accept(this, lexenv);
            args.add(value);
        }
        return new ILPInstance(clazz, args.toArray());
    }

    @Override
    public Object visit(IASTreadProperty iast, ILexicalEnvironment iLexicalEnvironment) throws EvaluationException {
        Object property = iast.getProperty().accept(this, iLexicalEnvironment);
        Object target = iast.getTarget().accept(this, iLexicalEnvironment);

        if(!(property instanceof String))
            throw new EvaluationException("Property given is not a string " + property);
        if(! (target instanceof ILPInstance))
            throw new EvaluationException("Target object given is not an instance " + target);
        ILPInstance instanceTarget = (ILPInstance)target;
        String stringProperty = (String)property;

        return instanceTarget.readProperty(stringProperty);
    }

    @Override
    public Object visit(IASTwriteProperty iast, ILexicalEnvironment iLexicalEnvironment) throws EvaluationException {
        Object property = iast.getProperty().accept(this, iLexicalEnvironment);
        Object target = iast.getTarget().accept(this, iLexicalEnvironment);
        Object value = iast.getValue().accept(this, iLexicalEnvironment);

        if(!(property instanceof String))
            throw new EvaluationException("Property given is not a string " + property);
        if(! (target instanceof ILPInstance))
            throw new EvaluationException("Target object given is not an instance " + target);
        ILPInstance instanceTarget = (ILPInstance)target;
        String stringProperty = (String)property;

        return instanceTarget.writeProperty(stringProperty, value);

    }

    @Override
    public Object visit(IASThasProperty iast, ILexicalEnvironment iLexicalEnvironment) throws EvaluationException {
        Object property = iast.getProperty().accept(this, iLexicalEnvironment);
        Object target = iast.getTarget().accept(this, iLexicalEnvironment);

        if(!(property instanceof String))
            throw new EvaluationException("Property given is not a string " + property);
        if(! (target instanceof ILPInstance))
            throw new EvaluationException("Target object given is not an instance " + target);
        ILPInstance instanceTarget = (ILPInstance)target;
        String stringProperty = (String)property;

        return instanceTarget.hasProperty(stringProperty);
    }
}
