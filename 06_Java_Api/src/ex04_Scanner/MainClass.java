package ex04_Scanner;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름이 뭐에요 >>> ");
		String name = sc.next();
		System.out.println("입력된 이름은 " + name + "입니다.");
		
		System.out.print("나이가 어떻게 되나요 ? >> ");
		int age = sc.nextInt();
		System.out.println("입력된 나이는 " + age + "살입니다.");
		
		System.out.println("키는 얼마인가요? >> ");
		double height = sc.nextDouble();
		System.out.println("입력된 키는 " + height + "cm입니다.");
		
		//char 입력
		System.out.println("성별은 무엇인가요? (남 / 여) >>> ");
		char gender = sc.next().charAt(0);
		System.out.println("입력된 성별은 " + gender + "입니다");
		
		// Scanner 객체 종료 (생략가능)
		sc.close();
		
		
	}

}
