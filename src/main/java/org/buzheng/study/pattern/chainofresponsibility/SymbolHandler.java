package org.buzheng.study.pattern.chainofresponsibility;

public class SymbolHandler implements IHandler {

	@Override
	public void handle() {
		System.out.println("Symbol has been handled");		
	}

}
