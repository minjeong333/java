package javaprj.day05;

public class 배열문제_평균구하기 {

	public static void main(String[] args) {
		
		// 국어점수배열 5개 국어점수
		
		
		int[] kors= {100, 99, 85, 83,77};
		
		//평균을 구하시오
		//반복문 사용 안하기
		//1.반복
		//  - 총합 구하기
		//2.평균 구하기
		
		
		int total=0;
		double avg;
		
		total = kors[0] + kors[1] + kors[2] + kors[3] + kors[4];
		
		avg =(double)total/kors.length; //정수/정수 => 정수

		System.out.println(avg);
		
		
		//반복문 쓰기
		int total2=0;
		
	}

}
