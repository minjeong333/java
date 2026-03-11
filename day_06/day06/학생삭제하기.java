package javaprj.day06;

import java.util.Scanner;

public class 학생삭제하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner( System.in);
		
		String[] names = new String[5];
		names[0]="엄진희";
		names[1]="이정하";
		names[2]="조아진";
		names[3]="박세인";
		names[4]="장해든";
		
		
		//전체 조회   학생번호 , 이름 
		 
		for( int i=0; i< names.length ; i++) {
			 System.out.println(  (i+1)  +  names[i]);
		}
		
		
		//삭제할 번호 입력 :
		System.out.println("삭제할 번호 입력:");
		int deletNo  = sc.nextInt();		
		
		
		//삭제할 이름에  "x"  문자열 저장 (  임의의 문자열);
		
		names[deletNo -1 ] = "x";		
		System.out.println("삭제되었습니다");
		
		
		
		
		//전체조회하기
		
		//문자열의 비교는 equals() 제공함 , 같은면 true, false 반환함 
		for( int i=0 ; i< names.length; i++) {
			
			//System.out.println( names[i]);
			
			if(  !names[i].equals("x")) {    // "x" 아니면 
				
				System.out.println( names[i]);
			}
		}
		
	}

}
