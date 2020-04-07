package chap06.lecture.method.returnType;

public class MyClass {
	// 리턴 타입: 리턴하는 값의 타입
	// void 리턴하지 않는 타입
	
	//return 키워드
	// 1. 메소드를 종료하고 (종료하는 일만 할 땐 void)
	// 2. 오른쪽에 작성된 값을 호출한 곳으로 반환(return)함
	
	void method1() {
	}
	
	void method2(int i) {
		if (i%2 == 0) {
			System.out.println("메소드 종료");
			return;
		}
		System.out.println(i*i);
	}
	
	int method3() {
		return 3;
	}
	
	long method4(int a) {
		return a*a;
	}
	
}
