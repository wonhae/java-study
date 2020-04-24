package chap11.lecture.objectClass.finalize;

class Book {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("지워지고 이쪄용 ㅜㅜ ");
	}
}


public class FinalizeSample {
	public static void main(String[] args) {
		
		Book b = new Book();
		b = null;
		
		System.gc(); //가비지콜렉터 힌트 줌 
		
	}
}

