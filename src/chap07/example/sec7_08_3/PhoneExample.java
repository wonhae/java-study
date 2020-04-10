package chap07.example.sec7_08_3;

public class PhoneExample {
	public static void main(String[] args) {
		// Phone phone = new Phone();
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
		Phone phone = smartPhone; //  가능 
	}
}
