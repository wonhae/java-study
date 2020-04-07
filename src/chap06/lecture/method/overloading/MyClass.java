package chap06.lecture.method.overloading;

public class MyClass {
	// Method Overloading: 메소드의 이름이 같다. 
	// 파라미터의 타입, 순서, 개수가 달라야 한다. (return type 과는 상관없다) 
	
	
	
	
	void method() {
		System.out.println("파라미터 없는 메소드으아");		
	}
	
	int method(int i) { // 메소드 이름이 같아도 됨 
		System.out.println("int 타입 하나 받는 메소드");
		return 1;
	}
	
	void method(int i, int j) {
		System.out.println("int 타입 2개 받는 메소드");
	}
	
	void method(long i) {
		System.out.println("long 타입 하나 받는 메소드");
	}
	
	void method(long i, int j) {
		System.out.println("long , int 받는 메소드 ");
	}
	
	
}
