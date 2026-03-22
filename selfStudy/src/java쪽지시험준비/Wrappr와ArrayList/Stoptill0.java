package java쪽지시험준비.Wrappr와ArrayList;

import java.util.ArrayList;

/*
 Scanner로 숫자를 계속 입력받다가 0을 입력하면 종료!
 0을 제외한 숫자들을 ArrayList<Integer>에 담고, 
 마지막에 그 숫자들의 평균을 구하세요.
 */

import java.util.Scanner;

public class Stoptill0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		System.out.println("숫자를 입력하세요(0을 입력하면 종료):");
		
		while(true) {
			int num = sc.nextInt(); //1.숫자를 반복문 안에서 계속 받기
			
			if(num==0) {
				break;
			}
			
			list.add(num); // 0이 아니면 리스트에 추가하기(오토박싱 발생)
		}
		
		//평균계산하기
		if(list.size()>0) { // =리스트가 비어 있지 않으면 
			double sum = 0;
			for(int i=0; i<list.size(); i++) {
				sum+=list.get(i);
			}
			double avg=sum/list.size();
			System.out.println("입력된 숫자 개수:" + list.size());
			System.out.println("평균값:" + avg);
		}else {
			System.out.println("입력된 숫자가 없습니다.");
		}
	}

}
