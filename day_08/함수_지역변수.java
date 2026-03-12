package javaprj.day08;

public class 함수_지역변수 {

	public static void main(String[] args) {
		// 두 수 더하기
		
		int sum;
		int su1=10;
		int su2=5;
		sum = su1+su2;
		
		System.out.println(sum);
	
		int result = adder(3,10); //call by value
		int result2 = adder(su1, su2);
		
		//
		System.out.println(result);
		System.out.println(result2);
	}

	//기능: 합 구하기
	//입력: 두 정수
	//반환: 두 수의 합

	public static int adder(int su1, int su2) {
		int sum;
		sum = su1+su2;
		return sum;
	}
}
