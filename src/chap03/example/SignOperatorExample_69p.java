package chap03.example;

public class SignOperatorExample_69p {
	public static void main(String[] args) {
		int x = -100;
		int result1 = +x; // 그대로오
		int result2 = -x; // 부호 바뀜
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		short s = 100;
		//short result3 = -s;  //정수 연산한후는 int 가 되니까 유의 
		int result3 = -s;
		System.out.println("result3 = " + result3);
	}
}
