package com;

public class FlowChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FlowChart1();
		FlowChart2();

	}
	
	public static void FlowChart1() {
		for (int A = 100; A < 201; A++) {
			if (A < 200) {
				System.out.println("A");
				
			}
			else if(A >= 200) {
				System.out.println("End");
			}
			
		}
		
	}
	
	public static void FlowChart2() {
		for (int a = 100; a <= 201; a++) {
			
			if(a%2 == 0) {
				System.out.println("_");
			}
			else if(a%2 != 0) {
				System.out.println("*");
			}
			else if(a <= 200) {
				System.out.println("End");
			}
		}
	}
	

}
