package chap10.eg.sec10_0301;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try { //run - configuration 에서 값1 값2   or 300 400 넣어보기
			data1 = args[0];
			data2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[[ 실행방법 ]]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");
			return;
		}
				
		try {
			int value1 = Integer.parseInt(data1); // 값1 값2가 들어와있다면 여기서 예외발생 ->바로 23번 블록 
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요 ");
		}
		
	}
}
