package javaprj.day10.접근제한자2;

import javaprj.day10.접근제한자.A;

public class Other2 {

	public static void main(String[] args) {

		//클래스이름 => 패키지를 포함한다
		//다른패키지의 클래스를 사용하고 싶을 때
		//패키지 전체를 명시하는 방법
		//import하는 방법
		
		javaprj.day10.접근제한자.A b = new javaprj.day10.접근제한자.A();
		A a = new A();
		
		//a.a=5; private이라서 존재는 하나 접근 불가능
		  a.b=10; //public  접근 가능
		//a.c=10; //default  같은 패키지에서만 접근 가능 ∴지금은 접근 불가

	}

}
