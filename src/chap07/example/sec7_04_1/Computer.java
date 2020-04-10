package chap07.example.sec7_04_1;

public class Computer extends Calculator {
	//자식 클래스 
	//Override
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areCircle() 실행");
		return Math.PI * r * r;
	}
}
