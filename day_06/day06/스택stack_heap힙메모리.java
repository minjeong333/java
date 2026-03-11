package javaprj.day06;

public class 스택stack_heap힙메모리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//스택 stack
		//함수( 매서드) 안에서 만들어지는 변수들이 사용하는 공간 
		//함수가 호출되면 생성되었다가 함수가 반환되면 해제(자원반환) 됨  
		//지역변수라고 한다  (함수가 실행되는 동안만 살아 있음)
		
		
		
		//힙
		//new에 의해서만 힙메모리 사용 
		//new의 의미 메모리 할당요청 , 메모리할당하고 할당된 메모리의 시작주소를 반환해줌
		//메모리요청:new
		//메모리반납:자바는 개발자가 직접하지 않음  자바가 제공함( 가비지콜렉터가 수행됨) 
		
		
		//c언어
		//int*  ap =  malloc( sizeof(int)  * 4 );
		// free(ap);
		
		
		//가비지(쓰레기공간, 안쓰는 공간)인지 어떻게 구분할까?
		//참조가 끊어진 공간을 가비지로 인식한다.
		
		
		

	}

}
