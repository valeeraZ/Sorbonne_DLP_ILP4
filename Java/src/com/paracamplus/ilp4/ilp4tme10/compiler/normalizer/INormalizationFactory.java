package com.paracamplus.ilp4.ilp4tme10.compiler.normalizer;

import com.paracamplus.ilp1.interfaces.IASTexpression;
import com.paracamplus.ilp1.interfaces.IASTvariable;

/*
 * Interface de normalisation étendue à nos nœuds.
 */

public interface INormalizationFactory 
	extends com.paracamplus.ilp4.compiler.normalizer.INormalizationFactory {
	IASTexpression newExists(IASTvariable variable);
	IASTexpression newDefined(IASTvariable variable);
}
