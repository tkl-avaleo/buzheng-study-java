package org.buzheng.study.pattern.facade;

/**
 * OrderService 封装了操作Order的相关逻辑：增删改查。
 * 在内部系统中运行良好。
 */
public class OrderService {
	public void add(Order order) {
		System.out.println("add order: " + order);
	}
	
	public void modify(Order order) {
		System.out.println("modify order: " + order);
	}
	
	public void delete(String orderId) {
		System.out.println("delete order: " + orderId);
	}
	
	public Order load(String orderId) {
		System.out.println("load order: " + orderId);
		return new Order();
	}
}
