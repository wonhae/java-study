package chap09.lecture.nestedClass;

public class NestedClass {
	//class 안에 들어갈 수 있는 class 2개 
	
	static int staticM;  //객체 생성 없이 접근 가능 
	int instanceM;  //객체 생성 해야 접근 가능 
	
	// 1. 
	static class StaticClass {
		int field;
		static int staticField;
	}
	
	// 2. 
	class OtherClass { //none static class  or inistance class
		//필드,생성자,메소드
		int field;
//x		static int statif Field;

		OtherClass() {}
		
		void method() {}
	}
	
	// 3. method 안에 class
	void method() {
		class LocalClass{
			int field;
//x			static int statif Field;
			
		}
		//이 안에서만 접근가능 
		LocalClass lc = new LocalClass();
	}
}
