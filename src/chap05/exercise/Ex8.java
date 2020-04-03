package chap05.exercise;

public class Ex8 {
	public static void main(String[] args) {
		int[][] array = { {95,86}, {83, 92, 96}, {78, 83, 93, 87, 88} };
		int[] arr2 = null;
		
		int sum = 0;
		double avg = 0.0;
		
		//풀었으나 길다~~ 
		
		int leng = 0;
		for (int i=0; i<array.length; i++) {
			leng += array[i].length;
		}
		arr2 = new int[leng];
		
		int k= 0;		
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				//System.out.println(array[i][j]);
				arr2[k]  = array[i][j];
				k++;
			}
		}
		
		
		for (int v: arr2) {
			sum += v;
		}
		
		avg = (double) sum/ arr2.length;
		
		
		
		
			System.out.println("sum:" + sum);
			System.out.println("avg:" + avg);
				
	}
}
