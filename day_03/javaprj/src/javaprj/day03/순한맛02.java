package javaprj.day03;

public class 순한맛02 {

	public static void main(String[] args) {
		
		int i =0;
		final int MAX=100;
		int sum=0;
			
		for(int j=1; j<=MAX; j++) {
		
			i=i+j;
			sum=sum+j;
			i++;
		}
		System.out.println(sum);

	}

}
