package javaprj.day12.업캐스팅다운캐스팅;

public class Main {

	public static void main(String[] args) {
		
		//상속관계에서 업캐스팅(upcasting), 다운캐스팅(downcasting) 연습하기
		
		Cat cat; //cat : 변수(참조형변수)  
				 //Cat : 자료형 type,  참조형변수가 가르키는 대상을 해석하는 해석의도구
		cat = new Cat();
		
		Dog dog = null;
		dog = new Dog();
		
		cat.찾다();
		cat.쥐를잡는다();
		
		
		dog.찾다();
		dog.집을지킨다();
		
		 
		//Animal  상속관계를 가지고 있다면
		//cat, dog 객체로 부모 type 변수에 저장하고 사용할 수 있다
		
		Animal a1 = cat;  //업캐스팅 , 자동형변환해줌(고양이를 동물이라고 해석하기)
		
		//a1으로 사용을 하면 cat의 고유의 기능을 쓸 수 있나?
		
		a1.찾다(); //cat의 고유기능을 사용할 수 없다(실체가 바뀌지는 않는다, new된 실체, 인스턴스는 변하지 않는다)
		
		//고양이의 고유기능을 사용하고 싶다면
		//Animal로 해석한 것을 다시 자식타입으로 바꿔야 한다!! => 다운캐스팅
		
		//다운캐스팅 하기
		((Cat)a1).쥐를잡는다();
		
		
		Cat cat2 = (Cat) a1;
		
		cat2.쥐를잡는다();
		cat2.찾다();
	}

}
