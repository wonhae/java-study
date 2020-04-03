package chap05.reftype;

public class StringRefType {
	public static void main(String[] args) {
		//05.String
		
		String a = new String("java");
		String b = new String("java");
		
		System.out.println(a == b); //false
		System.out.println(a.equals(b)); // 내용물이 같냥 true
		
		// java 에서 편의를 봐줌 String은 new 연산자 없이 사용가능~~
		String c = "java"; //스트링 리터럴로 값을 넣어버린다
		
		System.out.println(a == c); //f
		System.out.println(b == c); //f
		System.out.println(a.equals(c)); //t
		System.out.println(b.equals(c)); //t
		
		String d = "java"; //스트링 리터럴로 만들어 놓은  c 가 존재하니 c갖다씀
		
		System.out.println(c == d); // t
		
	}
}
