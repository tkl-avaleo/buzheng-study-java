package org.buzheng.study.pattern.chainofresponsibility;

public class NumberHandlerChain extends HandlerChain {

	@Override
	public void handleRequest(char c) {
		if (Character.isDigit(c)) {
			System.out.println("Number has been handled");
		} else {
			this.getSuccessor().handleRequest(c);
		}
	}

}
