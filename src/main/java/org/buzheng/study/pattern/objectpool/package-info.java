/**
 * Object Pool
 * 
 * Object Pool 也属于创建模式的一种，或者说是也是一种工厂。
 * Object Pool 管理着一组对象，负责对象的创建和销毁，并维护
 * 每个对象的状态。
 * 使用者从 Object Pool 中获取自己需要的对象，并不负责对象
 * 的创建也销毁，仅仅是使用。
 * 
 * 与工厂相关的模式：
 * Abstract Factory
 * Builder
 * Factory Method
 * Prototype
 * Singleton
 * Object Pool
 * 
 * 
 * 工厂的职责：
 * 1、创建对象。
 * 2、按照既定的规则管理/组织对象（比如需要创建对象的数量、如何共享对象等）。
 * 
 * 由此可以得出工厂带给我们的好处：
 * 1、将使用者和被使用者的创建过程/创建逻辑解耦（将使用者和被使用者解耦，
 *    因为大多数情况下，使用者不知道被使用者的具体类型）。
 * 2、集中创建/管理对象，提高程序的内聚性。
 * 
 * 工厂设计准则：
 * 对象要么构造或管理对象、要么使用其他对象，不应该兼而有之。
 *
 */
package org.buzheng.study.pattern.objectpool;