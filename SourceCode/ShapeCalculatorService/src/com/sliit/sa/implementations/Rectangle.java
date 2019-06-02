package com.sliit.sa.implementations;

import com.sliit.sa.interfaces.ShapeService;

public class Rectangle implements ShapeService {

	private double length;
	private double width;
	
	//Constructor
	public Rectangle() {		
		this.length=0.0;
		this.width=0.0;
	}

	//Constructor
	public Rectangle(double length, double width) {	
		this.length = length;
		this.width = width;
	}

	
	public double getArea() {
		
		return this.length * this.width;
	}

	
	public double getPerimeter() {
		
		return 2 * (this.length + this.width);
	}

}
