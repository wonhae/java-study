package chap07.example.sec7_07_1;

public class ChildExample {
	public static void main(String[] args) {
		//그림 11. 다형성 예제 1
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();
		//parent.method3();
		
		System.out.println();
		Parent parent2 = new Parent();
		parent2.method2();
		
		System.out.println();
		Child child2 = new Child();
		child2.method3();
	}
}
