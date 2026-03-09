package javaprj.day05;

public class 배열1차원_실수형 {

	public static void main(String[] args) {


		// 실수형데이터 5개 배열 사용해서 출력하기
		// double배열은 기본값으로 초기화됨
		// double 형의 기본값은 0.0
		double[] arr = new double[5];
		arr[0]=1.5;
		arr[1]=2.3;
		arr[2]=1.7;
		arr[3]=2.8;
		arr[4]=1.9;
		
		//1.출력하기
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		
		//2.반복문 출력하기
		System.out.println("반복문으로 출력하기");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//배열선언 및 초기화
		double[] arr2 = new double [] {2.0, 3.5, 4.1, 2.5, 4.2};
		
		//출력
		System.out.println("변수선언 및 초기화1");
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		//배열선언 및 초기화
		double[] arr3 = {4.5, 5.2, 2.2, 9.1, 3.3}; 
		
		//출력
		System.out.println("변수선언 및 초기화2");
		for(int i=0; i<arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		

	}

}
