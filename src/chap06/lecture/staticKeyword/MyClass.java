package chap06.lecture.staticKeyword;

public class MyClass {
	static int j; // static field = class field

	int i; // instance field
	
	
	static { 
		j = 98765;
	}
	
	
	
	
	

	void method() {		
		System.out.println(this.i);
		System.out.println("인스턴스 메소드");
	}
		
	// static method = class method
	static void method2() {
//		this.method();
//		method();
//		System.out.println(i); // this i 가안된다. .i 도 사용불가 
//		System.out.println(this.j);  // 사용불가 
		System.out.println("스태틱 메소드");
	}

}
