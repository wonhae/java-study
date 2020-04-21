package chap08.eg.sec8_0701;

public interface MyInter {
	public void method1();
	
	public default void method_def( ) {
		System.out.println("MyInter - method_def()  가 실행된다. ");
	}
	
}
