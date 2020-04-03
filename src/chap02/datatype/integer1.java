package chap02.datatype;

public class integer1 {
	public static void main(String[] args) {
		// 4byte
		// -2147483648~ 2147483647
		
		int i;
		i = 2147483647;
		System.out.println(i);
		
//		i = 2147483648; // overflow
		
		i++;
		System.out.println(i); // -2147483648
		
		i = 2_147_483_647;  // 2147483647와 동일 
		i = 21_4748_3647;  // underscore 어디에 넣든 상관 없음 
		
		i = 0765; //8진법으로 저장
		System.out.println(i);
		
		i = 0xACCF; // 16진법 표현 
		System.out.println(i);
	}

}
