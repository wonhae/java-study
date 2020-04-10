package chap07.example.sec7_07_5;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
//	x	parent.field2 = "data2";
//  x	parent.method3();	
		
		Child child = (Child) parent;
		child.field2 = "yyy";
		child.method3(); 
		
		
	}	
}
