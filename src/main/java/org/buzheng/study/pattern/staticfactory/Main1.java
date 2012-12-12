package org.buzheng.study.pattern.staticfactory;

public final class Main1 {
	public static void main(String[] args) {
		Fruit apple = new Apple();
		apple.printName();
		
		Fruit pear = new Pear();
		pear.printName();
	}
}
