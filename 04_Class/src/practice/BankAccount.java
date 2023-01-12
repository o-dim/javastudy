package practice;

public class BankAccount {

	// 필드
	private String accNo;
	private long balance;
	
	// 생성자
	public BankAccount (String accNo, long balance) {
		this.accNo = accNo;
		this.balance = balance;
	}
	
	// 메소드 (입금, 출금, 이체, 조회)
	
	// 입금 (마이너스 입금 불가처리)
	public void deposit(long money) {
		if (money < 0) {
			return; // 오직 반환이 void일 때만 가능
		} 
		balance += money;		
	}
	
	
	// 출금 (마이너스 출금 + 잔액보다 큰 출금 불가처리)
	public long withdrawal (long money) {
		if (money < 0 || money > balance) {
			return 0; // 돈을 안 주잖아 그리고 그냥 끝내기에는 long타입이라 반환 반드시 필요
		}
		balance -= money;
		return money;
	}
	
	// 이체
	public void transfer (BankAccount other, long money) {
		// 내 통장에서 출금 withdrawal(money) > 상대 통장에 입금 other.deposit(money)
		
		// 실제로 내 통장에서 출금된 금액을 입금
		other.deposit(this.withdrawal(money));
		
	}
	
	// 조회
	public void inquiry () {
		System.out.println("계좌번호 : " + accNo);
		System.out.println("잔액 : " + balance + "원");
	}
	
}
