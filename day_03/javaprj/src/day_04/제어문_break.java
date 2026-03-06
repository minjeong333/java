package day_04;

import java.util.Scanner;

public class 제어문_break {

	public static void main(String[] args) {
		
		
		// 반복문에서 break 사용하면 자신이 속한 반복문을 벗어남
		// 아룸울 압력받아서 그대로 출력하기
		//"stop"이름이 입려되면 종료되게 하기
		
		//반복의 횟수가 정해지지 않았기 때문에 while문 사용하기
		
		
		String name=""; //
		Scanner sc  = new Scanner( System.in );
		
		while(true) {
			
			name = sc.nextLine();
			
			if(name.equals("stop")) { //문자열비교 => 문자하나하나를 다 비교 true, false
				break;
			}
			System.out.println(name);
			
		}

	}

}
