package javaprj.day13.ArrayList;

public class OlistMain {

	public static void main(String[] args) {
		
		//레거시
		//배열의 크기가 정해짐 
		//모든 타입을 다 받음 => 다운캐스팅이 필수

		OList list = new OList();
		list.add(new Score("박세인",90,99));
		list.add(new Score("여도현",80,89));
		list.add(new Score("이용찬",91,99));

		
		for(int i=0; i<list.size(); i++) {
			Object o =list.get(i);
			System.out.println(o); //
			
			//score 객체의 고유매서드 사용하려면 ==> 다운캐스팅 필수
			
			((Score)o).printInfo();
		}
	}

}
