package org.buzheng.study.pattern.composite;

import java.util.List;

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
}