package ex03_date_time;

public class Ex01_System {

	public static void ex01() {
		
		// 타임스탬프
		long timestamp = System.currentTimeMillis();
		System.out.println(timestamp);
		System.out.println(Long.MAX_VALUE);
		
	}
	
	public static void ex02() {
		
		String str = "";
		StringBuilder sb = new StringBuilder();
		
		// 시작시간
		long nanoTime1 = System.nanoTime();
		
		// 작업수행
		for(char ch = 'A'; ch <='Z'; ch++) {
			// str += ch;
			sb.append(ch);
		}
		
		// 종료시간
		long nanoTime2 = System.nanoTime();
		
		System.out.println("작업수행시간 : " + (nanoTime2 - nanoTime1) +"ns");
		
	}
	
	public static void main(String[] args) {

		ex02();
	}

}
