package ex05_op_condition;

public class MainClass {

	public static void ex01() {
		
		int a = 3;
		int b = 4;
		
		boolean result1 = a > b;
		boolean result2 = a >= b;
		boolean result3 = a < b;
		boolean result4 = a <= b;
		boolean result5 = a == b;
		boolean result6 = a != b;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		
	}
	
	public static void ex02() {
		
		//논리연산
		
		//논리 AND
		int a = 10;
		int b = 10;
		boolean result1 = (a == 10) && (b == 10);
		boolean result2 = (a == 10) && (b == 20);
		
		System.out.println(result1);
		System.out.println(result2);
		
		//논리 or
		boolean result3 = (a == 10) || (b == 10);
		boolean result4 = (a == 10) || (b == 20);
		
		System.out.println(result3);
		System.out.println(result4);
		
		//논리 NOT
		boolean result5 = !(a == 10);
		boolean result6 = !(a == 20);
		
		System.out.println(result5);
		System.out.println(result6);
	}
	
	public static void ex03() {
		
		//Short Circuit Evaluation
		int a = 10;
		int b = 10;
		
		// 논리 AND의 경우
		boolean result1 = ( a == 20 ) && (++b == 11);
		System.out.println(result1);
		
		// 논리 OR의 경우
		boolean result2 = ( a == 10 ) || (++b == 11);
		System.out.println(result2);
		
	}

	public static void ex04() {
		
		int score = 80;
		
		boolean result = (score >= 70) && (score < 80);
		System.out.println(result);
		
		// 70점대는 true 아니면 false
				
				
	}
	
	
	public static void ex05() {
		
		// 조건 연산
		// (조건식)? true 일 때의 처리, false 일 때의 처리
		
		int score = 80;
		
		String result = (score >=60) ? "합격" : "불합격";
		
		System.out.println(result);
		
	}
	
	public static void ex06() {
		
		int n = 3 ;
		String result = (n % 2 == 0) ? "짝수" : "홀수";
		
		System.out.println(result);
		
		
	}
	
	public static void ex07() {
		
		int n = 3 ;
		String result = (n % 3 == 0) ? "3의 배수" : (n % 2 == 0) ? "짝수" : "홀수";
		
		System.out.println(result);
		
		
	}
	
	
	public static void main(String[] args) {
		
		ex07();
		
	}

}
