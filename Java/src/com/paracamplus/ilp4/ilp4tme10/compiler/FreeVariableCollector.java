package com.paracamplus.ilp4.ilp4tme10.compiler;

import com.paracamplus.ilp1.compiler.CompilationException;
import com.paracamplus.ilp1.compiler.interfaces.IASTClocalVariable;
import com.paracamplus.ilp4.compiler.interfaces.IASTCprogram;
import com.paracamplus.ilp4.ilp4tme10.compiler.interfaces.IASTCvisitor;
import com.paracamplus.ilp4.ilp4tme10.interfaces.IASTdefined;
import com.paracamplus.ilp4.ilp4tme10.interfaces.IASTexists;

import java.util.Set;

public class FreeVariableCollector
extends com.paracamplus.ilp4.compiler.FreeVariableCollector 
implements IASTCvisitor<Void, Set<IASTClocalVariable>, CompilationException> {

	public FreeVariableCollector(IASTCprogram program) {
		super(program);
	}

	/*
	 * Visiteur étendu à nos nouveaux nœuds:
	 */
	
	// 'exists' ignore simplement son argument
	@Override
	public Void visit(IASTexists iast, Set<IASTClocalVariable> data)
			throws CompilationException {
		return null;
	}

	// 'defined' se comporte comme une lecture de la variable
	@Override
	public Void visit(IASTdefined iast, Set<IASTClocalVariable> data)
			throws CompilationException {
		return iast.getVariable().accept(this,  data);
	}

}
