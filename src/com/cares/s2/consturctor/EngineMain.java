package com.cares.s2.consturctor;

public class EngineMain {

	public static void main(String[] args) {
		Engine engine = new Engine();
		engine.info();
		
		engine.name = "v4";
		engine.fuel = "f4";
				
		engine.info();
	
	}

}
