package org.buzheng.study.pattern.state;

public class OffState implements State {

	public void switchClockwise(FireSwitch fs) {
		fs.setState(new SmallState());
		System.out.println("off -> small");
	}

	public void switchCounterClockwise(FireSwitch fs) {
		fs.setState(new LargeState());
		System.out.println("off -> large");
	}

}
