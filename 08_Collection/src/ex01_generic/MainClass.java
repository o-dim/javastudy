package ex01_generic;

public class MainClass {

	public static void main(String[] args) { 
		
		Box<Integer> box1 = new Box<Integer>();
		box1.setItem(10);
		System.out.println(box1.getItem());
		
		// jdK 1.7 이후로 생성자에는 자료형을 생략할 수 있음
		Box<String> box2 = new Box<>();
		box2.setItem("Coffee");
		System.out.println(box2.getItem());
	}

}
