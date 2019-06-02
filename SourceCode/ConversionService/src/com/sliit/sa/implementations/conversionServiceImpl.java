package com.sliit.sa.implementations;

import com.sliit.sa.interfaces.conversionService;

public class conversionServiceImpl implements conversionService {

//length
	public double convertKmtoMiles(int kilometer) {
		return kilometer/1.60935;
	}
	
	public double convertMiletoKm(int miles) {
		return miles*1.60935;
	}
	
	public double convertYardtoM(int yards) {
		return yards*0.9144;
	}
	
	public double convertMtoYard(int meter) {
		return meter/0.9144;
	}
	
	public double convertInchestoFoot(int inch) {
		return inch/12.00;
	}
	public double convertFoottoInches(int foot) {
		return foot*12.00;
	}
	
	public double convertCmtoInches(int centimeter) {
		return centimeter/2.54;
	}
	
	public double convertInchestoCm(int inch) {
		return inch*2.54;
	}
		
	public double convertMtoKm(int meter) {
		
		return meter/1000.0;
	}

	public double convertKmtoM(int kilometer) {
		
		return kilometer*1000.0;
	}
	
	public double convertCmtoM(int centimeter){
		return centimeter/100.0;
	}
	
	public double convertMtoCm(int meter){
		return meter*100.0;
	}
	
	public double convertMmtoCm(int millimeter){
		return millimeter/10.0;
	}
	
	public double convertCmtoMm(int centimeter){
		return centimeter*10.0;
	}
	
	public double convertMMtoMm(int micrometer) {
		return micrometer/1000.0;
	}
	
	public double convertMmtoMM(int millimeter) {
		return millimeter*1000.0;
	}
	
	public double convertNmtoMm(int nanometer) {
		return nanometer/1000.0;
	}
	public double convertMmtoNm(int micrometer) {
		return micrometer*1000.0;
	}
	
	
//temperature
	public double convertKtoC(int k) {
		return k-273.15;
	}
	
	public double convertCtoK(int c) {
		return c+273.15;
	}
	
	public double convertCtoF(int c) {
		return c*1.8+32.0;
	}
	
	public double convertFtoC(int f) {
		return (f-32.0)/1.8;
	}

//weight
	
	public double convertMgtoG(int milligram) {
		return milligram/1000.0;
	}

	 
	public double convertGtoMg(int gram) {
		
		return gram*1000.0;
	}

	 
	public double convertGtoKg(int gram) {
		
		return gram/1000.0;
	}

	 
	public double convertKgtoG(int kg) {
		
		return kg*1000.0;
	}

	 
	public double convertKgtoTon(int kg) {
		
		return kg/1000.0;
	}

	 
	public double convertTontoKg(int ton) {
		
		return ton*1000.0;
	}

	 
	public double convertGtoCarrat(int gram) {
		
		return gram*5;
	}

	 
	public double convertCarrattoG(int carrat) {
		
		return carrat/5;
	}

	 
	public double convertGtoPound(int gram) {
		
		return gram/453.592;
	}

	 
	public double convertPoundtoG(int pound) {
		
		return pound*453.592;
	}

	 
	public double convertPoundtoOunce(int pound) {
		
		return pound*16;
	}

	 
	public double convertOuncetoPound(int ounce) {
		
		return ounce/16;
	}
	

	

}
