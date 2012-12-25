package org.buzheng.study.pattern.builder;

public class Main {

	public static void main(String[] args) {
		CarBuilder carBuilder = new HondaCarBuilder();
		CarDirector carDirector = new CarDirector(carBuilder);
		
		Car car = carDirector.buildCar();
		
		System.out.println("----- " + car.getCarName());
	}

}
