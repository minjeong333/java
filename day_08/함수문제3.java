package javaprj.day08;

public class 함수문제3 {

	//3. 주간날씨정보를 반환하는 함수 만들기
	
	/*
	 기능: 주간날씨정보 반환
	 매개변수:x
	 반환: 주간날씨정보 
	 */
	
	//Sol1) 1차원으로 풀기
	/*
	public static String[] weeklyWeather() {
	String[] info = {"맑음", "흐림", "비", "눈"};
	String[] result = new String[7]; 
	
	for(int i =0; i<result.length; i++) {
		int randomIndex = (int)(Math.random()*info.length);
		result[i]=info[randomIndex];
	}
	
	return result;
	}
	
	public static void main(String[] args) {
	String[] day = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
	String[] weekWeather = weeklyWeather();
	
	for(int i=0; i<day.length; i++) {
		String[] info;
		System.out.println(day[i] + " 날씨는" + " " + weekWeather[i] + "입니다.");
	  }
	}
	*/
	
	//2차원으로 풀기
	    public static String[][] getWeeklyWeatherGrid() {
	        String[] days = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
	        String[] weatherTypes = {"맑음", "흐림", "비", "눈"};
	        
	        // 7행 2열짜리 배열 생성 (7일 x [요일명, 날씨명])
	        String[][] weeklyGrid = new String[7][2];

	        for (int i = 0; i < weeklyGrid.length; i++) {
	            weeklyGrid[i][0] = days[i]; // 0번 열에는 요일 저장
	            
	            int randomIndex = (int) (Math.random() * weatherTypes.length);
	            weeklyGrid[i][1] = weatherTypes[randomIndex]; // 1번 열에는 랜덤 날씨 저장
	        }

	        return weeklyGrid; // 2차원 배열 통째로 반환
	    }

	    public static void main(String[] args) {
	        // 함수로부터 2차원 배열을 전달받음
	        String[][] weekData = getWeeklyWeatherGrid();

	        System.out.println("=== 이번 주 기상 예보 ===");
	        for (int i = 0; i < weekData.length; i++) {
	            // weekData[i][0]은 요일, weekData[i][1]은 날씨
	            System.out.println(weekData[i][0] + " : " + weekData[i][1]);
	        }
	    }
	}

