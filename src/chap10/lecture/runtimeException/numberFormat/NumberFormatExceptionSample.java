package chap10.lecture.runtimeException.numberFormat;

public class NumberFormatExceptionSample {
	public static void main(String[] args) {
		String a = "100";
		int i = Integer.parseInt(a);
		
		System.out.println(i + 1000);
		
		
		
		String b = "haewon";
		int j = Integer.parseInt(b);
		
		System.out.println(j + 1000);
	}
}
