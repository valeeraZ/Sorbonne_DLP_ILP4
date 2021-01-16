package com.paracamplus.ilp4.ilp4tme10.compiler.normalizer;

import com.paracamplus.ilp1.interfaces.IASTexpression;
import com.paracamplus.ilp1.interfaces.IASTvariable;
import com.paracamplus.ilp4.ilp4tme10.ast.ASTdefined;
import com.paracamplus.ilp4.ilp4tme10.ast.ASTexists;
import com.paracamplus.ilp4.ilp4tme10.compiler.normalizer.INormalizationFactory;

/*
 * Étend la fabrique à nos nouveaux nœuds.
 */

public class NormalizationFactory
	extends com.paracamplus.ilp4.compiler.normalizer.NormalizationFactory
	implements INormalizationFactory {

	/*
	 *   Il n'y a pas de nœuds ASTCexists ou ASTCdefined spécifiques après
	 *  normalisation. On réutilise ASTexists et ASTdefined.
	 */

	 @Override
	public IASTexpression newExists(IASTvariable variable) {
		return new ASTexists(variable);
	}

	@Override
	public IASTexpression newDefined(IASTvariable variable) {
		return new ASTdefined(variable);
	}


}
