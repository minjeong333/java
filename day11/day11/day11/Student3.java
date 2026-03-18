package javaprj.day11;

public class Student3 {

	
	String name;
	int kor;
	int eng;
	double avg;
	char grade;
	 
 
	public Student3() {
		
	}
	
	public Student3(String name, int kor, int eng) {
		this.name= name;
		this.kor  = kor;
		this.eng= eng;
	}
		
	
	 
	public String toString() {
		return this.name+  this.kor + "  " + this.eng  + "  " +  this.avg + "  " +this.grade;
	}
 
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
	
	
	
	//
	public void  setKor(int kor) {
		this.kor  = kor;
	}
	public void setEng( int eng) {
		this.eng = eng;
	}
	
	
	//평균구하기
	private void calcAvg() {
		int total = this.kor+ this.eng;
		this.avg = total/2.0;
	}
	
	
	//학점구하기
	public  void calcGrade() {
		calcAvg();
		
		if( this.avg>=90) {
			this.grade ='A';
		}else if( this.avg>=80) {
			this.grade='B';
		}else if( this.avg>=70) {
			this.grade='C';			
		}else {
			this.grade='F';
		}
	}
	
	 
	 
	
}
