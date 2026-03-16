package javaprj.day10.실습문제;

public class Book3Main {

	public static void main(String[] args) {
		Book3 book = new Book3("웰씽킹", "켈리 최", 16200);
		Book3 book2 = new Book3("인생을 위한 최소한의 생각", "신영준, 고영성", 17820);
		Book3 book3 = new Book3("미라클모닝", "할 엘로드,드웨인 J. 클라크", 19800);
		
		Book3[] books = new Book3[3];
		books[0] = new Book3("웰씽킹", "켈리 최", 16200);
		books[1] = new Book3("인생을 위한 최소한의 생각", "신영준, 고영성", 17820);
		books[2] = new Book3("미라클모닝", "할 엘로드,드웨인 J. 클라크", 19800);
		for(int i=0; i<books.length; i++) {
			books[i].책정보출력하기();
		}
		
	}

}
