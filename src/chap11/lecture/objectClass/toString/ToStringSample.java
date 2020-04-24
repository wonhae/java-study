package chap11.lecture.objectClass.toString;

class Book {
	
	int isbn;
	String title;
	
	public Book(int isbn, String title) {
	this.isbn = isbn;
	this.title = title;
	}
	
	@Override
	public String toString() {
		String info = "isbn : " + isbn + ", title: " + title;
		return info;
	}
}

public class ToStringSample {
	public static void main(String[] args) {
		Book b1 = new Book(3, "이것이자바다");
		Book b2 = new Book(5, "저것이 파이썬이다");
		
		System.out.println(b1.toString());  //재정의 하기 전에는 object의 toString이 그대로 나옴 /우리가 원하는 정보가 아님 // 재정의하면 다형성때문에 재정의된게 나옴
		System.out.println(b2.toString());
		
		System.out.println(b1);  //b1.toString() 이 실행됨. 설명서 볼 것 
		
		
		
	}
}
