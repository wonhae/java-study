package chap11.example;

public class StringSubstringExample_507p {
	public static void main(String[] args) {
		String hwn = "910917-2 88d2e";
		
		String firstNum = hwn.substring(0,6);
		System.out.println(firstNum);
		
		String secondNum = hwn.substring(7);
		System.out.println(secondNum);
		
		
	}
}
