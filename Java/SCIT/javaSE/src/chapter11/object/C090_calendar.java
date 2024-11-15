package chapter11.object;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class C090_calendar {

	public static void main(String[] args) {
		GregorianCalendar today = new GregorianCalendar();
		System.out.printf("%d년 %d월 %d일 %s %d시 %d분 %d초"
				, today.get(Calendar.YEAR)
				, today.get(Calendar.MONTH)+ 1
				, today.get(Calendar.DATE)
				, today.get(Calendar.AM_PM) == Calendar.AM ? "오전" : "오후"
				, today.get(Calendar.HOUR)
				, today.get(Calendar.MINUTE)
				, today.get(Calendar.SECOND)
				);
		
		System.out.println("\n========================");
		GregorianCalendar today2 = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat(
				"yyyy년 M월 d일 a hh:mm:ss");
		String result = sdf.format(today2.getTime());
		System.out.println(result);
		
		System.out.println("========================");
		
		LocalDate today3 = LocalDate.now();
		LocalTime now = LocalTime.now();
		System.out.printf("%d년 %d월 %d일 %d시 %d분 %d초"
				, today3.getYear()
				, today3.getMonthValue()
				, today3.getDayOfMonth()
				, now.getHour()
				, now.getMinute()
				, now.getSecond()
				);

	}

}
