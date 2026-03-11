package javaprj.day08;

public class 함수문제4 {

	//4. 오늘 메뉴 추전해주는 함수 만들기 ( Math.random()  )사용하여  메뉴배열에서 임의의 메뉴를 반환하기
	
	/*
	 기능:오늘의 메뉴 한 줄 랜덤 출력하기
	 입력:x
	 반환:오늘의 메뉴 한 줄 랜덤하게
	 */
   

   public static String[] todayMenu() {
       String[] menu = {"삼겹살","떡볶이","볶음밥","짜장면","훠궈","초밥"};
       return menu;
   } 

   

   public static void main(String[] args) {
       String[] result = todayMenu();
       int index = (int)(Math.random()*result.length);
       
      
       System.out.println("     🍜오늘의 menu🍕");
       System.out.println("------------------------");
       System.out.println("         " + result[index]);
   } 

}
