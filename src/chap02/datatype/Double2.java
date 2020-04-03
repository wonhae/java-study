package chap02.datatype;

public class Double2 {
	public static void main(String[] args) {
		double a = 0.1;
		double b = 0.2;
		System.out.println(a);
		System.out.println(b);
		
		double c = a + b;
		System.out.println(c); //0.30000000000000004 요로코롬 나옴 (10진법과 2진법의 차이때문에 base converter)
		//근사값 오차 해결하는 방법은 회사가서~~~~ 
	}
}
