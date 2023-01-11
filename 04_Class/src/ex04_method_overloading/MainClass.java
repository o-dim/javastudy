package ex04_method_overloading;

public class MainClass {

	public static void main(String[] args) {
		
		//Calculator 객체 선언 및 생성
		Calculator calc = new Calculator();
		
		//addition 호출하기
		double result1 = calc.addition(1.5, 2.5);		
		System.out.println(result1);
		
		
		//메소드 오버로딩 : addition (double[] numbers) 호출
		double [] arr = {1.1, 2.2, 3.3};
		double result2 = calc.addition(arr);
		System.out.println(result2);

	
	
	}

}
