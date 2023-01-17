package ex03_date_time;

import java.util.Calendar;

public class Ex05_Calendar {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR); // now.get(1)과 동일하게 동작함
		int month = now.get(Calendar.MONTH); // 월(0~11) : 주의!!!!!!!!!!!!!!!!!!!!!!!
		int day = now.get(Calendar.DAY_OF_MONTH); // 일 
		int weekNo = now.get(Calendar.DAY_OF_WEEK); //일 1 월2 화 3... 토 7...
		String weekName[] = {"일", "월", "화", "수", "목", "금", "토"};
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(weekName[weekNo - 1]);
		
		int ampm = now.get(Calendar.AM_PM);//오전 0 , 오후 1
		String ampms[] = {"오전", "오후"}; 
		int hour12 = now.get(Calendar.HOUR); // 0~11
		int hour24 = now.get(Calendar.HOUR_OF_DAY); //12~23
		int minute = now.get(Calendar.MINUTE);
		int ms = now.get(Calendar.MILLISECOND);
		
		System.out.println(ampms[ampm]);
		System.out.println(hour12);
		System.out.println(hour24);
		System.out.println(minute);
		System.out.println(ms);
		
		
	
	}

}
