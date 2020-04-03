package chap03.ternary;

public class Conditional {
	public static void main(String[] args) {
		
	// 1항 ? 2항 : 3항  → 2항 or 3항
	
	// 1항이 true 이면 결과는 2항
	// 1항이 false 이면 결과는 3항 
	
	int i = (true ? 3 : 4); // true 이면 3이고, false 이면 4다.
	// true 이면 3이므로 i는 3이다.// true는 키워드.
	// ?앞에 글자는 true 이다. 그러므로 true는 3/ i에 3이 들어간다 
		
	System.out.println(i);
	
	i = (false ? 3 : 4);
	System.out.println(i);
	
	}
}
