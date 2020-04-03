package chap04.forloop;

public class ForLoop {
	public static void main(String[] args) {
		int sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		
		System.out.println("1~5까지의 합:" + sum);
		
		sum = 0;
		for (int i = 0; i <=5; i++) {
			sum = sum +i;
		}
		System.out.println("1~5까지의 합:" + sum);
		
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
