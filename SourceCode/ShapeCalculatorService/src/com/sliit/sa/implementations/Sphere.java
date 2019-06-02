package com.sliit.sa.implementations;

import com.sliit.sa.interfaces.SolidShapeService;

public class Sphere implements SolidShapeService {

	private double radius;
	
	//Constructor
	public Sphere(double radius) {
		this.radius = radius;
	}

	
	public double getArea() {
		
		return 4 * 3.14 * (this.radius*this.radius);
	}

	
	public double getVolume() {
		
		return ((4/3) * 3.14 * (this.radius*this.radius*this.radius));
	}

	

}
