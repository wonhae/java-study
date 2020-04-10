package chap06.examples.sec06_08_2;

public class Car {
	// 필드
	int gas;
	
	// constructor
	
	// method
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas ==0) {
			System.out.println("gas 가 없어용");
			return false; 
		}
		System.out.println("gas 가 있어요");
		return true;
	}
	
	void run() {
		while(true) {
			if (gas > 0) {
				System.out.println("달립니다.(gas 잔량:" + gas + ",");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas 잔량:" + gas + ",");
				return; //메소드 실행 종료
			}
		}
			
			
	}
	
}
