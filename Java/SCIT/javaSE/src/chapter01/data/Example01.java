package chapter01.data;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		// int, double, String 타입의 데이터를 입력받아 출력
		Scanner scan = new Scanner(System.in);
				
//		System.out.print("int : ");
//		int a = scan.nextInt();
//		System.out.println(a);
//		
//		System.out.print("double : ");
//		double b = scan.nextDouble();
//		System.out.println(b);
//		
//		System.out.print("String : ");
//		String c = scan.next();
//		System.out.println(c);
		
		// 정수 입력 받을 변수 초기화  
		System.out.println("초기화 진행");
		int num = 0;
		System.out.println("정수를 입력하세요: ");
		num = scan.nextInt();
		System.out.println("입력완료, 저장");
		System.out.println(num);
		System.out.println("완료");
		
		// 실수 입력 받을 변수 초기화 
		double dNum = 0.0;
		dNum = scan.nextDouble();
		System.out.println(dNum);
		
		// 문자열을 입력 받을 변수 초기화 
		String text = "";
		text = scan.next();
		System.out.println(text);
	}

}
