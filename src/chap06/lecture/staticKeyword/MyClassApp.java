package chap06.lecture.staticKeyword;

public class MyClassApp {
	public static void main(String[] args) {
		System.out.println(MyClass.j);
		MyClass c1 = new MyClass();
		MyClass c2 = new MyClass();
		
		c1.i = 30;
		c2.i = 99;
		
		System.out.println(c1.i);
		System.out.println(c2.i);
		
		System.out.println();
		c1.j = 77;
		c2.j = 100;
		System.out.println(c1.j); //100(마지막 넣은 값이 나옴. 공통으로 사용하기 때문)
		//공통으로 사용하니 인스턴스를 통하지 않아도 사용가능 
		
		// 클래스 이름으로도 접근 가능 = 이전에 인스턴스가 생성되지 않았어도 사용가능. 
		MyClass.j = 900;
		System.out.println(c1.j); //3개 다 900 
		System.out.println(c2.j);
		System.out.println(MyClass.j);
		
		System.out.println();
		c1.method();
		c2.method();
		System.out.println();
		c1.method2();
		c2.method2();
		MyClass.method2();
		
		
	}
}
