package org.buzheng.study.pattern.facade;

/**
 * OrderService 在内部系统运行良好，包含了订单操作逻辑。
 * 但是如果此时有其他模块（或其他系统）需要查询订单的信息，
 * 如果将 OrderService 全部暴露出去，会带来风险，比如其他系统可能会
 * 将订单删除。此时可以使用门面模式，只提供客户需要的接口。
 * 
 * 这个例子简单到只是隐藏了类的一些操作。更多Facade的应用在
 * 隐藏整个系统（模块）的应用。
 * 
 * 比如，商品中心系统一个复杂的系统，其对商品的操作也是很复杂的，
 * 作为下游系统可能不太关系这些东西，下游系统只需要查询商品的信息，
 * 比如（库存量、描述信息等），这时候可以单独提供一个商品中心的门面
 * 出来（RMI，Hessian，或者Web Service），以供下游系统使用。
 * 
 * 由此可以看出Facade可以起到简化其他系统对一个复杂系统的操作，保护
 * 内部系统的作用。
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
