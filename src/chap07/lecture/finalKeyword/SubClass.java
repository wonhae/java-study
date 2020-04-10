package chap07.lecture.finalKeyword;

public class SubClass extends SuperClass { // Superclass 에 private 붙으면 컴파일 에러 ~~ 
	
//	@Override  //final 붙어서 재정의 할 수 없다. 
//	void superMethod() {
//		// TODO Auto-generated method stub
//		super.superMethod();
//	}
	
	void method1() {
		final int k = 30;
		// i =40;
	}

}
