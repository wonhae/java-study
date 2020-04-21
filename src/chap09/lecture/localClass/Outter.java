package chap09.lecture.localClass;

public class Outter {
	//String도 Class 도 전부 상위에는 Object 가 있다. 
	Object method(final int param) {
		final int localVar = 3;
		class Local {
			int i = localVar;
			int p = param;
		}
		
		Local l = new Local();
		
		return l;
	}
}
