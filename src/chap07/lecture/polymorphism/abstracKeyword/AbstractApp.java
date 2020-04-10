package chap07.lecture.polymorphism.abstracKeyword;

public class AbstractApp {
	public static void main(String[] args) {
//		KindaCat k1 = new KindaCat();
//		k1.cry();
		
		KindaCat k2 = new Tiger();  //new Tiger(); 캣인지 타이건지 몰라도 사용가능. 
		k2.cry();
		
		
		
		
		Tiger t = new Tiger();
		Cat c = new Cat();
		t.cry();
		c.cry();
	}
}
