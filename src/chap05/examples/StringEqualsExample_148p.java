package chap05.examples;

public class StringEqualsExample_148p {
	public static void main(String[] args) {
		String strVar1 = "신혜원";
		String strVar2 = "신혜원";
		
		if (strVar1 == strVar2) {
			System.out.println("strVar1 과 strVar2는 참조가 같다");
		} else {
			System.out.println("strVar1 과 strVar2는 참조가 다름");
		}
		
		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1 과 strVar2는 문자열이 같음");
		} 
		
		String strVar3 = new String("신혜원");
		String strVar4 = new String("신혜원");
		
		if (strVar3 == strVar4) {
			System.out.println("strVar3 과 strVar4는 참조가 같다");
		} else {
			System.out.println("strVar3 과 strVar4는 참조가 다름");
		}
		

		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3 과 strVar4는 문자열이 같음");
		} 
	}
}
