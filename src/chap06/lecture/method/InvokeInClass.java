package chap06.lecture.method;

public class InvokeInClass {
	void method1() {
		System.out.println("method1 실행");
	}
	
	void method2() {
		this.method1(); //다른 메소드 호출   // this 붙여도되고 안붙여도 되고. this 이 클래스에서 만들어지는 instance 를 가리킨다. 
		System.out.println("method2 실행");
	}
	
}
