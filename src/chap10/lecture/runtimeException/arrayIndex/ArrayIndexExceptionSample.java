package chap10.lecture.runtimeException.arrayIndex;

public class ArrayIndexExceptionSample {
	public static void main(String[] args) {
		// ArrayIndexOutOfBoundsException
		
		int[] arr = new int[3];
		System.out.println(arr[0]);		// 여기까지만 실행됨~ 
		System.out.println(arr[-1]);
		System.out.println(arr[3]);
		
	}
}
