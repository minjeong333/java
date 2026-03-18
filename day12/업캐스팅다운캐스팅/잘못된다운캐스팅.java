package javaprj.day12.업캐스팅다운캐스팅;

public class 잘못된다운캐스팅 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal = new Animal();
		Cat cat = new Cat();
		
		//부모:Animal
		//자식:Dog
		
		//업캐스팅
		//다운캐스팅
		
		//다운캐스팅 시도
		//올바른 다운캐스팅인가?
		Cat aa = (Cat)animal;
		
		aa.쥐를잡는다(); // 올바르게 동작하는 것이 맞나?
		aa.찾다();
		
	}

}
