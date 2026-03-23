package javaprj.day15.일정관리;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		
		//일정을 저장할 수 있는 변수를 만들기
		Day day;
		day = new Day("자바공부하기", "오후 8시"); //생성자 new할 때 단 한 번
	
		//일정조회하기
//		System.out.println(day);
//		System.out.println(day.toString());
		
		//일정변경
		day.setName("자바 인터페이스 공부하기");
		day.setTime("오후 8시 30분");
		
		//변경한 일정 조회하기
//		System.out.println(day);
//		System.out.println(day.toString());
		
		
		
		
		//***일정이 여러개라면?
		//순서, 중복허용
		//가변길이배열처럼 사용하면 됨
		//add, get(index), remove, 
		ArrayList<Day> days = new ArrayList<>();
		
		//등록
		Day day1 = new Day("myArrays 연습 1억코드", "오후 8시");
		days.add(day1);
		
		Day day2 = new Day("운동", "오후 9시");
		days.add(day2);
		
		//조회하기
		for(int i=0; i<days.size(); i++) {
			Day item = days.get(i);
			System.out.println(item);
		}
		
		//변경하기
		Day updateDay = days.get(1);
		updateDay.setName("필라테스 운동");
		updateDay.setTime("오후 9시 30분");
		
		//조회하기
		for(int i=0; i<days.size(); i++) {
			Day item = days.get(i);
			System.out.println(item);
		}
		
		//삭제(두번재 요소 삭제하기)
		days.remove(1);
		
	
		System.out.println("===========삭제후=================");
		//조회하기
		for(int i=0; i<days.size(); i++) {
			Day item = days.get(i);
			System.out.println(item);
		}
		
		
	}

}
