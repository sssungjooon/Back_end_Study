package chapter02.operator;

import java.util.Scanner;

public class Oper_Example1 {

	public static void main(String[] args) {
		/*
		 	상품가격과 받은 금액을 입력 받아서 거스름돈을 출력
		 	출력 결과 :
		 		받은 금액 : 10000
		 		상품가격 : 1500
		 		거스름돈 : 8500
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("받은 금액 : ");
		int receive = sc.nextInt();
		System.out.print("상품 가격 : ");
		int price = sc.nextInt();
		int change = receive - price;
		System.out.print("거스름돈 : " + change );
		
		

	}

}
