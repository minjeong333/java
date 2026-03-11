package javaprj.day08;

public class 함수문제7 {

    // 7. 수 목록(배열)을 입력받아 평균을 반환하는 함수
    public static double getAverage(int[] arr) {
        // 배열이 비어있을 경우 0.0 반환 (에러 방지)
        if (arr.length == 0) {
            return 0.0;
        }

        int sum = 0; // 합계를 담을 변수
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // 배열의 모든 값을 더함
        }

        // 합계를 개수(length)로 나눔 
        // (double)로 형변환을 해줘야 소수점까지 정확하게 계산됩니다.
        double avg = (double) sum / arr.length;
        
        return avg; // 계산된 평균값 반환
    }

    public static void main(String[] args) {
        // 테스트용 배열 생성
        int[] scores = {90, 85, 70, 95, 100};

        // 함수 호출 및 결과 출력
        double result = getAverage(scores);
        
        System.out.println("평균 점수: " + result);
    }
}

