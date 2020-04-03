package chap03.unary;

public class bitwiseNot {
	public static void main(String[] args) {
		// 0 ↔ 1 // 0과 1바꿔준다
		// 십진법 10
		// 이진법  000...(0기 26개 앞에 붙어있음) 1010
		// 자바에선 정수계산은 4바이트씩(32비트)로 된다. 
		
		
		//~연산 이후 
		//이진법 11...1110101
		int a = 10;
		int b = ~a;
		System.out.println(b);
		
		byte b1 = 10;
//		byte b2 = ~b1; //연산 넣은 이후엔 int type 이므로 오류
		
		// 정수를 비트(문자열 string)로 표현하는 메소드
		String s = Integer.toBinaryString(a);
		System.out.println(s);
		s = Integer.toBinaryString(b);
		System.out.println(s);
			
	}
	//0을 붙여주는 메소드~~  75p 
	//js의 함수와 유사한 것
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while (str.length() < 32) {
			str = "0" + str;
		}
		return str;
	}
}
