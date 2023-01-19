package ex03_throw;

import java.util.Scanner;

public class MainClass {

	public static void ex01() {
	
		try {
			int a = 4 / 0 ;
			System.out.println(a);
			Integer.parseInt("하하하");	
			
			
		} catch (Exception e){
			System.out.println(e.getClass().getName());
			System.out.println(e.getMessage());
		}
		
		
		
	}
	
	public static void ex02() {
		
		try {
			Integer.parseInt("훙훙");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void ex03() {
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			System.out.println("나이를 입력하세요");
			int age = sc.nextInt();
			if ( age < 0 || age > 100 ) {
				//예외상황 발생!
				throw new RuntimeException(age + "살은 불가능합니다.");
			}
			System.out.println(age >= 20 ? "주류구매 가능" : "주류구매 불가능");			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
		
	}
	
	public static void main(String[] args) {
		ex03();
		
	}

}
