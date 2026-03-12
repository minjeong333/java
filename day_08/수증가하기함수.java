package javaprj.day08;

public class 수증가하기함수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int index=0;
		
		//수증가
		수증가하기(index); 
		//수증가
		수증가하기(index); //매개변수 전달 call by value
		
		System.out.println(index);   // 0
	}
	
	/*
	 기능: 수 증가 시키기
	 입력: 수
	 반환: 증가된 수 
	 */
	
	//
	public static void 수증가하기(int index) {
		index++;
		System.out.println(index);
	
	}

}
