package chapter02.operator;

import java.util.Scanner;

public class Oper_Example3 {

	public static void main(String[] args) {
		/*
		 	각 자리수의 합 구하기
		 	출력 결과 :
		 		0 ~ 999 사이의 정수를 입력하세요
		 		315
		 		각 자리수 합 : 9
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0 ~ 999 사이의 정수를 입력하세요.");
		
		int number = sc.nextInt();
	
		int a = (int)(number/100);
		int b = (int)((number - a*100)/10);
		int c = (int)(number - a*100 - b*10);
		int result = a + b + c;
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
		System.out.println("각 자리 수의 합 : " + result);
		
		/*
		 	교수님 풀이 
		 	int num = scan.nextInt();
		 	
		 	int num100 = num/100;
		 	int num10 = num % 100 / 10;
		 	int num1 = num % 100 % 10;
		 	
		 	int sum = num100+num10+num1;
		 
		 */
		

	}

}
