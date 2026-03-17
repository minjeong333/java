package javaprj.day11;

public class StudentMain {

	public static void main(String[] args) {

		//객체변수만들기
		
		Student s ; //Student type의 변수(객체라고 한다)의 정보를 저장할 참조형변수 선언
		s = new Student("홍길동",100,50); //매개변수 있는 생성자를 사용한다(생성된 객체, 즉 변수에 값 넣기)
		
		//Student s2 = new Student(); // 기본생성자가 없으면 오류가 남
		
		System.out.println(s.toString());
		//System.out.println(s2.toString());
		
		
		//s.avg = (s.eng+s.kor)/2.0;  => 매서드를 통해서 평균이 구해져야 한다
		s.calcAvg();
		s.calcGrade();
		
		System.out.println(s.toString());
	}

}
