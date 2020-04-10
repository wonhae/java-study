package chap06.lecture.encapsulation;

public class z_Shw {
	
	private String Shw;

	public String getShw() {
		return Shw;
	}

	public void setShw(String shw) {
		Shw = shw;
	}
	
//	public String getShw() {
//		return Shw;
//	}
//	
//	public void setShw(String name) {
//		this.Shw = name;
////	}
//	
//	private boolean fat;
//
//	public boolean isFat() {
//		return fat;
//	}
//
//	public void setFat(boolean fat) {
//		this.fat = fat;
//	}
	
	
	
	private int speed;
	private boolean deceleration ;
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed<0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;			
		}
	}

	public boolean isDeceleration() {
		return deceleration;
	}

	public void setDeceleration(boolean deceleration) {
		this.deceleration = deceleration;
		this.speed = --speed; 
	}

	
	
	
}
