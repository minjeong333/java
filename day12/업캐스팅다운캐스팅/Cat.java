package javaprj.day12.업캐스팅다운캐스팅;


//상속 extends 키워드 사용
//물려주는쪽 : 부모클래스 (super 클래스)
//물려받는쪽 : 자식클래스 (sub 클래스)

//자식클래스는 부모의 모든 것(속성 + 매서드)을 물려받는다 !!

public class Cat extends Animal{
	
	//고유동작 기능 추가
	public void 쥐를잡는다() {
		System.out.println("쥐를 잡는다");
	}

}
