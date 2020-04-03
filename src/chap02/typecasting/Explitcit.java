package chap02.typecasting;

public class Explitcit {
	public static void main(String[] args) {
		// byte(1) → short(2) → int(4) → long(8) → float(4) → double(8)
		// 					char(2)↗ 
		
		int i = 103029770;  //0000 ‭0110 0010 0100 0001 1100 0000 1010‬
		//byte b = i;
		byte b = (byte) i;  //00001010  =>10진법 10 (4바이트 중 3바이트 버려짐)
		System.out.println(i);
		System.out.println(b);
		
		long l = 300;
		i = (int)l;
		System.out.println(i);
		
		int intValue = 'A';
		char charValue = (char)intValue;
		System.out.println(charValue);
		
		double d = 3.14;
		int i3 = (int) d;
		System.out.println(i3);
		
	}

}
