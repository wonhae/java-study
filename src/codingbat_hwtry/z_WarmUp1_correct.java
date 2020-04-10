package codingbat_hwtry;

public class z_WarmUp1_correct {
 
	
	
	public boolean icyHot(int temp1, int temp2) {
		  boolean r = (temp1>100&&temp2<0)||(temp1<0&&temp2>100);
		  return r;
		}// 샘은 boolean 2개로
	
	public boolean in1020(int a, int b) {
		  boolean r = (10<= a && a<=20); // a>=10 이게 낫겠다
		  boolean s = (10<= b && b<=20);
		  
		  return r||s;
		}
	
	public boolean hasTeen(int a, int b, int c) {
		  boolean s = a >=13 && a <=19;
		  boolean h = b >=13 && b <=19;
		  boolean w = c >=13 && c <=19;
		  
		  return s || h || w;
		}
	
	public boolean loneTeen(int a, int b) {
		  boolean s = a >=13 && a <=19;
		  boolean h = b >=13 && b <=19;
		 
		  return s^h ;
		}
	
	public int intMax(int a, int b, int c) {
		  int d = a > b? a : b;
		  d= d > c? d : c;
		  return d;
		}
	
	
	public boolean in3050(int a, int b) {
		  boolean h = (a >=30 && a <=40) && (b >=30 && b <=40);
		  boolean w = (a >=40 && a <=50) && (b >=40 && b <=50);
		  
		  return h ^ w;
		}



	
	
}
