package chap06.lecture.method.parameter;

public class Method2 {
	
	void method1() {
		// parameter 없음
		System.out.println("파라미터 없는 메소드");
	}
	
	void method2(int i) {
		// parameter int 하나 // 파라미터 안에 : 타입+변수명
		System.out.println("파라미터가 int 하나 ");
	}
	
	void triple(int i) {
		System.out.println(i*3);
	}
	
	//파라미터 없을 수도. 여러개 가능 // 지역변수 처럼 사용 {}안에서만! 
	void plus(int i, int j) { // ()안에: parameter,  매개변수 
		System.out.println(i+j);
	}
	
	void triple2(double d) {
		System.out.println(d *30);
	}
	
//	void max2(int...n, boolean b) {} //안된다. 몇개인지 모르지... 젤 마지막에 
	
	void max(boolean b, int...n) { // ... 배열 타입(갯수를 모른다) ->가장 나중에 들어가야한다. 
		for (int i=0; i<n.length; i++) {
			System.out.println(n[i]);  //메소드 안에서는 배열로 쓴다. 
		}
	}
	
	
	
}
