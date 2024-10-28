package chapter05.method;

public class C038_method3 {

	public static void main(String[] args) {
		int year = 2024;
		int month = 2;
		
		int days = getMonthDays(year, month);
		System.out.println(year + "년" + month + "월은" + days + "일까지 있습니다.");
		
	}
	
	public static int getMonthDays(int year, int month) {
		int[] arDays = {0, 31, 28, 31, 30, 31,
				30, 31, 31,30, 31, 30, 31};
		if (month==2) {
			if ((year % 4 == 0 && year % 100 != 0)
					|| year % 400 == 0) {
				return 29;
			}
			return 28;
		} else {
			return arDays[month];
		}
	}

}
