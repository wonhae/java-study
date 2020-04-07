package chap06.examples.sec06_7_4;

public class Car {
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자
	
	//생성자는 파라미터 타입의 조합과 순서에 따라 나뉜다. 
	Car() {
		System.out.println("A라는 일을 한다. ");
	}
	
	Car(String model) {
		//this(); // System.out.println("A라는 일을 한다. ");
		this(model, "노랑"); // 다른 어떤 코드보다 먼저 있어야한다. 
		//this.model = model;
		}
	
	
	// parameter 의 type 과 순서가 중요// String 으로 시작하므로 위와 같다고 여겨져 애러 
//	Car(String color) {this.color = color;}
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
		}
	
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		}
	
	Car(String model,int maxSpeed, String color ){} // 위와 다른 생성자 (순서가 다르므로) 
	
	
	
}
