package chap04.exercise;

public class Exercise06 {
	public static void main(String[] args) {
		// i와 j의 차이를 이용하여. 
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= (4-i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}












