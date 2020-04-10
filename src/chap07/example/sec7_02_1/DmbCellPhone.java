package chap07.example.sec7_02_1;

public class DmbCellPhone extends CellPhone {
	//field
	int channel;
	
	//constructor
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color= color;
		this.channel = channel;
	}
	
	//method
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송을 수신합니다");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "번으로 바꿉니다");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송을 멈춥니다.");
	}
}
