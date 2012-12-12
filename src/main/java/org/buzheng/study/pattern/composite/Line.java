package org.buzheng.study.pattern.composite;

import java.util.List;

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
}
