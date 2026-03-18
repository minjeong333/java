package javaprj.day12.김민정_상속관계만들어보기;

public class Doctor extends Person {
	public void 진단하기(Patient p) {
		System.out.println(this.name + "(의사):" +p.name + "환자분 어디가 아프신가요?");
	}
	
	@Override //부모의 말한다 기능을 재정의하기
	public void 말한다() {
		System.out.println("진단하기");
	}
}
