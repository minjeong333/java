package javaprj.day11.상속맛보기.상속.춤추기;

public class 에이콘학생춤추기 {

	public static void main(String[] args) {
		
		
		Acorn []  list  = new Acorn[9];
		 list[0]= new WJY(); //에이콘학생 춤춰		 
		list[1]= new HSI();
		list[2]= new JcJ();
		list[3]= new KJY();
		list[4]= new LHK();
		list[5]= new LJH();
		list[6]= new SJC();
		list[7]= new JHD();
		list[8]= new KMK();
		
		
		for(int i=0; i< list.length;i++) {
			list[i].dance();
		}
		 
		
		/*
		 *  주연이는 부채춤을 춘다
			황스일은 춤을 추기 시작했다
			춤추기
			박수치며 춤을춘다
			이현겸은 춤을 추기 시작했다!!!!
			힙합춤을 춘다
			송주창은 막춤을 춘다.
			해든이는 아기상어를 춘다
			민경이는 부채춤을 춘다

		 */
		

	}

}
