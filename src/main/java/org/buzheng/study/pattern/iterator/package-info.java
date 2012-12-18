/**
 * Iterator
 * 
 * Iterator为如何访问集合内部的元素定义了一个统一的访问方式。
 * 
 * 最好的例子就是JDK中的Iterator类，她是一个接口，定义了一系列
 * 访问集合的操作，可参见 java.util.Iterator，我们可以看到她
 * 定义了如下3个操作：
 * boolean hasNext() 循环过程中是否更多的元素
 * E next() 获取下一个元素
 * void remove() 删除一个元素
 * 
 * Collection中定义了iterator方法，由其实现类实现自己的迭代器，
 * 因为只有实现类才知道自己的内部结构。这样保证了所有Collection
 * 的子类有一致的访问方式。
 * 
 * 注意，一般JDK中的Iterator实现都是fail-fast机制的，也就是如果
 * 在遍历的过程中，有其他的进程/线程删除/修改集合，则会抛出异常 
 * java.util.ConcurrentModificationException
 * 
 */
/**
 *
 */
package org.buzheng.study.pattern.iterator;