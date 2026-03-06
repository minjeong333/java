package javaprj.day03;

import java.util.ArrayList;
import java.util.Scanner;

public class 황스일양수음수 {

	public static void main(String[] args) {
		

		//
		//1. 사용자입력을 리스트(배열을 쉽게 사용하게 해주는 것)에 저장하기
		//2. 리스트에 있는 내용으로 양수, 음수, 양수 중 짝수, 양수 중 홀수의 개수 구하기
		//3. 양수, 음수, 양수 중 짝수, 양수 중 홀수 출력

		// 양수, 음수, 양수 중 짝수, 양수 중 홀수 => 하나의 단위 (객체)
		/*
		 * 
		 * 
		 * let statistics ={
		 * 			"positiveCount" : positiveCount,
		 * 			"negativeCount" : negativeCount,
		 * 			"positiveOddCount" : positiveOddCount,
		 * 			"positiveEvenCount" : positiveEvenCount
		 * 
		 * } ;
		 * 
		 *  //객체를 만들기 위해서 틀(템플릿) , 설명서 (설계도)
		 *    public   class Statistics {
	          int positiveCount;
	          int negativeCount;
	          int positiveOddCount;
	          int positiveEvenCount;
	
	        
        }
        
        
        //객체를 만든코드 
        // 
        //  Statistics  s = new Statistics( );
        //  s.positiveCount=5;
        /// s.negativeCount=3;
        /// s.positiveOddCount =3;
        /// s.positiveEvenCount =2;
        /// 
        /// 
        /// 

	 */
		Scanner sc = new Scanner(System.in);
		//10개
		ArrayList<Integer> list = new ArrayList<>(); //index => 0
		
		for(int i=1; i<=10; i++) {
			//list.add(7);
			int su = sc.nextInt();
			list.add(su); // 0번째부터 add됨
		};
		
		
		//2.  
		
		//4개의 정보를 담을 객체를 만들자
		Statistics result = new Statistics();
		for(int i=0; i<list.size(); i++) { //get(인덱스)
			
			if(list.get(i)>0) { //양수
				//양수증가
				result.positiveCount = result.positiveCount +1;
				
				if(list.get(i)%2==0) {
					//짝수
					result.positiveEvenCount++;
					
				}else {
					//홀수
					result.positiveOddCount++;
				}
				
			}else {
				//음수증가
				result.negativeCount++;
			}
			
		}
		
		
		//3. result 결과 출력하기
		
		System.out.println(result.positiveCount);
		System.out.println(result.negativeCount);
		System.out.println(result.positiveEvenCount);
		System.out.println(result.positiveOddCount);
		
	
	}

}
