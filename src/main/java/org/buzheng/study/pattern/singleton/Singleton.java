package org.buzheng.study.pattern.singleton;

/**
 * 饿汉式实现
 * 
 * 一个Singleton模式的最简单实现，比较简单，也不用考虑多线程
 * 下的问题。
 * 
 * 其缺点就是当加载类的时候就会创建新的引用，可能会造成内存的
 * 提前占用。
 * 
 * 引起类加载的原因有很多，大多数情况下是由getInstance() 引起，
 * 但也不绝对，比如调用其他的static方法时。
 * 
 * 所以说大多数情况下，这种实现方式是适用的。
 * 
 */
public class Singleton {
	
	private static Singleton instance = new Singleton();
	
	public static Singleton getInstance() {
		return instance;
	}
	
	public static void anotherStaticMethod() {
		System.out.println("anotherStaticMethod");
	}
	
}
