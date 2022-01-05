package com.cares.s1.same;

public class SquareMain {

	public static void main(String[] args) {
		Square s1 = new Square();
		
		s1.width = 4;
		s1.height = 4;
		
		Square s2 = new Square();
		s2.width = 4;
		s2.height = 5;

		boolean check = s1.same(s2);
		
		System.out.println(check);
	}

}
