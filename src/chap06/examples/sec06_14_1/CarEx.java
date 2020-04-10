package chap06.examples.sec06_14_1;

public class CarEx {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		// 잘못된 속도 변경
		myCar.setSpeed(-50);
		System.out.println("현재속도: " + myCar.getSpeed());
		
		// 올바른 속도 변경
		myCar.setSpeed(60);
		
		//멈춤
		if(!myCar.isStop()) {// true 만들어줌(false 의 false)
			myCar.setStop(true);
			 
		}
		System.out.println("현재속도: " + myCar.getSpeed());
	}
}
