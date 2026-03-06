package javaprj.day03;

public class 연산자_논리연산자 {

	public static void main(String[] args) {


		//논리연산자  &&, ||, !
		
		
		int kor=80;
		int eng=90;
		
		//장학금 지급
		boolean result = (kor>=90) && (eng >=90);  //  ture  && true => 참,     false  && true  => false 
		
		boolean result2 = (kor>=90) || (eng >=90);  // false && false , 하나하도 참이면 참(true)
		
		boolean result3 = kor>=90;  //false
		boolean result4 = !(kor>=90);  // 조건을 부정 => true
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

}
