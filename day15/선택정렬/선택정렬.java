package javaprj.day15.선택정렬;

public class 선택정렬 {

	public static void main(String[] args) {
		
		//95  75  85  100  50
		
		int[] arr = new int[] {95, 75, 85, 100, 50};
		
		//
		//arr[0] arr[1]
		
		/*
		int temp;
		temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
		*/
		
		for(int su : arr) {
			System.out.print(su + "  ");
		}

		
		//선택정렬
		for(int i=0; i<arr.length-1; i++) { //기준
			for(int j=i+1; j<arr.length; j++) { //비교하는 값
				if(arr[i] > arr[j]) {
					//
					int temp;
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		//
		System.out.println("\n ==== 정렬 후 ===>");
		for(int su : arr) {
			System.out.print(su + "  ");
		}
		
	}

}
