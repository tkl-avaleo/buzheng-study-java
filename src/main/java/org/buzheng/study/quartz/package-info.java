/**
 * 本包中的程序主要演示，集群环境下quartz的配置。
 * 
 * 
 * spring 3.2只支持quartz 1.8.6 或以前版本。 quartz 2.0.2开始对有些类
 * 进行了重新，并不向前兼容。 比如：
 * JobDetail、CronTrigger在之前的版本是个类，现在变成了接口。 
 * 
 * org.springframework.scheduling.quartz.CronTriggerBean 
 * 这个类 extends CronTrigger类，如果使用2.0.2或以后版本的话，
 * 就会报错：java.lang.IncompatibleClassChangeError: 
 * class org.springframework.scheduling.quartz.CronTriggerBean 
 * has interface org.quartz.CronTrigger as super class
 * 
 * 
 * 参考：
 * http://blog.csdn.net/lifetragedy/article/details/6212831
 * http://www.iteye.com/topic/486055
 * http://blog.csdn.net/cuihaiyang/article/details/6742869
 * 
 * 
 */
package org.buzheng.study.quartz;