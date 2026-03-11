package javaprj.day06.학생.실습문제;

import java.util.Scanner;

public class 문제1_배열사용 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // 화폐매수 배열
        int[] money = new int[] {
                50000, 10000, 5000, 1000, 500, 100, 50, 10
        };
        while(true) {
            int[] moneyCnt = new int[money.length]; // 필요한 지폐 매수 저장할 배열
            int remain = 0; // 이전 지폐 필요 매수 구한 후 나머지 돈 저장

            System.out.println("stop 입력시 종료");
            System.out.print("사원명: ");
            String name = sc.nextLine();

            if (name.equals("stop")) break;

            System.out.print("출장비: ");
            int travelExpenses = sc.nextInt();
            sc.nextLine();

            System.out.println("사원명: " + name);
            System.out.println("-- 필요한 지폐 목록 --");
            for (int i = 0 ; i < money.length ; i++) {
                moneyCnt[i] = travelExpenses / money[i];
                remain = travelExpenses % money[i];
                System.out.println(money[i] + "원: " + moneyCnt[i]);
                travelExpenses -= money[i] * moneyCnt[i];
            }

        }



    }
}
