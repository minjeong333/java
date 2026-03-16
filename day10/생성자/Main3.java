package javaprj.day10.생성자;

public class Main3 {

	public static void main(String[] args) {

		//생성자를 통해서 변수(객체)의 값의 초기화를 담당한다
		
		AcornStudent2 s = new AcornStudent2();
		s.정보출력하기();
		
		AcornStudent2 s2 = new AcornStudent2("김민정", 500, 30, 50, 50);
		s2.정보출력하기();
		
		AcornStudent2 s3 = new AcornStudent2("김민정", 500);
		s3.정보출력하기();
		
		//int a =10;
		
		//class만든 다음
		//AcornStudent s2 = new AcornStudent3("김민정", 500, 30, 50, 50);
		

	}

}
