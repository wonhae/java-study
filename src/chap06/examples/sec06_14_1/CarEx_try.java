package chap06.examples.sec06_14_1;

public class CarEx_try {
	public static void main(String[] args) {
		
	Car myCar = new Car();
	
	myCar.setSpeed(-50);
	System.out.println("현재속도: " + myCar.getSpeed());
	
	myCar.setSpeed(230);
	
	// 멈춰보자
	if (!myCar.isStop()) {
		myCar.setStop(true);
	}
	
	System.out.println("현재속도" + myCar.getSpeed());
	}
}