package chap10.lecture.throwKeyword;

public class ThrowSample { //throwKeyword 실제로 Exception을 던지는거 (발생시키는것)  //method에 정의하는건 throws
	public static void main(String[] args) throws Exception {
		
		if(args.length < 1) {
			throw new Exception("배열의 길이가 부족합니다");  //2가지 행해야함 1.try catch  2. throws로 넘기기
			
		}
	}
}
