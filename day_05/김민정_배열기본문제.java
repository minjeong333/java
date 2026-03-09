package javaprj.day05;

public class 김민정_배열기본문제 {

	public static void main(String[] args) {



	
	//Q. 이번주 날씨 정보가 배열로 제공되었다
	  int[]  Temperatures  =  { 33 , 35, 32 ,35  ,36 ,35 ,34  }  ;
	
	
	//  1) 이번주 날씨정보를 출력하시오
	  String[] day = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
	  
		for(int i=0; i<Temperatures.length; i++) {
			System.out.println(day[i] + "은" + " " + Temperatures[i] + "도 입니다.");
		 }
			
	
	//	2) 평균온도를 구하시오
		int sum=0;
		int avg=0;
		
		for(int i=0; i<Temperatures.length; i++) {
			sum=sum+Temperatures[i];	
		}
		avg=sum/Temperatures.length;
		System.out.println("\n" + "이번주 평균온도는 " + avg + " 입니다." + "\n");
		
	//	3) 35도가 넘는 날의 횟수를 구하시오
		int cnt=0;
		
		for(int i=0; i<Temperatures.length; i++) {
			if(Temperatures[i]>35) {
				cnt++;
			};	
		}
		System.out.println("35도가 넘는 날의 횟수는 " + cnt + " 입니다." + "\n");
		
	//	4) 가장 높은 온도를 구하시오

		int max=Temperatures[0];
		
		for(int i=0; i<Temperatures.length; i++) {
			if(Temperatures[i] > max ) {
				max = Temperatures[i];
			};	
		}
		
		//Array 함수 쓰는 버전
		//max = java.util.Arrays.stream(Temperatures).max().getAsInt();
		
		
		System.out.println("가장 높은 온도는 " + max + " 입니다.");
	
	
		
	}	
		
		

}
