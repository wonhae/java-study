package chap11.lecture.classClass;

class MyClass {
	
}

public class ClassSample {
	public static void main(String[] args) throws Exception {
		MyClass o1 = new MyClass();
		Class c1 = o1.getClass();
		
		System.out.println(c1.getName());
		System.out.println(c1.getSimpleName());
		System.out.println(c1.getPackage().getName());
		
		Class c2 = Class.forName("chap11.lecture.classClass.MyClass"); //checkedException
		System.out.println(c2.getName());
		System.out.println(c2.getSimpleName());
		System.out.println(c2.getPackage().getName());
		
		System.out.println();
		Class c3 = MyClass.class;  // class 라는 키워드 
		System.out.println(c3.getName());
		System.out.println(c3.getSimpleName());
		System.out.println(c3.getPackage().getName());
		
		
	}
}

