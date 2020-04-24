package chap10.eg.sec10_05;

public class TryWithResouceExample {
	public static void main(String[] args) {
		//FileInputStream은 autoclosable 이어야한다. 
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외 처리코드가 실행되었습니다. ");
		}
	}
}
