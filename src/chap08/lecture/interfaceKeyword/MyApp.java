package chap08.lecture.interfaceKeyword;

public class MyApp {
	//그림 13번. 다형성 - 인터페이스 
	public static void main(String[] args) {
		Cat cat = new Cat();
		Malamute malamute = new Malamute();
		
		KindaCat c1 = cat;   //자동형변환
		KindaDog d1 = malamute;
		
		c1.cry(); //실제실행은 그 인스턴스 메소드(cat)
		d1.howling();
		
//		d1.pull();  
		SledDog d2 = malamute;  //인터페이스도 자동 형변환 됨 
		d2.pull();
		
		Pet d3 = malamute;
		d3.sit();  
		
		Pet c2 = cat;
		c2.sit();
		
		
	}
}
