package javaprj.day10;

public class AcornStudentMain {

	 
	public static void main(String[] args) {

		AcornStudent s  = new AcornStudent();
		AcornStudent s2  = new AcornStudent();
		AcornStudent s3  = new AcornStudent();
		
		//입력하기
		s.입력하기("김건희", 1000, 10, 50, 200);
		s2.입력하기("박지훈",2000,20,0,0);
		s3.입력하기("김민정",1000,20,20,100);
		
		//출력하기
		s.정보출력하기();
		s2.정보출력하기();
		s3.정보출력하기();
		
		s.밥먹기();
		s2.밥먹기();
		s3.밥먹기();
		
		s.정보출력하기();
		s2.정보출력하기();
		s3.정보출력하기();
		
		s.배열공부하기();
		s2.배열공부하기();
		s3.배열공부하기();
		
		//s.자바능력=50000; private 외부 접근 막고 정해진 방법으로만 자바능력치가 올라가게 하겠다

		s.정보출력하기();
		s2.정보출력하기();
		s3.정보출력하기();
	}
	
	 

}
