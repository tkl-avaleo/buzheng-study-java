
/**
 * Observer
 * 
 * 观察者模式也是侦听器模式，有时也称作 发布-订阅 模式；还有时候
 * 被称作 模型-视图 模式（因为在传统的MVC模式中，M 变动了之后需要
 * 通知给关注他的 V，而前提就是就是 V 需要注册到 M）。
 * 
 * Observer模式使 Observable对象与具体的 Observer 对象解耦，Observable
 * 不关心具体的Observer对象，他只知道所有Observers的抽象；Observable
 * 还可以管理多个Observers。
 * 
 * Observer模式的局限性：
 * 如果Observer太多，则通知需要耗费的时间可能太长；
 * 如果Observer间有依赖关系，则可能产生错乱；
 *
 */
package org.buzheng.study.pattern.observer;