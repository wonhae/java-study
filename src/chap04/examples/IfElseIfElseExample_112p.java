package chap04.examples;

public class IfElseIfElseExample_112p {
	public static void main(String[] args) {
		int score = 75;
		
		if(score>=90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A 입니다");
		} else if(score>=80) {
			System.out.println("점수가 80~89입니다.");
			System.out.println("등급은 B 입니다");
		} else if(score>=70) {
			System.out.println("점수가70~79입니다.");
			System.out.println("등급은 C 입니다");
		} else {
			System.out.println("점수가 70미만입니다.");
			System.out.println("등급은 D 입니다");
		}
	}
}
