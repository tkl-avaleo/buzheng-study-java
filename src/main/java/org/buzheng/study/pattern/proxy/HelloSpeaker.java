package org.buzheng.study.pattern.proxy;

public class HelloSpeaker implements IHello {
	
	public void sayHello(String name) {
		System.out.println("hello " + name);
	}
	
}
