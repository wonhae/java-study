package chap02.datatype;

public class short1 {
	public static void main(String[] args) {
		// short는 2byte 크기
		// -32768~ 32767  
		// 1111 1111 1111 1111 나누기2
		
		short s;
		s = 32767;
//		s = 32768; //overflow
		System.out.println(s);
		s++;
		System.out.println(s);
	}
}
