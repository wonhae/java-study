package chap08.eg.sec8_0301;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		rc = new Television();
		rc = new Audio();
// 이것도 되네~ 		RemoteControl rc = new Television();
		
		
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(3);
		
//		RemoteControl r1 = new RemoteControl();  //interface 로는 인스턴스 못만든다. 
		//익명구현. (클래스 이름만 존재 x. 인터페이스이름만존재)클래스 생성과 인스턴스 생성을 한꺼번에 
		RemoteControl r1 = new RemoteControl() {  //추상메소드를 재정의하는 일을 중괄호 안에 한다. (클래스가 하는일) 
			@Override
			public void setVolume(int volume) {
				System.out.println("익명이다. 현재 볼륨은" + volume );
				
			}
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}
		};
		r1.setVolume(5);
	}
}
