package ex03_date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex06_LocalDateTime {

	public static void ex01() {
		
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		
		LocalDate date2 = LocalDate.of(2003, 1, 17);
		System.out.println(date2);
		
		LocalDate date3 = LocalDate.parse("2023-01-28"); // 문자열의 기본형식 : yyyy-MM-dd
		System.out.println(date3);
		
		LocalDate date4 = LocalDate.parse("2023/01/17", DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		System.out.println(date4);
	}
	
	public static void ex02() {
		
		LocalTime time1 = LocalTime.now();
		System.out.println(time1);
		LocalTime time2 = LocalTime.of(14, 18, 10);
		System.out.println(time2);
		LocalTime time3 = LocalTime.parse("14:19:30");
		System.out.println(time3);
		
	}
	
	public static void ex03() {
		LocalDateTime dateTime1 = LocalDateTime.now();
		System.out.println(dateTime1);
		
		LocalDateTime dateTime2 = LocalDateTime.of(2022, 12, 22, 22, 22, 22);
		System.out.println(dateTime2);
		
		LocalDateTime dateTime3 = LocalDateTime.parse("2022-12-22T22:22:22");
		System.out.println(dateTime3);

		
	}
	
	public static void ex04() {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");
		String strNow = dtf.format(now);
		System.out.println(strNow);
		
	}
	
	
	public static void ex05() {
		
		LocalDateTime now = LocalDateTime.now();
		int year = now.getYear();
		int month = now.getMonthValue(); // 1 ~ 12
		int day = now.getDayOfMonth();
		int hour = now.getHour();
		int minute = now.getMinute();
		int s = now.getSecond();
		
		System.out.println(year + "년 " + month + "월 " + day + "일 " + hour + "시 " + minute + "분 " + s + "초");
		
		
	}
	
	public static void main(String[] args) {
		ex05();
		
	}

}
