package chap05.examples;

public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for (int score:scores) {
			sum = sum + score;
		}
		
		for (int i=0; i<scores.length;i++) {
			sum += scores[i];  
		}
		
		System.out.println("점수 총합 = " + sum);
		
		double avg = (double) sum/ scores.length;
		System.out.println("점수 평균 = " + avg);
	}
}
