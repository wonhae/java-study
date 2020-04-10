package chap06.examples.sec06_08_2;

public class CarEx {
	 public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setGas(5);// Car의 setGas()메소드 호출
		
		boolean gasState = myCar.isLeftGas();  //Car의 isLeftGas() 메소드 호출
		if (gasState) {
			System.out.println("출발합니다");
			myCar.run(); //Car의  run() 메소드 호출
		}
		
		if (myCar.isLeftGas()) {  // Car의 isLeftGas()메소드 호출
			System.out.println("gas 빠른 시일내에 주입해");
		} else {
			System.out.println("gas를 당장 주입해");
		}
		
		
		
		
	}
}
