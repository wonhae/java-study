package chap06.lecture.packageKeyword;

import static java.lang.Math.abs;
import static java.lang.Math.random;

//import java.awt.List;
//import java.util.Scanner;
import java.util.List;
import java.util.Scanner;

import chap06.lecture.packageKeyword.subPackage.YourClass;  // 이렇게 명시 해줌 

public class MyApp {
	chap06.lecture.packageKeyword.MyClass c1 // 원래는 이렇게 썼어야 한다. 생략가능 (명확하니께)
	= new MyClass();
	
	MyClass c2 = new MyClass();
	
	// 서브패키지에 있는 클래스 쓰려함 
	chap06.lecture.packageKeyword.subPackage.YourClass c3 = 
			new chap06.lecture.packageKeyword.subPackage.YourClass();
	
	YourClass c4 = new YourClass();
	
	// 서브패키지에도 myClass // 다른 패키지에 있더라도 이름 다 써주면 쓸 수 있다. 
	chap06.lecture.packageKeyword.subPackage.MyClass c5 =
			new chap06.lecture.packageKeyword.subPackage.MyClass();
	
	//기존에 만들어진 것 쓰려면
	java.util.Scanner scanner1 = new java.util.Scanner(System.in);
	Scanner scanner2 = new Scanner(System.in); // import 문 자동으로 넣어주는 것: ctrl shift o 명확한 것은 넣어줌->import java.util.Scanner;
	
	// 애매한것 list는 2개
//	java.awt.List list;
//	java.util.List list2;	
	List list3; // ctrl shift o -> 대화창 뜬다 2개 선택해라
	
	java.lang.String str = ""; // 자주써서 import java.lang 자체를 생략가능 
	String str1 = "";
	
	//Math : static method 
	// static method 를 import 하면 math 생략해도 사용가능 
//	double d = Math.random();
//	int i = Math.abs(10-11);
	double d = random();
	int i = abs(10-11);
	
	
	
	
	
	
	
}
