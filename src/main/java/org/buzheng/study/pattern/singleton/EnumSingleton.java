package org.buzheng.study.pattern.singleton;

/**
 * 使用枚举类型的特性来实现单例也是一个不错的选择。
 * 不但能够避免多线程的同步问题，而且还能防止反序列化重新创建
 * 新的对象。
 * 
 * 唯一不足的是这种写法看起来有些古怪。
 * 
 */
public enum EnumSingleton {
	INSTANCE {
		public void method() {
			System.out.println("instance......");
		}
	};
	
	public abstract void method();
}
