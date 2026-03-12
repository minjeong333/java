package javaprj.day08;

//자바에서 코드 작성법
//반드시 클래스가 있어야 한다
//실핼가능한 클래스가 되려면 반드시 약속된 main 매서드가 있어야 한다


public class 배열에서짝수개수구하기2 {


	//함수를 만들기 힘들면
	//메인에서 동작하는 프로그램으로 작성하기
	
	/*
	 기능:정수배열에서 짝수구하기
	 입력:정수배열
	 빈환:짝수개수
	 */
	
	public static int getEven(int[] nums) {
		
		//짝숭릐 개수 구하기	
		int cnt=0;
				
		//
		for(int i=0; i<nums.length; i++) {
			if(nums[i]%2==0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		return cnt;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {8,12,6,8,12,3};
		
		
		//짝숭릐 개수 구하기	
		int cnt=0;
		
		//
		for(int i=0; i<nums.length; i++) {
			if(nums[i]%2==0) {
				//System.out.println(nums[i]);
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
	
}
