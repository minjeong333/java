package javaprj.day10.객체배열;

public class NullpointException나는이유 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//성적데이터 저장할 배열 만들기
		//객체배열만들기
		
		//int[] a = new int[3]; 참조형 변수의 기본값은 null
			
		Score[] arr = new Score[3];
		
		//1. 성적객체가 만들어진 것이 아니다.
		// => 성적객체를 참조하는 참조형변수가 배열로 만들어진 것이다
		// => 참조형변수가 배열로 만들어지면 참조형 변수의 기본값인 null로 초기화됨
		//arr[0].printlnfo(); //실행하면 NullpointerException
		
		arr[0] = new Score(1, 90, 50, 30);
		arr[1] = new Score(2, 90, 90, 99);
		arr[2] = new Score(3, 99, 50, 100);
		
		arr[0].printlnfo();
		arr[1].printlnfo();
		arr[2].printlnfo();
	}

}
