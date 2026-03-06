package javaprj.day03;

public class 연산자_증감연산자 {

	public static void main(String[] args) {
		
		
		//i++. ++i, i--, --i
		//++i(전위형)
		//i++(후위형)
		
		
		//공통점 : 변수의 값을 1증가 시킴 
		//다른점 : 연산의 결과가 다르다 (연산을 수행한 자리에 연산의 결과 발생)
		
		int a=10;
		int b=10;
		
		// a++; // 연산의 결과는 10  =>  a=>11
		// ++b; // 연산의 결과는 11  =>  b=>11
		
		System.out.println(a++);
		System.out.println(++b);
		
		System.out.println(a);
		System.out.println(b);
	}

}
