package day_04;

public class 손영석매운맛6 {

	public static void main(String[] args) {
		
		int n=5; //몇 번째 항까지 구할 것인지 저장할 변수
		
		//출력
		double sN=0;  //전체(분수항의 합계)
		 
		//처리
		//분모
		int nPact=1;
		//항
		double aN;
		int sign =-1;
		
		for(int i=1; i<=n; i++) {
			//분모
			nPact = nPact*i;
			
			sign = -sign;  // sign  = sign *-1;
			//항
			aN = (i/(double)nPact)*sign;   // 부호가 있는 항
			//누적
			
			sN = sN + aN;
		}
		
		System.out.println(sN);
	}

}
