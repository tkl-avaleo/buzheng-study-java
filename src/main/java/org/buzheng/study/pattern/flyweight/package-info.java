/**
 * Flyweight
 * 
 * Flyweight提供了共享对象，节省存储空间（内存）的方法。
 * 她提倡将公共的重复的部分提取出来，单独管理，从而避免
 * 过多的不必要的存储开销。
 * 
 * Flyweight一般要结合工厂模式，工厂负责维护一个对象池，
 * 对这些小对象进行管理，保证对象的不重复。
 * 
 * flyweight跟我们数据库设计的思路是一样的。对于数据中重复
 * 的字段内容，我们一般都是将其提取出来，单独表维护，原表
 * 通过外键关联到需要的内容。
 * 
 * 比如我们有一个订单信息表，出了订单信息，还有配送信息刚开始我们可能这么设计：
 * orderId,
 * orderAmount, 
 * username,
 * userEmail,
 * userAddress,
 * userPhone
 * 
 * 随着数据的增多，我们发现用户要下多个订单，然后订单表中的
 * 用户配送信息数据就大量重复，于是我们就像到，将用户配送信息独立到专门的
 * 用户配送信息表中，设计如下：
 * 订单表：
 * orderId,
 * orderAmount,
 * deliverId
 * 
 * 用户配送信息表：
 * deliverId,
 * username,
 * userEmail,
 * userAddress,
 * userPhone
 * 
 * 经过这样的整合，就能使一些重复使用一些配送信息。
 * 这是数据库设计的一个思路，这跟Flyweight的思路是一样的。
 * 
 * 另一个Flyweight的场景是：如果你在做一个文字处理软件，由于要处理大量
 * 的文字/单词，如果每个文字/单词都创建一个对象，必然会有大量的对象，
 * 其创建需要大量的时间，而存储需要大量的空间，此时我们就可以将文字/单词
 * 作为可以共享的对象，通过FlyweightFactory来管理。工厂的策略就是“不存在
 * 就创建，否则返回存在的”。
 * 
 * Java 字符串类也是一样的道理，在Java中，会维护一个字符串池子，
 * 当通过String s = "aaa"; 来创建字符串时，会首先检查是否在池子
 * 中存在，如果存在，就直接返回，否则就创建一个新字符串。
 *
 */
package org.buzheng.study.pattern.flyweight;