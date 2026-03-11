package javaprj.day06.학생.실습문제;

import java.util.Scanner;

public class 문제1_배열사용안함 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int remain = 0;
            int moneyCnt = 0; //지폐 장 수

            System.out.println("사원명에 stop 입력시 종료");
            System.out.print("사원명: ");
            String name = sc.nextLine();

            if (name.equals("stop")) break;

            System.out.print("출장비: ");
            int travelExpenses = sc.nextInt();
            sc.nextLine();

            System.out.println("사원명: " + name);
            System.out.println("-- 필요한 지폐 목록 --");
            moneyCnt = travelExpenses / 50000;
            System.out.println("50000원: " + moneyCnt);
            remain = travelExpenses - (50000 * moneyCnt);
            travelExpenses = remain;

            moneyCnt = travelExpenses / 10000;
            System.out.println("10000원: " + moneyCnt);
            remain = travelExpenses - (10000 * moneyCnt);
            travelExpenses = remain;

            moneyCnt = travelExpenses / 5000;
            System.out.println("5000원: " + moneyCnt);
            remain = travelExpenses - (5000 * moneyCnt);
            travelExpenses = remain;

            moneyCnt = travelExpenses / 1000;
            System.out.println("1000원: " + moneyCnt);
            remain = travelExpenses - (1000 * moneyCnt);
            travelExpenses = remain;

            moneyCnt = travelExpenses / 500;
            System.out.println("500원: " + moneyCnt);
            remain = travelExpenses - (500 * moneyCnt);
            travelExpenses = remain;

            moneyCnt = travelExpenses / 100;
            System.out.println("100원: " + moneyCnt);
            remain = travelExpenses - (100 * moneyCnt);
            travelExpenses = remain;

            moneyCnt = travelExpenses / 50;
            System.out.println("50원: " + moneyCnt);
            remain = travelExpenses - (50 * moneyCnt);
            travelExpenses = remain;

            moneyCnt = travelExpenses / 10;
            System.out.println("10원: " + moneyCnt);
            remain = travelExpenses - (10 * moneyCnt);
            travelExpenses = remain;

        }
    }
}
