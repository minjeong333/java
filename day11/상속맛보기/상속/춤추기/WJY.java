package javaprj.day11.상속맛보기.상속.춤추기;

public class WJY   extends Acorn{

	
//상속받은 부모의 매서드 재정의하기
//부모로 다뤄도 자식의 오버라이드한 매서드가 우선권을 가짐
	@Override
	public void dance() {
		 System.out.println( "주연이는 부채춤을 춘다");
	}
}
