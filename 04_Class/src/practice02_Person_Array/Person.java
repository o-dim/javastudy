package practice02_Person_Array;

public class Person {

	private String name;
	private int age;
	
	
	// 생성자를 만들지 않으면 "디폴트 생성자가 사용된다"
	public Person () { }
	public Person (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
