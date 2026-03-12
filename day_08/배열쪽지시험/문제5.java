package 배열쪽지시험;

public class 문제5 {

	public static void main(String[] args) {
		int[]nums= {2,4,6,8,10};
		nums[1]=20;
		nums[3]=nums[2]+nums[4];

		for(int i=0; i<nums.length; i++) {
		System.out.print("\n"+nums[i]);
		
	}
  }
}
