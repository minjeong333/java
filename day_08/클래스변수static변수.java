package javaprj.day08;

public class 클래스변수static변수 {
	
	static int index=0; //클래스 전역변수가 됨. 클래스내의 있는 모든 매서드에서 접근가능

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int index=0; //index를 메인에서 만들면 계속 전달하고 증가된 값은 반환받아서 사용해야 함

		// int index=0; // 클래서내에 있는 모든 매서드가 함께 사용할 수 있는 클래스 전역변수로 만들 수 있다
		수증가하기();
		수증가하기();
		
		수출력하기();

	}

	private static void 수증가하기() {
		// TODO Auto-generated method stub  //main에 있는 index 이용 불가
		index++;
	}
	
	private static void 수출력하기() {
		// TODO Auto-generated method stub
		System.out.println(index);
	}

}
