package java쪽지시험준비.문제04;

public class Main {

	public static void main(String[] args) {
		//일반적인 객체 생성 방법
//		Dog d = new Dog();
//		d.sound();
		
		//다형성 활용하는 방법
		Animal a = new Dog(); //부모 타입( Animal)로 자식 객체를 참조 - 업캐스팅
		a.sound();

	}

}
