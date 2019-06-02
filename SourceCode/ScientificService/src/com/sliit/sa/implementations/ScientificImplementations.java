package com.sliit.sa.implementations;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import com.sliit.sa.interfaces.ScientificInterfaces;

public class ScientificImplementations implements ScientificInterfaces {

	
	public double ScientificCalculation(String expression) {
		ScriptEngineManager manager = new ScriptEngineManager();
	    ScriptEngine engine = manager.getEngineByName("JavaScript");
	    
	    try {
			return (double) engine.eval(expression+ "*1.0");
		} catch (ScriptException e) {
			
			e.printStackTrace();
		}
	    return -99;
	}

}
