package com;

import java.util.Arrays;

public class Java_Array_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int number : numbers ) {
//			generate(number);
//		}
		array();

	}

	public static int numbers[] = { 12, 15, 25, 55, 65, 33, 90, 89, 112 };
	public static int[] array = new int[10];

	public static void generate(int number) {
		System.out.println(number);
	}

	public static void array() {

		for (int i = 0; i < 10; i++) {
			array[i] = i;
		}
		System.out.println(Arrays.toString(array));
	}

}
