package javaprj.day06;

import java.util.Scanner;

public class 학생변경하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in);
		
		//학생이름5개 등록되어 있다고 생각하자
		String[] names = new String[] {  "이용찬" ,"이현겸" ,"김민정" , "황스일" ,"고지연"};		
		 
		
		//전체 조회 
		for(int i=0; i< names.length; i++) {
			System.out.println( (i+1)  +  names[i]);
			
		}
		
		//학생번호는 학생index를 활용  (index+1) 
		
		 
		//변경할 학생번호를 입력  :3
		//변경할 이름  :김민정 공주
		System.out.println("변경할 학생번호 입력:");
		int updateNo  = sc.nextInt();
		
		sc.nextLine();  //남아 있는 엔터키 값 제거하기
		
		System.out.println("변경할 이름 입력");
		String newName  = sc.nextLine();		
		names[updateNo-1] =newName; 
		 
		
		//변경이 완료되었다는 메시지 출력
		System.out.println("변경이 완료 ^^");
		
		
		for(int i=0; i< names.length; i++) {
			System.out.println( (i+1)  +  names[i]);
			
		}
		
		
		
		
		
		
		
		

	}

}
