package javaprj.day03;

public class 합구하기3 {

	public static void main(String[] args) {

		
		
		int su=0;
		int result=0;
		
		
		/*
		su=su+1; //1
		result = result + su; //1
		
		su=su+1; //2
		result = result + su; //3

		su=su+1; //3
		result = result + su; //6
		
		su=su+1; //4
		result = result + su; //10
		
		su=su+1; //5
		result = result + su; //15
		
		su=su+1; //6
		result = result + su; //21
		
		su=su+1; //7
		result = result + su; //28
		
		su=su+1; //8
		result = result + su; //36
		
		su=su+1; //9
		result = result + su; //45
		
		su=su+1; //10
		result = result + su; //55
		
		System.out.println(result);
		
		*/
		
		
		
		//반복문
		for(int i=1; i<=10; i++) {
			su=su+1; 
			result = result + su; 
		}
		
		System.out.println(result);
		
		
		for(int i=1; i<=2; i++) {
			System.out.println("안녕");
		}
	}

}
