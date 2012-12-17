package org.buzheng.study.pattern.templatemethod;

public class Main {
	public static void main(String[] args) {
		// 默认格式输出
		QueryOrder qo = new QueryOrderImpl();
		System.out.println(qo.queryOrder("123456"));
		
		// json格式输出
		qo = new QueryOrderJsonImpl();
		System.out.println(qo.queryOrder("123456"));
		
		// html格式输出
		qo = new QueryOrderHtmlImpl();
		System.out.println(qo.queryOrder("123456"));
		
	}
}
