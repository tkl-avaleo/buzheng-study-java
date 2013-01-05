package org.buzheng.study.pattern.singleton;

/**
 * 此种实现方式是依靠JVM能保证内部静态来只有在使用的时候
 * 才被加载，JVM也会保证静态变量只会赋值一次。
 *
 */
public class InnerStaticClassSingleton {
	
	private InnerStaticClassSingleton() {}
	
	static class SingletonHolder {
		private static InnerStaticClassSingleton instance = new InnerStaticClassSingleton();
	}
	
	public static InnerStaticClassSingleton getInstance() {
		return SingletonHolder.instance;
	}
}
