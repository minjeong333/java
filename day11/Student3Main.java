package javaprj.day11;

public class Student3Main {

	public static void main(String[] args) {

		Student3 s1 = new Student3("박세인", 100, 90);
		Student3 s2 = new Student3("조아진", 99, 98);
		Student3 s3 = new Student3("김재민", 97, 100);

		//
		s1.calcGrade();
		s2.calcGrade();
		s3.calcGrade();

		// 학생성적 출력하기
		// 세인
		System.out.println("박세인 성적");
		System.out.println(s1.toString());

		System.out.println(s1.getName());
		System.out.println(s1.getKor());
		System.out.println(s1.getEng());

		// 아진
		System.out.println("======================");
		System.out.println("조아진 성적");
		
		System.out.println(s2.toString());

		System.out.println(s2.getName());
		System.out.println(s2.getKor());
		System.out.println(s2.getEng());

		// 재민
		System.out.println("======================");
		System.out.println("김재민 성적");
		
		System.out.println(s3.toString());

		System.out.println(s3.getName());
		System.out.println(s3.getKor());
		System.out.println(s3.getEng());
		
		
		Student3[] list = new Student3[3];//
		list[0] = new Student3("박세인", 100, 90);
		list[1] = new Student3("조아진", 99, 98);
		list[2] = new Student3("김재민", 97, 100);
		
		
		
		//성적 처리 해봐
		for(int i=0; i<list.length; i++) {
			list[i].calcGrade();
		}
		
		//학생 성적 출력해봐
		System.out.println("배열로 출력하기");
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i].toString());
		}
	
	
	}

}
