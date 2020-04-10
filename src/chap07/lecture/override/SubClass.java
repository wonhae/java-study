package chap07.lecture.override;

public class SubClass extends SuperClass {
	// method overriding
	public void method1() {// 같은 리턴타입, 같은 파라미터로 정의하면 // method overriding, overloading
		System.out.println("서브클래스의 메소드1");
	}
	
	public void method1(int i) { // overloading만 된 것.  overriding은 안됨(부모 것 고쳐 쓴 것 아니니깡) 
		System.out.println("서브클래스의 메소드1(int)");
	}
	
}
