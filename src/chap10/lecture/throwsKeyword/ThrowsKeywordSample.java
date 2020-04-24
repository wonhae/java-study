package chap10.lecture.throwsKeyword;

public class ThrowsKeywordSample {
	public static void main(String[] args) throws ClassNotFoundException { // jvm에 넘김
		method2(); //최종호출     // method2 가 1을 호출하고 
	}
	
	public static void method2() throws ClassNotFoundException {
		method1();  // method1()에서 ctrl 1
	}
	
	public static void method1() throws ClassNotFoundException {
		
			Class.forName("java.lang.SString"); // forName에서 ctrl 1 자동완성 ->try catch 만들어짐
		
	}

}
