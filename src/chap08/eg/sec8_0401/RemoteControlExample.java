package chap08.eg.sec8_0401;

import chap08.eg.sec8_0301.Audio;
import chap08.eg.sec8_0301.RemoteControl;
import chap08.eg.sec8_0301.Television;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(3);
		rc.setMute(false);
		
		rc = new Audio();
		rc.turnOff();
		rc.turnOff();
		rc.setVolume(5);
		rc.setMute(true);
		
		RemoteControl.changeBattery();  //instance 생성 없이 바로 interface 로 실행가능 
		
	}
}
