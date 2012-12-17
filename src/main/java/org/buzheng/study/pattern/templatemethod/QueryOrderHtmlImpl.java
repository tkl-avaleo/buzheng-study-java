package org.buzheng.study.pattern.templatemethod;

public class QueryOrderHtmlImpl extends QueryOrder {

	@Override
	protected String formatOrderInfo(Order order) {
		return String.format("<table><tr><td>OrderId</td><td>%s</td></tr><tr><td>Amount</td><td>%s</td></tr></table>", 
				order.getOrderId(), String.valueOf(order.getAmount()));
	}

}
