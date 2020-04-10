package chap07.example.sec7_03_1;

public class Student extends People {
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name,ssn); // 부모생성자 소풀 
		this.studentNo = studentNo;
	}
}
