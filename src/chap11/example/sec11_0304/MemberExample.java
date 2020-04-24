package chap11.example.sec11_0304;

public class MemberExample {
	public static void main(String[] args) {
		Member original = new Member("blue", "홍길동", "12345", 25, true);
		
		Member cloned = original.getMember();  //getmemeber메소드로 어떤 객체를 리턴받았음~~ 
		cloned.password = "67890";
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("id : " + cloned.id);
		System.out.println("name : " + cloned.name);
		System.out.println("password : " + cloned.password);
		System.out.println("age : " + cloned.age);
		System.out.println("adult: " + cloned.adult);
		
		System.out.println();
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("id : " + original.id);
		System.out.println("name : " + original.name);
		System.out.println("password : " + original.password);
		System.out.println("age : " + original.age);
		System.out.println("adult: " + original.adult);
		
		System.out.println("------------");
		System.out.println("ㅁㅁ원본값  패스워드 변경해봄");
		original.password = "2028";
		System.out.println("원본password : " + original.password);
		System.out.println("복사한password : " + cloned.password);
		System.out.println("ㅁㅁ원본값  이름 변경해봄");
		original.name = "신혜원";
		System.out.println("오리지널name : " + original.name);
		System.out.println("복사한name : " + cloned.name);
		
	}
}
