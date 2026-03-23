package javaprj.day15.선택정렬.추가공부;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i; // 현재 범위에서 가장 작은 원소의 인덱스 저장
            				// minIdx = 0이라는 의미
            
            // i 이후의 요소들 중 최솟값 찾기
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            // 찾은 최솟값과 현재 i 위치의 값을 교환(Swap)
            // 선택 정렬과 달리 교환(실제 값을 바꾸는)행위는 한 루프에 딱 한 번만 일어남 
            // 데이터의 크기가 아주 커서 값을 이동시키는 비용이 비쌀 때(비교 비용보다 이동 비용이 훨씬 클때)
            
            //1. 임시 보관함( temp)에 현재 i위치의 값을 미리 대피시킴
            int temp = arr[minIdx];
            
            //2. 현재 i위치에 우리가 찾은 '진짜 최솟값'을 덮어씀
            arr[minIdx] = arr[i];
            
            //3. 최솟값이 있던 원래 자리(minIdx)에 대피시켜둔 temp 값을 넣기 
            arr[i] = temp;
            
        }
    }
}
