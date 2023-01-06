package ex01_branch;

public class Ex03_else_if {

	public static void ex01() {
		
		// 80이상이면 상, 60이상이면 중, 나머지는 하
		
		int score = 80;
		if(score >= 80) {
			System.out.println("상");
		}
		else if(score >= 60) {
			System.out.println("중");
		}
		else {
			System.out.println("하");
		}
	}
	
	public static void ex02() {
		
		//수, 우, 미, 양, 가, 잘못된 점수
		
		int score = 105;
		if(score > 100 || score < 0) {
			System.out.println("잘못된 점수");
		}
		else if (score >= 90) {
			System.out.println("수");
		}
		else if(score >= 80) {
			System.out.println("우");
		}
		else if(score >= 70) {
			System.out.println("미");
		}
		else if(score >= 60) {
			System.out.println("양");
		}
		else {
			System.out.println("가");
		}
		
	}
	
	public static void ex03() {
		
		// 계절
		
		int month = 2 ;
		
		int mod = month % 12
				;
		
		if (mod < 3) {
			System.out.println("겨울");
		}
		else if (mod < 6) {
			System.out.println("봄");			
		}
		else if (mod < 9) {
			System.out.println("여름");			
		}
		else {
			System.out.println("가을");
		}
		
	}
	
	public static void ex04() {
		
		//
		
		int day = 6;
		int nDay = 10; //10일 후
		
		day += nDay;
		
		String weekName;
		int mod = day % 7;
		
		if (mod == 0) {
			weekName = "토";
		}
		else if (mod == 1) {
			weekName = "일";
		}
		else if (mod == 2) {
			weekName = "월";
		}
		else if (mod == 3) {
			weekName = "화";
		}
		else if (mod == 4) {
			weekName = "수";
		}
		else if (mod == 5) {
			weekName = "목";
		}
		else {
			weekName = "금요일";
		}
		
		System.out.println(nDay + "일 후는 " + weekName + "요일이다.");
	}
	
	public static void main(String[] args) {
		ex04();

	}

}
