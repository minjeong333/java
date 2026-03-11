package day_04;

public class 제어문_dowhile {

	public static void main(String[] args) {

		// 1~10가지의 합 구하기
		//do~while 사용하기
		
		int sum=0;
		int i=0;
		
		do {
			i=i+1;
			sum = sum+i;
		}while(i<10);
	
		System.out.println(sum);
	}

}
