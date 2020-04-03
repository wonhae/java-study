package chap04.examples;

public class IfElseExample {
	public static void main(String[] args) {
		int score = 85;
		
		if(score>=90) {
			System.out.println("점수가 90보다 크뉑");
			System.out.println("등급은 A란당");
		}else {
			System.out.println("점수가 90도 안된다얘");
			System.out.println("등급은 b");
		}
	}
}