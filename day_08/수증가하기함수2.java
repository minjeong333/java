package javaprj.day08;

public class 수증가하기함수2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int index=0;
		
		//수증가
		index = 수증가하기(index); //업데이트 시켜주는 것 잊지 말기!
		//수증가
		index = 수증가하기(index); 
		
		System.out.println(index);   
	}
	
	/*
	 기능: 수 증가 시키기
	 입력: 수
	 반환: 증가된 수 
	 */
	
	//
	public static int 수증가하기(int index) {
		index++;
		return index;
	
	}

}
