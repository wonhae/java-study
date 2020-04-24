package chap10.eg.sec10_0202;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		// 코드수정
		if(args.length >=2) {
	
		String data1 = args[0];  //if  안쓰면 여기서 예외발행 
		String data2 = args[1];
		
		System.out.println("args[0] : " + data1);
		System.out.println("args[1] : " + data2);
		} else {
			System.out.println("두개의 값을 넣어주세요");
		}
	}
}
