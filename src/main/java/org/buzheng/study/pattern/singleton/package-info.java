/**
 * Singleton
 * 
 * Singleton模式的目的就是保证在运行环境中只有一个对象实例。
 * 主要的实现思路是将构造方法私有化，由类本身完成对象的建立
 * 并保证只有一个对象实例，同时提供一个公共的操作才提供该实例。
 * 
 * 实现Singleton的几种方式：
 * 1、直接初始化对象，参见Singleton.java。
 * 2、Lazy Initialization，就是在需要的时候才初始化对象。参见
 * LazySingleton.java
 * 3、如果是在多线程/并发环境下，第二种并不适用，于是引入Double Check
 * 方式，来保证对象只被初始化一次，参见DoubleCheckSingleton.java
 * 4、由于JVM的特性，第三种方式也可能存在问题（JVM会在对象未初始化完成
 * 就返回），于是有了使用内部类的方式来实现。参见：
 * InnerClassSingleton.java
 * 
 * 
 * 
 */
package org.buzheng.study.pattern.singleton;