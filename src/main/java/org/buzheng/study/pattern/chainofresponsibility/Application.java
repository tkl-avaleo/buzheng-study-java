package org.buzheng.study.pattern.chainofresponsibility;

import java.io.IOException;

public class Application {

	public static void main(String[] args) throws IOException {
		System.out.print("Press any key then return: ");
		char c = (char) System.in.read();

		IHandler handler = null;
		if (Character.isLetter(c)) {
			handler = new CharacterHandler();
		} else if (Character.isDigit(c)) {
			handler = new NumberHandler();
		} else {
			handler = new SymbolHandler();
		}

		handler.handle();
	}

}
