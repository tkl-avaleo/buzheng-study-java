package org.buzheng.study.pattern.staticfactory;

public class Main2 {
	public static void main(String[] args) {
		Fruit apple = FruitFactory.getFruit("apple");
		apple.printName();
		
		Fruit pear = FruitFactory.getFruit("pear");
		pear.printName();
	}
}
