package javaprj.day08;

import java.util.Scanner;

public class 함수문제5 {

	//5. 수를 매개변수로 약수를 반환하는 함수 만들기
	public static int[] getDivisorArray(int n) {
        // 1. 먼저 약수의 개수가 몇 개인지 센다
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }

        // 2. 센 개수만큼의 크기로 배열을 만든다
        int[] divisors = new int[count];

        // 3. 배열에 약수를 차례대로 담는다
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors[index++] = i;
            }
        }
        return divisors; // 배열 반환
    }

    public static void main(String[] args) {
        int[] result = getDivisorArray(20);
        
        System.out.print("20의 약수: ");
        for (int d : result) {
            System.out.print(d + " ");
        }
    }
		
		
		
	
	}

