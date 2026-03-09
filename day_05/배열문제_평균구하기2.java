package javaprj.day05;

public class 배열문제_평균구하기2 {

	public static void main(String[] args) {
		
		// 국어점수배열 5개 국어점수
		
		
		int[] kors= {100, 99, 85, 83,77};
		
		//평균을 구하시오
		//반복문 사용 안하기
		//1.반복
		//  - 총합 구하기
		//2.평균 구하기
		
		int sum=0; // 국어점수 전체합계
		double avg;

		for(int i=0; i<kors.length; i++) {
			sum = sum + kors[i];  //0~4번까지의 요소 5개값의 합계를 구할 수 있다
		}
		
		avg=sum/kors.length;
		
		System.out.println(avg);
	}

}
