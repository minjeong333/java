package javaprj.day12.김민정_상속관계만들어보기;

public class 합치기 {

	public static void main(String[] args) {
		
		//1.객체 생성
		Patient patient = new Patient();
		Doctor doctor = new Doctor();
		
		//2. 업캐스팅 - 여러 객체(환자, 의사)를 부모 타입(Person) 배열로 묶기 
		Person[] arr = new Person[2];
		arr[0]=patient;
		arr[1]=doctor;
		
		//3. 매서드 호출
		병원업무(arr);
	}
	
	//매서드
	public static void 병원업무(Person[]arr) {
		for(int i=0; i<arr.length; i++) { //공통기능 
			arr[i].말한다();
			
			//다운캐스팅
			if(arr[i] instanceof Patient) { //환자의 고유기능
				
				Patient tempP = (Patient) arr[i]; //환자의 아파하기 기능을 쓰기 위해 타입을 환자로 일시적으로 되돌리기
				tempP.아파하기();
				
			}else if(arr[i] instanceof Doctor) { //의사의 고유기능
				Doctor tempD = (Doctor) arr[i]; //의사의 치료하기 기능을 쓰기 위해 타입을 의사로 일시적으로 되돌리기
				tempD.치료하기();
			}
			
		}
	}

}
