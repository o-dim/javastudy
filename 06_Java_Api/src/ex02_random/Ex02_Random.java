package ex02_random;

import java.util.Random;

public class Ex02_Random {

	public static void ex01() {
		
		Random random = new Random();
		
		// 실수 난수
		double randNumber1 = random.nextDouble(); // 0.0 <= 난수 < 1.0
		System.out.println(randNumber1);
		
		int randNumber2 = random.nextInt(); // int 범위 내의 난수
		System.out.println(randNumber2);
		
		int randNumber3 = random.nextInt(10); // 10개(0~9) 난수 발생
		System.out.println(randNumber3);
		
	}
	
	
	
	public static void main(String[] args) {
		ex01();
	}

}
