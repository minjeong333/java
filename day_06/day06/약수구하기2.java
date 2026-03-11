package javaprj.day06;

public class 약수구하기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 입력:어떤 수   su
		//출력:약수배열   약수(su) 
		
		
		
		int su=6;
		int[] 약수 = new int[su];
		//
		//
		int index=0; //약수발견시 카운트 증가  =>약수배열의 index 
		
		
		/*
		 index=4
		 
		 약수
		 0    1    2   3   4   5  
		 1    2    3   6
		  
		  
		 i=1
		 6%1 ==> 나머지 0            
		 6%2 ==> 나머지 0
		 6%3 ==> 나머지 0
		 6%4 ==> 나머지 2
		 6%5 ==> 나머지 1
		 6%6 ==> 나머지 0
		 
		 
		 
		 */
		
		for( int i=1; i<=su; i++) {     // i=> 1~su   (반복제어, 나누는 수(divisor) 역할)
			if( su % i==0) {
				약수[index] = i;
				index++;
			}
		}
		
		
		//약수 출력하기 
		for( int i=0 ; i< index; i++) {
			System.out.println(약수[i]);
		}
		
		
		
		
		

	}

}
