/**
 * Decorator
 * 
 * Decorator的魔力在于能够在原有对象的基础上动态的增加额外的职责。
 * 她依然采用“优先使用组合”的原则，委托其他对象完成操作。
 * 
 * java.io包中大量采用了decorator模式，比如 BufferedInputReader(InputReader)
 * ， BufferedInputReader就在InutReader的定义的操作的基础上
 * 又增加了readLine操作，更加方便对字符的处理。
 * 
 * 
 * 
 */
package org.buzheng.study.pattern.decorator;