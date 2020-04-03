package chap03.example;

public class InputDateCheckNNExample1_85p {
	public static void main(String[] args) {
		String userInput = "NaN";
		double val = Double.valueOf( userInput );
		
		double currentBalance = 10000.0;
		
		currentBalance += val;
		System.out.println(currentBalance);
					
	}
}
