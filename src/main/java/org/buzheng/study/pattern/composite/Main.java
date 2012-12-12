package org.buzheng.study.pattern.composite;

/**
 * <p>该例子是组合模式的一种应用。组合模式在需要表示整体与部分
 * 的场景下特别适用。他从整体和部分中抽象出一个通用结构，
 * 即可以用来表示容器，也可以用来表示容器中的元素。</p>
 * 
 * <p>常见的场景有：菜单树、文件树、图形系统</p>
 * 
 * <p>JDK中的应用：<br/>
 * <ul>
 * <li>awt 和 swing 中有相当的应用</li>
 * <li>{@link java.util.Map#putAll(java.util.Map)}</li>
 * <li>{@link java.util.Collection#addAll(java.util.Collection)}</li>
 * <li>{@link java.util.List#addAll(java.util.Collection)}</li>
 * <li>{@link java.util.Set#addAll(java.util.Collection)}</li>
 * </ul>
 * </p>
 */
public class Main {

	public static void main(String[] args) {
		Graphic t = new Text();
		Graphic l = new Line();
		
		Graphic p = new Picture();
		p.add(t);
		p.add(l);
		
		t.draw();
		l.draw();
		p.draw();
	}

}
