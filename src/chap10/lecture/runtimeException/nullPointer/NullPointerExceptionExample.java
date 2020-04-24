package chap10.lecture.runtimeException.nullPointer;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		System.out.println("프로그램 실행중1");
		String s = null;
		
		if (s != null) {
			
			System.out.println(s.substring(3)); // 여기서 프로그램종료.  nullpointexception 객체가 튀어나옴 //jvm은 신경안쓰는에러
		}
		System.out.println("프로그램 실행중1");
		
		
	}
}
