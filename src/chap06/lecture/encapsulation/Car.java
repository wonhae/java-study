package chap06.lecture.encapsulation;

public class Car {
	private int speed;
	private String airbag;
	
	public Car() {
		this.airbag = "전면";
	}
	
	public String getAirbag() {
		return this.airbag;
	}
	
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed =0;
		} else {
			this.speed = speed;
		}
	}
	
	public int getSpeed() { //읽는 메소드 제공 
		return this.speed;
	}

}
