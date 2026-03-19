package javaprj.day13.ArrayList;

import java.util.ArrayList;

public class Ex02 {

	public static void main(String[] args) {

		ArrayList<Score> list = new ArrayList<Score>();
		list.add(new Score("김민경",100,100));  // Object로 저장
		list.add(new Score("송주창",90,100));
		list.add(new Score("정철진",80,90));
		list.add(new Score("김재민",100,90));
		//list.add(3); //스코어가 아니면 오류가 남
		
		//
		
		for(int i=0; i<list.size(); i++) {
			Score score = list.get(i);
			System.out.println(score.toString());
			score.printInfo();
		}

	}

}
