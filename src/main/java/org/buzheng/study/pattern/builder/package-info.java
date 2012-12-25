/**
 * Builder
 * 
 * 将一个复杂对象的构建过程与它的表示分离，使得同样的构建过程可以
 * 创建不同的的表示。
 * 
 * Builder模式中的角色：
 * Director: 负责复杂对象的构建过程
 * Builder: 负责构建具体的具体步骤
 * Product：要被构建的对象
 * 
 * JDK中的例子：
 * StringBuilder
 * StringBuffer
 * 
 * {@link java.lang.StringBuilder#append()}
 * {@link java.lang.StringBuffer#append()}
 * 
 * StringBuilder是一个极其简单的Builder实现，StringBuilder本身充当
 * 了Builder和ConcreteBuilder角色，而Director角色则由使用者充当。
 * 
 * StringBuffer 原理一样。
 * 
 */
package org.buzheng.study.pattern.builder;