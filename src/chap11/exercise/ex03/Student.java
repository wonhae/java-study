package chap11.exercise.ex03;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	                                  
	public String GetStudentNum() {
		return studentNum;
	}

	@Override
	public int hashCode() { //필드가 같으면 같은 해쉬코드 
		final int prime = 31;  //중복을 피하려 소수 사용
		int result = 1;
		result = prime * result + ((studentNum == null) ? 0 : studentNum.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studentNum == null) {
			if (other.studentNum != null)
				return false;
		} else if (!studentNum.equals(other.studentNum))
			return false;
		return true;
	}
	
	
//	
//	@Override
//	public boolean equals(Object obj) {
//		Student s = (Student) obj;
//		return this.studentNum.equals(s.studentNum);
//	}
//	
//	@Override
//	public int hashCode() {		
//		return this.studentNum.hashCode();
//	}
}
