package chap06.examples.sec06_08_1;

public class CalEx {
	public static void main(String[] args) {
		Cal myCa = new Cal();
		myCa.powerOn();
		
		int result1 = myCa.plus(5,6);
		System.out.println("result1 : " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCa.divide(x, y);
		System.out.println("result2 : "+ result2);
		
		myCa.powerOff();
		
	}
}
