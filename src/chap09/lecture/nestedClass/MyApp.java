package chap09.lecture.nestedClass;

public class MyApp {
	public static void main(String[] args) {
		NestedClass.staticM = 3;
		
		NestedClass n = new NestedClass();
		n.instanceM = 3;
		
		
		// static ->static 이름으로 바로 접근 가능 
		NestedClass.StaticClass ns = new NestedClass.StaticClass();
		
		// none static -> 바깥클래스의 객체를 먼저 생성해야함 
//		NestedClass.OtherClass no = new NestedClass.OtherClass();
		NestedClass nc = new NestedClass();
		NestedClass.OtherClass no = nc.new OtherClass();
		
	}
}
