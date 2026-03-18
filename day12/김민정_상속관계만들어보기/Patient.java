package javaprj.day12.김민정_상속관계만들어보기;

public class Patient extends Person{

	public void 아파하기() {
		System.out.println(name + "(환자):" + "너무 아파요..");
	}
	@Override //부모의 말한다 기능을 재정의하기
	public void 말한다() {
		System.out.println(name + "(환자):" + "몸이 으슬으슬하고 열이 나요..");
	}
}
