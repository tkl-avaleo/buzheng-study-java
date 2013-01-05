package org.buzheng.study.pattern.singleton;

/**
 * 懒汉式
 * 
 * Singleton模式延迟初始化实现，保证只有在需要的时候才创建对象。
 * 但这种方式只适用于单线程的场景，多线程环境下仍有可能产生多个实例。
 *
 */
public class LazySingleton {
	private LazySingleton() {}
	
	private static LazySingleton instance = null;
	
	public static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		
		return instance;
	}
}
