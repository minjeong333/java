package javaprj.day10.접근제한자2;

public class Main {

	public static void main(String[] args) {

					   				//javaprj.day10.접근제한자.A
		
		//1) //같은패키지라면 패키지명 생략가능
		javaprj.day10.접근제한자.A a = new javaprj.day10.접근제한자.A(); //A 클래스 이룸운 패키지를 포함한다
		
		//2) //다른패키지라면 직접명시하거나 import를 해야함
		//A b = new A(); 
	}

}
