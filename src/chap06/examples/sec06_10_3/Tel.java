package chap06.examples.sec06_10_3;

public class Tel {
	static String company = "samsung";
	static String model = "LCD";
	static String info;
	
	static {
		info = company + "-" + model;
	}
}
