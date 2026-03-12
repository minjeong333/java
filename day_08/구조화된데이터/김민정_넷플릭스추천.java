package javaprj.day08.구조화된데이터;

public class 김민정_넷플릭스추천 {

	public static void main(String[] args) {
		Netflix netflix = new Netflix(); //구조화된변수 만들기
		
		//값넣기
		/*
		netflix.name="StrangerThings";
		netflix.PremiereDate="2016-07-15";
		netflix.season=5;
		netflix.company="Upside Down Pictures";
		*/
		input(netflix);
		
		System.out.println("   🎥넷플릭스 추천🍿");
		System.out.println("=====================");
		
		//값출력하기
		/*
		System.out.println("제목: " + netflix.name);
		System.out.println("첫방영일: " + netflix.PremiereDate);
		System.out.println("시즌: "+ netflix.season);
		System.out.println("제작사: "+ netflix.company);
		*/
		print(netflix);
	}
	
	public static void input(Netflix netflix) {
		netflix.name="StrangerThings";
		netflix.PremiereDate="2016-07-15";
		netflix.season=5;
		netflix.company="Upside Down Pictures";
	}

	public static void print(Netflix netflix) {
		System.out.println("제목: " + netflix.name);
		System.out.println("첫방영일: " + netflix.PremiereDate);
		System.out.println("시즌: "+ netflix.season);
		System.out.println("제작사: "+ netflix.company);
	}
}
