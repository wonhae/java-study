package chap11.lecture.objectClass.clone;

class Book implements Cloneable {
	int isbn;
	String[] authors;
	
	//clone 재정의// 얕은복사
	@Override
	public Object clone() throws CloneNotSupportedException {  // protected 됨 ////
//		Book n = new Book();
//		n.isbn = this.isbn;
//		n.authors = this.authors;
		return super.clone();
	}
	
}

public class CloneSample {
	public static void main(String[] args) throws Exception {
		Book b1 = new Book();
		b1.isbn = 3;
		b1.authors = new String[]{"a", "b"};
		
		Object o = b1.clone();  //b1객제 복제한게 리턴된다~ //체크오류발생가능성 try or throws //Cloneable 도 implements 해야 
		System.out.println(o instanceof Book);
		Book b2 = (Book) o;
		
		System.out.println(b2.isbn);
		System.out.println(b2.authors);
		
		System.out.println();
		System.out.println(b1.isbn);
		System.out.println(b1.authors);  // 같은 참조값 가지고 있다. 
		
		b1.authors[0] = "c";
		System.out.println(b2.authors[0]); // c!!! 
		
		b2.authors[1] = "d";
		System.out.println(b1.authors[1]);
		
	}
}
