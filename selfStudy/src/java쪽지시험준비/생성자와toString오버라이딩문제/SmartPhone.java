package java쪽지시험준비.생성자와toString오버라이딩문제;

public class SmartPhone {
	String brand;
	int price;

	public SmartPhone(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}

	//toString을 오버라이딩하는 이유
	//객체 변수 이름만 출력해도 내가 원하는 문자열이 나오게 하기 위해서
	@Override
	public String toString() {
		//필드값들을 조합해서 하나의 문자열로 만들기
		return "[" + brand + "," + price + "원]";
		
	}
}
