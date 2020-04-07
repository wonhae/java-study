package chap06.examples.sec06_10_5;

public class Singleton {
	private static Singleton singleton = new Singleton();

	private Singleton() {// class 안에서만 접근 가능하다 
	}

	static Singleton getInstance() {
		return singleton;
	}

}
