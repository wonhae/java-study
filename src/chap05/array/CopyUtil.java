package chap05.array;

public class CopyUtil {
	public static void main(String[] args) {
		int[] a = {9,8,7};
		int[] b = new int[5];
		
//System.arraycopy
//(src원본, srcPos원본 시작위치, dest대상, destPos대상배열 시작위치00, length몇개);
		System.arraycopy(a, 0, b, 2, a.length);
		
		for (int v:b) {
			System.out.println(v);
		}
		
	}
}
