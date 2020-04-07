package chap06.lecture.sample;

public class StudentApp {
	public static void main(String[] args) {
		Student s1 = new Student("a",50,20,60);
		Student s2 = new Student("b", 40, 77, 92);
		
		System.out.println(s1.getMaxScore());
		System.out.println(s1.getAvg());
		
		System.out.println();
		System.out.println(s2.getMaxScore());
		System.out.println(s2.getAvg());
	}
}
