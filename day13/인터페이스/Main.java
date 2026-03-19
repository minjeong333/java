package javaprj.day13.인터페이스;

public class Main {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		Cook cook = new Cook();
		AcornStudent s = new AcornStudent();
		
		
		
		
		//전투가능한 인터페이스 상속받았음
		//부모로 전추가능한을 사용할 수 있음
		
		전투가능한[] list = new 전투가능한[] {cat, dog, cook, s};
		//전투가능한[] list = new 전투가능한[4];
		//list[0]=cat;
		//list[1]=dog;
		//list[2]=cook;
		//list[3]=s;
		
		
		//각기 다른 타입의 객체를 같은 부모타입으로 다루면서 하나의 메세지(동일한 매서드 호출)을 하면서 고유의 동작을 일으킨다 
		for(int i=0; i<list.length; i++) {
			list[i].싸운다();
		}
	}

}
