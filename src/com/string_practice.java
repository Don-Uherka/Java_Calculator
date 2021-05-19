package com;

public class string_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(numOfWords("Hello this is a string"));
		printVertically();

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
	
	public static int numOfWords(String s) {
		if (s.length() == 0) return 0;
		int words = 1;
		
		for(int i = 0; i < s.length(); i++) {
			String current = s.substring(i, i + 1);
			
			if (current.equals(" ")) {
				words++;
			}
		}
		return words;
	}
	
	public static void printVertically() {
		
		String testString = "Hello World this is a string";
		
		int wordLengthCount = 0;
		
		for(int i = 0; i < testString.length(); i++) {
			
			String spaceCheck = testString.substring(i, i + 1);
			
			if (spaceCheck.equals(" ")) {
				
				
				System.out.println(testString.substring(i - wordLengthCount, i));
				
				wordLengthCount = 0;
			} else {
				wordLengthCount++;
			}
		}
	}
}
