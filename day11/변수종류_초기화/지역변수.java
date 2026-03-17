package javaprj.day11.변수종류_초기화;

public class 지역변수 {

	public static void main(String[] args) {
		
		int a; //지역변수  매서드안에서 만들어지는 변수 지역변수
		int result = add(5,3);
		System.out.println(result);
	}
	
	/*
	  add에서 만든 지역변수는 add 호출될 때 만들어졌다가 리턴될 때 모두 정리됨
	 */
	
	public static int add(int su1, int su2) { //su1, su2 매개변수 => 지역변수
		
		int a;
		int total; //지역변수
		total = su1+su2;
		
		return total;
	}

}
