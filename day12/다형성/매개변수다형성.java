package javaprj.day12.다형성;

public class 매개변수다형성 {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		Animal[] arr = new Animal[] {cat, dog};
		//
		/*
		arr[0] = Cat();
		arr[1] = Dog();
		 */
		
		for(int i=0; i<arr.length; i++) {
			arr[i].짖는다();
		}
		
		모든동물짖다(arr);

	}
	
	//
	public static void 모든동물짖다(Animal[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i].짖는다();
		}
	} 

}
