package org.buzheng.study.pattern.nullobject;

/**
 * 给定一个字符，将字母用()包围，数字用[]包围， 其他字符不处理。
 * 
 */
public class Main {

	public static String handleCharacter(char ch) {
		CharacterHandler handler = HandlerFactory.getHandler(ch);
		if (handler != null) {
			return handler.handle(ch);
		}

		return String.valueOf(ch);
	}

	public static String handleCharacter2(char ch) {
		CharacterHandler handler = HandlerFactoryWithNullHandler.getHandler(ch);
		return handler.handle(ch);
	}

	public static void main(String[] args) {
		String str = "1a@b#2c$d";

		for (char ch : str.toCharArray()) {
			System.out.println(handleCharacter2(ch));
		}
	}

}
