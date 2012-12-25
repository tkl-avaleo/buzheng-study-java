package org.buzheng.study.pattern.builder;

public class CarDirector {
	
	private CarBuilder carBuilder;
	
	public CarDirector(CarBuilder carBuilder) {
		this.carBuilder = carBuilder;
	}

	public Car buildCar() {
		carBuilder.buildCarFrame();
		carBuilder.buildDoor();
		carBuilder.buildWheel();
		
		return carBuilder.buildCar();
	}
	
}
