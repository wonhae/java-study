package chap09.lecture.staticMember;

public class Outter {
	//////
	NonStatic ns = new NonStatic();  //instance field 에서는 static, nonstatic 다 접근 가능 
	Static st = new Static();
	
//x	static NonStatic sns = new NonStatic();
	static Static nsst = new Static();
	
	
	int instanceF;
	static int staticF;
	
	
	class NonStatic {
		void method() {
			staticF = 5;
			instanceF = 7;
		}
	}
	
	
	static class Static {
		void method() {
			staticF = 9;
//	x		instanceF = 99;
		}
	}
	
	
	void instanceMethod() {
		//static member 접근가능
		instanceF = 5;
		staticF = 3;
	}
	
	//static member 에서 static member 접근가능, instance member는 접근 불가 
	//static ->class 에 대한 정보
	static void staticMethod() {		
//x		instanceF = 99; 
		staticF = 9;
		
	
	}
}
