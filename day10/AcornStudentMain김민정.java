package javaprj.day10;

public class AcornStudentMain김민정 {

	 
	public static void main(String[] args) {
		
		
		//AcornStudent김민정을 가지고 에이콘학생정보를 저장할 수 있는 변수 만들기
		//AcornStudent김민정 s  = new AcornStudent김민정();
		
		AcornStudent김민정 s;
		//s는 참조형변수이다
		s = new AcornStudent김민정();

		
		//입력하기
		s.입력하기("김민정", 1000, 10, 50, 200, 0);

		
		//객체 매서드 사용하는 방법
		//객체를 반드시 생성해야 한다
		//왜냐? 객체의 정보를 전달받아서 객체(즉 변수)의 내용을 사용해야 하니까
		//출력하기
		s.정보출력하기(); //정보출력하기가 출력될 때 s변수(s객체)의 위치정보가 전달됨.
		
		s.밥먹기();
		s.정보출력하기();

		s.배열공부하기();
		
		s.운동하기();

		//s.자바능력=50000; private 사용: 외부 접근 막고 정해진 방법으로만 자바능력치가 올라가게 하겠다
	    //				  => 변수를 사용하는 게 아니라 배열공부하기()를 통해서 자바능력의 값을 변화시키겠다 	
		s.정보출력하기();

		//학원정보 출력하기
		AcornStudent김민정.학원위치소개하기();
	}
	
	 

}
