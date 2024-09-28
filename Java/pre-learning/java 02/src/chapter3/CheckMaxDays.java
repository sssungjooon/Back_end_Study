package chapter3;

import java.util.Scanner;

public class CheckMaxDays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("년도를 입력하세요:");
		int year = input.nextInt();
		System.out.print("월을 입력하세요:");
		int month = input.nextInt();
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month+"월은 31일까지 있습니다.");
			break;
		case 4 : case 6: case 9: case 11:
			System.out.println(month+"월은 30일까지 있습니다.");
			break;
		case 2 :
			//윤년인 경우에는 29일까지, 평년인 경우에는 28일까지 있는 것으로 분류
			/*
			 * 윤년 판단 조건 (각자 조건)
			 * 1. 4로 나누어지고, 100으로 나누어 떨어지지 않는 해
			 * 2. 400으로 나누어 떨어지는 해는 윤년이다.
			 */
			if((year%4 ==0 && year%100 != 0) || (year%400 == 0)) {
				System.out.println(month+"월은 29일까지 있습니다.");
			} else {
			System.out.println(month+"월은 28일까지 있습니다.");
			}
			break;

		default:
			System.out.println("월 입력 오류!");
			break;
		}

	}

}
