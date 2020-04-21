package chap08.eg.sec8_0301;

public interface RemoteControl {
	//상수 (인스턴스 없어도 인터페이스 명만 가지고 접근가능)
	public final static int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	
	// 추상메소드 (메소드 선언부만 작성(추상메소드)) (인스턴스메소드) 
	public abstract void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//디폴트메소드 (실행내용도 작성) (인스턴스메소드) //재정의하지 않아도 되는 편안함. 
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다");
		} else {
			System.out.println("무음해제합니다");
		}
	}
	
	//정적메소드  (인스턴스 없어도 인터페이스 명만 가지고 접근가능)
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다");
	}
	
}
