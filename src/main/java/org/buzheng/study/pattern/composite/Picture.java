package org.buzheng.study.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 一个图像组件，该组件能包含其他子组件。
 *
 */
public class Picture implements Graphic {
	
	private List<Graphic> children = null;

	public void draw() {
		System.out.println("draw picture, contains: " + this.children);
	}

	public void add(Graphic g) {
		if (this.children == null) {
			this.children = new ArrayList<Graphic>();
		}
		
		this.children.add(g);
	}

	public void remove(Graphic g) {
		if (this.children == null) {
			return;
		}

		this.children.remove(g);
	}

	public List<Graphic> getChildren() {
		return this.children;
	}

	@Override
	public String toString() {
		return "Picture {children=" + children + "}";
	}

	
	
}
