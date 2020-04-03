package chap02.variables;

public class Variables3Init {
	public static void main(String[] args) {
		
		//변수의 초기값
		int value;
		value = 30; // 초기값 넣어야 (js 에선 안넣도 써도 무관)
		System.out.println(value+50);
		
		//변수는 공간에 대한 이름이니까 변수의 값은 변경 가능
		int value2 = 90;
		int r = value2 + 100;
		r = 700;
	}
}
