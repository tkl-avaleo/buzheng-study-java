package org.buzheng.study.pattern.chainofresponsibility;

public abstract class HandlerChain {

	private HandlerChain successor;

	public HandlerChain getSuccessor() {
		return successor;
	}

	public void setSuccessor(HandlerChain successor) {
		this.successor = successor;
	}
	
	public abstract void handleRequest(char c);
	
//	public void handleRequest(char c) {
//		if (this.successor != null) {
//			this.successor.handleRequest(c);
//		}
//	}

}
