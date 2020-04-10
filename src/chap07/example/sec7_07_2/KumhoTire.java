package chap07.example.sec7_07_2;

public class KumhoTire extends Tire {

	// 4.
	// field
	// constructor
	public KumhoTire(String location, int maxRotation) {
			super(location, maxRotation);
		}

	// method
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "KumhoTire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "KumhoTire 펑크 ***");
			return false;
		}

	}

}
