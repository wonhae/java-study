package chap05.enumType;

public class EnumTypeSample {
	public static void main(String[] args) {
		//값이 정해져 있어 새로운 인스턴스를 만들 수 없다. 이미 만들어져있다. 
		Language l1 = Language.KOREAN;  //값 사용 방법
		Language l2 = Language.CHINESE;
		
		Language l3 = Language.KOREAN;
		
		System.out.println(l1 == l3);  //참조값 비교~ 
		
		
		
	}
}
