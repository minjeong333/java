package javaprj.day03;

public class 연산자_증감연산자_10까지합2 {

	public static void main(String[] args) {


		//while 구하기 1~10
		//1  2  3  4  5  6  7  8  9  10  => 순번 
		//1  2  3  4  5  6  7  8  9  10  => 수 (항)
		
		
		//처리 : n : 항 이자 반복제어변수
		//출력 : 항의 합계 : sum
		
		
		int n=0; 
		int sum=0;
	
		while(n++<10) { 
			sum=sum+n;
		}
	
		System.out.println(sum);
	
		/*
		 *  0        0    : 초기값
		 *  n  n++  sum          n++ < 10
		 *  1   0    1            0  < 10
		 *  2   1    3            1  < 10
		 *  3   2    6            2  < 10
		 *  4   3    10           3  < 10
		 */
	
		
		/*
		 *  0        0    : 초기값
		 *  n  ++n  sum          ++n < 10
		 *  1   1    1            1  < 10
		 *  2   2    3            2  < 10
		 *  3   3    6            3  < 10
		 *  4   4    10           4  < 10
		 */
	
	
	}

}
