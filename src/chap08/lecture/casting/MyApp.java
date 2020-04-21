package chap08.lecture.casting;

public class MyApp {
	public static void main(String[] args) {
		// 자동 형변환
		Pet p1 = new Dog();
		Pet p2 = new Cat();
		
		p1.sit();
		p2.sit();
		
		Dog d = (Dog) p1;
		d.bark();
		d.sit();
		
		
	}
}
