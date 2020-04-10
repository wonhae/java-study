package chap06.examples.sec06_07_4;

public class CarExample {
	public static void main(String[] args) {
		
		Car car1 = new Car();
		System.out.println("car1.compay : "+ car1.company);
		System.out.println();
		
		Car car2 = new Car("자가용");
		System.out.println("car2.compay : "+ car2.company);
		System.out.println("car2.model : "+ car2.model);
		System.out.println("car2.color : "+ car2.color);
		System.out.println("car2.maxSpeed : "+ car2.maxSpeed);
		System.out.println();
		
		Car car3 = new Car("자가용", "빨강");
		System.out.println("car3.compay : "+ car3.company);
		System.out.println("car3.model : "+ car3.model);
		System.out.println("car3.color : "+ car3.color);
		System.out.println();
		
		Car car4 = new Car("taxi", "black", 230);
		System.out.println("car4.compay : "+ car4.company);
		System.out.println("car4.model : "+ car4.model);
		System.out.println("car4.color : "+ car4.color);
		System.out.println("car4.maxSpeed : "+ car4.maxSpeed);
		System.out.println();
		
		
		
		
		
		
	}
}	
