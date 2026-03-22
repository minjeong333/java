package java쪽지시험준비;

import java.util.Scanner;

public class 문제02 {

	public static void main(String[] args) {
		/*
		 사용자로부터 문자열을 입력받아(Scanner 사용), 
		 해당 문자열을 거꾸로 뒤집어서 출력하는 프로그램을 작성하세요. (예: "Java" -> "avaJ")
		 */
		

		Scanner sc = new Scanner(System.in);
		String a =sc.nextLine();
		
		//문자열의 길이를 설정하기
		//인덱스특징
		//0부터 시작 ∴ 마지막글자의 인덱스 : 문자열의 길이-1
		//"Java" : 4글자 -> J(0) a(1) v(2) a(3) : a(마지막글자)의 인덱스는 3 = 4(문자열의 길이)-1
		
		//for문 거꾸로 돌리기
		//초기값을 int i=0 대신 마지막글자의 인덱스로 설정 
		//0까지 감소시키는 로직으로 작성

		for(int i=a.length()-1; i>=0; i--) {
			a.charAt(i); //i번째 글자를 하나씩 꺼내는 법
			System.out.print(a.charAt(i));	
		}
		
		//뒤집은 문자열을 변수에 저장하고 싶다면?
		/*
		 String reversed=""; //뒤집힌 글자 담을 바구니
		 for(int i=a.length()-1; i>=0; i--) {
			reversed += a.charAt(i); //i번째 글자를 하나씩 꺼내는 법
		 }
		 System.out.println(reversed);	
		*/
		
	}

}
