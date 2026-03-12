package javaprj.day08;


//매서드를 제공할 목적으로 작성
//main이 없는 매서드

public class MyLib {
	
	//
	
	public static void  printStar( int cnt) {
		for( int i=1; i<=cnt; i++) {
			System.out.print("*");
		}
		
	}
	
	//
	public static int 두배만들기(int money) {
		int result = money*2;
		return result;
	}
	

}
