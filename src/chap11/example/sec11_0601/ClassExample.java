package chap11.example.sec11_0601;

class Car{
	
}


public class ClassExample {
	public static void main(String[] args) {
		
		Car car = new Car();
		Class clazz1 = car.getClass();
		
		System.out.println("---1방법----");
		System.out.println(clazz1 .getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
		
		System.out.println("---2방법----");
		try {
			Class clazz2 = Class.forName("chap11.example.sec11_0601.Car");
			System.out.println(clazz2 .getName());
			System.out.println(clazz2.getSimpleName());			
			System.out.println(clazz2.getPackage().getName());
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		
		System.out.println("---3방법----");	
		Class clazz3 = Car.class;
		System.out.println(clazz3 .getName());
		System.out.println(clazz3.getSimpleName());
		System.out.println(clazz3.getPackage().getName());
	
		
	}
}
