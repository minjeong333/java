package javaprj.day11.스태틱객체매서드;

public class AMain {

	public static void main(String[] args) {

		//static매서드 사용법
		A.매서드1();
		
		int result = Math.abs(-2);
		System.out.println(result);
		
		double result2 = Math.random();  //클래스명.매서드()
		System.out.println(result2);
	}

}
