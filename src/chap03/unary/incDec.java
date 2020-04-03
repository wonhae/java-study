package chap03.unary;

public class incDec {
	public static void main(String[] args) {
		// 증감연산자(invrement) ++
		// 감소연산자(decrement) --
		
		int i = 10;
		i++;
		
		System.out.println(i);
		
		i--;
		System.out.println(i);
		
		i--;
		System.out.println(i);
		
		++i;
		System.out.println(i); //10
		
		// --, ++ 붙는 위치에 따라
		int x = 1;
		int y = 1;
		int r1 = ++x + 10; // x가 1이먼저 더해진 이후에( 2가 되고나서) 2+10 =12
		int r2 = y++ + 10; // 먼저 연산을 한 이후에 더해짐   (for문에서~~~~)
		
		System.out.println(r1);
		System.out.println(r2);
		
		
		
	}
}
