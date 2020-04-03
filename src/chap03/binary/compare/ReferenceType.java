package chap03.binary.compare;

public class ReferenceType {
	public static void main(String[] args) {
		String a = "자바";
		String b = "자바";
		
		boolean r = a == b;
		System.out.println(r);
		
		String c = "자";
		String d = "바";
		String e = c + d;
		
		System.out.println("b뽑아: " + b);
		System.out.println("'자' + '바':" + e);
		//5장에서 자세히 
		
		r = b == e;
		System.out.println(r); //주소(값)를 비교하게됨//System.out.println(b == e);와 동일
		System.out.println(b.equals(e)); // 내용물이 같은가?
		
		String f = new String("자바");
		System.out.println((e == f) + ": new String 만든것과 주소 비교");  
		System.out.println(e.equals(f) + ": new String 만든것과 실제 모양 비교");
		
		System.out.println("실제 주소 어딨나좀 살펴보자. ");
		int aHashcode = System.identityHashCode(a);  // integer type을 return한다.
		int bHashcode = System.identityHashCode(b);
		int eHashcode = System.identityHashCode(e);
		int fHashcode = System.identityHashCode(f);
		
		System.out.println(aHashcode);
		System.out.println(bHashcode);
		System.out.println(eHashcode);
		System.out.println(fHashcode);
		
		//해쉬코드는 재정의 된다.
		System.out.println("hashCode 재정의 ");
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(e.hashCode());
		System.out.println(f.hashCode());
		
		
		
		
	}
}
