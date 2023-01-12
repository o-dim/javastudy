package ex10_static;

public class MainClass {

	public static void main(String[] args) {
		
		//static 요소는 객체를 이용해서 호출할 수 있으나 권장하지 않는다
		
		MyMath myMath = new MyMath();
		System.out.println(myMath.pi);
		
		MyMath yourMath = new MyMath();
		System.out.println(yourMath.pi);
		
		// STATIC 요소는 클래스를 이용하여 호출하는 것이 권장이다.
		System.out.println(MyMath.pi);
		
		System.out.println(MyMath.max(1.1, 1.2, 3.3));
		System.out.println(MyMath.min(1.1, 1.2, 3.3, 8.9, 1.4, 5.3));
		System.out.println(MyMath.getCircleArea(3.3));
	}

}
