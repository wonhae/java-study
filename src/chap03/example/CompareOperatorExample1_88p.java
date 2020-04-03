package chap03.example;

public class CompareOperatorExample1_88p {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);
		
		char char1 = 'A';
		char char2 = 'B'; //2진수의 코드 값으로 저장된다. 
		boolean result4 = (char1 < char2);
		System.out.println("result4 = " + result4);
	}
}
