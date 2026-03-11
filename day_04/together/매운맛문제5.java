package together;

public class 매운맛문제5 {

	public static void main(String[] args) {
		int sum=0;
		int a =2;
		int r =3;
		
		
		for(int i=1; i<=7; i++) {
			sum=sum+a;
			a=a*r;
			System.out.print(sum + ", ");
		}
		

	}

}
