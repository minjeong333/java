package javaprj.day08;

public class 문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kor=90, eng=80, math=100;
		//call 
		//성적 출력하기
		printScore(kor, eng, math);
		
		int[] likesNumber= new int[] {1,3,11};
		//call 
		//좋아하는 수 출력하기
		printLikesNumber(likesNumber);
	}
	
	//caLL by value
	//caLL by reference
	public static void printScore(int kor, int eng, int math) {
		//kor=100; main에 있는 kor의 값이 바뀌지 않음 
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
	}
	
	public static void printLikesNumber(int[] likesNumber) {
		//likesNumber[1]=0; main에 있는 배열의 숫자3이 0으로 바뀜
		for(int i=0; i<likesNumber[i]; i++) {
			System.out.println(likesNumber[i]);
		}
	}

}
