package org.buzheng.study.pattern.chainofresponsibility;

public class SymbolHandlerChain extends HandlerChain {

	@Override
	public void handleRequest(char c) {
		if (!Character.isDigit(c) && !Character.isLetter(c)) {
			System.out.println("Symbol has been handled");
		} else {
			this.getSuccessor().handleRequest(c);
		}
	}

}
