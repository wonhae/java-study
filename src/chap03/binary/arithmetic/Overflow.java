package chap03.binary.arithmetic;

public class Overflow {
	public static void main(String[] args) {
		int i1 = 20_0000_0000;
		int i2 = 10_0000_0000;
		
		int avg = (i1 + i2) / 2; //더할 때 24억을 넘어가서 다른 값이 된다. 
		System.out.println(avg);
		
		long l1 = 20_0000_0000;
		long l2 = 10_0000_0000;
		
		long avg2 = (l1 + l2) / 2;
		System.out.println(avg2);
		
		long l3 = 0;
		System.out.println(l3);
		
		
	}

}
