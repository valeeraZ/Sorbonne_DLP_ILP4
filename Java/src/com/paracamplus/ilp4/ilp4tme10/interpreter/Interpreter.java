package com.paracamplus.ilp4.ilp4tme10.interpreter;

import java.util.Set;

import com.paracamplus.ilp4.interfaces.IASTprogram;
import com.paracamplus.ilp1.interfaces.IASTvariable;
import com.paracamplus.ilp4.interpreter.interfaces.IClassEnvironment;
import com.paracamplus.ilp1.interpreter.interfaces.IGlobalVariableEnvironment;
import com.paracamplus.ilp1.interpreter.interfaces.IOperatorEnvironment;
import com.paracamplus.ilp1.interpreter.interfaces.EvaluationException;
import com.paracamplus.ilp1.interpreter.interfaces.ILexicalEnvironment;
import com.paracamplus.ilp4.ilp4tme10.interfaces.IASTdefined;
import com.paracamplus.ilp4.ilp4tme10.interfaces.IASTexists;
import com.paracamplus.ilp4.ilp4tme10.interfaces.IASTvisitor;

/*
 * Évaluateur de l'interprète, enrichi avec nos nœuds.
 */

public class Interpreter
	extends com.paracamplus.ilp4.interpreter.Interpreter
	implements IASTvisitor<Object, ILexicalEnvironment, EvaluationException> {

	// Variables globales, collectées par notre GlobalVariableCollector
	protected Set<String> globals;
	
	public Interpreter(
			IGlobalVariableEnvironment globalVariableEnvironment,
			IOperatorEnvironment operatorEnvironment,
			IClassEnvironment classEnvironment) {
		super(globalVariableEnvironment, operatorEnvironment, classEnvironment);
	}
	

	/*
	 * Point d'entrée.
	 * Modifié pour appeler GlobalVariableCollectorInterpreter.
	 */
	@Override
	public Object visit(IASTprogram iast, ILexicalEnvironment lexenv)
			throws EvaluationException {
		// collecte des variables globales
		globals = (new GlobalVariableCollectorInterpreter()).visit(iast).getGlobals();
		// interprétation
		return super.visit(iast, lexenv);
	}
	
	
	/* 
	 * Nos nouveaux nœuds.
	 */

	@Override
	public Object visit(IASTexists iast, ILexicalEnvironment env)
			throws EvaluationException {
		IASTvariable var = iast.getVariable();
		// globale collectée
		return globals.contains(var.getName()) ||
				// utilie pour les constantes et primitives, qui ne sont pas dans globals
				getGlobalVariableEnvironment().getGlobalVariableValue(var.getName()) != null ||
				// locale
				env.isPresent(iast.getVariable());
	}

	@Override
	public Object visit(IASTdefined iast, ILexicalEnvironment env)
			throws EvaluationException {
		IASTvariable var = iast.getVariable();
		// globale déjà rencontrée (ou primitive)
		return getGlobalVariableEnvironment().getGlobalVariableValue(var.getName()) != null ||
				// locale
				env.isPresent(var);
	}

}
