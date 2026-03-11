package javaprj.day08;

public class 함수문제8 {

    // 8. 금액을 매개변수로 받아 화폐 매수를 배열로 반환하는 함수
    public static int[] getMoneyCount(int amount) {
        // 화폐 단위 설정 (큰 순서대로)
        int[] units = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        // 각 단위별 매수를 저장할 배열
        int[] counts = new int[units.length];

        for (int i = 0; i < units.length; i++) {
            counts[i] = amount / units[i]; // 해당 단위의 매수 계산
            amount = amount % units[i];    // 남은 잔액을 다음 단위로 넘김
        }

        return counts; // 계산된 매수 배열 반환
    }

    public static void main(String[] args) {
        int myMoney = 678550; // 예시 출장비
        int[] units = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        
        // 함수 호출
        int[] result = getMoneyCount(myMoney);

        System.out.println("출장비 [" + myMoney + "원]의 화폐 매수:");
        for (int i = 0; i < result.length; i++) {
            if (result[i] > 0) { // 매수가 0인 것은 출력하지 않음
                System.out.println(units[i] + "원: " + result[i] + "매");
            }
        }
    }
}