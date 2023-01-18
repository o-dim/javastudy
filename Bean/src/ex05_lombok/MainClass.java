package ex05_lombok;

public class MainClass {


 main(String[] args) {
		User user = new User();
		user.setId("admin");
		user.setPw("12312413");
		System.out.println(user.getId());
		System.out.println(user.getPw());
		System.out.println(user);
		
		User user2 = User.builder()
						.id("master")
						.pw("122321")
						.build();
		System.out.println(user2);
	}

}
