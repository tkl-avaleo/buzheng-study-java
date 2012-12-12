package org.buzheng.study.pattern.adapter;

/**
 * 聪明的程序员想到了使用新的实现类，经验告诉他们修改现有的逻辑
 * 很可能会引入新的bug。在新的类里面将操作委托给老的业务对象就可以了。
 * 这样就保证了，即匹配了现有的接口又没有修改以前的业务逻辑。
 * 
 * 这就是 Object Adapter，一个利用组合现有操作来匹配目标接口的方式。
 */
public class OrderServiceAdapter implements OrderService {
	
	private OrderBiz orderBiz;

	public OrderServiceAdapter(OrderBiz orderBiz) {
		super();
		this.orderBiz = orderBiz;
	}

	public void add(Order order) {
		this.orderBiz.addOrder(order);
	}

	public void modify(Order order) {
		this.orderBiz.modifyOrder(order);
	}

	public void delete(String orderId) {
		this.orderBiz.deleteOrder(orderId);
	}

	public Order load(String orderId) {
		return this.orderBiz.loadOrder(orderId);
	}

}
