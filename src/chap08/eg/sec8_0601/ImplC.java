package chap08.eg.sec8_0601;

public class ImplC implements InterfaceC {
	@Override
	public void methodA() {
		System.out.println(" ImplC  -  methodA() 실행! ");
		
	}
	@Override
	public void methodB() {
		System.out.println(" ImplC  -  methodB() 실행! ");
		
	}
	
	@Override
	public void methodC() {
		System.out.println(" ImplC  -  methodB() 실행! ");
		
	}
}
