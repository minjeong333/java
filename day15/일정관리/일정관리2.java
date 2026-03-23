package javaprj.day15.일정관리;


import java.util.ArrayList;
import java.util.Scanner;

public class 일정관리2 {

	
	//ArrayList<Day > days = new ArrayList<>();
	// Scanner sc  = new Scanner( System.in);
	
	ArrayList<Day> days;
	Scanner sc ;
	
	public 일정관리2() {
		days =  new ArrayList<>();
		sc = new Scanner( System.in);
	}
	
	
    //등록하기
	public void  register() {
		System.out.println("등록");
	}
	
	
	//조회하기
	public void  update() {
		System.out.println("변경");
	}
	
	public void delete() {
		System.out.println("삭제");
	}
	public void findAll() {
		System.out.println("전체조회");
	}
	//삭제하기
	//변경하기
	
	//메뉴반복 --시작점
	
	public void run() {
		
	 loop:while(true) {
			System.out.println(" 1.등록 2.조회  3.변경 4.삭제  5.종료");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				register();
				break;
			case 2:
				findAll();
				break;
			case 3:
				update();
				break;
			case 4:
				delete();
				break;
			case 5:
				break loop;
			default:
				System.out.println("메뉴x");		
			
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		일정관리2   mgt = new 일정관리2();
		mgt.run();
		
	}

}