package ex06_Object;

public class MainClass {

	public static void ex01() {
		Object person = new Person();
		if (person instanceof Person) {
			((Person) person).eat(); // Object 객체는 항상 캐스팅해야한다.
			((Person) person).sleep();
			
		}
	}
	
	public static void ex02() {
		
	// name이 같으면 같은 person으로 처리하기로 한 system
	Person person1 = new Person("홍길동");
	Person person2 = new Person("홍길동");
	
	if (person1.equals(person2)) {
		System.out.println("같은 Person이다");
	} else {
		System.out.println("다른 Person이다");
	}
		
		
	}
	
	public static void ex03() {
		Person person = new Person("홍길동");
		
		System.out.println(person.toString());
		System.out.println(person); // toString 메소드는 호출을 생략함
	}
	
	public static void main(String[] args) {
		ex03();
		
	}

}
