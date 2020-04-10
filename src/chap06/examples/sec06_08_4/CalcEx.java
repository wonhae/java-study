package chap06.examples.sec06_08_4;

public class CalcEx {
	public static void main(String[] args) {
		Calc myCalcu = new Calc();
		
		// 정사각형의 넓이 구하기
		double result1 = myCalcu.areaRectangle(10);
		
		// 직사각형의 넓이 구하기
		double result2 = myCalcu.areaRectangle(10,20);
		
		// 결과 출력하기 
		System.out.println("정사각형의 넓이 = "+ result1);
		System.out.println("직사각형의 넓이 = "+ result2);
	}
}
