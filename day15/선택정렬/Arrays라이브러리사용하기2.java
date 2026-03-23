package javaprj.day15.선택정렬;

import java.util.Arrays;

import javaprj.day15.myarrays.Score;

public class Arrays라이브러리사용하기2 {

	public static void main(String[] args) {

		Score[] scores = new Score[5];

		scores[0] = new Score("김민경", 100, 90);
		scores[1] = new Score("송주창", 70, 90);
		scores[2] = new Score("손영석", 89, 99);
		scores[3] = new Score("나해수", 85, 70);
		scores[4] = new Score("장해든", 88, 89);

		for (Score s : scores) {
			// System.out.println(s.toString());
			System.out.println(s);
		}

		// 정렬하기

		//					Comparator c   ->  인터페이스
		// Arrays.sort(scores, null);

		Arrays.sort(scores, new ComparatorImp());

	}

}
