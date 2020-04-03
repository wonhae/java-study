package chap11.example;

public class z_switchEx {
	public static void main(String[] args) {
		int mon = (int)(Math.random()*12) +1;
		System.out.println(mon);
		
		//값 하나씩만 들어갈 수 있음 
		switch (mon) {
		case 1:
		case 2:
			System.out.println("학교 빨리갔겠네");
			break;
		case 3:
		case 4:
		case 5:		
			System.out.println("봄에 태어났네");
			break;
		case 6:	
		case 7:
		case 8:
			System.out.println("태어날때 후덥지근");
			break;
		case 9:	
		case 10:
			System.out.println("가을에 태어났네");
			break;

		default:
			System.out.println("12월생");
			break;
		}
		
		
	}
}
