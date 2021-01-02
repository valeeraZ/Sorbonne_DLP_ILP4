package com.paracamplus.ilp4.ilp4tme8.interpreter.interfaces;

import com.paracamplus.ilp1.interpreter.interfaces.EvaluationException;

public interface IInstance extends com.paracamplus.ilp4.interpreter.interfaces.IInstance {
    Object readProperty(String propertyName) throws EvaluationException;
    Object writeProperty(String propertyName, Object value) throws EvaluationException;
    boolean hasProperty(String propertyName) throws EvaluationException;
}
