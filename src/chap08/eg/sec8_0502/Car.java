package chap08.eg.sec8_0502;

public class Car {
	//유연하게 인스턴스 사용가능 (다형성 덕분에) 
	Tire foLeTire = new HankookTire();  //tire typedp foLeTire field 만든다. hankook 의 인스턴스를 가진다. 다형성 
	Tire foRiTire = new HankookTire();
	Tire BaLeTire = new HankookTire();
	Tire BaRiTire = new HankookTire();
	
	void run() {  //어떤 인스턴스가 있던지 재정의된 인스턴스의 메소드가 실행된다. (위에서 다형성에 의해 구현된게)
		foLeTire.roll();
		foRiTire.roll();
		BaLeTire.roll();
		BaRiTire.roll();
	}
	
}
