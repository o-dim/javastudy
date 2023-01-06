package ex01_variable;

public class MainClass {

	public static void main(String[] args) {
		//변수 선언하기
		boolean isGood = true;
		boolean isAlive = false;
		System.out.println(isGood);
		System.out.println(isAlive);
		
		//문자타입
		char ch1 = 'A';
		char ch2 = '하';
		char ch3 = '\n'; //줄바꿈
		char ch4 = '\t'; //탭
		char ch5 = '\''; //escape 처리 된 작은 따옴표
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);
		
		//정수 타입
		int age = 22;
		long money = 100000000000L;
		System.out.println(age);		
		System.out.println(money);
		
		System.out.println(Integer.MAX_VALUE);
		
		//실수 타입
		double leftEye = 1.2;
		double rightEye = 0.5;
		System.out.println(leftEye);
		System.out.println(rightEye);
		
		//문자열 타입
		String name = "오소민";
		System.out.println(name);
		String country = new String ("Korea"); //대부분의 참조 타입 사용법
		System.out.println(country);
		
		//상수 타입 (final 키워드 필요)
		final double PI = 3.141592;
		System.out.println(PI);
	}

}
