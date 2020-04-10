package chap06.lecture.finalKeyword;

public class FinalKeyword {
	// 변수 앞에 붙으면 
	// 값을 할당할 기회를 한번 만 갖는다. 
	final int i;  // 생성자 안쓸꺼면 final int i = 90; 
	
	FinalKeyword(){// 생성자는딱 한번 실행됨 
		i = 90;
	}
	
	
	void method(final int k) {
//		k = 90; 값을 할당받을 때 값을 받았으므로 값 넣을 수 없다.
		final int i ;
		i = 30; // 값 한번만 넣을 수 있음 
//		i = 20;
		
		final int j = 60;
//		j = 70; // 값 변경 안됨 
		
	}
}
