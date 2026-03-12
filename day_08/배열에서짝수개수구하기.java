package javaprj.day08;

//자바에서 코드 작성법
//반드시 클래스가 있어야 한다
//실핼가능한 클래스가 되려면 반드시 약속된 main 매서드가 있어야 한다


public class 배열에서짝수개수구하기 {

	//기능:인사하기
	//입력(매개변수):x
	//반환:"hello java"출력
	
	public static void hi() {
		System.out.println("hello java");
	} 
	
	
	public static void main(String[] args) {
		//코드작성 => 함수(매서드)로 분리하기
		//System.out.println("hello java");
		
		
		int result =배열에서짝수개수구하기(new int[] {12, 8, 6, 5, 3});
		System.out.println(result);
	}

	/*
	 기능:배열에서짝수개수구하기
	 입력(매개변수):배열(정수배열)
	 반환:짝수의 개수
	 */
	public static int 배열에서짝수개수구하기(int[] nums) {
		int cnt=0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]%2==0) {
				cnt++;
			}
		}
		
		return cnt;
	}
}
