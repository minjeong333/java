package javaprj.day05;

public class 배열2차원 {

	public static void main(String[] args) {
		
		//2차원배열 : 1차원배열의 집합, 1차원배열을 여러개 가지고 있는 배열
		//접근방법 :
		//배열명[행 인덱스][열 인덱스]
		//배열을 기준으로 몇번째 1차원배열인지 찾는다 (행 찾기)
		//찾은 1차원 배열에서 몇번째 요소인지 찾는다 (열 찾기)
		

		
//		 1조 손영석 황스일 장해든 이현겸 
//		 2조 이용찬 박세인 김태준 고지연 
//		 3조 정철진 엄진희 김민경 여도현 
//		 4조 이정하 나해수 조아진 장윤성 
//		 5조 송주창 김민정 김재민 김건희 

		
		//2차원 배열 만들고 초기화하기
		String[][] teams = {
				{"손영석", "황스일", "장해든", "이현겸"},
				{"이용찬", "박세인", "김태준", "고지연"},
				{"정철진", "엄진희", "김민경", "여도현"},
				{"이정하", "나해수", "조아진", "장윤성"},
				{"송주창", "김민정", "김재민", "김건희"}
				
		};
		
		
		//2차원배열 출력하기
		
		//1.첫번째 팀(다운캐스팅)
		System.out.println("1조 다운캐스팅");
		System.out.print(teams[0][0]);
		System.out.print(teams[0][1]);
		System.out.print(teams[0][2]);
		System.out.print(teams[0][3]);
		
		//2.두번째 팀(this)
		System.out.println("\n2조 다운캐스팅");
		System.out.print(teams[1][0]);
		System.out.print(teams[1][1]);
		System.out.print(teams[1][2]);
		System.out.print(teams[1][3]);
		
		//3.세번째 팀(업캐스팅)
		System.out.println("\n3조 업캐스팅");
		System.out.print(teams[2][0]);
		System.out.print(teams[2][1]);
		System.out.print(teams[2][2]);
		System.out.print(teams[2][3]);
		
		//4.네번째 팀(생성자)
		System.out.println("\n4조 생성자");
		System.out.print(teams[3][0]);
		System.out.print(teams[3][1]);
		System.out.print(teams[3][2]);
		System.out.print(teams[3][3]);
		
		//5.다섯번째 팀(오버라이딩)
		System.out.println("\n5조 오버라이딩");
		System.out.print(teams[4][0]);
		System.out.print(teams[4][1]);
		System.out.print(teams[4][2]);
		System.out.print(teams[4][3]);
		
	
		
		//자신의 이름 출력하기
				System.out.println("");
				System.out.println("자신의 이름 출력하기");
				System.out.println(teams[4][1]);
				
				
				
				
		
		//2차원 배열 -> 중첩반복 해결

		//행이 반복
			//열 반복
		
		for(int i=0; i<5; i++) {
			//i행의 정보 출력 행 -> 1차원 배열
			System.out.println( "\n" + (i+1) + "조");
			
			//j => 행의 몇번째 요소인지
			for(int j=0; j<4; j++) {
				System.out.println(teams[i][j]);
			}
		}
		
		
		//2차원 배열 만들고 사용하기
		String [][] teams2 = new String[5][4];
		
		//첫번째 행
		teams2[0][0]="손영석";
		teams2[0][1]="황스일";
		teams2[0][2]="장해든";
		teams2[0][3]="이현겸";

		
		//두번째 행
		teams2[1][0]="이용찬";
		teams2[1][1]="박세인";
		teams2[1][2]="김태준";
		teams2[1][3]="고지연";
		
		//세번째 행
		teams2[2][0]="정철진";
		teams2[2][1]="엄진희";
		teams2[2][2]="김민경";
		teams2[2][3]="여도현";
		
		
		//네번째 행
		teams2[3][0]="이정하";
		teams2[3][1]="나해수";
		teams2[3][2]="조아진";
		teams2[3][3]="장윤성";
	
	
		//다섯번째 행
		teams2[4][0]="송주창";
		teams2[4][1]="김민정";
		teams2[4][2]="김재민";
		teams2[4][3]="김건희";
		

		//teams2 배열 출력하기
		for(int i=0; i<5; i++) {
			//i행의 정보 출력 행 -> 1차원 배열
			System.out.println( "\n" + (i+1) + "조");
			
			//j => 행의 몇번째 요소인지
			for(int j=0; j<4; j++) {
				System.out.println(teams2[i][j]);
			}
		}
		
		
		//넷플릭스 드라마 배열
		/*
		"오징어 게임", "더 글로리", "킹덤", 
		"스위트홈", "무빙", "지옥",
	    "지금 우리 학교는", "수리남", "디피(D.P.)", 
	    "소년심판", "종이의 집", "기묘한 이야기", 
	    "투투장부주", "퀸스 갬빗", "블랙 미러"
	    */
		
		
		String[][] netflix = new String[5][3];
		
		netflix[0][0]="오징어 게임";
		netflix[0][1]="더 글로리";
		netflix[0][2]="킹덤";

		netflix[1][0]="스위트홈";
		netflix[1][1]="무빙";
		netflix[1][2]="지옥";
		
		netflix[2][0]="지금 우리 학교는";
		netflix[2][1]="수리남";
		netflix[2][2]="디피(D.P.)";
		
		netflix[3][0]="소년심판";
		netflix[3][1]="종이의 집";
		netflix[3][2]="기묘한 이야기";
		
		netflix[4][0]="투투장부주";
		netflix[4][1]="퀸스 갬빗";
		netflix[4][2]="블랙 미러";
		
		System.out.println("\n" + netflix[0][2]);
		
		System.out.println("");
		
		for(int i=0; i<=5; i++) {
			//j => 행의 몇번째 요소인지
			for(int j=0; j<=3; j++) {
				System.out.println(netflix[i][j]);
			}
		}
	
	}
	

}
