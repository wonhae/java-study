package chap03.binary.arithmetic;

public class Arithmetic {
	public static void main(String[] args) {
		
	// + - * / %
	// 정수(byte, short, char, int)-> 계산 결과가 모두 int
	// 2개의 항이 타입이 다를 경우 
		
	int i1 = 10;
	int i2 = 20;
	int i3 = i1 + i2;
	int i4 = i1 - i2;
	int i5 = i1 * i2; 
	int i6 = i1/ i2; // 0
	int i7 = i1 % i2; //10 
	
	byte b1 = 10;
	byte b2 = 20; 
//	byte 3 = b1 + b2;
	
	int i8 = 30; 
	long l1 = 10000;
//	int i9 = i8 + l1;
	long i9 = i8 + l1;
	
	long l2 = 2000000;
	float f1 = 3.24F;
//	long l3 = l2 + f1;
	float l3 = l2 + f1;  
	
	float f2 = 3.14F;
	double d1 = 2.22;
	double f3 = f2 + d1;
	
	char c1 = 'A';
// 	char c2 = c1 + 1;
	char c2 = (char) (c1 + 1);
	int c3 = c1 + 1; //2가지 방법 
	
	
	}
}
