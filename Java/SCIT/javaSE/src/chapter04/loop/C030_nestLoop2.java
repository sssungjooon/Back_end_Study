package chapter04.loop;

import java.util.Scanner;

public class C030_nestLoop2 {

	public static void main(String[] args) {
		// 숫자 맞추기
		Scanner sc = new Scanner(System.in);
		// 1~10까지의 난수를 발생시켜주는 메서드 
		int num = (int) (Math.random() * 10) + 1;

		for (;;) {
			System.out.print("숫자 입력(1~10): ");
			int input = sc.nextInt();
			if (input == num) {
				System.out.println("정답입니다.");
				break;
			} else if (input > num) {
				System.out.println(input + "보다 작습니다.");
			} else {
				System.out.println(input + "보다 큽니다.");
			}
		}
	}

}
