package javaprj.day06;

public class 가장높은온도구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//                          0    1   2  3    4    5  6
		 int[] temperatures   =  { 33 , 35, 32 ,35  ,36 ,35 ,34  }  ;
		 
		 //출력 :가장높은 온도 : max   :35
		 
		 int max=temperatures[0];  //초기값은  배열의 첫번째값으로 초기화, 배열의 값의 범위 가장 작은 값
		 
		 
		 
		 //
		 
		 /*
		 if(temperatures[1] > max ) {
			 max =  temperatures[1] ;			 
		 }
		 
	
		 if(temperatures[2] > max ) {
			 max =  temperatures[2] ;			 
		 }	
		 
		 
		 if(temperatures[3] > max ) {
			 max =  temperatures[3] ;			 
		 }
		 
		 if(temperatures[4] > max ) {
			 max =  temperatures[4] ;			 
		 }
		 if(temperatures[5] > max ) {
			 max =  temperatures[5] ;			 
		 }
		 
		 if(temperatures[6] > max ) {
			 max =  temperatures[6] ;			 
		 }
		 
		 */
		 
		 //i :반복제어,  배열의 index  두 가지 역할로 사용됨 
		 
		 for( int i=1 ; i < temperatures.length; i++) {
			 
			 System.out.print( "i="+ i );
			 System.out.print( "   temperatures["+i+"] ="+temperatures[i] );
			 System.out.println("  max="+ max );
			 
			 if(temperatures[i] > max ) {
				 
				 System.out.println("현재max 보다 크다면"+ temperatures[i]    + "   "  +   max);
				 max =  temperatures[i] ;			 
			 }
		 }
		 
		  
		 	  
		 
		 System.out.println( max );
		 		 
		 
		  
		   
		 
		 
		 
		 
			
	}

}
