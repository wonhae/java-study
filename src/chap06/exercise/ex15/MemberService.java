package chap06.exercise.ex15;

public class MemberService {

	public boolean login(String name, String id) {
		
		return name.equals("hong") && id.equals("12345");
	}

	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}

}
