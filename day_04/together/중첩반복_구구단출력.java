package day_04;

public class 중첩반복_구구단출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2단

		System.out.println("2*1=" + 2*1);
		System.out.println("2*2=" + 2*1);
		System.out.println("2*3=" + 2*1);
		System.out.println("2*4=" + 2*1);
		System.out.println("2*5=" + 2*1);
		System.out.println("2*6=" + 2*1);
		System.out.println("2*7=" + 2*1);
		System.out.println("2*8=" + 2*1);
		System.out.println("2*9=" + 2*1);
		
		//반복문 2단 출력하기 
		for(int i=1; i<=9; i++) { // i=> 반복제어하는 변수, 구구단 만들 때 사용됨
			System.out.println("2*" + i + "=" + 2*i);
		}
		
		//반복문 3단 출력하기 
		for(int i=1; i<=9; i++) { // i=> 반복제어하는 변수, 구구단 만들 때 사용됨
			System.out.println("3*" + i + "=" + 3*i);
		}
		
		//반복문 4단 출력하기 
		for(int i=1; i<=9; i++) { // i=> 반복제어하는 변수, 구구단 만들 때 사용됨
			System.out.println("4*" + i + "=" + 4*i);
		}
		
		//전체구구단 반복문으로 출력하기
		for(int j=2; j<=9; j++) { //j는 8번이라는 반복제어변수 역할, 단 정보를 만들어 내는 역할			
			
			for(int i=1; i<=9; i++) { // i=> 반복제어하는 변수, 구구단 만들 때 사용됨
			//	System.out.println("4*" + i + "=" + 4*i);
				System.out.println(j + "*" + i + "=" + j*i);
			}
		
		}
		
		
		
		
	}

}
