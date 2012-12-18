/**
 * Visitor 
 * 
 * Visitor模式主要用于对容器/树等元素遍历是，将对元素的操作
 * 都集中到访问者中，被访问者只需要接受或不接受访问者的操作，
 * 如果接受则按访问者的执行访问者的操作。
 * 
 * 这个例子来源于http://www.jdon.com/designpatterns/visitor.htm
 * 
 * Visitor模式利用了原则：找到变化并封装，但是却违背了开闭-原则，
 * 试想如果经常有新类型Visitable添加进来，就得频繁的修改Visitor
 * 的实现类。
 * 
 * 据说利用java反射可以解决这类问题，还没研究过，这里有个英文
 * 文档，先收藏：
 * http://www.javaworld.com/javaworld/javatips/jw-javatip98.html
 *
 */
package org.buzheng.study.pattern.visitor;