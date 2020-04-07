package chap06.examples.sec06_7_3;

public class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("신혜원", "910917-2188888");
		
		System.out.println("k1.name :" + k1.name);
		System.out.println("k1.ssn :" + k1.ssn);
		
		Korean k2 = new Korean("신혜민", "930917-2188888");
		
		System.out.println("k2.name :" + k2.name);
		System.out.println("k2.ssn :" + k2.ssn);
		
		
		
	}
}
