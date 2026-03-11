package together;

import java.util.Scanner;

public class 매운맛문제1 {
	
	public static void main(String[] args) {
		
		double h=2500000;
		double k=1800000;
		int year=0;
		int i=0;
		
		
        while(true) {
          h = h*1.036;
          k = k*1.042;
          i++;
          if(h<k)break;
          }
        
        year=1999+i;
        System.out.println(year);    
	}
}