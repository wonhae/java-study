package chap04.examples;

public class WhileSumFrom1To100Example_125p {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while(i<=100) {
			sum += i;
			i++;
		}
		System.out.println("1 부터" + (i-1) + "합 : " + sum);
	}
}
