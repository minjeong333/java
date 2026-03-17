package javaprj.day11.변수종류_초기화;

public class GameMain {

	public static void main(String[] args) {

		Game g = new Game("테트리스", 5000); //이름, 가격
		Game g2 = new Game("핀볼", 10000); //이름, 가격

		
		System.out.println(g.toString());
		System.out.println(g2.toString());
		
		System.out.println(Game.cnt);
		Game.printCount();
	}

}
