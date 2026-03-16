package javaprj.day10.실습문제;

/*
2. 책정보 (title,  author, price ) 를  담을 수 있는 
Book클래스를 정의하고 책정보 객체 3개를 만들고 출력하기 
*/

public class Book2 {
	
	//속성
	private String title;
	private String author;
	private int price;
	
	
	
	public void 책정보입력하기(String title, String author, int price) {
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	public void 책정보출력하기() {
		System.out.println("===========");
		System.out.println("title " + title);
		System.out.println("author " + author);
		System.out.println("price " + price);
	}	
	
	public void 가격계산하기() {
		price+=16200;
	}

	
}


