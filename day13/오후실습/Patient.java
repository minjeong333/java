package javaprj.day13.오후실습;

import javaprj.day12.김민정다형성실습.Person;

public class Patient extends Person {

	public Patient(String name) {
		super(name); // 부모의 name 변수에 저장하겠다
	}
	
	public String getName() {
		return this.name;
	}

	@Override // 부모의 말한다 기능을 재정의하기
	public void 말한다() {
		System.out.println("(환자): " + "몸이 으슬으슬하고 열이 나요..");
	}

	public void 아파하기() {
		System.out.println("(환자): " + "주사 아픈데...");
	}

}