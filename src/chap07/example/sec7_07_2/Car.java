package chap07.example.sec7_07_2;

public class Car {
	// 2. 
	
	// field
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	// constructor
	
	// method
	int run() {
		System.out.println("[자동차가 붕붕붕]");
		if (frontLeftTire.roll() == false) { stop(); return 1;}
		if (frontRightTire.roll() == false) { stop(); return 2;}
		if (backLeftTire.roll() == false) { stop(); return 3;}
		if (backRightTire.roll() == false) { stop(); return 4;}
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
	
	
}
