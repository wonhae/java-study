package chap08.eg.sec8_0601;

public class Example {
	public static void main(String[] args) {
		ImplC impl = new ImplC();
		
		//all true
		System.out.println(impl instanceof ImplC);
		System.out.println(impl instanceof InterfaceA);
		System.out.println(impl instanceof IntefaceB);
		System.out.println(impl instanceof InterfaceC);
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println("---------");
		
		IntefaceB ib = impl;
		ib.methodB();
		System.out.println("---------");
		
		InterfaceC ic = impl;
		ia.methodA();
		ib.methodB();
		ic.methodC();
		
		
		
		
	}
}
