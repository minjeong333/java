package javaprj.day13.equals;

public class Main {

	public static void main(String[] args) {
		
		Score s = new Score("김태준", 100, 90);
		Score s2 = new Score("김태준", 100, 98);
		
		//이 두 객체의 비교
		//Object -> equals()매서드가 존재한다 : 주소값을 비교한다
		
		//?다르다  이 두 객체는 다르다고 나온다 (∵ 생성된 객체의 주소를 비교하니까)
		//equals를 오버라이드 해야 한다 !!
		
		
		if(s.equals(s2)) {
			System.out.println("두 객체는 같다");
		}else {
			System.out.println("두 객체는 같지 않다");
		}
	}

}
