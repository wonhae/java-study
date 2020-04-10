package chap06.examples.sec06_14_1;

public class Car_try {
	// field
	private int speed;
	private boolean pause;
	
	//method
	public int getSpeed() {
		return speed;
	}
	public void setSpeed() {
		if(speed<0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() { // 초기값 false
		return pause;
	}
	
	public void setStop(boolean stop) {
		this.pause = stop;
		this.speed = 0;
	}
	
}
