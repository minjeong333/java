package javaprj.day05;

public class 배열3차원 {

	public static void main(String[] args) {

		String[][][] 배열2차원 = {

				// 0면

				{ { "*1", "*2", "*3" }, { "*4", "*5", "*6" }, { "*7", "*8", "*9" } }

				,

				// 1면
				{ { "@1", "@2", "@3" }, { "@4", "@5", "@6" }, { "@7", "@8", "@9" } }

		};

		// 첫번째 2차원 출력하기
		// 몇번째 면에 있는가? 0면
		System.out.print(배열2차원[0][0][0]);
		System.out.print(배열2차원[0][0][1]);
		System.out.print(배열2차원[0][0][2]);

		System.out.print(배열2차원[0][1][0]);
		System.out.print(배열2차원[0][1][1]);
		System.out.print(배열2차원[0][1][2]);

		System.out.print(배열2차원[0][2][0]);
		System.out.print(배열2차원[0][2][1]);
		System.out.print(배열2차원[0][2][2]);

		
		
		// 두번째 2차원 출력하기
		// 몇번째 면에 있는가? 1면
		System.out.println("\n");
		System.out.print(배열2차원[1][0][0]);
		System.out.print(배열2차원[1][0][1]);
		System.out.print(배열2차원[1][0][2]);

		System.out.print(배열2차원[1][1][0]);
		System.out.print(배열2차원[1][1][1]);
		System.out.print(배열2차원[1][1][2]);

		System.out.print(배열2차원[1][2][0]);
		System.out.print(배열2차원[1][2][1]);
		System.out.print(배열2차원[1][2][2]);
		
		
		//반복문으로 출력하기
		for(int i=0; i<2; i++) {
			System.out.println("");
			System.out.println("\n" + "<<" + (i+1) + "면>>");
			for(int j=0; j<3; j++) {
				System.out.println("\n"+ "<" + (j+1) + "행>");
				for(int k=0; k<3; k++) {
					System.out.print(배열2차원[i][j][k]);
				}
			}
		}
	}

}
