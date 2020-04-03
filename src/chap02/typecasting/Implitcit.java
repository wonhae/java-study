package chap02.typecasting;

public class Implitcit {
	public static void main(String[] args) {
		// 자동(묵시적) 형 변환
		// 작은 크기 타입에서 → 큰 크기 타입 
		// byte(1) → short(2) → int(4) → long(8) → float(4) → double(8)
		// 					char(2)↗ 
		// boolean
		
		byte b = 10;
		short s = b;
//		b = s;
		int i = s;
//		s = i;		
		long l = i;
		
		float f = l;
		double d = f;
		
		char c = 'a';
		i = c;
		
		
	}

}
