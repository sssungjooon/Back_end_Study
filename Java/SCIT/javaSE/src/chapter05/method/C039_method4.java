package chapter05.method;

import java.time.LocalDate;

public class C039_method4 {

	public static void main(String[] args) {
		System.out.println("오늘은 " + getDate() + "일");
		
	}

	public static int getDate() {
		LocalDate today = LocalDate.now();
		int day = today.getDayOfMonth();
		return day;
	}
}
