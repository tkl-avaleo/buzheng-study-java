package org.buzheng.study.pattern.nullobject;

public class LetterHandler implements CharacterHandler {

	@Override
	public String handle(char c) {
		return "(" + c + ")";
	}

}
