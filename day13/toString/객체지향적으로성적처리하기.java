package javaprj.day13.toString;

public class 객체지향적으로성적처리하기 {

	public static void main(String[] args) {


		Score s = new Score("홍길동", 100, 50); 
		System.out.println(s);
		// System.out.println(s.toString());

		
		Object o = s; //업캐스팅 ok Object -> Score
		
		System.out.println(o.toString()); //출력의 결과
		System.out.println(o); //출력의 결과
		
		//Object = toString()
		//Score = toString() 오버라이드(무조건 부모의 매서드와 완벽히 일치) @override ()체크해주는 역할
		
		
		//Object 로 다뤄도 실체생성된 객체의 toString()이 동작
		
		
	}

}
