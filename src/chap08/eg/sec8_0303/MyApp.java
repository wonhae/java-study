package chap08.eg.sec8_0303;

import chap08.eg.sec8_0301.RemoteControl;

public class MyApp {
	public static void main(String[] args) {
		SmartTelevision st = new SmartTelevision();
		RemoteControl rc = st;
		Searchable sc = st;
		
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(3);
//		rc.search("네이버");
		
		sc.search("다음");
//		sc.turnOn();
		
	}
}
