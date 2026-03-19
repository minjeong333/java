package javaprj.day13.string;

public class 문자열만들기 {

		public static void main(String[] args) {
			
			//상수영역에 "hello"라는 문자열이 저장되고 공유하면서 사용
			
			String str = "hello";
			String str2 = "hello";
			
			//예상하기
			//두 문자열은 주소, 내용 같은 것인가?
			if(str.equals(str2)) {
				System.out.println("내용이 같다");
			}
			
			//주소 비교
			if(str==str2) {
				System.out.println("두 주소가 같다");
			}
			
			
			System.out.println("===============");
			
			String str3 = new String("hello");
			String str4 = new String("hello");
			
			//예상하기
			//두 문자열의 주소와 내용이 같을 것인가?
			
			
			if(str3.equals(str4)) { //문자열의 내용 비교하기
				System.out.println("내용이 같다");
			}
			
			
			//주소 비교
			if(str3 == str4) {
				System.out.println("두 주소가 같다");
			}
			
		}
}
