package ex10_static;

public class MyMath {

	public static final double pi = 3.141592;
	
	// 메소드
	public static double getCircleArea(double radius) {
		return pi * radius * radius;
	}
	
	
	
	public static double max (double... numbers) {
		double max = Double.MIN_VALUE;
		for(int i = 0; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		return max;
	}
	
	public static double min(double... numbers) {
		double min = Double.MAX_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if (min > numbers[i]) {
				min = numbers[i];
			}
		}
		return min;
	}
}
