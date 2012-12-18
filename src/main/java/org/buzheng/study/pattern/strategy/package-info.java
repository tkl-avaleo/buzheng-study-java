/**
 * Strategy
 * 
 * 策略模式是对一系列可以替换的算法进行了抽象，是使用者与具体的
 * 策略解耦。
 * 
 * 策略模式与状态模式类似，但从使用场景上有所不同：状态是适用于
 * 状态的流转，也就是在几个状态间切换；策略则根据不同上下文选择
 * 不同的策略。
 * 
 * 例如在一个历法系统中，需要返回当天的日期，但同时要兼容公历和
 * 农历。这里变化的部分是获取当天的日期，因为公历和农历的日期不
 * 一样。我们就考虑抽象出这个变化的部分。
 * 
 * JDK中Strategy例子：
 * {@link java.util.Comparator#compare(Object, Object)}
 * {@link java.util.Collections#sort(java.util.List, java.util.Comparator)}
 * 
 */
package org.buzheng.study.pattern.strategy;