package javaprj.day03;

public class 변수_문자형 {

	public static void main(String[] args) {


		//컴퓨터의 모든 데이터는 숫자다
		//그래서 문자도 숫자로 다뤄진다 !! (숫자로 저장된다)
		
		//아스키코드 
		//'a' => 97
		//'A' => 65
		//'0' => 48
		
		//대소문자 변환시 32값을 더하거나 빼기를 하면 대문자, 소문자 변환 가능
		//문자열(숫자로 구성된 "128") -> 128 바꿀 때
		//자바스크립트"parseInt("128") -> 128  자바 : Integer.parseInt("128") -> 128
		
		
		//"125" -> 125

		
		char c='a';
		char d='한';
		
		System.out.println(c);
		System.out.println(d);
		
		System.out.println( (int) c );
	}

}
