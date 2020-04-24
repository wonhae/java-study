package chap10.eg.sec10_0701;

public class BalanceInsufficientException extends Exception {
	
	public BalanceInsufficientException() { 
		super();  //저절로 만들어짐 ->Exception 객체가 만들어짐 
	}
	
	public BalanceInsufficientException(String message) {  //파라로 넣으면 익셉션의 메시지가됨 
		super(message);
	}
	
}
