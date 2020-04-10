package chap07.example.sec7_08_3;

public class SmartPhone extends Phone {
	// constructor
	public SmartPhone(String owner) {
		super(owner);
	}
	
	//method
	public void internetSearch() {
		System.out.println("인터넷을 설치합니다.");
	}
}
