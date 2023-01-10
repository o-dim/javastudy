package ex01_branch;

public class Ex04_switch {

	/*
	  switch(표현식) {
	  
	  
	  }
	 표현식의 결과로 사용 불가능한 타입
	 boolean
	 */
	
	public static void ex01() {
		
		int month = 1;
		
		switch(month) {
		case 12:
		case 1: 
		case 2: System.out.println("겨울"); break;
		case 3: 
		case 4: 
		case 5: System.out.println("봄"); break;
		case 6:
		case 7:
		case 8: System.out.println("여름"); break;
		default: System.out.println("가을"); break;
		}
		
	}
	
	public static void ex09() {
		
		String[] seasons = {"겨울", "봄", "여름", "가을" };
		int month = 12;
		
		System.out.println(month + "월은 " + seasons[month % 12 / 3] + "이다.");
		
	}
	
	
	public static void ex02() {
		
		
		int day = 13;
		String weekName;
		
		switch (day % 7) {
		case 0 : weekName = "토"; break;
		case 1 : weekName = "일"; break;
		case 2 : weekName = "월"; break;
		case 3 : weekName = "화"; break;
		case 4 : weekName = "수"; break;
		case 5 : weekName = "목"; break;
		default : weekName = "금";
		}
		
		System.out.println(day + "일은 " + weekName + "요일이다.");
		
		
	}
	
	public static void ex08() {
		
		String[] weekName = {"토", "일", "월", "화", "수", "목", "금"};
		int day = 13;
		System.out.println(day + "일은 " + weekName[day % weekName.length] + "요일이다.");
			
	}
	
	public static void ex03() {
		
		// 수우미양가
		
		int score = 50;
		String scoreName;
		
		switch(score / 10) {
		case 10 :
		case 9 : scoreName = "수"; break;
		case 8 : scoreName = "우"; break;
		case 7 : scoreName = "미"; break;
		case 6 : scoreName = "양"; break;
		default : scoreName = "가";
		
		}
		
		System.out.println(scoreName);
		
		
		int nscore = 80;
		if (nscore < 0 || nscore > 100) {
			System.out.println("잘못된 점수");
			return; // 메소드를 종료하시오.
		}
	} 
	
	
	public static void ex04() {
		
	
		// 1분기, 2분기, 3분기, 4분기
		
		int month = 9;
		System.out.println((month-1)/3 + 1 + "분기");
		
		/*
		switch ((month - 1) / 3 ) {
		case 1:
			System.out.println("1분기");
			break;
		case 2:
			System.out.println("2분기");
			break;
		case 3:
			System.out.println("3분기");
			break;
		default :
			System.out.println("4분기");
		}
		*/
		
	}
	
	public static void ex05() {
		
		int score= 480;
		String scoreName;
			if (score < 0 || score > 100) {
				scoreName = "잘못된 점수";
				System.out.println(scoreName);
				return; // 메소드를 종료하시오.
				}
			switch(score / 10) {
			case 9 : scoreName = "수"; break;
			case 8 : scoreName = "우"; break;
			case 7 : scoreName = "미"; break;
			case 6 : scoreName = "양"; break;
			default : scoreName = "가";
			}
			System.out.println(scoreName);

	}
	
	public static void main(String[] args) {
		
		ex09();
		
	}

}
