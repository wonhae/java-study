package chap05.array.multi;

public class TwoDArray {
	public static void main(String[] args) {
		// 06. 2차원 배열
		
		
		int[] a1 = {1,2,3};  //값은 primitive type
		int[] a2 = {4,5,6};
		
		//[]앞에 붙은게 원소의타입 // 원소가 배열
		
		// 배열의 배열 
		int[][] a3 = {{1,2}, {3,4}};	// 값이 참조값이다. 어딘가 객체가 존재
		
		// 접근 
		System.out.println(a1[2]); //3
		System.out.println(a3[0][1]); //2// {1,2} 중에서도 여러개
		System.out.println(a3[1][1]); //4
		
		//공간만 마련 
		int[] a4 = new int[3];
		int[][] a5 = new int[3][4];
		// {{0,0,0,0},{0,0,0,0},{0,0,0,0}}
		
		a5[2][3] = 99;  //맨끝
		
		for (int i=0; i<a5.length; i++ ) {
			for (int j=0; j<a5[i].length; j++) {
				System.out.println(i + "," + j +" : " + a5[i][j]);
			}
		}
		
		// 배열의 배열 
		int[][] a6 = new int[2][];
		// {null,null}   // int 배열은 참조타입이다. 참조타입은 기본으로  null 을 가진다. 
		System.out.println(a6[0]); //null
		System.out.println(a6[1]); //null
		
		a6[0] = new int[] {3,4};
		a6[1] = new int[] {99,100,101,102};
		
		for (int i=0; i<a6.length; i++) {
			for (int j=0; j<a6[i].length; j++) {
				System.out.println("[" + i + "," + j +"]" + a6[i][j]);
			}
		}
		
		
	}
}
