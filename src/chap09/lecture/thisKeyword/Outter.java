package chap09.lecture.thisKeyword;

public class Outter {
	
	int outterF;
	int sameF;  //이걸 접근하려면
	
	
	class Nested {
		int nestedF;
		int sameF;
		
		void method() {
			System.out.println(this.nestedF); // this 생략가능 명확하면
			System.out.println(outterF);
			
			System.out.println(sameF);  // 그냥쓰면 가장 가까운 것 
			System.out.println(this.sameF); //위와 같다
			
			System.out.println(Outter.this.sameF);  //6번줄에 있는 것 
		}
	}
	
	
	
}
