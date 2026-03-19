package javaprj.day13.string;

public class 문자열직접만들기 {

	public static void main(String[] args) {


		char a='h';
		char b='e';
		char c='l';
		char d='l';
		char e='o';
		
		char[] word= {a, b, c, d, e};
		
		//word[0]='h';
		
		//반복문으로 출력
		for(int i=0; i<word.length; i++) {
			System.out.print(word[i]);
		}
		printCharArray(word);
		String resultStr = myToString(word);
		System.out.println(resultStr);
		
		String str = "hello^^"; //char[] + 매서드 제공한다
		
		System.out.println(str.toString()); //Object  toString -> String 클래스내부에서 오버라이드 하고 있다
		System.out.println(str);
		
		char result =str.charAt(5);
		System.out.println(result);
		}
		
		//출력하기
		public static void printCharArray(char[]arr) {
			for(int i=0;  i<arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
		
		
		
		public static String myToString(char[]arr) {
			String str="";
			for(int i=0; i<arr.length; i++) {
				str += arr[i];
			}
			return str;
		}
		
	}

