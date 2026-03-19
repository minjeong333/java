package javaprj.day13.인터페이스;

public class 인터페이스란 {

	public static void main(String[] args) {
		
		/*
		 추상매서드로만 구성된 클래스를 인터페이스라고 한다.
		 키워드 : interface 
		 
		 인터페이스 상속은 extends가 아니라 implements 사용
		 인터페이스 상속은 여러개 상속할 수 있다. 여러 개 구현할 수 있다(extends와의 차이점)
		 ex) runable 기능으로 묶으면 전혀 관련이 없어 보이는 사람, 강아지, 말, 비둘기를 묶을 수 있다. 
		 	(∵ 객체 혹은 클래스의 종류가 아니라 기능으로 묶는 거니까)
		 같은 맥락으로 봤을 때 인터페이스 상속은 여러개를 구현할 수 있다는 말이 이해가 될 수 있다. 
		 ex) runable, flyable 이렇게 2가지로 인터페이스를 만들게 되면
		 	runable을 인터페이스 받는 클래스는 사람, 강아지, 말, 비둘기 = runable을 실행하면 4가지 클래스를 한 번에 처리할 수 있음
		 	flyable을 인터페이스 받는 클래스는 비둘기 
		 	
		 	즉, 비둘기는 runable과 flyable 총 2개의 인터페이스를 가지게 된다. 
		 
		 */

	}

}
