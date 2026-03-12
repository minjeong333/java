package javaprj.day08;

import java.util.Scanner;

public class 배열에이름입력하기함수로만들기 {

	public static void main(String[] args) {

		
		String[] names = new String[5]; //names는 참조형변수!! 위치정보를 저장한다(배열의 위치정보)
		//배열에 입력하기
		/*
		names[0]="김태준";
		names[1]="김건희";
		names[2]="고지연";
		names[3]="황스일";
		names[4]="김민정";
		 */
		
		입력하기(names); // call by reference
		
		// 이름배열 출력하기 => 분리하기
		/*
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		*/
		
		//출력하기(names);
	}

	// 입력하기
	public static void 입력하기(String[] names) {
		names[0]="김태준";
		names[1]="김건희";
		names[2]="고지연";
		names[3]="황스일";
		names[4]="김민정";
		}
	/*
	public static void 출력하기() {
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	 }
	 */
	}

