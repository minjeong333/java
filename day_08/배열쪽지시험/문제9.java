package 배열쪽지시험;

public class 문제9 {

	public static void main(String[] args) {
		int[][]arr= {
				{2,4,6},
				{8,10,12},
				{14,16,18}
		};

		//전체 합 구하기
		int sum=0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				sum=sum+arr[i][j];
			}
		}
		System.out.println("전체 합은 " + sum );
		System.out.println(" ");

		//각 행의 합계 구하기
		System.out.println("각 행의 합계 구하기");
		
		//방법1
		System.out.println("행의 합계 구하기 방법 1");
		
		int lineSum0=0; int lineSum1=0; int lineSum2=0;
		
		for (int i=0; i<3; i++) {
			lineSum0=lineSum0+arr[0][i];
			lineSum1=lineSum1+arr[1][i];
			lineSum2=lineSum2+arr[2][i];
		}
		System.out.println("0행의 합은 " + lineSum0);
		System.out.println("1행의 합은 " + lineSum1);
		System.out.println("2행의 합은 " + lineSum2);
		System.out.println(" ");
		
		
		//방법2(방법1과의 차이점은 초기화를 반복문 밖에서 하느냐 안에서 하느냐에 따라 달라짐)
		System.out.println("행의 합계 구하기 방법 2");
		
		for(int i=0; i<3; i++) {
			int lineSum=0;
			for(int j=0; j<3; j++) {
				lineSum=lineSum+arr[i][j];
			}
			System.out.println(i + "행의 합은 " + lineSum);	
		}		
		
	}
  }

