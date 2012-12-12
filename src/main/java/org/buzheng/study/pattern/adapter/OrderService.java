package org.buzheng.study.pattern.adapter;

/**
 * 到了重构的阶段，大伙都认识到针对接口编程的重要性，
 * 于是对订单的操作抽象出了一个接口OrderService，并定义了
 * 一下几个操作。
 *
 * 但是就的业务逻辑类如何和新的接口匹配呢？ 是老的业务逻辑类
 * 重新实现这个这个接口 还是 新增实现类呢？
 */
public interface OrderService {
	public void add(Order order);
	
	public void modify(Order order);
	
	public void delete(String orderId);
	
	public Order load(String orderId);
}
