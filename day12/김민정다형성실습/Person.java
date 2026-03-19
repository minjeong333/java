package javaprj.day12.김민정_상속관계만들어보기;

public class Person {

	String name;

	public Person() {

	}

	public Person(String name) {

		this.name = name;

	}

	public String toString() {

		return name;

	}

	public void 말한다() {

		System.out.println(name + "님이 말합니다.");

	}

}