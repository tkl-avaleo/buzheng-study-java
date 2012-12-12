package org.buzheng.study.pattern.singleton;

/**
 * 一个Single模式的最简单实现，比较简单，也不用考虑多线程
 * 下的问题。
 * 缺点就是可能会提前初始化，造成内存占用。
 */
public class Singleton {
	
	private Singleton() {
		System.out.println("init Singleton");
	}
	
	private static Singleton instance = new Singleton();
	
	public static Singleton getInstance() {
		return instance;
	}
	
	public static void anotherStaticMethod() {
		System.out.println("anotherStaticMethod");
	}
	
	public static void main(String[] args) {
		System.out.println("------------------------");
	}
}
