package chap05.array;

public class RefTypeInArray {
	public static void main(String[] args) {
		int[] a = new int[3];
		a[0] = 3;
		a[1] = 2;
		a[2] = 99;

		String[] sr = new String[3];
		sr[0] = "java";
		sr[1] = "java";
		sr[2] = new String("java");

		System.out.println(sr[0] == sr[1]);
		System.out.println(sr[2] == sr[0]);
		System.out.println(sr[0].equals(sr[2]));

		// 그림 07. 참조타입 배열 복사
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];

		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

		for (int i = 0; i < newStrArray.length; i++) {
			System.out.println(newStrArray[i] + ",");
		}

	}

}
