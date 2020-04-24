package chap11.example.sec11_0303;

import java.util.Date;

public class ToStringExample {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();  //메뉴얼 보면 재정의 되어있음. 
		
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
	}
}
