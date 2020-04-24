package chap10.eg.sec10_0601;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {
	public static void main(String[] args) {
		
		try {
			findClass();
		} catch (ClassNotFoundException | FileNotFoundException e) {  // , 대신 Exception 으로 한번에 써도됨
			System.out.println("class 가 존재하지 않습니다");
			e.printStackTrace();
		}
	}
	
	public static void findClass() throws ClassNotFoundException, FileNotFoundException {  // , 대신 Exception 으로 한번에 써도됨
		Class clazz = Class.forName("java.lang.String2");
		
		FileInputStream fis = new FileInputStream("");  //ctrol shift o (import)  //checked Exception
		
		
	}
}
