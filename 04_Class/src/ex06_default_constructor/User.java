package ex06_default_constructor;

public class User {

	
	// 생성자를 만들지 않으면 디폴트 생성자가 사용됨
	
	
	//필드
	String id;
	String pw;
	
	//출력메소드
	void info() {
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + pw);
	}
}
