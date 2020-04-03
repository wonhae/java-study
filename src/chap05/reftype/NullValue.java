package chap05.reftype;

public class NullValue {
	public static void main(String[] args) {
		//그림 04.null 값
		String s1;
		s1 = null; // 참조하는 변수가 없다. null을 넣어준다. 나중에 쓰거나 그럴 때 
		
		String s2 = "java";
		s2 = null;
		
		System.out.println(s2 == null);
		System.out.println(s2 != null);

		// 둘다 실행안됨 
		if (s1 != null) {
			System.out.println(s1.length());
		}
		if (s2 != null) {
			System.out.println(s2.length());
		}
		
	}
}
