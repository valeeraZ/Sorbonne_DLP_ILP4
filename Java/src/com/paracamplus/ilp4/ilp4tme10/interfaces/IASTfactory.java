package com.paracamplus.ilp4.ilp4tme10.interfaces;

import com.paracamplus.ilp1.interfaces.IASTexpression;
import com.paracamplus.ilp1.interfaces.IASTvariable;

/*
 * Interface de fabrique étendue à nos nœuds.
 */

public interface IASTfactory 
extends com.paracamplus.ilp4.interfaces.IASTfactory {
	public IASTexpression newDefined(IASTvariable variable);
	public IASTexpression newExists(IASTvariable variable);
}
