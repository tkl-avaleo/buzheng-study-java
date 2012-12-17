package org.buzheng.study.pattern.templatemethod;

public abstract class QueryOrder {
	
	public String queryOrder(String orderId) {
		Order order = this.getOrderInfo(orderId);
		return this.formatOrderInfo(order);
	}
	
	private Order getOrderInfo(String orderId) {
		return new Order();
	}
	
	protected abstract String formatOrderInfo(Order order);
	
}
