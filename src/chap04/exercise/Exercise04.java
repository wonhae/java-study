package chap04.exercise;

public class Exercise04 {
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 0;
		
		while (n1 + n2 != 5) {
			n1 = (int) (Math.random() * 6) + 1;
			n2 = (int) (Math.random() * 6) + 1;
			System.out.println("(" + n1 + ", " + n2 + ")");
		} 
	}
}
