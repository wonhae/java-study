package chap02.examples;

public class FloatDoubleExample {
	public static void main(String[] args) {
		//실수값 저장
		double var1 = 3.14;
		//float var2 = 3.14; //3.14는 컴에서 double로 인식하여 8byte 차지한다.
		//그런데 float 는 4byte 만 가질 수 있다. 그래서 F를 붙여서 float 임을 보여준다. 
		float var3 = 3.14F;
		
		//정밀도 테스트
		double var4 = 0.123455678901234567890;
		float var5 = 0.12345678901234567890F;
		
		System.out.println("var1:" + var1);
		System.out.println("var3:" + var3);
		System.out.println("var4:" + var4);
		System.out.println("var5:" + var5);
		
		//e 사용하기
		int var6 = 30000000;
		double var7 = 3e6;
		float var8 = 3e6F;
		double var9 = 2e-3;
		System.out.println("var6:" + var6);
		System.out.println("var7:" + var7);
		System.out.println("var8:" + var8);
		System.out.println("var9:" + var9);
		
		
	}
}
