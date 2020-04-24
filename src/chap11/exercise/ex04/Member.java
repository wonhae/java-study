package chap11.exercise.ex04;

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
	this.id = id;
	this.name = name;
	}
	
	@Override
	public String toString() {
		String info = id  + " : " + name;
		return info;
	}
	
}
