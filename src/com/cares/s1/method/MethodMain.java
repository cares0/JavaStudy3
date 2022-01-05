package com.cares.s1.method;

public class MethodMain {

	public static void main(String[] args) {
		System.out.println("MainMethod Start");

		System.out.println("conflict test");

		System.out.println("Git - Hub");

		
		ReturnStudy rs = new ReturnStudy();
		
		rs.test1();
		
		int num = rs.test2();
		System.out.println(num);
		
		System.out.println("MainMethod FInish");
		

	}

}
