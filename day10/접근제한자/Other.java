package javaprj.day10.접근제한자;

public class Other {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A(); // A type (A Class)로 객체 만들기 => 변수 만들기

		//a.a=10; private 외부에서 접근 불가
		a.b=10; //public 외부에서 ok
		a.c=5; //A와 other는 같은 폴더, 즉 같은 패키지이므로 접근가능
	}

}
