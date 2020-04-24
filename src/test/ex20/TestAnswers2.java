package test.ex20;

public class TestAnswers2 {
	// 1:4
	// 2:3
	// 3:4
	// 4:2
	// 5:4
	// 6:3
	// 7:3
	// 8:3
	// 9:4
	// 10:1
	// 11:2
	// 12:1
	// 13:4
	// 14:4
	// 15:3
	// 16:2
	// 17:2
	// 18:3
	// 19:
	private static void ex19() {
		int[][] arr = new int[][] { { 1, 2, 3 }, { 4, 5 },	{ 6 } };
		System.out.println(arr[1][1]);
	}
	// 20:
	private static void ex20() {
		int[] arr = { -2, 0, 1, 8, 3 };

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		ex19();
		ex20();
	}
}
