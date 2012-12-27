/**
 * Null Object
 * 
 * 在某些场景下个，使用Null Object来代替null，能让代码更
 * 干净，让逻辑更顺畅（主要是少了非null判断，Null Object
 * 能当作正常对象来使用）。
 * 
 * JDK 中的存在：
 * {@link java.util.Collections#emptyList()}
 * {@link java.util.Collections#emptyMap()}
 * {@link java.util.Collections#emptySet()}
 * 他们分别返回：
 * {@link java.util.Collections#EMPTY_LIST}
 * {@link java.util.Collections#EMPTY_MAP}
 * {@link java.util.Collections#EMPTY_SET}
 * 
 * 这3个集合都是空对象，分别实现了List，Map，Set接口，
 * 且都是只读的。
 * 
 * 返回一个空集合是Null Object的使用场景。
 * 
 * 另外，Null Object 也适用于有默认操作的场景。就像
 * 本包中的例子。策略模式中的默认算法。
 * 
 * 
 */
package org.buzheng.study.pattern.nullobject;