package com.paracamplus.ilp4.ilp4tme10.compiler;

import java.util.Set;

import com.paracamplus.ilp1.compiler.CompilationException;
import com.paracamplus.ilp1.compiler.interfaces.IASTCglobalVariable;
import com.paracamplus.ilp4.ilp4tme10.compiler.interfaces.IASTCvisitor;
import com.paracamplus.ilp4.ilp4tme10.interfaces.IASTdefined;
import com.paracamplus.ilp4.ilp4tme10.interfaces.IASTexists;

public class GlobalVariableCollector 
    extends com.paracamplus.ilp4.compiler.GlobalVariableCollector
	implements IASTCvisitor<Set<IASTCglobalVariable>, 
		Set<IASTCglobalVariable>, 
		CompilationException> {

	/*
	 * Visiteur étendu à nos nouveaux nœuds
	 */

	// 'exists' ignore son argument
	// en effet, 'defined x' ne compte pas comme une lecture ni une
	// écriture, sinon, on changerait le résultat du test d'existence !
	@Override
	public Set<IASTCglobalVariable> visit(IASTexists iast,
			Set<IASTCglobalVariable> data) throws CompilationException {
		return data;
	}

	// 'defined' se comporte comme une lecture de variable
	// ceci assure que la variable est bien créée dans le code C
	// même si elle n'est utilisée que dans le nœud 'defined'
	// => dans ce dernier cas, 'defined x' renverra 'false', car elle
	// correspondra à une nouvelle variable globale jamais utilisée en 
	// dehors du nœud
	@Override
	public Set<IASTCglobalVariable> visit(IASTdefined iast,
			Set<IASTCglobalVariable> data) throws CompilationException {
		return iast.getVariable().accept(this,  data);
	}

}
