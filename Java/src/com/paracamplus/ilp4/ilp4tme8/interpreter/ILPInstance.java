package com.paracamplus.ilp4.ilp4tme8.interpreter;

import com.paracamplus.ilp1.interpreter.interfaces.EvaluationException;
import com.paracamplus.ilp4.ilp4tme8.interpreter.interfaces.IInstance;
import com.paracamplus.ilp4.interpreter.interfaces.IClass;

import java.util.HashMap;
import java.util.Map;

public class ILPInstance extends com.paracamplus.ilp4.interpreter.ILPInstance implements IInstance {

    protected Map<String, Object> properties;

    public ILPInstance(IClass clazz, Object[] fields) throws EvaluationException {
        super(clazz, fields);
        properties = new HashMap<>();
    }

    @Override
    public Object readProperty(String propertyName) throws EvaluationException {
        try{
            return read(propertyName);
        }catch (EvaluationException e){
            //champs statiques
            //throw new EvaluationException("No property \"" + propertyName + "\" found");

            //champ dynamiques
            if(!properties.containsKey(propertyName))
                throw new EvaluationException("No property \"" + propertyName + "\" found");
            return properties.get(propertyName);
        }
    }

    @Override
    public Object writeProperty(String propertyName, Object value) throws EvaluationException {
        try{
            return write(propertyName, value);
        }catch (EvaluationException e){
            //champs statiques
            //throw new EvaluationException("No property \"" + propertyName + "\" found");

            //champ dynamiques
            Object propertyKV = properties.put(propertyName, value);
            //si la propriété n'existait pas
            if(propertyKV == null)
                return false;

            return propertyKV;
        }
    }

    @Override
    public boolean hasProperty(String propertyName) throws EvaluationException {
        try{
            classOf().getOffset(propertyName);
            return true;
        }catch (EvaluationException e){
            //champs statiques
            //return false;

            //champs dynamiques
            return properties.containsKey(propertyName);
        }
    }
}
