package org.buzheng.study.pattern.singleton;

/**
 * 此种实现方式是依靠JVM能保证内部静态来只有在使用的时候
 * 才被加载，JVM也会保证静态变量只会赋值一次。
 *
 */
public class InnerClassSingleton {
	
	private InnerClassSingleton() {
		System.out.println("init InnerClassSingleton");
	}
	
	static class InnerClassSingletonInstance {
		private static InnerClassSingleton instance = new InnerClassSingleton();
	}
	
	public static InnerClassSingleton getInstance() {
		return InnerClassSingletonInstance.instance;
	}
	
	public static void anotherStaticMethod() {
		System.out.println("anotherStaticMethod");
	}
	
	public static void main(String[] args) {
		System.out.println("------------------------");
		
//		InnerClassSingleton.getInstance();
		InnerClassSingleton.anotherStaticMethod();
	}
}
