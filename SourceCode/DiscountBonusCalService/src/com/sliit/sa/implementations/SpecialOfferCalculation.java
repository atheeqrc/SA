package com.sliit.sa.implementations;

import com.sliit.sa.interfaces.SpecialOfferService;

public class SpecialOfferCalculation implements SpecialOfferService{

	private double discountPercentage;
	private double bonusPercentage;
	private double amount;
	
	
	public SpecialOfferCalculation(double bonusPercentage,double discountPercentage, double amount) {
		super();
		this.discountPercentage = discountPercentage;
		this.bonusPercentage = bonusPercentage;
		this.amount = amount;
		
	}
	
	public SpecialOfferCalculation() {
		super();
	}






	 
	public double calculateDiscount() {
		 
//		double discount = amount * (100-getDiscountPercentage()/100);
//		double toalAmont = amount - discount;
		return this.amount * (discountPercentage/100);
		
	}

	 
	public double calculateBonus() {
		 
		return this.amount * (bonusPercentage/100);
	}

	 
	public double totalAmount(String calType) {
		 
		if(calType.toLowerCase().equals("discount"))
			return this.amount - calculateDiscount();
		else if(calType.toLowerCase().equals("bonus")) 
			return this.amount + calculateBonus();
		
		else
			return 0;
	}

	
	
	
}
