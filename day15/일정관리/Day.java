package javaprj.day15.일정관리;


//일정정보 한 개를 저장할 수 있는 타입을 설계
//public class Day extends Object 

public class Day {

	private String name;
	private String time;

	//생성자
	public Day(String name, String time) {
		//super(); //표시는 안되어있지만 부모인 Object클래스를 상속받았기 때문
		this.name = name;
		this.time = time;
	}
	
	//기본생성자
	public Day() {
		
	}
	
	
	
	//매서드
	//현재 객체의 정보를 올바르게 제공
	//toString을 오바리이드
	
	@Override
	public String toString() {
		return "Day [name=" + name + ", time=" + time + "]";
	}

	
	//변수의 값을 가져오거나 변화시키겠다!
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	
	
}

	
