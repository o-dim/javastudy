package ex08_this;

public class User {
	
	String id; // this.id
	String pw; //this pw
	
	//생성자
	User(String id, String pw){
		this.id = id;
		this.pw = pw;
	}
	
	// 메소드
	void printThis () {
		System.out.println(this);
	}
	
	void info(){
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + pw);
	}
	
}
