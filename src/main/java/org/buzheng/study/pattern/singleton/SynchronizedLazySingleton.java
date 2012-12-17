package org.buzheng.study.pattern.singleton;

/**
 * Singleton模式延迟初始化实现，保证只有在需要的时候才创建对象。
 * 但这种方式只适用于单线程的场景，多线程环境下仍有可能产生多个实例。
 * 
 * 通过在方法上声明synchronized可以保证只有一个实例，但是如果并发
 * 很多，这里将会成为瓶颈，影响整个系统的性能。
 *
 */
public class SynchronizedLazySingleton {
	private SynchronizedLazySingleton() {}
	
	private static SynchronizedLazySingleton instance = null;
	
	public static synchronized SynchronizedLazySingleton getInstance() {
		if (instance == null) {
			instance = new SynchronizedLazySingleton();
		}
		
		return instance;
	}
}
