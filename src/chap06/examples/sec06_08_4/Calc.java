package chap06.examples.sec06_08_4;

public class Calc {
	double areaRectangle(int width) {
		System.out.println("int type");
		return width * width;
	}
	
	// 정사각형의 넓이
	double areaRectangle(double width) {
		return width * width;
	}
	
	
	// 직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
	
}


