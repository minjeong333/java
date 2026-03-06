package javaprj.day03;

public class 변수_문자형_이름출력 {

	public static void main(String[] args) {
		
		
		//문자 -> 숫자로 표현
		//유니코드 : 전세계 문자에 대한 코드표 
		//https://www.unicode.org/charts/PDF/UAC00.pdf
		
		
		char a = 0xAE40;  //김  //0x 16진수  2진수 => 4자리씩 끊어서 표현
		char b = 0xBBFC;  //민
		char c = 0xC815;  //정
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
	
		//"딸기";
		char d='딸';
		char e='기';
		
		System.out.println(d);
		System.out.println(e);
		
		char gg=0xBBFC;
		System.out.println(gg);
		
		
		
		//"딸기"
		//문자배열
		//char[] fruit = new char[2];
		//fruit[0]='딸';
		//fruit[1]='기';
		
		
		char[] fruit = new char[2];
		fruit[0]='딸';
		fruit[1]='기';
		
		
		for(int i=0; i<fruit.length; i++) {
			System.out.println(fruit[i]);
		}
	
	}

}
