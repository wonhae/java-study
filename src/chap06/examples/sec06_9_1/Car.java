package chap06.examples.sec06_9_1;

public class Car {
	// field
	String model;
	int speed;
	
	// constructor
	Car(String model) {
		this.model = model;
	}
	
	// method
	void setSpeed(int speed) {
		this.speed = speed;
	}
	void run() {
		for  (int i = 0; i <=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다. (시속 : "+ this.speed + " km/h ");
		}
	}
}
