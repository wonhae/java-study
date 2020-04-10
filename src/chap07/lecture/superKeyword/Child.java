package chap07.lecture.superKeyword;

public class Child extends Parent {
	// super : 부모한테 접근하기 위한 키워드  // 어디있어도 상관없다
	public int j;
	
	@Override
	public void method() {
		super.method(); // 이미 있는 것 호출해두고  
		System.out.println("재정의된 자식 클래스 메소드"); // 추가로 작성 
	}
	
	//this super 쓰는 방법 보여주기 위해서 
	public void method2() {
		System.out.println("자식 클래스 메소드2");
		System.out.println(super.i);
		super.method();
		System.out.println(this.i);
		this.method3();
	}
	
	public void method3() {
		
	}
	
}
