package ex02_loop;

public class Ex02_while {
	
	public static void ex01() {
		
		// 1 ~ 10
		int n = 1;
		while(n < 11) {
			System.out.println(n);
			n++;
		}
	}
	
	public static void ex02() {
		
		int account = 85000;
		int money = 550;
		int n = 0;
		
		while(account >= money) {
			System.out.print(++n + "번째 출금 결과 : ");
			account -= money;
			System.out.println("계좌 " + account + "원");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		ex02();
		
	}

}
