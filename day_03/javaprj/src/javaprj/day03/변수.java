package javaprj.day03;

public class 변수 {

	public static void main(String[] args) {
		
		//변수 : 하나의 값을 저장하기 위한 메모리공간 (일정크기의 메모리 바이트를 가진다)
		//주소+크기(특정주소로부터 몇바이트의 크기를 갖는 공간) 
		//메모리의 특정 주소에 개발자가 이름을 붙여서 사용하는 것

		
		//변수선언방법 => 변수사용알림
		//자료형 변수명;  int score;
		//자료형은 크기(몇바이트) + 해석의 정보를 가지고 있다
		//자료형? 변수에 저장할 수 있는 값의 종류, 크기(몇바이트) 그리고 그 값을 해석하는 방법을 정의한 것!!
		
		
		//정수형 변수
		int a=10; //
		
		//실수형 변수
		double b=253.3;
		
		
		//문자, 하나의 문자 : ' ' 감싼다
		char c='A';
		
		//논리형 변수
		boolean flag = true;// true, false
		
		//문자열 변수
		// 문자집합(문자배열)
		String name="apple";
		
		
		//출력
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(flag);
		
		
		//변수이름 영문소문자, 의미있게 작성하기
		//카멜케이스작명법, 언더스코아(스네이크법)
		// mathScore,       math_score
	}

}
