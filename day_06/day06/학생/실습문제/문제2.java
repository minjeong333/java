package javaprj.day06.학생.실습문제;

import java.util.Scanner;

public class 문제2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        int index = 0;
        String[] daySchedule = new String[5];
        loop:while(true) {
            System.out.println("1. 일정 등록    2. 일정 조회    3. 일정 변경    4. 일정 삭제    5. 종료");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    if (index >= daySchedule.length) {
                        System.out.println("최대 입력 횟수 초과");
                        break;
                    }
                    System.out.print("일정 입력: ");
                    daySchedule[index] = sc.nextLine();
                    index++;
                    System.out.println("등록되었습니다.");
                    break;

                case 2:
                    System.out.println("---오늘 등록된 일정---");
                    for (int i = 0 ; i < index ; i++) {
                        System.out.println((i+1) + ". " + daySchedule[i]);
                    }
                    break;

                case 3:
                    System.out.print("변경할 일정 번호 입력: ");
                    int updateNo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("일정 내용 입력: ");
                    daySchedule[updateNo - 1] = sc.nextLine();

                    System.out.println("등록되었습니다.");
                    break;

                case 4:
                    System.out.print("삭제할 일정 번호 입력: ");
                    int deleteNo = sc.nextInt();
                    sc.nextLine();
                    if (deleteNo >= index) {
                        System.out.println("해당 번호는 없습니다. ");
                        break;
                    }
                    index--;
                    for (int i = deleteNo ; i < daySchedule.length - 1 ; i++){
                        daySchedule[i - 1] = daySchedule[i];
                    }
                    String[] temp = new String[index];
                    for(int i = 0 ; i < temp.length ; i++){
                        temp[i] = daySchedule[i];
                    }
                    daySchedule = temp;

                    System.out.println("삭제 완료되었습니다.");
                    break;
                case 5:
                    System.out.println("종료");
                    break loop;

                default:
                    System.out.println("1 ~ 5 번 중에서 선택해주세요.");


            }
        }
    }
}
