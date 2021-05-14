package com;

public class Runner {
	
	public static void main(String[] args) {
		
		Add(15,18);
		Subtract(10,5);
		Multiply(23,100);
		Divide(50,2);
	}
	
	
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
		System.out.println(result);
		return(result);
	}
}
