package chap06.examples.sec06_9_1;

public class CarEx {
	public static void main(String[] args) {
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");
		
		System.out.println(myCar.model);
		
		myCar.run();
		yourCar.run();
		
		
	}
}
