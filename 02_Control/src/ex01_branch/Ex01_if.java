package ex01_branch;

public class Ex01_if {
	
	public static void ex01() {
		
		// if 문
		
		int score = 80;
		
		if(score >= 60)
			System.out.println("합격");
		
		if(score < 60)
			System.out.println("불합격");
		
	}

	
	public static void ex02() {
	
		
		//중괄호 이용하기
		
		int score = 80;
		
		if(score >=60) {
			System.out.println("합격");
			System.out.println("축하합니다");	
		}
		
		if(score < 60) {
			System.out.println("불합격");
			System.out.println("보충수업입니다");
		}
	}
	
	public static void ex03( ) {
		
		
		
	}
	
	public static void main(String[] args) {
		
		ex02();
		
	}

}
