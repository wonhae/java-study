package chap07.lecture.inheritance;

public class MyApp {
	public static void main(String[] args) {
		Child c = new Child();
		c.i = 30;
		c.method();
		
		GrandChild g = new GrandChild();
		g.i = 40;
		g.method();
		
		
	}
}
