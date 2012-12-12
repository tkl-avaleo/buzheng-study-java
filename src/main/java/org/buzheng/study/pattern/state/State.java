package org.buzheng.study.pattern.state;

public interface State {

	public void switchClockwise(FireSwitch fs);

	public void switchCounterClockwise(FireSwitch fs);
}
