package chap03.binary.String;

public class Concat {
	public static void main(String[] args) {
		// 연결 연산자 +
		String s = "자바다";
		String t = "이눔시키";
		
		String u = s + t;
		System.out.println(u);
		
		u = s + 3.14; // string + 다른것 -> string
		System.out.println(u);
		
		//연산자에는 우선순위 
		u = 3 + 3.14 + s; //6.14 자바다
		System.out.println(u);

		u = 3 + s + 3.14;
		System.out.println(u); //3자바다3.14
	}

}
