package javaprj.day10.실습문제;

/*
 * 1. 책정보 (title,  author, price )를 생성자로 만들어서 저장하고 출력하기
*/
public class Book {
	
	private String title;
	private String author;
	private int price;
	

	public void 책정보입력하기() {
		this.title="웰씽킹";
		this.author="켈리 최";
		this.price=16200;
	}
	
	public void 책정보출력하기() {
		System.out.println("===========");
		System.out.println("title " + title);
		System.out.println("author " + author);
		System.out.println("price " + price);
	}	

}
