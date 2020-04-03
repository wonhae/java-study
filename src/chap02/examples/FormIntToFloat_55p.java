package chap02.examples;

public class FormIntToFloat_55p {
	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		num2 = (int) num3;
		
		// float 가수(23bit) +지수(8bit) 
		// int (32bit)
		// 32bit 를 23bit에 옮겨 담으니 값을 일어버리거나 근사치로 저장한다. 
		
		//double 가수(52bit) 지수 (11bit) 
		//int 값을 double로 옮긴다면 손실 없다. 
		
		// Casting 연산이 일어날 때 주의하기 
		int result = num1 - num2;
		System.out.println(result);
	}
}
