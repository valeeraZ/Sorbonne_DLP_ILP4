package com.paracamplus.ilp4.ilp4tme8.ast;

import com.paracamplus.ilp1.interfaces.IASTexpression;
import com.paracamplus.ilp4.ilp4tme8.interfaces.IASTfactory;

public class ASTfactory extends com.paracamplus.ilp4.ast.ASTfactory implements IASTfactory {
    @Override
    public IASTexpression newReadProperty(IASTexpression property, IASTexpression target) {
        return new ASTreadProperty(property, target);
    }

    @Override
    public IASTexpression newWriteProperty(IASTexpression property, IASTexpression target, IASTexpression value) {
        return new ASTwriteProperty(property, target, value);
    }

    @Override
    public IASTexpression newHasProperty(IASTexpression property, IASTexpression target) {
        return new ASThasProperty(property, target);
    }
}
