package ex02_random;


public class Ex01_Math_random {

	public static void ex01() {
		double randNumber = Math.random();
		if (randNumber < 0.1) {
			System.out.println("대박");
		} else {
			System.out.println("안대박");
		}
		
		
		
	}
	
	public static void ex02() {
	
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 6 ; i ++) {
			sb.append((int)(Math.random() * 10));
				
		}
		String code = sb.toString();
		System.out.println(code);
		
	}
	
	public static void main(String[] args) {
	
		ex02();
		
	}
}
