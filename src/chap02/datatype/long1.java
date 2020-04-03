package chap02.datatype;

public class long1 {
	public static void main(String[] args) {
		// long  8byte크기
		// -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
		
		long l;
		l = 2147483647;  //int 범위내의 수만 literal 하게 표현가능
		l = 214_7_483648L;  // long type이라는 표시 해줘야함
		l = 30000000000000L; // 소문자도 l 가능하나 가능한 대문자로
		System.out.println(l);
		
	}
}
