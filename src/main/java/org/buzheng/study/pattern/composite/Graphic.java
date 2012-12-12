package org.buzheng.study.pattern.composite;

import java.util.List;

/**
 * Graphic 是一个画图组件的抽象， 抽象了所有可以画出来的
 * 组件（组件也可以包含其他组件）。
 * 
 * 其实现即可以是单独的不能包含其他组件的组件，也可以是
 * 可以包含其他子组件的组件。
 * 
 */
public interface Graphic {
	/**
	 * 定义如何画出自己
	 */
	public void draw();
	
	/**
	 * 添加子组件到自身中
	 * @param g 一个Graphic组件
	 * 
	 * @throws UnsupportedOperationException
	 *          实现类可能并不支持此操作
	 */
	public void add(Graphic g);
	
	/**
	 * 从自身包含的组件中移除指定的子组件
	 * @param g 要被移除的Graphic组件
	 * 
	 * @throws UnsupportedOperationException
	 *          实现类可能并不支持此操作
	 */
	public void remove(Graphic g);
	
	/**
	 * 
	 * @return 返回所有子组件
	 * 
	 * @throws UnsupportedOperationException
	 *          实现类可能并不支持此操作
	 */
	public List<Graphic> getChildren();
}
