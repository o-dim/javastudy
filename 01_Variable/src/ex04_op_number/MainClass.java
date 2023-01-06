package ex04_op_number;

public class MainClass {

	//ex01 메소드 정의
	public static void ex01() {
	
	}
	//ex02 메소드 정의~
	public static void ex02() {
		int a = 5;
		int b = 2;
				
		int add = a + b; // 7
		int sub = a - b; // 3
		int mul = a * b; // 10
		int div = a / b; // 2 (몫)
		int mod = a % b; // 1 (나머지)
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(mod);
	}
	//ex03 메소드 정의	
	public static void ex03() {

		int second = 90;
		
		int min = second / 60 ;
		int sec = second % 60 ;
		
		System.out.println(min);
		System.out.println(sec);
	}
	//ex04 메소드 정의
	public static void ex04() {
		int a = 10;
		System.out.println(++a);
	}
	//ex05 메소드 정의
	public static void ex05() {
		int a;
		a = 10;
		System.out.println(a);
		
		
		
	}
	//ex06 메소드 정의
	public static void ex06() {
		
		int x = 10;
		int y = 20;
		
		//백업
		int temp;
		temp = x;
		
		x = y;
		
		y = temp;
		
		System.out.println(x);
		System.out.println(y);
				
				
	}
	
	public static void ex07() {
	
		int account = 10000;
		account += 5000;
		account -= 50000;
		System.out.println(account);
	
	}
	
	public static void ex08() {
		
		long account = 123456;
		
		// 5% 이자 받음
		double result;
		result = account * 1.05;
		
		System.out.println(result);
		
	}
	
	public static void main(String[] args) {

		ex08();
		
	}
	
}
