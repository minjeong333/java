package javaprj.day03;

public class 자료형 {

	public static void main(String[] args) {
		
		// 정수형 숫자
		// byte : 1byte ( 8bit, 부호1 : 7bit -128~127 )
		// short : 2byte ( 2byte : -32,768 ~ 32,767)
		// int : 4byte ( 4byte : -21억 ~ +21억)  
		// 메모리
		// ( 4G -> 42억 byte)
		// long : 8byte ( 8byte : -920 ~ +920경)

		byte a=127;
		short b=32677;
		int c=210000000;
		long d=220000000l; 
		
		
		//실수형 숫자
		//float( 4byte , 소수이하 7자리)
		//double ( 8byte , 소수이하 15자리)
		float e= 35.3f;
		double f=35.3;
		
		
		//문자 : 한 문자 (char) char : 2byte : 영문 한 글자, 또는 한글 한 글자
		//                            0~65535
		char g='홍';
		
		
		//논리형 : boolean  ( 1byte : true , false만 저장가능)
		boolean h=true;
		
		
		//컴퓨터가 음수를 표현하는 방법: 2의 보수

		
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(e);
			System.out.println(f);
			System.out.println(g);
			System.out.println(h);
			
	}

}
