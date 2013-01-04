/**
 * JPA （Java Persistence API）
 * javaEE 5.0 制定的规范，目的是想提供一个统一的方式访问持有层。
 * 
 * 提供了pojo编程模型为持久化对象的机制：通过注解或者XML配置 描述
 * 对象 与 关系数据表 的映射关系，并将运行期的对象持久化到数据库中。
 * 
 * JPA是一个规范，而不是ORM框架，他只提供了一组API，需要具体的ORM
 * 框架来实现。Hibernate3.2、TopLink 10.1.3、OpenJpa都提供了JPA的实现。
 * 
 * JPA中实体的状态
 * 新建 new - 新创建的实体，无持久化主键，还未和持久化上下文关联
 * 受控 managed - 拥有持久化主键，已经和持久化上下文关联
 * 游离 detached - 拥有持久化主键，但尚未和持久化上下文联系起来
 * 删除 removed - 拥有持久化主键，已经和持久化上下文建立联系，但已被安排删除
 * 
 * 更多参考：
 * http://wenku.baidu.com/view/ebd42d708e9951e79b8927a8.html
 * 
 * 
 * 
 * 例子中，要配置 hibernate-core.jar 和 hibernate-entitymanager.jar.
 * 如果不配置hibernate-entitymanager.jar会报错：
 * No Persistence provider for EntityManager named XXXX
 *
 */
package org.buzheng.study.jpa;