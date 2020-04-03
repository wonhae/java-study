package chap03.example;

public class LogicalOperatorExample_92p {
	public static void main(String[] args) {
		int charCode = 'A'; // 65
		System.out.println(charCode);
		
		if ((charCode>=65) & (charCode <=90)) { //true , true
			System.out.println("대문자 임돠");
		}
		
		if ((charCode>=97) && (charCode <=122)) { // 실행안됨. 앞에것 false 
			System.out.println("소문자 임돠");
		}
		
		if (!(charCode<48) && !(charCode >57)) { // true, fale -> false 실행안됨
			System.out.println("0~9 숫자 이군요");
		}
		
		int value = 6;
		if( (value%2 == 0) || (value%3 ==0)) { // true, true ->true
			System.out.println("2 또는 3의 배수이군요");
		}
		
		if( (value%2 == 0) || (value%3 ==0)) { //true 판단끝 true 
			System.out.println("2 또는 3의 배수이군요");
		}
		
		
		
				
	}
}
