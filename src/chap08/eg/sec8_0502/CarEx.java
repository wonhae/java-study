package chap08.eg.sec8_0502;

public class CarEx {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		System.out.println("------------------");
		myCar.foLeTire = new KumhoTire();
		myCar.foRiTire = new KumhoTire();
		
		myCar.run();
		
	}
}
