package org.buzheng.study.pattern.chainofresponsibility;

import java.io.IOException;

public class Application2 {

	public static void main(String[] args) throws IOException {
		HandlerChain numberHandlerChain = new NumberHandlerChain();
		HandlerChain characterHandlerChain = new CharacterHandlerChain();
		HandlerChain symbolHandlerChain = new SymbolHandlerChain();

		numberHandlerChain.setSuccessor(characterHandlerChain);
		characterHandlerChain.setSuccessor(symbolHandlerChain);
		symbolHandlerChain.setSuccessor(numberHandlerChain);

		System.out.print("Press any key then return: ");
		char c = (char) System.in.read();
		numberHandlerChain.handleRequest(c);
	}

}
