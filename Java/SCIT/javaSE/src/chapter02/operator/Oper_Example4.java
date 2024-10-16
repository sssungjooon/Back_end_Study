package chapter02.operator;

import java.util.Scanner;

public class Oper_Example4 {

	public static void main(String[] args) {
		/*
		 	정수 3개를 입력받아 각 변수 (a, b, c)에 값을 넣고,
		 	입력 받은 값 중 최대값(max)을 출력하세요.
		 	(입력 값의 순서에 상관없이 최대값이 출력되어야 함)
		 	hint, 삼항연산자 (중복사용)
		 	출력 결과 :
		 		첫번째 정수 : 2
		 		두번째 정수 : 4
		 		세번째 정수 : 1
		 		최대값 : 4
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수 : ");
		int a = sc.nextInt();
		System.out.println("두번째 정수 : ");
		int b = sc.nextInt();
		System.out.println("세번째 정수 : ");
		int c = sc.nextInt();
		
		int ab = ((a >= b) ? a : b);
		int result = ((ab >= c) ? ab : c);
		
		System.out.println("최대값 : "+result);
		
		
	}

}
