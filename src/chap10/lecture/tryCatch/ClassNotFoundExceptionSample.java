package chap10.lecture.tryCatch;

public class ClassNotFoundExceptionSample {
	public static void main(String[] args) {
		try {
			
			Class.forName("java.lang.String");
			System.out.println("프로그램실행중");
			
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾지못함");
		}
		System.out.println("프로그램 종료");
	}
}
