package java쪽지시험준비.객체배열과상속의조화;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<>();
		
		//1.객체를 생성해서 리스트에 추가하기
		list.add(new Student());
		list.add(new Teacher());
		
		//2.반복문을 돌며 work()호출
		for(int i=0; i<list.size(); i++) {
			//list.get(i); -> 이렇게만 하면 객체를 꺼내기만 함. work()는 실행되지 않음
			list.get(i).work();
		}
	}

}
