package chap06.examples.sec06_10_4;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달림");
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
	}
	
}
