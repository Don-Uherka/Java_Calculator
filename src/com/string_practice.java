package com;

public class string_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		strings();
		subString();
		stringCounter();

	}

	
	public static void strings() {
		String x = "TODAY IT IS SUNNY";
		String y = "YESTERDAY IT WAS RAINING";
		System.out.println(x.toUpperCase() + "," + y.toUpperCase());
	}
	public static void subString() {
		String x = "TODAY IT IS SUNNY";
		String y = "YESTERDAY IT WAS RAINING";
		String substring = x.substring(0, 11);
		String substring2 = y.substring(16, 24);
		System.out.println(substring.toUpperCase() + substring2.toUpperCase());
	}
	public static void stringCounter() {
		String w = "Hello World";
		System.out.print(w);
	}
}
