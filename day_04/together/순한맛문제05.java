package together;

import java.util.Scanner;

public class 순한맛문제05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		int avg = 0;
		final int MAX=10;
		
		for(int i=1; i<=MAX; i++) {
			num = sc.nextInt();
			sum = sum + num;
		}
		avg = sum/MAX;
		
		System.out.println(sum);
		System.out.println(avg);
	}

}
