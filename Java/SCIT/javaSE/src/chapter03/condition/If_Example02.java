package chapter03.condition;

import java.util.Scanner;

public class If_Example02 {

	public static void main(String[] args) {
		/*
		 	세 개의 정수를 입력 받아,
		 	If 문을 활용하여 가장 큰 수를 출력한다.
		 	출력결과 :
		 		숫자1 : 3
		 		숫자2 : 1
		 		숫자3 : 2
		 		최대값 : 3
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 1 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자 2 : ");
		int num2 = sc.nextInt();
		System.out.print("숫자 3 : ");
		int num3 = sc.nextInt();
		
		int rank12;
		
		if (num1 >= num2) {
			rank12 = num1;
		} else {
			rank12 = num2;
		}
		
		if (rank12 >= num3) {
			System.out.println("최대값 : "+ rank12);
		} else {
			System.out.println("최대값 : "+ num3);
		}
		
		/*
		 	강사님 풀이
		 	
		 	int max = a;
		 	if (max < b) {
		 		max = b;
		 	}
		 	if (max < c) {
		 		max = c;
		 	}
		 	
		 	System.out.println("최대값 : "+ max);
		 	
		 */

		
	}

}
