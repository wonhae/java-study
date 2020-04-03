package chap03.binary.arithmetic;

public class InfinityNan {
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
//		int r = i  / j;
		
		double d = 10;
		double e = 0.0;
		
		double f = d / e;
		System.out.println(f); //Infinity(무한대) 
		
		f = d / -0.0;
		System.out.println(f); //-Infinity(무한대) 
		
		f = f + 1;
		System.out.println(f);
		
		f = f - 1;
		System.out.println(f);
		
		f = d % 0.0;
		System.out.println(f);  //NaN( Not a number) 
		f = f + 1;
		System.out.println(f);
		f = f / f;
		System.out.println(f);
		
		f = d / 0.0; // f Infinity
		boolean isInf = Double.isInfinite(f);
		System.out.println(isInf);
		
		f = d % 0.0; // f Infinity
		boolean isNan = Double.isNaN(f);
		System.out.println(isNan);
		
		//84,85p
	}
}
