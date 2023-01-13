package practice03_Watch;

public class Watch {

	// 필드
	private int hour;  // 0 ~ 23
	private int minute;  // 0 ~ 59
	private int second;  // 0 ~ 59
	
	// 생성자
	public Watch(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	// 메소드
	public void addHour(int hour) {
		this.hour += hour / 24;
	}
	
	public void addMinute(int minute) {
		this.hour += minute / 60; // hour
		this.minute += minute % 60; // minute
	}
	
	public void addSecond(int second) {
		this.hour += second / 3600;
		this.minute += (second % 3600) / 60;
		this.second += (second % 3600) % 60;
	}
	
	public void see() {
		System.out.println(this.hour + "시 " + this.minute + "분 " + this.second + "초");
	}

	private Object hour() {
		// TODO Auto-generated method stub
		return null;
	}
}