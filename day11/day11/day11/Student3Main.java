package javaprj.day11;

public class Student3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Student3  s1= new Student3( "박세인" , 100,90); 
		Student3  s2= new Student3( "조아진" , 99,98);
		Student3  s3= new Student3( "김재민" , 97,100);
		
		
		//
		
		s1.calcGrade();
		s2.calcGrade();
		s3.calcGrade();
		
		

		
		//
		//학생정보 출력

		System.out.println( s1.toString());
		System.out.println( s1.getName());
		System.out.println( s1.getKor());
		
		System.out.println( s2.toString());
		System.out.println( s2.getName());
		System.out.println( s2.getKor());
		
		System.out.println( s3.toString());
		System.out.println( s3.getName());
		System.out.println( s3.getKor());
	
 
		
		System.out.println( s1.toString());
		System.out.println( s2.toString());
		System.out.println( s3.toString());
		
		
		/*
		 * 
		 * Student3  s1= new Student3( "박세인" , 100,90); 
		Student3  s2= new Student3( "조아진" , 99,98);
		Student3  s3= new Student3( "김재민" , 97,100);
		
		 */
	
		Student3[] list  = new Student3[3];  //
		list[0] = new Student3( "박세인" , 100,90);
		list[1]=  new Student3( "조아진" , 99,98);
		list[2]=  new  Student3( "김재민" , 97,100);
		
		
		
		//성적 처리해 !!
		for( int i=0; i< list.length;i++) {
			list[i].calcGrade();
		}
		
		
		//학생성적 출력해!!
		 System.out.println(  "배열로 출력하기") ;
		for( int i=0; i< list.length;i++) {
			 System.out.println( list[i].toString()) ;
		}
		

	}

}
