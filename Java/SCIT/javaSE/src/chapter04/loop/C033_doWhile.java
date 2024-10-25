package chapter04.loop;

import java.util.Scanner;

public class C033_doWhile {

	public static void main(String[] args) {
		// do-while문
		Scanner sc = new Scanner(System.in);
		int num;
		int sum = 0;
		
		do {
			System.out.print("숫자 (종료는 0): ");
			num = sc.nextInt();
			sum = sum + num;
		} while (num != 0);

		System.out.println("총 합계: " + sum);
		
	}

}
