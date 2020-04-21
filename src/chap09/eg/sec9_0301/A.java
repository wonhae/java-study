package chap09.eg.sec9_0301;

public class A {
	//instance field
	B field1 = new B();
	C field2 = new C();
	
	
	//instance method
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	// static field 초기화 
	// static B field3 = new B();
	static C field4 = new C();
	
	
	//static method 
	static void method2() {
		// B var1 = new B();
		C var2 = new C();
	}
	
	//instance member class
	class B{}
	
	// static member class
	static class C {}
	
}
