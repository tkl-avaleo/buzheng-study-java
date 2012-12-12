package org.buzheng.study.pattern.singleton;

/**
 * 一个多线程环境下的Singleton模式的实现，采用了double-check来避免
 * 多次锁定对性能的消耗。
 * 
 * 此种实现的问题在于，JVM很有可能在对象未完全初始化完成就返回了，此时
 * 其他线程仍然会创建对象，所以并不能保证只产生一个实例。
 * 
 * 多线程下最靠谱的还是 Singleton 和 InnerClassSingleton.
 * 
 */
public class DoubleCheckSingleton {
	private DoubleCheckSingleton() {}
	
	private static DoubleCheckSingleton instance;
	public DoubleCheckSingleton getInstance() {
		
		if (instance == null) {
			synchronized (this) {
				if (instance == null) {
					instance = new DoubleCheckSingleton();
				}
			}
		}
		
		return instance; 
	}
}
