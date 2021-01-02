package com.paracamplus.ilp4.ilp4tme8.interpreter;

import com.paracamplus.ilp1.interpreter.interfaces.EvaluationException;
import com.paracamplus.ilp4.ilp4tme8.interpreter.interfaces.IInstance;
import com.paracamplus.ilp4.interpreter.interfaces.IClass;

public class ILPInstance extends com.paracamplus.ilp4.interpreter.ILPInstance implements IInstance {

    public ILPInstance(IClass clazz, Object[] fields) throws EvaluationException {
        super(clazz, fields);
    }

    @Override
    public Object readProperty(String propertyName) throws EvaluationException {
        try{
            return read(propertyName);
        }catch (EvaluationException e){
            throw new EvaluationException("No property \"" + propertyName + "\" found");
        }
    }

    @Override
    public Object writeProperty(String propertyName, Object value) throws EvaluationException {
        try{
            return write(propertyName, value);
        }catch (EvaluationException e){
            throw new EvaluationException("No property \"" + propertyName + "\" found");
        }
    }

    @Override
    public boolean hasProperty(String propertyName) throws EvaluationException {
        try{
            classOf().getOffset(propertyName);
            return true;
        }catch (EvaluationException e){
            return false;
        }
    }
}
