package javaprj.day11;

public class Student2 {

	// 속성
	String name;
	int kor;
	int eng;
	double avg;
	char grade;
	
	//생성자  => 변수(객체)의 값 초기화 담당
	//toString() : 현재 객체의 정보를 하나의 문자열로 제공하기
	
	//
	// getter(속성의 값을 반환) : 작성법 규칙 : get속성명  get + 속성명 첫글자대문자규칙  getName, getKor ...  
	// setter(속성의 값을 변경) : 작성법 규칙 : set속성명  set + 속성명 첫글자대문자규칙  setName, setKor ...
		//setter는 변경이 필요한 속성에 한해서 만든다.
	
	//기본생성자
	public Student2() {
		
	}
	
	//생성자
	public Student2(String name, int kor, int eng) {
		this.name=name;	
		this.kor=kor;
		this.eng=eng;
	}
	
	//toString : 객체의 정보를 하나의 문자열로 제공하기
	public String toString() {
		return this.name = this.kor + " " + this.eng + " " + this.avg + " " + this.grade;
	}
	
	//getter만들기
	public String getName() {
		return this.name;
	}
	
	public int getKor() {
		return this.kor;
	}
	
	public int getEng() {
		return this.eng;
	}

	public double getAvg() {
		return this.avg;
	}
	
	public double getGrade() {
		return this.grade;
	}
	
	
	// setter만들기 
	public void setKor(int kor) { //setter는 새로 입력값을 받음 = 반환이 필요없음 = void 쓰기
		this.kor=kor;
	}
	public void setEng(int eng) {
		this.eng=eng;
	}
	
	
	//평균구하기
	public void calcAvg() {
		int total = this.kor + this.eng;
		this.avg = total/2.0;
	}
	
	//학점구하기
	public void calcGrade() {
		if(this.avg>=90) {
			this.grade='A';
		}else if(this.avg>=80) {
			this.grade='B';
		}else if(this.avg>=70) {
			this.grade='C';
		}else {
			this.grade='F';
		}
	}

}
