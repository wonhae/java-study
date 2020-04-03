package chap04.examples;

public class ForPrintFrom1To10Example_121p {
	public static void main(String[] args) {
		for (int i=1; i <=10; i++) {
			System.out.println(i);
		}
		
		for (int i=10; i >=1; i--) {
			System.out.println(i);
		}
		
		int i = 10;
		for (; i >=1;) {
			System.out.println(i);
		i--;	
		}
		
		int j = 0, k = 10;
		for (; j < 10 && k > 0 ; j++, k--) {
			System.out.println(j + "," + k);
		}
		// 중괄호 안에서 선언된 변수는 그 안에서만 쓸 수있다. 컴파일 에러. 사용하고 싶다면 선언을 밖에
//		System.out.println(j);
//		System.out.println(k);
	
		
	}
}
