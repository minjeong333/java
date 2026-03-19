package javaprj.day12.김민정_상속관계만들어보기;

public class HospitalMain {

	public static void main(String[] args) {
		
		//1.객체 생성
		Doctor doctor = new Doctor();
		Patient patient = new Patient("김민정");
		
		doctor.patientName = patient.name;
		
		//2. 업캐스팅 - 여러 객체(환자, 의사)를 부모 타입(Person) 배열로 묶기 
		Person[] arr = new Person[2];
		arr[0]=doctor;
		arr[1]=patient;
		
		//3. 매서드 호출
		진료(arr);
	}
	
	//매서드
	public static void 진료(Person[]arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i].말한다();
		}
		
		// arr배열에 담긴 객체들은 다 Person이라는 부모의 옷을 입고 있는데, 실체는 다 제각각이다(의사, 환자)
		// 다운캐스팅
		for(int i=0; i<arr.length; i++) { 
			if(arr[i] instanceof Doctor) { 
				Doctor tempD = (Doctor) arr[i]; //의사의 치료하기 기능을 쓰기 위해 타입을 의사로 일시적으로 되돌리기
				tempD.치료하기();
			}else if(arr[i] instanceof Patient) { //의사의 고유기능
				Patient tempP = (Patient) arr[i]; //환자의 아파하기 기능을 쓰기 위해 타입을 환자로 일시적으로 되돌리기
				tempP.아파하기();
			}

		}
		
		//잘못된 다운캐스팅
//		Doctor tempD = (Doctor) arr[1];
//		tempD.치료하기();
	}
}
