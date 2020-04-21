package chap08.eg.sec8_0301;

public class Audio implements RemoteControl{
	//field
	private int volume;
	private boolean mute;
	
	@Override
	public void turnOn() {
		System.out.println(" 오디오를 켜요!! ");
		
	}

	@Override
	public void turnOff() {
		System.out.println(" 오디오를 꺼요!!! ");
		
	}

	@Override
	public void setVolume(int volume) {
		if (volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 오디오 볼륨 :" + this.volume);
	}
	
	@Override
	public void setMute(boolean mute) {  //RemoteControl.super.setMute(mute); 만약 이거쓰면 만들어놓은거 그대로 쓰겠다는 뜻 
		this.mute = mute;
		if(mute) {
			System.out.println("오디오 무음처리합니다");
		} else {
			System.out.println("오디오 무음 해제합니다");
		}
		
	}

}
