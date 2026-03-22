package java쪽지시험준비;

/*
  문제03
  다음 조건에 맞는 Student 클래스를 설계하세요.
  필드(속성): String name, int score
  메서드: void printInfo() (이름과 점수를 출력하는 기능)
  main 메서드에서 Student 객체를 생성하고 값을 할당한 뒤 printInfo()를 호출하세요.
  
 */
public class Student {
	
	//필드(속성)선언
	String name;
	int score;
	
	
	public void printInfo() {
//		name=name;
//		score=score; -> 값 출력만 하면 되어서 필요 없음
		System.out.println(name + score);
	}
//
//	public static void main(String[] args) {
//		
//		//객체 생성(클래스를 바탕으로 결과를 찍어내는 행위 = 결과물을 만들어내기 위한 과정)
//		Student s = new Student();
//		
//		//객체의 필드에 값 할당(도트(.)연산자 사용)
//		s.name="김민정";
//		s.score=80;
//		
//		s.printInfo(); 

//	}
	
	//생성자 사용하게 되면? -> 객체를 만듦과 동시에 값 넣어주기 가능
	//생성자 : 매서드 이기 때문에 "도구"이다, 객체가 생성될 때 가장 먼저 실행되는 특수한 매서드
	//주로 객체의 초기 상태(이름, 점수)등을 설정하는 역할
	public Student(String n, int s) { //n이라는 문자열이랑 s라는 정수형을 받을거야
		this.name=n; 
		this.score=s;
	}
	
	public static void main(String[] args) {
		//객체 생성 + 값 받기
		Student s = new Student("김민정", 80);
		s.printInfo();
	}
	

}
