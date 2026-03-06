package day_04;

public class 중첩반복_for {

	public static void main(String[] args) {


		//문제) *하나로 5개 출력하기
		//*****
		
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		
		System.out.print("\n반복문으로 출력하기");

		
		for(int i=1; i<=5; i++) {
			System.out.print("*");
		}
		
	
		//문제2)*별 하나로 5개를 5줄 출력하기
		
		System.out.println("\n별5개 5줄 출력하기");
		for(int i=1; i<=5; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for(int i=1; i<=5; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for(int i=1; i<=5; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for(int i=1; i<=5; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for(int i=1; i<=5; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		
		//
		for( int j=1; j<=5; j++) {
			
			for(int i=1; i<=5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
