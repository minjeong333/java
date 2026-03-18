package javaprj.day12.김민정_상속관계만들어보기;

public class 매개변수다형성버전 {
	public static void main(String[] args) {
		
		Patient patient = new Patient();
		Doctor doctor = new Doctor();
		
		Person[]arr = new Person[] {patient, doctor};
		arr[0] = new Patient();
		arr[1] = new Doctor();
		
		//9-11을 줄여서
		//Person[]arr = {new Patient(), new Doctor()}; 로 쓸 수 있음
		
		//person 말한다
		for(int i=0; i<arr.length; i++) {
			arr[i].말한다();
		}
		
		모든사람은말한다(arr);
		
	}
		//Person타입 -> 말한다() 매서드 호출시 -- 자식마다 다르게 동자하게
		//부모타입인 Person을 매개변수로 받아서, 모든 자식 객체를 수용하겠다
		private static void 모든사람은말한다(Person[] arr) {
			for(int i=0; i<arr.length; i++) {
				arr[i].말한다();
			}
	}
}
