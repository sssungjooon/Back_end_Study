package chapter05.method;

import java.util.Scanner;

public class Method_Example {

	public static void main(String[] args) {
		// 전체 구구단 출력
		getGugu();
		
		System.out.println("================");
		
		// 특정 단 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("단 : ");
		int num = sc.nextInt();
		getGugu(num);
		
	}
	// 전체 구구단 출력하는 메서드 호출
	static void getGugu () {
		for (int i=1; i<= 9; i++) {
			System.out.println("* [" + i + "] 단");
			for (int j=1; j<=9; j++) {
				System.out.println(i + " X " + j + " = " + i*j);
			}
			System.out.println();
		}
		return; // 돌려줄 값이 없다면 메서드를 종료한다는 의미 (생략가능)
	}
	
	// 특정 단 출력하는 메서드 호출
	static void getGugu(int a) {
		for (int i=1; i<= 9; i++) {
			System.out.println(a + " X " + i + " = " + i*a);
		}
	}

}
