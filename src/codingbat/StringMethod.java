package codingbat;

public class StringMethod {
	public static void main(String[] args) {
		//499p 20.04.01
		// charAt(int index)
		// 메소드는 객체 안에 있는 것 / 객체는 속성과 메소드를 가짐
		String s1 = "samsung";
		String s2 = "apple";
		
		
		char c = s1.charAt(0); //char return
		System.out.println(c);
		System.out.println(s1.charAt(0));
		System.out.println(s2.charAt(0));
		
		System.out.println(s1.charAt(1));
		System.out.println(s1.charAt(2));
		System.out.println(s1.charAt(3));
		
//		System.out.println(s1.charAt(7)); // 실행 안되고 바로 종료되버림 
		
		// 길이를 아는 메소드  length(integer return)
		System.out.println("길이");
		int s1Length = s1.length(); //int return
		int s2Length = s2.length();
		System.out.println(s1Length);
		System.out.println(s2Length);
		System.out.println(s1.length());
		
		// 중간에 뽑고싶다. substring(int begin,int end)  2개의 integer를 parameter로 받음/ 포함~포함x
		String sub1 = s1.substring(1,3);
		System.out.println(sub1);  // am  (index 3은포함하지 않는다)
		
		//끝에서 몇개 뽑고 싶을 때 
		String s3 = "iamafatheriamamotheryouarestudentiamhw";
		int s3Length = s3.length();
		
		String sub3 = s3.substring(s3Length-2, s3Length);  //hw / 마지막
		System.out.println(sub3);
		
		// 기준부터 끝까지 뽑고 싶을 때  substring(int begin)
		sub3 = s3.substring(s3Length -2);
		System.out.println(sub3); //hw
		
		sub3 = "  \"SHOOT\"you\"OMG\"  "; // " " 안에 " 넣고 싶으면 \ 넣기 
		System.out.println(sub3);
		
		
		// indexOf(String s)  //구분문자가 어디서 부터 시작되는지 알려주는 메소드
		s1 = "자바스크립트";
		int i = s1.indexOf("스크립트");
		System.out.println(i);  //2
		
		s1 = "990000-1234-5-7";
		i = s1.indexOf("-");
		System.out.println(i);
		
		
		//여러개라면 첫번째 나오는 것 return
		//뒤에 나오는 것 알고싶다 뒤에서부터 찾음 lastIndexOf
		i = s1.lastIndexOf("-");
		System.out.println(i);  //13
		
		// replace(String old, String new);  원본유지
		s1 = "나는 아이폰(아이풘인줄알아찡아이폰)이 있다";
		String news1 = s1.replace("아이폰", "갤럭시"); 
		System.out.println(news1);
		System.out.println(s1); //원본이 바뀌는건 아니다.
		
		//toLowerCase(), toUpperCase()  소[대]문자로 바꾼 것을 return 한다. 원본유지
		s1 = "javaSCRIPT";
		String ls1 = s1.toLowerCase();
		System.out.println(ls1);
		System.out.println(s1);
		
		// equals(String s) 가지고 있는 캐릭터가 같냐 다르냐
		s1 = "자바";
		s2 = "자바";
		s3 = " 자바";
		System.out.println(s1.equals(s2)); //true
		System.out.println(s1.equals(s3)); //false
		
		// 빈공간 없애주는 것(양옆만, 가운데는 유지. 원본유지) trim();
		s1 = "  자  바    ";
		String ns1 = s1.trim();
		System.out.println(ns1);
		System.out.println(s1);
		
		
		
		
		
		
		
		
		
	}
}
