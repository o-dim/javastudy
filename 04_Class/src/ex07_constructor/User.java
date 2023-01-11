package ex07_constructor;

public class User {
	String id;
	String pw;
	
	//생성자
	User(){
		id = "anonymous";
		pw = "1234";
	}
	
	User(String userId, String userPw){
		id = userId;
		pw = userPw;
	}
	
	void info() {
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + pw);
	}
}
