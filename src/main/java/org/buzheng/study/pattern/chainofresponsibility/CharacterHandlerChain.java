package org.buzheng.study.pattern.chainofresponsibility;

public class CharacterHandlerChain extends HandlerChain {

	@Override
	public void handleRequest(char c) {
		if (Character.isLetter(c)) {
			System.out.println("Character has been handled");
		} else {
			this.getSuccessor().handleRequest(c);
		}
	}

}
