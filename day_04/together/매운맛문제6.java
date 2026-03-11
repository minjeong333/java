package together;

public class 매운맛문제6 {

	public static void main(String[] args) {
		
		double sum=0.0;
		
		for(int i=1; i<=10; i++) {
			double factorial = 1.0;
			for(int j=1; j<=i; j++) {
				factorial*=j; // factorial = factorial * j
			}
			
			double term = i/factorial;
			
			if(i%2==1) {
				 sum+=term; // sum=sum+term	 
			}else {
				sum-=term;
			}
		}

		System.out.println(sum);
	}

}
