package chap08.lecture.implementsKeyword;

import chap08.lecture.interfaceStructure.MyInterface;  //ctrl shift o  자동 import

public abstract class MyClass implements MyInterface {  
	//만약.. 하나 오버라이드 못했다면 abstract 붙여주기 추상 메소드를 가진 클래스는 추상 클래스여야한다
	//MyClass 에서 ctrl 1 누르면 완성해줌 

	@Override
	public int methodName(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int methodName2() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
