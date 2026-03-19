package javaprj.day13.ArrayList;

import java.util.ArrayList;

public class Ex01 {

	public static void main(String[] args) {

		//객체배열 대신에 ArrayList 사용하기
		
		//순서가 있다
		//중복된 데이터를 저장할 수 있다.
		//배열과 같은구조라고 생각하면된다
		
		ArrayList list = new ArrayList();
		list.add(new Score("김민경",100,100));  // Object로 저장
		list.add(new Score("송주창",90,100));
		list.add(new Score("정철진",80,90));
		list.add(new Score("김재민",100,90));
		//list.add(3);

		//
		for(int i=0; i<list.size(); i++) { //size 쓰기
			Object item = list.get(i);	//Object로 꺼내짐
			System.out.println(item);   //다형성
			
			//다운캐스팅=>Score 객체의 고유의 기능을 사용하기 위해서는 다운캐스팅을 해야한다
			Score itemScore = (Score)item;
			
			itemScore.printInfo();
			
			
		}
	}

}
