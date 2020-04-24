package chap11.example.sec11_0401;

import java.util.Comparator;
import chap11.example.sec11_0401.CompareExample.Student;

public class StudentComparator implements Comparator<Student> {
	
	@Override
	public int compare(Student a, Student b) {
		if(a.sno < b.sno) return -1;
		else if(a.sno == b.sno) return 0;
		else return 1;
	}
}
