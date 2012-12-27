package org.buzheng.study.pattern.nullobject;

public class DigitHandler implements CharacterHandler {

	@Override
	public String handle(char c) {
		return "[" + c + "]";
	}

}
