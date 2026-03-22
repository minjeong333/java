package java쪽지시험준비;

import java.util.Scanner;

/*
 크기가 5인 int 배열을 만들고, 
 사용자로부터 숫자 5개를 입력받아 배열에 저장하세요. 
 그 후, 배열에 담긴 숫자 중 홀수들의 합만 구해서 출력하세요.
(힌트: Scanner와 for문을 조합해 보세요.)
 */

public class 문제01변형_배열과누적연산 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		//입력을 위한 for문
		System.out.println("숫자 5개를 입력하세요");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt(); //사용자가 입력한 숫자를 i번째 칸에 저장
		}
		
		//합계 계산을 위한 for문
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==1) {
				sum+=arr[i];
			}
		}
		System.out.println(sum);

	}

}
