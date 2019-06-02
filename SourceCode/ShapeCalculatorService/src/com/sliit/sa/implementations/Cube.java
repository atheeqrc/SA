package com.sliit.sa.implementations;

import com.sliit.sa.interfaces.SolidShapeService;

public class Cube implements SolidShapeService {

	private double length;
	
	//Constructor
	public Cube(double length) {
		this.length = length;
	}

	
	public double getArea() {
		
		return 6 * (this.length * this.length);
	}

	
	public double getVolume() {
		
		return this.length * this.length * this.length;
	}



}
