package chap02.typecasting;

public class Operation {
	public static void main(String[] args) {
		// + - * / % 연산 시 양변에 피 연산자를 갖는다 
		// 피 연산자의 타입이 서로 다를경우 
		// 큰 타입으로 변환 
		// 정수 (byte, short, char, int)는 모두 int 타입으로 계산
		
		int i = 3;
		long l = 10;
		//i + l; 	// i 가 묵시적으로 logn type 으로 변환된 이후에 계산됨
		//int i2 = i + l; 	//안된다. (i + l은 long type 이므로)
		long l2 = i +l; 
		
		
		byte b1 = 2;
		byte b2 = 3;
//		byte b3 = b1 +b2; 
		int i3 = b1 + b2;
		
		char c1 = 'A';
		char c2 = 'B';
//		char c3 = c1 + c2;
		int i4 = c1 + c2;
		System.out.println(i4);
		
	
		float f1 = 3.14F;
		float f2 = 2.21F;
		float f3 = f1 + f2;
		
//		f3 = f1 + 3.14;
		double d1 = f1 + 3.14;
}
}
