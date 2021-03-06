/**
 * Bridge
 * 
 * Bridge模式将抽象部分和实现部分分离，是他们可以独立的变化。
 * 这里的实现，并不是指抽象的实现类，而是指行为的实现方式。
 * 根据“发现变化并封装”的原则，我们先找到变化，这里的变化
 * 有2部分：
 * 1、抽象的部分，抽象有很多存在形式。比如不同形状等。
 * 2、实现的部分，实现有很多不同的方式。比如不同平台、不同驱动等。
 * 
 * 据说JDBC是Bridge模式的一个应用，但是目前还没搞清楚。JDBC中
 * 实现部分是Driver，但是抽象部分还不确定。
 * 
 */
package org.buzheng.study.pattern.bridge;