package chap09.lecture.localClass;

public class MyApp {
	public static void main(String[] args) {
		Outter o = new Outter();
		Object l = o.method(5);
		System.out.println(l);
	}
}
