package javaprj.day06;

import java.util.Scanner;

public class 동적메모리 {

	public static void main(String[] args) {


		//동적메모리 : 프로그램을 싱행시켰을 때 실제사용할 메모리의 크기가 결정되는 것
		//자바에서는 new를 사용해서 동적메모리 사용함
		
		
		int size;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 결정해 입력해주세요 1~100");
		size = sc.nextInt();
		
		//
		int[]arr = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//당신이 만든 배열 출력하기
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);;
		}
	}

}
