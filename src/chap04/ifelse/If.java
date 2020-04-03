package chap04.ifelse;

public class If {
	public static void main(String[] args) {
		// if 조건에 따라 실행할 블럭이 결정됨 
		//블럭 2줄이상이면 중괄호 , 한줄이면 괄호 안써도됨(한개만 if 것)
		// 한줄만 있더라도 가능한 {} 사용하기. 줄맞추기(들여쓰기 ctrl sh f) 
		
		int a = 2;
		
		if (a > 10){
			System.out.println("실행할까? 말까?");
			System.out.println("조건이 true 일 때 실행");
		} else {
			System.out.println("조건이 false 일 때 실행");
		}
		
		// else if() :이전의 if 나 else if 의 조건이 false 일 때, 
		// 			  현재 블럭의 조건을 확인하고 true 실행. 동시실행x.중첩가능
		// 			  else와 조합가능
		
		a = 85;
		if (a>90) {
			System.out.println("90보다 크당"); //true이면 여기서 끝남
		} else if (a>80) { //위에가 false 일 때만 실행된다. 
			System.out.println("80보다 큽니당."); 
		} else if (a>70) { //위에가 false 일 때만 실행된다. 
			System.out.println("70보다 큽니당."); 
		} else {
			System.out.println("70미만입니다.");
		}
		
	}
}
