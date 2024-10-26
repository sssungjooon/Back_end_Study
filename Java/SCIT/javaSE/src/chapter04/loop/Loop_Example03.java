package chapter04.loop;

import java.util.Scanner;

public class Loop_Example03 {

	public static void main(String[] args) {
		/*
		 	합 구하기
		 	2개의 정수를 입력받아 입력받은 정수를 포함한 사이값들의 총합을 구하시오.
		 	단, 입력 순서에 상관없이 합을 구할 것.
		 	출력 결과 :
		 		숫자 입력: 5		숫자 입력: 10
		 		숫자 입력: 10		숫자 입력: 5
		 		45				45
		 */
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("숫자 입력: ");
		int num1 = sc.nextInt();
		System.out.print("숫자 입력: ");
		int num2 = sc.nextInt();
		
		if (num1>=num2) {
			for (int i=num2; i <= num1; i++) {
				sum += i;
			}
		} else {
			for (int i=num1; i <= num2; i++) {
				sum += i;
			}
		}
		
		System.out.println(sum);
		
//		do {
//            if (num1 > num2) {
//                sum = sum + num2;
//                num2++;
//            }
//            else {
//                sum = sum + num1;
//                num1++;
//            }
//        } while (num1 != num2);
//        
//        System.out.println(sum + num1);
//
//		System.out.println(sum);
		
	}

}
