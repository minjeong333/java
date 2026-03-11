package javaprj.day06;

public class 정적메모리 {

	public static void main(String[] args) {
		 
		// 프로그램이 실행되기 전에 메모리의 크기가 정해지는 것을 말한다 
		
		// int:4byte, double :8byte , char:2byte ,  boolean:1byte 
		
		int a=10;
		int c=20;
		System.out.print(a);
		System.out.print(c);

		//지역변수  : 함수안에서 만들어지는 변수, 함수가 끝나면 사라짐(메모리해제, 반납)
	}
	
	
	/*
	public static int  getTenTotal() {		
		 
		int sum=0;
		for( int i=1; i<=10; i++) {
			sum= sum+i;
		}
		
		return sum;
	}
	
	*/

}
