package javaprj.day13.ArrayList;

public class GMain {

	public static void main(String[] args) {
		
		//제네릭은
		//컴파일타임에 타입을 체크해준다
		//다운캐스팅의 불편함을 해소해준다
		
		//레거시와의 차이점
		//레거시는 배열의 크기가 정해짐 + 모든 타입을 다 받음
		//제너릭은 배열의 크기가 정해지지 않음 + <>를 통해서 <>안에 있는 타입만 받음 => 다운캐스팅 할 필요가 없음
		
		//<Score> : Score 타입만 받겠다
		GList<Score> list = new GList<Score>();
		list.add(new Score("박세인",90,99));
		list.add(new Score("여도현",80,89));
		list.add(new Score("이용찬",91,99));
		//list.add(a); //Score 타입이 아니므로 오류가 남
		
		for(int i=0; i<list.size(); i++) {
			Score s = list.get(i);
			s.printInfo();
		}
	}

}
