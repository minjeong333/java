package java쪽지시험준비;

public class 문제01 {
	/*
	 1부터 20까지의 정수가 담긴 배열을 생성하고, 
	 그중 3의 배수이면서 짝수인 수들만 골라 합계를 구해 출력하는 코드를 작성하세요.
	 */

	public static void main(String[] args) {
		/*
		// 배열에 넣기 반복문 안쓴 버전
		int[] arr = new int[]{1,2,3,4,5,
							  6,7,8,9,10,
							  11,12,13,14,15,
							  16,17,18,19,20};
		*/
		
		// 배열에 넣기 반복문 버전
		int[] arr = new int[20];
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
		}
		
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%3==0 && arr[i]%2==0) {
				sum+=arr[i];
			}
		}
		System.out.println(sum);
		
		/*

		3의 배수 : 3 6 9 12 15 18 
		짝수 : 6 12 18의 합은 36
		
		*/
	
	}

}
