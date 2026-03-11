package javaprj.day06;

public class 배열2차원_행의개수가다른 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3*3 차원배열
		int[][]  arr= new int[][] {
			
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		
		
		
		arr[0][0]= 11;
		
		
		
		for(  int i=0 ; i< arr.length ; i++) {		
			
			//i=0
			for( int j=0;  j < arr[i].length ; j++) {    //j   0 1 2
 				
				System.out.print(  arr[i][j] +"  ");
			}
			
			System.out.println();
			
		}
		

		//행의 개수가 다른 2차원배열 만들기
		//3행, 각 행의 열의 개수 다르게 하기
		
		int[][] arr2 = new int[3][];  
		arr2[0]= new int[3];  //첫번재 행은   3열
		arr2[1]= new int[5]; // 두번째 행은   5열
		arr2[2] = new int[2];  //세번재 행은 2열
		
		
		//1행 (0행)
		arr2[0][0]=2;
		arr2[0][1]=4;
		arr2[0][2]=6; 
		
		//2행(1행)
		arr2[1][0]=8;
		arr2[1][1]=9;
		arr2[1][2]=10;
		arr2[1][3]=11;
		arr2[1][4]=12; 
		//3행
		
		arr2[2][0]=13;
		arr2[2][1]=14;
		
		
		//반복문으로 출력하기
		for( int i=0; i < arr2.length  ; i++) {
			
			
			for( int j=0; j< arr2[i].length;  j++ ) {   // 3   5   2
				
				System.out.print(arr2[i][j] +"   ");			
				
			}	
			
			
			System.out.println();
			
		}
		
		 
	 
		
		
		
		
		
		
		
		
	 
	}

}
