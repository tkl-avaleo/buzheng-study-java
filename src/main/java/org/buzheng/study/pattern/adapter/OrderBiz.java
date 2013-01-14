package org.buzheng.study.pattern.adapter;

/**
 * 这是一个已经存在的运行很久的订单操作类
 *
 */
public class OrderBiz {	
	public void addOrder(Order order) {
		System.out.println("add order: " + order);
	}
	
	public void modifyOrder(Order order) {
		System.out.println("modify order: " + order);
	}
	
	public void deleteOrder(String orderId) {
		System.out.println("delete order: " + orderId);
	}
	
	public Order loadOrder(String orderId) {
		System.out.println("load order: " + orderId);
		return new Order();
	}	
}
