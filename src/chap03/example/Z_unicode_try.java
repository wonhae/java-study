package chap03.example;

public class Z_unicode_try {
	public static void main(String[] args) {
		int a = 'A';
		System.out.println(a);
		
		int aa = 'a';
		System.out.println(aa);
		
		System.out.println(a <= aa);
		System.out.println((a*10) <= aa);
		System.out.println((char)a <= (char)aa);
		System.out.println(Integer.toBinaryString(a) + "'A'의 이진수 표현법");
		System.out.println(Integer.toHexString(a) + "'A'의 16진법");
//		System.out.println(Integer.to + "'A'의 10진법");//??
		System.out.println(Integer.toOctalString(a) + "'A'의 8진법");
		System.out.println(~a);
		
//		char 더하기 chac+char // char+1 말고~~ 
		
		int d = 10;
		double b = 245.324;
		System.out.println(d*b);	
		
		int s = 10;
		int t = 234; 
		int z = 7;
		double x = ((s + t)* z / 3);
		System.out.println(x);
		x = ((s + t)* z / 3.0);
		System.out.println(x);
		
	}
	
}
