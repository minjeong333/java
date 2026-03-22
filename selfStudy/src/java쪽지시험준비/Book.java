package java쪽지시험준비;

/*
[복습 및 심화: 헷갈리는 포인트 재점검]
문제 1. 생성자를 이용한 객체 초기화
Book 클래스를 만드세요.

필드: String title, int price

조건: 매개변수가 있는 생성자를 만들어, 객체 생성과 동시에 제목과 가격이 저장되게 하세요.

main 메서드에서 Book 객체를 생성하고 정보를 출력하세요.
(힌트: new Book("자바공부", 20000); 처럼 한 줄로 초기화하기)

 */
public class Book {
	String title;
	int price;

	public Book(String t, int p) {
		this.title = t;
		this.price = p;
	}

	public static void main(String[] args) {
		Book b = new Book("자바공부", 2000);
		System.out.println("제목: " + b.title + ", 가격: " + b.price);

	}

}
