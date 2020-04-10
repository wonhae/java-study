package chap07.lecture.polymorphism.casting;

import chap07.lecture.polymorphism.Cat;
import chap07.lecture.polymorphism.KindaCat;
import chap07.lecture.polymorphism.Tiger;

public class CastingApp {
	public static void main(String[] args) {
		// 그림 : 12 타입 캐스팅 
		Cat c = new Cat();
		Tiger t = new Tiger();
		
		KindaCat k1 = c;
		KindaCat k2 = t;
		
		Cat c1 = (Cat) k1;
		
		Tiger t1 = (Tiger) k2;
		
		// 이해
		long l = 33333L;
		int i = (int)l; //강제형변환
		
		System.out.println("k1 instanceof Tiger");
		//안전하게 타입변환 (복잡해지면)
		if (k1 instanceof Tiger) {
			Tiger t2 = (Tiger) k1;
		}
		System.out.println(k1 instanceof Cat); //그림참조
		
		System.out.println(k1 instanceof KindaCat);
		
		
	}
}
