package org.buzheng.study.quartz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * quartz 普通调用
 *
 */
public class Main {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] {"classpath:org/buzheng/study/quartz/applicationContext-schedule.xml"});
		
	}

}
