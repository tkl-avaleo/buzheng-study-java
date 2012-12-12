package org.buzheng.study.pattern.adapter;

/**
 * 下面是一个利用集成现有类来实现的 Class Adapter
 *
 */
public class OrderServiceAdapter2 extends OrderBiz 
		implements OrderService {

	public void add(Order order) {
		this.addOrder(order);
	}

	public void modify(Order order) {
		this.modifyOrder(order);
	}

	public void delete(String orderId) {
		this.deleteOrder(orderId);
	}

	public Order load(String orderId) {
		return this.loadOrder(orderId);
	}

}
