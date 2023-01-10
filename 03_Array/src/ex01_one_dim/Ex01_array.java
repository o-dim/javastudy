package ex01_one_dim;

public class Ex01_array {

	
	/*
	 배열
	 */
	
	public static void ex01() {
		
		// 배열 선언
		int[] arr;
		
		// 배열 생성
		arr = new int[5];
		
		// 배열 요소
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		
	}
	
	
	public static void ex02() {
	
		// 배열 선언 + 생성
		int[] arr = new int[5];
		
		// 배열 요소 순회 (하나씩 접근하기)
		for(int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	
	public static void ex03() {
		
		// 배열 길이
		int length = 5;
		// 배열 선언 + 생선
		int [] arr = new int [length];
		// 배열 요소 순회
		for(int i = 0; i < length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void ex04() {
		
		//배열 선언 + 생성
		int [] arr = new int[5];
		//배열 순회
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void ex05() { //연습
		
		// 점수 배열 관리
		int[] scores = new int[5];
		// 각 점수 배열에 저장
		scores[0]=100;
		scores[1]=73;
		scores[2]=80;
		scores[3]=95;
		scores[4]=40;
		
		//합계 구하기
		// 최대 최소도 구하기
		int total = 0; // zero 의미
		int max = 0; // 가장 작은 값
		int min = 100; // 가장 큰 값
		
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
			if (max < scores[i]) {
				max = scores[i];
			}
			if (min > scores [i]) {
				min = scores [i];
			}
		}
		System.out.println("합계 : " + total + "원");
		System.out.println("평균 : " + total / scores.length + "원"); //평균 구하기
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
		
	}
	
	public static void ex06() { //연습
		
		// 점수 배열 관리
		int[] scores = new int[5];
		// 각 점수 배열에 저장
		scores[0]=100;
		scores[1]=73;
		scores[2]=80;
		scores[3]=95;
		scores[4]=40;
		
		// 배ㅕㄹ의 첫 번째 요소를 초기화ㅏ로 저장하고,
		// 배열의 두번째 요소부터 순회한다.
		
		
		//합계 구하기
		// 최대 최소도 구하기
		int total = scores[0];
		int max = scores[0];
		int min = scores[0];
		
		
		
		for (int i = 1; i < scores.length; i++) {
			total += scores[i];
			if (max < scores[i]) {
				max = scores[i];
			}
			if (min > scores [i]) {
				min = scores [i];
			}
		}
		System.out.println("합계 : " + total + "원");
		System.out.println("평균 : " + total / scores.length + "원"); //평균 구하기
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
						
	}
	
	
	public static void ex07() {
		
		// 배열 초기화
		int[] arr = {10, 20, 30};
		
		// 배열 순회
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		ex07();
	}

}
