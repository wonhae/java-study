package chap07.example.sec7_08_4;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----------");
		
		//변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog(); //타입은 안중요
		animal.sound(); //인스턴스 메소드가 실행
		
		animal = new Cat();
		animal.sound();
		
		// 메소드의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
		
		amethod(3.14);
		amethod(3);
		amethod(343434L);
	}
	public static void amethod(double d) {
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
	
}
