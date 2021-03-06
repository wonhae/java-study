package chap05.reftype;

public class CompareRefType {
	public static void main(String[] args) {
		// 그림 03.참조타입 비교
		
		String s1 = new String("web");
		String s2 = new String("java");
		String s3 = new String("java");
		
		boolean b1 = s1 == s2;
		System.out.println(b1); // false
		
		boolean b2 = s2 == s3;
		System.out.println(b2); //false (주소값을 비교)
		
		s2 = s3;
		b1 = s2 == s3;
		System.out.println(b1); // true
		
	}
}
