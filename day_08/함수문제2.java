package javaprj.day08;

public class 함수문제2 {
	
	//2. 날씨정보를 반환하는 함수 만들기 (임의의 날씨 정보)
	/*
	 기능:날씨정보 반환
	 매개변수:x
	 반환:날씨정보
	 */
	
	
	//풀이 
	//main에만 만들어보기
	/*
	 	public static void main(String[] args) {

			String[] info = {"맑음", "흐림", "비", "눈"};
			int index = (int)(Math.random() * info.length);
				System.out.println(info[index]);
			
		}
	 */
	
	
	public static String[] weather() {
		String[] info = {"맑음", "흐림", "비", "눈"};
		return info;
	}
	
	
	public static void main(String[] args) {

		String[] result = weather();
		int index = (int)(Math.random() * result.length);
		System.out.println("문제 2) 임의의 날씨정보 반환하기");
			System.out.println(" ");
			System.out.println(result[index]);
			
		}

	}
  
