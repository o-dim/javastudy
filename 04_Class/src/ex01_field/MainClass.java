package ex01_field;

public class MainClass {

	
	public static void main(String[] args) {
		
		// User 타입의 객체 선언
		User user1;
		
		// User 타입의 객체 생성
		user1 = new User();
		
		// 객체 user1의 필드 활용
		user1.id = "admin";
		user1.pw = "12345";
		user1.point = 100;
		user1.isVip = false;
		
		// user1의 addr 필드 생성
		// Address 클래스 타입이기에 반드시 NEW를 붙여야함
		user1.addr = new Address();
		
		user1.addr.postcode = "12345";
		user1.addr.roadAddress = "디지털로";
		user1.addr.jibunAddress = "가산동";
	
		System.out.println("아이디 : " + user1.id);
		System.out.println("비밀번호 : " + user1.pw);
		System.out.println("포인트 : " + user1.point);
		System.out.println("VIP 여부 : " + user1.isVip);
		System.out.println("주소 : " + user1.addr.postcode + " " + user1.addr.roadAddress + "(" + user1.addr.jibunAddress + ")");

		//user 2
		User user2 = new User();
		
		user2.id = "master";
		user2.pw = "654321";
		user2.point = 1000;
		user2.isVip = true;
		
		// user2 객체의 addr 필드 생성
		user2.addr = new Address();
		
		user2.addr.postcode = "54321";
		user2.addr.roadAddress = "디지털로";
		user2.addr.jibunAddress = "철산동";
		
	
		System.out.println("아이디 : " + user2.id);
		System.out.println("비밀번호 : " + user2.pw);
		System.out.println("포인트 : " + user2.point);
		System.out.println("VIP 여부 : " + user2.isVip);
		System.out.println("주소 : " + user2.addr.postcode + " " + user2.addr.roadAddress + "(" + user2.addr.jibunAddress + ")");


	}

	
}
