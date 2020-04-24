package chap05.examples.sec5_0701;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;

public class EnumWeekExample {
	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance(); 
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;		
		}
		
		System.out.println("오늘 요일 : " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 꿀잠을 잡니다");
		} else {
			System.out.println("자바 열공쓰~~~");
		}
		
		// z
		System.out.println(week); 
		
		int hOUR_OF_DAY = cal.get(Calendar.HOUR_OF_DAY);
		System.out.println(hOUR_OF_DAY);
		
		
		
		
		
		
	}
}
