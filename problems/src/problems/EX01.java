package problems;

public class EX01 {

	
	public static void ex01() {
		
		// 문제1. int serial의 첫 번째 글자가 1,3,5이면 "남자", 2,4,6이면 "여자"를 출력하시오.
		// int serial의 첫 번째 글자는 항상 1 ~ 6 사이의 정수라고 가정한다.
		// 예시
		// 남자입니다.

		
		int a = 3 ;
		String result = (a % 2 == 0) ? "여자입니다" : "남자입니다";
		System.out.println(result);
		
	}
	
	public static void ex03() {
		
		// 문제3. 구구단을 모두 출력하지 말고 5 x 5 = 25까지만 출력하시오.
		// 예시
		// 2 x 1 = 2
		// 2 x 2 = 4
		// ...
		// 5 x 5 = 25
		
		for (int dan = 2; dan < 6; dan ++) {
			for (int i = 1; i < 10; i ++) {
				if (dan == 5 && i == 6) {
					return;
				}
				System.out.println( dan + " x " + i + " = " + dan * i);
			}
		}
	
	}
	
	public static void ex05 () {
		// 문제5. 1부터 100 사이의 모든 짝수와 홀수를 각각 더한 결과를 모두 출력하시오.
		// 예시
		// 짝수 합은 2550입니다.
		// 홀수 합은 2500입니다.
		
		int total1 = 0;
		int total2 = 0;
		
		
		for (int i = 1 ; i < 101; i++) {
			if (i % 2 == 0) {
				total1 += i;
			}
			else {
				total2 += i;
			}
		}
		System.out.println("짝수 합은 " + total1 + "입니다.");
		System.out.println("홀수 합은 " + total2 + "입니다");
		
		
	}
	
	public static void main(String[] args) {

		ex01();

	}

}
