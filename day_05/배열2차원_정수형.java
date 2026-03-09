package javaprj.day05;

public class 배열2차원_정수형 {

	public static void main(String[] args) {

		// 3월 7일 lotto 번호 정보 6개 저장하고 출력하기

		int a = 10;
		int b = 15;
		int c = 19;
		int d = 27;
		int e = 30;
		int f = 33;

		// int[] lotto = new int[] {10, 15, 19, 27, 30, 33};

		int[] lotto = { 10, 15, 19, 27, 30, 33 };

		System.out.print("3월7일");
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i] + "  ");
		}

		System.out.println("");

		// 2차원배열
		// 2월달 로또번호를 1차원배열 여러개를 가지는 구조로 저장하고 출력하기

		/*
		 * lotto2Month는 2차원 배열이다 즉 배열의 요소는 1차원배여로 이루어져 있다 int[][] lotto2Month = { {},
		 * {}, {}, {} };
		 */

		int[][] lotto2Month = { { 1, 7, 9, 17, 27, 38 }, { 23, 26, 27, 35, 38, 40 }, { 5, 8, 25, 31, 41, 44 },
				{ 5, 11, 25, 27, 36, 38 } };

		// 2월 첫째 주 로또번호 출력
		System.out.println("\n 2월 첫째 주 로또번호");

		System.out.print(" " + lotto2Month[0][0]);
		System.out.print(" " + lotto2Month[0][1]);
		System.out.print(" " + lotto2Month[0][2]);
		System.out.print(" " + lotto2Month[0][3]);
		System.out.print(" " + lotto2Month[0][4]);
		System.out.print(" " + lotto2Month[0][5]);
		System.out.println("/n");

		// 2월 둘째 주 로또번호 출력
		System.out.println("\n 2월 둘째 주 로또번호");

		System.out.print(" " + lotto2Month[1][0]);
		System.out.print(" " + lotto2Month[1][1]);
		System.out.print(" " + lotto2Month[1][2]);
		System.out.print(" " + lotto2Month[1][3]);
		System.out.print(" " + lotto2Month[1][4]);
		System.out.print(" " + lotto2Month[1][5]);
		System.out.println("/n");

		// 2월 셋째 주 로또번호 출력
		System.out.println("\n 2월 셋째 주 로또번호");

		System.out.print(" " + lotto2Month[2][0]);
		System.out.print(" " + lotto2Month[2][1]);
		System.out.print(" " + lotto2Month[2][2]);
		System.out.print(" " + lotto2Month[2][3]);
		System.out.print(" " + lotto2Month[2][4]);
		System.out.print(" " + lotto2Month[2][5]);
		System.out.println("/n");

		// 2월 넷째 주 로또번호 출력
		System.out.println("\n 2월 넷째 주 로또번호");

		System.out.print(" " + lotto2Month[3][0]);
		System.out.print(" " + lotto2Month[3][1]);
		System.out.print(" " + lotto2Month[3][2]);
		System.out.print(" " + lotto2Month[3][3]);
		System.out.print(" " + lotto2Month[3][4]);
		System.out.print(" " + lotto2Month[1][5]);
		System.out.println("/n");
		
		
		
		//2월 로또번호 출력 
		//반복문사용
		
		
		for(int i=0; i<4; i++) {
			System.out.println("\n" + (i+1) + "번째 주");
			for(int j=0; j<6; j++) {
				System.out.print(lotto2Month[i][j] + "  ");
			}
		}

	}

}
