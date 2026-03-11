package together;

import java.util.Scanner;

public class 매운맛문제2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("이름 코드 시간순으로 입력하세요");
			String name = sc.next();
			int no = sc.nextInt();
			int time = sc.nextInt();
			int wages = 0;
			
			
			if(name.equals("stop")) break;
			
			switch(no) {
			case 1:
				wages=time*2000;
				break;
			case 2:
				wages=time*2500;
				break;
			case 3:
				wages=time*3000;
				break;
			case 4:
				wages=time*4000;
				break;
			default:
				System.out.println("잘못된 입력");
			}
			System.out.println(wages);
		}
	  }
	}

