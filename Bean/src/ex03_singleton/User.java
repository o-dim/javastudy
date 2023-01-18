package ex03_singleton;

public class User {
	
	// static 필드 (미리 User를 만들어둔다)
	private static User user = new User();
	
	// private 생성자
	private User() {
		
	}
	
	// static method 사용 (static 필드 사용을 위하여)
	// user 필드를 외부에서 사용할 수 있도록 반환하는 일종의 Getter를 만듦
	public static User getInstance() {
		return user;
	}
	
	
	
	
	
}
