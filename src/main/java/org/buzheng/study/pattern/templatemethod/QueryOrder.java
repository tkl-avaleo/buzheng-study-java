package org.buzheng.study.pattern.templatemethod;

public abstract class QueryOrder {
	
	public String queryOrder(String orderId) {
		Order order = this.getOrderInfo(orderId);
		return this.formatOrderInfo(order);
	}
	
	private Order getOrderInfo(String orderId) {
		
		Order order = new Order();
		order.setOrderId("123456");
		order.setAmount(1000.0);
		
		return order;
	}
	
	// 只留给子类来实现
	protected abstract String formatOrderInfo(Order order);
	
}
