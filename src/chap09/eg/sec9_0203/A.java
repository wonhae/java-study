package chap09.eg.sec9_0203;

// 바깥 class
public class A {
	A(){ System.out.println("A객체가 생성됨"); }  
	
	
	// instance member class
	class B {
		B(){System.out.println("B 객체가 생성됨");}
		int field1;
		// static int field2;
		
		void method1() { }
		// static void method2 () { }
	}
	
	// static member class
	static class C {
		C() {System.out.println("C 객체가 생성됨");}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		// local class
		class D {
			D() {System.out.println("D 클래스 생성됨");}
			int field1;
			// static int field2;
			void method1() {}
			// static void method2(){}
 		}
		D d = new D();
		d.field1 = 3;
		d.method1();
		
		
	}
	
}
