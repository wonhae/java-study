package chap07.example.sec7_08_4;

public class Dog extends Animal {
	
	public Dog() {
		this.kind = "포유루";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
}
