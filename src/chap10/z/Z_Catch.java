package chap10.z;

public class Z_Catch {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(args[0]);
			int value2 = Integer.parseInt(args[1]);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + "=" + result);
	
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) { 
			//? IndexOutOfBoundsException vs. ArrayIndexOutOfBoundsException
			System.out.println("arry or Index 에러남");
		} catch (Exception a) {
			System.out.println("모든예외캐치");
		} finally {
			System.out.println("finally");
		}
	}
}
