package chap03.unary;

public class sign {
	public static void main(String[] args) {
		//부호를 정해줌
		int i1 = +100;
		int i2 = -100;
		double d1 = +3.14;
		double d2 = -10.5;
		
		int r1 = -i2; //부호가 바뀜 
		int r2 = +i2; // -100
		System.out.println(r2);
		
		short s = 100;
		int r3 = -s;
		
		
	}
}
