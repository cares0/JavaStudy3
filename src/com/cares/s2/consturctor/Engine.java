package com.cares.s2.consturctor;

public class Engine {
	String name = "v1";
	String fuel = "f1";
	
	public Engine() {
		System.out.println("생성자 실행");
		this.name = "v3";
		this.fuel = "f3";
	}
	
	{
		//초기화 블럭
		name = "v2";
		this.fuel = "f2";
	}
	
	public void info() {
		System.out.println(this.name);
		System.out.println(this.fuel);
	}

}


