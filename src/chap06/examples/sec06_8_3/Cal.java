package chap06.examples.sec06_8_3;

public class Cal {
	int field;
	
	int plus(int x, int y){
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		int field = 0;
		System.out.println(this.field);
		double sum = plus(x,y); // (this)plus(x,y); this 생략가능할 때: 모호한게 없을 때 
		double result = sum/2;
		return result;
	}
	void execute() {
		double result = avg(7,10);
		println("실행결과: " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
