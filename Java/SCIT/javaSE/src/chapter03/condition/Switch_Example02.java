package chapter03.condition;

import java.util.Scanner;

public class Switch_Example02 {

	public static void main(String[] args) {
		/*
		 	사칙연산 계산기
		 	정수 2개와 연산자(+, -, *, /)를 입력받아 결과를 출력한다.
		 	단, 나눗셈 연산시 분모가 0일 경우 "0으로 나눌 수 없습니다"를 출력한다.
		 	출력 결과 :
		 		연산자 (+, -, *, /) : /
		 		정수1 입력: 3
		 		정수2 입력: 0
		 		0으로 나눌수 없습니다.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연산자 (+, -, *, /) :");
		String operator = sc.next();
		System.out.print("정수1 입력: ");
		int number1 = sc.nextInt();
		System.out.print("정수2 입력: ");
		int number2 = sc.nextInt();
		
		int result;
		
		switch (operator) {
		case "+" :
			result = number1 + number2;
			System.out.println("결과 : " + result);
			break;
		case "-" :
			result = number1 - number2;
			System.out.println("결과 : " + result);
			break;
		case "*" :
			result = number1 * number2;
			System.out.println("결과 : " + result);
			break;
		case "/" :
			if (number2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				break;
			} else {
				result = number1 / number2;
				System.out.println("결과 : " + result);
				break;
			}
		default :
			System.out.println("연산자를 잘못 입력하셨습니다.");
		}
	}

}
