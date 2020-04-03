package chap03.unary;

public class logicalNot {
	public static void main(String[] args) {
		boolean a = true;
		//!연산
		boolean b = !a;
		
		System.out.println(b);
		System.out.println(a);
		
		
		boolean c = false;
		b = !c;
		System.out.println(b);
		System.out.println(c);
	}
}
