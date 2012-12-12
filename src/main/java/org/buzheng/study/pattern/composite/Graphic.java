package org.buzheng.study.pattern.composite;

import java.util.List;

/**
 * 
 *
 */
public interface Graphic {
	public void draw();
	public void add(Graphic g);
	public void remove(Graphic g);
	public List<Graphic> getChildren();
}
