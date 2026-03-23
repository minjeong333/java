package javaprj.day15.선택정렬;

import java.util.Arrays;

import javaprj.day15.myarrays.Score;

public class Arrays라이브러리사용하기 {

	public static void main(String[] args) {
		
		Score[] scores = new Score[5];

		scores[0] = new Score("김민경", 100, 90);
		scores[1] = new Score("송주창", 70, 90);
		scores[2] = new Score("손영석", 89, 99);
		scores[3] = new Score("나해수", 85, 70);
		scores[4] = new Score("장해든", 88, 89);

		Arrays.sort(scores); // 원래 Score타입인데 Object타입으로 읽겠다(업캐스팅 하겠다)
							 // 결과 찍어보면 오류가 남
		
		
		//객체의 요소가 Comparable을 구현하지 않으면 정렬이 될 수 없다.
		//라이브러리는 Comparable을 구현한 객체만큼 정렬해 주기 때문이다
		//객체의 요소가 Comparable을 구현해야 한다
		//즉 정렬의 기준을 책임져야 한다
		//이유는 라이브러리를 만든 사람이 정렬의 기준을 절대 알 수 없기 때문이다(인터페이스를 사용함)
		
		
		for (Score s : scores) {
			// System.out.println(s.toString());
			System.out.println(s);
		}
		
		
		//오류내용
		//javaprj.day15.선택정렬.Score cannot be cast to class java.lang.Comparable
		
		
		//Score Comparable
	}

}
