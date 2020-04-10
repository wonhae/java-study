package chap07.example.sec7_04_2;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		
		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;// true 됨 
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL; // false 됨 
		sa.fly();
		sa.land();
	}
}
