package chap04.forloop;

public class DoWhileLoop {
	public static void main(String[] args) {
		int i = 0;
		while (i != 0) {
			System.out.println("while 반복");
		}
		
		do {
			System.out.println("do while 반복");
		} while (i !=0);
		
		System.out.println("종료");
	}
}
