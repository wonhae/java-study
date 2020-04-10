package chap07.lecture.constructor;

public class SubClass extends SuperClass {
	// para 없는 생성자 부모에 없으니 오류뜸 
	// 1. 파라 있는 수퍼 생성자 호출하던가. 
	// 2. 부모 클래스에 파라 없는 생성자가 존재하던가~ 
	public SubClass() {
		super(3);	//자동으로 추가됨  // 마치 this 처럼~ // 항상 윗줄에! //para 없다. //  1. super(3);
	}  // 자동으로 생성자 만들어짐 
	
}
