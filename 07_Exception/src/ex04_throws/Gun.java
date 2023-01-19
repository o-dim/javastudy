package ex04_throws;

public class Gun {

	private int bullet;
	public static final int MAX_BULLET = 10;
	
	// 총알 넣기
	public void reload(int bullet) throws RuntimeException { //reload 메소드를 호출하는 곳으로 예외를 던지겠다...
	
		if (this.bullet + bullet > MAX_BULLET) { // 미리 받아본 총알 더해보니까..
			throw new RuntimeException("장전 불가능");
		}
		this.bullet += bullet;
		
	}
	
	public void shoot() throws RuntimeException{
		if (bullet == 0) {
			throw new RuntimeException("총알 부족");
		}
		bullet --;
		
	}

	public int getBullet() {
		return bullet;
	}

	public void setBullet(int bullet) {
		this.bullet = bullet;
	}
	
	
	
}
