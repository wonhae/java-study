package chap05.exercise;

public class Exercise07 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		for (int v : array) {
			max = max < v ? v : max;
		}
		
		System.out.println("max: " + max);
	}
}
