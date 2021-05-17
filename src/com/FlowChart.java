package com;

public class FlowChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlowChart1();

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

}
