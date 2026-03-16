package javaprj.day10.실습문제;

/*
3. 책정보 (title,  author, price ) 를  담을 수 있는 Book클래스를 정의하고
   책정보  3개를 객체 배열로 만들고 출력하기
*/
public class Book3 {
	
	//속성
		String title;
		String author;
		int price;
		
		public Book3() {
			
		} 
		
		public Book3(String title, String author, int price) {
			this.title=title;
			this.author=author;
			this.price=price;
		}
		
		public void 책정보출력하기() {
			System.out.println("===================");
			System.out.println("title " + title);
			System.out.println("author " + author);
			System.out.println("price " + price);
		}	


		
	}