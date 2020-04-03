package chap04.examples;

public class IfDiceExample2_nonep {
	public static void main(String[] args) {
		
		int d1 = (int)(Math.random()*6) +1;
		int d2 = (int)(Math.random()*6) +1;
		
		System.out.println( d1 + "," + d2);
		if (d1 == d2) {
			System.out.println("당첨");
		} else {
			System.out.println("꽝");
		}
		
	}
}
