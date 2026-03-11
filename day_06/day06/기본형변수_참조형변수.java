package javaprj.day06;

public class 기본형변수_참조형변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//기본형변수  : int, double, char, boolan 
		//프로그램에서 실제적으로 사용되는 데이터 값을 저장하는 변수 
		int score=90;  //90점   값 자체
		char b='A';  // 'A' 뭄자 데이터 값 자체 
		double c=25.6; // 25.6 온도 데이터 값 자체 
		boolean d=true;   //참 또는 거짓의 데이터 값 자체 
		
		

		//배열만들기 
		//int arr[10];  =>이런식으로 배열을 자바에서 만들지 못함 
		
		//자바에서는 배열부터는  new로 힙메모리를 사용하면서 개발을 해야 함 
		
		 int[] arr = new int[10];
		//int  arr[]  = new int[10];   가능함 
		 
		 //1. int형크기 10개를 힙메모리에 확보하기
		 //2. 위에서 확보된 메모리의 시작 주소를 반환함
		 //3. 주소를 기억할 참조형변수(주소를 저장하는 변수)가 필요하다 
		 //4. arr는 반환된 주소(공간이 확보된 메모리으 시작주소)를 저장하는 참조형 변수이다 
		 // new가 나오면 참조형변수가 필연적이다 !!! 
		 
		
		
	}

}
