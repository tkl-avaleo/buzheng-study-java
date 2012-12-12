package org.buzheng.study.pattern.composite;

import java.util.List;

/**
 * 一个文本组件，输出一段文本到画板上。
 *
 */
public class Text implements Graphic {

	public void draw() {
		System.out.println("draw text");
	}

	public void add(Graphic g) {
		throw new UnsupportedOperationException();
	}

	public void remove(Graphic g) {
		throw new UnsupportedOperationException();
	}

	public List<Graphic> getChildren() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String toString() {
		return "Text";
	}
}