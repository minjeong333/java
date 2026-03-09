package javaprj.day05;

public class 배열1차원_논리형 {

	public static void main(String[] args) {
		
		//논리형 변수 5개 만들고 출력하기
		boolean a = true;
		boolean b = true;
		boolean c = true;
		boolean d = false;
		boolean e = false;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		
		//배열로 만들고 출력하기
		boolean[]arr = new boolean[5];  //boolean기본값은  false
		
		System.out.println( arr[0]);
		System.out.println( arr[1]);
		System.out.println( arr[2]);
		System.out.println( arr[3]);
		System.out.println( arr[4]);
		
		// boolean f;  //변수는 초기화를 개발자가 직접해야 한다 !! 그렇지 않으면 오류를 줌
		// System.out.println(f);

		
		//배열선언 및 초기화
		boolean[] arr2 = new boolean[] {true, true, true, false, false};
		
		//
		
		//배열선언 및 초기화
		boolean[] arr3 = {true, true, true, false, false};
		//출력하기
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println(arr3[3]);
		System.out.println(arr3[4]);
	}

}
