package javaprj.day13.오후실습;

import java.util.ArrayList;

import javaprj.day12.김민정다형성실습.Doctor;
import javaprj.day12.김민정다형성실습.Patient;
import javaprj.day12.김민정다형성실습.Person;

public class HospitalMain {

	public static void main(String[] args) {
		
		//1.객체 생성
		Doctor doctor = new Doctor();
		Patient patient = new Patient("김민정");
		
		//doctor.patientName = patient.name; //객체지향방식이 아님
		doctor.setPatientName(patient.getName());
		
		//ArrayList 생성 
		//2. 업캐스팅 - 여러 객체(환자, 의사)를 부모 타입(Person) 배열로 묶기 
		ArrayList<Person> list = new ArrayList<>();
		list.add(doctor);
		list.add(patient);
		
		
		//3. 매서드 호출
		진료(list);
	}
	
	//매서드
	public static void 진료(ArrayList<Person> list) {
		for(int i=0; i<list.size(); i++) {
			//list.get(i)로 객체를 꺼내서 호출
			list.get(i).말한다();
		}
		
		// arr배열에 담긴 객체들은 다 Persosn이라는 부모의 옷을 입고 있는데, 실체는 다 제각각이다(의사, 환자)
		// 다운캐스팅
		for(int i=0; i<list.size(); i++) {
			//꺼낸 객체를 변수에 담아두기 
			Person p =list.get(i);
			
			if(p instanceof Doctor) { 
				Doctor tempD = (Doctor) p; //의사의 치료하기 기능을 쓰기 위해 타입을 의사로 일시적으로 되돌리기
				tempD.치료하기();
			}else if(p instanceof Patient) { //환자의 고유기능
				Patient tempP = (Patient) p; //환자의 아파하기 기능을 쓰기 위해 타입을 환자로 일시적으로 되돌리기
				tempP.아파하기();
			}

		}
		
		//잘못된 다운캐스팅
//		Doctor tempD = (Doctor) arr[1];
//		tempD.치료하기();
	}
}
