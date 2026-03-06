package javaprj.day03;

public class 순한맛01 {

	public static void main(String[] args) {
		
		//Q. 1+2+3+...+99의 홀수의 합
		int sum=0;
		
		for(int i=1; i<=99; i++) {
			sum=sum+i;
			i= i+2;
		}
		System.out.println(sum);
	}

}
