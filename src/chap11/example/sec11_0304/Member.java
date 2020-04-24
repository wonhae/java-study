package chap11.example.sec11_0304;

public class Member implements Cloneable {
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;

	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}

	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone(); //clone()은 object 타입으로 리턴. 강제캐스팅 
		} catch (CloneNotSupportedException e){  }
		return cloned;
	}
}
