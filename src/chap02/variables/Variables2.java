package chap02.variables;

public class Variables2 {
	public static void main(String[] args) {
		// 변수에 값 저장

		int score;
		score = 90;

		// 값(literal) literal 한 값들에 대해서

		// 정수
		System.out.println(0); // 정수
		System.out.println(75);
		System.out.println(-100);

		System.out.println(02); // 8진법 앞에 0으로 시작
		System.out.println(055);// 10진법으로 45

		System.out.println(0x5); // 16진법으로 5
		System.out.println(0xA); // (10진법으로 10)

		// 진법 변환 계산기(window s>계산기>프로그래머)
		// hex(16), dec(10), oct(8), bin(2) 진법

		// 실수
		System.out.println(-0.25);

		System.out.println(5E7); // 5* (10의 7승)
		System.out.println(0.12E-5); // 0.12 * (10^-5)
		System.out.println(0.012e-5); // 위와 동일. 대소문자구별x

		// 문자
		System.out.println('A'); // 하나의 문자
		System.out.println('가');
		System.out.println('h');
//		System.out.println('ab'); // 안된다
//		System.out.println('');  // 공란 안된다
		System.out.println(' '); // 띄어쓰기
		System.out.println('\t'); // tab
		System.out.println('\n'); // new line
		System.out.println('\u005A'); // 문자코드 16진법

		// 문자열
		System.out.println("여러개의 문자열");
		System.out.println(""); // 아무것도 안써도 문자열로 취급됨
		System.out.println("탭은 \t로 작성한다");

		// 논리(boolean)
		System.out.println(true);

	}
}
