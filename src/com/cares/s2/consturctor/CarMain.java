package com.cares.s2.consturctor;

public class CarMain {

	public static void main(String[] args) {
		
		// 변수 선언 = new 생성자호출
		
		Car car = new Car();
		car.info();
		
		Car car2 = new Car("k5");
		car2.info();
			
		
	}

}
