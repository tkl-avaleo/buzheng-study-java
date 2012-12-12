package org.buzheng.study.pattern.staticfactory;

public class FruitFactory {
	
	public static Fruit getFruit(String name) {
		if ("apple".equals(name)) {
			return new Apple();
		} else if ("pear".equals(name)) {
			return new Pear();
		} 

		throw new IllegalArgumentException("not supported arg: " + name);
	}
	
}
