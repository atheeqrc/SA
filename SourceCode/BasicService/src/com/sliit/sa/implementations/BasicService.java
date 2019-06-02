package com.sliit.sa.implementations;

import com.sliit.sa.interfaces.BasicServiceInterfaces;

public class BasicService implements BasicServiceInterfaces {

	
	public double add(double num1, double num2) {
		
		return num1+num2*1.0;
	}

	
	public double substract(double num1, double num2) {
		
		return num1-num2*1.0;
	}

	
	public double multiply(double num1, double num2) {
		
		return num1*num2*1.0;
	}

	
	public double divide(double num1, double num2) {
	
		return num1/num2*1.0;
	}

}
