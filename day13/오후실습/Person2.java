package javaprj.day13.오후실습;

public class Person2 {

	String name;

	public Person2() {
	}

	public Person2(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	public void 말한다() {
		System.out.println(name + "님이 말합니다.");
	}

}