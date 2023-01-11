package ex09_access_modifier;

public class MainClass {

	public static void main(String[] args) {

		// user 객체 생성
		User user = new User();

		// user 객체에 아이디 전달하기
		user.setId("admin");
		user.setPw("12345");
		
		System.out.println(user.getId());
		System.out.println(user.getPw());
	}

}
