package javaprj.day15.선택정렬;

public class 박세인2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Cat  a = new Cat();
		//System.out.println(a);
		
		Cat cat  = new Cat("나비", 3,"여", 20);
		//cat.근육량 = cat.근육량 +10; 직접변수를 다루지 않고
		                         //매서드로 사용하기
		
		cat.운동하기(); // cat정보 운동하기에 전달됨 

		System.out.println(cat);
	}

}
