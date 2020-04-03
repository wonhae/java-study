package chap03.example;

public class BitShiftExample_98p {
	public static void main(String[] args) {
		System.out.println("1 < 3 = " + (1<<3)); // *2한 효과
		System.out.println("-8 > 3 = " + (-8>>3)); // 나누기 2한 효과
		System.out.println("-8>>>3 = " + (-8>>>3)); // 양수가됨 커짐 
	}
}
