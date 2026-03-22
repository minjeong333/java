package java쪽지시험준비.인터페이스와다형성;

public class Main {

	public static void main(String[] args) {
		
		//하나의 부모 타입 변수 선언
		Playable p; 
		
		//선언된 변수에 자식 객체들을 갈아 끼우기
		p=new Music();
		p.play();
		
		p=new Video();
		p.play();
		
	}

}
