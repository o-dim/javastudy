package ex02_loop;

public class Ex01_for {

	//for문
	
	public static void ex01() {
	
		//1~10
		for(int a = 1; a <= 10; a++) {
			System.out.println(a);
		}
		
	}
	
	public static void ex02() {
		
		// 횟수
		
		int count = 5;
		
		for(int a = 0; a < count; a++) {
			System.out.println("Hello World");
		}
	}
	
	public static void ex03() {
		
		for (int a = 10; a > 0; a--) {
			System.out.println(a);
		}
		
	}
	
	public static void ex04() {
		// 2, 4, 6, 8
		int dan = 2;
		for(int a = 1; a < 10 ; a ++) {
			System.out.println(dan * a);                                                                                                                 " x " + a + " = " + a * dan);
		}
	}
	
	
	public static void main(String[] args) {
		ex04();
	}

}
