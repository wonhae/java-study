package chap08.lecture.interfaceStructure;

public interface MyInterface {
	// 모든 구성요소는 public 이다. 
	
	// 값 field (public static final)
	// 항상 public static final  ->instance 없어도 값에 접근 가능
	// 필드 선언시 바로 값을 가져야한다. 
	public static final int i = 3;
	int j = 4;
	
	
	
	//추상메소드(public abstract) : 존재목적
	int methodName(int i);
	public abstract int methodName2();
	//항상 public abstract 붙는다. 안붙여도 붙여준다. 
	
	// 시즌8에 추가
	// static 메소드 (public) (몸통이있는)
	static void methodName3() {
		System.out.println("스태틱 메소드");  //인스턴스 없어도 실행가능. 
	}
	public static void methodName5() {
		System.out.println("스태틱 메소드");
	}
	
	
	
	// default 메소드 (public) (package private와 다른 것)(몸통있는 메소드)
	default void methodName4() {
		System.out.println("인스턴스 디폴드 메소드");
	}
	public default void methodName6() {
		System.out.println("인스턴스 디폴드 메소드");
	}
	
}
