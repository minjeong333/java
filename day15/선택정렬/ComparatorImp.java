package javaprj.day15.선택정렬;

import java.util.Comparator;

import javaprj.day15.myarrays.Score;

public class ComparatorImp implements Comparator{

	@Override								   // 앞 객체 (기준), 뒤 객체(비교대상)
	public int compare(Object o1, Object o2) { // 두 객체를 제공할테니 객체의 속성값을 선택해서 그 결과를 int값으로 반환하기
											   // 기준이 크면 양수 전달, 작으면 음수 전달
											   // => 정렬라이브러리에서는 양수가 전달되면 두 객체의 자리를 교환한다.(정렬이 일어난다)
		
		
		
		//다운캐스팅
		
		Score s1=(Score)o1;
		Score s2=(Score)o2;
		
		return 0;
		
		//return s1.eng - s2.eng;  // if문, 삼항연산자
	}
	
}
