package chap09.z.staticZ;

public class Aa {
	public static void main(String[] args) {
		A.C c = new A.C();
		
		c.field1 = 3;
		c.method1();
		c.field2 = 5;
		System.out.println(c.field2);
	}
}
