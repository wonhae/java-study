package chap02.datatype;

public class Byte1 {
	public static void main(String[] args) {
		
		// 1byte 크기 (8bit)
		// 최대 -128 ~ 127
		byte b;
		
		b = 127;
		
		System.out.println(b);
		
//		b = 128; 
//		System.out.println(b); //안됨
		
		
		b++;  //overflow
		System.out.println(b);  // -128이됨
		
		b = 0;
		b--;
		System.out.println(b);
		
		
		b = -128;
		b--;  // underflow
		System.out.println(b);
		
		
		
		
		
	}
}
