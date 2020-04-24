package chap11.example.sec11_0602;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Car {
	String model;
	String owner;

	

	public Car() {
	}
	public Car(String model) {
		this.model = model;
	}
	
	
	public void setModel(String model) {
		this.model = model;
	}	
	public String getOwner() {
		return owner;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	

}

public class ReflectionExample {
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("chap11.example.sec11_0602.Car");

		System.out.println("[클래스 이름]");
		System.out.println(clazz.getName());
		System.out.println();

		System.out.println("[생성자정보]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
		System.out.println();

		System.out.println("[필드정보]");
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		}
		System.out.println();

		System.out.println("[메소드 정보]");
		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.print(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
	}

	private static void printParameters(Class[] parameters) {
		for (int i = 0; i < parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if (i < (parameters.length - 1)) {
				System.out.println(",");
			}
		}

	}
}
