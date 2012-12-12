package org.buzheng.study.pattern.state;

/**
 * 
 *
 */
public class Main {
	public static void main(String[] args) {
		FireSwitch fs = new FireSwitch();
		
		fs.switchClockwise();
		fs.switchClockwise();
		fs.switchClockwise();
		fs.switchClockwise();
		
		System.out.println("-----------------------");
		
		fs.switchCounterClockwise();
		fs.switchCounterClockwise();
		fs.switchCounterClockwise();
		fs.switchCounterClockwise();
		fs.switchCounterClockwise();
		fs.switchCounterClockwise();
		fs.switchCounterClockwise();
		fs.switchCounterClockwise();
	}
}
