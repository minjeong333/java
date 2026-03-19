package javaprj.day13.string;

public class 대소문자로변경하기 {

	public static void main(String[] args) {
		
		String str="I love java";
		
		String upperStr = str.toUpperCase();
		
		System.out.println(str);
		System.out.println(upperStr);
		
		String str2="JAVA";
		String lowerStr2=str2.toLowerCase();
		
		System.out.println(str2);
		System.out.println(lowerStr2);
	}

}
