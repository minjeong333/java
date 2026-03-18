package javaprj.day12.다형성;

public class Cat extends Animal{

	//
	public void 쥐를잡는다() {
		System.out.println("쥐를 잡는다");
	}
	
	@Override //부모의 매서드를 재정의할게
	public void 짖는다() {
		System.out.println("야옹~");
	}
}
