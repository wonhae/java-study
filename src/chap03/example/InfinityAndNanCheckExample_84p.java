package chap03.example;

public class InfinityAndNanCheckExample_84p {
	public static void main(String[] args) {
		
	int x = 5;
	double y = 0.0;
	
	double z = x / y;   // Infinity
//	 z = x % y;  // Nan 
	
	System.out.println(Double.isInfinite(z));
	System.out.println(Double.isNaN(z));
	
	System.out.println(z + 2); // 문제가 되는 코드 
	
	}
	
}
