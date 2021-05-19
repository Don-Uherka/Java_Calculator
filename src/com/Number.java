package com;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddNumber(74);

	}
	
	public static void AddNumber(Integer num1) {
	
		int input1 = 74 % 10;
		
		int input2 = (num1 - (num1 % 10)) / 10;
		
		System.out.println(input1 + input2);
	}

}
