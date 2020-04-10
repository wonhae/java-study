package chap07.lecture.polymorphism.abstracKeyword;

public abstract class KindaCat {
	public abstract void cry(); // 아무일도 안한다
//	public abstract void cry() {}  //몸통{}이 있어서 이렇게 쓰면 안된다 
	
	public void hide() {
		System.out.println("박스에 들어갑니다. .");
	}
}
