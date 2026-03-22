package java쪽지시험준비.인터페이스문제;

public class TV implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
		
	} 
	
}
