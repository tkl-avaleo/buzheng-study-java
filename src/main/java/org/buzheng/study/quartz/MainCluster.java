package org.buzheng.study.quartz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Quartz 集群支持测试
 *
 */
public class MainCluster {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] {"classpath:org/buzheng/study/quartz/applicationContext-cluster.xml"});
		
	}

}
