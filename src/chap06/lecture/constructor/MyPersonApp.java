package chap06.lecture.constructor;

public class MyPersonApp {
	public static void main(String[] args) {
		// 그림: 08. this 와  instance
//		Person p1 = new Person();
//		p1.name = "아이언맨";
//		p1.age = 40;
//		
//		Person p2 = new Person();
//		p2.name = "블랙팬서";
//		p2.age = 50;
//		
		
		Person p1 = new Person("아이언맨", 40);
//		System.out.println(p1.name);
		
		Person p2 = new Person("블랙팬서", 50);
//		System.out.println(p2.age);
		
		p2.name = "블랙위도우";
		System.out.println(p2.name);
	}
}
