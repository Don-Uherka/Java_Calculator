package com;

public class calculator {
	
	
	public static int Add(Integer input1, Integer input2) {
		int value1 = input1;
		int value2 = input2;
		int result = value1 + value2;
		System.out.println(result);
		return(result);
		
	}
	
	public static int Subtract(Integer input1, Integer input2) {
		int value1 = input1;
		int value2 = input2;
		int result = value1 - value2;
		System.out.println(result);
		return(result);
	}
	
	public static int Multiply(Integer input1, Integer input2) {
		int value1 = input1;
		int value2 = input2;
		int result = value1 * value2;
		System.out.println(result);
		return(result);
	}
	
	public static double Divide(double input1, double input2) {
		double value1 = input1;
		double value2 = input2;
		double result = value1 / value2;
		if(value1 < value2) {
			System.out.println(result);
			return(result);
		}
		else if(value1 > value2) {
			System.out.println("this division could not be performed");
		}
		
		System.out.println(result);
		return(result);
	}

}
