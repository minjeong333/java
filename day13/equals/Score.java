package javaprj.day13.equals;

public class Score {
	String name;
	int kor;
	int eng;

	public Score() {}
	
	//생성자
	public Score(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}

	//toString() 재정의
	@Override  //재정의가 올바른지, 부모의 매서드가 존재하는게 맞는지 확인해 주는 역할
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + "]";
	}

	//equals 오버라이드 하기
	public boolean equals(Object obj) { //업캐스팅되어 있음. 성적정보에 대한 것을 알 수 없다
		//라이브러리는 대부분 Object타입을 대상으로 한다.
		
		boolean result = false;
		
		//instanceof로 확인하기
		Score other = (Score)obj; //다운캐스팅
		if(this.kor == other.kor && this.eng == other.eng) {
			result = true; 
		}
		
		return result;
	}
	
	
	
}
