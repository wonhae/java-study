package chap10.lecture.runtimeException.classCast;

public class ClassCastException {
	static class A {}
	static class B extends A {}
	public static void main(String[] args) {
		String s = "";
		A a = new A();
		
		if (a instanceof B) {
			B b = (B) a;  // 고양이과는 호랑이라고 할 수 없다. 			
		}
		System.out.println("프로그램 실행 종료");
		
	}
}
