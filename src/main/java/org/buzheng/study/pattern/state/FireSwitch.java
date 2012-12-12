package org.buzheng.study.pattern.state;

public class FireSwitch {
	private State state;
	
	public FireSwitch() {
		state = new OffState();
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void switchClockwise() {
		this.state.switchClockwise(this);
	}
	
	public void switchCounterClockwise() {
		this.state.switchCounterClockwise(this);
	}
}
