package javaprj.day13.string;

import java.util.Arrays;

public class split {

	public static void main(String[] args) {
		
		String str="i-love-java";
		
		String[] result = str.split("-");

		System.out.println(Arrays.toString(result));
		
	}

}
