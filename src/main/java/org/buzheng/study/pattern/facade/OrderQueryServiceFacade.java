package org.buzheng.study.pattern.facade;

/**
 * OrderService 在内部系统运行良好，包含了订单操作逻辑。
 * 但是如果此时有其他模块（或其他系统）需要查询订单的信息，
 * 如果将 OrderService 全部暴露出去，会带来风险，比如其他系统可能会
 * 将订单删除。此时可以使用门面模式，只提供客户需要的操作。
 * 
 * 
 * 
 */
public class OrderQueryServiceFacade {
	private OrderService orderService;
		
	public OrderQueryServiceFacade(OrderService orderService) {
		super();
		this.orderService = orderService;
	}

	/*
	 * 这里是需要暴露的操作，不一定与原接口相同。
	 * 比如下面的 queryById
	 */
	public Order load(String orderId) {
		return this.orderService.load(orderId);
	}
	
	public Order queryById(String orderId) {
		return this.load(orderId);
	}
	
}
