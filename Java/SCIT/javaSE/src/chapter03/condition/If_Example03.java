package chapter03.condition;

import java.util.Scanner;

public class If_Example03 {

	public static void main(String[] args) {
		/*
		 	정수를 1개 입력받고 홀수인지, 짝수인지를 출력하라
		 	출력 결과 :
		 		정수 입력 : 4
		 		짝수입니다.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int number = sc.nextInt();
		
		if (number%2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}

}
