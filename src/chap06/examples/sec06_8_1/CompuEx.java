package chap06.examples.sec06_8_1;

public class CompuEx {
	public static void main(String[] args) {
		Compu myCom = new Compu();
		
		int[] value1 = {1,2,3};
		int result1 = myCom.sum1(value1);
		System.out.println("result 1 : " + result1);
	
		int result2 = myCom.sum1(new int[] {1,2,3,4,5});
		// myCom.sum1(1,2,3,4); // 배열로 써줘야함 
		System.out.println("result2 : " + result2);
		
		
		
		int result3 = myCom.sum2(1,2,3);
		System.out.println("result3 : " + result3);
		
		int result4 = myCom.sum2(1,2,3,4,5);
		System.out.println("result4 : " + result4);
		myCom.sum2(new int[] {1,2,3}); // 배열처럼 써도 되고 integer 나열해도 된다. 
		
		
		
		
		
		
		
		
	}
}
