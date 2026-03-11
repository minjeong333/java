package javaprj.day08;

import java.util.Scanner;

public class 함수문제6 {

	//6. 수목록(배열)을 입력으로 받아 가장 큰값을 반환하는 함수 만들기 ( 수 중에서 가장 큰값을 찾아주는 함수)
	
	public static int getMax(int[]arr) {
		int max = arr[0];
		for(int i =1; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력할 숫자의 개수:  ");
		int cnt = sc.nextInt();
		int[] result = new int[cnt];
		
		System.out.println(cnt + "개의 숫자를 입력하세요:");
		for(int i=0; i<cnt; i++) {
			result[i]=sc.nextInt();
		}
		
		int max = getMax(result);
		System.out.println("가장 큰 값은 " + max + "입니다.");

	}

}
