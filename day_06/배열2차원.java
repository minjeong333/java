package javaprj.day06;

public class 배열2차원 {

	public static void main(String[] args) {

		int[][] SeatBook = { 
				{ 1, 0, 0, 0, 1, 1 }, 
				{ 1, 1, 0, 1, 0, 1 },
				{ 1, 0, 1, 0, 1, 0 },
				{ 1, 0, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1 }

		};

		
		int[] line1 = { 1, 0, 0, 0, 1, 1 };
		int[] line2 = { 1, 1, 0, 1, 0, 1 };
		int[] line3 = { 1, 0, 1, 0, 1, 0 };
		int[] line4 = { 1, 0, 1, 1, 1, 1 };
		
		
		int[][] seat = {line1, line2, line3, line4};
		
		
		
		
		//2차원 배열의 요소는 1차원 배열
		//2차원배열의 크기는 1차원 배열의 개수
		for(int i=0; i<seat.length; i++) {
			
			//
			//System.out.println( (i+1) + "행 출력 시작");		
	
			//각 행에 대한 열 출력하기
			/*
			System.out.println(seat[i][0]);
			System.out.println(seat[i][1]);
			System.out.println(seat[i][2]);
			System.out.println(seat[i][3]);
			System.out.println(seat[i][4]);
			System.out.println(seat[i][5]);
			*/
			
			for(int j=0; j<seat[i].length; j++) {
			System.out.println(seat[i][j]);
			}
			
			System.out.println();
		}
	  }
	}
