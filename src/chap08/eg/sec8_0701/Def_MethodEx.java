package chap08.eg.sec8_0701;

public class Def_MethodEx {
	public static void main(String[] args) {
		MyInter mi1 = new MyClassA();
		mi1.method1();
		mi1.method_def();
		
		MyInter mi2 = new MyClassB();
		mi2.method1();
		mi2.method_def();
	}
}
