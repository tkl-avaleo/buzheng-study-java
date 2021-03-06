package org.buzheng.study.pattern.nullobject;

public class HandlerFactoryWithNullHandler {
	
	public static CharacterHandler getHandler(char ch) {
		if (Character.isLetter(ch)) {
			return new LetterHandler();
		} else if (Character.isDigit(ch)) {
			return new DigitHandler();
		} 
		
		return new NullHandler();
	}
}
