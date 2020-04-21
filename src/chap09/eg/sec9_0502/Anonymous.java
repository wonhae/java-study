package chap09.eg.sec9_0502;

public class Anonymous {

	//field 초기값으로 대입
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
			
		}@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
	};
	
	void method1() {
		//local 변수값으로 대입
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}
		};
		//local 변수 사용
		localVar.turnOn();
	}
	
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
	
}



