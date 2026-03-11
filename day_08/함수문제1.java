package javaprj.day08;

public class 함수문제1 {
	
	//1. 수배열을 매개변수로 짝수의 개수를 반환하는 함수를 만들기 
	/*
	 기능: 짝수의 개수를 반환
	 매개변수: 수 배열
	 출력: 짝수의 개수
	 */
	
	public static int evenCnt(int[]arr) {
		
		int cnt=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				cnt++;
			}	
		}
		return cnt;
	}

	public static void main(String[] args) {
		
		int[] su= {1, 2, 3, 4, 5, 6};
		
		int result = evenCnt(su);
		
		System.out.println("문제 1) 짝수의 개수 반환하기");
		System.out.println(" ");
		System.out.println("짝수의 개수는 " + result);
		
		

	}

}
