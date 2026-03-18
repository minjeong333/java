package javaprj.day12.맛있는다형성;

public class KMJ extends AcornStudent {
	
	public KMJ() {
		super("김민정", 25);
	}
	
	public KMJ(String name, int age) {
		super(name, age);
	}
	
	public void 음료마시기() {
		System.out.println("민정이는 아이스 아메리카노를 마시고 싶어요");
	}
	
}


