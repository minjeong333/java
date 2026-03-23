package javaprj.day15.선택정렬;

public class Score정렬하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Score[] scores  = new Score[5];
		
		scores[0] = new Score("김민경" , 100,80);
		scores[1] = new Score("송주창" , 70,85);
		scores[2] = new Score("손영석" , 99,79);
		scores[3] = new Score("나해수" , 85,70);
		scores[4] = new Score("김건희" , 88,89);
		
		
		
		for( Score s  : scores) {
			
			System.out.println( s.toString());
			//System.out.println( s);
		}
		
		
		
		//정렬하기 
		
		for( int i=0; i< scores.length-1; i++) {
			
			for( int j=i+1 ; j< scores.length; j++) {
				
				if( scores[i].kor >   scores[j].kor) {
					
					Score tmp;
					tmp= scores[i];
					scores[i] = scores[j];
					scores[j]= tmp;
				}
			}			
		}
		
		
		//
		System.out.println("\n  국어 정렬후 ==>"); 

		for( Score s  : scores) {
			
			System.out.println( s.toString());
			//System.out.println( s);
		}
		
		
		
		
		// 영어점수  정렬하기 
		
		for( int i=0; i< scores.length-1; i++) {
			
			for( int j=i+1 ; j< scores.length; j++) {
				
				if( scores[i].eng >   scores[j].eng) {
					
					Score tmp;
					tmp= scores[i];
					scores[i] = scores[j];
					scores[j]= tmp;
				}
			}			
		}
		
		
		System.out.println("\n  영어 정렬후 ==>"); 
		for( Score s  : scores) {
			
			System.out.println( s.toString());
			//System.out.println( s);
		}
		

	}

}
