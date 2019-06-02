package com.sliit.sa.implementations;

import com.sliit.sa.interfaces.ShapeService;

public class Square implements ShapeService {

	private double length;
	
	//Constructor
	public Square(double length) {
		this.length = length;
	}

	//Constructor
	public Square() {
		
		this.length = 0.0;
	}

	
	public double getArea() {
		
		return this.length * this.length;
	}


	
	public double getPerimeter() {
		
		return 4 * this.length;
	}

}
