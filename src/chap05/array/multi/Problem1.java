package chap05.array.multi;

public class Problem1 {
	public static void main(String[] args) {
		int[][] origin = { { 3, 4, 5 }, { 100, 101 }, { -3, -2, -1, 0 } };
		int[] target = null;
		// {0, -1, -2, -3, 101, 100, 5, 4, 3};
		
		int len = 0;
		for (int i = 0; i < origin.length; i++) {
			System.out.println(origin[i].length); //3 2 4 
			len += origin[i].length;  // 3+2+4 = 9 
		}
		target = new int[len];  // target 의 length 는 9인것 만들어짐 
		
		int k = 0;
		for (int i = origin.length - 1; i >= 0; i--) {  //마지막 것 부터 가져오려고. 
			for (int j = origin[i].length - 1; j >= 0; j--) {
				System.out.println("오리진 잘 봅아지나 보자" +origin[i][j]);
				target[k] = origin[i][j];
				k++;
			}
		}
		System.out.println();
		for (int i = 0; i < target.length; i++) {
			System.out.println(target[i]);
		}

	}
}
