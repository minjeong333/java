package javaprj.day10.객체배열;

public class ScoreMain {

	public static void main(String[] args) {
		
		Score s;
		s= new Score(1, 100, 100, 100);
		
		Score s2 = new Score(2, 90, 100, 100);
		
		Score[] scores = new Score[2]; // s, s2 이런 참조형변수를 연속적으로 만든 것  
		scores[0] = new Score(1, 100, 100, 100);
		scores[1] = new Score(2, 99, 100, 100);
		
		for(int i =0; i<scores.length; i++) {
			scores[i].printlnfo();
		}
	}

}
