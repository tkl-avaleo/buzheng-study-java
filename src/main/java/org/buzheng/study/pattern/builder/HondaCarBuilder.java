package org.buzheng.study.pattern.builder;

public class HondaCarBuilder implements CarBuilder {

	@Override
	public void buildCarFrame() {
		System.out.println("build honda car frame");
	}

	@Override
	public void buildWheel() {
		System.out.println("build honda car wheel");
	}

	@Override
	public void buildDoor() {
		System.out.println("build honda car door");
	}

	@Override
	public Car buildCar() {
		System.out.println("build honda car over");
		return new HondaCar();
	}


}
