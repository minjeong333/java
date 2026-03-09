package javaprj.day05;

import java.util.Scanner;

public class 배열문제_입력받고출력하기_단계구분 {

	public static void main(String[] args) {
		
		
		//좋아하는 음식 5개 입력받아서 출력하기
		//입력
		//출력의 단계를 구분해서 실행하기
		
		Scanner sc = new Scanner(System.in);
		
		String [] foods = new String[5];  //
		//foods[0]="마카롱";
		//System.out.println(foods[0]);
		
		System.out.println("좋아하는 음식 입력하세요 5개");
		foods[0] = sc.nextLine();
		foods[1] = sc.nextLine();
		foods[2] = sc.nextLine();
		foods[3] = sc.nextLine();
		foods[4] = sc.nextLine();
		
		
		System.out.println(foods[0]);
		System.out.println(foods[1]);
		System.out.println(foods[2]);
		System.out.println(foods[3]);
		System.out.println(foods[4]);
	}

}
