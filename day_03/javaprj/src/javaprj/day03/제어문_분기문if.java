package javaprj.day03;

import java.util.Scanner;

public class 제어문_분기문if {

	public static void main(String[] args) {
		
		
		//국어성적에 대한 등급 구하기//
		
		Scanner sc = new Scanner (System.in);
		
		int kor=90;
		
		kor = sc.nextInt();
		
		char result=' '; //초기화
		
		
		
		if(kor>=90) {
			result='A';
		}else if(kor >=80) {
			result='B';
		}else if(kor>=70) {
			result='C';
		}else {
			result='F';
		}
		
		System.out.println(result);

		
		
	}

}
