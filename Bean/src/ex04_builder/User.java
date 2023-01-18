package ex04_builder;

public class User {
	
	// 필드 (builder 객체가 가진 값을 받아온다)
	private String id;
	private String pw;
	
	//User 생성자
	public User (Builder builder) {
		this.id = builder.id;
		this.pw = builder.pw;
	}
	
	//Builder 객체 반환
	public static Builder builder() {
		return new Builder();
	}
	
	//twString override
	@Override
	public String toString() {
		return "Builder [id=" + id + ", pw=" + pw + "]";
	}
	
	
	//BUILDER 클래스(내부 클래스)
	public static class Builder{


		//builder 필드 (여기로 값을 받아서 user 필드로 전달한다)
		private String id;
		private String pw;
		
		//값을 받아오는 메소드
		public Builder id(String id) {
			this.id = id;
			return this;
		}
		public Builder pw(String pw) {
			this.pw = pw;
			return this;
		}
		
		
		//User 객체 반환
		//Builder 필드 값을 가진 객체를 반환 > User 생성자로
		public User build() {
			return new User(this);
			
		}
		
	}
	
}
