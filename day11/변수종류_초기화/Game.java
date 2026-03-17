package javaprj.day11.변수종류_초기화;

public class Game {
	String name;
	int price;
	static int cnt;
	
	//생성자
	
	//인스턴스변수 초기화 블럭
	//생성자보다 먼저 동작
	//생성자에서 하는 공통 작업
	{
		cnt++;
	}
	
	public Game() {
		
	}
	
	public Game(String name, int price) {
		//객체가 생성될 때마다 cnt추가
		//cnt++;
		
		this.name=name;
		this.price=price;
	}
	
	//toString
	public String toString() {
		return name + " " + price;
	}
	
	public static void printCount() {
		System.out.println(cnt);
	} 
}
