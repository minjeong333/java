package javaprj.day12.다형성;

public class Main {

	public static void main(String[] args) {
		
		Animal a1 = new Cat();
		Animal a2 = new Dog();
		
		
		Animal[] arr = new Animal[2];
		arr[0] = new Cat();
		arr[1] = new Dog();

		
		//animal 짖어라
		for(int i=0; i<arr.length; i++) {
			arr[i].짖는다();  //결과 : 동물은 짖는다 (∵ 부모의 기능을 그대로 상속받았으니까)
		}
		
		//Animal 타입(동일한 타입) -> 짖어 매서드 호출 시 -- 다르게 동작하게 하기
		for(int i=0; i<arr.length; i++) {
			arr[i].짖는다();  // 결과: 야옹~ 멍멍~
		}
		
		/*
		 1. 상속 ok
		 2. 부모의 매서드를 재정의 하기 (부모의 매서드를 재정의 한다? 부모의 매서드가 사라지는 게 X) 
		 	부모의 짖는다 도 있고 자식의 재성의한 짖는다도 있는 것이다
		 	오버라이드한 매서드에 한해서 부모로 다뤄도(부모로 해석해도) 자식의 오버라이드한 매서드가 우선권을 가진다. 
		 */
	}

}
