package org.buzheng.study.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Picture implements Graphic {
	
	private List<Graphic> children = null;

	public void draw() {
		System.out.println("draw line");
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
}
