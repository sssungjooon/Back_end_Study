package chapter04.loop;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// 3번
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("별 몇줄 찍을 것인지: ");
		int number = sc.nextInt();
		
		for (int i= 1; i<= number; i++) {
			System.out.println(" ".repeat(number-i)+"*".repeat(2*i-1));
		}
		
		System.out.println();

	}

}
