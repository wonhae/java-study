package chap06.lecture.accessModifier.api;

public class YourClass {
	MyClass m = new MyClass();
	
	public int i;
	int j;
	private int k;
	
	void method() {
		this.i = 3;
		this.j = 4;
		this.k = 5;
	}
	
}
