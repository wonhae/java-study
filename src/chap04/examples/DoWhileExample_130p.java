package chap04.examples;
import java.util.Scanner;

public class DoWhileExample_130p {
	public static void main(String[] args) {
		System.out.println("메시지를 입력하시오");
		System.out.println("프로그램을 종료하려면 q를 입력하시오");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.print(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
			} while ( ! inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
		
	}
}
