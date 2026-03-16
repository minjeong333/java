package javaprj.day10.실습문제;

//문제2 main
public class Book2Main {


	public static void main(String[] args) {
		Book2 book2 = new Book2();
		book2.책정보입력하기("웰씽킹", "켈리 최", 16200);
		
		book2.책정보출력하기();
		
		book2.가격계산하기();
		book2.책정보출력하기();
		

	}

}
