/**
 * 
 */
/**
 * 将一个复杂对象的创建过程与它的表示分离，使得同样的构建过程可以
 * 创建不同的的表示。
 *
 * JDK中的例子：
 * StringBuilder
 * StringBuffer
 * 
 * StringBuilder是一个极其简单的Builder实现，StringBuilder本身充当
 * 了Builder和ConcreteBuilder角色，而Director角色则由使用者充当。
 * 
 * StringBuffer 原理一样。
 * 
 */
package org.buzheng.study.pattern.builder;