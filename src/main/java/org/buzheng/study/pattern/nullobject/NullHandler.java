package org.buzheng.study.pattern.nullobject;

public class NullHandler implements CharacterHandler {

	@Override
	public String handle(char c) {
		return String.valueOf(c);
	}

}
