package chap05.exercise;

public class Exercise08 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		int cnt = 0;
		for (int[] arr : array) { //array의 원소는 배열원소 int[] 이니까 ing[]앞에 붙여주고 아무것.
			for (int v : arr) {
				sum += v;
				cnt++;
			}
		}
		
		avg = sum / (double) cnt;
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}
}










