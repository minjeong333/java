package javaprj.day13.toString;


//학생성적정보를 만들어내기 위한 틀 작성 (객체를 만들기 위한 틀)
//속성+매서드 => 객체
//메서드	    => 객체

public class Score {
	String name;
	int kor;
	int eng;
	double avg;
	
	//기본생성자
	public Score() {}
	
	//생성자
	public Score(String name, int kor, int eng) { //자식의 생성자는 무조건 부모의 생성자가 호출된다.
		//super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
		//
		calc();
	}

	private void calc() {
		int total = kor+eng;
		this.avg=total/2.0;
	}
	
	//toString() 오버라이드  -- 오버라이드 하지 않으면 javaprj.day13.object.A@75412c2fA 이런 거 나옴
	//						 =부모의 매서드가 그대로 나옴
	@Override
	public String toString() {
		
		//평균을 여기서 구하는 건 추천하지 않음
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", avg=" + avg + "]";
	}
	
	
	
	

	
}
