package chapter06.class_part1;

import java.time.LocalTime;

public class Time {
	boolean am;
	int hour;
	int minute;
	int second;
	
	// 인스턴스 초기화 블록
	{
		System.out.println("초기화 블록 실행");
		
		LocalTime now = LocalTime.now();
		hour = now.getHour();
		if (hour >= 12) {
			hour -= 12;
			am = false;	
		} else {
			am = true;
		}
		minute = now.getMinute();
		second = now.getSecond();
	}
	
	
	// 기본 생성자 
	Time() {
		System.out.println("기본 생성자 실행");
	}
	
	// 명시적 생성자
	Time(boolean am, int hour, int minute, int second) {
		// 클래스에서 선언한 am 전역변수에다가 명시적 생성자가 호출될 때
		// 가져오는 값을 저장하기 위한 변수 am의 값을 대입하고 싶다
		/*
		 	this
		 	- 클래스 내부에서는 해당 인스턴스를 부를 이름이 없다.
		 	- 인스턴스 이름이 각자 다르기 때문에 this를 이용하여
		 	  자기 자신을 가리키도록 this를 사용한다. 
		 */
//		this.am = am;
//		this.hour = hour;
//		this.minute = minute;
		this(am, hour, minute);
		this.second = second;
		System.out.println("명시적 생성자 실행4");
	}
	
	Time (boolean am, int hour, int minute) {
		this(hour,minute);
		this.am = am;
//		this.hour = hour;
//		this.minute = minute;
		this.second = 0;
		System.out.println("명시적 생성자 실행3");
	}
	
	Time (int hour, int minute) {
		this.am = hour < 12;
		this.hour = hour % 12;
		this.minute = minute;
		this.second = 0;
		System.out.println("명시적 생성자 실행2");
	}
	
	void whatTime() {
		System.out.println( am ? "오전" : "오후");
		System.out.println( hour + "시 " + minute + "분 "
				+ second + "초");
	}
}
