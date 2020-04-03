package chap02.examples;

public class CheckValueBeforeCasting_54p {
	public static void main(String[] args) {
		int i = 128;
		
		// Byte type은 MIN_VALUE(필드,속성)을 가진다 // js에서 object 가 property가진다
		if ( (i<Byte.MIN_VALUE) || (i>Byte.MAX_VALUE)) {  // || 는 or
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요");
		} else {
			byte b = (byte) i;
			System.out.println(b);
		}
	}
}
