package org.buzheng.study.pattern.builder;

public interface CarBuilder {
	
	/**
	 * 车架
	 */
	public void buildCarFrame();
	
	/**
	 * 方向盘
	 */
	public void buildWheel();
	
	/**
	 * 车门
	 */
	public void buildDoor();
	
	
	public Car buildCar();
}
