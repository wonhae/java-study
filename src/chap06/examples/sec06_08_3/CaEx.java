package chap06.examples.sec06_08_3;

public class CaEx {
	public static void main(String[] args) {
		Ca myCar = new Ca();
		myCar.keyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("현재속도: "+ speed + "km/h" );
		
		
		
		
	}
}
