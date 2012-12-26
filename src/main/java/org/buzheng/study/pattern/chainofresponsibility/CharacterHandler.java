package org.buzheng.study.pattern.chainofresponsibility;

public class CharacterHandler implements IHandler {
	
	public void handle() {
		System.out.println("Character has been handled");
	}
	
}
