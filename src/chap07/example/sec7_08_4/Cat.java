package chap07.example.sec7_08_4;

public class Cat extends Animal {

	public Cat() {
		this.kind = "포유루";
	}
	
	@Override
	public void sound() {
		System.out.println("뤼옹");
	}
	
}
