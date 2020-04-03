package chap05.array;

public class Array {
	public static void main(String[] args) {
		int age1;
		age1 = 10;
		
		int age2 = 20;
				
		// 배열 // 8개의 데이터 타입이 아니다= 참조타입
		//새로운 참조타입 만드려면 항상 new 붙여라. (90%이상)
		//2가지방법 1.번이 낫다. 오해하지않게. 
		int[] ageArray;
		int ageArray5[];
		
		ageArray = new int[100];  // 100개의 공간을 마련하라. 
		
		//배열의 초기값 page156
//		System.out.println(age1); // 바로 못쓴다. 초기화를 해줘야 쓸 수 있었다.
		age1 = 10;
		System.out.println(age1);
		
		System.out.println(ageArray[88]);  //0 or false or null
		//마련된 88개의 공간에 다 0이 채워져있음
		System.out.println(ageArray[90]);
		
		// 배열의 초기값 할당
		int[] ageArray2;
		ageArray2 = new int[] {3,4,5,1,-1,7};
		System.out.println(ageArray2[0]);
		System.out.println(ageArray2[5]);
		
		// 선언과 동시에 값을 넣어줌. new 생략가능 
		// 선언 이후에 값을 넣을 대는 new 해줘야 하는뎅
		int y = 99; // 처럼
		int[] ageArray3 = {9, 10, 11,-9, -33};
		System.out.println(ageArray3[0]);
		System.out.println(ageArray3[3]);
		
		// 배열의 인덱스 0 ~ (길이-1)
		
		// 배열의 길이
		System.out.println(ageArray.length); //100
		System.out.println(ageArray2.length);
		System.out.println(ageArray3.length);
		
		// 배열의 길이를 넘어가는 놈을 사용하면
		// ArrayIndexOutofBoundsException  바로 종료
//		System.out.println(ageArray[100]);
	
		// 배열과 for는 찰떡궁합
		for (int i = 0; i <ageArray3.length; i++) {
			System.out.println(ageArray3[i]);
		}
		
		//배열의 값 변경
		ageArray3[3] = 99999999;
		System.out.println(ageArray3[3]);
		
		// 다른  for 문 -> 향상된 for문
		//for (오른쪽이 가질 수 있는 각 값을 받을 수 있는 변수 :반복해서 쓸 수 있는 놈) {
		// 왼쪽에 값이 바로 들어간다. 
		for (int value: ageArray3) {
			System.out.println(value);
		}
		
		
	}
}
