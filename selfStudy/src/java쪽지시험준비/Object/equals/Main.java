package java쪽지시험준비.Object.equals;

public class Main {

	public static void main(String[] args) {
		Member m1 = new Member("java123");
		Member m2 = new Member("java123");
		
	//주소값 비교
	//두 객체는 가각'new'로 만들어졌으므로 메모리 주소가 달라 false가 나옵니다
	System.out.println("주소 비교(==): " + (m1 == m2));
	
	//내용 비교(equals)
	//위에서 재정의했기 때문에 id 값만 보고 true를 돌려줍니다. 
	System.out.println("내용 비교(equals): " + m1.equals(m2));
	}

}
