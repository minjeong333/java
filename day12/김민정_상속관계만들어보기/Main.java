package javaprj.day12.김민정_상속관계만들어보기;

public class Main {

	public static void main(String[] args) {
		
		Patient patient = new Patient();
		Doctor doctor = new Doctor();
		
		//patient.말한다();
		//patient.아파하기();
		
		//doctor.말한다();
		//doctor.치료하기();
		
	
		//업캐스팅하기
		System.out.print("환자 : ");
		Person p1 = patient;
		p1.말한다(); //아파하기는 patient의 고유기능이라서 쓸 수 없음
		
		System.out.print("의사 : ");
		Person p2 = doctor;
		p2.말한다(); //치료하기는 doctor의 고유기능이라서 쓸 수 없음
		
	
		
		
	//아파하기(patient의 고유기능)와 //치료하기(doctor의 고유기능)을 쓰는 법
	//instanceof 쓰기 ∵ 안전하게 형변환하기 위해서
	if(p1 instanceof Patient) {
		Patient tempPatient = (Patient) p1; //안전하게 다운캐스팅
		tempPatient.아파하기(); // 고유기능 사 용ok
	}
	
	if(p2 instanceof Doctor) {
		Doctor tempDoctor = (Doctor) p2;
		tempDoctor.치료하기();// 고유기능 사용 ok
	}
	
	//잘못된 다운캐스팅
	//컴파일러 오류가 안나는 이유: 
	//컴파일러 : p1은 Person타입이네 -> Doctor는 Person의 자식이니까 이 코드는 ok 넘어갈게  
	//실행시 오류가 나는 이유: 실제로는 Patient인데 Doctor로 강제 형변환 시도
	//					 => Patient 객체 안에는 치료하기()기능이 없음 					  
	//Doctor d1 = (Doctor) p1;
	//d1.치료하기();
	
	/*
	//아파하기(patient의 고유기능)을 쓰는 법
	//다운캐스팅 하기
	System.out.print("환자 : ");
	((Patient)p1).아파하기();
	
	
	//치료하기(doctor의 고유기능)을 쓰는 법
	//다운캐스팅 하기
	System.out.print("의사 : ");
	((Doctor)p2).치료하기();  //혹은 Doctor doctor2 = (Doctor) p1;
	*/
	


	}

	
}
