package chap08.eg.sec8_0701;

public class MyClassB implements MyInter {
	@Override
	public void method1() {
		System.out.println("MyClassB - method1() 실행한다.");
	}
	
	@Override
	public void method_def() {
		System.out.println("MyClassB - method2() 실행. default 라 재정의 안해도 되는데 굳이 해봄");
	}
}
