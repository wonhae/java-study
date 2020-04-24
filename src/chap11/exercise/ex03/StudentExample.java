package chap11.exercise.ex03;

import java.util.HashMap;

public class StudentExample {
	public static void main(String[] args) {
		
		String s1 = new String("가나다");
		String s2 = new String("가나다");
		System.out.println(s1 == s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
		
		
		HashMap<Student, String> hashMap = new HashMap<Student, String>();
		
		hashMap.put(new Student("1"), "95");
		
		String score = hashMap.get(new Student("1"));
		System.out.println("1번학생의 총점:" + score);
	}
}
