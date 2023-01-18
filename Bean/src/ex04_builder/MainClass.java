package ex04_builder;

public class MainClass {

	public static void main(String[] args) {
				
		User user = User.builder()
						.id("admin")
						.pw("12234")
						.build();
		
		System.out.println(user);

	}

}
