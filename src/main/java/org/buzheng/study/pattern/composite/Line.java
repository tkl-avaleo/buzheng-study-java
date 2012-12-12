package org.buzheng.study.pattern.composite;

import java.util.List;

/**
 * 一个线的组件，代表了面板上的一条线。
 *
 */
public class Line implements Graphic {

	public void draw() {
		System.out.println("draw line");
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
		return "Line";
	}
	
	
}
