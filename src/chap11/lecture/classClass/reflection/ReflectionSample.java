package chap11.lecture.classClass.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class MyClass {
	public int i;
	private int j;
	public MyClass() {
	}
	public MyClass(int i) {	
	}
	public void method1() {
	}
	private int method2() {
		return 0;
	}
}

public class ReflectionSample {
	public static void main(String[] args) {
		Class c1 = MyClass.class;
		
		Constructor[] cons = c1.getDeclaredConstructors();
		for (Constructor con : cons) {
			System.out.println(con.getName());
		}
		
		
		Field[] fields = c1.getDeclaredFields();		
		for (Field f : fields) {
			System.out.println(f.getName());
		}
		
		
		
		Method[] methods = c1.getDeclaredMethods();
		for (Method m : methods) {
			System.out.println(m.getName());
		}
		
	}
}











