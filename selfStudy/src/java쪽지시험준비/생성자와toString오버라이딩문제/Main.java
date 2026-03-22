package java쪽지시험준비.생성자와toString오버라이딩문제;

public class Main {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("삼성", 100000);

		//System.out.println(sp.brand + sp.price);
		//toString을 오버라이딩했기 때문에 위처럼 치지 않아도 됨
		
		
		//객체 변수만 넣어도 자동으로 toString()이 호출된다
		System.out.println(sp);
	}

}
