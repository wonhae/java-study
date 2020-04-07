package chap06.lecture.myclass;

public class MyApp {
	public static void main(String[] args) {
		MyClass c1;	// 아직 안만들어짐. new 해야 만들어짐. stack에 공간만 생김 heap엔 아직
//		new MyClass();   //설계도에 의해 만들어진 instance 가 생성됨. 그 결과물은 참조값. class 에 의해  heap 에 만들어진 것이 instance
		c1 = new MyClass(); // 참조 변수에 의해 객체를 사용할 수 있게됨 
		
//		System.out.println(c1.field);
//		System.out.println(c1.method1());
		
		MyClass c2 = new MyClass();
		
		System.out.println(c1 == c2);
		 
		
		
	}	
}
