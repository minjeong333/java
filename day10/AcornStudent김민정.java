package javaprj.day10;


//  AcornStudent s  = new AcornStudent();   //  변수만들기 , 객체생성기



//에이콘학생정보를 저장하기 위한  자료형 만들기 
//캡슐화 
//데이타+ 매서드(함수) 묶음
//매서드가 하는 역할= 데이터를 사용 ( 데이터변경 OR 단순히 읽기)
public class AcornStudent김민정 {

	
	  //속성
	  String name;
	  private int 에너지;
	  private int 근육량;
	  private int 자바능력;
	  private int 프론트능력;
	  private int 기분;
	  
	
	   
	  //기능(매서드, 함수)
	  //매서드를 통해서 변수를 사용한다	   (데이터를 사용하는 기능)
	 
	  //입력하기  (기본)  
	  //출력하기  (기본)
	  
	  
	  //배열공부하기

	  public void  입력하기( String name, int 에너지, int 근육량, int 자바능력, int 프론트능력, int 기분){
	           this.name  = name;
	           this.에너지 = 에너지;
	           this.근육량 = 근육량;
	           this.자바능력 = 자바능력;
	           this.프론트능력 = 프론트능력;
	           this.기분 = 기분;
	           
	  }

	//정보 출력하기
	  public void   정보출력하기(){
		 System.out.println("===============");
		 System.out.println("name " + name);
		 System.out.println("에너지 "+ 에너지);
		 System.out.println("근육량 " + 근육량);
		 System.out.println("자바능력 "+ 자바능력);
		 System.out.println("프론트능력 "+ 프론트능력); 
		 System.out.println("기분 "+ 기분); 
	 }


	  public void  배열공부하기(){
	     자바능력  +=20;
	     에너지  -=5;
	        
	  }

	  public  void div로풋터만들기(){
	        프론트능력 +=30;
	        에너지  -=5;
	 } 

	  public void 밥먹기() {
	        에너지 +=100;
	  }
	  
	  /*
	  public void 운동하기() { //static이 아닌 매서드는 객체의 매서드(인스턴스 매서드)이다
		  					 //객체의 정보를 전달받는다. this라는 키워드 사용!
		    this.근육량 +=100;
	        에너지 +=50;
	        기분 += 80;
	  }
	  */
	  
	  public void 운동하기() { //만약 static이 붙으면? 
		  					 //static이 붙은 매서드는 객체가 생성되기 전부터 클래스 메모리 영역에 이미 올라감
		  					 //반면, 에너지, 기분같은 변수는 객체(인스턴스)가 생성되어야만 힙메모리 안에 들어감.
		  					 //정리하면 Static 메서드: 클래스 이름으로 직접 호출(AcornStudent.운동하기())됩니다. 
		  					 //이때는 특정 학생(객체)의 정보가 전달되지 않는다. 
		  					 //컴퓨터 입장에서는 **"전교생 중 누구의 에너지를 올리라는 거야?"**라고 당황하며 오류를 내뱉는 것과 같다.	
		  에너지 +=50;
		  기분 += 80;
	  }
	  
	  //static 매서드란 단지 class에 소속되어있는 매서드.
	  //이 매서드의 사용법은 class이름.매서드이름 으로 사용할 수 있다.
	  
	  //AcornStudent김민정 클래스에 소속되어 있는 기능이다
	  //객체(변수)가 만들어지는 것과 무관하다
	  //당연히 객체의 정보를 전달받지 않는다
	  //∴변수정보를 사용불가
	  //이럴땐 static변수를 static매서드에 담으면 사용 가능
	  
	  //point) 객체마다 다르게 동작해야 하면 일반 메서드, 객체와 상관없이 기능 그 자체로 존재해도 되면 Static 메서드를 사용하기
	  
	  public static void 학원위치소개하기() {
		  System.out.println("홍대입구에 있어요 :)");
	  }

	  public int  웃는다(){
	        에너지 += 10;
	        return 10;
	  }
}
	  