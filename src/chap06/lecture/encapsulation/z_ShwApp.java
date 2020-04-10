package chap06.lecture.encapsulation;

public class z_ShwApp {
	public static void main(String[] args) {
		z_Shw sHw = new z_Shw();
		
		sHw.setSpeed(-50);
		System.out.println("현재속도 얼마: " + sHw.getSpeed());
		
		sHw.setSpeed(220);
		
		if(!sHw.isDeceleration()) {
			sHw.setDeceleration(true);
		}
		System.out.println("현재속도?" + sHw.getSpeed());
	}
	
}
