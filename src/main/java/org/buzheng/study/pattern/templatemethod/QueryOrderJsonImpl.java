package org.buzheng.study.pattern.templatemethod;

public class QueryOrderJsonImpl extends QueryOrder {

	@Override
	protected String formatOrderInfo(Order order) {
		return String.format("{userId:%s, amount:%s}", order.getOrderId(), String.valueOf(order.getAmount()));
	}

}
