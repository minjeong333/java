package javaprj.day03;

import java.util.Scanner;

public class 연산자_제어구조문제01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		
		String id=sc.next();   //아이디
		System.out.println("아이디는 "+ id);
		
		String name=sc.next();   //이름
		System.out.println("이름은 "+ name);
		
		int age=sc.nextInt();   //나이
		System.out.println("나이는 "+ age + "살 입니다.");
		
		int height=sc.nextInt();   //키
		System.out.println("키는 "+ height + "cm입니다.");
	}
}
