package javaprj.day15.선택정렬;

public class Cat {

	String name;
	int age;
	String  성별;
	int  근육량;
	
	public Cat() {
		// TODO Auto-generated constructor stub
	}
	public Cat(String name, int age, String 성별, int 근육량) {
		super();
		this.name = name;
		this.age = age;
		this.성별 = 성별;
		this.근육량 = 근육량;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", 성별=" + 성별 + ", 근육량=" + 근육량 + "]";
	} 
	
	
	//
	public void  운동하기() { //객체의 정보가 전달됨  => this
	//	근육량 += 10;
		this.근육량  =  this.근육량 +10;//위와 같은 코드
	}
	
}
