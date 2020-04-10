package chap07.lecture.polymorphism;



public class PolyMorphismApp {
	// 4.10
	public static void sayCry(KindaCat c) {
		c.cry();
		
	}
	
	public static void main(String[] args) {
		
		
		Tiger t = new Tiger();
		Cat c = new Cat();
		//4.10 ///////
		KindaCat a99 = t;
		sayCry(c);
		sayCry(t);
		sayCry(new Tiger());
		sayCry(new Cat());
		
		
		
		t.cry();
		c.cry();
		
		KindaCat c1 = t;  // 상위 클래스에 할당 가능 // 값: c1 == t 
		KindaCat c2 = c;
		
		//실제 인스턴스의 메소드가 실행된다. 이유는 묻지말라...... 
		c1.cry();
		c2.cry();
		
//		t = c1;  // 고양이과는 타이거다! 이렇게 못함 // 값은 같은데 타입때문에 못들엉감 
//		t = c2;
		
//		Tiger t1 = new Tiger(); // 된다
//		KindaCAt c3 = t1; // 된다
		
		KindaCat c3 = new Tiger();
		
//		int i = 3; // 된다
//		long l = i; // 된다 
		long l = 3;
		
		long[] larr = new long[3];
		larr[0] = 3;
		larr[1] = 947158493223897L;
		
		Tiger[] tarr = new Tiger[3];
		tarr[0] = new Tiger();
		tarr[1] = new Tiger();
		
		KindaCat[] karr = new KindaCat[3];
		karr[0] = new KindaCat();
		karr[1] = new Tiger();
		karr[1] = new Cat();
		
		
		
	}
}
