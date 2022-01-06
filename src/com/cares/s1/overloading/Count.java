package com.cares.s1.overloading;

public class Count {

	public void sum(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
	}
	
	public void sum(int num1, double num2) {
		double sum = num1 + num2;
	}
	
	public void sum(long num1, float num2) {
		
	}
}
