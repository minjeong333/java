package javaprj.day13.wrapper;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//기본자료형
		int a;
		char b;
		double c;
		boolean d;
		
		//자바는 객체지향언어
		//자바의 라이브러리 : 자바가 제공하는 기능에서는 대부분 객체를 매개변수로 받는다
	
		//기본형을 객체로 만들어주는 Wrapper를 제공한다
		//오토박싱 int -> Integer
		//오토언박싱 Integer -> int
		
		//기본자료형 -> 객체로 다룰 필요가 있다
		//기본자료형을 객체로 만들어주는 Wrapper클래스가 제공 되고 있다
		//int => Integer
		//char => Character
		//boolean => Boolean
		//double => Double
		
		
		// ArrayList에 값을 받을 때에는 !!객체!!만 받을 수 있음
		// ∴ 기본형을 매개변수에 넣게 되면 !!객체!!로 바꿔주는 과정이 필요함 = Wrapper
		// 즉 자동으로 오토박싱이 일어남
		// 그리고 계산 혹은 결과를 도출해낼 때 다시 자동으로 오토언박싱이 일어나서 기본형으로 처리가 됨.
		
		ArrayList list = new ArrayList();
		list.add(3); //내부적으로 오토박싱이 일어남 int -> Integer
		list.add(new Integer(5));
		list.add(Integer.valueOf(10));
		
		
		for(int i=0; i<list.size(); i++) {
			Object oo = list.get(i);  //여기서 Object로 받는 것도 최상위클래스는 Object라고 보기 때문임
			System.out.println(oo);
		}
		
		
		
	
	
	}

}
