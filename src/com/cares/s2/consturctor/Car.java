package com.cares.s2.consturctor;

public class Car {

	String brand;
	public static String company = "kia";
	String color;
	int cc;
	
	// 생성자
	public Car() {
		this("k7");
//		this.brand = "k7";
//		this.company = "kia";
//		this.color = "black";
//		this.cc = 2000;
	}
	
	public Car(String brand) {
		this(brand,"black");
//		this.company = "kia";
//		this.brand = brand; 
//		this.color = "black";
//		this.cc = 2000;
	}
	
	public Car(String brand, String color) {
		this(brand, color, 2000);
//		this.company = "kia";
//		this.brand = brand; 
//		this.color = color; 
//		this.cc = 2000;
	}
	
	public Car(String brand, String color, int cc) {
		this.brand = brand; 
		this.color = color; 
		this.cc = cc; 
	}
	
	// 멤버메서드
	public void info() {
		System.out.println("멤버메서드");
		System.out.println(Car.company);
		System.out.println(this.brand);
		System.out.println(this.cc);
	}

}
