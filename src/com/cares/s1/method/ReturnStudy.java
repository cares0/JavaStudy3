package com.cares.s1.method;

import java.util.Random;
import java.util.Scanner;

public class ReturnStudy {
	
	public void test1() {
		System.out.println("void는 리턴이 없을 때 사용");
		
	}
	
	public int test2() {
		Random random = new Random();
		int num = random.nextInt(10);
		System.out.println(num);
		return num;
		
	}
	
	public int test3() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}
	
	public void test4() {
		
	}
}
