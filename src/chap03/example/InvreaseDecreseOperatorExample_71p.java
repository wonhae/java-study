package chap03.example;

public class InvreaseDecreseOperatorExample_71p {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("------------");
		x++;
		++x;
		System.out.println("x=" + x);
		
		System.out.println("-------------");
		y--;
		--y;
		System.out.println("y=" + y);
		
		System.out.println("---------");
		z = x++; // z는 12, x는 13// x값은 z 에 할당된 이후에 증가 
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("-------------");
		z = ++x; //x=14 된 이후 z에 넣어줌 
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("-----------");
		z = ++x + y++;  // x 15, y = 8 z=23// 이후에 y =9가됨 
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}
}
