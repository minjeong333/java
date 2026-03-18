package javaprj.day12.생성자호출;

//Customer를 왜 만드는가? 자료형을 저장하기 위해서
public class Customer {
	
	 String name; // 같은패키지 접근허용, 다른패키지에 있어도 접근을 허용한다. ( 상속받은 클래스인경우 )
	 String email;
	 String phoneNumber;
	 
	 
	 public Customer() {
		
	 }
	 //매개변수가 있는 생성자
	 public Customer(String name, String email, String phoneNumber) {
		 this.name=name;
		 this.email=email;
		 this.phoneNumber=phoneNumber;
	 }
	 
	 //
	 public String toString() {
		 return name + " " + email + " " + phoneNumber;
	 }
	 
	 

}
