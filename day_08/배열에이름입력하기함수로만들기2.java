package javaprj.day08;

import java.util.Scanner;

public class 배열에이름입력하기함수로만들기2 {

	public static void main(String[] args) {

		
		String[] names = new String[5]; // names는 참조형변수!! 위치정보를 저장한다(배열의 위치정보)
										// 참조형변수가 왜 필요해?
										// 배열에서부터는 new를 사용해서 메모리를 확보하고 사용해야 해
										// 주소를 저장하고 사용할 일이 발생하니까 new가 필요한거지
										// 즉, new => 메모리확보 + 주소 반환
		
		names[0]="김태준";
		names[1]="김건희";
		names[2]="고지연";
		names[3]="황스일";
		names[4]="김민정";

		
		//출력하기 
		/*
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		*/
		출력하기(names);
	}

	
	public static void 출력하기(String[] names) {
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	 }
	}

