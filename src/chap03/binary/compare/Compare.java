package chap03.binary.compare;

public class Compare {
	public static void main(String[] args) {
		// ==  !=   >    >=   <   <=
		//js 에서는 타입까지 같냐 있었다. ===, !== 
		
		
		int i = 10;
		int j = 15;
		
		boolean b = i ==j;
		System.out.println(b);
		System.out.println(i !=j);
		System.out.println(i > j);
		System.out.println(i < j);
		System.out.println(i <= j);
		
		// 다른 타입끼리 비교될 때 
		// 산술연산과 마찬가지로 큰 타입으로 자동 형변환
		
		System.out.println('A' == 65);
		System.out.println(3 == 3.0); // 비교하면 3 이 3.0 이 됨 
		
		System.out.println(0.1 == 0.1F); // double vs.float ->근사치 vs. 근사치 //문제생김 근사치 다르다
		
		
	}

}
