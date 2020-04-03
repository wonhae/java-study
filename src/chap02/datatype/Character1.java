package chap02.datatype;

public class Character1 {
	public static void main(String[] args) {
		// Character  2byte 크기 사용한다
		// 코드가 음수일 필요는 없어서, 0 ~ 65535  (1111 1111 1111 1111)
		
		char c;
		c = 'A';  // 65
		System.out.println(c);
		
		c = '\u0041'; // 16진법  위와 동일 
		System.out.println(c);
		
		c = '\uAC00';
		System.out.println(c);
		
		c = '\uac01';
		System.out.println(c);
		
		int i = c;
		System.out.println(i);
	}
}
