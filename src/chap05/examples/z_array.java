package chap05.examples;

public class z_array {
	public static void main(String[] args) {
	
//	int[] a = new int[3];
//	a[0] = 3;
//	
//	int[] a1 = {1,2,3};
//	
//	int[][] b = {{1,2,3}, {4,5}};
//	System.out.println(b[0][2]);
//	
//	int[][] c = new int[3][2];
//	c[0][0] = 99;
//	
//	for (int i=0; i<c.length; i++) { 
//		for (int j=0; j<c[i].length; j++) {
//			System.out.println("["+i+","+j + "] ="+ c[i][j]);
//		};
//	};
//	
//	int[][] d = new int[3][];
//	d[0] = new int[] {1,2};
//	d[1] = new int[] {3,4,5,6,7,8};
//	d[2] = new int[] {9,10,11,12,13,14,15,16,17};
//	
//	for (int i=0; i<d.length; i++ ) {
//		for (int j=0; j<d[i].length; j++) {
//			System.out.println("["+i +","+j +"]" + d[i][j]);
//		}
//	}
//	
//	int[] arr1 = new int[3];
//	for (int i=0; i<arr1.length; i++) {
//		System.out.println(arr1[i]);
//	}
//	
//	int max = 0;
//	int[] array = {1,3,2,8,6,7,};
//	
//	for (int s: array) {
//		max = max <s? s : max;
//	}
//	
//	System.out.println("max:" + max);
//	
//	
//	
	int[][] array = {{10,1}, {2,3,4}, {5,6,7,8,9}};
	
	int sum = 0; 
	double avg = 0.0;
	
	int count = 0;
	for (int[] v  : array) {
		for (int s : v) {
			sum += s;
			count++;
		}
	}
	avg = sum/ (double)count;
	System.out.println("sum:" + sum);
	System.out.println("avg: " + avg );
	
	
	
	
	
	
}
}
