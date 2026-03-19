package javaprj.day13.string;

public class charAtEx {

	public static void main(String[] args) {
		
		String str="I love java"; //문자열배열은 반드시 문자열객체. 매서드로만 사용한다, 불변객체, 수정할 수 없다
		
		//문자열배열의 index에 해당하는 문자 반환하는 기능
		char result = str.charAt(0);
		
		System.out.println(result);
		
		
	}

}
