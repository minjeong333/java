package day_04;

import java.util.Scanner;

public class 김건희매운맛2 {

	public static void main(String[] args) {
		
		// 입력
		//
		int time;
		int code;
		String name;
		
		 // 기본자료형 int(byte, short, long), double(float), char, boolean
		
		
		
		// 출력
		
		// 임금
		int result;
		
		
		
		//처리
		int pay=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시간 코드 이름 순으로 입력하시오");
		
		time = sc.nextInt();
		code = sc.nextInt();
		name = sc.nextLine();
		
		
		if(code == 1) {
			pay=2000;
		}else if(code == 2) {
			pay=2500;
		}else if(code == 3) {
			pay=3000;
		}else if(code == 4) {
			pay=4000;
		}
		
		result = pay*time;
		
		System.out.println(result);
	}

}
