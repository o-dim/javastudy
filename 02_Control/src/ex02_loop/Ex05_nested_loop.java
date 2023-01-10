package ex02_loop;

public class Ex05_nested_loop {

	
	public static void ex01() {
		
		for (int day = 1; day <= 5; day++) {
			for (int hour = 1; hour <=8; hour ++) {
				System.out.println(day + "일차 " + hour + "교시 수업");
			}
		}
		
	}

	public static void ex02() {
		int day = 1;
		
		while (day <= 5) {
			int hour = 1;
			while (hour <= 8) {
				System.out.println(day + "일차 " + hour + "교시 수업");
				hour ++ ;
			}
			day ++;
			if (day > 5) {
				break;
			}
		}
		
	}
	
	public static void ex03() {
		
		// 전체 구구단 출력하기
		// 2 x 1 = 2
		// ...
		// 9 x 9 = 81
		int dan = 1;
		while (dan <= 9) {
			int n = 1;
			while (n <=9) {
				System.out.println(dan + " x " + n + " = " + dan * n); 
				n ++ ;
			}
			dan ++;
		}
		
	}
	
	
	public static void ex04() {
		// 전체 구구단 출력하기
		// 2x1 = 2 3x1 = 3 ... 9x1 = 9
		// ...
		// 2 x 9 = 18 ... 9 x 9 = 81
		int n = 1;
		while (n <= 9) {
			int dan = 2;
			while (dan <=9) {
				System.out.print(dan + " x " + n + " = " + dan * n + "\t"); 
				dan ++ ;
			}
			n ++;
			System.out.print("\n");
		}		
	}

	public static void ex05() {
		for (int n = 1; n <= 9; n ++) {
			for (int dan = 2; dan <=9; dan++) {
				System.out.print(dan + " x " + n + " = " + dan * n + "\t"); 
			}
			System.out.print("\n");
		}		
	}
	
	public static void main(String[] args) {
		ex04();
		ex05();
	}

}
