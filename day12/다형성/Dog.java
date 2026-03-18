package javaprj.day12.다형성;

public class Dog extends Animal{

	public void 집을지킨다() {
		System.out.println("집을 지킨다");
	}
	
	@Override //부모의 매서드를 재정의할게
	public void 짖는다() {
		System.out.println("멍멍");
	}
}
