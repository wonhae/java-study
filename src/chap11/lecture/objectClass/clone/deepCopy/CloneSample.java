package chap11.lecture.objectClass.clone.deepCopy;

class Book implements Cloneable 
{
	int isbn;
	String[] authors;
	
	@Override  //깊은 복사 
	public Object clone() throws CloneNotSupportedException {
		Book b = new Book();
		b.isbn = this.isbn;
		
		String[] authors = new String[this.authors.length]; // 새로운 배열 만들어줌
		for(int i =0; i< authors.length; i++) {
			authors[i] = this.authors[i];
		}
		b.authors = authors;
		return b;
	}
	
}

public class CloneSample {
	public static void main(String[] args) throws Exception {
		Book b1 = new Book();
		b1.isbn = 3;
		b1.authors = new String[] {"a", "b"};
		
		Object o = b1.clone(); 
		Book b2 = (Book) o;
		
		b1.authors[0] = "c";
		System.out.println(b2.authors[0]);  //원본 바꿨어도 영향 없음. 배열의 참조값 다르게 갖기 때문 
		
		
		
	}
}
