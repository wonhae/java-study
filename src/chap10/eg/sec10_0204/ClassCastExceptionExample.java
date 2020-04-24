package chap10.eg.sec10_0204;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class ClassCastExceptionExample {
	
	public static void main(String[] args) {
		
	Dog dog = new Dog();
	changeDog(dog);
	
	Cat cat = new Cat();
	changeDog(cat); // cat은 dog가 아니다
	
	}
	
	
	public static void changeDog(Animal animal) {
//		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
//		}
	}
	
	
}
