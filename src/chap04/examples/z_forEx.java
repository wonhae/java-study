package chap04.examples;

public class z_forEx {
	public static void main(String[] args) {
		for (int s=9; s>=1; s--) {
			System.out.println("띠로롱" + s +"단 뾰로롱");
			for (int h=9; h>=1; h--) {
				System.out.println(s + "x" + h +"=" +(h*s));
			}
		}
	}
}
