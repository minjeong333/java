package javaprj.day13.오후실습;

import javaprj.day12.김민정다형성실습.Person;

public class Doctor extends Person {

	String patientName; // 진료할 환자 이름 메모지

	public Doctor() {

	}

	public void setPatientName(String patientName) {
		this.patientName=patientName;
	}
	
	@Override // 부모의 말한다 기능을 재정의하기
	public void 말한다() {
		System.out.println("(의사): " + patientName + "님 맞으시죠? 어디가 아프세요?");
	}

	public void 치료하기() {
		System.out.println("(의사): 주사 한 대 맞고 가세요:)");
	}

}