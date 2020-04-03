package chap04.examples;

public class ForSumFrom1To100Example_122p {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1~100의 합:" + sum);
		
		
		sum = 0;
		int i = 0;
		for (i =1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1~" + (i-1) + "합:" + sum);
		
	}
}
