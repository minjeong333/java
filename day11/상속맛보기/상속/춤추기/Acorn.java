package javaprj.day11.상속맛보기.상속.춤추기;

public class Acorn {
	
	public void dance() {
		 System.out.println("에이콘 학생은 춤을 춘다");
    }
	

}


/*

1. Acorn을 상속받은 클래스를 만드시오 

  class BBB extends Acorn{
  }
  
  Main{
          public static void main( String[] args){
                   BBB b= new BBB();
                    b.dance();
          }
  }
  
  상속받은 부모의 기능 확인하기 ( 부모의 모든것을 상속받는다 )
2. 


  class WJY extends Acorn{
  
  
   @Override    //부모의 매서드 재정의하기  ( 부모꺼 +재정의한 내꺼) 
    public void dance() {
		 System.out.println("부채춤을 춘다");
    }
    
  }

*/