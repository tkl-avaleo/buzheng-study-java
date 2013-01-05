package org.buzheng.study.pattern.singleton;

/**
 * 一个多线程环境下的Singleton模式的实现，采用了double-check来避免
 * 多次锁定对性能的消耗。
 * 
 * 这个实现在C/C++下完全没有问题，但由于java内存模型的问题（无序写入），
 * 会带来错误：JVM在在对象初始化开始后，就返回了，加入此时有其他线程
 * 来请求，instance已经不为null，而初始化还未完成，如果使用，会带来一些
 * 错误。
 * 更详细可参考：http://www.ibm.com/developerworks/cn/java/j-dcl.html
 * 
 * 所以double check locking 是实现Singleton模式时应该避免的。
 * 
 * 多线程下最靠谱的实现还是 饿汉式、内部静态类、枚举类.
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
