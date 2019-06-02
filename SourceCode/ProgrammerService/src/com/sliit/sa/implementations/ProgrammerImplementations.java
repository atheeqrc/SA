package com.sliit.sa.implementations;

import com.sliit.sa.interfaces.ProgrammerInterfaces;

public class ProgrammerImplementations implements ProgrammerInterfaces {

	 
	public String DecimalToBinary(int decimal) {
		return Integer.toBinaryString(decimal);
	}

	 
	public String DecimalToHexaDecimal(int decimal) {
		return Integer.toHexString(decimal);
	}

	 
	public String DecimalToOctal(int decimal) {
		return Integer.toOctalString(decimal);
	}

	 
	public long BinaryToDecimal(String binary) {
		return Integer.parseInt(binary,2);
	}

	 
	public String BinaryToHexaDecimal(String binary) {
		int decimal =Integer.parseInt(binary,2);
		return Integer.toHexString(decimal);
	}

	 
	public String BinaryToOctal(String binary) {
		int decimal =Integer.parseInt(binary,2);
		return Integer.toOctalString(decimal);
	}

	 
	public long HexaDecimalToDecimal(String hexadecimal) {
		return Integer.parseInt(hexadecimal,16);
	}

	 
	public String HexaDecimalToBinary(String hexadecimal) {
		int decimal = Integer.parseInt(hexadecimal,16);
		return Integer.toBinaryString(decimal);
	}

	 
	public String HexaDecimalToOctal(String hexadecimal) {
		int decimal = Integer.parseInt(hexadecimal,16);
		return Integer.toOctalString(decimal);
	}

	 
	public long OctalToDecimal(String octal) {
		return Integer.parseInt(octal,8);
	}

	 
	public String OctalToBinary(String octal) {
		int decimal = Integer.parseInt(octal,8);
		return Integer.toBinaryString(decimal);
	}

	 
	public String OctalToHexaDecimal(String octal) {
		int decimal = Integer.parseInt(octal,8);
		return Integer.toHexString(decimal);
	}

}
