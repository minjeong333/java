package javaprj.day03;

public class 변수_상수화 {

	public static void main(String[] args) {
		
		
		//기억장소(메모리블럭)을 값의 초기화 후 이용만 할 때 사용
		//변수를 상수화 시킴
		//대문자 규칙
		//final int MAX=10;
		
		
		
		final int MAX=10;
		final double PI=3.14;
		// MAX=11; 오류발생 -> 불가능

		
		//상수사용목적
		//1. 가독성 좋아짐
		//2. 유지보수성이 좋아짐
		
		
		System.out.println(MAX);
		System.out.println(PI);
		
	}

}
