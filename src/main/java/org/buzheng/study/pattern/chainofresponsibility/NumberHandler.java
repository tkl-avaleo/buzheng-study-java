package org.buzheng.study.pattern.chainofresponsibility;

public class NumberHandler implements IHandler {
	
	public void handle() {
		System.out.println("Number has been handled");
	}
	
}
